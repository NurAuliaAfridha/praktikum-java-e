package id.ac.Ridha;

import javax.swing.*;
import java.awt.*;

public class DataType {

    public static void main(String[] args) {

        //static datatype

        String namaDepan    = "Nur";
        String namaTengah   = "Aulia";
        String namaBelakang = "Afridha";
        int usia            = 20;
        int targetKuliah    = 4;
        double ipk          = 3.51;
        char nilaiAbjad     = 'A';
        boolean tampan      = true;

        System.out.println("Nama Depan          :" + namaDepan);
        System.out.println("Nama Tengah         :" + namaTengah);
        System.out.println("Nama Belakang       :" + namaBelakang);
        System.out.println("Usia                :" + usia);
        System.out.println("Target Kuliah       :" + targetKuliah+ " tahun");
        System.out.println("IPK                 :" + ipk);
        System.out.println("Nilai PBO           :" + nilaiAbjad);
        System.out.println("Tampan "+ tampan);

        JOptionPane.showMessageDialog(null, "Halo" +namaDepan+" "+namaTengah+" "+namaBelakang, "Ini Judul", JOptionPane.WARNING_MESSAGE);
    }
}
