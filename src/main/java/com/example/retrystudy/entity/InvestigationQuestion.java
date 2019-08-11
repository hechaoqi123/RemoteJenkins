package com.example.retrystudy.entity;

import java.util.Date;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableId;


/**
 * @author hcq
 * @date 2019/07/17 14:28:10
 * 巡检-问卷表
 */
@Data
public class InvestigationQuestion {

	/**
	* 主键id
	*/
	@TableId
	private String id;
	/**
	* 调查问卷表id（investigation_page.id）
	*/
	private String pageId;
	/**
	* 题目类型：现场巡检-INSPECTION;现场培训-TRAIN；现场照片-SHOOT
	*/
	private String type;
	/**
	* 题目内容
	*/
	private String content;
	/**
	* 选项类型：单选-RADIO;多选-CHECKBOX;文本-TEXT;图片-IMAGE
	*/
	private String optionType;
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
