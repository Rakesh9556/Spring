package org.dev._08_practise_property_loading;

import org.springframework.beans.factory.annotation.Value;

public class MySQL {

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

    public void displayDatabaseInfo() {
        System.out.println("Driver: " + driver + " URL: " + url + " Username: " + username + " Password: " + password);
    }

}
