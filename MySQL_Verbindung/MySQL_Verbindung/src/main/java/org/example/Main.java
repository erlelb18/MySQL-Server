package org.example;
import java.sql.*;


public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://207.154.218.150:3306/MySQLServer_OlgerErlisa_2025";
        String user = "olger";
        String password = "MyP@ssw0rd2025!";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT * FROM books";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String author = rs.getString("author");
                int year = rs.getInt("published_year");

                System.out.printf("ID: %d | Title: %s | Author: %s | Year: %d%n",
                        id, title, author, year);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}