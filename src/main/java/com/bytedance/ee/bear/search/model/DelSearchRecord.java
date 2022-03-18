package com.bytedance.ee.bear.search.model;

import com.bytedance.ee.util.io.NonProguard;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class DelSearchRecord implements NonProguard {
    private int del_type = 1;
    private String from = "docs";
    private String source = "android";

    @Retention(RetentionPolicy.SOURCE)
    public @interface DELETE_SEARCH_FROM {
    }

    public int getDel_type() {
        return this.del_type;
    }

    public String getFrom() {
        return this.from;
    }

    public String getSource() {
        return this.source;
    }

    public void setDel_type(int i) {
        this.del_type = i;
    }

    public void setFrom(String str) {
        this.from = str;
    }

    public void setSource(String str) {
        this.source = str;
    }
}
