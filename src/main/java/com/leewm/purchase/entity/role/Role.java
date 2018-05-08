package com.leewm.purchase.entity.role;

import com.leewm.purchase.common.base.BaseEntity;

/**
 * 
 * @Description: 角色
 * @author:LeeWM
 * @date: 2018年5月6日 下午3:05:54
 */
public class Role extends BaseEntity {

	private static final long serialVersionUID = 4063299188960623771L;

	private Integer id;

	private String name;

	private String code;

	private String remark;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code == null ? null : code.trim();
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}
}