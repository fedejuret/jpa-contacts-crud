package com.contact.ms.services;

import java.util.List;
import java.util.UUID;

import com.contact.ms.model.Contact;

public interface DiaryService {

    boolean saveContact(Contact contact);

    List<Contact> getAllContacts();

    boolean updateContact(Contact contact);

    boolean deleteContact(Contact contact);

    boolean deleteContactById(UUID id);

    Contact getContactById(UUID id);

}

