package com.sr.freightops.dao;

import java.util.List;

import com.sr.freightops.entity.Contact;

public interface ContactDao {

	public void updateContact(Contact contact);

	public void addContact(Contact contact);

	public void deleteContact(Contact contact);

	public Contact findByContactId(java.lang.String id);

	public List<Contact> findContactByExample(Contact instance);

}