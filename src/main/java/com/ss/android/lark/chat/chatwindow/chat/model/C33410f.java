package com.ss.android.lark.chat.chatwindow.chat.model;

import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chatbase.AbstractC34417b;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.model.f */
public class C33410f implements AbstractC34417b.AbstractC34421c<String> {

    /* renamed from: a */
    private final String f86033a;

    /* renamed from: b */
    private final String f86034b;

    /* renamed from: a */
    public String mo122977d() {
        return this.f86033a;
    }

    /* renamed from: b */
    public String mo122976c() {
        return this.f86034b;
    }

    public C33410f(Message message) {
        String str;
        this.f86033a = message.getId();
        if (message.isPreMessage()) {
            str = null;
        } else {
            str = message.getcId();
        }
        this.f86034b = str;
    }
}
