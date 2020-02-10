/*
 * PROGRAM KKP Perpustakaan SMK Perintis 1 Depok
 * Created by:
 * 1. Muhammad Ilham Sunardi
 * 2. Muhammad Alwi
 * Do not copy without permission !
 */
package projectKKP.main;
import java.sql.*;

public class koneksi {
    private Connection konek;
    public Connection connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Berhasil Koneksi");
        } catch (ClassNotFoundException e) {
            System.out.println("Gagal Koneksi"+e);
        }
            
        String url = "jdbc:mysql://localhost:3306/perpuskkp";
        
        try {
            konek = DriverManager.getConnection(url,"root","");
            System.out.println("Berhasil Koneksi Database !");
        } catch (SQLException e) {
            System.out.println(e);
        }
        return konek;
    }
}
