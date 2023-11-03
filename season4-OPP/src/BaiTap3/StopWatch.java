package BaiTap3;

import java.time.Duration;
import java.time.Instant;

public class StopWatch {
    private Instant startTime;
    private Instant endTime;

    public Instant getStartTime() {
        return startTime;
    }

    public Instant getEndTime() {
        return endTime;
    }
    public StopWatch() {
    }

    public StopWatch(Instant startTime) {
        this.startTime = Instant.now();
    }
    public void start(){
        this.startTime= Instant.now();
    }
    public void stop(){
        this.endTime = Instant.now();
    }
    public long getElapsedTime(){
        if (endTime==null){  // chưa gọi end
            Instant currentTime = Instant.now();
            return Duration.between(startTime,currentTime).toMillis();
        }else {
            // đã gọi end
            return Duration.between(startTime,endTime).toMillis();
        }
    }
}
