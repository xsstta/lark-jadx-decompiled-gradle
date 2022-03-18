package com.facebook.battery.metrics.network;

import android.content.Context;
import com.facebook.battery.metrics.core.AbstractC20997b;
import com.facebook.battery.metrics.core.C20998c;
import java.util.Arrays;

/* renamed from: com.facebook.battery.metrics.network.b */
public class C21006b extends AbstractC20997b<NetworkMetrics> {

    /* renamed from: a */
    private boolean f51389a = true;

    /* renamed from: b */
    private final AbstractC21005a f51390b;

    /* renamed from: c */
    private final long[] f51391c;

    /* renamed from: d */
    private final long[] f51392d;

    /* renamed from: a */
    public NetworkMetrics mo71110b() {
        return new NetworkMetrics();
    }

    /* renamed from: b */
    static void m76526b(NetworkMetrics networkMetrics) {
        networkMetrics.mobileBytesTx = 0;
        networkMetrics.mobileBytesRx = 0;
        networkMetrics.wifiBytesTx = 0;
        networkMetrics.wifiBytesRx = 0;
    }

    public C21006b(Context context) {
        this.f51390b = AbstractC21005a.m76520a(context);
        this.f51391c = AbstractC21005a.m76521a();
        this.f51392d = AbstractC21005a.m76521a();
    }

    /* renamed from: a */
    public synchronized boolean mo71109a(NetworkMetrics networkMetrics) {
        if (this.f51389a) {
            if (this.f51390b.mo71154a(this.f51391c)) {
                boolean a = m76525a(this.f51391c, this.f51392d);
                this.f51389a = a;
                if (!a) {
                    return false;
                }
                boolean b = this.f51390b.mo71155b();
                m76526b(networkMetrics);
                m76524a(networkMetrics, this.f51391c, 0);
                if (b) {
                    m76524a(networkMetrics, this.f51391c, 4);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m76525a(long[] jArr, long[] jArr2) {
        for (int i = 0; i < jArr.length; i++) {
            if (jArr[i] < jArr2[i]) {
                C20998c.m76504a("NetworkMetricsCollector", "Network Bytes decreased from " + Arrays.toString(jArr2) + " to " + Arrays.toString(jArr));
                return false;
            }
        }
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        return true;
    }

    /* renamed from: a */
    static void m76524a(NetworkMetrics networkMetrics, long[] jArr, int i) {
        networkMetrics.mobileBytesTx += jArr[i | 3];
        networkMetrics.mobileBytesRx += jArr[i | 2];
        networkMetrics.wifiBytesTx += jArr[i | 1];
        networkMetrics.wifiBytesRx += jArr[i | 0];
    }
}
