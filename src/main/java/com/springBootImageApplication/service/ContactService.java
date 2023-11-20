package com.springBootImageApplication.service;



import org.hibernate.MappingException;

import com.springBootImageApplication.beans.Contact;

public interface ContactService {
	
	void saveContacts(Contact contact) throws MappingException;

}
