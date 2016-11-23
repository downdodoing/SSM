package com.cn.hnust.pojo;

import java.util.Date;

public class Message_User {
	private Integer mid;

	private Integer usendid;

	private Integer userid;

	private Date time;

	private String news;

	private Integer isnew;

	private String netname;

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public Integer getUsendid() {
		return usendid;
	}

	public void setUsendid(Integer usendid) {
		this.usendid = usendid;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news == null ? null : news.trim();
	}

	public Integer getIsnew() {
		return isnew;
	}

	public void setIsnew(Integer isnew) {
		this.isnew = isnew;
	}

	public String getNetname() {
		return netname;
	}

	public void setNetname(String netname) {
		this.netname = netname == null ? null : netname.trim();
	}

}
