package com.ss.android.lark.optrace.extension.clientduration;

import com.ss.android.lark.optrace.extension.TracingExtension;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class TracingClientDurationExtension implements TracingExtension {
    Map<String, TracingClientDurationEvent> eventStartMap = new ConcurrentHashMap();

    public abstract long duration(String str);

    public abstract long end(String str);

    public abstract void endAll();

    public abstract void start(String str);

    public String toString() {
        return "TracingClientDurationExtension{eventStartMap=" + this.eventStartMap + '}';
    }
}
