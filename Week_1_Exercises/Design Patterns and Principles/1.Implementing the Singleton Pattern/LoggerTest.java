public class LoggerTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        if (logger1 == logger2) {
            System.out.println("Singleton pattern is working.Both instances are the same.");
        } else {
            System.out.println("Singleton pattern is NOT working.Instances are different.");
        }
        logger1.log("This is a test log message.");
    }
}
