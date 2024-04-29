/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package perpustakaan;
import java.util.ArrayList;
import java.util.Scanner;



class Buku {
    String judul, penulis, penerbit, kategori,publisher;
    int stok;
    String tahunT;

    public Buku (String judul, String penulis, String penerbit, String kategori, int stok,String publisher,String tahunT) {
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.kategori = kategori;
        this.stok = stok;
        this.publisher = publisher;
        this.tahunT = tahunT;
    }

    public void displayInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Penerbit: " + penerbit);
        System.out.println("Kategori: " + kategori);
        System.out.println("Stok: " + stok);
        System.out.println("Tahun Terbit: " + tahunT);
    }
}