package com.ss.android.lark.live.apm;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class PerfIntervalSetting implements Serializable {
    private static final long serialVersionUID = 1;
    @SerializedName("report_interval")
    private int powerReportInterval;
    @SerializedName("power_report_interval")
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
