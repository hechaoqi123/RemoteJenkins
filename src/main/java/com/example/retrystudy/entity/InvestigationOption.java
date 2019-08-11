package com.example.retrystudy.entity;

import java.util.Date;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableId;


/**
 * @author hcq
 * @date 2019/07/17 14:28:10
 * 巡检-问卷设置
 */
@Data
public class InvestigationOption {

	/**
	* 主键id
	*/
	@TableId
	private String id;
	/**
	* 问卷题目表id（investigation_question.id）
	*/
	private String questionId;
	/**
	* 选项值
	*/
	private String value;
	/**
	* 选项内容
	*/
	private String content;
	/**
	* 状态：A-有效；I-无效
	*/
	private String status;
	/**
	* 创建时间
	*/
	private Date createTime;
	/**
	* 创建人
	*/
	private String creator;
	/**
	* 修改时间
	*/
	private Date editTime;
	/**
	* 修改人
	*/
	private String editor;

}
