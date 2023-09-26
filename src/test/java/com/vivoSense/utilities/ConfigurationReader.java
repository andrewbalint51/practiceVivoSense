package com.vivoSense.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //Create a properties object. make it static
    private static Properties properties = new Properties();

    static {
        try{
            //Open a file with the path to config.properties
            FileInputStream fileInputStream = new FileInputStream("config.properties");

            //load the file into the properties object
            properties.load(fileInputStream);

        }
        catch (IOException e){ //Catch exception if needed
            System.out.println("File not found in ConfigurationReader class");
            e.printStackTrace();
        }


    }
    
    //Get the property specified in the keyword
    public static String getProperty(String keyword){return properties.getProperty(keyword);}


}
