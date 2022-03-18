package com.bytedance.ee.bear.bitable.card.model.jsmodel.cellvalue;

import com.bytedance.ee.util.io.NonProguard;

public class NumberModel implements NonProguard {
    private String formatterValue;
    private Double numberValue;

    public NumberModel() {
    }

    public String getFormatterValue() {
        return this.formatterValue;
    }

    public Double getNumberValue() {
        return this.numberValue;
    }

    public void setFormatterValue(String str) {
        this.formatterValue = str;
    }

    public void setNumberValue(Double d) {
        this.numberValue = d;
    }

    public NumberModel(String str, Double d) {
        this.formatterValue = str;
        this.numberValue = d;
    }
}
