package com.ss.android.lark.monitor.traffic;

import com.alibaba.fastjson.annotation.JSONField;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public class TrafficMetricsLog {
    public String appStatus;
    public String begin;
    public String end;
    public String lastActivity;
    public List<BaseMetricLogItem> netWorkMetrics = new ArrayList();
    public String processName;

    public static abstract class BaseMetricLogItem {
        public String from;

        /* access modifiers changed from: protected */
        public void convert2KB() {
        }

        /* access modifiers changed from: protected */
        @JSONField(serialize = false)
        public boolean isValid() {
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public static class MetricLogItem extends BaseMetricLogItem {
        public TrafficMetrics metrics;

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.monitor.traffic.TrafficMetricsLog.BaseMetricLogItem
        public void convert2KB() {
            this.metrics.convert2KB();
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.monitor.traffic.TrafficMetricsLog.BaseMetricLogItem
        public boolean isValid() {
            TrafficMetrics trafficMetrics = this.metrics;
            if (trafficMetrics == null || !trafficMetrics.isValid()) {
                return false;
            }
            return true;
        }

        public MetricLogItem(String str, TrafficMetrics trafficMetrics) {
            this.from = str;
            this.metrics = trafficMetrics;
        }
    }

    @JSONField(serialize = false)
    public boolean isEmpty() {
        return this.netWorkMetrics.isEmpty();
    }

    TrafficMetricsLog() {
    }

    static class NestingMetricLogItem extends BaseMetricLogItem {
        public List<MetricLogItem> metrics = new ArrayList();

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.monitor.traffic.TrafficMetricsLog.BaseMetricLogItem
        public void convert2KB() {
            for (MetricLogItem metricLogItem : this.metrics) {
                metricLogItem.convert2KB();
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.monitor.traffic.TrafficMetricsLog.BaseMetricLogItem
        public boolean isValid() {
            if (this.metrics.isEmpty()) {
                return false;
            }
            int i = 0;
            for (MetricLogItem metricLogItem : this.metrics) {
                if (!metricLogItem.isValid()) {
                    i++;
                }
            }
            if (i < this.metrics.size()) {
                return true;
            }
            return false;
        }

        public NestingMetricLogItem(String str) {
            this.from = str;
        }

        public NestingMetricLogItem addItemIfValid(MetricLogItem metricLogItem) {
            if (metricLogItem.isValid()) {
                this.metrics.add(metricLogItem);
            }
            return this;
        }
    }

    public void convert2KB() {
        for (BaseMetricLogItem baseMetricLogItem : this.netWorkMetrics) {
            baseMetricLogItem.convert2KB();
        }
    }

    public TrafficMetricsLog appStatus(String str) {
        this.appStatus = str;
        return this;
    }

    public TrafficMetricsLog begin(String str) {
        this.begin = str;
        return this;
    }

    public TrafficMetricsLog end(String str) {
        this.end = str;
        return this;
    }

    public TrafficMetricsLog lastActivity(String str) {
        this.lastActivity = str;
        return this;
    }

    public TrafficMetricsLog processName(String str) {
        this.processName = str;
        return this;
    }

    public TrafficMetricsLog addItemIfValid(BaseMetricLogItem baseMetricLogItem) {
        if (baseMetricLogItem.isValid()) {
            this.netWorkMetrics.add(baseMetricLogItem);
        }
        return this;
    }
}
