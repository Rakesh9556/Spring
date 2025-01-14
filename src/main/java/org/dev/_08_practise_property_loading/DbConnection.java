package org.dev._08_practise_property_loading;

import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    @Autowired
    private MySQL mySql;

    public void setMySql(MySQL mySql) {
        this.mySql = mySql;
    }

    private Connection getConnection() throws ClassNotFoundException, SQLException {
        try{
            mySql.displayDatabaseInfo();
            Class.forName(mySql.getDriver());
            return DriverManager.getConnection(mySql.getUrl(), mySql.getUsername(), mySql.getPassword());
        }
        catch (ClassNotFoundException e){
            throw new ClassNotFoundException(e.getMessage());
        }
    }

    public void isConnected() throws SQLException, ClassNotFoundException {
        if(getConnection() != null) {
            System.out.println("Connection established");
        }
        else {
            System.out.println("Connection not established");
        }
    }
}
