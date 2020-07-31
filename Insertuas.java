/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chusna_1855201016;

import pertemuan10.*;
import java.beans.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class Insertuas {

    Koneksiuas status = new Koneksiuas();

    public void insert(int kb, String nb, String hrg, String jmlh) {

        try {
            status.koneksi();
            java.sql.Statement statement = status.con.createStatement();
            String sql = "insert into barang values('" + kb + "','" + nb + "','" + hrg + "','"+ jmlh + "')";

            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
