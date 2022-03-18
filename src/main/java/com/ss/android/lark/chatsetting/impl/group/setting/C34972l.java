package com.ss.android.lark.chatsetting.impl.group.setting;

import com.ss.android.eventbus.BaseEvent;
import com.ss.android.lark.chat.entity.chat.Chat;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.setting.l */
public class C34972l extends BaseEvent {

    /* renamed from: a */
    private String f90265a;

    /* renamed from: b */
    private Chat.AtAllPermission f90266b;

    /* renamed from: a */
    public Chat.AtAllPermission mo128927a() {
        return this.f90266b;
    }

    /* renamed from: b */
    public String mo128928b() {
        return this.f90265a;
    }

    public C34972l(String str, Chat.AtAllPermission atAllPermission) {
        this.f90265a = str;
        this.f90266b = atAllPermission;
    }
}
