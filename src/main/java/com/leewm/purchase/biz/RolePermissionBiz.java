package com.leewm.purchase.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leewm.purchase.common.base.BaseBiz;
import com.leewm.purchase.common.base.BaseDao;
import com.leewm.purchase.dao.role.RolePermissionDao;
import com.leewm.purchase.entity.role.RolePermission;

/**
 * 
 * @Description: 角色权限业务
 * @author:LeeWM
 * @date: 2018年5月6日 下午2:56:55
 */
@Service
public class RolePermissionBiz extends BaseBiz<RolePermission> {
	@Autowired
	private RolePermissionDao rolePermissionDao;

	@Override
	public BaseDao<RolePermission> getBaseDao() {
		return this.rolePermissionDao;
	}
}