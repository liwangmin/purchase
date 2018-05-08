package com.leewm.purchase.common.base;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @Description:业务biz父类方法
 * @author:LeeWM
 * @date: 2018年5月6日 下午2:43:24
 */
public abstract class BaseBiz<T> {
	@Autowired
	private BaseDao<T> baseDao;

	public abstract BaseDao<T> getBaseDao();

	/**
	 * 新增记录
	 * 
	 * @param t
	 * @return
	 * @Return: int
	 */
	public int insert(T t) {
		return this.baseDao.insert(t);
	}

	/**
	 * 
	 * 通过主键删除记录
	 * 
	 * @param id
	 * @Return: void
	 */
	public void deleteByPrimaryKey(Integer id) {
		this.baseDao.deleteByPrimaryKey(id);
	}

	/**
	 * 
	 * 通过主键查找记录
	 * 
	 * @param id
	 * @return
	 * @Return: T
	 */
	public T selectByPrimaryKey(Integer id) {
		return this.baseDao.selectByPrimaryKey(id);
	}

	/**
	 * 
	 * 更新记录
	 * 
	 * @param t
	 * @Return: void
	 */
	public void updateByPrimaryKey(T t) {
		this.baseDao.updateByPrimaryKey(t);
	}

}
