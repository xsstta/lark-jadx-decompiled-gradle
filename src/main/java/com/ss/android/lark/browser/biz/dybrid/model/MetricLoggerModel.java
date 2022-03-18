package com.ss.android.lark.browser.biz.dybrid.model;

import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import java.util.List;
import java.util.Map;

public class MetricLoggerModel implements BaseJSModel {
    private List<Integer> domains;
    private int emitType;
    private long emitValue;
    private int id;
    private Map<String, Object> params;
    private int type;

    public List<Integer> getDomains() {
        return this.domains;
    }

    public int getEmitType() {
        return this.emitType;
    }

    public long getEmitValue() {
        return this.emitValue;
    }

    public int getId() {
        return this.id;
    }

    public Map<String, Object> getParams() {
        return this.params;
    }

    public int getType() {
        return this.type;
    }

    public boolean isTimer() {
        if (this.emitType == 1) {
            return true;
        }
        return false;
    }

    public void setDomains(List<Integer> list) {
        this.domains = list;
    }

    public void setEmitType(int i) {
        this.emitType = i;
    }

    public void setEmitValue(long j) {
        this.emitValue = j;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setParams(Map<String, Object> map) {
        this.params = map;
    }

    public void setType(int i) {
        this.type = i;
    }
}
