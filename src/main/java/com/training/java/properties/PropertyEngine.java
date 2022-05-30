package com.training.java.properties;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.Properties;

public class PropertyEngine {

    public Object readProperty(Object obj) {
        Class<?> aClass = obj.getClass();
        PropertyFile propertyFile = aClass.getAnnotation(PropertyFile.class);
        if (propertyFile == null) {
            return null;
        }
        String fileName = propertyFile.value();
        try {
            File file = new File(fileName);
            FileInputStream fileInputStream = new FileInputStream(file);
            Properties properties = new Properties();
            properties.load(fileInputStream);

            Field[] declaredFields = aClass.getDeclaredFields();
            for (Field field : declaredFields) {
                PropertyBind propertyBind = field.getAnnotation(PropertyBind.class);
                if (propertyBind != null){
                    String prop = propertyBind.value();
                    String property = properties.getProperty(prop);
                    field.setAccessible(true);
                    if (String.class.getName().equals(field.getType().getName())){
                        field.set(obj,property);
                    } else if (Integer.class.getName().equals(field.getType().getName())){
                        field.set(obj,Integer.parseInt(property));
                    } else if (Long.class.getName().equals(field.getType().getName())){
                        field.set(obj,Long.parseLong(property));
                    } else if ("int".equals(field.getType().getName())){
                        field.setInt(obj,Integer.parseInt(property));
                    } else if ("long".equals(field.getType().getName())){
                        field.setLong(obj,Long.parseLong(property));
                    }
                }
            }
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
