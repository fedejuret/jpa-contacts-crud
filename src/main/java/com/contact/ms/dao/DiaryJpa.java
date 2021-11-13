
package com.contact.ms.dao;

import java.util.UUID;

import com.contact.ms.model.Contact;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DiaryJpa extends JpaRepository<Contact, UUID> {

    Contact findByEmail(String email);

    void deleteByEmail(String email);

}
