package com.ss.android.lark.monitor.traffic;

import com.ss.android.lark.monitor.AbstractC48230h;
import com.ss.android.lark.monitor.traffic.TrafficMetricsLog;
import com.ss.android.lark.monitor.traffic.TrafficMonitor;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.monitor.traffic.d */
public class C48258d extends C48255a {

    /* renamed from: c */
    private AbstractC48230h f121522c;

    /* renamed from: d */
    private volatile TrafficMetrics f121523d = new TrafficMetrics();

    @Override // com.ss.android.lark.monitor.traffic.C48255a
    /* renamed from: a */
    public TrafficMetrics mo168840a() {
        this.f121518b = new TrafficMetrics();
        this.f121518b.from = "rtc";
        synchronized (this) {
            this.f121518b.set(this.f121523d);
            this.f121523d.reset();
        }
        return this.f121518b;
    }

    public C48258d(AbstractC48230h hVar) {
        this.f121522c = hVar;
    }

    @Override // com.ss.android.lark.monitor.traffic.C48255a, com.ss.android.lark.monitor.traffic.AbstractC48257c
    /* renamed from: a */
    public void mo168843a(TrafficReportTeaData trafficReportTeaData) {
        if (this.f121518b != null) {
            trafficReportTeaData.rtc = this.f121518b.totalKBytes();
        }
    }

    @Override // com.ss.android.lark.monitor.traffic.C48255a, com.ss.android.lark.monitor.traffic.AbstractC48257c
    /* renamed from: a */
    public void mo168841a(TrafficMetricsLog trafficMetricsLog) {
        if (this.f121518b != null) {
            trafficMetricsLog.addItemIfValid(new TrafficMetricsLog.MetricLogItem(this.f121518b.from, this.f121518b));
        }
    }

    @Override // com.ss.android.lark.monitor.traffic.C48255a
    /* renamed from: a */
    public void mo168842a(TrafficMonitor.C48254a aVar) {
        AbstractC48230h hVar = this.f121522c;
        if (hVar == null || hVar.mo168768b()) {
            synchronized (this) {
                this.f121523d.wifiBytesRx += aVar.f121490a;
                this.f121523d.wifiBytesTx += aVar.f121491b;
            }
            return;
        }
        synchronized (this) {
            this.f121523d.mobileBytesRx += aVar.f121490a;
            this.f121523d.mobileBytesTx += aVar.f121491b;
        }
    }
}
