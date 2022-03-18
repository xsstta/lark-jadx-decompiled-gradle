package com.ss.android.lark.monitor.traffic;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.monitor.AbstractC48230h;
import com.ss.android.lark.monitor.traffic.TrafficMetricsLog;
import com.ss.android.lark.monitor.traffic.TrafficMonitor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.monitor.traffic.b */
public class C48256b extends C48255a {

    /* renamed from: c */
    private AbstractC48230h f121519c;

    /* renamed from: d */
    private ConcurrentHashMap<String, TrafficMetrics> f121520d = new ConcurrentHashMap<>();

    /* renamed from: e */
    private List<TrafficMetrics> f121521e;

    @Override // com.ss.android.lark.monitor.traffic.C48255a, com.ss.android.lark.monitor.traffic.AbstractC48257c
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo168844b() {
        super.mo168844b();
    }

    @Override // com.ss.android.lark.monitor.traffic.C48255a
    /* renamed from: a */
    public TrafficMetrics mo168840a() {
        ArrayList arrayList;
        TrafficMetrics trafficMetrics = new TrafficMetrics();
        trafficMetrics.from = "http";
        if (this.f121520d.isEmpty()) {
            arrayList = new ArrayList();
        } else {
            synchronized (this) {
                arrayList = new ArrayList(this.f121520d.size());
                for (Map.Entry<String, TrafficMetrics> entry : this.f121520d.entrySet()) {
                    TrafficMetrics value = entry.getValue();
                    arrayList.add(value);
                    trafficMetrics.wifiBytesRx += value.wifiBytesRx;
                    trafficMetrics.wifiBytesTx += value.wifiBytesTx;
                    trafficMetrics.mobileBytesRx += value.mobileBytesRx;
                    trafficMetrics.mobileBytesTx += value.mobileBytesTx;
                }
                this.f121520d.clear();
            }
        }
        this.f121521e = arrayList;
        return trafficMetrics;
    }

    public C48256b(AbstractC48230h hVar) {
        this.f121519c = hVar;
    }

    @Override // com.ss.android.lark.monitor.traffic.C48255a, com.ss.android.lark.monitor.traffic.AbstractC48257c
    /* renamed from: a */
    public void mo168843a(TrafficReportTeaData trafficReportTeaData) {
        List<TrafficMetrics> list = this.f121521e;
        if (list != null) {
            float f = BitmapDescriptorFactory.HUE_RED;
            for (TrafficMetrics trafficMetrics : list) {
                f += trafficMetrics.totalKBytes();
            }
            trafficReportTeaData.http = f;
        }
    }

    @Override // com.ss.android.lark.monitor.traffic.C48255a, com.ss.android.lark.monitor.traffic.AbstractC48257c
    /* renamed from: a */
    public void mo168841a(TrafficMetricsLog trafficMetricsLog) {
        if (this.f121521e != null) {
            TrafficMetricsLog.NestingMetricLogItem nestingMetricLogItem = new TrafficMetricsLog.NestingMetricLogItem("http");
            for (TrafficMetrics trafficMetrics : this.f121521e) {
                nestingMetricLogItem.addItemIfValid(new TrafficMetricsLog.MetricLogItem(trafficMetrics.from, trafficMetrics));
            }
            trafficMetricsLog.addItemIfValid(nestingMetricLogItem);
        }
    }

    @Override // com.ss.android.lark.monitor.traffic.C48255a
    /* renamed from: a */
    public void mo168842a(TrafficMonitor.C48254a aVar) {
        TrafficMetrics trafficMetrics;
        String str = aVar.f121493d;
        synchronized (this) {
            if (this.f121520d.containsKey(str)) {
                trafficMetrics = this.f121520d.get(str);
            } else {
                trafficMetrics = new TrafficMetrics();
                this.f121520d.put(str, trafficMetrics);
            }
            trafficMetrics.from = str;
            AbstractC48230h hVar = this.f121519c;
            if (hVar == null || hVar.mo168768b()) {
                trafficMetrics.wifiBytesRx += aVar.f121490a;
                trafficMetrics.wifiBytesTx += aVar.f121491b;
            } else {
                trafficMetrics.mobileBytesRx += aVar.f121490a;
                trafficMetrics.mobileBytesTx += aVar.f121491b;
            }
        }
    }
}
