package com.rest.model;

import java.sql.Connection;
import java.util.ArrayList;

import com.rest.dao.ContactDAO;
import com.rest.dao.DatabaseConnection;
import com.rest.dto.Contact;

public class ContactManager {
	
	public void createContact(Contact contact) throws Exception{
		
		 try{
			 DatabaseConnection db = new DatabaseConnection();
			 Connection con = db.getConnection();
			 ContactDAO contactDAO = new ContactDAO();
			 contactDAO.createContact(con,contact);
		 }
		 catch(Exception e){
			 throw e;
		 }
		 
	}//createContact()
	
	public ArrayList<Contact> viewContacts() throws Exception{
		
		 ArrayList<Contact> contacts = null;
		 
		 try{
			 DatabaseConnection db = new DatabaseConnection();
			 Connection con = db.getConnection();
			 ContactDAO contct = new ContactDAO();
			 contacts = contct.viewContacts(con);
			 return contacts;
		 }//try
		 
		 catch(Exception e){
			 throw e;
		 }
	}//viewContacts()

}
