package com.contact.ms.services;

import java.util.List;
import java.util.UUID;

import com.contact.ms.dao.DiaryDao;
import com.contact.ms.model.Contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiaryServiceImpl implements DiaryService {

    @Autowired
    DiaryDao dao;

    @Override
    public boolean saveContact(Contact contact) {
        
        if(dao.getContactById(contact.getId()) == null) {
            dao.saveContact(contact);
            return true;
        }

        return false;
    }

    @Override
    public List<Contact> getAllContacts() {
        return dao.getAllContacts();
    }

    @Override
    public boolean updateContact(Contact contact) {
        
        if(dao.getContactById(contact.getId()) != null) {
            dao.updateContact(contact);
            return true;
        }

        return false;
        
    }

    @Override
    public boolean deleteContact(Contact contact) {
        
        if(dao.getContactById(contact.getId()) != null) {
            dao.deleteContactById(contact.getId());
            return true;
        }

        return false;

    }

    @Override
    public Contact getContactById(UUID id) {
        return dao.getContactById(id);
    }

    @Override
    public boolean deleteContactById(UUID id) {
        return dao.deleteContactById(id);
    }

}
    

