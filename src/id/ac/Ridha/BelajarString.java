package id.ac.Ridha;

import java.util.Locale;

public class BelajarString {
    public static void main(String[] args) {
        char[] uniskaChar = {'U', 'N', 'I', 'S', 'K', 'A'};
        String uniskaString = new String(uniskaChar);
        System.out.println(uniskaString);

        //################################################################

        String namaDepan    = "Nur";
        String namaTengah   = "Aulia";
        String namaBelakang = "Afridha";

        String namaLengkap = namaDepan + " "+namaTengah+" "+ namaBelakang;

        System.out.println(namaLengkap.length());
        System.out.println(namaBelakang.indexOf("NIS"));
        System.out.println(namaLengkap.substring(5));
        System.out.println(namaLengkap.substring(5, 12));
        System.out.println(namaLengkap.replace("Nur", "Nura"));
        System.out.println(namaLengkap.toUpperCase());
        System.out.println(namaLengkap.toLowerCase());
        System.out.println(namaLengkap.charAt(6));

        String[] namaArray = namaLengkap.split(" ");
        for (String nama : namaArray)
        {
            System.out.println(nama);
        }

    }
}
