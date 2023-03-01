package com.medical.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medical.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
