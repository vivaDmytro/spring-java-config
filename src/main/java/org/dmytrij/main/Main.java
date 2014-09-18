package org.dmytrij.main;

import org.dmytrij.config.AppConfig;
import org.dmytrij.entity.Contact;
import org.dmytrij.service.ContactService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Дмитрий on 18.09.14.
 */
public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ContactService contactService = context.getBean(ContactService.class);
        Contact contact = new Contact("Some New Contact", "+380222222222", "some.new@gmail.com");
        Contact contact1 = new Contact("Super New Contact", "+380333333333", "super.new@gmail.com");
        Contact contact2 = new Contact("Some Once Contact", "+380444444444", "some.once@gmail.com");

        System.out.println("Start application...");

        System.out.println("Get all contacts");
        System.out.println(contactService.getAllContacts());

        System.out.println("Add some contacts");
        try {

            contactService.addContact(contact);
            contactService.addContact(contact1);
            contactService.addContact(contact2);
        } catch (Exception e) {
            System.out.println("Can't add contact");
        }

        System.out.println("Get all contacts");
        System.out.println(contactService.getAllContacts());

        System.out.println("Remove contact " + contact1.toString());
        contactService.deleteContact(contact1);

        System.out.println("Get all contacts");
        System.out.println(contactService.getAllContacts());
    }
}
