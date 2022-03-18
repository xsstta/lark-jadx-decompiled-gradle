package com.ss.video.rtc.engine;

public class InternalNetworkQualityInfo {
    public double fractionLost;
    public int netWorkQuality;
    public int rtt;
    public int totalBandwidth;
    public String uid;

    public String toString() {
        return "fractionLost=" + this.fractionLost + ",rtt=" + this.rtt + ",totalBandwidth=" + this.totalBandwidth + ",netWorkQuality=" + this.netWorkQuality;
    }

    public String toString2() {
        return "uid=" + this.uid + ",fractionLost=" + this.fractionLost + ",rtt=" + this.rtt + ",totalBandwidth=" + this.totalBandwidth + ",netWorkQuality=" + this.netWorkQuality;
    }

    public InternalNetworkQualityInfo(double d, int i, int i2, int i3) {
        this.uid = "";
        this.fractionLost = d;
        this.rtt = i;
        this.totalBandwidth = i2;
        this.netWorkQuality = i3;
    }

    private static InternalNetworkQualityInfo create(double d, int i, int i2, int i3) {
        return new InternalNetworkQualityInfo(d, i, i2, i3);
    }

    private static InternalNetworkQualityInfo create2(String str, double d, int i, int i2, int i3) {
        return new InternalNetworkQualityInfo(str, d, i, i2, i3);
    }

    public InternalNetworkQualityInfo(String str, double d, int i, int i2, int i3) {
        this.uid = str;
        this.fractionLost = d;
        this.rtt = i;
        this.totalBandwidth = i2;
        this.netWorkQuality = i3;
    }
}
