package edu.wgu.d387_sample_code.language;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class SearchBundle {
    public String[] getWelcomeMessage(InputStream inputStream) {
        Properties properties = new Properties();
        String[] welcomeArray = new String[1];

        try{
           properties.load(inputStream);
           String welcomeMessage = properties.getProperty("welcomeMessage");
                welcomeArray[0] = welcomeMessage;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return welcomeArray;
    }
}