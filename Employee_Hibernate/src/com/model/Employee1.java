package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Employee1 {
	
	@Id
	private int eid;
	private String ename;
	private String eaddr;
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
	public String getEaddr() {
		return eaddr;
	}
	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}

}
