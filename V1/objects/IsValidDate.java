package objects;
import java.time.LocalDate;
import java.time.Period;
import java.time.YearMonth;

public class IsValidDate {

public boolean isValid(int d, int m, int y) {

    boolean valid = true;

    LocalDate dob = LocalDate.of(y, m, d);
    YearMonth yearMonth = YearMonth.of(y, m);
    LocalDate today = LocalDate.now();

    int age = Period.between(dob, today).getYears();
    int maxDay = yearMonth.lengthOfMonth();

    if (y > today.getYear()) {valid = false;}
            
    if (d < 1 || d > maxDay) {valid = false;}
            
    if (age > 100) {valid = false;}
        
    return valid;
}
}

