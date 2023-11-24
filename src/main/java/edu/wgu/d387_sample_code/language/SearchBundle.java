package edu.wgu.d387_sample_code.language;

import org.springframework.web.bind.annotation.CrossOrigin;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;
@CrossOrigin
public class SearchBundle {
    public String[] getWelcomeMessage(InputStream inputStream, InputStream inputStream2) {
        Properties properties = new Properties();
        String[] welcomeArray = new String[2];

        try{
           properties.load(inputStream);
           String welcomeMessage = properties.getProperty("welcomeMessage");
                welcomeArray[0] = welcomeMessage;
        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
            properties.load(inputStream2);
            String welcomeMessage = properties.getProperty("welcomeMessage");
            welcomeArray[1] = welcomeMessage;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return welcomeArray;
    }
}