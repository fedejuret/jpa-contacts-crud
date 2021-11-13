package com.contact.ms.dao;

import java.util.List;
import java.util.UUID;

import com.contact.ms.model.Contact;

public interface DiaryDao {
   
    void saveContact(Contact contact);

    Contact getContactByEmail(String email);

    void deleteContactByEmail(String email);

    List<Contact> getAllContacts();

    boolean deleteContactById(UUID id);

    Contact getContactById(UUID id);

    void updateContact(Contact contact);

}
