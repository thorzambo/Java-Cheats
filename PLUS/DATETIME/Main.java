import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Main {
    
    public static void main(String[] args) {

        LocalDate localdatenow = LocalDate.now();
        System.out.println(localdatenow);

        LocalTime localtime = LocalTime.now();
        System.out.println(localtime);

        LocalDateTime lcaldatetime = LocalDateTime.now();
        System.out.println(lcaldatetime);

        DateTimeFormatter format_ = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(localdatenow.format(format_));

        DateTimeFormatter formatt_ = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println(localdatenow.format(formatt_));

        DateTimeFormatter formattt_ = DateTimeFormatter.ofPattern("E, dd MMMM yyyy");
        System.out.println(localdatenow.format(formattt_));
    }
    
}