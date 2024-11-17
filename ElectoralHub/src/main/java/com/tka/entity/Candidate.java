package com.tka.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Candidate implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int eid;
	private String name;

	private String pnm;

	private String stnm;
	private int age;
	private String gender;

	public Candidate() {
		super();
	}

	public Candidate(int eid, String name, String pnm, String stnm, int age, String gender) {
		super();
		this.eid = eid;
		this.name = name;
		this.pnm = pnm;
		this.stnm = stnm;
		this.age = age;
		this.gender = gender;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPnm() {
		return pnm;
	}

	public void setPnm(String pnm) {
		this.pnm = pnm;
	}

	public String getStnm() {
		return stnm;
	}

	public void setStnm(String stnm) {
		this.stnm = stnm;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Candidate [eid=" + eid + ", name=" + name + ", pnm=" + pnm + ", stnm=" + stnm + ", age=" + age
				+ ", gender=" + gender + "]";
	}

}
