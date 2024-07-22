package task2withgsg;
import java.util.ArrayList;
import java.util.List;

public class Logger {
    // The static variable to hold the single instance of Logger
    private static Logger instance;

    // List to store log messages
    private List<String> logs;

    // Private constructor to prevent instantiation
    private Logger() {
        logs = new ArrayList<>();
    }

    // Public method to provide access to the single instance
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Method to log messages
    public void log(String message) {
        logs.add(message);
        System.out.println("Log: " + message);
    }

    // Method to retrieve logged messages
    public List<String> getLogs() {
        return logs;
    }
}
