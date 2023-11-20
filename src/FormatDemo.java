import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDemo {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println( df.format(ldt));

        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println( df.format(zdt));
    }
}
