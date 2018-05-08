package com.leewm.purchase.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.leewm.purchase.common.base.BaseController;
import com.leewm.purchase.entity.account.Account;
import com.leewm.purchase.service.AccountService;

/**
 * 
 * @Description:账户管理前端控制器
 * @author:LeeWM
 * @date: 2018年5月6日 下午5:09:40
 */
@RestController
@RequestMapping("/account")
public class AccountManagerController extends BaseController {

	@Autowired
	private AccountService accountService;

	/**
	 * 
	 * 查出用户列表
	 * 
	 * @return
	 * @Return: Account
	 */
	@GetMapping("/list")
	public Account list(@RequestParam int pageNow, @RequestParam int pageSize) {
		// 第一个参数是第几页；第二个参数是每页显示条数
		PageHelper.startPage(pageNow, pageSize);
		// List<Account> list = this.accountService.getAccou
		return this.accountService.selectAccountById(1);
		// return this.accountBiz.selectByPrimaryKey(1);
	}

}
