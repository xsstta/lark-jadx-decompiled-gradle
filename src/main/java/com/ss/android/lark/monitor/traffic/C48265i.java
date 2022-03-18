package com.ss.android.lark.monitor.traffic;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.monitor.AbstractC48230h;
import com.ss.android.lark.monitor.traffic.TrafficMetricsLog;
import com.ss.android.lark.monitor.traffic.TrafficMonitor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.monitor.traffic.i */
public class C48265i extends C48255a {

    /* renamed from: c */
    private AbstractC48230h f121532c;

    /* renamed from: d */
    private final ConcurrentHashMap<String, TrafficMetrics> f121533d = new ConcurrentHashMap<>(4);

    /* renamed from: e */
    private List<TrafficMetrics> f121534e;

    @Override // com.ss.android.lark.monitor.traffic.C48255a
    /* renamed from: a */
    public TrafficMetrics mo168840a() {
        ArrayList arrayList;
        TrafficMetrics trafficMetrics = new TrafficMetrics();
        trafficMetrics.from = "web";
        if (this.f121533d.isEmpty()) {
            arrayList = new ArrayList();
        } else {
            synchronized (this) {
                arrayList = new ArrayList(this.f121533d.size());
                for (Map.Entry<String, TrafficMetrics> entry : this.f121533d.entrySet()) {
                    TrafficMetrics value = entry.getValue();
                    arrayList.add(value);
                    trafficMetrics.wifiBytesRx += value.wifiBytesRx;
                    trafficMetrics.wifiBytesTx += value.wifiBytesTx;
                    trafficMetrics.mobileBytesRx += value.mobileBytesRx;
                    trafficMetrics.mobileBytesTx += value.mobileBytesTx;
                }
                this.f121533d.clear();
            }
        }
        this.f121534e = arrayList;
        return trafficMetrics;
    }

    public C48265i(AbstractC48230h hVar) {
        this.f121532c = hVar;
    }

    @Override // com.ss.android.lark.monitor.traffic.C48255a, com.ss.android.lark.monitor.traffic.AbstractC48257c
    /* renamed from: a */
    public void mo168843a(TrafficReportTeaData trafficReportTeaData) {
        List<TrafficMetrics> list = this.f121534e;
        if (list != null) {
            float f = BitmapDescriptorFactory.HUE_RED;
            for (TrafficMetrics trafficMetrics : list) {
                f += trafficMetrics.totalKBytes();
            }
            trafficReportTeaData.web = f;
        }
    }

    @Override // com.ss.android.lark.monitor.traffic.C48255a, com.ss.android.lark.monitor.traffic.AbstractC48257c
    /* renamed from: a */
    public void mo168841a(TrafficMetricsLog trafficMetricsLog) {
        if (this.f121534e != null) {
            TrafficMetricsLog.NestingMetricLogItem nestingMetricLogItem = new TrafficMetricsLog.NestingMetricLogItem("web");
            for (TrafficMetrics trafficMetrics : this.f121534e) {
                nestingMetricLogItem.addItemIfValid(new TrafficMetricsLog.MetricLogItem(trafficMetrics.from, trafficMetrics));
            }
            trafficMetricsLog.addItemIfValid(nestingMetricLogItem);
        }
    }

    @Override // com.ss.android.lark.monitor.traffic.C48255a
    /* renamed from: a */
    public void mo168842a(TrafficMonitor.C48254a aVar) {
        String str;
        TrafficMetrics trafficMetrics;
        Set<String> set = aVar.f121494e;
        if (set == null || set.isEmpty()) {
            str = "unknown";
        } else if (set.size() > 1) {
            StringBuilder sb = new StringBuilder("[");
            for (String str2 : set) {
                sb.append(str2);
                sb.append(",");
            }
            sb.append("]");
            str = sb.toString();
        } else {
            Iterator<String> it = set.iterator();
            if (it != null) {
                str = it.next();
            } else {
                str = "unknown";
            }
        }
        synchronized (this) {
            if (this.f121533d.containsKey(str)) {
                trafficMetrics = this.f121533d.get(str);
            } else {
                trafficMetrics = new TrafficMetrics();
                this.f121533d.put(str, trafficMetrics);
            }
            trafficMetrics.from = str;
            AbstractC48230h hVar = this.f121532c;
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
