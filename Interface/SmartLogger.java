import java.time.LocalDateTime;

public class SmartLogger implements Logger {
    private int counter = 0;

    @Override
    public void log(String msg) {
        counter++;
        if (msg.contains("error")) {
            System.out.printf("ERROR#%d" + " [%s] " + "%s \n", counter, LocalDateTime.now(), msg);
        } else {
            System.out.printf("INFO#%d" + " [%s] " + "%s \n", counter, LocalDateTime.now(),msg);
        }
    }
}
