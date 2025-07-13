package Penjualan;

import java.util.ArrayList;
import java.util.Scanner;

// Class KopiAndutBeraksi berfungsi untuk menjalankan program utama
public class KopiAndutBeraksi {
    public static void main(String[] args) {
        try {
            // Membuat objek scanner untuk input data dari user
            Scanner scanner = new Scanner(System.in);
            // ArrayList untuk menyimpan objek kopi yang dipesan
            ArrayList<KopiAndutDetail> kopiList = new ArrayList<>();
            // ArrayList untuk menyimpan jumlah beli tiap kopi
            ArrayList<Integer> jumlahBeliList = new ArrayList<>();
            // Variabel untuk menyimpan total harga seluruh kopi
            double totalHarga = 0;

            // Menggunakan loop while untuk input data tanpa batas hingga user mengetik ENTER kosong
            while (true) {
                // Meminta user memasukkan nama kopi
                System.out.print("Masukkan Nama Kopi (atau tekan ENTER untuk selesai) : ");
                String namaKopi = scanner.nextLine();
                // Jika input kosong, keluar dari loop
                if (namaKopi.isEmpty()) {
                    break; // Mengakhiri input jika user tidak memasukkan nama
                }

                // Meminta user memasukkan ukuran kopi
                System.out.print("Masukkan Ukuran Kopi (Small/Medium/Large) : ");
                String ukuran = scanner.nextLine();

                // Validasi ukuran kopi, jika salah maka dianggap Small
                if (!ukuran.equalsIgnoreCase("Small") &&
                    !ukuran.equalsIgnoreCase("Medium") &&
                    !ukuran.equalsIgnoreCase("Large")) {
                    System.out.println("Ukuran tidak valid. Otomatis dianggap Small.");
                    ukuran = "Small";
                }

                // Meminta user memasukkan jumlah beli
                System.out.print("Masukkan Jumlah Beli Kopi : ");
                int jumlahBeli = Integer.parseInt(scanner.nextLine());

                // Menambahkan objek kopi dan jumlah beli ke dalam ArrayList
                kopiList.add(new KopiAndutDetail(namaKopi, ukuran));
                jumlahBeliList.add(jumlahBeli);
            }

            // Menampilkan semua data kopi yang telah diinput
            System.out.println("========================");
            for (int i = 0; i < kopiList.size(); i++) {
                // Mengambil data kopi dan jumlah beli dari ArrayList
                KopiAndutDetail kopi = kopiList.get(i);
                int jumlahBeli = jumlahBeliList.get(i);
                // Menghitung total harga untuk kopi ini
                double totalHargaPerKopi = kopi.getHargaByUkuran() * jumlahBeli;
                totalHarga += totalHargaPerKopi; // Menambahkan ke total keseluruhan

                // Menampilkan detail kopi dan harga
                System.out.println(kopi.displayInfo());
                System.out.println("Jumlah Beli: " + jumlahBeli);
                System.out.println("Total Harga untuk Kopi Ini: Rp" + totalHargaPerKopi);
                System.out.println("------------------------");
            }

            // Menampilkan total harga semua kopi yang dibeli
            System.out.println("Grand Total Harga Semua Kopi: Rp" + totalHarga);

        } catch (Exception e) {
            // Menangkap semua kesalahan umum, misalnya input tidak sesuai format angka
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
