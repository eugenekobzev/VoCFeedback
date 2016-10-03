package framework.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by eugen on 16.09.2016.
 */
public class PropertyLoader {

        InputStream inputStream;

        public String getPropValues( String propertyName ) throws IOException {
            String propertyValue ="";

            try {
                Properties prop = new Properties();
                String propFileName = "config/config.properties";


                inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

                if (inputStream != null) {
                    prop.load(inputStream);
                } else {
                    throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
                }

                // get the property value
                switch (propertyName) {
                    case "login":
                        propertyValue = prop.getProperty("login");
                        break;
                    case "password":
                        propertyValue = prop.getProperty("password");
                        break;
                    case "SSO":
                        propertyValue = prop.getProperty("SSO");
                        break;
                    case "feedback":
                        propertyValue = prop.getProperty("feedback");
                        break;
                    case "browser":
                        propertyValue = prop.getProperty("browser");
                        break;
                }



            } catch (Exception e) {
                System.out.println("Exception: " + e);
            } finally {
                inputStream.close();
            }

            return propertyValue;
        }
    }

