
import com.mysql.jdbc.Messages;
import javax.swing.JOptionPane;
import koneksi.konek;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author RPL
 */
public class Khursus extends javax.swing.JFrame {
    public Khursus() {
        initComponents();
        nonaktif();
        datatable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbf = new javax.swing.JTextField();
        jnk = new javax.swing.JTextField();
        jbh = new javax.swing.JComboBox();
        jjk = new javax.swing.JComboBox();
        rb_pagi = new javax.swing.JRadioButton();
        rb_malam = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jnp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jbk = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtp = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cb_internet = new javax.swing.JCheckBox();
        cb_konsumsi = new javax.swing.JCheckBox();
        bprocess = new javax.swing.JButton();
        bclear = new javax.swing.JButton();
        bexit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        bclear1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Kasir Khursus");

        jLabel2.setText("No Pendaftaran");

        jLabel3.setText("Jenis Khursus");

        jLabel4.setText("Nama Khursus");

        jLabel5.setText("Waktu Khursus");

        jLabel6.setText("Beberapa Hari");

        jbf.setEditable(false);

        jnk.setEditable(false);

        jbh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7" }));
        jbh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbhActionPerformed(evt);
            }
        });

        jjk.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "U001", "P001" }));
        jjk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jjk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jjkActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_pagi);
        rb_pagi.setText("PAGI");
        rb_pagi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rb_pagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_pagiActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_malam);
        rb_malam.setText("MALAM");
        rb_malam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rb_malam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_malamActionPerformed(evt);
            }
        });

        jLabel7.setText("Biaya Khursus");

        jLabel8.setText("Biaya Fasilitas");

        jbk.setEditable(false);

        jLabel9.setText("Total  Pembayaran");

        jtp.setEditable(false);

        jLabel10.setText("Fasiltas");

        cb_internet.setText("INTERNET");
        cb_internet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cb_internet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_internetActionPerformed(evt);
            }
        });

        cb_konsumsi.setText("KONSUMSI");
        cb_konsumsi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cb_konsumsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_konsumsiActionPerformed(evt);
            }
        });

        bprocess.setText("PROCESS");
        bprocess.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bprocess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bprocessActionPerformed(evt);
            }
        });

        bclear.setText("DELETE");
        bclear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bclearActionPerformed(evt);
            }
        });

        bexit.setText("EXIT");
        bexit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bexitActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jLabel11.setText("Cari");

        bclear1.setText("EDIT");
        bclear1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bclear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bclear1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bexit)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(268, 268, 268))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jnp, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbh, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rb_pagi)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rb_malam))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jnk, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jjk, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(185, 185, 185)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(cb_internet)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cb_konsumsi))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jbf, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jtp, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jbk, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bprocess)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bclear)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bclear1)))
                                .addGap(38, 38, 38))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(255, 255, 255))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jnp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jjk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jbf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jnk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rb_pagi)
                    .addComponent(rb_malam)
                    .addComponent(jLabel10)
                    .addComponent(cb_internet)
                    .addComponent(cb_konsumsi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jbh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bprocess)
                    .addComponent(bclear)
                    .addComponent(bclear1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bexit))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nonaktif() {
        rb_pagi.setEnabled(false);
        rb_malam.setEnabled(false);
        cb_internet.setEnabled(false);
        cb_konsumsi.setEnabled(false);
    }
    
    private void datatable(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("No Pendaftaran");
        tbl.addColumn("Jenis Kursus");
        tbl.addColumn("Nama Kursus");
        tbl.addColumn("Hari");
        tbl.addColumn("Biaya Pendaftaran");
        tbl.addColumn("Biaya Fasilitas");
        tbl.addColumn("Total Pembayaran");
        
        jTable.setModel(tbl);
        
        
        
        try{
            Statement statement = (Statement)konek.getConnection().createStatement();
            
            ResultSet res = statement.executeQuery("SELECT * FROM komputer");
            while(res.next()){
                tbl.addRow(new Object[] {
                    res.getString("no_pendaftaran"),
                    res.getString("jenis_kursus"),
                    res.getString("nama_kursus"),
                    res.getString("hari"),
                    res.getString("biaya_pendaftaran"),
                    res.getString("biaya_fasilitas"),
                    res.getString("total_pembayaran")
                });
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void cari(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("No Pendaftaran");
        tbl.addColumn("Jenis Kursus");
        tbl.addColumn("Nama Kursus");
        tbl.addColumn("Hari");
        tbl.addColumn("Biaya Pendaftaran");
        tbl.addColumn("Biaya Fasilitas");
        tbl.addColumn("Total Pembayaran");
        
        jTable.setModel(tbl);
        
        
        
        try{
            Statement statement = (Statement)konek.getConnection().createStatement();
            
            ResultSet res = statement.executeQuery("SELECT * FROM komputer WHERE no_pendaftaran"+jnp.getText());
            while(res.next()){
                tbl.addRow(new Object[] {
                    res.getString("no_pendaftaran"),
                    res.getString("jenis_kursus"),
                    res.getString("nama_kursus"),
                    res.getString("hari"),
                    res.getString("biaya_pendaftaran"),
                    res.getString("biaya_fasilitas"),
                    res.getString("total_pembayaran")
                });
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void aktif() {
        rb_pagi.setEnabled(true);
        rb_malam.setEnabled(true);
        cb_internet.setEnabled(true);
        cb_konsumsi.setEnabled(true);
    }
    
    private void jjkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jjkActionPerformed
        // TODO add your handling code here:
        if(jjk.getSelectedItem() == "U001") {
            jnk.setText("Umum");
        }
        else if(jjk.getSelectedItem() == "P001") {
            jnk.setText("Private");
        }
        aktif();
    }//GEN-LAST:event_jjkActionPerformed

    private void rb_pagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_pagiActionPerformed
        // TODO add your handling code here:
        rb();
    }//GEN-LAST:event_rb_pagiActionPerformed

    private void rb_malamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_malamActionPerformed
        // TODO add your handling code here:
        rb();
    }//GEN-LAST:event_rb_malamActionPerformed

    private void cb_internetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_internetActionPerformed
        // TODO add your handling code here:
        cb();
    }//GEN-LAST:event_cb_internetActionPerformed

    private void cb_konsumsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_konsumsiActionPerformed
        // TODO add your handling code here:
        cb();
    }//GEN-LAST:event_cb_konsumsiActionPerformed

    private void bexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bexitActionPerformed
        // TODO add your handling code here:
        int exit = JOptionPane.showConfirmDialog(null, "Apa anda yakin ingin keluar?","Tutup aplikasi", JOptionPane.YES_NO_OPTION);
        if(exit == JOptionPane.YES_NO_OPTION){
            this.hide();
            new menu().show();
        }
    }//GEN-LAST:event_bexitActionPerformed

    private void clearall(){
           buttonGroup1.clearSelection();
            cb_internet.setSelected(false);
            cb_konsumsi.setSelected(false);
            jjk.setSelectedItem(false);
            jbh.setSelectedItem(false);
            jnp.setText("");
            jnk.setText("");
            jbk.setText("");
            jbf.setText("");
            jtp.setText("");
    }
    private void bclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bclearActionPerformed
        // TODO add your handling code here:
        try{
            Statement statement = (Statement) konek.getConnection().createStatement();
            statement.executeUpdate("DELETE from komputer WHERE no_pendaftaran='"+jnp.getText()+"'");
            statement.close();
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Data tidak berhasil dihapus");
        }
        datatable();
        clearall();
    }//GEN-LAST:event_bclearActionPerformed

    private void bprocessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bprocessActionPerformed
        // TODO add your handling code here:
        int bk = Integer.parseInt(String.valueOf(jbk.getText()));
        int bf = Integer.parseInt(String.valueOf(jbf.getText()));
        int hasil = bk + bf;
        jtp.setText(String.valueOf(hasil));
        
        String no_pendaftaran = jnp.getText();
        String jenis_kursus = (String) jjk.getSelectedItem();
        String nama_kursus = jnk.getText();
        String hari = (String) jbh.getSelectedItem();
        String biaya_khursus = jbk.getText();
        String biaya_fasilitas = jbf.getText();
        String total = jtp.getText();
        
        try{
            Statement statement = (Statement) konek.getConnection().createStatement();
            String query = "INSERT INTO komputer (no_pendaftaran,jenis_kursus,nama_kursus,hari,biaya_pendaftaran,biaya_fasilitas,total_pembayaran) VALUES ('"+no_pendaftaran+"','"+jenis_kursus+"','"+nama_kursus+"','"+hari+"','"+biaya_khursus+"','"+biaya_fasilitas+"','"+total+"')";
            System.out.println(query);
            statement.executeUpdate(query);
            statement.close();
            JOptionPane.showMessageDialog(null, "Data Berhasil disimpan");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Data Tidak Berhasil Disimpan"+ e.getMessage());
        }
        datatable();
        clearall();
        
        
        
        
    }//GEN-LAST:event_bprocessActionPerformed

    private void jbhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbhActionPerformed
        // TODO add your handling code here:
        int waktukursus = 0;
        if(rb_pagi.isSelected() && jjk.getSelectedItem() == "U001"){
            rb_malam.setSelected(false);
            waktukursus = 50000;
        }else if(rb_malam.isSelected() && jjk.getSelectedItem() == "U001"){
            rb_pagi.setSelected(false);
            waktukursus = 70000;
        }else if(rb_pagi.isSelected() && jjk.getSelectedItem() == "P001"){
            rb_malam.setSelected(false);
            waktukursus = 100000;
        }else if(rb_malam.isSelected() && jjk.getSelectedItem() == "P001"){
            rb_pagi.setSelected(false);
            waktukursus = 120000;
        }
        
        int hari = Integer.parseInt(String.valueOf(jbh.getSelectedItem()));
        int total = waktukursus * hari; 
        jbk.setText(String.valueOf(total));
        cb();
    }//GEN-LAST:event_jbhActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        jTable.getSelectedRow();
        
        Object no_pendaftaran = model.getValueAt(jTable.getSelectedRow(), 0);
        Object jenis_kursus = model.getValueAt(jTable.getSelectedRow(), 1);
        Object nama_kursus = model.getValueAt(jTable.getSelectedRow(), 2);
        Object hari = model.getValueAt(jTable.getSelectedRow(), 3);
        Object biaya_pendaf = model.getValueAt(jTable.getSelectedRow(), 4);
        Object biayakh = model.getValueAt(jTable.getSelectedRow(), 5);
        Object total = model.getValueAt(jTable.getSelectedRow(), 6);
        
        jnp.setText(String.valueOf(no_pendaftaran));
        jjk.setSelectedItem(jenis_kursus);
        jnk.setText(String.valueOf(nama_kursus));
        jbh.setSelectedItem(hari);
        jbk.setText(String.valueOf(biayakh));
        jbf.setText(String.valueOf(biaya_pendaf));
        jtp.setText(String.valueOf(total));
        
        
    }//GEN-LAST:event_jTableMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() != 10)return;
        
        JOptionPane.showMessageDialog(null,"Test");
        
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("No Pendaftaran");
        tbl.addColumn("Jenis Kursus");
        tbl.addColumn("Nama Kursus");
        tbl.addColumn("Hari");
        tbl.addColumn("Biaya Pendaftaran");
        tbl.addColumn("Biaya Fasilitas");
        tbl.addColumn("Total Pembayaran");
        
        jTable.setModel(tbl);
        
        
        
        try{
            Statement statement = (Statement)konek.getConnection().createStatement();
            
            ResultSet res = statement.executeQuery(" SELECT * FROM komputer WHERE no_pendaftaran LIKE '%"+jTextField1.getText()+"%'");
            while(res.next()){
                tbl.addRow(new Object[] {
                    res.getString("no_pendaftaran"),
                    res.getString("jenis_kursus"),
                    res.getString("nama_kursus"),
                    res.getString("hari"),
                    res.getString("biaya_pendaftaran"),
                    res.getString("biaya_fasilitas"),
                    res.getString("total_pembayaran")
                });
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        
        
    }//GEN-LAST:event_jTextField1KeyPressed

    private void bclear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bclear1ActionPerformed
        // TODO add your handling code here:
        int bk = Integer.parseInt(String.valueOf(jbk.getText()));
        int bf = Integer.parseInt(String.valueOf(jbf.getText()));
        int hasil = bk + bf;
        
        jtp.setText(String.valueOf(hasil));
        
        
        
        try {
            com.mysql.jdbc.Statement statement = (com.mysql.jdbc.Statement) konek.getConnection().createStatement();
                statement.executeUpdate("UPDATE komputer SET no_pendaftaran ='"+jnp.getText()+"',jenis_kursus='"+jjk.getSelectedItem()+"',nama_kursus='"+jnk.getText()+"',hari='"+jbh.getSelectedItem()+"',biaya_pendaftaran='"+jbk.getText()+"',biaya_fasilitas='"+jbf.getText()+"',total_pembayaran='"+jtp.getText()+"'");
                JOptionPane.showMessageDialog(null, "Data berhasil di Update");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data tidak berhasil di Update");
        }
        datatable();
    }//GEN-LAST:event_bclear1ActionPerformed
    
    private void rb() {
        if(rb_pagi.isSelected() && jjk.getSelectedItem() == "U001") {
            rb_malam.setSelected(false);
            jbk.setText("50000");
        }
        else if(rb_pagi.isSelected() && jjk.getSelectedItem() == "P001") {
            rb_malam.setSelected(false);
            jbk.setText("70000");
        }else if(rb_malam.isSelected() && jjk.getSelectedItem() == "U001") {
            rb_pagi.setSelected(false);
            jbk.setText("100000");
        }else if(rb_malam.isSelected() && jjk.getSelectedItem() == "P001") {
            rb_pagi.setSelected(false);
            jbk.setText("120000");
        }
    }
    
    private void cb() {
        if(cb_internet.isSelected() == true && cb_konsumsi.isSelected() == false) {
            jbf.setText("20000");
        }
        else if (cb_internet.isSelected() == false && cb_konsumsi.isSelected() == true) {
            jbf.setText("50000");
        }
        else if (cb_internet.isSelected() == true && cb_konsumsi.isSelected() == true) {
            jbf.setText("70000");
        }
        else {
            jbf.setText("0");
        }
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
            java.util.logging.Logger.getLogger(Khursus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Khursus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Khursus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Khursus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Khursus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bclear;
    private javax.swing.JButton bclear1;
    private javax.swing.JButton bexit;
    private javax.swing.JButton bprocess;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cb_internet;
    private javax.swing.JCheckBox cb_konsumsi;
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
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jbf;
    private javax.swing.JComboBox jbh;
    private javax.swing.JTextField jbk;
    private javax.swing.JComboBox jjk;
    private javax.swing.JTextField jnk;
    private javax.swing.JTextField jnp;
    private javax.swing.JTextField jtp;
    private javax.swing.JRadioButton rb_malam;
    private javax.swing.JRadioButton rb_pagi;
    // End of variables declaration//GEN-END:variables
}
