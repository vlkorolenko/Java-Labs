package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.Properties;

public class ClientService {
    public void addClient(String fullName, Date birthDate, Properties prop){
        String sql = "INSERT INTO clients (full_name, date_of_birth) VALUES(?,?)";
        try(Connection connection = DatabaseConnector.getConnection(prop);
            PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, fullName);
            pstmt.setDate(2, (java.sql.Date) birthDate);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
