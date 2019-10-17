/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117111.latihan35.objectoriented.programtunjangan;

import java.util.Scanner;
import pbo1.pkg10118014.latihan35.objectoriented.programtunjangan.Karyawan;

/**
 *
 * @author 
 * NAMA     : Jovi D Haris
 * KELAS    : IF-1
 * NIM      : 10118014
 * Deskripsi Program : Program ini untuk menampilkan tampilan dari sistem.
 */
public class PBO1101180141Latihan35ObjectOrientedProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        Karyawan kar = new Karyawan();

        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa gaji pokok Anda perbulan ? : Rp. ");
        kar.gajiPokok = scn.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum) :");
        kar.status = scn.next();

        kar.HasilHitung(kar.status,kar.gajiPokok);
    }
    
}
