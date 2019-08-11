package com.example.retrystudy.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.retrystudy.entity.InvestigationOption;
import com.example.retrystudy.entity.InvestigationPage;
import com.example.retrystudy.mapper.InvestigationOptionMapper;
import com.example.retrystudy.service.InvestigationOptionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;


/**
 * @author hcq
 * @date 2019/07/17 14:28:48
 */
@Service
@Slf4j
public class InvestigationOptionServiceImpl extends ServiceImpl<InvestigationOptionMapper,InvestigationOption> implements InvestigationOptionService {
    @Transactional(propagation= Propagation.NESTED,rollbackFor = ArithmeticException.class)
    public boolean  transactionDieLockTest(InvestigationPage page) throws Exception {
            log.info(TransactionSynchronizationManager.getCurrentTransactionName());
            //更新记录
            boolean a= page.update(new UpdateWrapper<InvestigationPage>()
                    .eq("name","hee2"));
            log.info("修改成功");

        return false;
    }
}
