package com.example.retrystudy.controller;

import com.example.retrystudy.common.beans.ResponseVO;
import com.example.retrystudy.entity.InvestigationPage;
import com.example.retrystudy.service.InvestigationPageService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 此类用于测试事务死锁情况
 * @author hcq
 * @date 2019/7/30 22:15
 */
@RestController
@AllArgsConstructor
@RequestMapping("/TransactionDieLock")
public class TransactionDieLockController {
    InvestigationPageService investigationPageService;

    /**
     * 问题1：
     *   事务内新起事务修改同一条记录会不会死锁？
     * 问题2：
     *    内部事务是否可以访问外部事务未提交记录？
     * 测试结论：
     *   1、事务内新起事务修改同一张表的数据时有可能会发生死锁
     *     执行顺序：外层事务通过修改表数据（表锁、行锁）
     *               内层事务也修改同一张表中的数据（由于外层事务未提交，所以锁并没有没释放，此时就产生了死锁现象）
     *               如果外层update锁表，则影响所有记录，
     *               如果外层update走索引则只锁索引命中的记录（聚簇索引只会锁一行）
     *
     */
    @RequestMapping("/testDieLock")
    public ResponseVO<Boolean> testDieLock(@Valid InvestigationPage page) throws Exception {
       return ResponseVO.biuldSuccess(investigationPageService.transactionDieLockTest(page));
    }
}
