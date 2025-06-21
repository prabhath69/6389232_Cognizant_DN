public class Logger {
    private static Logger instance = new Logger();

    private Logger() {
        System.out.println("Logger constructor called");
    }

    public static Logger getInstance() {
        return instance;
    }

    public void display(String name) {
        System.out.println("Hello Mr." + name);
    }

}