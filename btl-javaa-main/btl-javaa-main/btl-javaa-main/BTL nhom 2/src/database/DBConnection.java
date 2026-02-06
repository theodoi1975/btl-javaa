/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;


import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {
        try {
            String url =
              "jdbc:mysql://localhost:3306/note_manager?useSSL=false&serverTimezone=UTC";
            String user = "root";
            String password = "";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn =
                DriverManager.getConnection(url, user, password);

            System.out.println(">>> KẾT NỐI MYSQL THÀNH CÔNG <<<");
            return conn;

        } catch (Exception e) {
            System.out.println(">>> KẾT NỐI MYSQL THẤT BẠI <<<");
            e.printStackTrace();
            return null;
        }
    }
}
