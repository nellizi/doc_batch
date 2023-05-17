package com.inzent.batch.document.deposit;

import com.inzent.batch.document.model.DepositEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepositRepository extends JpaRepository<DepositEntity,Long>, DepositRepositoryCustom {


    DepositEntity findByImageKey(String imgKey);
}
