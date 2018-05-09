package com.leewm.purchase.common.base;

/**
 * 封装返回体
 * 
 * @author LeeWM
 *
 * @param <T>
 */
public class ResponseJsonResult<T> {
	// 成功编码
	private static final String SUCCESS = "ok";

	// 返回成功或失败编码
	private String code;
	// 错误信息
	private String mesage;
	// 返回数据
	private T data;

	public ResponseJsonResult(String code, String mesage, T data) {
		super();
		this.code = code;
		this.mesage = mesage;
		this.data = data;
	}

	/**
	 * 返回成功结果
	 * 
	 * @param object
	 * @return
	 */
	public ResponseJsonResult<Object> success(Object object) {
		return new ResponseJsonResult<Object>(ResponseJsonResult.SUCCESS, null, object);
	}

	/**
	 * 返回成功结果
	 * 
	 * @return
	 */
	public ResponseJsonResult<Object> success() {
		return new ResponseJsonResult<Object>(ResponseJsonResult.SUCCESS, null, null);
	}

	/**
	 * 返回失败结果
	 * 
	 * @param code
	 * @param message
	 * @return
	 */
	public ResponseJsonResult<Object> error(String code, String message) {
		return new ResponseJsonResult<Object>(code, message, null);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMesage() {
		return mesage;
	}

	public void setMesage(String mesage) {
		this.mesage = mesage;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
