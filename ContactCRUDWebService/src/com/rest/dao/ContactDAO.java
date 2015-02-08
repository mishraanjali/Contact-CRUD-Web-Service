package com.rest.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.rest.dto.Contact;

public class ContactDAO {
	
public void createContact(Connection con,Contact contact) throws Exception{
		
		try{
			PreparedStatement ps = 
					con.prepareStatement("INSERT INTO CONTACT(fname,lname,mobno,email,addr,note) VALUES(?,?,?,?,?,?)");
			
			ps.setString(1,contact.getFname());
			ps.setString(2,contact.getLname());
			ps.setString(3,contact.getMobno());
			ps.setString(4,contact.getEmail());
			ps.setString(5,contact.getAddr());
			ps.setString(6,contact.getNote());
			
			int i = ps.executeUpdate();
			
			if(i==0)
				System.out.println("Insertion Failed.Please try after some time.");
			else
				System.out.println(i + " record created successfully");			
		}//try
		
		catch(Exception e){
			throw e;
		}
		
	}//createContact()
public ArrayList<Contact> viewContacts(Connection con) throws Exception{
	
	ArrayList<Contact> contactList = new ArrayList<Contact>();
	
	try{
		PreparedStatement ps = 
				con.prepareStatement("SELECT * FROM contact");
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			Contact contact = new Contact();
			contact.setContact_id(rs.getInt("contact_id"));
			contact.setFname(rs.getString("fname"));
			contact.setLname(rs.getString("lname"));
			contact.setMobno(rs.getString("mobno"));
			contact.setEmail(rs.getString("email"));
			contact.setAddr(rs.getString("addr"));
			contact.setNote(rs.getString("note"));
			contactList.add(contact);
		}
		
		return contactList;
	}//try
	
	catch(Exception e){
		throw e;
	}
	
}//viewContacts()

}
