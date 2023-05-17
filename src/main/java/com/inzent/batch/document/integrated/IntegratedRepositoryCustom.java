package com.inzent.batch.document.integrated;


import com.inzent.batch.document.model.IntegratedEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IntegratedRepositoryCustom {

    List<IntegratedEntity> getIntegratedEntity();

    List<IntegratedEntity> findByCheckDelete();

}
