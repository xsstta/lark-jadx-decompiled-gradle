package com.bytedance.platform.godzilla.anr.monitor.idletask;

import android.os.MessageQueue;

/* renamed from: com.bytedance.platform.godzilla.anr.monitor.idletask.c */
public class C20303c implements MessageQueue.IdleHandler {

    /* renamed from: a */
    private MessageQueue.IdleHandler f49577a;

    /* renamed from: a */
    public MessageQueue.IdleHandler mo68617a() {
        return this.f49577a;
    }

    public boolean queueIdle() {
        String name = this.f49577a.getClass().getName();
        C20301a.m74053a(">>>>> Dispatching to IdleTask " + name);
        long currentTimeMillis = System.currentTimeMillis();
        boolean queueIdle = this.f49577a.queueIdle();
        C20301a.m74053a("<<<<< Finished to IdleTask " + name);
        C20302b.m74054a().mo68616b().mo68575a(name, System.currentTimeMillis() - currentTimeMillis);
        return queueIdle;
    }

    public C20303c(MessageQueue.IdleHandler idleHandler) {
        this.f49577a = idleHandler;
    }
}
