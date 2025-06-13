import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Exercise31 {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2004, 6, 12);
        LocalDate today = LocalDate.now();

        // Calculate the next birthday
        LocalDate nextBirthday = birthday.withYear(today.getYear());

        // If this year's birthday has passed, take next year
        if (nextBirthday.isBefore(today) || nextBirthday.isEqual(today)) {
            nextBirthday = nextBirthday.plusYears(1);
        }

        long daysUntilNextBirthday = ChronoUnit.DAYS.between(today, nextBirthday);

        System.out.println("Days until next birthday: " + daysUntilNextBirthday);
    }
}
