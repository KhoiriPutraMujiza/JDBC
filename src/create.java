import java.sql.*;
import java.util.*;

public class create{

    private static final String URL = "jdbc:mysql://localhost:3306/pegawai";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void insertEmployeeData(Scanner scanNEW) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "INSERT INTO anggota (Id_Pegawai, Nama_Pegawai, Pass_Pegawai) VALUES (?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                System.out.println("MEMBUAT DATA PEGAWAI BARU");
                System.out.println("===================================================");

                System.out.print("Masukkan ID Baru      : ");
                int idValue = scanNEW.nextInt();

                System.out.print("Masukkan Nama Pegawai : ");
                String usernameValue = scanNEW.next();

                System.out.print("Masukkan Password     : ");
                String passwordValue = scanNEW.next();

                preparedStatement.setInt(1, idValue);
                preparedStatement.setString(2, usernameValue);
                preparedStatement.setString(3, passwordValue);

                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Berhasil Menambahkan Data");
                } else {
                    System.out.println("Silahkan Inputkan Kembali Data");
                }

                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}