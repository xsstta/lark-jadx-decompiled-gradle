package com.ss.android.lark.mine.impl.status.p2282a;

import com.ss.android.eventbus.BaseEvent;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;

/* renamed from: com.ss.android.lark.mine.impl.status.a.a */
public class C45802a extends BaseEvent {

    /* renamed from: a */
    private String f115578a;

    /* renamed from: b */
    private ChatterDescription.Type f115579b;

    /* renamed from: a */
    public String mo161031a() {
        return this.f115578a;
    }

    /* renamed from: b */
    public ChatterDescription.Type mo161032b() {
        return this.f115579b;
    }

    public C45802a(String str, ChatterDescription.Type type) {
        this.f115578a = str;
        this.f115579b = type;
    }
}
