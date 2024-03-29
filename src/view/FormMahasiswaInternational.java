/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import entity.EntitasMahasiswa;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FormMahasiswaInternational extends javax.swing.JFrame {
    private DefaultTableModel dataMahasiswa;
    private EntitasMahasiswa entity;
    
   
    public FormMahasiswaInternational() {
     initComponents();
     String [] headerTabel = new String []{
     "NIM", "NAMA", "KELAS", "JURUSAN", "TAHUN AKADEMIK", "SPP TETAP", "SPP VARIABEL", 
     "JUMLAH SKS", "STUDY", "TOTAL BAYAR"};
     dataMahasiswa = new DefaultTableModel(null, headerTabel);
     tblMahasiswa.setModel(dataMahasiswa);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Nim = new javax.swing.JTextField();
        Nama = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Jurusan = new javax.swing.JComboBox();
        Kelas = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        var = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tetap = new javax.swing.JTextField();
        sks = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ganjil = new javax.swing.JRadioButton();
        genap = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        study = new javax.swing.JTextField();
        Simpan = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMahasiswa = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FORM MAHASISWA INTERNATIONAL");
        setBackground(new java.awt.Color(102, 51, 255));

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INPUT FORM PEMBAYARAN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NIM");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 31, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NAMA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 80, -1, -1));

        Nim.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Nim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NimActionPerformed(evt);
            }
        });
        jPanel1.add(Nim, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 28, 120, -1));

        Nama.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(Nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 80, 181, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("JURUSAN");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 184, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("KELAS");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 129, -1, -1));

        Jurusan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Jurusan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "S1 - Sistem Informasi", "S1 - Teknik Informatika", "D3 - Manajemen Informatika", "D3 - Teknik Informatika" }));
        jPanel1.add(Jurusan, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 182, -1, -1));

        Kelas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Kelas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09" }));
        jPanel1.add(Kelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 127, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SPP VARIABEL");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 83, -1, -1));
        jPanel1.add(var, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 83, 120, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("SPP TETAP");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 31, -1, -1));
        jPanel1.add(tetap, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 31, 120, -1));
        jPanel1.add(sks, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 129, 53, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("SKS");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 129, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("TAHUN AKADEMIK");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 242, -1, -1));

        buttonGroup1.add(ganjil);
        ganjil.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ganjil.setForeground(new java.awt.Color(255, 255, 255));
        ganjil.setText("Ganjil");
        ganjil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ganjilActionPerformed(evt);
            }
        });
        jPanel1.add(ganjil, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 238, -1, -1));

        buttonGroup1.add(genap);
        genap.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        genap.setForeground(new java.awt.Color(255, 255, 255));
        genap.setText("Genap");
        jPanel1.add(genap, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 238, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("STUDY");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 184, -1, -1));
        jPanel1.add(study, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 184, 120, -1));

        Simpan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/02.png"))); // NOI18N
        Simpan.setText("Simpan");
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });
        jPanel1.add(Simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 184, -1, -1));

        Hapus.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/05.png"))); // NOI18N
        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        jPanel1.add(Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 220, 99, -1));

        Logout.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/06.png"))); // NOI18N
        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        jPanel1.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 256, 99, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/mhs.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 28, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 51, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TABEL PENYIMPANAN DATA PEMBAYARAN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setToolTipText("");

        tblMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
            }
        ));
        jScrollPane1.setViewportView(tblMahasiswa);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 990, 660));

        jPanel4.setBackground(new java.awt.Color(0, 51, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Logo Amikom.png"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 16, -1, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FORM PEMBAYARAN SPP MAHASISWA INTERNATIONAL");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jLabel11.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("UNIVERSITAS AMIKOM YOGYAKARTA");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1014, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(831, 831, 831)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("INPUT DATA PEMBAYARAN");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
        entity= new EntitasMahasiswa();
        entity.setNamaa(Nama.getText());
        entity.setNimm(Nim.getText());
        entity.setTetapp(Integer.parseInt(tetap.getText()));
        entity.setSkss(Integer.parseInt(sks.getText()));
        entity.setVariabel(Integer.parseInt(var.getText()));
        entity.setStudyy(Integer.parseInt(study.getText()));
        entity.setNilai(entity.getTetapp()+(entity.getVariabel()*entity.getSkss())+
                entity.getStudyy());
        entity.setHasil(String.valueOf(entity.getNilai()));
        
        if(ganjil.isSelected()){
            entity.setTahun("Ganjil");
        } else{
            entity.setTahun("Genap");
        }
        
        dataMahasiswa.addRow(new Object[]{
            entity.getNimm(),
            entity.getNamaa(),
            Kelas.getSelectedItem(),
            Jurusan.getSelectedItem(),
            entity.getTahun(),
            entity.getTetapp(),
            entity.getVariabel(),
            entity.getSkss(),
            entity.getStudyy(),
            entity.getHasil(),
            });
    }//GEN-LAST:event_SimpanActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        // TODO add your handling code here:
        int baris = tblMahasiswa.getSelectedRow();
        dataMahasiswa.removeRow(baris);
    }//GEN-LAST:event_HapusActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
      JOptionPane.showMessageDialog(null, "Anda Berhasil Logout");
            FormLogin form = new FormLogin();
            form.setVisible(true);
            this.dispose();    
    }//GEN-LAST:event_LogoutActionPerformed

    private void NimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NimActionPerformed

    private void ganjilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ganjilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ganjilActionPerformed

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
            java.util.logging.Logger.getLogger(FormMahasiswaInternational.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswaInternational.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswaInternational.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswaInternational.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMahasiswaInternational().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hapus;
    private javax.swing.JComboBox Jurusan;
    private javax.swing.JComboBox Kelas;
    private javax.swing.JButton Logout;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField Nim;
    private javax.swing.JButton Simpan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton ganjil;
    private javax.swing.JRadioButton genap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField sks;
    private javax.swing.JTextField study;
    private javax.swing.JTable tblMahasiswa;
    private javax.swing.JTextField tetap;
    private javax.swing.JTextField var;
    // End of variables declaration//GEN-END:variables


    
}
