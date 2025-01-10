package org.dev.practisepropertyloading;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Database {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        DbConnection dbConnection = context.getBean("dbConnect", DbConnection.class);
        dbConnection.isConnected();
    }


}
