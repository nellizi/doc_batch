//package com.inzent.batch.document;
//
//
//import com.inzent.batch.document.common.CommonRepository;
//import com.inzent.batch.document.integrated.IntegratedRepository;
//import com.inzent.batch.document.model.IntegratedEntity;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.sql.Date;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//
//@SpringBootTest
//public class CreateTest {
//    @Autowired
//    IntegratedRepository integratedRepository;
//
//    @Autowired
//    CommonRepository commonRepository;
//
//    @Test
//    void createSampleData(){
//
//        IntegratedEntity integratedEntity = new IntegratedEntity();
//
//        integratedEntity.setImageKey("1111");
//        integratedEntity.setElementId("1111");
//        integratedEntity.setSeqNo("1");
//        integratedEntity.setDocumentCd("1");
//        integratedEntity.setDeleteDate(LocalDateTime.now());
//        integratedEntity.setTaskCode("01");
//        integratedEntity.setFileName("123");
//        integratedEntity.setElementId("txt");
//        integratedEntity.setRegDate(Date.valueOf(LocalDate.now()));
//        integratedEntity.setCreateUser("394116");
//        integratedEntity.setUpdateAt(Date.valueOf(LocalDate.now()));
//        integratedEntity.setUpdateUser("394116");
//        integratedEntity.setCheckDelete("N");
//
//        integratedRepository.save(integratedEntity);
//
//
//    }
//
//}