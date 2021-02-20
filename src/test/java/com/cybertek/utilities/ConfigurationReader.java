package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //In this class we will implement the repeated steps of reading
    //from configuration.properties file

    //create one utility method that is reading from configuration.properties

    //#1-create the object of Properties
    private static Properties properties=new Properties();
    static {


        FileInputStream file= null;
        try {
            file = new FileInputStream("configuration.properties");

            properties.load(file);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String getProperty(String keyWord){
        return properties.getProperty(keyWord);


    }











}
