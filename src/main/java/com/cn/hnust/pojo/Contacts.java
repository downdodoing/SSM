package com.cn.hnust.pojo;

public class Contacts {
	private Integer cid;

	private Integer userid;

	private Integer groupid;

	private String netname;

	private String remarks;// 备注

	private String signature;// 个性签名
	
	private int contactsid; 

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getGroupid() {
		return groupid;
	}

	public void setGroupid(Integer groupid) {
		this.groupid = groupid;
	}


	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getNetname() {
		return netname;
	}

	public void setNetname(String netname) {
		this.netname = netname;
	}

	public int getContactsid() {
		return contactsid;
	}

	public void setContactsid(int contactsid) {
		this.contactsid = contactsid;
	}

}