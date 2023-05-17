package com.inzent.batch.document.loan;


import com.inzent.batch.document.model.IntegratedEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanRepositoryCustom {


 List<IntegratedEntity> getIntegratedEntity();
}
