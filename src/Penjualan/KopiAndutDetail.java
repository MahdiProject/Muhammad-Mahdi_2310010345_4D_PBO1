package Penjualan;

//class KopiAndutDetail mewarisi Kopi andut dan menambahkan fitur harga berdasarkan ukuran kopinya 
public class KopiAndutDetail extends KopiAndut {

    //constructor untuk menginisialisasi nama kopi dan ukuran sekaligus
    public KopiAndutDetail(String namaKopi, String ukuran) {
        super(namaKopi, ukuran);
    }
    
    //method untuk mendapatkan harga berdasarkan ukuran kopinya
    public double getHargaByUkuran(){
        //menggunakan swith-case untuk menentukan harga berdasarkan ukuran
        switch (getUkuran().toLowerCase()){
            case "small":
                return 12000;
            case "medium":
                return 15000;
            case "Large":
                return 17000;
            default:
                return 0; //jika ukuran tidak valid maka harga dianggap 0
        }
    }
    //override method displayinfo untuk menambahkan informasi harga nanti
    @Override
    public String displayInfo(){
        //memanggil displayinfo dari induk dan menambahkan informasi harganya
        return super.displayInfo()+
                "\nHarga Berdasarkan Ukuran: Rp"+getHargaByUkuran();
    }
}
