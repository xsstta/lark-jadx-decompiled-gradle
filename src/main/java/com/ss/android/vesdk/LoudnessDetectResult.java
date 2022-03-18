package com.ss.android.vesdk;

public class LoudnessDetectResult {
    public double avgLoudness;
    public double peakLoudness;
    public int result;

    public String toString() {
        return "LoudnessDetectResult{result=" + this.result + ", avgLoudness=" + this.avgLoudness + ", peakLoudness=" + this.peakLoudness + '}';
    }
}
