package com.inzent.batch.document;


import com.inzent.batch.document.model.IntegratedEnity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IntegratedRepositoryCustom {


    List<IntegratedEnity> getIntegratedEntity();
}
