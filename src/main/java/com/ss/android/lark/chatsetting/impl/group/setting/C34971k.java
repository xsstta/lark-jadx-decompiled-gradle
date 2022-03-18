package com.ss.android.lark.chatsetting.impl.group.setting;

import com.ss.android.eventbus.BaseEvent;
import com.ss.android.lark.chat.entity.chat.Chat;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.setting.k */
public class C34971k extends BaseEvent {

    /* renamed from: a */
    private String f90263a;

    /* renamed from: b */
    private Chat.AddMemberPermission f90264b;

    /* renamed from: a */
    public Chat.AddMemberPermission mo128925a() {
        return this.f90264b;
    }

    /* renamed from: b */
    public String mo128926b() {
        return this.f90263a;
    }

    public C34971k(String str, Chat.AddMemberPermission addMemberPermission) {
        this.f90263a = str;
        this.f90264b = addMemberPermission;
    }
}
