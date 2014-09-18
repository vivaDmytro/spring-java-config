package org.dmytrij.dao;

import org.dmytrij.entity.Contact;

import java.util.List;

/**
 * Created by Дмитрий on 18.09.14.
 */
public interface ContactDao {

    void addContact(Contact contact);
    void deleteContact(Contact contact);
    List<Contact> getAllContacts();
}
