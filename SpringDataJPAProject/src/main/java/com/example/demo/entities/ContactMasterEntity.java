package com.example.demo.entities;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;

import javax.persistence.Table;

@Entity

@Table(name = "CONTACTS_MASTER")

public class ContactMasterEntity {

	@Id

	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "CONTACT_ID")

	private Integer contactId;

	@Column(name = "CONTACT_NAME")

	private String contactName;

	@Column(name = "CONTACT_NUMBER")

	private Long contactNumber;

	public Integer getContactId() {

		return contactId;

	}

	public void setContactId(Integer contactId) {

		this.contactId = contactId;

	}

	public String getContactName() {

		return contactName;

	}

	public void setContactName(String contactName) {

		this.contactName = contactName;

	}

	public Long getContactNumber() {

		return contactNumber;

	}

	public void setContactNumber(Long contactNumber) {

		this.contactNumber = contactNumber;

	}

	@Override

	public String toString() {

		return "ContactMasterEntity [contactId=" + contactId + ", contactName=" + contactName + ", contactNumber="

				+ contactNumber + "]";

	}

}