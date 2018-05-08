package com.leewm.purchase.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leewm.purchase.common.base.BaseBiz;
import com.leewm.purchase.common.base.BaseDao;
import com.leewm.purchase.dao.role.RoleDao;
import com.leewm.purchase.entity.role.Role;

/**
 * 
 * @Description: 角色业务
 * @author:LeeWM
 * @date: 2018年5月6日 下午2:56:02
 */
@Service
public class RoleBiz extends BaseBiz<Role> {

	@Autowired
	private RoleDao roleDao;

	@Override
	public BaseDao<Role> getBaseDao() {
		return this.roleDao;
	}
}