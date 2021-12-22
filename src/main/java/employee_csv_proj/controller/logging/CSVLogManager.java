package employee_csv_proj.controller.logging;

import java.io.IOException;
import java.util.logging.*;

public class CSVLogManager {

    private static CSVLogManager instance;
    private Logger logger = Logger.getLogger("employeeCSVLogger");

    private CSVLogManager() {}

    public static CSVLogManager getInstance() {
        if(instance == null ) {
            instance = new CSVLogManager();
        }

        return instance;
    }

    public void setupLog() {
        try {
            Handler fileHandler = new FileHandler("src/main/java/employee_csv_proj/controller/logging/employeeCSVLog.log",true);
            logger.addHandler(fileHandler);
            fileHandler.setFormatter(new SimpleFormatter());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void logMessage(Level level, String message) {
        logger.log(level, message);
    }


}
