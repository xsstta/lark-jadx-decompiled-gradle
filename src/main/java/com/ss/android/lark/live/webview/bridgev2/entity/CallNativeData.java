package com.ss.android.lark.live.webview.bridgev2.entity;

import java.io.Serializable;

public class CallNativeData implements Serializable {
    public CallNativeEvent live_event;
    public CallNativeParams params;
    public String version;

    public String toString() {
        return "CallNativeData{live_event=" + this.live_event + ", version='" + this.version + '\'' + ", params=" + this.params + '}';
    }
}
