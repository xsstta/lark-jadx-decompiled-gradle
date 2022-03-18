package com.ss.android.vc.irtc;

import java.io.Serializable;

public class RtcDevicePerfInfo implements Serializable {
    public int cpuCores;
    public float cpuFrequency;
    public String cpuModel;
    public int cpuThreads;
    public String deviceModel;
    public String gpuModel;
    public float memory;
    public String os;
    public String osVersion;

    public String toString() {
        return "RtcDevicePerfInfo{memory=" + this.memory + ", cpuCores=" + this.cpuCores + ", cpuThreads=" + this.cpuThreads + ", cpuFrequency=" + this.cpuFrequency + ", cpuModel='" + this.cpuModel + '\'' + ", gpuModel='" + this.gpuModel + '\'' + ", os='" + this.os + '\'' + ", osVersion='" + this.osVersion + '\'' + ", deviceModel='" + this.deviceModel + '\'' + '}';
    }
}
