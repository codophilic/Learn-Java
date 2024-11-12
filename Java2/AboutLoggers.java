import java.util.logging.*;

public class AboutLoggers {
    private static final Logger logger = Logger.getLogger(AboutLoggers.class.getName());

    public static void main(String[] args) {
        try {
            Logger rootLogger = Logger.getLogger("");
            for ( Handler handler : rootLogger.getHandlers()) {
                rootLogger.removeHandler(handler);
            }

            /**
             * Setting Level Of Logger
             */
            logger.setLevel(Level.FINEST);

            // ConsoleHandler with SimpleFormatter
            ConsoleHandler consoleHandler = new ConsoleHandler();
            consoleHandler.setFormatter(new SimpleFormatter());

            /**
             * Setting Level of ConsoleHandler
             */
            consoleHandler.setLevel(Level.FINEST);
            logger.addHandler(consoleHandler);

            // FileHandler with XMLFormatter
            FileHandler fileHandler = new FileHandler("app.log");
            fileHandler.setFormatter(new SimpleFormatter());

            /**
             * Setting Level of FileHandler
             */
            fileHandler.setLevel(Level.FINEST);
            logger.addHandler(fileHandler);

            // Logging events at different levels
            logger.severe("This is a severe error message");
            logger.warning("This is a warning message");
            logger.info("This is an info message");
            logger.config("This is a config message");
            logger.fine("This is a fine message");
            logger.finer("This is a finer message");
            logger.finest("This is a finest message");


        } catch (Exception e) {
            logger.severe("Failed to initialize handlers: " + e.getMessage());
        }
    }
}
