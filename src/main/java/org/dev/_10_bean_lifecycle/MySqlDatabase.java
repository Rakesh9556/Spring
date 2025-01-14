package org.dev._10_bean_lifecycle;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mySql")
public class MySqlDatabase {

    // We can also inject these literal values in xml way
    @Value("${mysql.driver}")
    private String driver;

    @Value("${mysql.url}")
    private String url;

    @Value("${mysql.username}")
    private String username;

    @Value("${mysql.password}")
    private String password;

    public String getDriver() {
        return driver;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void displayDbInfo(){
        System.out.println("Database Credential: uri: " + url + " username: " + username + " password: " + password);
    }
}
