/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chusna_1855201016;

import pertemuan10.*;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class updateuas {

    Koneksiuas konek = new Koneksiuas();

    public void update(int kb, String nb, String hrg, String jmlh) {

        try {
            konek.koneksi();
            java.sql.Statement statement = konek.con.createStatement();

            String sql_nama = "update tabel set nama = '" + nb + "'where kb = '" + kb + "'";
            String sql_alamat = "update tabel set harga = '" + hrg + "'where kb = '" + kb + "'";
            String sql_jk = "update tabel set jumlah = '" + jmlh + "'where kb = '" + kb + "'";
            String sql_nim1 = "update tabel set kodebarang = '" + kb + "'where nb = '" + nb + "'";
            String sql_nim2 = "update tabel set kodebarang = '" + kb + "'where hrg = '" + hrg + "'";

            statement.executeUpdate(sql_nim1);
            statement.executeUpdate(sql_nim2);
            statement.executeUpdate(sql_nama);
            statement.executeUpdate(sql_alamat);
            statement.executeUpdate(sql_jk);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
