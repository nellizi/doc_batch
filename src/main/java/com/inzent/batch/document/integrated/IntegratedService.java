package com.inzent.batch.document.integrated;

import com.inzent.batch.document.common.CommonService;
import com.inzent.batch.document.deposit.DepositService;
import com.inzent.batch.document.loan.LoanService;
import com.inzent.batch.document.model.IntegratedEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IntegratedService {

    @Autowired
    IntegratedRepository integratedRepository;

    @Autowired
    CommonService commonService;

    @Autowired
    DepositService depositService;

    @Autowired
    LoanService loanService;


    public void deleteExpiredDocument() {
        List<IntegratedEntity> integratedEntityList = integratedRepository.getIntegratedEntity();

        for(IntegratedEntity integratedEntity : integratedEntityList){
            integratedEntity.setCheckDelete("Y");
            integratedRepository.save(integratedEntity);

            String imgKey = integratedEntity.getImageKey();    //업무 키
            int task_code = Integer.parseInt(integratedEntity.getTaskCode());   //업무 코드

            switch (task_code){
                //공통_Common
                case 01: commonService.deleteExpiredTask(imgKey);
                    break;
                //수신_Deposit
                case 02: depositService.deleteExpiredTask(imgKey);
                    break;
                //여신_Loan
                case 03: loanService.deleteExpiredTask(imgKey);
                    break;
            }

        }
    }

}
