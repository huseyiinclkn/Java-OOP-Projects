public class ConsoleLog extends BaseLog {
    public void log(String message) {
        System.out.println("Logged to Console: " + message);
    }

}
