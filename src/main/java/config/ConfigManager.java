package config;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfigManager {
    private static Properties properties = new Properties();

    static {
        try (InputStream input = new FileInputStream("config.properties")) {
            properties.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getBaseUrl() {
        return properties.getProperty("base.url");
    }
}
