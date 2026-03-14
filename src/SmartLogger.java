import java.time.LocalDateTime;

public class SmartLogger implements Logger{
    private int count = 0;
    @Override
    public void log(String msg){
        count++;
        String check = msg.toLowerCase().contains("error") ? "ERROR" : "INFO";
        System.out.println(check + count + " [" + LocalDateTime.now() + "] " + msg);
    }
}
