package com.company.task10;

public class Stopwatch {
    private long startTime, endTime;

    public Stopwatch() {
        setStartTime(System.currentTimeMillis());
    }

    public void start(){
        setStartTime(System.currentTimeMillis());
    }

    public void stop(){
        setEndTime(System.currentTimeMillis());
    }

    public long getElapsedTime(){
        return getEndTime()-getStartTime();
    }

    public long getElapsedTimeInSecs(){
        return getElapsedTime()/1000;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
}
