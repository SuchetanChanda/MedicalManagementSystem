package com.medical.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.medical.dao.AppointmentRepository;
import com.medical.dao.DoctorRepository;
import com.medical.dao.PatientRepository;
import com.medical.entities.Appointment;
import com.medical.entities.Doctor;
import com.medical.entities.Patient;

@Controller
public class MainController {
	
	// All the API request and response will be handled here!!
	
	// The code below is just for testing purpose. Feel free to delete it!

	@Autowired
	PatientRepository pRepo;
	
	@Autowired
	DoctorRepository dRepo;
	
	@Autowired
	AppointmentRepository appRepo;
	
	@RequestMapping("/")
	public String home()
	{
		Doctor d1 = new Doctor();
		d1.setName("Suchetan Chanda");
		d1.setEmail("xxx@gmail.com");
		
		Patient p1 = new Patient();
		p1.setName("yyy");
		p1.setEmail("yyy@gmail.com");
		
		Appointment a1 = new Appointment();
		a1.setDoctor(d1);
		a1.setPatient(p1);
		
		dRepo.save(d1);
		pRepo.save(p1);
		appRepo.save(a1);
		return "home";
	}
}
