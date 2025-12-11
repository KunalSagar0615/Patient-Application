package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Patient {

	@Id
	private Integer id;
	private String name;
	private Integer age;
	private String gender;
	private String mob;
	private String email;
	private String address;
	private String date;
}
