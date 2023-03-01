package com.medical.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.medical.dao.AppointmentRepository;
import com.medical.dao.DoctorRepository;
import com.medical.dao.PatientRepository;
import com.medical.entities.Patient;
import com.medical.helper.Message;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

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
	public String home(Model m)
	{
		m.addAttribute("title","Home - Medical Management System");
		return "home";
	}
	
	@RequestMapping("/signup")
	public String registration(Model m)
	{
		
		m.addAttribute("patient", new Patient());
		return "signup";
	}
	
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@RequestMapping(value = "/doRegister",method = RequestMethod.POST)
	public String doRegister(@ModelAttribute("patient") Patient patient,Model m,HttpSession session)
	{
		try {
			Patient result = this.pRepo.save(patient);
			System.out.println(result);
			m.addAttribute("patient",new Patient());
			session.setAttribute("message", new Message("Registration is successful!!", "alert-success"));
			return "signup";
		} catch (Exception e) {
			// TODO: handle exception
			m.addAttribute("patient",patient);
			session.setAttribute("message",new Message("Something went wrong! "+e.getMessage(), "alert-danger") );
			return "signup";
		}
		
	}
	@RequestMapping("/admin")
	public String admin()
	{
		return"admin/dashboard";
	}
}
