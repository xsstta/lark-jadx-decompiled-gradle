package com.huawei.hms.site.api.model;

import java.util.List;

public class OpeningHours {
    public List<Period> periods;
    public String[] texts;

    public List<Period> getPeriods() {
        return this.periods;
    }

    public String[] getTexts() {
        return this.texts;
    }

    public void setPeriods(List<Period> list) {
        this.periods = list;
    }

    public void setTexts(String[] strArr) {
        this.texts = strArr;
    }
}
