package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Patient;

public interface PatientService {
	void add(Patient p);
	List<Patient> display();
	Patient update(Integer id,Patient p);
	void deleteById(Integer id);
	Patient findByName(String name);
	Patient findByAge(Integer age);
	Patient findByDate(String dt);
	List<Patient> findByGender(String gender);
}
