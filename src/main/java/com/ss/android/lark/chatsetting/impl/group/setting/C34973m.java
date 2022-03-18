package com.ss.android.lark.chatsetting.impl.group.setting;

import com.ss.android.eventbus.BaseEvent;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.setting.m */
public class C34973m extends BaseEvent {

    /* renamed from: a */
    private String f90267a;

    /* renamed from: b */
    private boolean f90268b;

    /* renamed from: a */
    public boolean mo128929a() {
        return this.f90268b;
    }

    /* renamed from: b */
    public String mo128930b() {
        return this.f90267a;
    }

    public C34973m(String str, boolean z) {
        this.f90267a = str;
        this.f90268b = z;
    }
}
