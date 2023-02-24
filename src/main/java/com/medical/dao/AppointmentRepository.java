package com.medical.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medical.entities.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

}
