package com.ss.android.lark.monitor.traffic;

import android.content.Context;
import com.facebook.battery.metrics.core.C20996a;
import com.facebook.battery.metrics.network.C21006b;
import com.facebook.battery.metrics.network.NetworkMetrics;
import com.ss.android.lark.monitor.traffic.TrafficMetricsLog;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.monitor.traffic.f */
public class C48260f extends C48255a {

    /* renamed from: c */
    private C21006b f121525c;

    /* renamed from: d */
    private C20996a<NetworkMetrics, C21006b> f121526d;

    /* renamed from: e */
    private boolean f121527e;

    C48260f() {
    }

    @Override // com.ss.android.lark.monitor.traffic.C48255a
    /* renamed from: a */
    public TrafficMetrics mo168840a() {
        TrafficMetrics trafficMetrics = new TrafficMetrics();
        if (this.f121527e) {
            NetworkMetrics a = this.f121526d.mo71115a();
            if (a != null) {
                trafficMetrics.mobileBytesRx = a.mobileBytesRx;
                trafficMetrics.mobileBytesTx = a.mobileBytesTx;
                trafficMetrics.wifiBytesRx = a.wifiBytesRx;
                trafficMetrics.wifiBytesTx = a.wifiBytesTx;
            }
            trafficMetrics.from = "total";
            this.f121518b = trafficMetrics;
        }
        return trafficMetrics;
    }

    @Override // com.ss.android.lark.monitor.traffic.C48255a, com.ss.android.lark.monitor.traffic.AbstractC48257c
    /* renamed from: a */
    public void mo168843a(TrafficReportTeaData trafficReportTeaData) {
        if (this.f121518b != null) {
            trafficReportTeaData.total = this.f121518b.totalKBytes();
        }
    }

    @Override // com.ss.android.lark.monitor.traffic.C48255a, com.ss.android.lark.monitor.traffic.AbstractC48257c
    /* renamed from: a */
    public void mo168841a(TrafficMetricsLog trafficMetricsLog) {
        if (this.f121518b != null) {
            trafficMetricsLog.addItemIfValid(new TrafficMetricsLog.MetricLogItem(this.f121518b.from, this.f121518b));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo168846a(Context context, boolean z) {
        C21006b bVar = new C21006b(context);
        this.f121525c = bVar;
        this.f121526d = new C20996a<>(bVar);
        this.f121527e = z;
    }
}
