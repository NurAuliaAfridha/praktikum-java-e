package pertemuan.ke2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) throws ParseException {
        Mahasiswa mhs = new Mahasiswa();
        SimpleDateFormat formatTanggal = new SimpleDateFormat("dd-MM-yyyy");

        mhs.npm = "19630410";
        mhs.nama = "Nur Aulia Afridha";
        mhs.tanggalLahir = formatTanggal.parse("27-04-2001");

        System.out.println("NPM "+mhs.npm);
        System.out.println("NAMA "+mhs.nama);
        System.out.println("TANGGAL LAHIR "+ formatTanggal.format(mhs.tanggalLahir));


        System.out.println("=========================================================================");

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.npm = "19630004";
        mhs2.nama = "Nadia";
        mhs2.tanggalLahir = formatTanggal.parse("17-09-1999");

        System.out.println("NPM "+mhs2.npm);
        System.out.println("NAMA "+mhs2.nama);
        System.out.println("TANGGAL LAHIR "+ formatTanggal.format(mhs2.tanggalLahir));

        System.out.println("=========================================================================");
        System.out.println("Ini yang menggunakan method");
        System.out.println("=========================================================================");

        mhs.tampilkanIdentitasDiri();
        mhs2.tampilkanIdentitasDiri();
    }
}
