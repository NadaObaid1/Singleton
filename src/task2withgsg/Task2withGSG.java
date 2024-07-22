/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2withgsg;

public class Task2withGSG {
    public static void main(String[] args) {
        System.out.println("Nada Obaid");
        // Obtain the single instance of Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Log messages
        logger1.log("log message1.");
        logger2.log("log message2.");
        

        // Verify that logger1 and logger2 refer to the same instance
        System.out.println(logger1 == logger2); 

        // Retrieve logged messages
        System.out.println(logger1.getLogs()); 
    }
}


/*Why the Logger Needs to be a Singleton
Single Resource Management: Logging is typically a centralized operation that needs to be managed across the entire application.
Having a single instance of the Logger ensures that all log messages go to the same place, making them easier to track and manage.

Global Access: The Singleton pattern allows all parts of the application to access the same Logger instance easily, 
without needing to pass the Logger object around the different components of the application.

Efficiency: It reduces the need to create new instances, saving memory and resources.

Consistency: Ensures that all log messages follow the same format and are stored in the same location, reducing errors and improving maintainability.

In this way, the Singleton Logger ensures that there is a single, centralized point of control for logging messages throughout the application,
promoting efficiency, consistency, and ease of management.*/
