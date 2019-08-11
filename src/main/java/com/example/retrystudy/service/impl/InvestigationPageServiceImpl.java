package com.example.retrystudy.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.retrystudy.entity.InvestigationPage;
import com.example.retrystudy.mapper.InvestigationPageMapper;
import com.example.retrystudy.service.InvestigationPageService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;


/**
 * @author hcq
 * @date 2019/07/17 14:28:48
 */
@Service
@Slf4j
@AllArgsConstructor
public class InvestigationPageServiceImpl extends ServiceImpl<InvestigationPageMapper,InvestigationPage> implements InvestigationPageService {
    InvestigationOptionServiceImpl option;
    @Override
    @Transactional(rollbackFor = {})
    public boolean updateByIds(InvestigationPage page) throws InterruptedException {
        this.updateById(page);
        return true;
    }

    @Override
    @Transactional(rollbackFor = {})
    public boolean transactionDieLockTest(InvestigationPage page) throws Exception {
        //更新记录
      log.info(TransactionSynchronizationManager.getCurrentTransactionName());
        page.update(new UpdateWrapper<InvestigationPage>()
                .eq("name","hee"));
        log.info("修改成功");
        return option.transactionDieLockTest(page);
    }
}
