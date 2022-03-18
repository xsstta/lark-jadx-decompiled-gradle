package com.facebook.battery.metrics.network;

import com.facebook.battery.metrics.core.SystemMetrics;

public class RadioStateMetrics extends SystemMetrics<RadioStateMetrics> {
    public long mobileHighPowerActiveS;
    public long mobileLowPowerActiveS;
    public int mobileRadioWakeupCount;
    public long wifiActiveS;
    public int wifiRadioWakeupCount;

    public int hashCode() {
        long j = this.mobileLowPowerActiveS;
        long j2 = this.mobileHighPowerActiveS;
        long j3 = this.wifiActiveS;
        return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.mobileRadioWakeupCount) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.wifiRadioWakeupCount;
    }

    public String toString() {
        return "RadioStateMetrics{mobileLowPowerActiveS=" + this.mobileLowPowerActiveS + ", mobileHighPowerActiveS=" + this.mobileHighPowerActiveS + ", mobileRadioWakeupCount=" + this.mobileRadioWakeupCount + ", wifiActiveS=" + this.wifiActiveS + ", wifiRadioWakeupCount=" + this.wifiRadioWakeupCount + '}';
    }

    public RadioStateMetrics set(RadioStateMetrics radioStateMetrics) {
        this.mobileLowPowerActiveS = radioStateMetrics.mobileLowPowerActiveS;
        this.mobileHighPowerActiveS = radioStateMetrics.mobileHighPowerActiveS;
        this.mobileRadioWakeupCount = radioStateMetrics.mobileRadioWakeupCount;
        this.wifiActiveS = radioStateMetrics.wifiActiveS;
        this.wifiRadioWakeupCount = radioStateMetrics.wifiRadioWakeupCount;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RadioStateMetrics radioStateMetrics = (RadioStateMetrics) obj;
        if (this.mobileLowPowerActiveS == radioStateMetrics.mobileLowPowerActiveS && this.mobileHighPowerActiveS == radioStateMetrics.mobileHighPowerActiveS && this.mobileRadioWakeupCount == radioStateMetrics.mobileRadioWakeupCount && this.wifiActiveS == radioStateMetrics.wifiActiveS && this.wifiRadioWakeupCount == radioStateMetrics.wifiRadioWakeupCount) {
            return true;
        }
        return false;
    }

    public RadioStateMetrics diff(RadioStateMetrics radioStateMetrics, RadioStateMetrics radioStateMetrics2) {
        if (radioStateMetrics2 == null) {
            radioStateMetrics2 = new RadioStateMetrics();
        }
        if (radioStateMetrics == null) {
            radioStateMetrics2.set(this);
        } else {
            radioStateMetrics2.mobileLowPowerActiveS = this.mobileLowPowerActiveS - radioStateMetrics.mobileLowPowerActiveS;
            radioStateMetrics2.mobileHighPowerActiveS = this.mobileHighPowerActiveS - radioStateMetrics.mobileHighPowerActiveS;
            radioStateMetrics2.mobileRadioWakeupCount = this.mobileRadioWakeupCount - radioStateMetrics.mobileRadioWakeupCount;
            radioStateMetrics2.wifiActiveS = this.wifiActiveS - radioStateMetrics.wifiActiveS;
            radioStateMetrics2.wifiRadioWakeupCount = this.wifiRadioWakeupCount - radioStateMetrics.wifiRadioWakeupCount;
        }
        return radioStateMetrics2;
    }

    public RadioStateMetrics sum(RadioStateMetrics radioStateMetrics, RadioStateMetrics radioStateMetrics2) {
        if (radioStateMetrics2 == null) {
            radioStateMetrics2 = new RadioStateMetrics();
        }
        if (radioStateMetrics == null) {
            radioStateMetrics2.set(this);
        } else {
            radioStateMetrics2.mobileLowPowerActiveS = this.mobileLowPowerActiveS + radioStateMetrics.mobileLowPowerActiveS;
            radioStateMetrics2.mobileHighPowerActiveS = this.mobileHighPowerActiveS + radioStateMetrics.mobileHighPowerActiveS;
            radioStateMetrics2.mobileRadioWakeupCount = this.mobileRadioWakeupCount + radioStateMetrics.mobileRadioWakeupCount;
            radioStateMetrics2.wifiActiveS = this.wifiActiveS + radioStateMetrics.wifiActiveS;
            radioStateMetrics2.wifiRadioWakeupCount = this.wifiRadioWakeupCount + radioStateMetrics.wifiRadioWakeupCount;
        }
        return radioStateMetrics2;
    }
}
