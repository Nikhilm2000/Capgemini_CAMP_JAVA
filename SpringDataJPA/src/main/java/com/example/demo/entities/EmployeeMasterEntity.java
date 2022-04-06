package com.example.demo.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class EmployeeMasterEntity {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	int ID;
	//if table column name different use--@Column(name="Cloumn_name")
	String FIRST_NAME;
	String LAST_NAME;
	String DEPT_NAME;
	int DEPT_ID;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getFIRST_NAME() {
		return FIRST_NAME;
	}
	public void setFIRST_NAME(String FIRST_NAME) {
		this.FIRST_NAME = FIRST_NAME;
	}
	public String getLAST_NAME() {
		return LAST_NAME;
	}
	public void setLAST_NAME(String LAST_NAME) {
		this.LAST_NAME = LAST_NAME;
	}
	public String getDEPT_NAME() {
		return DEPT_NAME;
	}
	public void setDEPT_NAME(String DEPT_NAME) {
		this.DEPT_NAME = DEPT_NAME;
	}
	public int getDEPT_ID() {
		return DEPT_ID;
	}
	public void setDEPT_ID(int DEPT_ID) {
		this.DEPT_ID = DEPT_ID;
	}
	@Override
	public String toString() {
		return "EmployeeMasterEntity [ID=" + ID + ", FIRST_NAME=" + FIRST_NAME + ", LAST_NAME=" + LAST_NAME
				+ ", DEPT_NAME=" + DEPT_NAME + ", DEPT_ID=" + DEPT_ID + "]";
	}
	
}
