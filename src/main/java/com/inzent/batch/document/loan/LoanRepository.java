package com.inzent.batch.document.loan;

import com.inzent.batch.document.model.LoanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends JpaRepository<LoanEntity,Long>, LoanRepositoryCustom {


    LoanEntity findByImageKey(String imgKey);
}
