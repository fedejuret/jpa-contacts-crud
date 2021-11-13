package com.contact.ms.controllers;

import java.util.UUID;

import com.contact.ms.dao.DiaryJpa;
import com.contact.ms.model.Contact;
import com.contact.ms.services.DiaryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController extends Controller {

    @Autowired
    DiaryService service;

    @Autowired
    DiaryJpa diaryJpa;

    @GetMapping(value = "/contacts", produces = "application/json")
    public Object getContacts() {
        return this.successResponse(service.getAllContacts(), 200);
    }

    @GetMapping(value = "/contacts/{id}", produces = "application/json")
    public Object getContact(@PathVariable UUID id) {
        return this.successResponse(service.getContactById(id), 200);
    }

    @PostMapping("/contacts")
    public Object createContact(@RequestBody Contact contact) {
        return this.successResponse(diaryJpa.save(contact), 201);
    }

    @PutMapping(value = "/contacts", produces = "application/json", consumes = "application/json")
    public Object updateContact(@RequestBody Contact contact) {
        return this.successResponse(diaryJpa.save(contact), 201);
    }

    @DeleteMapping(value = "/contacts/{id}")
    public Object deleteContact(@PathVariable("id") UUID id) {
        if(service.deleteContactById(id)) {
            return this.successResponse("Contact deleted", 200);
        } else {
            return this.errorResponse("Error when try to delete contact", 500);
        }
    }

}
