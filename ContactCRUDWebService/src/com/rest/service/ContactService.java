package com.rest.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.rest.dto.Contact;
import com.rest.model.ContactManager;

@Path("/WebService")
public class ContactService {
	
	@GET
	@Path("/CreateContact")
	@Produces(MediaType.APPLICATION_JSON)
	public String createContact(){
		
		String str = null;
		try{
			File file = new File("D:\\Project\\git\\ContactCRUDWebService\\ContactCRUDWebService\\createContact.json");
			BufferedReader br = new BufferedReader(new FileReader(file));
			Gson gson = new Gson();
			Contact contact = gson.fromJson(br,Contact.class);
			ContactManager contactManager = new ContactManager();
		    contactManager.createContact(contact);
			System.out.println("Contact created with name : "+contact.getFname());
		}
		catch(Exception e){
			System.out.println("Error");
			e.printStackTrace();
		}
		return str;
	}
	
	@GET
	@Path("/ViewContacts")
	@Produces(MediaType.APPLICATION_JSON)
	
	public String viewContacts(){
		
		String contacts = null;
		
		try{
			
			ArrayList<Contact> contactList = null;
			
			ContactManager contactManager = new ContactManager();
			
			contactList = contactManager.viewContacts();
			
			Gson gson = new Gson();
			String output = gson.toJson(contactList);
			
			System.out.println(output);
			
			//Create a file and write JSON output into that file
			File file=new File("D:\\Project\\git\\ContactCRUDWebService\\ContactCRUDWebService\\ViewContacts.json");
			
			if (!file.exists()) {
				file.createNewFile();
			}
			
			FileWriter fw=new FileWriter(file);
			fw.write(output);
			System.out.println("All Contacts are stored in ViewContacts.JSON file");
			fw.close();
			
		}//try
		
		catch(Exception e){
			System.out.println("Error");
			e.printStackTrace();
		}
		return contacts;
	}

}
