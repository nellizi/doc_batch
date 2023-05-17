package com.inzent.batch.document.deposit;


import com.inzent.batch.document.model.IntegratedEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepositRepositoryCustom {


 List<IntegratedEntity> getIntegratedEntity();
}
