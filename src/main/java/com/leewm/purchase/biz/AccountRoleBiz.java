package com.leewm.purchase.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leewm.purchase.common.base.BaseBiz;
import com.leewm.purchase.common.base.BaseDao;
import com.leewm.purchase.dao.role.AccountRoleDao;
import com.leewm.purchase.entity.role.AccountRole;

/**
 * 
 * @Description: 用户角色业务
 * @author:LeeWM
 * @date: 2018年5月6日 下午2:53:45
 */
@Service
public class AccountRoleBiz extends BaseBiz<AccountRole> {
	@Autowired
	private AccountRoleDao accountRoleDao;

	@Override
	public BaseDao<AccountRole> getBaseDao() {
		return this.accountRoleDao;
	}
}