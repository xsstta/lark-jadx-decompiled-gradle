package com.facebook.battery.metrics.network;

import com.facebook.battery.metrics.core.SystemMetrics;

public class NetworkMetrics extends SystemMetrics<NetworkMetrics> {
    public long mobileBytesRx;
    public long mobileBytesTx;
    public long wifiBytesRx;
    public long wifiBytesTx;

    public int hashCode() {
        long j = this.mobileBytesTx;
        long j2 = this.mobileBytesRx;
        long j3 = this.wifiBytesTx;
        long j4 = this.wifiBytesRx;
        return (((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)));
    }

    public String toString() {
        return "NetworkMetrics{mobileBytesTx=" + this.mobileBytesTx + ", mobileBytesRx=" + this.mobileBytesRx + ", wifiBytesTx=" + this.wifiBytesTx + ", wifiBytesRx=" + this.wifiBytesRx + '}';
    }

    public NetworkMetrics set(NetworkMetrics networkMetrics) {
        this.mobileBytesRx = networkMetrics.mobileBytesRx;
        this.mobileBytesTx = networkMetrics.mobileBytesTx;
        this.wifiBytesRx = networkMetrics.wifiBytesRx;
        this.wifiBytesTx = networkMetrics.wifiBytesTx;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetworkMetrics networkMetrics = (NetworkMetrics) obj;
        if (this.mobileBytesTx == networkMetrics.mobileBytesTx && this.mobileBytesRx == networkMetrics.mobileBytesRx && this.wifiBytesTx == networkMetrics.wifiBytesTx && this.wifiBytesRx == networkMetrics.wifiBytesRx) {
            return true;
        }
        return false;
    }

    public NetworkMetrics diff(NetworkMetrics networkMetrics, NetworkMetrics networkMetrics2) {
        if (networkMetrics2 == null) {
            networkMetrics2 = new NetworkMetrics();
        }
        if (networkMetrics == null) {
            networkMetrics2.set(this);
        } else {
            networkMetrics2.mobileBytesTx = this.mobileBytesTx - networkMetrics.mobileBytesTx;
            networkMetrics2.mobileBytesRx = this.mobileBytesRx - networkMetrics.mobileBytesRx;
            networkMetrics2.wifiBytesTx = this.wifiBytesTx - networkMetrics.wifiBytesTx;
            networkMetrics2.wifiBytesRx = this.wifiBytesRx - networkMetrics.wifiBytesRx;
        }
        return networkMetrics2;
    }

    public NetworkMetrics sum(NetworkMetrics networkMetrics, NetworkMetrics networkMetrics2) {
        if (networkMetrics2 == null) {
            networkMetrics2 = new NetworkMetrics();
        }
        if (networkMetrics == null) {
            networkMetrics2.set(this);
        } else {
            networkMetrics2.mobileBytesTx = this.mobileBytesTx + networkMetrics.mobileBytesTx;
            networkMetrics2.mobileBytesRx = this.mobileBytesRx + networkMetrics.mobileBytesRx;
            networkMetrics2.wifiBytesTx = this.wifiBytesTx + networkMetrics.wifiBytesTx;
            networkMetrics2.wifiBytesRx = this.wifiBytesRx + networkMetrics.wifiBytesRx;
        }
        return networkMetrics2;
    }
}
