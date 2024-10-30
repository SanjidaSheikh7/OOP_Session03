public class Logger {
    private static Logger logInstance;
    private Logger() {
    }
    public static Logger getLoggerInstance() {
        if(logInstance == null){
            logInstance = new Logger();
        }
        return logInstance;
    }

    public void logPrint(String log){
        System.out.println(log);
    }

}
