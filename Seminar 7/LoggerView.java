public class LoggerView implements Logger {
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
