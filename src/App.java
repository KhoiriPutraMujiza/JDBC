import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String k = "Lanjut";
        Integer HargaBarang = 0;
        Integer JumlahBeli = 0;
        
        // Update
        Scanner scanner = new Scanner(System.in);
        update.updateEmployeeCredentials(scanner);
        System.out.println("");

        // Create
        Scanner scanNEW = new Scanner(System.in);
        create.insertEmployeeData(scanNEW);
        System.out.println("");

        // Delete
        delete.deleteEmployeeById();
        System.out.println("");

        LoginKhoiri KM = new LoginKhoiri();
        while(k.equals("Lanjut")){
            boolean input = false;
            Scanner khoiri1 = new Scanner(System.in);
            Scanner pur = new Scanner(System.in);
            System.out.print("Kasir            : ");
            String Kasir= khoiri1.nextLine();
            System.out.print("Nama Pelanggan   : ");
            String NamaPelanggan = khoiri1.nextLine();
            System.out.print("Alamat           : ");
            String Alamat = khoiri1.next();
            System.out.print("No HP            : ");
            String NoHp= khoiri1.next();
            System.out.print("Nama Barang      : ");
            String NamaBarang = khoiri1.next();

                do{
                    try {
                        System.out.print("Harga Barang     : ");
                        HargaBarang = pur.nextInt();
                        input = true;
                    } catch (InputMismatchException e) {
                    System.out.println("Input yang dimasukkan bukan bilangan bulat.");
                    pur.next();}
                }while(!input); 
            input = false;
                do{
                    try {
                        System.out.print("Jumlah Beli      : ");
                        JumlahBeli = pur.nextInt();
                        input = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Input yang dimasukkan bukan bilangan bulat.");
                        pur.next();}
                }while(!input);
            
            Penjualan khoiri  = new Penjualan(Kasir, NamaPelanggan, Alamat, NoHp, NamaBarang, HargaBarang, JumlahBeli);

            Scanner khoiri2 = new Scanner(System.in);
            System.out.println();
            System.out.println();
            System.out.println("ketik Lanjut untuk melanjutkan");
            k = khoiri2.next();
            System.out.println();
        }
    }
}
