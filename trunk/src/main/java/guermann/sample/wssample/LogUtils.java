package guermann.sample.wssample;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogUtils {

	public static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ssZ";

    public static void logException(Object obj, Exception e) {
        Logger.getLogger(obj.getClass().getName()).log(Level.SEVERE, null, e);
    }

    public static void logSevere(Object obj, String msg) {
        Logger.getLogger(obj.getClass().getName()).log(Level.SEVERE, msg);
    }

    public static void logInfo(Object obj, String msg) {
        Logger.getLogger(obj.getClass().getName()).log(Level.INFO, msg);
    }

    public static void logInfo(Class<?> clazz, String msg) {
        Logger.getLogger(clazz.getName()).log(Level.INFO, msg);
    }

    public static void logWarning(Object obj, String msg) {
        Logger.getLogger(obj.getClass().getName()).log(Level.WARNING, msg);
    }

    public static void logWarning(Object obj, String msg, Throwable ex) {
        Logger.getLogger(obj.getClass().getName()).log(Level.WARNING, msg, ex);
    }

}
