/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package konterhp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Baihaqi
 */
public class add_stok extends javax.swing.JFrame {

    private DefaultTableModel model;
    Connection conn;
    PreparedStatement ps;
    Statement cs;
    ResultSet rs;
    static ResultSet dataLogin;

    /**
     * Creates new form add_stok
     */
    public add_stok() {
        initComponents();
        model = new DefaultTableModel();
        //digunakan untuk memberi heading / judul pada kolom di tabel buku
        tabel_produk.setModel(model);
// "table_buku sesuaikan dengan variabel name"
        model.addColumn("ID");
        model.addColumn("NAMA BARANG");
        model.addColumn("MERK");
        model.addColumn("TIPE");
        model.addColumn("JUMLAH");
        model.addColumn("HARGA");
        model.addColumn("HARGA JUAL");
        model.addColumn("KATEGORI");
    }

    private void getData() {

        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();

        try {

//membuat statemen untuk memanggil data table tabel_buku
//           koneksi connection = new koneksi();   
//           Statement stat = connection.getKoneksi().createStatement( );
//           String sql        = "Select * from tabel_buku";
            cs = conn.createStatement();
            rs = cs.executeQuery("SELECT * FROM `tb_barang`");

//pengecekan terhadap data tabel_buku
            while (rs.next()) {
                Object[] obj = new Object[8];
                obj[0] = rs.getString("id_barang");
                obj[1] = rs.getString("nama_barang");
                obj[2] = rs.getString("merk_barang");
                obj[3] = rs.getString("tipe_barang");
                obj[4] = rs.getString("jumlah");
                obj[5] = rs.getString("harga");
                obj[6] = rs.getString("harga_jual");
                obj[7] = rs.getString("kategori");
                model.addRow(obj);
            }
            rs.close();
            cs.clearBatch();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage());
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Tambah_Stok = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_produk = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        nama_br = new javax.swing.JTextField();
        tgl = new com.toedter.calendar.JDateChooser();
        id_barang = new javax.swing.JTextField();
        merk = new javax.swing.JComboBox<>();
        kategori = new javax.swing.JComboBox<>();
        cari = new javax.swing.JTextField();
        stokAwal = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        tambah = new javax.swing.JSpinner();
        jLabel16 = new javax.swing.JLabel();
        clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/hp.png")).getImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(33, 85, 205));

        jPanel2.setBackground(new java.awt.Color(232, 249, 253));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(33, 85, 205));
        jLabel1.setText("TAMBAH STOK");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("Nama Barang");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setText("Merk");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setText("Kategori");

