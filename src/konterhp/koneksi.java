/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konterhp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Baihaqi
 */
public class koneksi {
    public static Connection konek(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection konekdb = DriverManager.getConnection("jdbc:mysql://localhost/tokohp","root","");
            return konekdb;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
