package com.ss.android.lark.threadwindow.p2760a;

import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chatbase.AbstractC34417b;

/* renamed from: com.ss.android.lark.threadwindow.a.a */
public class C56007a implements AbstractC34417b.AbstractC34421c<String> {

    /* renamed from: a */
    private Message f138489a;

    /* renamed from: b */
    private boolean f138490b = true;

    /* renamed from: a */
    public String mo122977d() {
        return this.f138489a.getId();
    }

    /* renamed from: b */
    public String mo122976c() {
        if (this.f138490b) {
            return this.f138489a.getcId();
        }
        return null;
    }

    public C56007a(Message message) {
        this.f138489a = message;
    }

    public C56007a(Message message, boolean z) {
        this.f138489a = message;
        this.f138490b = z;
    }
}
