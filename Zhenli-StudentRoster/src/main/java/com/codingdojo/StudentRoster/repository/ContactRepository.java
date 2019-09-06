package com.codingdojo.StudentRoster.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.StudentRoster.models.Contact;


@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {
	List<Contact> findAll();
}