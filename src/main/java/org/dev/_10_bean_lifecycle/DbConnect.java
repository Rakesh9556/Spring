package org.dev._10_bean_lifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Component
public class DbConnect {

    @Autowired
    @Qualifier("mySql")
    MySqlDatabase mySql;

    public Connection getConnection() throws Exception {
        Connection conn = null;

        try {
            Class.forName(mySql.getDriver());
            conn = DriverManager.getConnection(mySql.getUrl(), mySql.getUsername(), mySql.getPassword());

        }
        catch(ClassNotFoundException | SQLException e) {
            throw new Exception(e.getMessage());
        }
        mySql.displayDbInfo();
        return conn;
    }

    public boolean isConnected() throws Exception {
        if(getConnection() != null) {
            System.out.println("Database connected...");
            return true;
        }
        System.out.println("Database connection failed...");
        return false;
    }


}
