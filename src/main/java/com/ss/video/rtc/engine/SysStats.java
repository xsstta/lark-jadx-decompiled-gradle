package com.ss.video.rtc.engine;

public class SysStats {
    public double cpu_app_usage;
    public double cpu_total_usage;
    public double memory_usage;

    public SysStats() {
    }

    public String toString() {
        return "SysStats{ cpu_app_usage=" + this.cpu_app_usage + '\'' + ", cpu_total_usage=" + this.cpu_total_usage + ", memory_usage=" + this.memory_usage + '}';
    }

    public SysStats(double d, double d2, double d3) {
        this.cpu_app_usage = d;
        this.cpu_total_usage = d2;
        this.memory_usage = d3;
    }

    private static SysStats create(double d, double d2, double d3) {
        return new SysStats(d, d2, d3);
    }
}
