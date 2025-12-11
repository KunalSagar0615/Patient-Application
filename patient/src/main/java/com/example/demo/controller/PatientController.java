package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Patient;
import com.example.demo.service.PatientService;
import org.springframework.web.bind.annotation.PutMapping;






@RestController
public class PatientController {

	@Autowired
	private PatientService ps;
	
	@GetMapping("/")
	public String home() {
		return new String("Hello world");
	}
	
	@PostMapping("add")
	public void postMethodName(@RequestBody Patient entity) {
		ps.add(entity);
	}
	
	@GetMapping("display")
	public List<Patient> getMethodName() {
		return ps.display();
	}
	
	@PostMapping("update={id}")
	public Patient postMethodName(@PathVariable Integer id,@RequestBody Patient p) {
		//TODO: process POST request		
		return ps.update(id, p);
	}
	
	@DeleteMapping("delete={id}")
	public ResponseEntity<Map<String, String>> delete(@PathVariable Integer id){
		ps.deleteById(id);
		Map<String,String> response=new HashMap<>();
		response.put("message", "patient is delted successfuly");
		return new ResponseEntity<Map<String,String>>(response,HttpStatus.OK);
	}
	
	@PutMapping("findbyname={name}")
	public Patient findByName(@PathVariable String name) {			
		return ps.findByName(name);
	}
	
	@PutMapping("findbydate={dt}")
	public Patient findByDate(@PathVariable String dt) {
		return ps.findByDate(dt);
	}
	
	@PutMapping("findbyage={age}")
	public Patient findByAge(@PathVariable Integer age) {
		return ps.findByAge(age);
	}
	
	@PutMapping("findbygender={gender}")
	public List<Patient> findByGender(@PathVariable String gender) {
		//TODO: process PUT request
		
		return ps.findByGender(gender);
	}
}
