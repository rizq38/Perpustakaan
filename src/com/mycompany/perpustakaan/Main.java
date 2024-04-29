/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package .perpustakaan;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<perpustakaan> vehicles = new ArrayList<>();

        System.out.println("Masukkan data buku:");

        // Input data kendaraan
        System.out.print("Jumlah buku yang akan dimasukkan: ");
        int jumlahB = scanner.nextInt();
        scanner.nextLine(); // Membuang newline karakter

        for (int i = 0; i < jumlahB; i++) {
            System.out.println("\nData buku ke-" + (i + 1));
            System.out.print("Judul buku : ");
            String judul = scanner.nextLine();
            
            System.out.print("penulis film : ");
            String penulis = scanner.nextLine();
            
            System.out.print("perusahaan yang menerbitkan : ");
            String publisher = scanner.nextLine();
            
            System.out.print("Kategori usia : ");
            String kategori = scanner.nextLine();
            
            System.out.print("stok buku yang tersedia : ");
            String stok = scanner.nextLine();
            
            System.out.print("Tahun terbit buku : ");
            String tahunT = scanner.nextLine();
            
            int tahun = scanner.nextInt();
            scanner.nextLine(); // Membuang newline karakter setelah nextInt

            perpustakaan Perpustakaan;
            if (judul.equalsIgnoreCase("Spiderman")) {
                Perpustakaan = new piderman(penulis, publisher, kategori, stok, tahunT);
            } else if (jenis.equalsIgnoreCase("Motor")) {
                rental = new Motorcycle(merek, model, status, tahun);
            } else if (jenis.equalsIgnoreCase("Sepeda")) {
                rental = new Bicycle(merek, model, status, tahun);
            } else {
                System.out.println("Jenis kendaraan tidak valid.");
                continue;
            }

            vehicles.add(rental);
        }

        // Menampilkan daftar kendaraan yang telah disewakan
        System.out.println("\nDaftar kendaraan yang telah disewakan:");
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println("\nKendaraan ke-" + (i + 1));
            vehicles.get(i).displayInfo();
        }

        scanner.close();
    }
}
