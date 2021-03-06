package com.studentmangage.pojo;

import java.util.List;

/**
 * 传递前端的返回数据
 * @author PerfectSuit
 *
 */
public class Result {
	
	private int code;
	private String msg;
	private int count;
	private List<Object> data;
	public Result() {
	}
	public Result(int code, String msg, int count, List<Object> data) {
		this.code = code;
		this.msg = msg;
		this.count = count;
		this.data = data;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<Object> getData() {
		return data;
	}
	public void setData(List<Object> data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Result [code=" + code + ", msg=" + msg + ", count=" + count + ", data=" + data + "]";
	}
	
	

}
