package com.example.retrystudy.sync;

import com.example.retrystudy.entity.InvestigationPage;
import com.example.retrystudy.mapper.InvestigationPageMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author hcq
 * @date 2019/7/14 23:57
 */
@Service
@Slf4j
@AllArgsConstructor
public class SyncInvestigation {
    InvestigationPageMapper mapper;
    @Async
    public void AsyncpushMsp(InvestigationPage entity){
        log.info("开始进行异步推送："+ mapper.selectById(entity.getId()));
    }
}
