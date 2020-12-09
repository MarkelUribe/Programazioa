
public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
            
    }
    public Time(String time) {
        String shour="";
        String sminute="";
        String ssecond="";
        
        for(int i = 0;i<8;i++){
            if(i==0||i==1){
                shour += time.charAt(i);
            }if(i==3||i==4){
                sminute += time.charAt(i);
            }if(i==6||i==7){
                ssecond += time.charAt(i);
            }
        }
        this.hour = Integer.parseInt(shour);
        this.minute = Integer.parseInt(sminute);
        this.second = Integer.parseInt(ssecond);
        
        
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int newhour) {
        hour = newhour;
    }

    public void setMinute(int newminute) {
        minute = newminute;
    }

    public void setSecond(int newsecond) {
        second = newsecond;
    }

    public void setTime(int newhour, int newminute, int newsecond) {
        hour = newhour;
        minute = newminute;
        second = newsecond;
    }
    
    public Time nextSecond() {
        this.second += 1;
        return this;
    }

    public Time previousSecond() {
        this.second -= 1;
        return this;
    }
    public Time nextMinute() {
        this.minute += 1;
        return this;
    }
    public Time nextHour() {
        this.hour += 1;
        return this;
    }

    @Override
    public java.lang.String toString() {
        if(second >=60){
            while(second>=60){
                second -= 60;
                nextMinute();
            }
        }if(minute >=60){
            while(minute>=60){
                minute -= 60;
                nextHour();
            }
        }
        return getClass().getName() +" "+ String.format("%02d", hour) + ":" + 
               String.format("%02d", minute) + ":" + 
               String.format("%02d", second) + "\n";
    }
}
