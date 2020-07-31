 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chusna_1855201016;

import pertemuan10.*;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class Koneksiuas {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       Koneksiuas teskoneksi = new Koneksiuas(); 
       teskoneksi.koneksi();
    }
    
    Connection con=null;
    String statuskoneksi;
    public void koneksi()
    {
        try
        {
            String connectionURL = "jdbc:mysql://localhost/uaschusna";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(connectionURL, username, password);
            //JOptionPane.showMessageDialog(null, "Sukses Koneksiuas");
            statuskoneksi = "Berhasil";
        }

        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, e);
        statuskoneksi = "Gagal";
        System.exit(0);
        }
    }
    }

