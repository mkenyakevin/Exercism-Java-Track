import java.util.Arrays;

public class LogLevels {

    public static String message(String logLine) {
        return Arrays.stream(logLine.split(":")).toList().get(1).trim();
    }

    public static String logLevel(String logLine) {
        String log = Arrays.stream(logLine.split(":")).toList().getFirst().trim();
        int length = log.length() - 1;
        return log.substring(1, length).toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
