package com.rest.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

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

}
