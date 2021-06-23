import java.util.Date;

public class Time {
    private long timeStart = 0;
    private long timeStop = 0;

    public void start(){
        timeStart = new Date().getTime();
    }

    public void stop(){
        timeStop = new Date().getTime();
    }

    public long elapsedTime(){
        return this.timeStop - this.timeStart;
    }

//    public static void main(String[] args) {
////        long tempo = new Date().getTime();
////        String timeString = String.format("%d:%02d:%02d", tempo / 3600, (tempo % 3600) / 60, (tempo % 60));
//
////        System.out.println(timeString);
//    }
}
