package com.example.retrystudy.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;
import java.util.Date;


/**
 * 数据库实体对象，此处开启了MybatisPlus  AR模式（需定义mapper才能使用）
 * @author hcq
 * @date 2019/07/17 14:28:10
 */
@Data
public class InvestigationPage extends Model<InvestigationPage> {

	/**
	* 主键id
	*/
	@TableId
	private String id;
	/**
	* 名称
	*/
	@NotBlank(message = "调查问卷名称不能为空")
	private String name;
	/**
	* 所属银行id
	*/
	private String bankId;
	/**
	* 描述
	*/
	private String description;
	/**
	* 问卷类型:商户巡检-MERCHANTCHECK；精准营销-MARKETING
	*/
	private String type;
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
/*	@NotBlank(message = "editor修改人手机号不能为空")
	@Pattern(regexp = "1[0-9]{10}", message = "手机号格式错误")*/
	private String editor;

	@Override
	protected Serializable pkVal() {
		return id;
	}
}
