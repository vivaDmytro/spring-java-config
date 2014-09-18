package org.dmytrij.dao;

import org.dmytrij.entity.Contact;

import java.util.List;

/**
 * Created by Дмитрий on 18.09.14.
 */
public class ContactDaoImpl implements ContactDao {

    private List<Contact> contacts;

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public void addContact(Contact contact) {

        contacts.add(contact);
    }

    @Override
    public void deleteContact(Contact contact) {

        contacts.remove(contact);
    }

    @Override
    public List<Contact> getAllContacts() {
        return contacts;
    }
}
