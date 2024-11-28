package com.mahasiswa.service;

import com.mahasiswa.model.modelMahasiswa;
import com.mahasiswa.repository.mahasiswaRepository; // Corrected package and class names
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class mahasiswaService {

    @Autowired
    private mahasiswaRepository repository; // Injecting the repository

    // Add a new Mahasiswa
    public void addMhs(modelMahasiswa mhs) {
        repository.save(mhs);
    }

    // Get a Mahasiswa by ID
    public modelMahasiswa getMhs(int id) {
        return repository.findById(id).orElse(null);
    }

    // Update an existing Mahasiswa
    public void updateMhs(modelMahasiswa mhs) {
        repository.save(mhs);
    }

    // Delete a Mahasiswa by ID
    public void deleteMhs(int id) {
        repository.deleteById(id);
    }

    // Get all Mahasiswa records
    public List<modelMahasiswa> getAllMahasiswa() {
        return repository.findAll();
    }
}

