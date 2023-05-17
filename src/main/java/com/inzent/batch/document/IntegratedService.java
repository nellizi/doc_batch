package com.inzent.batch.document;

import com.inzent.batch.document.model.IntegratedEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IntegratedService {

    @Autowired
    IntegratedRepository integratedRepository;


    public void deleteExpiredDocument() {
        List<IntegratedEntity> integratedEntityList = integratedRepository.getIntegratedEntity();
        IntegratedEntity integratedEntity = integratedEntityList.get(1);
        integratedEntity.setElementId("123456123");
        integratedEntity.setCheckDelete("Y");
        System.out.println(integratedEntity.getElementId());
        System.out.println(integratedEntity.getCheckDelete());
        integratedRepository.save(integratedEntity);

//        for(IntegratedEntity integratedEntity : integratedEntityList){
//            System.out.println(integratedEntity.getSeqNo());
//            integratedEntity.setCheckDelete("Y");
//            integratedRepository.save(integratedEntity);
//        }
    }

}
