package com.codingdojo.StudentRoster.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.StudentRoster.models.Contact;
import com.codingdojo.StudentRoster.models.Student;
import com.codingdojo.StudentRoster.repository.ContactRepository;
import com.codingdojo.StudentRoster.repository.StudentRepository;

@Service
public class ApiService {
	private StudentRepository sRepo;
	private ContactRepository cRepo;
	
	public ApiService(StudentRepository s, ContactRepository c) { sRepo = s; cRepo = c; }
	
	public List<Student> allStudents() { return sRepo.findAll(); }
	public void createStudent(Student s) { sRepo.save(s); }
	public void createContact(Contact c) { cRepo.save(c); }
}
