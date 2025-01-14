package org.dev.bean_lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class StudentDao {

    @Autowired
    DbConnect dbConnect;


    Connection conn;

    @PostConstruct
    public void init() throws Exception {
        System.out.println("Init method called...");
        establishConnection();
    }

    public void establishConnection() throws Exception {
        conn = dbConnect.getConnection();
        if(conn == null) {
            System.out.println("Connection is null..");
        }
        else {
            System.out.println("Connection established..");
        }
    }

    // In every operation we are creating the connection manually
    // So we want Spring will create and initialize connection for us automatically
    // Means, we don't need to write this "Connection conn = dbConnect.getConnection()" in every operation
    // Spring handle and initialize conn obj by calling establishConnection()
    public void selectAllRows() throws Exception {
        try {
            PreparedStatement st = conn.prepareStatement("SELECT * FROM college.students;");
            ResultSet rs = st.executeQuery();

            while(rs.next()) {
                int studentId = rs.getInt("id");
                String fullName = rs.getString("full_name");
                String className = rs.getString("class");
                int mark = rs.getInt("mark");
                String gender = rs.getString("gender");
                String city = rs.getString("city");

                System.out.println("StudentId: " + studentId + " fullName: " + fullName + " className: " + className + " mark: " + mark + " gender: " + gender + " city: " + city);
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteRow(int studentId) throws Exception {
        try(Connection conn = dbConnect.getConnection();
        PreparedStatement st = conn.prepareStatement("DELETE FROM college.students WHERE id = ?")) {
            st.setInt(1, studentId);

            int rowsAffected = st.executeUpdate();

            if(rowsAffected == 1) {
                System.out.println("Student deleted successfully");
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public void closeConnection() throws Exception {
        conn.close();
    }

    @PreDestroy
    public void destroy() throws Exception {
        closeConnection();
        System.out.println("Connection closed...");
    }

}
