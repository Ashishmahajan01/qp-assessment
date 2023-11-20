package com.springBootImageApplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBootImageApplication.beans.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
