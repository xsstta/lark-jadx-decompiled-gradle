package com.ss.android.lark.chatsetting.impl.group.setting;

import com.ss.android.eventbus.BaseEvent;
import com.ss.android.lark.chat.entity.chat.Chat;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.setting.c */
public class C34941c extends BaseEvent {

    /* renamed from: a */
    private final String f90205a;

    /* renamed from: b */
    private final Chat.AnonymousSetting f90206b;

    /* renamed from: a */
    public Chat.AnonymousSetting mo128860a() {
        return this.f90206b;
    }

    /* renamed from: b */
    public String mo128861b() {
        return this.f90205a;
    }

    public C34941c(String str, Chat.AnonymousSetting anonymousSetting) {
        this.f90205a = str;
        this.f90206b = anonymousSetting;
    }
}
