package com.leewm.purchase.entity.role;

import com.leewm.purchase.common.base.BaseEntity;

/**
 * 
 * @Description: 用户角色
 * @author:LeeWM
 * @date: 2018年5月6日 下午3:05:10
 */
public class AccountRole extends BaseEntity {

	private static final long serialVersionUID = -8694908845379756979L;

	private Integer id;

	private Integer accountId;

	private String userId;

	private Integer roleId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
}