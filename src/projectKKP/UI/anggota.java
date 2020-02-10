package projectKKP.UI;
import java.sql.*;
import java.text.SimpleDateFormat;
import projectKKP.main.koneksi;
import net.proteanit.sql.DbUtils;
import javax.swing.JOptionPane;

public class anggota extends javax.swing.JFrame {
    private Connection conn = new koneksi().connect();
    String gender;
    java.util.Date curdate = new java.util.Date();
    
    protected void tampiltabel() {
        try {
            PreparedStatement ps = conn.prepareStatement("select kd_anggota,nama,kelas,"
                    + "tgl_daftar,tgl_akhir_anggota from anggota");
            ResultSet rs = ps.executeQuery();
            tblAnggota.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    protected void resetForm() {
        kdAnggota.setText("");
        nama.setText("");
        jk.clearSelection();
        kls.setSelectedIndex(0);
        notelp.setText("");
        alamat.setText("");
        tglExpired.setCalendar(null);
        tglDaftar.setDate(curdate);
        kdAnggota.requestFocus();
    }
    
    public boolean cekInput() {
        if(kdAnggota.getText() == null
                ||nama.getText() == null
                ||jk.getSelection() == null
                ||kls.getSelectedIndex() == 0
                ||notelp.getText() == null
                ||alamat.getText() == null
                ||tglExpired.getDate() == null) {
            return false;
        } else {
            return true;
        }
    }
    public anggota() {
        initComponents();
        tampiltabel();
        tglDaftar.setDate(curdate);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jk = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        gotoMenu = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        kdAnggota = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lk = new javax.swing.JRadioButton();
        pr = new javax.swing.JRadioButton();
        kls = new javax.swing.JComboBox<>();
        notelp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamat = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAnggota = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        searchbar = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        printBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tglDaftar = new com.toedter.calendar.JDateChooser();
        tglExpired = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Anggota");

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Data Anggota Perpustakaan");

        gotoMenu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        gotoMenu.setText("Kembali Ke Menu Utama");
        gotoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gotoMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gotoMenu)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gotoMenu)
                    .addComponent(jLabel1))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Kode Anggota");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nama Lengkap");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Kelas");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Nomor Telepon");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Tanggal Pendaftaran");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Jenis Kelamin");

        jk.add(lk);
        lk.setText("Laki-Laki");

        jk.add(pr);
        pr.setText("Perempuan");

        kls.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH KELAS", "------------ Kelas X ------------", "X-AK-1", "X-AK-2", "X-AK-3", "X-AP-1", "X-AP-2", "X-AP-3", "X-TN-1", "X-TN-2", "X-TN-3", "------------ Kelas XI ------------", "XI-AK-1", "XI-AK-2", "XI-AK-3", "XI-AP-1", "XI-AP-2", "XI-AP-3", "XI-TN-1", "XI-TN-2", "XI-TN-3", "------------ Kelas XII ------------", "XII-AK-1", "XII-AK-2", "XII-AK-3", "XII-AP-1", "XII-AP-2", "XII-AP-3", "XII-TN-1", "XII-TN-2", "XII-TN-3" }));

        alamat.setColumns(20);
        alamat.setRows(5);
        jScrollPane1.setViewportView(alamat);

        tblAnggota.setModel(new javax.swing.table.DefaultTableModel(
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
        tblAnggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAnggotaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblAnggota);

        jLabel8.setText("Cari data anggota");

        searchbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchbarMouseClicked(evt);
            }
        });
        searchbar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchbarKeyReleased(evt);
            }
        });

        saveBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        saveBtn.setText("Simpan Data");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        editBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        editBtn.setText("Ubah Data");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        resetBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        resetBtn.setText("Reset Form");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deleteBtn.setText("Hapus Data");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        printBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        printBtn.setText("Cetak kartu anggota");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Alamat Rumah");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Tanggal Akhir Keanggotaan");

        tglDaftar.setDateFormatString("dd MMMM yyyy");

        tglExpired.setDateFormatString("dd MMMM yyyy");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(printBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9))
                                .addGap(105, 105, 105)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kdAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(kls, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(lk)
                                            .addGap(18, 18, 18)
                                            .addComponent(pr)))
                                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                        .addComponent(notelp, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(69, 69, 69)
                                .addComponent(tglDaftar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchbar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(saveBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(editBtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(resetBtn)
                                        .addGap(14, 14, 14)
                                        .addComponent(deleteBtn))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(27, 27, 27)
                        .addComponent(tglExpired, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(kdAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(searchbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lk)
                                .addComponent(pr)))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(kls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(notelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(3, 3, 3))
                            .addComponent(tglDaftar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tglExpired, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(saveBtn)
                        .addComponent(editBtn)
                        .addComponent(resetBtn)
                        .addComponent(deleteBtn)))
                .addGap(30, 30, 30)
                .addComponent(printBtn)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        if (cekInput()) {
            try {
                PreparedStatement ps = conn.prepareStatement("insert into anggota values (?,?,?,?,?,?,?,?)");
                    
                    ps.setString(1, kdAnggota.getText());
                    ps.setString(2, nama.getText());
                    
                    if (lk.isSelected()) {
                        gender = "Laki-Laki";
                    }
                    if (pr.isSelected()) {
                        gender = "Perempuan";
                    }
                    ps.setString(3, gender);
                    
                    ps.setString(4, kls.getSelectedItem().toString());
                    ps.setString(5, notelp.getText());
                    ps.setString(6, alamat.getText());
                    
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    String regDate = sdf.format(tglDaftar.getDate());
                    String expDate = sdf.format(tglExpired.getDate());
                    ps.setString(7, regDate);
                    ps.setString(8, expDate);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Data berhasil diinput !");
                    resetForm();
                    tampiltabel();
                    
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Masih ada data yang kosong !");
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "Apakah anda ingin mengubah data ini ?", "UBAH DATA", JOptionPane.YES_NO_OPTION);
        if(ok == 0) {
                try {
                    String sql = "update anggota set nama=?,jk=?,kelas=?,noTelp=?,alamat=?,"
                            + "tgl_daftar=?,tgl_akhir_anggota=? where kd_anggota=?";
                
                    PreparedStatement ps = conn.prepareStatement(sql);
                    ps.setString(1, nama.getText());
                    
                    if (lk.isSelected()) {
                        gender = "Laki-Laki";
                    }
                    if (pr.isSelected()) {
                        gender = "Perempuan";
                    }
                    ps.setString(2, gender);
                    
                    ps.setString(3, kls.getSelectedItem().toString());
                    ps.setString(4, notelp.getText());
                    ps.setString(5, alamat.getText());
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    String regDate = sdf.format(tglDaftar.getDate());
                    String expDate = sdf.format(tglExpired.getDate());
                    ps.setString(6, regDate);
                    ps.setString(7, expDate);
                    ps.setString(8, kdAnggota.getText());
                    
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Data Berhasil Diubah !");
                    resetForm();
                    tampiltabel();
                    
                } catch (SQLException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, e);
                }
            }
    }//GEN-LAST:event_editBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        resetForm();
        searchbar.setText("");
        tampiltabel();
        java.util.Date date = new java.util.Date();
        tglDaftar.setDate(date);
    }//GEN-LAST:event_resetBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus data ini ?", "HAPUS DATA", JOptionPane.YES_NO_OPTION);
        if(ok == 0) {
            try {
                PreparedStatement ps = conn.prepareStatement("delete from anggota where kd_anggota=?");
                ps.setString(1, kdAnggota.getText());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus !");
                resetForm();
                tampiltabel();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void tblAnggotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAnggotaMouseClicked
        try {
            int row = tblAnggota.getSelectedRow();
            String table_click = (tblAnggota.getModel().getValueAt(row, 0).toString());
            String sql = "select * from anggota where kd_anggota='"+table_click+"'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                String add1 = rs.getString("kd_anggota");
                kdAnggota.setText(add1);
                
                String add2 = rs.getString("nama");
                nama.setText(add2);
                
                String add3 = rs.getString("jk");
                if (add3.equals("Laki-Laki")) {
                    lk.setSelected(true);
                }
                if (add3.equals("Perempuan")) {
                    pr.setSelected(true);
                }
                
                String add4 = rs.getString("kelas");
                kls.setSelectedItem(add4);
                
                String add5 = rs.getString("noTelp");
                notelp.setText(add5);
                
                String add6 = rs.getString("alamat");
                alamat.setText(add6);
                
                java.sql.Date add7 = new java.sql.Date(rs.getDate("tgl_daftar").getTime());
                java.sql.Date add8 = new java.sql.Date(rs.getDate("tgl_akhir_anggota").getTime());
                tglDaftar.setDate(add7);
                tglExpired.setDate(add8);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tblAnggotaMouseClicked

    private void searchbarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchbarKeyReleased
        if(searchbar.getText().length()>0) {
            try {
                String sql = "Select kd_anggota,nama,kelas"
                        + " from anggota where kd_anggota like '%"+searchbar.getText()+"%' "
                        + "or nama like '%"+searchbar.getText()+"%' "
                        + "or kelas like '%"+searchbar.getText()+"%' ";
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                tblAnggota.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e);
            }
        } else {
            tampiltabel();
        }
    }//GEN-LAST:event_searchbarKeyReleased

    private void searchbarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchbarMouseClicked
        searchbar.setText("");
        tampiltabel();
    }//GEN-LAST:event_searchbarMouseClicked

    private void gotoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gotoMenuActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin kembali ke menu utama ?", "Back To Menu", JOptionPane.YES_NO_OPTION);
        if(ok == 0) {
            try {
                this.dispose();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_gotoMenuActionPerformed

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
            java.util.logging.Logger.getLogger(anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new anggota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamat;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton gotoMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.ButtonGroup jk;
    private javax.swing.JTextField kdAnggota;
    private javax.swing.JComboBox<String> kls;
    private javax.swing.JRadioButton lk;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField notelp;
    private javax.swing.JRadioButton pr;
    private javax.swing.JButton printBtn;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField searchbar;
    private javax.swing.JTable tblAnggota;
    private com.toedter.calendar.JDateChooser tglDaftar;
    private com.toedter.calendar.JDateChooser tglExpired;
    // End of variables declaration//GEN-END:variables
}