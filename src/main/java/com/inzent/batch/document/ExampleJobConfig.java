package com.inzent.batch.document;

import com.inzent.batch.document.model.CommonEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.*;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.builder.JpaItemWriterBuilder;
import org.springframework.batch.item.database.builder.JpaPagingItemReaderBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManagerFactory;
import java.util.HashMap;
import java.util.Map;


@Slf4j
@Configuration
@EnableBatchProcessing
public class ExampleJobConfig {

    @Autowired
    public JobBuilderFactory jobBuilderFactory;
    @Autowired
    public StepBuilderFactory stepBuilderFactory;
    @Autowired
    public EntityManagerFactory entityManagerFactory;

    @Bean
    public Job ExampleJob() throws Exception {

        Job exampleJob = jobBuilderFactory.get("exampleJob")
                .start(Step())
                .build();

        return exampleJob;
    }

    @Bean
    @JobScope
    public Step Step() throws Exception {
        return stepBuilderFactory.get("Step")
                .<CommonEntity,CommonEntity>chunk(10)
                .reader(reader())
                .processor(processor())
                .writer(writer())
                .build();
    }

    @Bean
    @StepScope
    public ItemReader<? extends CommonEntity> reader() throws Exception {

        Map<String,Object> parameterValues = new HashMap<>();
        parameterValues.put("amount", 10000);

        return new JpaPagingItemReaderBuilder<CommonEntity>()
                .pageSize(10)
                .parameterValues(parameterValues)
                .queryString("SELECT p FROM Member p WHERE p.amount >= :amount ORDER BY id ASC")
                .entityManagerFactory(entityManagerFactory)
                .name("JpaPagingItemReader")
                .build();
    }

    @Bean
    @StepScope
    public ItemProcessor<CommonEntity, CommonEntity> processor(){

        return new ItemProcessor<CommonEntity,CommonEntity >() {
            @Override
            public CommonEntity process(CommonEntity commonEntity) throws Exception {

                commonEntity.setCheckDelete("Y");

                return commonEntity;
            }
        };
    }

    @Bean
    @StepScope
    public ItemWriter<? super CommonEntity> writer(){
        return new JpaItemWriterBuilder<CommonEntity>()
                .entityManagerFactory(entityManagerFactory)
                .build();
    }
}