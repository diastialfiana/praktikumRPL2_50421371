package com.mahasiswa.model;

import jakarta.persistence.*; // Corrected package import for Jakarta Persistence

@Entity
@Table(name = "mahasiswa") // Fixed table name spelling
public class modelMahasiswa { // Fixed class name and changed brackets to braces {}

    @Id // Added missing @Id annotation
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Fixed `GeneratedValue` syntax
    @Column(name = "id") // Fixed column name spelling
    private int id; // Changed variable name to `id` from `1d`

    @Column(name = "npm", nullable = false, length = 8)
    private String npm; // Fixed variable name spelling from `opm` to `npm`

    @Column(name = "nama", nullable = false, length = 50)
    private String nama;

    @Column(name = "semester")
    private int semester;

    @Column(name = "ipk")
    private float ipk;

    // Default constructor
    public modelMahasiswa() {
        
    }

    public modelMahasiswa(int id, String npm, String nama, int semester, float ipk) {
        this.id = id;
        this.npm = npm;
        this.nama = nama;
        this.semester = semester;
        this.ipk = ipk;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public float getIpk() {
        return ipk;
    }

    public void setIpk(float ipk) {
        this.ipk = ipk;
    }
}
