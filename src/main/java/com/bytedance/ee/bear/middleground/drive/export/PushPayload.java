package com.bytedance.ee.bear.middleground.drive.export;

import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p700c.C13598b;

public class PushPayload implements NonProguard {
    public String data;
    public long event_time;
    public int event_type;
    public String extra;
    public int file_type;
    public String node_token;
    public long version;

    public long getEvent_type() {
        return (long) this.event_type;
    }

    public long getFile_type() {
        return (long) this.file_type;
    }

    public String getData() {
        return this.data;
    }

    public long getEvent_time() {
        return this.event_time;
    }

    public String getExtra() {
        return this.extra;
    }

    public String getNode_token() {
        return this.node_token;
    }

    public long getVersion() {
        return this.version;
    }

    public String toString() {
        return "PushPayload{node_token='" + C13598b.m55200g(this.node_token) + '\'' + ", file_type=" + this.file_type + ", event_type=" + this.event_type + ", event_time=" + this.event_time + ", version=" + this.version + ", extra='" + this.extra + '\'' + '}';
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setEvent_time(long j) {
        this.event_time = j;
    }

    public void setEvent_type(int i) {
        this.event_type = i;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFile_type(int i) {
        this.file_type = i;
    }

    public void setNode_token(String str) {
        this.node_token = str;
    }

    public void setVersion(long j) {
        this.version = j;
    }

    public PushPayload(String str, int i, String str2, int i2, long j, long j2, String str3) {
        this.node_token = str;
        this.file_type = i;
        this.data = str2;
        this.event_type = i2;
        this.event_time = j;
        this.version = j2;
        this.extra = str3;
    }
}
