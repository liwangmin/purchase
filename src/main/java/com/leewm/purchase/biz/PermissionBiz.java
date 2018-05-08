package com.leewm.purchase.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leewm.purchase.common.base.BaseBiz;
import com.leewm.purchase.common.base.BaseDao;
import com.leewm.purchase.dao.role.PermissionDao;
import com.leewm.purchase.entity.role.Permission;

/**
 * 
 * @Description: 权限业务
 * @author:LeeWM
 * @date: 2018年5月6日 下午2:54:35
 */
@Service
public class PermissionBiz extends BaseBiz<Permission> {
	@Autowired
	private PermissionDao permissionDao;

	@Override
	public BaseDao<Permission> getBaseDao() {
		return this.permissionDao;
	}

}