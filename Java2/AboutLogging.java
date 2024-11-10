import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AboutLogging {

    // Create a logger instance
    private static final Logger logger = Logger.getLogger(AboutLogging.class.getName());

    public static void main(String[] args) {

        // Set the log level to FINE to see all messages down to FINE
        logger.setLevel(Level.FINEST);
        

        // Get the existing ConsoleHandler and set its level to FINE
        for (var handler : logger.getParent().getHandlers()) {
            if (handler instanceof ConsoleHandler) {
                handler.setLevel(Level.FINEST);
            }
        }

        
        logger.severe("This is a SEVERE message");
        logger.warning("This is a WARNING message");
        logger.info("This is an INFO message");
        logger.config("This is a CONFIG message");
        logger.fine("This is a FINE message");
        logger.finer("This is a FINER message");
        logger.finest("This is a FINEST message");
    }
}
