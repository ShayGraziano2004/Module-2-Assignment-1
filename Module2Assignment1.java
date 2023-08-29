import java.util.Date;

public class MyDate {
    private int year;
    private int month;
    private int day;
    
    public MyDate() {
        this(System.currentTimeMillis());
    }
    
    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }
    
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    public int getYear() {
        return year;
    }
    
    public int getMonth() {
        return month;
    }
    
    public int getDay() {
        return day;
    }
    
    public void setDate(long elapsedTime) {
        Date date = new Date(elapsedTime);
        year = date.getYear() + 1900;
        month = date.getMonth();
        day = date.getDate();
    }
    
    public static void main(String[] args) {
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(34355555133101L);
        
        System.out.println("Date 1: " + date1.getYear() + "/" + (date1.getMonth() + 1) + "/" + date1.getDay());
        System.out.println("Date 2: " + date2.getYear() + "/" + (date2.getMonth() + 1) + "/" + date2.getDay());
    }
}
