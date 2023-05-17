package com.inzent.batch.document.common;

import com.inzent.batch.document.model.CommonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommonRepository extends JpaRepository<CommonEntity,Long>, CommonRepositoryCustom {


    CommonEntity findByImageKey(String imgKey);
}
