package com.inzent.batch.document.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Configuration
@EnableBatchProcessing
public class BatchScheduler {
    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    private BatchConfig batchConfig;

    @Scheduled(cron = "0 25 14 * * ?") //매일 18시에 실행해서 18시59분에 종료
    public void runJob(){
        //Jop parameter 설정
        Map<String, JobParameter> confMap = new HashMap<>();
        confMap.put("time",new JobParameter(System.currentTimeMillis()));
        JobParameters jobParameters = new JobParameters(confMap);

        try{                                   //jobParameter -> 반복 실행되는 Job의 유일한 Id. 동일값 세팅시 두번때부터 실행되는
            jobLauncher.run(batchConfig.job(), jobParameters);  //Job의 step은 실행되지 않는다.
        } catch(JobExecutionAlreadyRunningException | JobInstanceAlreadyCompleteException
            | JobParametersInvalidException | org.springframework.batch.core.repository.JobRestartException e){

            log.error(e.getMessage());
        }





    }
}