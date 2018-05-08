package com.leewm.purchase.entity.role;

import com.leewm.purchase.common.base.BaseEntity;

/**
 * 
 * @Description: 角色权限
 * @author:LeeWM
 * @date: 2018年5月6日 下午3:06:35
 */
public class RolePermission extends BaseEntity {

	private static final long serialVersionUID = -1521510670860125473L;

	private Integer id;

	private Integer roleId;

	private Integer permissionId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(Integer permissionId) {
		this.permissionId = permissionId;
	}
}