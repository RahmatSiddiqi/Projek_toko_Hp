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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Baihaqi
 */
public class newbarang extends javax.swing.JFrame {

    ArrayList<String> ket = new ArrayList<>();
    private DefaultTableModel model;
    Connection conn;
    PreparedStatement ps;
    Statement cs;
    ResultSet rs;
    static ResultSet dataLogin;

    /**
     * Creates new form newbarang
     */
    public newbarang() {
        initComponents();
        model = new DefaultTableModel();
        //digunakan untuk memberi heading / judul pada kolom di tabel buku
        tabel_produk.setModel(model);
// "table_buku sesuaikan dengan variabel name"
        model.addColumn("ID");
        model.addColumn("NAMA BARANG");
        model.addColumn("MERK");
        model.addColumn("TIPE");
        model.addColumn("RAM");
        model.addColumn("JUMLAH");
        model.addColumn("HARGA");
        model.addColumn("HARGA JUAL");
        model.addColumn("BARCODE");
    }
//    //no urut tabel
//    public void noTabel(){
//        int baris = tabel_produk.getRowCount();
//        for (int a=0; a<baris; a++){
//            String nomor = String.valueOf(a+1);
//            tabel_produk.setValueAt(nomor + ".", a, 0);
//        }
//    }

    private void getData() {

        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();

        try {

//membuat statemen untuk memanggil data table tabel_buku
//           koneksi connection = new koneksi();   
//           Statement stat = connection.getKoneksi().createStatement( );
//           String sql        = "Select * from tabel_buku";
            cs = conn.createStatement();
            rs = cs.executeQuery("SELECT * FROM `tb_barang` WHERE `kategori`='barang'");

//pengecekan terhadap data tabel_buku
            while (rs.next()) {
                Object[] obj = new Object[9];
                obj[0] = rs.getString("id_barang");
                obj[1] = rs.getString("nama_barang");
                obj[2] = rs.getString("merk_barang");
                obj[3] = rs.getString("tipe_barang");
                obj[4] = rs.getString("ram");
                obj[5] = rs.getString("jumlah");
                obj[6] = rs.getString("harga");
                obj[7] = rs.getString("harga_jual");
                ket.add(rs.getRow() - 1, rs.getString("Keterangan"));
                obj[8] = rs.getString("barcode");
                model.addRow(obj);
            }
            rs.close();
            cs.clearBatch();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage());
        }
    }

    private void getDataCari() {

        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();

        try {

//membuat statemen untuk memanggil data table tabel_buku
//           koneksi connection = new koneksi();   
//           Statement stat = connection.getKoneksi().createStatement( );
//           String sql        = "Select * from tabel_buku";
            ps = conn.prepareStatement("SELECT * FROM `tb_barang` WHERE `nama_barang` LIKE ? || `merk_barang` LIKE ? || `tipe_barang` LIKE ? || `ram` LIKE ? || `harga` LIKE ? || `keterangan` LIKE ? || `barcode` LIKE ?");
            ps.setString(1, "%" + cari.getText() + "%");
            ps.setString(2, "%" + cari.getText() + "%");
            ps.setString(3, "%" + cari.getText() + "%");
            ps.setString(4, "%" + cari.getText() + "%");
            ps.setString(5, "%" + cari.getText() + "%");
            ps.setString(6, "%" + cari.getText() + "%");
            ps.setString(7, "%" + cari.getText() + "%");
            rs = ps.executeQuery();

//pengecekan terhadap data tabel_buku
            while (rs.next()) {
                Object[] obj = new Object[9];
                obj[0] = rs.getString("id_barang");
                obj[1] = rs.getString("nama_barang");
                obj[2] = rs.getString("merk_barang");
                obj[3] = rs.getString("tipe_barang");
                obj[4] = rs.getString("ram");
                obj[5] = rs.getString("jumlah");
                obj[6] = rs.getString("harga");
                obj[7] = rs.getString("harga_jual");
                ket.add(rs.getRow() - 1, rs.getString("Keterangan"));
                obj[8] = rs.getString("barcode");
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

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        keterangan = new java.awt.TextArea();
        btn_update = new javax.swing.JButton();
        tambah_pr = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_produk = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        nama_br = new javax.swing.JTextField();
        tgl = new com.toedter.calendar.JDateChooser();
        id_barang = new javax.swing.JTextField();
        merk = new javax.swing.JComboBox<>();
        type = new javax.swing.JComboBox<>();
        harga = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cari = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        ram = new javax.swing.JComboBox<>();
        jumlah = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        harga_jual = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        warna = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        barcode = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/hp.png")).getImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(33, 85, 205));

        jPanel2.setBackground(new java.awt.Color(232, 249, 253));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(33, 85, 205));
        jLabel1.setText("ADD PRODUCT");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("Nama Barang");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setText("Merk");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setText("Type");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setText("Ram");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setText("Keterangan");

        btn_update.setBackground(new java.awt.Color(33, 85, 205));
        btn_update.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setText("EDIT");
        btn_update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_updateMouseClicked(evt);
            }
        });
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        tambah_pr.setBackground(new java.awt.Color(33, 85, 205));
        tambah_pr.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        tambah_pr.setForeground(new java.awt.Color(255, 255, 255));
        tambah_pr.setText("Tambah Produk");
        tambah_pr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tambah_prMouseClicked(evt);
            }
        });
        tambah_pr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambah_prActionPerformed(evt);
            }
        });

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

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(33, 85, 205));
        jLabel2.setText("LIST PRODUK");

        tabel_produk.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tabel_produk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "wkwk", "rere", null, "1200000", "12", null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NO", "NAMA BARANG", "MERK", "TIPE", "RAM", "JUMLAH", "HARGA", "HARGA JUAL"
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

        merk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "iphone", "xiaomi", "redmi", "oppo", "realme", "nokia", "vivo", "samsung" }));

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "smartphone", "handphone" }));

        harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setText("Harga");

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

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setText("Harga Jual");

        ram.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2 GB", "4 GB", "6 GB", "8 GB", "10 GB", "12 GB" }));

        jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setText("Jumlah");

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

        harga_jual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                harga_jualActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel14.setText("FILTER");

        warna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hitam", "Putih", "Merah", "Pink", "Gold" }));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel15.setText("Warna");

        barcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barcodeActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel16.setText("barcode");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(id_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel5)))
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12))
                                        .addGap(93, 93, 93)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(nama_br)
                                                .addComponent(merk, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(type, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(harga)
                                                .addComponent(ram, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(harga_jual, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(tambah_pr)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_update)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(clear)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel10)
                                                .addComponent(jLabel13)
                                                .addComponent(jLabel15))
                                            .addGap(26, 26, 26)))
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(barcode, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(warna, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tgl, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(keterangan, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                                        .addComponent(cari)))
                                .addGap(24, 24, 24)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(back)
                                .addGap(251, 251, 251)
                                .addComponent(jLabel1)))
                        .addGap(321, 445, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(id_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(back))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(merk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(ram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(harga_jual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(warna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(nama_br, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(barcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(keterangan, javax.swing.GroupLayout.PREFERRED_SIZE, 76, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambah_pr)
                    .addComponent(btn_update)
                    .addComponent(clear)
                    .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conn = koneksi.konek();
        tgl.setDate(new Date(System.currentTimeMillis()));
        getData();
    }//GEN-LAST:event_formWindowOpened

    private void barcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barcodeActionPerformed

    private void harga_jualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_harga_jualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_harga_jualActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Home_Barang pindah = new Home_Barang();
        Home_Barang.dataLogin = dataLogin;
        pindah.setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_backMouseClicked

    private void jumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahActionPerformed

    private void cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariKeyReleased
        getDataCari();
        if(tabel_produk.getRowCount() == 1){
            if(evt.getKeyCode() == 10){
                getProduct(false);
            }
        }
    }//GEN-LAST:event_cariKeyReleased

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cariActionPerformed

    private void hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargaActionPerformed

    private void id_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_barangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_barangActionPerformed

    private void nama_brActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_brActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_brActionPerformed

    private void tabel_produkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_produkMouseClicked
        // TODO add your handling code here:
        getProduct(true);
    }//GEN-LAST:event_tabel_produkMouseClicked

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        nama_br.setText("");
        merk.setSelectedIndex(0);
        type.setSelectedIndex(0);
        ram.setSelectedIndex(0);
        harga.setText("");
        harga_jual.setText("");
        jumlah.setText("");
        keterangan.setText("");
        tambah_pr.setEnabled(true);
        cari.setText("");
        barcode.setText("");
        getData();
    }//GEN-LAST:event_clearMouseClicked

    private void tambah_prActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambah_prActionPerformed
        Calendar Time = tgl.getCalendar();
        if (nama_br.getText().isEmpty() || harga.getText().isEmpty() || keterangan.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "masukan informasi produk");
        } else {
            try {
                ps = conn.prepareStatement("insert into tb_barang values (NULL,?,?,?,?,?,?,?,?,?,?)");
                ps.setString(1, nama_br.getText() + " " + warna.getItemAt(warna.getSelectedIndex()));
                ps.setString(2, merk.getItemAt(merk.getSelectedIndex()));
                ps.setString(3, type.getItemAt(type.getSelectedIndex()));
                ps.setString(4, ram.getItemAt(ram.getSelectedIndex()));
                ps.setInt(5, Integer.parseInt(harga.getText()));
                ps.setInt(6, Integer.parseInt(harga_jual.getText()));
                ps.setInt(7, Integer.parseInt(jumlah.getText()));
                ps.setString(8, keterangan.getText());
                ps.setString(9, "barang");
                ps.setString(10, barcode.getText());
                ps.executeUpdate();

                cs = conn.createStatement();
                rs = ps.executeQuery("SELECT * FROM tb_barang ORDER BY `id_barang` DESC LIMIT 1");
                rs.next();

                int x = rs.getInt("id_barang");
                rs.close();
                ps.clearBatch();

                ps = conn.prepareStatement("INSERT INTO `tb_barang_masuk` (`id`, `id_barang`, `jumlah_masuk`, `tanggal_masuk`, `ketersediaan`,`id_pegawai`) VALUES (NULL, ?, ?, ?, ?, ?)");
                ps.setInt(1, x);
                ps.setInt(2, Integer.parseInt(jumlah.getText()));
                ps.setString(3, Time.get(Calendar.YEAR) + "-" + (Time.get(Calendar.MONTH) + 1) + "-" + Time.get(Calendar.DATE));
                ps.setInt(4, Integer.parseInt(jumlah.getText()));
                ps.setInt(5, Integer.parseInt(dataLogin.getString("id_pegawai")));
                if (ps.executeUpdate() == 1) {
                    getData();
                    JOptionPane.showMessageDialog(this, "Produk berhasil di tambah");
                    nama_br.setText("");
                    merk.setSelectedIndex(0);
                    type.setSelectedIndex(0);
                    harga.setText("");
                    cari.setText("");
                    keterangan.setText("");
                    barcode.setText("");
                    harga_jual.setText("");
                    warna.setSelectedIndex(0);
                    jumlah.setText("");
                    rs.close();
                    ps.clearBatch();
                }
            } catch (SQLException ex) {
                Logger.getLogger(newbarang.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tambah_prActionPerformed

    private void tambah_prMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambah_prMouseClicked

    }//GEN-LAST:event_tambah_prMouseClicked

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        try {
            ps = conn.prepareStatement("UPDATE `tb_barang` SET `id_barang`= ?,`nama_barang`= ?,`merk_barang`= ?,`tipe_barang`= ?, `ram`= ? ,`harga`= ?,`harga_jual`= ? ,`jumlah`= ?,`keterangan`= ?, `barcode` = ? WHERE `tb_barang`.`id_barang` = ?");
            ps.setString(1, id_barang.getText());
            ps.setString(2, nama_br.getText() + " " + warna.getItemAt(warna.getSelectedIndex()));
            ps.setString(3, merk.getItemAt(merk.getSelectedIndex()));
            ps.setString(4, type.getItemAt(type.getSelectedIndex()));
            ps.setString(5, ram.getItemAt(ram.getSelectedIndex()));
            ps.setInt(6, Integer.parseInt(harga.getText()));
            ps.setInt(7, Integer.parseInt(harga_jual.getText()));
            ps.setInt(8, Integer.parseInt(jumlah.getText()));
            ps.setString(9, keterangan.getText());
            ps.setString(10, barcode.getText());
            ps.setString(11, id_barang.getText());
            ps.executeUpdate();
            getData();
            JOptionPane.showMessageDialog(this, "Data berhasil di update");

        } catch (SQLException ex) {
            Logger.getLogger(newbarang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_updateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_updateMouseClicked

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
            java.util.logging.Logger.getLogger(newbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newbarang().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField barcode;
    private javax.swing.JButton btn_update;
    private javax.swing.JTextField cari;
    private javax.swing.JButton clear;
    private javax.swing.JTextField harga;
    private javax.swing.JTextField harga_jual;
    private javax.swing.JTextField id_barang;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField jumlah;
    private java.awt.TextArea keterangan;
    private javax.swing.JComboBox<String> merk;
    private javax.swing.JTextField nama_br;
    private javax.swing.JComboBox<String> ram;
    private javax.swing.JTable tabel_produk;
    private javax.swing.JButton tambah_pr;
    private com.toedter.calendar.JDateChooser tgl;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JComboBox<String> warna;
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

        switch (model.getValueAt(myindex, 3).toString()) {
            case "smartphone":
                type.setSelectedIndex(0);
                break;
            case "handphone":
                type.setSelectedIndex(1);
                break;
        }
        switch (model.getValueAt(myindex, 4).toString()) {
            case "2 GB":
                ram.setSelectedIndex(0);
                break;
            case "4 GB":
                ram.setSelectedIndex(1);
                break;
            case "6 GB":
                ram.setSelectedIndex(2);
                break;
            case "8 GB":
                ram.setSelectedIndex(3);
                break;
            case "10 GB":
                ram.setSelectedIndex(4);
                break;
            case "12 GB":
                ram.setSelectedIndex(5);
                break;

        }
        jumlah.setText(model.getValueAt(myindex, 5).toString());
        harga.setText(model.getValueAt(myindex, 6).toString());
        harga_jual.setText(model.getValueAt(myindex, 7).toString());
        keterangan.setText(ket.get(myindex));
        barcode.setText(model.getValueAt(myindex, 8).toString());
        tambah_pr.setEnabled(false);
    }
}
