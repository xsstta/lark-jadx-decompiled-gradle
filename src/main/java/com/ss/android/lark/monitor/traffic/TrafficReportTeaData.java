package com.ss.android.lark.monitor.traffic;

import com.alibaba.fastjson.annotation.JSONField;

/* access modifiers changed from: package-private */
public class TrafficReportTeaData {
    public float http;
    public String process;
    public float rtc;
    public float rust;
    public String status;
    public float total;
    public float web;

    @JSONField(serialize = false)
    private boolean isZero(float f) {
        return f >= -1.0E-5f && f <= 1.0E-5f;
    }

    TrafficReportTeaData() {
    }

    @JSONField(serialize = false)
    public boolean isInValid() {
        if (!isZero(this.rust) || !isZero(this.web) || !isZero(this.total) || !isZero(this.rtc) || !isZero(this.http)) {
            return false;
        }
        return true;
    }
}
