package exercise_8.logger;

public class Logger {
    private static Logger instance;
    private Logger() {

    }

    public static Logger getInstance(){
        if(Logger.instance == null)
            instance = new Logger();
        return instance;

       // Logger logger = Logger.getInstance();
       // Logger logger1 = Logger.getInstance();
       // System.out.println(logger1);

    }
}
