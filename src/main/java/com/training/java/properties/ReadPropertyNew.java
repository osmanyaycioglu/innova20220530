package com.training.java.properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertyNew {
    public static void main(String[] args) {
        PropertyEngine propertyEngine = new PropertyEngine();
        ApplicationConfig applicationConfig = (ApplicationConfig) propertyEngine.readProperty(new ApplicationConfig());
        System.out.println(applicationConfig);

        XyzProperty xyzProperty = (XyzProperty) propertyEngine.readProperty(new XyzProperty());
        System.out.println(xyzProperty);
    }

}
