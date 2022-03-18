package com.ss.android.lark.monitor;

import com.facebook.battery.metrics.core.SystemMetrics;
import com.facebook.battery.metrics.cpu.CpuMetrics;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class CpuThreadMetrics extends SystemMetrics<CpuThreadMetrics> {
    private Comparator<Map.Entry<String, CpuMetrics>> threadMetricsComparator = new Comparator<Map.Entry<String, CpuMetrics>>() {
        /* class com.ss.android.lark.monitor.CpuThreadMetrics.C482001 */

        /* renamed from: a */
        public int compare(Map.Entry<String, CpuMetrics> entry, Map.Entry<String, CpuMetrics> entry2) {
            CpuMetrics value = entry.getValue();
            CpuMetrics value2 = entry2.getValue();
            int i = (((value.systemTimeS + value.userTimeS) - (value2.systemTimeS + value2.userTimeS)) > 0.0d ? 1 : (((value.systemTimeS + value.userTimeS) - (value2.systemTimeS + value2.userTimeS)) == 0.0d ? 0 : -1));
            if (i == 0) {
                return 0;
            }
            if (i > 0) {
                return -1;
            }
            return 1;
        }
    };
    HashMap<String, CpuMetrics> threadMetricsMap = new HashMap<>();

    public String toString() {
        List<Map.Entry<String, CpuMetrics>> topThreadMetrics = getTopThreadMetrics(10);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.min(10, topThreadMetrics.size()); i++) {
            Map.Entry<String, CpuMetrics> entry = topThreadMetrics.get(i);
            CpuMetrics value = entry.getValue();
            sb.append("\n");
            sb.append(String.format("%s: %.2f", entry.getKey(), Double.valueOf(value.systemTimeS + value.userTimeS)));
        }
        return sb.toString();
    }

    public CpuThreadMetrics set(CpuThreadMetrics cpuThreadMetrics) {
        this.threadMetricsMap = new HashMap<>(cpuThreadMetrics.threadMetricsMap);
        return this;
    }

    public List<Map.Entry<String, CpuMetrics>> getTopThreadMetrics(int i) {
        TreeSet treeSet = new TreeSet(this.threadMetricsComparator);
        for (Map.Entry<String, CpuMetrics> entry : this.threadMetricsMap.entrySet()) {
            treeSet.add(entry);
            if (treeSet.size() > i) {
                treeSet.pollLast();
            }
        }
        return new ArrayList(treeSet);
    }

    public CpuThreadMetrics diff(CpuThreadMetrics cpuThreadMetrics, CpuThreadMetrics cpuThreadMetrics2) {
        if (cpuThreadMetrics2 == null) {
            cpuThreadMetrics2 = new CpuThreadMetrics();
        }
        if (cpuThreadMetrics == null) {
            cpuThreadMetrics2.set(this);
        } else {
            HashMap<String, CpuMetrics> hashMap = new HashMap<>();
            for (Map.Entry<String, CpuMetrics> entry : this.threadMetricsMap.entrySet()) {
                String key = entry.getKey();
                CpuMetrics value = entry.getValue();
                if (cpuThreadMetrics.threadMetricsMap.containsKey(key)) {
                    CpuMetrics cpuMetrics = (CpuMetrics) value.diff(cpuThreadMetrics.threadMetricsMap.get(key));
                    if (cpuMetrics.systemTimeS + cpuMetrics.userTimeS > 0.0d) {
                        hashMap.put(key, cpuMetrics);
                    }
                } else {
                    hashMap.put(key, new CpuMetrics().set(value));
                }
            }
            cpuThreadMetrics2.threadMetricsMap = hashMap;
        }
        return cpuThreadMetrics2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.util.HashMap<java.lang.String, com.facebook.battery.metrics.cpu.CpuMetrics> */
    /* JADX WARN: Multi-variable type inference failed */
    public CpuThreadMetrics sum(CpuThreadMetrics cpuThreadMetrics, CpuThreadMetrics cpuThreadMetrics2) {
        if (cpuThreadMetrics2 == null) {
            cpuThreadMetrics2 = new CpuThreadMetrics();
        }
        if (cpuThreadMetrics == null) {
            cpuThreadMetrics2.set(this);
        } else {
            HashMap<String, CpuMetrics> hashMap = new HashMap<>();
            hashMap.putAll(cpuThreadMetrics.threadMetricsMap);
            for (Map.Entry<String, CpuMetrics> entry : cpuThreadMetrics.threadMetricsMap.entrySet()) {
                String key = entry.getKey();
                CpuMetrics value = entry.getValue();
                if (hashMap.containsKey(key)) {
                    hashMap.put(key, ((CpuMetrics) hashMap.get(key)).sum(value));
                } else {
                    this.threadMetricsMap.put(key, new CpuMetrics().set(value));
                }
            }
            cpuThreadMetrics2.threadMetricsMap = hashMap;
        }
        return cpuThreadMetrics2;
    }
}
