package com.leewm.purchase.service;

import com.leewm.purchase.entity.account.Account;

/**
 * 
 * @Description: TODO
 * @author:LeeWM
 * @date: 2018年5月6日 下午5:03:38
 */
public interface AccountService {
	/**
	 * 
	 * 通过id查找用户
	 * 
	 * @param id
	 * @return
	 * @Return: Account
	 */
	Account selectAccountById(Integer id);

}
