package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import java.io.Serializable;
import java.util.List;

public class DayInstancesSlotMetric implements Serializable {
    private List<InstanceSlotMetric> mInstanceSlotMetrics;
    private int mLayoutDay;

    public List<InstanceSlotMetric> getInstanceSlotMetrics() {
        return this.mInstanceSlotMetrics;
    }

    public int getLayoutDay() {
        return this.mLayoutDay;
    }

    public DayInstancesSlotMetric setInstanceSlotMetrics(List<InstanceSlotMetric> list) {
        this.mInstanceSlotMetrics = list;
        return this;
    }

    public DayInstancesSlotMetric setLayoutDay(int i) {
        this.mLayoutDay = i;
        return this;
    }
}
