package com.contact.ms.dao;

import java.util.List;
import java.util.UUID;

import com.contact.ms.model.Contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DiaryDataImpl implements DiaryDao {

    @Autowired
    DiaryJpa diary;

    @Override
    public void saveContact(Contact contact) {
        diary.save(contact);
    }

    @Override
    public Contact getContactByEmail(String email) {
        return diary.findByEmail(email);
    }

    @Override
    public void deleteContactByEmail(String email) {
        diary.deleteByEmail(email);

    }

    @Override
    public List<Contact> getAllContacts() {
        return diary.findAll();
    }

    @Override
    public boolean deleteContactById(UUID id) {
        diary.deleteById(id);
        return true;
    }

    @Override
    public Contact getContactById(UUID id) {
        return diary.findById(id).orElse(null);
    }

    @Override
    public void updateContact(Contact contact) {
        diary.save(contact);
    }

}
