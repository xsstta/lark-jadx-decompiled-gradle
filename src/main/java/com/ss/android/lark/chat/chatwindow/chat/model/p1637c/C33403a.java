package com.ss.android.lark.chat.chatwindow.chat.model.p1637c;

import com.larksuite.framework.utils.AndroidThrottle;
import com.ss.android.lark.chat.entity.chat.Chat;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.model.c.a */
public class C33403a implements AndroidThrottle.AbstractC26232d<Chat> {

    /* renamed from: a */
    private Chat f86026a;

    @Override // com.larksuite.framework.utils.AndroidThrottle.AbstractC26232d
    /* renamed from: b */
    public void mo93317b() {
        this.f86026a = null;
    }

    @Override // com.larksuite.framework.utils.AndroidThrottle.AbstractC26232d
    /* renamed from: c */
    public int mo93318c() {
        if (this.f86026a != null) {
            return 1;
        }
        return 0;
    }

    @Override // com.larksuite.framework.utils.AndroidThrottle.AbstractC26232d
    /* renamed from: d */
    public Collection<Chat> mo93319d() {
        ArrayList arrayList = new ArrayList();
        Chat chat = this.f86026a;
        if (chat != null) {
            arrayList.add(chat);
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo93316a(Chat chat) {
        if (chat != null) {
            this.f86026a = chat;
        }
    }
}
