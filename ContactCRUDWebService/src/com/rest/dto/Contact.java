package com.rest.dto;

public class Contact {
	
	private int contact_id;
	private String fname;
	private String lname;
	private String mobno;
	private String email;
	private String addr;
	private String note;
	
	public Contact(){
		
	}
	
	public Contact(int contact_id, String fname, String lname, String mobno,
			String email, String addr, String note) {
		super();
		this.contact_id = contact_id;
		this.fname = fname;
		this.lname = lname;
		this.mobno = mobno;
		this.email = email;
		this.addr = addr;
		this.note = note;
	}

	public int getContact_id() {
		return contact_id;
	}

	public void setContact_id(int contact_id) {
		this.contact_id = contact_id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getMobno() {
		return mobno;
	}

	public void setMobno(String mobno) {
		this.mobno = mobno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "Contact [contact_id=" + contact_id + ", fname=" + fname
				+ ", lname=" + lname + ", mobno=" + mobno + ", email=" + email
				+ ", addr=" + addr + ", note=" + note + "]";
	}
	
	

}
