package com.facebook.battery.metrics.network;

import com.facebook.battery.metrics.core.SystemMetrics;

public class EnhancedNetworkMetrics extends SystemMetrics<EnhancedNetworkMetrics> {
    public final NetworkMetrics bgMetrics = new NetworkMetrics();
    public final NetworkMetrics fgMetrics = new NetworkMetrics();
    public boolean supportsBgDetection;

    public int hashCode() {
        return ((((this.supportsBgDetection ? 1 : 0) * 31) + this.fgMetrics.hashCode()) * 31) + this.bgMetrics.hashCode();
    }

    public EnhancedNetworkMetrics set(EnhancedNetworkMetrics enhancedNetworkMetrics) {
        this.fgMetrics.set(enhancedNetworkMetrics.fgMetrics);
        this.bgMetrics.set(enhancedNetworkMetrics.bgMetrics);
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnhancedNetworkMetrics enhancedNetworkMetrics = (EnhancedNetworkMetrics) obj;
        if (this.supportsBgDetection == enhancedNetworkMetrics.supportsBgDetection && this.fgMetrics.equals(enhancedNetworkMetrics.fgMetrics) && this.bgMetrics.equals(enhancedNetworkMetrics.bgMetrics)) {
            return true;
        }
        return false;
    }

    public EnhancedNetworkMetrics diff(EnhancedNetworkMetrics enhancedNetworkMetrics, EnhancedNetworkMetrics enhancedNetworkMetrics2) {
        if (enhancedNetworkMetrics2 == null) {
            enhancedNetworkMetrics2 = new EnhancedNetworkMetrics();
        }
        if (enhancedNetworkMetrics == null) {
            enhancedNetworkMetrics2.set(this);
        } else {
            this.fgMetrics.diff(enhancedNetworkMetrics.fgMetrics, enhancedNetworkMetrics2.fgMetrics);
            this.bgMetrics.diff(enhancedNetworkMetrics.bgMetrics, enhancedNetworkMetrics2.bgMetrics);
        }
        return enhancedNetworkMetrics2;
    }

    public EnhancedNetworkMetrics sum(EnhancedNetworkMetrics enhancedNetworkMetrics, EnhancedNetworkMetrics enhancedNetworkMetrics2) {
        if (enhancedNetworkMetrics2 == null) {
            enhancedNetworkMetrics2 = new EnhancedNetworkMetrics();
        }
        if (enhancedNetworkMetrics == null) {
            enhancedNetworkMetrics2.set(this);
        } else {
            this.fgMetrics.sum(enhancedNetworkMetrics.fgMetrics, enhancedNetworkMetrics2.fgMetrics);
            this.bgMetrics.sum(enhancedNetworkMetrics.bgMetrics, enhancedNetworkMetrics2.bgMetrics);
        }
        return enhancedNetworkMetrics2;
    }
}
