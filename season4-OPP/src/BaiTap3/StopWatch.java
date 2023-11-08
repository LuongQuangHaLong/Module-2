package BaiTap3;

import java.time.Duration;
import java.time.Instant;

public class StopWatch {
    private long startTime;
    private long stopTime;

    public StopWatch() {
        stopTime = System.currentTimeMillis();// Tra ve thoi gian hien tai cua he thong 1/1/1970
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getStopTime() {
        return stopTime;
    }

    public void setStopTime(long stopTime) {
        this.stopTime = stopTime;
    }
    public void start(){
        this.startTime=System.currentTimeMillis();
    }

    public void stop(){
        this.stopTime=System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return this.stopTime-this.startTime;
    }
}
