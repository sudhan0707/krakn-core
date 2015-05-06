
package com.sg.tuts.web.helpers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.ModelMap;

import com.sg.tuts.core.models.Contact;

public class ContactHelper {

	public static List<Contact> getContacts() {
		Contact contact1 = new Contact();
		contact1.setFirstName("John");
		contact1.setLastName("Doe");
		
		Contact contact2 = new Contact();
		contact2.setFirstName("Jane");
		contact2.setLastName("Doe");
		
		ArrayList<Contact> contacts = new ArrayList<Contact>();
		contacts.add(contact1);
		contacts.add(contact2);
		return contacts;
	}

	public static Contact getContact(ModelMap map) {
		Contact contact = new Contact();
		List<String> firstName = (ArrayList<String>)map.get("firstName");
		contact.setFirstName(firstName.get(0));
		List<String> lastName = (ArrayList<String>)map.get("lastName");
		contact.setLastName(lastName.get(0));
		
		return contact;
	}

}
