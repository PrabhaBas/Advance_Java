package com.prabha.web.model;

public class Rough 
{
	
	private int eid;
	private String ename;
	private int eage;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEage() {
		return eage;
	}
	public void setEage(int eage) {
		this.eage = eage;
	}
	@Override
	public String toString() {
		return "Rough [eid=" + eid + ", ename=" + ename + ", eage=" + eage + "]";
	}
	
	
	
	
	

}
