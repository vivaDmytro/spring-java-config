package org.dmytrij.config;

import org.dmytrij.dao.ContactDao;
import org.dmytrij.dao.ContactDaoImpl;
import org.dmytrij.entity.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Дмитрий on 18.09.14.
 */
@Configuration
@ComponentScan(basePackages = "org.dmytrij")
@PropertySource("classpath:application.properties")
public class AppConfig {

    @Bean
    public ContactDao getContactDao() {

        List<Contact> contacts = new ArrayList<Contact>();
        Contact contact = new Contact();
        contact.setPhone("+380111111111");
        contact.setName("Некий Неизвестный Пользователь");
        contact.setEmail("some.unknown@gmail.com");
        contacts.add(contact);
        ContactDaoImpl contactDao = new ContactDaoImpl();
        contactDao.setContacts(contacts);
        return contactDao;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigurer() {

        return new PropertySourcesPlaceholderConfigurer();
    }
}
