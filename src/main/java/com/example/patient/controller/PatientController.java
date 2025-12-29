package com.example.patient.controller;

import com.example.patient.model.Patient;
import com.example.patient.service.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/patients")
public class PatientController {

    private final PatientService service;

    public PatientController(PatientService service) {
        this.service = service;
    }

    // POST API
    @PostMapping
    public Patient addPatient(@RequestBody Patient patient) {
        return service.addPatient(patient);
    }

    // GET API
    @GetMapping
    public Collection<Patient> getPatients() {
        return service.getAllPatients();
    }

    // PUT API
    @PutMapping("/{id}")
    public Patient updatePatient(
            @PathVariable int id,
            @RequestBody Patient patient) {
        return service.updatePatient(id, patient);
    }

    // DELETE API
    @DeleteMapping("/{id}")
    public String deletePatient(@PathVariable int id) {
        service.deletePatient(id);
        return "Patient deleted successfully";
    }
}
