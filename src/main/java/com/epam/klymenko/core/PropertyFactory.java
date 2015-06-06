package com.epam.klymenko.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Liliia_Klymenko on 04-Jun-15.
 */
public class PropertyFactory {

    public static final String PROPERTY_FILE = "test.properties";
    private static Properties properties;


    public static Properties getInstance() {
        if (null == properties) {
            properties = new Properties();
            InputStream is;
            try {
                is = new FileInputStream(PROPERTY_FILE);
                properties.load(is);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return properties;
    }

    public static Properties getInstance(String fileName) {
        if (null == properties) {
            properties = new Properties();
            InputStream is;
            try {
                is = new FileInputStream(fileName);
                properties.load(is);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return properties;
    }
}