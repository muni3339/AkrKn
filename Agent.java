package com.aid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.jws.HandlerChain;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.GenericGenerator;
//import org.hibernate.annotations.GenericGenerators;

@Entity
@Table(name="Agent")
public class Agent implements Serializable{
	@Id
	/**@SequenceGenerator(name="increment",sequenceName="agent_id_seq1")
	@GenericGenerator(strategy = "sequence",name = "sequence")*/
	//@GenericGenerator(strategy = "increment",name="increment")
	@TableGenerator(name = "hilo",allocationSize = 10,initialValue = 1,table = "AGENT_ID_UNIQUE_KEY",pkColumnName ="NEXT_HI")
	@GenericGenerator(strategy = "hilo",name ="hilo")
	@Column(name="AGENT_ID")
	private int agentId;
	@Column(name="First_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="dob")
	private Date dob;
	@Column(name="mobile")
	private String mobileNo;
	@Column(name="email")
	private String emailID;
	
	
	public int getAgentId() {
		return agentId;
	}
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public Agent() {
		
	}
	
	

}
