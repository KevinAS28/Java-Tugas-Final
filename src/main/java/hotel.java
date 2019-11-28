import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import koneksi.konek;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RPL
 */
public class hotel extends javax.swing.JFrame {

   
    public hotel() {
        initComponents();
        button_update.setEnabled(false);
        button_delete.setEnabled(false);
        datatabel();
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
        jLabel1 = new javax.swing.JLabel();
        text_nama = new javax.swing.JTextField();
        button_keluar = new javax.swing.JButton();
        combo_kode = new javax.swing.JComboBox();
        radio_superior = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        text_kembali = new javax.swing.JTextField();
        text_bayar = new javax.swing.JTextField();
        text_totalsewa = new javax.swing.JTextField();
        text_biayafasilitas = new javax.swing.JTextField();
        txtjenis = new javax.swing.JTextField();
        text_biayasewa = new javax.swing.JTextField();
        radio_suite = new javax.swing.JRadioButton();
        radio_deluxe = new javax.swing.JRadioButton();
        check_internet = new javax.swing.JCheckBox();
        check_tv = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        button_save = new javax.swing.JButton();
        button_delete = new javax.swing.JButton();
        button_update = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_hotel = new javax.swing.JTable();
        label32323 = new javax.swing.JLabel();
        text_id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel1.setText("Kasir Hotel");

        button_keluar.setText("Exit");
        button_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_keluarActionPerformed(evt);
            }
        });

        combo_kode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PILIH", "S001", "D001" }));
        combo_kode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_kodeActionPerformed(evt);
            }
        });

        buttonGroup1.add(radio_superior);
        radio_superior.setText("Superior");
        radio_superior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_superiorActionPerformed(evt);
            }
        });

        jLabel2.setText("Kode Kamar");

        jLabel3.setText("Jenis Kamar");

        jLabel4.setText("Nama Penyewa");

        jLabel5.setText("Tipe Kamar");

        jLabel6.setText("Fasilitas");

        jLabel7.setText("Total Sewa");

        jLabel8.setText("Biaya Fasilitas");

        jLabel9.setText("Bayar");

        jLabel10.setText("Biaya Sewa");

        jLabel11.setText("Kembali");

        text_kembali.setEnabled(false);

        text_bayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text_bayarKeyPressed(evt);
            }
        });

        text_totalsewa.setEnabled(false);

        text_biayafasilitas.setEnabled(false);

        txtjenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjenisActionPerformed(evt);
            }
        });

        text_biayasewa.setEnabled(false);
        text_biayasewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_biayasewaActionPerformed(evt);
            }
        });

        buttonGroup1.add(radio_suite);
        radio_suite.setText("Suite");
        radio_suite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_suiteActionPerformed(evt);
            }
        });

        buttonGroup1.add(radio_deluxe);
        radio_deluxe.setText("Deluxe");
        radio_deluxe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_deluxeActionPerformed(evt);
            }
        });

        check_internet.setText("Internet");
        check_internet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_internetActionPerformed(evt);
            }
        });

        check_tv.setText("TV Cable");
        check_tv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_tvActionPerformed(evt);
            }
        });

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        button_save.setText("Save");
        button_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_saveActionPerformed(evt);
            }
        });

        button_delete.setText("Delete");
        button_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_deleteActionPerformed(evt);
            }
        });

        button_update.setText("Update");
        button_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_updateActionPerformed(evt);
            }
        });

        tabel_hotel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel_hotel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_hotelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_hotel);

        label32323.setText("Id Penyewa");

        text_id.setEditable(false);
        text_id.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(check_internet)
                                    .addComponent(check_tv)
                                    .addComponent(radio_deluxe)
                                    .addComponent(radio_superior)
                                    .addComponent(radio_suite)
                                    .addComponent(txtjenis, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(label32323))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text_nama)
                                    .addComponent(combo_kode, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(text_id))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel11)
                                                .addComponent(jLabel10))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(15, 15, 15)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(text_biayasewa, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                            .addComponent(text_totalsewa, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(text_biayafasilitas, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(text_bayar, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(text_kembali, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(button_update)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(button_save))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(button_keluar))))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button_delete)
                                .addGap(116, 116, 116)))))
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_biayasewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(label32323)
                            .addComponent(text_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(text_biayafasilitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(text_totalsewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button_update)
                            .addComponent(button_save))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(button_keluar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(text_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(combo_kode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtjenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(radio_superior))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radio_deluxe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radio_suite)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(check_internet))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check_tv)))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void datatabel(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID Penyewa");
        tbl.addColumn("Nama Penyewa");
        tbl.addColumn("Kode Kamar");
        tbl.addColumn("Jenis Kamar");
        tbl.addColumn("Biaya Kamar");
        tbl.addColumn("Biaya Fasilitas");
        tbl.addColumn("Total Sewa");
        tbl.addColumn("Bayar");
        tbl.addColumn("Kembali");
        tabel_hotel.setModel(tbl);
        
        try{
            Statement input = (Statement) konek.getConnection().createStatement();
            ResultSet res = input.executeQuery("SELECT * FROM hotel");
            while(res.next())
            {
                tbl.addRow(new Object[] {
                res.getString("id"),
                res.getString("nama_penyewa"),
                res.getString("Kode_Kamar"),        
                res.getString("jenis_kamar"),
                res.getString("biaya_sewa"),
                res.getString("fasilitas_tambahan"),
                res.getString("total_sewa"),
                res.getString("bayar"),
                res.getString("kembali")
                }
                );
                tabel_hotel.setModel(tbl);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }
    
    private void radio_superiorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_superiorActionPerformed
        // TODO add your handling code here:
        radiobutton();
        check();
    }//GEN-LAST:event_radio_superiorActionPerformed

    private void radio_suiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_suiteActionPerformed
        // TODO add your handling code here:
        radiobutton();
        check();
    }//GEN-LAST:event_radio_suiteActionPerformed

    private void radio_deluxeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_deluxeActionPerformed
        // TODO add your handling code here:
        radiobutton();
        check();
    }//GEN-LAST:event_radio_deluxeActionPerformed

    private void txtjenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjenisActionPerformed

    private void combo_kodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_kodeActionPerformed
        // TODO add your handling code here:
        if (combo_kode.getSelectedItem()=="S001"){
            txtjenis.setText("Single Bed");
        } else if (combo_kode.getSelectedItem()=="D001"){
            txtjenis.setText("Double Bed");
        }
        radiobutton();
    }//GEN-LAST:event_combo_kodeActionPerformed

    private void check_internetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_internetActionPerformed
        // TODO add your handling code here:
        check();
    }//GEN-LAST:event_check_internetActionPerformed

    private void check_tvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_tvActionPerformed
        // TODO add your handling code here:
        check();
    }//GEN-LAST:event_check_tvActionPerformed

    private void text_bayarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_bayarKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()!=10) return;
        int bayar = Integer.parseInt(text_bayar.getText());
        int total_sewa = Integer.parseInt(text_totalsewa.getText());
        int jumlah = bayar-total_sewa;
        text_kembali.setText(String.valueOf(jumlah));
        
    }//GEN-LAST:event_text_bayarKeyPressed

    private void text_biayasewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_biayasewaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_biayasewaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        clear();
        datatabel();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void clear(){
        text_nama.setText("");
        txtjenis.setText("");
        text_id.setText("");
        buttonGroup1.clearSelection();
        check_internet.setSelected(false);
        check_tv.setSelected(false);
        text_bayar.setText("");
        text_biayafasilitas.setText("");
        text_biayasewa.setText("");
        text_bayar.setText("");
        text_kembali.setText("");
        text_totalsewa.setText("");
        combo_kode.setSelectedIndex(0);
        text_nama.requestFocus();
        datatabel();
    }
    
    private void button_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_keluarActionPerformed
        // TODO add your handling code here:
        int exit = JOptionPane.showConfirmDialog(null, "Do u want to exit? Just get out.", "Yash",JOptionPane.YES_NO_OPTION);
        if(exit == JOptionPane.YES_NO_OPTION){
            this.hide();
            new menu().show();
        }
    }//GEN-LAST:event_button_keluarActionPerformed

    private void button_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_saveActionPerformed
        // TODO add your handling code here:
        try{
        String sql = "INSERT INTO hotel(nama_penyewa,kode_kamar,jenis_kamar,biaya_sewa,fasilitas_tambahan,total_sewa,bayar,kembali) VALUES ('"+text_nama.getText()+"','"+combo_kode.getSelectedItem()+"','"+txtjenis.getText()+"','"+text_biayasewa.getText()+"','"+text_biayafasilitas.getText()+"','"+text_totalsewa.getText()+"','"+text_bayar.getText()+"','"+text_kembali.getText()+"')";
        java.sql.Connection conn=(Connection)konek.getConnection();
        java.sql.PreparedStatement pst=conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        clear();
    }//GEN-LAST:event_button_saveActionPerformed

    private void tabel_hotelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_hotelMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tabel_hotel.getModel();
        tabel_hotel.getSelectedRow();
        
        Object id_penyewa = model.getValueAt(tabel_hotel.getSelectedRow(),0);
        text_id.setText(String.valueOf(id_penyewa));
        
        Object Penyewa = model.getValueAt(tabel_hotel.getSelectedRow(),1 );
        text_nama.setText(String.valueOf(Penyewa));
        
        Object Kode_Kamar = model.getValueAt(tabel_hotel.getSelectedRow(),2);
        combo_kode.setSelectedItem(String.valueOf(Kode_Kamar));
        
        Object jenis_kamar = model.getValueAt(tabel_hotel.getSelectedRow(),3);
        txtjenis.setText(String.valueOf(jenis_kamar));
        
        Object biaya_kamar = model.getValueAt(tabel_hotel.getSelectedRow(),4);
        text_biayasewa.setText(String.valueOf(biaya_kamar));
        
        Object biaya_fasilitas = model.getValueAt(tabel_hotel.getSelectedRow(),5);
        text_biayafasilitas.setText(String.valueOf(biaya_fasilitas));
        
        Object total_sewa = model.getValueAt(tabel_hotel.getSelectedRow(),6);
        text_totalsewa.setText(String.valueOf(total_sewa));
        
        Object bayar = model.getValueAt(tabel_hotel.getSelectedRow(),7);
        text_bayar.setText(String.valueOf(bayar));
        
        Object kembali = model.getValueAt(tabel_hotel.getSelectedRow(),8);
        text_kembali.setText(String.valueOf(kembali));
        
        button_update.setEnabled(true);
        button_delete.setEnabled(true);
        button_save.setEnabled(false);
    }//GEN-LAST:event_tabel_hotelMouseClicked

    private void button_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_deleteActionPerformed
        // TODO add your handling code here:
        String id_penyewa = text_id.getText();
        String Penyewa = text_nama.getText();
        String Kode_Kamar = (String) combo_kode.getSelectedItem();
        String jenis_kamar = txtjenis.getText();
        String biaya_kamar = text_biayasewa.getText();
        String biaya_fasilitas = text_biayafasilitas.getText();
        String total_sewa = text_totalsewa.getText();
        String bayar = text_bayar.getText();
        String kembali = text_kembali.getText();
        try{
                Statement statement = (Statement) konek.getConnection().createStatement();
                statement.executeUpdate("DELETE FROM hotel  WHERE id='"+id_penyewa+"' ");
                JOptionPane.showMessageDialog(null, "Succesfull to delete this data");
                statement.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Failed to delete this data"+ e.getMessage());
            }
        datatabel();
        clear();
    }//GEN-LAST:event_button_deleteActionPerformed

    private void button_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_updateActionPerformed
        // TODO add your handling code here:
        if(button_update.getText()=="bedit"){
            text_id.requestFocus();
        }else{
            String id_penyewa = text_id.getText();
            String Penyewa = text_nama.getText();
            String Kode_Kamar = (String) combo_kode.getSelectedItem();
            String jenis_kamar = txtjenis.getText();
            String biaya_kamar = text_biayasewa.getText();
            String biaya_fasilitas = text_biayafasilitas.getText();
            String total_sewa = text_totalsewa.getText();
            String bayar = text_bayar.getText();
            String kembali = text_kembali.getText();
            try{
                Statement statement = (Statement) konek.getConnection().createStatement();
                statement.executeUpdate("UPDATE hotel SET nama_penyewa='"+Penyewa+"', Kode_Kamar='"+Kode_Kamar+"', jenis_kamar='"+jenis_kamar+"', biaya_sewa='"+biaya_kamar+"', fasilitas_tambahan='"+biaya_fasilitas+"', total_sewa='"+total_sewa+"', bayar='"+bayar+"', kembali='"+kembali+"' " + "WHERE id='"+id_penyewa+"' ");
                JOptionPane.showMessageDialog(null, "Data berhasil di Update");
                clear();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Data gagal di Update"+ e.getMessage());
            }
            datatabel();
        }
    }//GEN-LAST:event_button_updateActionPerformed
     
    public void radiobutton(){
        if(radio_superior.isSelected() && combo_kode.getSelectedItem()=="S001"){
            radio_deluxe.setSelected(false);
            radio_suite.setSelected(false);
            
            text_biayasewa.setText("1000000");
        } else if(radio_deluxe.isSelected() && combo_kode.getSelectedItem()=="S001"){
            radio_superior.setSelected(false);
            radio_suite.setSelected(false);
            
            text_biayasewa.setText("900000");
        } else if(radio_suite.isSelected() && combo_kode.getSelectedItem()=="S001"){
            radio_superior.setSelected(false);
            radio_deluxe.setSelected(false);
            
            text_biayasewa.setText("800000");
        } else if(radio_superior.isSelected() && combo_kode.getSelectedItem()=="D001"){
            radio_deluxe.setSelected(false);
            radio_suite.setSelected(false);
            
            text_biayasewa.setText("1200000");
        } else if(radio_deluxe.isSelected() && combo_kode.getSelectedItem()=="D001"){
            radio_superior.setSelected(false);
            radio_suite.setSelected(false);
            
            text_biayasewa.setText("1000000");
        } else if(radio_suite.isSelected() && combo_kode.getSelectedItem()=="D001"){
            radio_superior.setSelected(false);
            radio_deluxe.setSelected(false);
            
            text_biayasewa.setText("900000");
        }
        text_bayar.requestFocus();
    }
        public void check(){
            if(check_internet.isSelected()==true && check_tv.isSelected()==false){
                text_biayafasilitas.setText("200000");
            } else if(check_internet.isSelected()==false && check_tv.isSelected()==true){
                text_biayafasilitas.setText("100000");
            } else if(check_internet.isSelected()==true && check_tv.isSelected()==true){
                text_biayafasilitas.setText("300000");
            } else {
                text_biayafasilitas.setText("0");
            }
            int biaya_fasilitas = Integer.parseInt(text_biayafasilitas.getText());
            int biaya_sewa = Integer.parseInt(text_biayasewa.getText());
            int total = biaya_fasilitas + biaya_sewa;
            text_totalsewa.setText(String.valueOf(total));
        }
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
            java.util.logging.Logger.getLogger(hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hotel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton button_delete;
    private javax.swing.JButton button_keluar;
    private javax.swing.JButton button_save;
    private javax.swing.JButton button_update;
    private javax.swing.JCheckBox check_internet;
    private javax.swing.JCheckBox check_tv;
    private javax.swing.JComboBox combo_kode;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label32323;
    private javax.swing.JRadioButton radio_deluxe;
    private javax.swing.JRadioButton radio_suite;
    private javax.swing.JRadioButton radio_superior;
    private javax.swing.JTable tabel_hotel;
    private javax.swing.JTextField text_bayar;
    private javax.swing.JTextField text_biayafasilitas;
    private javax.swing.JTextField text_biayasewa;
    private javax.swing.JTextField text_id;
    private javax.swing.JTextField text_kembali;
    private javax.swing.JTextField text_nama;
    private javax.swing.JTextField text_totalsewa;
    private javax.swing.JTextField txtjenis;
    // End of variables declaration//GEN-END:variables
}