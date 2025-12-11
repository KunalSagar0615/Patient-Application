package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Patient;
import com.example.demo.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepository pr;	
	
	@Override
	public void add(Patient p) {
		// TODO Auto-generated method stub
		pr.save(p);
	}

	@Override
	public List<Patient> display() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}

	@Override
	public Patient update(Integer id, Patient p) {
		// TODO Auto-generated method stub
		p.setId(id);
		return pr.save(p);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		pr.deleteById(id);
	}

	@Override
	public Patient findByName(String name) {
		 return pr.findByName(name);
	}

	@Override
	public Patient findByAge(Integer age) {
		return pr.findByAge(age);
	}

	@Override
	public Patient findByDate(String dt) {
		return pr.findByDate(dt);
	}

	@Override
	public List<Patient> findByGender(String gender) {
		// TODO Auto-generated method stub
		return pr.findByGender(gender);
	}

}
