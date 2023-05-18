package com.inzent.batch.document.integrated;


import com.inzent.batch.document.model.IntegratedEntity;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

import static com.inzent.batch.document.model.QIntegratedEntity.integratedEntity;

@RequiredArgsConstructor
public class IntegratedRepositoryImpl implements IntegratedRepositoryCustom {

    private final JPAQueryFactory jpaQueryFactory;



    @Override
    public List<IntegratedEntity> getIntegratedEntity() {
        List<IntegratedEntity> integratedEnities = jpaQueryFactory
                .selectFrom(integratedEntity)
                .where(integratedEntity.deleteDate.before(LocalDateTime.now().plusDays(1)))
                .fetch();

        return integratedEnities;
    }

    @Override
    public List<IntegratedEntity> findByCheckDelete() {
        List<IntegratedEntity> integratedEnities = jpaQueryFactory
                .selectFrom(integratedEntity)
                .where(integratedEntity.checkDelete.eq("N"))
                .fetch();

        return integratedEnities;
    }



}
