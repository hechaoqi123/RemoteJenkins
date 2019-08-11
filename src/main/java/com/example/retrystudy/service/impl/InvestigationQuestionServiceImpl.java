package com.example.retrystudy.service.impl;

import lombok.extern.slf4j.Slf4j;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.retrystudy.service.InvestigationQuestionService;
import org.springframework.stereotype.Service;
import com.example.retrystudy.mapper.InvestigationQuestionMapper;
import com.example.retrystudy.entity.InvestigationQuestion;


/**
 * @author hcq
 * @date 2019/07/17 14:28:48
 */
@Service
@Slf4j
public class InvestigationQuestionServiceImpl extends ServiceImpl<InvestigationQuestionMapper,InvestigationQuestion> implements InvestigationQuestionService {

}
