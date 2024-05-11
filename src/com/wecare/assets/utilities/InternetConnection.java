package com.wecare.assets.utilities;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class InternetConnection {
    
    public static boolean check() {
        boolean isConnected = false;
        try {
            URL url = new URL("http://www.google.com");
            URLConnection connection = url.openConnection();
            connection.connect();
            isConnected = true;
        }
        catch (MalformedURLException e) {}
        catch (IOException e) {}
        return isConnected;
    }
}
