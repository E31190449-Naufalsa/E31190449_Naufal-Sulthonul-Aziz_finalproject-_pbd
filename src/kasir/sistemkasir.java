/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
/**
 *
 * @author naufalsa
 */
public class sistemkasir extends javax.swing.JFrame {

    /**
     * Creates new form sistemkasir
     */
    public sistemkasir() {
        initComponents();
        listNamaBrg();
        setTitle("sistem kasir toko via");
    }
    
    private void listNamaBrg(){
        try {
            Connection conn = koneksi.configDB();
            Statement st = conn.createStatement();
            String sql = "select nama_barang from barang order by nama_barang asc";
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()){
                Object[] o = new Object[1];
                o[0] = rs.getString(1);
                namabarang.addItem((String) o[0]);
                
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal terhubung ke database:\n"+e.getMessage(), "Error", 0); //perintah menampilkan error pada koneksi
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        harga = new javax.swing.JTextField();
        angka2 = new javax.swing.JTextField();
        bayar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        kembalian = new javax.swing.JTextField();
        namabarang = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nama Barang");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 130, 200, 37);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Harga Barang");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 180, 190, 37);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Jumlah Barang");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 230, 200, 37);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Uang Yang Dibayar");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 280, 260, 37);
        getContentPane().add(harga);
        harga.setBounds(370, 190, 140, 30);

        angka2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        angka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka2ActionPerformed(evt);
            }
        });
        getContentPane().add(angka2);
        angka2.setBounds(370, 240, 140, 30);

        bayar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(bayar);
        bayar.setBounds(370, 280, 140, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Hitung");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(760, 150, 90, 31);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Ulang");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(760, 200, 90, 31);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Keluar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(760, 250, 90, 31);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setText("Total Belanja");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(520, 390, 130, 25);

        total.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(total);
        total.setBounds(530, 420, 110, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setText("Uang Kembalian");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(730, 390, 160, 25);

        kembalian.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(kembalian);
        kembalian.setBounds(750, 420, 110, 40);

        namabarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih..." }));
        namabarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namabarangActionPerformed(evt);
            }
        });
        getContentPane().add(namabarang);
        namabarang.setBounds(370, 140, 140, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 110, 510, 220);

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(720, 110, 160, 220);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("kembali");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(800, 50, 93, 31);

        jPanel4.setBackground(new java.awt.Color(255, 255, 51));

        jPanel8.setBackground(new java.awt.Color(255, 255, 51));
        jPanel4.add(jPanel8);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(530, 110, 190, 220);

        jPanel7.setBackground(new java.awt.Color(255, 255, 51));
        getContentPane().add(jPanel7);
        jPanel7.setBounds(0, 50, 890, 60);

        jPanel9.setBackground(new java.awt.Color(255, 255, 0));
        getContentPane().add(jPanel9);
        jPanel9.setBounds(0, 330, 890, 160);

        jPanel10.setBackground(new java.awt.Color(255, 255, 0));
        getContentPane().add(jPanel10);
        jPanel10.setBounds(450, 110, 10, 220);

        jPanel11.setBackground(new java.awt.Color(255, 255, 0));
        getContentPane().add(jPanel11);
        jPanel11.setBounds(880, 110, 10, 220);

        jPanel12.setBackground(new java.awt.Color(255, 255, 0));
        getContentPane().add(jPanel12);
        jPanel12.setBounds(0, 110, 20, 220);

        jPanel14.setBackground(new java.awt.Color(51, 0, 255));

        jLabel3.setBackground(new java.awt.Color(51, 0, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SISTEM KASIR TOKO SEMBAKO VIA");
        jPanel14.add(jLabel3);

        getContentPane().add(jPanel14);
        jPanel14.setBounds(0, 0, 890, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int totaljumlah = Integer.parseInt(harga.getText()) * Integer.parseInt(angka2.getText());
        total.setText(""+totaljumlah);
        
        int kembalianjumlah = Integer.parseInt(bayar.getText()) - Integer.parseInt(total.getText());
        kembalian.setText(""+kembalianjumlah);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        namabarang.setSelectedItem(0);
        harga.setText("");
        angka2.setText("");
        bayar.setText("");
        total.setText("");
        kembalian.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void angka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_angka2ActionPerformed

    private void namabarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namabarangActionPerformed
        try {
            Connection conn = koneksi.configDB();
            Statement st = conn.createStatement();
            String sql = "select harga from barang where nama_barang = '" + namabarang.getSelectedItem() + "'";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                Object[] o = new Object[1];
                o[0] = rs.getString(1);
                harga.setText((String) o[0]);
                
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal terhubung ke database:\n"+e.getMessage(), "Error", 0); //perintah menampilkan error pada koneksi
        }
    }//GEN-LAST:event_namabarangActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        menuutama au = new menuutama();
        au.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(sistemkasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sistemkasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sistemkasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sistemkasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sistemkasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField angka2;
    private javax.swing.JTextField bayar;
    private javax.swing.JTextField harga;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField kembalian;
    private javax.swing.JComboBox<String> namabarang;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}