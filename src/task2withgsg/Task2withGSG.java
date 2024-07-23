package task2withgsg;

public class Task2withGSG {
    public static void main(String[] args) {
        AppConfig config = AppConfig.getInstance();

        // Print default configuration settings
        System.out.println("App Name: " + config.getAppName());
        System.out.println("App Version: " + config.getAppVersion());
        System.out.println("Default Language: " + config.getDefaultLanguage());

        // Modify configuration settings
        config.setAppName("MyUpdatedApplication");
        config.setAppVersion("2.0.0");
        config.setDefaultLanguage("fr");

        // Get another instance of AppConfig and print updated settings
        AppConfig anotherConfig = AppConfig.getInstance();
        System.out.println("Updated App Name: " + anotherConfig.getAppName());
        System.out.println("Updated App Version: " + anotherConfig.getAppVersion());
        System.out.println("Updated Default Language: " + anotherConfig.getDefaultLanguage());

        // Verify that both config instances are the same
        if (config == anotherConfig) {
            System.out.println("Both configuration instances are the same.");
        }
    }
}


/*The singleton pattern is used to ensure that a class has only one instance and provides a global point of access to it.
  Here’s why the AppConfig class is a good candidate for the singleton pattern:

Single Source of Truth:
Centralized Configuration: The AppConfig class manages application-wide settings such as the application name, version, and default language.
By using a singleton, you ensure that there is a single source of truth for these settings.

Consistency: With a single instance managing the configuration, all parts of the application access the same configuration data.
This prevents discrepancies that could occur if multiple instances with different settings were used.

Controlled Access:
Global Access Point: The singleton pattern provides a global point of access to the configuration settings.
Any part of the application can easily get the current configuration by calling AppConfig.getInstance().

Controlled Modifications: By having a single instance, you can control and manage modifications to the configuration settings centrally, 
ensuring that changes are propagated throughout the application.

Efficient Resource Use: Only one instance of the AppConfig class is created, which can be more efficient in terms of memory and resource usage compared to creating multiple instances.
Ease of Maintenance:

Synchronized Access: In a multithreaded environment, using a singleton with proper synchronization 
(e.g., the synchronized keyword in the getInstance method) ensures that the class is thread-safe and only one instance is created,
even when accessed by multiple threads simultaneously.*/