/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afms;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author suvigya
 */
public class MySqlConnect {
    Connection conn = null;
    public static Connection ConnectDB()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/afms","root","");
            //JOptionPane.showMessageDialog(null,"Connected To Database");
            return conn;
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
