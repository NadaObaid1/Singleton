package task2withgsg;

public class AppConfig {
    // Static variable to hold the single instance of the AppConfig class
    private static AppConfig instance;

    // Configuration settings as instance variables
    private String appName;
    private String appVersion;
    private String defaultLanguage;

    // Private constructor to prevent instantiation from outside
    private AppConfig() {
        // Initialize default configuration settings
        this.appName = "MyApplication";
        this.appVersion = "1.0.0";
        this.defaultLanguage = "en";
    }

    // Public method to provide access to the single instance
    public static synchronized AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    // Getter and setter methods for configuration settings
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getDefaultLanguage() {
        return defaultLanguage;
    }

    public void setDefaultLanguage(String defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
    }
}