package org.dmytrij.service;

import org.dmytrij.dao.ContactDao;
import org.dmytrij.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Дмитрий on 18.09.14.
 */
@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactDao contactDao;
    @Value("${maxContactsCount}")
    private Integer maxContactsCount;


    @Override
    public void addContact(Contact contact) {

        if(getAllContacts().size() >= maxContactsCount) {
            throw new RuntimeException("exceeds the maximum size of the list");
        }
        contactDao.addContact(contact);
    }

    @Override
    public void deleteContact(Contact contact) {

        contactDao.deleteContact(contact);
    }

    @Override
    public List<Contact> getAllContacts() {

        return contactDao.getAllContacts();
    }
}
