package org.dmytrij.service;

import org.dmytrij.entity.Contact;

import java.util.List;

/**
 * Created by Дмитрий on 18.09.14.
 */
public interface ContactService {

    void addContact(Contact contact);
    void deleteContact(Contact contact);
    List<Contact> getAllContacts();
}
