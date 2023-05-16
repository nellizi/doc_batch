package com.inzent.batch.document;


import com.inzent.batch.document.model.IntegratedEnity;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

import static com.inzent.batch.document.model.QIntegratedEnity.integratedEnity;

@RequiredArgsConstructor
public class IntegratedRepositoryImpl implements IntegratedRepositoryCustom {

    private final JPAQueryFactory jpaQueryFactory;



    @Override
    public List<IntegratedEnity> getIntegratedEntity() {
//        LocalDateTime toDay = LocalDateTime.now();
//        Date nowDate = java.sql.Timestamp.valueOf(toDay);

        List<IntegratedEnity> integratedEnities = jpaQueryFactory
                .selectFrom(integratedEnity)
                .where(integratedEnity.deleteDate.after(LocalDateTime.now()))
                .fetch();

        return integratedEnities;
    }
}
