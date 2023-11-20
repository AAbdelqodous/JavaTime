import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class PeriodDuration {
    public static void main(String[] args) {

        Period period = Period.between(
                LocalDate.of(2021, 10,1),
                LocalDate.now()
        );
        System.out.println(period);

        Duration duration = Duration.between(
                LocalDate.of(2021, 10,1),
                LocalDate.now()
        );
        System.out.println(duration);
    }
}
