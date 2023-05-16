package com.inzent.batch.document;

import com.inzent.batch.document.model.CommonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommonRepository extends JpaRepository<CommonEntity,String> {

    @Query(value = "SELECT * FROM document WHERE DATE(updated_at) < DATE_SUB(NOW(), INTERVAL 7 DAY)", nativeQuery = true)
    List<CommonEntity> selectLimiteCommonEntity();
}
