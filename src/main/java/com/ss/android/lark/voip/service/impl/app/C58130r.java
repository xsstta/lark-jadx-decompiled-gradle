package com.ss.android.lark.voip.service.impl.app;

import com.ss.android.eventbus.BaseEvent;

/* renamed from: com.ss.android.lark.voip.service.impl.app.r */
public class C58130r extends BaseEvent {

    /* renamed from: a */
    public long f142998a;

    /* renamed from: b */
    public String f142999b;

    /* renamed from: c */
    public String f143000c;

    public C58130r(long j, String str) {
        this.f142998a = j;
        this.f142999b = str;
        if (j >= 3600) {
            this.f143000c = String.format("%d:%02d:%02d", Long.valueOf(j / 3600), Long.valueOf((j % 3600) / 60), Long.valueOf(j % 60));
            return;
        }
        this.f143000c = String.format("%02d:%02d", Long.valueOf((j % 3600) / 60), Long.valueOf(j % 60));
    }
}
