package com.ss.android.lark.monitor.traffic;

import com.alibaba.fastjson.annotation.JSONField;

/* access modifiers changed from: package-private */
public class TrafficMetrics {
    @JSONField(serialize = false)
    public String from;
    @JSONField(serialize = false)
    public long mobileBytesRx;
    @JSONField(serialize = false)
    public long mobileBytesTx;
    public float mobileKBytesRx;
    public float mobileKBytesTx;
    @JSONField(serialize = false)
    public long wifiBytesRx;
    @JSONField(serialize = false)
    public long wifiBytesTx;
    public float wifiKBytesRx;
    public float wifiKBytesTx;

    public TrafficMetrics() {
    }

    public String from() {
        return this.from;
    }

    public void reset() {
        this.wifiBytesTx = 0;
        this.wifiBytesRx = 0;
        this.mobileBytesTx = 0;
        this.mobileBytesRx = 0;
    }

    public void convert2KB() {
        this.mobileKBytesRx = ((float) this.mobileBytesRx) * 9.765625E-4f;
        this.mobileKBytesTx = ((float) this.mobileBytesTx) * 9.765625E-4f;
        this.wifiKBytesRx = ((float) this.wifiBytesRx) * 9.765625E-4f;
        this.wifiKBytesTx = ((float) this.wifiBytesTx) * 9.765625E-4f;
    }

    @JSONField(serialize = false)
    public boolean isValid() {
        if (this.mobileBytesRx > 0 || this.mobileBytesTx > 0 || this.wifiBytesRx > 0 || this.wifiBytesTx > 0) {
            return true;
        }
        return false;
    }

    public float totalKBytes() {
        return (((float) this.mobileBytesRx) * 9.765625E-4f) + (((float) this.mobileBytesTx) * 9.765625E-4f) + (((float) this.wifiBytesRx) * 9.765625E-4f) + (((float) this.wifiBytesTx) * 9.765625E-4f);
    }

    public void set(TrafficMetrics trafficMetrics) {
        this.mobileBytesRx = trafficMetrics.mobileBytesRx;
        this.mobileBytesTx = trafficMetrics.mobileBytesTx;
        this.wifiBytesRx = trafficMetrics.wifiBytesRx;
        this.wifiBytesTx = trafficMetrics.wifiBytesTx;
    }

    public TrafficMetrics(long j, long j2, long j3, long j4) {
        this.mobileBytesRx = j;
        this.mobileBytesTx = j2;
        this.wifiBytesRx = j3;
        this.wifiBytesTx = j4;
    }
}
