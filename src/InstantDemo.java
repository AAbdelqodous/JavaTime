import java.time.Clock;
import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantDemo {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        Clock clock = Clock.systemUTC();
        Instant instant1 = Instant.now(clock);
        System.out.println(instant1);
    }
}
