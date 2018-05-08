package com.leewm.purchase.common.base;

/**
 * 
 * @Description: 操作方法父类
 * @author:LeeWM
 * @date: 2018年5月6日 下午2:44:13
 */
public interface BaseDao<T> {
	/**
	 * 新增记录
	 * 
	 * @param t
	 * @return
	 * @Return: int
	 */
	int insert(T t);

	/**
	 * 
	 * 通过主键删除记录
	 * 
	 * @param id
	 * @Return: void
	 */

	void deleteByPrimaryKey(Integer id);

	/**
	 * 
	 * 通过主键查找记录
	 * 
	 * @param id
	 * @return
	 * @Return: T
	 */
	T selectByPrimaryKey(Integer id);

	/**
	 * 
	 * 更新记录
	 * 
	 * @param t
	 * @Return: void
	 */
	void updateByPrimaryKey(T t);

}
