package com.medical.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medical.entities.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

}
