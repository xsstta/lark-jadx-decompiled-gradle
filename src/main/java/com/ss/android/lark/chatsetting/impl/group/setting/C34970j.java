package com.ss.android.lark.chatsetting.impl.group.setting;

import com.ss.android.eventbus.BaseEvent;
import com.ss.android.lark.chat.entity.chat.Chat;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.setting.j */
public class C34970j extends BaseEvent {

    /* renamed from: a */
    private String f90261a;

    /* renamed from: b */
    private Chat.ShareCardPermission f90262b;

    /* renamed from: a */
    public Chat.ShareCardPermission mo128923a() {
        return this.f90262b;
    }

    /* renamed from: b */
    public String mo128924b() {
        return this.f90261a;
    }

    public C34970j(String str, Chat.ShareCardPermission shareCardPermission) {
        this.f90261a = str;
        this.f90262b = shareCardPermission;
    }
}
