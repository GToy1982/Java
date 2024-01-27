import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {
    private long year;
    private long month;
    private long day;

    // No-arg constructor for the current date
    public MyDate() {
        this(System.currentTimeMillis());
    }

    // Constructor with specified elapsed time
    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    // Constructor with specified year, month, and day
    public MyDate(long year, long month, long day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Getter method for year
    public long getYear() {
        return year;
    }

    // Getter method for month
    public long getMonth() {
        return month;
    }

    // Getter method for day
    public long getDay() {
        return day;
    }

    // Method to set a new date using elapsed time
    public void setDate(long elapsedTime) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);

        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    // Test program
    public static void main(String[] args) {
        // Create MyDate objects
        MyDate currentDate = new MyDate();
        MyDate specificDate = new MyDate(34355555133101L);

        // Display information
        System.out.println("Current Date: " + currentDate.getYear() + "-"
                + (currentDate.getMonth() + 1) + "-" + currentDate.getDay());
        System.out.println("Specific Date: " + specificDate.getYear() + "-"
                + (specificDate.getMonth() + 1) + "-" + specificDate.getDay());
    }
}
