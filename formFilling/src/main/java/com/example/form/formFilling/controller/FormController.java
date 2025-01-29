package com.example.form.formFilling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.form.formFilling.entity.FormEntity;
import com.example.form.formFilling.service.FormService;

@CrossOrigin(origins = "http://localhost:3000") // Allow requests from React frontend
@RestController
@RequestMapping("/api")
public class FormController {

	@Autowired
	FormService formService;
	
	 @PostMapping("/submit")
     public String submitForm(@RequestBody FormEntity formData) {
         
		 formService.save(formData);
         return "Form submitted successfully!";
     }
}
