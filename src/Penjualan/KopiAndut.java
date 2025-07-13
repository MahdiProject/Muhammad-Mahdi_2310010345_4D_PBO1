package Penjualan;

public class KopiAndut {
    //Atribut untuk menyimpan nama kopi
    private String namaKopi;
    
    //atribut untuk menyimpan ukuran kopi 
    private String ukuran;

    //construktor untuk menginisialisai nama kopi dan ukuran nanti
    public KopiAndut(String namaKopi, String ukuran) {
        this.namaKopi = namaKopi;
        this.ukuran = ukuran;
    }

    //setter untuk mengubah nama kopi setelah objek dibuat nanti
    public void setNamaKopi(String namaKopi) {
        this.namaKopi = namaKopi;
    }

    //setter untuk mengubah ukuran kopi setelah objek dibuat nanti
    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    //getter untuk mendapatkan nama kopi
    public String getNamaKopi() {
        return namaKopi;
    }

    //getter untuk mendapatkan ukuran kopi
    public String getUkuran() {
        return ukuran;
    }
    
    public String displayInfo(){
        return "Nama Kopi: "+ getNamaKopi()+
                "\nUkuran: "+ getUkuran();
    }
    
}
