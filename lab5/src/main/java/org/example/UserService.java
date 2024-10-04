package org.example;

import org.mindrot.jbcrypt.BCrypt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.zip.CheckedOutputStream;

public class UserService {
    public void registerUser(String username, String password) {
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
        Properties prop = Main.readConfiguration("db.properties"); // Тут ми читаємо конфігурацію з файлу db.properties

        String sql = "INSERT INTO users (username, password_hash) VALUES (?, ?)";
        try (Connection connection = DatabaseConnector.getConnection(prop);
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setString(2, hashedPassword);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean authenticateUser(String username, String password) {
        Properties prop = Main.readConfiguration("db.properties");
        String sql = "SELECT password_hash FROM users WHERE username = ?";
        try (Connection connection = DatabaseConnector.getConnection(prop);
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String storedHash = rs.getString("password_hash");
                if (BCrypt.checkpw(password, storedHash)) {
                    System.out.println("Авторизація успішна");
                    return true;
                } else {
                    System.out.println("Невірний пароль!");
                }
            } else {
                System.out.println("Невіриний логін!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


}
