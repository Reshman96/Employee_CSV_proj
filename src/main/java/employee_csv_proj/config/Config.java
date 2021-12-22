package employee_csv_proj.config;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Config {
    // src/main/resources/config.properties
    private static final Properties config;

    static {
        config = new Properties();
        try {
            config.load(new BufferedReader(new FileReader("config.properties")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String employeeCSVFileLocation() {
        return config.getProperty("employee_csv_file_location");
    }
    public static String dbConnectionURL(){
        return config.getProperty("db_connection");
    }
    public static String dbUsernameURL(){
        return config.getProperty("username");
    }
    public static String dbPasswordURL(){
        return config.getProperty("password");
    }
    public static String dbNameURL(){
        return config.getProperty("db_name");
    }
}
