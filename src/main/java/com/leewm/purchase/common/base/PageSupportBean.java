package com.leewm.purchase.common.base;

import java.util.List;

/**
 * 
 * @Description: 分页包装类
 * @author:LeeWM
 * @date: 2018年5月7日 下午9:43:29
 */
public class PageSupportBean<T> {
	// 每页显示数量
	private int pageSize;
	// 当前页码
	private int pageNow;
	// 总条数
	private int recordCount;
	// 查询的记录列表
	private List<T> recordList;

	public PageSupportBean(int pageSize, int pageNow, int recordCount, List<T> recordList) {
		super();
		this.pageSize = pageSize;
		this.pageNow = pageNow;
		this.recordCount = recordCount;
		this.recordList = recordList;
	}

	public int getPageSize() {
		return pageSize;
	}

	public int getPageNow() {
		return pageNow;
	}

	public int getRecordCount() {
		return recordCount;
	}

	public List<T> getRecordList() {
		return recordList;
	}

}
