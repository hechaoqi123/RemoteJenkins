package com.example.retrystudy.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.retrystudy.common.beans.ResponseVO;
import com.example.retrystudy.entity.InvestigationPage;
import com.example.retrystudy.service.InvestigationPageService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;


/**
 * @author hcq
 * @date 2019/7/14 23:51
 * 营销APP巡检接口
 */
@RestController
@RequestMapping("/investigation")
@Slf4j
@AllArgsConstructor
public class InvestigationPageController {
    private InvestigationPageService service;

    /**
     * 通过id查询记录
     */
    @RequestMapping("/getById/{pageId}")
    public ResponseVO getById(@PathVariable String pageId) {
        InvestigationPage data = service.getById(pageId);
        return ResponseVO.biuldSuccess(data);
    }

    /**
     * 条件单体查询
     */
    @RequestMapping("/getOne")
    public ResponseVO getOne(@Valid InvestigationPage page) {
        InvestigationPage data = service.getOne(Wrappers.query(page), false);
        return ResponseVO.biuldSuccess(data);
    }

    /**
     * 数量统计
     */
    @RequestMapping("/count")
    public ResponseVO count(@Valid @NotBlank(message = "不能为空")String patam) {
        Integer data = service.count();
        return ResponseVO.biuldSuccess(data);
    }

    /**
     * 条件查询返回Map
     */
    @RequestMapping("/getMap")
    public ResponseVO getMap(InvestigationPage page) {
        Map<String, Object> data = service.getMap(Wrappers.query(page));
        return ResponseVO.biuldSuccess(data);
    }

    /**
     * 条件查询返回Object
     */
    @RequestMapping("/getObj")
    public ResponseVO getObj(InvestigationPage page) {
        Object data = service.getObj(Wrappers.query(page));
        return ResponseVO.biuldSuccess(data);
    }

    /**
     * 全表查询
     *
     */
    @RequestMapping("/list")
    public ResponseVO list() {
        List<InvestigationPage> data = service.list();
        return ResponseVO.biuldSuccess(data);
    }

    /**
     * 通过主键进行更新
     */
    @RequestMapping("/updateById")
    public ResponseVO list(InvestigationPage page) throws InterruptedException {
        Boolean data = service.updateByIds(page);
        return ResponseVO.biuldSuccess(data);
    }
 /*   @RequestMapping("/page")
    public List page(InvestigationPage page){
        return  service.page();
    }*/
}
