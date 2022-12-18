/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasreariztha22100146;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class Koneksi {
    private static Connection connection;

    public static Connection getKoneksi() {
        if (connection == null) {
            try {
                Driver mysql = new com.mysql.cj.jdbc.Driver();
                DriverManager.registerDriver(mysql);
                String jdbcUrl = "jdbc:mysql://localhost:3306/db_tugascrudperpus";
                String username = "root";
                String password = "";
                connection = DriverManager.getConnection(jdbcUrl, username, password);
                System.out.println("sukses connect");

            } catch (SQLException exception) {
                System.out.println(exception);
            }

        }

        return connection;
}
    public void testKoneksi(){
        if (connection == null) {
            try {
                Driver mysql = new com.mysql.cj.jdbc.Driver();
                DriverManager.registerDriver(mysql);
                String jdbcUrl = "jdbc:mysql://localhost:3306/latihan_db";
                String username = "root";
                String password = "";
                connection = DriverManager.getConnection(jdbcUrl, username, password);
                System.out.println("sukses connect");

            } catch (SQLException exception) {
                System.out.println(exception);
            }

        }
    }
}
