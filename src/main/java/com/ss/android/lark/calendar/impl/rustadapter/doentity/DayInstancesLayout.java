package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import java.io.Serializable;
import java.util.List;

public class DayInstancesLayout implements Serializable {
    private List<InstanceLayout> mInstanceLayouts;
    private int mLayoutDay;

    public List<InstanceLayout> getInstanceLayouts() {
        return this.mInstanceLayouts;
    }

    public int getLayoutDay() {
        return this.mLayoutDay;
    }

    public String toString() {
        return "DayInstancesLayout{mInstanceLayouts=" + this.mInstanceLayouts + ", mLayoutDay=" + this.mLayoutDay + '}';
    }

    public DayInstancesLayout setInstanceLayouts(List<InstanceLayout> list) {
        this.mInstanceLayouts = list;
        return this;
    }

    public DayInstancesLayout setLayoutDay(int i) {
        this.mLayoutDay = i;
        return this;
    }
}
