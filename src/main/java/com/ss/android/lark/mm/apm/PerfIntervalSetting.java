package com.ss.android.lark.mm.apm;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.mm.base.IMmSerializable;

public class PerfIntervalSetting implements IMmSerializable {
    @JSONField(name = "power_report_interval")
    private int powerReportInterval;
    @JSONField(name = "report_interval")
    private int reportInterval;

    public int getPowerReportInterval() {
        return this.powerReportInterval;
    }

    public int getReportInterval() {
        return this.reportInterval;
    }

    public void setPowerReportInterval(int i) {
        this.powerReportInterval = i;
    }

    public void setReportInterval(int i) {
        this.reportInterval = i;
    }
}
