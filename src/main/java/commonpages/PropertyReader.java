package commonpages;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader {

    Properties prop;
    FileInputStream file;
    String configFilePath="C:\\Users\\Shaan\\IdeaProjects\\HybridFramework\\src\\test\\resources\\TestData\\Config.properties";

    public String readProperty(String key) {
        prop= new Properties();
        try {
            file = new FileInputStream(configFilePath);
            prop.load(file);
            file.close();

        }catch(Exception e){
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }




}
