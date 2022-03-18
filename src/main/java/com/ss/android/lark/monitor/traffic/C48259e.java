package com.ss.android.lark.monitor.traffic;

import com.ss.android.lark.monitor.AbstractC48230h;
import com.ss.android.lark.monitor.traffic.TrafficMetricsLog;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.monitor.traffic.e */
public class C48259e extends C48255a<TrafficMetrics> {

    /* renamed from: c */
    private AbstractC48230h f121524c;

    @Override // com.ss.android.lark.monitor.traffic.C48255a
    /* renamed from: a */
    public TrafficMetrics mo168840a() {
        long[] jArr;
        TrafficMetrics trafficMetrics = new TrafficMetrics();
        trafficMetrics.from = "rust";
        if (this.f121524c == null) {
            return trafficMetrics;
        }
        if (this.f121517a == null || !((TrafficMetrics) this.f121517a).isValid()) {
            jArr = this.f121524c.mo168765a();
        } else {
            jArr = this.f121524c.mo168766a(new long[]{((TrafficMetrics) this.f121517a).mobileBytesRx, ((TrafficMetrics) this.f121517a).mobileBytesTx, ((TrafficMetrics) this.f121517a).wifiBytesRx, ((TrafficMetrics) this.f121517a).wifiBytesTx});
        }
        if (jArr != null) {
            trafficMetrics.mobileBytesRx = jArr[0];
            trafficMetrics.mobileBytesTx = jArr[1];
            trafficMetrics.wifiBytesRx = jArr[2];
            trafficMetrics.wifiBytesTx = jArr[3];
        }
        this.f121518b = trafficMetrics;
        return trafficMetrics;
    }

    /* renamed from: a */
    public void mo168845a(TrafficMetrics trafficMetrics) {
        this.f121517a = trafficMetrics;
    }

    public C48259e(AbstractC48230h hVar) {
        this.f121524c = hVar;
    }

    @Override // com.ss.android.lark.monitor.traffic.C48255a, com.ss.android.lark.monitor.traffic.AbstractC48257c
    /* renamed from: a */
    public void mo168843a(TrafficReportTeaData trafficReportTeaData) {
        if (this.f121518b != null) {
            trafficReportTeaData.rust = this.f121518b.totalKBytes();
        }
    }

    @Override // com.ss.android.lark.monitor.traffic.C48255a, com.ss.android.lark.monitor.traffic.AbstractC48257c
    /* renamed from: a */
    public void mo168841a(TrafficMetricsLog trafficMetricsLog) {
        if (this.f121518b != null) {
            trafficMetricsLog.addItemIfValid(new TrafficMetricsLog.MetricLogItem(this.f121518b.from, this.f121518b));
        }
    }
}
