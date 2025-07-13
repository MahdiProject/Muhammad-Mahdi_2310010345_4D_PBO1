# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data pemesanan kopi menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama kopi, ukuran kopi, dan jumlah beli, lalu memberikan output berupa informasi detail dari kopi tersebut beserta total harga yang harus dibayar.
Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overriding, Seleksi, Perulangan, IO Sederhana, ArrayList, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `KopiAndut`, `KopiAndutDetail`, dan `KopiAndutBeraksi` adalah contoh dari class.

```bash
public class KopiAndut {
    ...
}

public class KopiAndutDetail extends KopiAndut {
    ...
}

public class KopiAndutBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `kopiList.add(new KopiAndutDetail(...))` adalah contoh pembuatan object.

```bash
kopiList.add(new KopiAndutDetail(namaKopi, ukuran));
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `namaKopi` dan `ukuran` adalah contoh atribut.

```bash
String namaKopi;
String ukuran;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `KopiAndut` dan `KopiAndutDetail`.

```bash
public KopiAndut(String namaKopi, String ukuran) {
    this.namaKopi = namaKopi;
    this.ukuran = ukuran;
}

public KopiAndutDetail(String namaKopi, String ukuran) {
    super(namaKopi, ukuran);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNamaKopi` dan `setUkuran` adalah contoh method mutator.

```bash
public void setNamaKopi(String namaKopi) {
    this.namaKopi = namaKopi;
}

public void setUkuran(String ukuran) {
    this.ukuran = ukuran;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNamaKopi`, `getUkuran` adalah contoh method accessor.

```bash
public String getNamaKopi() {
    return namaKopi;
}

public String getUkuran() {
    return ukuran;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `namaKopi` dan `ukuran` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String namaKopi;
private String ukuran;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `KopiAndutDetail` mewarisi `KopiAndut` dengan sintaks `extends`.

```bash
public class KopiAndutDetail extends KopiAndut {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Mahasiswa` merupakan overloading method `displayInfo` dan `displayInfo` di `MahasiswaDetail` merupakan override dari method `displayInfo` di `Mahasiswa`.

```bash
public String displayInfo() {
    \nHarga Berdasarkan Ukuran: Rp"+getHargaByUkuran();
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `switch` dalam method `getHargaByUkuran`.

```bash
switch (getUkuran().toLowerCase()) {
    case "small":
        return 10000;
    ...
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `while` dan `for` untuk meminta input dan menampilkan data.

```bash
while (true) {
    ...
}
for (int i = 0; i < kopiList.size(); i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.println("Grand Total Harga Semua Kopi: Rp" + totalHarga);
```

13. **ArrayList** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `kopiList` dan `jumlahBeliList` adalah contoh penggunaan ArrayList.

```bash
ArrayList<KopiAndutDetail> kopiList = new ArrayList<>();
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("Terjadi kesalahan: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Mahdi
NPM: 2310010345
