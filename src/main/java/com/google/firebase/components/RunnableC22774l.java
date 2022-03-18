package com.google.firebase.components;

import com.google.firebase.events.Event;
import java.util.Map;

/* renamed from: com.google.firebase.components.l */
final /* synthetic */ class RunnableC22774l implements Runnable {

    /* renamed from: a */
    private final Map.Entry f56314a;

    /* renamed from: b */
    private final Event f56315b;

    private RunnableC22774l(Map.Entry entry, Event event) {
        this.f56314a = entry;
        this.f56315b = event;
    }

    /* renamed from: a */
    public static Runnable m82761a(Map.Entry entry, Event event) {
        return new RunnableC22774l(entry, event);
    }

    public void run() {
        C22773k.m82757a(this.f56314a, this.f56315b);
    }
}
