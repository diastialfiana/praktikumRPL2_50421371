package com.mahasiswa.view;

import com.mahasiswa.controller.MahasiswaController;
import com.mahasiswa.model.MahasiswaDAO;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MahasiswaView {

    public static void main(String[] args) {
        MahasiswaDAO mahasiswaDAO = new MahasiswaDAO();
        MahasiswaController mahasiswaController = new MahasiswaController(mahasiswaDAO);

        Scanner scanner = new Scanner(System.in);
        int pilihan;

        while (true) {
            System.out.println("Menu :");
            System.out.println("1. Tampilkan Semua Mahasiswa");
            System.out.println("2. Tambah Mahasiswa");
            System.out.println("3. Update Mahasiswa");
            System.out.println("4. Hapus Mahasiswa");
            System.out.println("5. Cek Koneksi Database");
            System.out.println("6. Keluar");
            System.out.print("PILIH OPSI: ");

            try {
                pilihan = scanner.nextInt();  // Mengambil input pilihan dari pengguna

                switch (pilihan) {
                    case 1:
                        mahasiswaController.displayAllMahasiswa();
                        break;
                    case 2:
                        System.out.print("Masukan NPM: ");
                        String npm = scanner.next();
                        System.out.print("Masukan Nama: ");
                        String nama = scanner.next();
                        
                        System.out.print("Masukan Semester: ");
                        while (!scanner.hasNextInt()) {
                            System.out.println("Input tidak valid. Masukkan angka untuk semester.");
                            scanner.next(); // Membuang input yang salah
                        }
                        int semester = scanner.nextInt();

                        System.out.print("Masukan IPK: ");
                        while (!scanner.hasNextFloat()) {
                            System.out.println("Input tidak valid. Masukkan angka untuk IPK.");
                            scanner.next(); // Membuang input yang salah
                        }
                        float ipk = scanner.nextFloat();

                        mahasiswaController.addMahasiswa(npm, nama, semester, ipk);
                        break;
                    case 3:
                        System.out.print("Masukan ID Mahasiswa: ");
                        while (!scanner.hasNextInt()) {
                            System.out.println("Input tidak valid. Masukkan angka untuk ID.");
                            scanner.next(); // Membuang input yang salah
                        }
                        int id = scanner.nextInt();

                        System.out.print("Masukan NPM: ");
                        String npmBaru = scanner.next();
                        System.out.print("Masukan Nama: ");
                        String namaBaru = scanner.next();

                        System.out.print("Masukan Semester: ");
                        while (!scanner.hasNextInt()) {
                            System.out.println("Input tidak valid. Masukkan angka untuk semester.");
                            scanner.next();
                        }
                        int semesterBaru = scanner.nextInt();

                        System.out.print("Masukan IPK: ");
                        while (!scanner.hasNextFloat()) {
                            System.out.println("Input tidak valid. Masukkan angka untuk IPK.");
                            scanner.next();
                        }
                        float ipkBaru = scanner.nextFloat();

                        mahasiswaController.updateMahasiswa(id, npmBaru, namaBaru, semesterBaru, ipkBaru);
                        break;
                    case 4:
                        System.out.print("Masukan ID Mahasiswa yg Ingin Dihapus: ");
                        while (!scanner.hasNextInt()) {
                            System.out.println("Input tidak valid. Masukkan angka untuk ID.");
                            scanner.next();
                        }
                        int idHapus = scanner.nextInt();
                        mahasiswaController.deleteMahasiswa(idHapus);
                        break;
                    case 5:
                        mahasiswaController.checkDatabaseConnection();
                        break;
                    case 6:
                        mahasiswaController.closeConnection();
                        System.out.println("Program selesai");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Input Tidak Valid");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Masukkan angka untuk pilihan.");
                scanner.next(); // Membuang input yang salah
            }
        }
    }
}
