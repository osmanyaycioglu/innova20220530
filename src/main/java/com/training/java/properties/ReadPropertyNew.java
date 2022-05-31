package com.training.java.properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertyNew {
    public static void main(String[] args) {
        PropertyEngine<ApplicationConfig> propertyEngine = new PropertyEngine<>();
        ApplicationConfig applicationConfig = propertyEngine.readProperty(new ApplicationConfig());
        System.out.println(applicationConfig);

        PropertyEngine<XyzProperty> propertyEngine2 = new PropertyEngine<>();
        XyzProperty xyzProperty = propertyEngine2.readProperty(new XyzProperty());
        System.out.println(xyzProperty);
    }

}
