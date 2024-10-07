package objects;
import java.time.Period;
import java.time.LocalDate;

public class dob {
    int day;
    int month;
    int year;
    boolean valid;

    dob(){}

    dob(int d, int m, int y){
        day = d;
        month = m;
        year = y;

        // this checks if its a valid dob Ryan, include this in the UI so if it isnt it says no
        IsValidDate validator = new IsValidDate();
        boolean v = validator.isvalid(d, m, y);
        if(v == true){valid = true;}


    }


    // this is to that we know if we are allowed to show them like of age songs like WAP
    boolean oflegalage(dob i){
        boolean legal = true;

        LocalDate birthDate = LocalDate.of(i.year, i.month, i.day);
        LocalDate today = LocalDate.now();

        int age = Period.between(birthDate, today).getYears();
        
        if(age < 18){legal = false;}

        return legal;
    }
}
