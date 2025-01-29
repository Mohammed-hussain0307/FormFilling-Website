package com.example.form.formFilling.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.form.formFilling.entity.FormEntity;

@Repository
public interface FormRepos extends JpaRepository<FormEntity, Integer> {

}
