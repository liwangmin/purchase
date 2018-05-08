package com.leewm.purchase.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leewm.purchase.biz.AccountBiz;
import com.leewm.purchase.entity.account.Account;
import com.leewm.purchase.service.AccountService;

/**
 * 
 * @Description: TODO
 * @author:LeeWM
 * @date: 2018年5月6日 下午5:06:59
 */
@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountBiz accountBiz;

	/**
	 * 
	 * 通过id查找用户
	 * 
	 * @param id
	 * @return
	 * @Return: Account
	 */
	@Override
	public Account selectAccountById(Integer id) {
		return accountBiz.selectByPrimaryKey(id);
	}

}
