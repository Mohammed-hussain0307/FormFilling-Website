package com.example.form.formFilling.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.form.formFilling.entity.FormEntity;
import com.example.form.formFilling.repository.FormRepos;

@Service
public class FormService {

	@Autowired
	FormRepos formrep;
	
	public void save(FormEntity formData) {
		formrep.save(formData);
	}
}
