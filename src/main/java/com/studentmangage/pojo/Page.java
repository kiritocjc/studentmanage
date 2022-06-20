package com.studentmangage.pojo;

public class Page {
	
	private Integer page;
	private Integer limit;	
	public Page() {
	}
	public Page(Integer page, Integer limit) {
		this.page = page;
		this.limit = limit;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	@Override
	public String toString() {
		return "Page [page=" + page + ", limit=" + limit + "]";
	}
	

}
