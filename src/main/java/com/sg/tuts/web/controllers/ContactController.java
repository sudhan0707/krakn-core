package com.sg.tuts.web.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sg.tuts.core.models.Contact;
import com.sg.tuts.web.helpers.ContactHelper;

@Controller
@RequestMapping("/contacts")
public class ContactController {
	private List<Contact> contacts = new ArrayList<Contact>();
	
	@RequestMapping(method = {RequestMethod.GET})
	public @ResponseBody List<Contact> getIndex() {
		if(contacts.size() <= 2){	
			contacts = ContactHelper.getContacts();
		}
		 return contacts;
	}
	
	@RequestMapping(method = { RequestMethod.POST})
	public @ResponseBody List<Contact> saveContact(@RequestBody ModelMap map) {
		Contact contact = ContactHelper.getContact(map);
		contacts.add(contact);
		return contacts;
	}
}
