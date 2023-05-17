package com.inzent.batch.document.common;


import com.inzent.batch.document.model.IntegratedEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommonRepositoryCustom {


 List<IntegratedEntity> getIntegratedEntity();
}
