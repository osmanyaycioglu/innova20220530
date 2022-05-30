package com.training.java.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
    public static void main(String[] args) {
        try {
            File file = new File("myconfig.properties");
            FileInputStream fileInputStream = new FileInputStream(file);
            Properties properties = new Properties();
            properties.load(fileInputStream);

            ApplicationConfig applicationConfig = new ApplicationConfig();
            applicationConfig.setAppName(properties.getProperty("app.name"));
            applicationConfig.setAppVersion(properties.getProperty("app.version"));
            applicationConfig.setAppLibs(properties.getProperty("app.libs"));
            applicationConfig.setAppTestColum(properties.getProperty("app.test.colum"));
            applicationConfig.setDenemOsman(properties.getProperty("deneme.osman"));
            applicationConfig.setPort(Integer.parseInt(properties.getProperty("deneme.port")));
            System.out.println(applicationConfig);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
