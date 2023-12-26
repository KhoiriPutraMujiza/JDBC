public class Pelanggan implements SupermarketKhoiri {
    public String NamaPelanggan;
    public String Alamat;
    public String NoHp;

    public Pelanggan(String NamaPelanggan, String Alamat, String NoHp){
        this.NamaPelanggan=NamaPelanggan;
        this.Alamat=Alamat;
        this.NoHp=NoHp;
    }

    @Override
    public void cetakStruk(){

    }

    @Override
    public Integer TotalBayar() {
        throw new UnsupportedOperationException("Unimplemented method 'TotalBayar'");
    }
   
}
