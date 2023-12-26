import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Penjualan extends Pelanggan {
    static Integer KodeBarang = 1;
    String NamaBarang;
    Integer HargaBarang;
    Integer JumlahBeli;
    Integer TotalBayar;
    String Kasir;
    
    public Penjualan(String Kasir, String NamaPelanggan, String Alamat, String NoHp, String NamaBarang, Integer HargaBarang, Integer JumlahBeli){
        super(NamaPelanggan,Alamat,NoHp);
        this.Kasir=Kasir;
        this.NamaBarang=NamaBarang;
        this.HargaBarang=HargaBarang;
        this.JumlahBeli=JumlahBeli;
        TotalBayar=HargaBarang * JumlahBeli;
        cetakStruk();  
    }

    @Override
    public void cetakStruk(){
        System.out.println("---------------------------------------------------");
        System.out.println("                   KHOIRI MART " );
            Date tanggalSekarang = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd MMMM yyyy");
        String tanggalTerformat = sdf.format(tanggalSekarang);
        System.out.println("Tanggal       : " + tanggalTerformat);
            Date waktuSekarang = new Date();
             SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
        String waktuTerformat = sdf.format(waktuSekarang);
        System.out.println("Waktu         : " + sdf2.format(waktuSekarang) + " WIB");
        System.out.println("===================================================");
        System.out.println("                  DATA PELANGGAN              ");
        System.out.println("---------------------------------------------------");
        System.out.println("Nama Pelanggan: " + NamaPelanggan);
        System.out.println("No.HP         : " + NoHp);
        System.out.println("Alamat        : " + Alamat);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("              DATA PEMBELIAN BARANG              ");
        System.out.println("---------------------------------------------------");
        System.out.println("Kode Barang   : KMB" + KodeBarang);
        System.out.println("Nama Barang   : " + NamaBarang);
        System.out.println("Harga Barang  : Rp." + HargaBarang);
        System.out.println("Jumlah Beli   : " + JumlahBeli + " Buah");
        System.out.println("Total Bayar   : Rp." + TotalBayar );
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Kasir         : " + Kasir );
    }
}
