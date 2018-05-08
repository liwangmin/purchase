package com.leewm.purchase.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leewm.purchase.common.base.BaseBiz;
import com.leewm.purchase.common.base.BaseDao;
import com.leewm.purchase.dao.account.AccountDao;
import com.leewm.purchase.entity.account.Account;

/**
 * 
 * @Description: 用户业务
 * @author:LeeWM
 * @date: 2018年5月6日 下午2:58:38
 */
@Service
public class AccountBiz extends BaseBiz<Account> {
	@Autowired
	private AccountDao accountDao;

	@Override
	public BaseDao<Account> getBaseDao() {
		return this.accountDao;
	}
}