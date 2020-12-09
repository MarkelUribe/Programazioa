
public class Date {
    private int day;
    private int month;
    private int year;
    
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public void setDay(int newday){
        day = newday;
    }
    public void setMonth(int newmonth){
        month = newmonth;
    }
    public void setYear(int newyear){
        year = newyear;
    }
    public void setDate(int newday, int newmonth, int newyear){
        day = newday;
        month = newmonth;
        year = newyear;
    }
    @Override
    public java.lang.String toString() {
        return getClass().getName()+day+"/"+month+"/"+year+"\n";
    }
}
