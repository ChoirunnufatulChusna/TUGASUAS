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
public class Deleteuas {
    Koneksiuas status = new Koneksiuas();

    public void delete(int kb) {

        try {
            status.koneksi();
            java.sql.Statement statement = status.con.createStatement();
            String sql = "delete from barang where kode barang = '" + kb + "'";

            statement.executeUpdate(sql);
            statement.close();
            
            int hps = 0;
            JOptionPane.showConfirmDialog(null,"Apakah anda ingin menghapus data tersebut?");
            if(hps == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null, "Berhasil dihapus");
            }else{
        }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