        Tambah_Stok.setBackground(new java.awt.Color(33, 85, 205));
        Tambah_Stok.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Tambah_Stok.setForeground(new java.awt.Color(255, 255, 255));
        Tambah_Stok.setText("Tambah Stok");
        Tambah_Stok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tambah_StokMouseClicked(evt);
            }
        });
        Tambah_Stok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tambah_StokActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(33, 85, 205));
        jLabel2.setText("LIST PRODUK");

        tabel_produk.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tabel_produk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "wkwk", "rere", null, "12", null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NAMA BARANG", "MERK", "TIPE", "JUMLAH", "HARGA", "HARGA JUAL", "KATEGORI"
            }
        ));
        tabel_produk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_produkMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_produk);

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setText("Tanggal");

        nama_br.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_brActionPerformed(evt);
            }
        });

        id_barang.setEditable(false);
        id_barang.setBackground(new java.awt.Color(255, 255, 255));
        id_barang.setForeground(new java.awt.Color(255, 255, 255));
        id_barang.setActionCommand("<Not Set>");
        id_barang.setCaretColor(new java.awt.Color(255, 255, 255));
        id_barang.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        id_barang.setEnabled(false);
        id_barang.setSelectionColor(new java.awt.Color(255, 255, 255));
        id_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_barangActionPerformed(evt);
            }
        });

        merk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "iphone", "xiaomi", "redmi", "oppo", "realme", "nokia", "vivo" }));

        kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "barang", "aksesoris" }));

        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });
        cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cariKeyReleased(evt);
            }
        });

        stokAwal.setEditable(false);
        stokAwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stokAwalActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setText("Stok Awal");

        back.setBackground(new java.awt.Color(33, 85, 205));
        back.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("BACK");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel15.setText("Tambah Stok");

        tambah.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tambahStateChanged(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel16.setText("Filter");

        clear.setBackground(new java.awt.Color(33, 85, 205));
        clear.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("CLEAR");
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(id_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(back)
                        .addGap(243, 243, 243)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel13)))
                            .addComponent(Tambah_Stok))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clear)
                            .addComponent(nama_br, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(stokAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(kategori, javax.swing.GroupLayout.Alignment.LEADING, 0, 173, Short.MAX_VALUE)
                                    .addComponent(merk, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel16))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tgl, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(id_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(nama_br, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(tgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(merk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel15)))
                                .addGap(19, 19, 19)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(back))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(stokAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tambah_Stok)
                    .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(clear))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        conn = koneksi.konek();
        tgl.setDate(new Date(System.currentTimeMillis()));
        getData();
    }//GEN-LAST:event_formWindowActivated

    private void Tambah_StokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tambah_StokMouseClicked

    }//GEN-LAST:event_Tambah_StokMouseClicked

    private void Tambah_StokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tambah_StokActionPerformed
        Calendar Time = tgl.getCalendar();
        if (Integer.parseInt(tambah.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(this, "Masukan Nilai Stok barang");
        } else {
            try {
                int stokAwal = Integer.parseInt(this.stokAwal.getText());
                int stokTambah = (int) this.tambah.getValue();

                int ketersedian = stokAwal + stokTambah;
                ps = conn.prepareStatement("UPDATE `tb_barang` SET `jumlah`=? WHERE `id_barang`= ?");
                ps.setInt(1, ketersedian);
                ps.setString(2, id_barang.getText());
                ps.executeUpdate();

                cs = conn.createStatement();
                rs = ps.executeQuery("SELECT * FROM tb_barang ORDER BY `id_barang` DESC LIMIT 1");
                rs.next();

                int x = rs.getInt("id_barang");
                rs.close();
                ps.clearBatch();

                ps = conn.prepareStatement("INSERT INTO `tb_barang_masuk` (`id`, `id_barang`, `jumlah_masuk`, `tanggal_masuk`, `ketersediaan`,`id_pegawai`) VALUES (NULL, ?, ?, ?, ?, ?)");
                ps.setInt(1, x);
                ps.setInt(2, stokTambah);
                ps.setString(3, Time.get(Calendar.YEAR) + "-" + (Time.get(Calendar.MONTH) + 1) + "-" + Time.get(Calendar.DATE));
                ps.setInt(4, ketersedian);
                ps.setInt(5, Integer.parseInt(dataLogin.getString("id_pegawai")));
                if (ps.executeUpdate() == 1) {
                    getData();
                    JOptionPane.showMessageDialog(this, "Produk berhasil di tambah");
                    nama_br.setText("");
                    merk.setSelectedIndex(0);
                    kategori.setSelectedIndex(0);
                    tambah.setValue(0);
                    this.stokAwal.setText("");
                    rs.close();
                    ps.clearBatch();
                }
            } catch (SQLException ex) {
                Logger.getLogger(newbarang.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_Tambah_StokActionPerformed

    private void getDataCari() {

        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();

        try {

//membuat statemen untuk memanggil data table tabel_buku
//           koneksi connection = new koneksi();   
//           Statement stat = connection.getKoneksi().createStatement( );
//           String sql        = "Select * from tabel_buku";
            ps = conn.prepareStatement("SELECT * FROM `tb_barang` WHERE `nama_barang` LIKE ? || `merk_barang` LIKE ? || `tipe_barang` LIKE ? || `kategori` LIKE ? || `keterangan` LIKE ? || `barcode` LIKE ?");
            ps.setString(1, "%" + cari.getText() + "%");
            ps.setString(2, "%" + cari.getText() + "%");
            ps.setString(3, "%" + cari.getText() + "%");
            ps.setString(4, "%" + cari.getText() + "%");
            ps.setString(5, "%" + cari.getText() + "%");
            ps.setString(6, "%" + cari.getText() + "%");
            rs = ps.executeQuery();

//pengecekan terhadap data tabel_buku
            while (rs.next()) {
                Object[] obj = new Object[8];
                obj[0] = rs.getString("id_barang");
                obj[1] = rs.getString("nama_barang");
                obj[2] = rs.getString("merk_barang");
                obj[3] = rs.getString("tipe_barang");
                obj[4] = rs.getString("jumlah");
                obj[5] = rs.getString("harga");
                obj[6] = rs.getString("harga_jual");
                obj[7] = rs.getString("kategori");
                model.addRow(obj);
            }
            rs.close();
            cs.clearBatch();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage());
        }

    }

    private void tabel_produkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_produkMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tabel_produk.getModel();
        int myindex = tabel_produk.getSelectedRow();
        id_barang.setText(model.getValueAt(myindex, 0).toString());
        nama_br.setText(model.getValueAt(myindex, 1).toString());
        switch (model.getValueAt(myindex, 2).toString()) {
            case "iphone":
                merk.setSelectedIndex(0);
                break;
            case "xiaomi":
                merk.setSelectedIndex(1);
                break;
            case "redmi":
                merk.setSelectedIndex(2);
                break;
            case "oppo":
                merk.setSelectedIndex(3);
                break;
            case "realme":
                merk.setSelectedIndex(4);
                break;
            case "nokia":
                merk.setSelectedIndex(5);
                break;
            case "vivo":
                merk.setSelectedIndex(6);
                break;
            case "samsung":
                merk.setSelectedIndex(7);
                break;
        }

        switch (model.getValueAt(myindex, 7).toString()) {
            case "barang":
                kategori.setSelectedIndex(0);
                break;
            case "aksesoris":
                kategori.setSelectedIndex(1);
                break;
        }
        stokAwal.setText(model.getValueAt(myindex, 4).toString());
    }//GEN-LAST:event_tabel_produkMouseClicked

    private void nama_brActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_brActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_brActionPerformed

    private void id_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_barangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_barangActionPerformed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cariActionPerformed

    private void cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariKeyReleased
   
        getDataCari();
        if(tabel_produk.getRowCount() == 1){
            if(evt.getKeyCode() == 10){
                getProduct(false);
            }
        }
    }//GEN-LAST:event_cariKeyReleased

    private void stokAwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stokAwalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stokAwalActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_backMouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Home_Barang pindah = new Home_Barang();
        Home_Barang.dataLogin = dataLogin;
        pindah.setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void tambahStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tambahStateChanged
        if (Integer.parseInt(tambah.getValue().toString()) < 0) {
            tambah.setValue(0);
        }
    }//GEN-LAST:event_tambahStateChanged

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked

    }//GEN-LAST:event_clearMouseClicked

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        cari.setText("");
        nama_br.setText("");
        tambah.setValue(0);
        stokAwal.setText("");
        getData();
       
    }//GEN-LAST:event_clearActionPerformed

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
            java.util.logging.Logger.getLogger(add_stok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_stok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_stok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_stok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_stok().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Tambah_Stok;
    private javax.swing.JButton back;
    private javax.swing.JTextField cari;
    private javax.swing.JButton clear;
    private javax.swing.JTextField id_barang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> kategori;
    private javax.swing.JComboBox<String> merk;
    private javax.swing.JTextField nama_br;
    private javax.swing.JTextField stokAwal;
    private javax.swing.JTable tabel_produk;
    private javax.swing.JSpinner tambah;
    private com.toedter.calendar.JDateChooser tgl;
    // End of variables declaration//GEN-END:variables

private void getProduct(boolean x) {
        DefaultTableModel model = (DefaultTableModel) tabel_produk.getModel();
        int myindex;
        if(x){
            myindex = tabel_produk.getSelectedRow();
        }else{
            myindex = 0;
        }
    id_barang.setText(model.getValueAt(myindex, 0).toString());
        nama_br.setText(model.getValueAt(myindex, 1).toString());
        switch (model.getValueAt(myindex, 2).toString()) {
            case "iphone":
                merk.setSelectedIndex(0);
                break;
            case "xiaomi":
                merk.setSelectedIndex(1);
                break;
            case "redmi":
                merk.setSelectedIndex(2);
                break;
            case "oppo":
                merk.setSelectedIndex(3);
                break;
            case "realme":
                merk.setSelectedIndex(4);
                break;
            case "nokia":
                merk.setSelectedIndex(5);
                break;
            case "vivo":
                merk.setSelectedIndex(6);
                break;
            case "samsung":
                merk.setSelectedIndex(7);
                break;
        }

        switch (model.getValueAt(myindex, 7).toString()) {
            case "barang":
                kategori.setSelectedIndex(0);
                break;
            case "aksesoris":
                kategori.setSelectedIndex(1);
                break;
        }
        stokAwal.setText(model.getValueAt(myindex, 4).toString());
    }
}
