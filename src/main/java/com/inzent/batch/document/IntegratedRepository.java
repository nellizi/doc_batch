package com.inzent.batch.document;

import com.inzent.batch.document.model.IntegratedEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntegratedRepository extends JpaRepository<IntegratedEntity,Long>, IntegratedRepositoryCustom {


}
