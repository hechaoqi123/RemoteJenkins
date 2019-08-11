package com.example.retrystudy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.retrystudy.entity.InvestigationPage;


/**
 * @author hcq
 * @date 2019/07/17 14:28:48
 */
public interface InvestigationPageService extends IService<InvestigationPage> {
    /**
     * 通过id进行更新
     */
    boolean updateByIds(InvestigationPage page) throws InterruptedException;
    /**
     * 通过普通字段更新（）
     */
    boolean transactionDieLockTest(InvestigationPage page) throws Exception;
}
