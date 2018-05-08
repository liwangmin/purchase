package com.leewm.purchase.common.base;

/**
 * 
 * @Description: 查询条件父类
 * @author:LeeWM
 * @date: 2018年5月6日 下午9:29:54
 */
public class BaseDto {
	// 每页显示数量
	private int pageSize = 20;
	// 当前页数
	private int pageNow = 1;
	// 查询开始位置
	private int start;
	// 查询结束位置
	private int end;

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
		// 计算起始和结束位置
		this.calculate();
	}

	public int getPageNow() {
		return pageNow;
	}

	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
		// 计算起始和结束位置
		this.calculate();
	}

	/**
	 * 计算开始位置和结束位置
	 * 
	 * @Return: void
	 */
	private void calculate() {
		this.start = (this.pageNow - 1) * this.pageSize;
		this.end = this.pageNow * this.pageSize;
	}

}
