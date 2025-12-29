package com.example.patient.service;

import com.example.patient.model.Patient;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PatientService {

    private Map<Integer, Patient> patientMap = new HashMap<>();

    // POST
    public Patient addPatient(Patient patient) {
        patientMap.put(patient.getId(), patient);
        return patient;
    }

    // GET
    public Collection<Patient> getAllPatients() {
        return patientMap.values();
    }

    // PUT
    public Patient updatePatient(int id, Patient patient) {
        patientMap.put(id, patient);
        return patient;
    }

    // DELETE
    public void deletePatient(int id) {
        patientMap.remove(id);
    }
}
