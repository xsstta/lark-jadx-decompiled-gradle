package com.ss.android.vc.irtc;

import java.io.Serializable;

public class RtcSystemUsageInfo implements Serializable {
    public double cpuAppUsage;
    public double cpuTotalUsage;
    public long memoryAppUsage;
    public long memoryTotalUsage;

    public String toString() {
        return "RtcSystemUsageInfo{cpuTotalUsage=" + this.cpuTotalUsage + ", cpuAppUsage=" + this.cpuAppUsage + ", memoryTotalUsage=" + this.memoryTotalUsage + ", memoryAppUsage=" + this.memoryAppUsage + '}';
    }
}
