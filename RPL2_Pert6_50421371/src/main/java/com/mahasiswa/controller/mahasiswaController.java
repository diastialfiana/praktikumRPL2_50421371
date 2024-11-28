package com.mahasiswa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mahasiswa.model.modelMahasiswa;
import com.mahasiswa.service.mahasiswaService;
import java.util.List;

@RestController // Changed to RestController to handle REST API requests
@RequestMapping("/mahasiswa") // Base URL mapping for the controller
public class mahasiswaController {

    @Autowired
    private mahasiswaService mahasiswaService;

    // Add a new Mahasiswa
    @PostMapping("/add")
    public String addMahasiswa(@RequestBody modelMahasiswa mhs) {
        mahasiswaService.addMhs(mhs);
        return "Mahasiswa Added Successfully";
    }

    // Get a Mahasiswa by ID
    @GetMapping("/{id}")
    public modelMahasiswa getMahasiswa(@PathVariable int id) {
        return mahasiswaService.getMhs(id);
    }

    // Update an existing Mahasiswa
    @PutMapping("/update")
    public String updateMahasiswa(@RequestBody modelMahasiswa mhs) {
        mahasiswaService.updateMhs(mhs);
        return "Mahasiswa Updated Successfully";
    }

    // Delete a Mahasiswa by ID
    @DeleteMapping("/delete/{id}")
    public String deleteMahasiswa(@PathVariable int id) {
        mahasiswaService.deleteMhs(id);
        return "Mahasiswa Deleted Successfully";
    }

    // Get all Mahasiswa records
    @GetMapping("/all")
    public List<modelMahasiswa> getAllMahasiswa() {
        return mahasiswaService.getAllMahasiswa();
    }
}

