package com.huawei.hms.site.api.model;

public class Period {
    public TimeOfWeek close;
    public TimeOfWeek open;

    public TimeOfWeek getClose() {
        return this.close;
    }

    public TimeOfWeek getOpen() {
        return this.open;
    }

    public void setClose(TimeOfWeek timeOfWeek) {
        this.close = timeOfWeek;
    }

    public void setOpen(TimeOfWeek timeOfWeek) {
        this.open = timeOfWeek;
    }
}
