package com.ss.android.lark.wschannelprocess.statistics.db;

import java.io.Serializable;

public class DBData implements Serializable {
    String data;
    long time;

    public String getData() {
        return this.data;
    }

    public long getTime() {
        return this.time;
    }

    public DBData(long j, String str) {
        this.time = j;
        this.data = str;
    }
}
