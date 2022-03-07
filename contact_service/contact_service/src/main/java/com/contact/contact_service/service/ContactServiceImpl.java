package com.contact.contact_service.service;

import com.contact.contact_service.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    // Fake list of Contacts

    List<Contact> contactList = List.of(
            new Contact(1L, "amit@gmail.com", "Amit", 1311L),
            new Contact(2L, "Rohan@gmail.com", "Rohan", 1311L),
            new Contact(3L, "anil@gmail.com", "Anil", 1312L),
            new Contact(4L, "sumit@gmail.com", "Sumit", 1313L),
            new Contact(5L, "sameer@gmail.com", "Sameer", 1313L),
            new Contact(6L, "rohit@gmail.com", "Rohit", 1312L)
    );

    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        List<Contact> contacts = new ArrayList<Contact>();
        for (Contact c: contactList){
            Long id = c.getUserId();
            if(id.equals(userId)){
                contacts.add(c);
            }
        }

        return contacts;
    }
}
