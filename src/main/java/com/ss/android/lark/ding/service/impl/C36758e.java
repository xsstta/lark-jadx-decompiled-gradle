package com.ss.android.lark.ding.service.impl;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.ding.dto.C36636a;

/* renamed from: com.ss.android.lark.ding.service.impl.e */
public class C36758e implements Cloneable, Comparable {

    /* renamed from: a */
    private String f94454a;

    /* renamed from: b */
    private long f94455b;

    /* renamed from: c */
    private String f94456c;

    /* renamed from: d */
    private int f94457d;

    /* renamed from: e */
    private MessageInfo f94458e;

    /* renamed from: f */
    private Chat f94459f;

    /* renamed from: a */
    public int mo135441a() {
        return this.f94457d;
    }

    /* renamed from: b */
    public String mo135444b() {
        return this.f94456c;
    }

    /* renamed from: c */
    public String mo135445c() {
        return this.f94454a;
    }

    /* renamed from: d */
    public long mo135447d() {
        return this.f94455b;
    }

    /* renamed from: e */
    public MessageInfo mo135448e() {
        return this.f94458e;
    }

    /* renamed from: f */
    public Chat mo135449f() {
        return this.f94459f;
    }

    public String toString() {
        return "UnConfirmDingInfo{messageId='" + this.f94454a + '\'' + ", sendTime=" + this.f94455b + ", ackId='" + this.f94456c + '\'' + ", urgentType=" + this.f94457d + ", messageInfo=" + this.f94458e + ", chat=" + this.f94459f + '}';
    }

    /* renamed from: a */
    public void mo135442a(Chat chat) {
        this.f94459f = chat;
    }

    /* renamed from: a */
    public void mo135443a(MessageInfo messageInfo) {
        this.f94458e = messageInfo;
    }

    public C36758e(C36636a aVar) {
        this.f94454a = aVar.mo135172b();
        this.f94455b = aVar.mo135176d();
        this.f94456c = aVar.mo135167a();
        this.f94457d = aVar.mo135174c().getNumber();
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (!(obj instanceof C36758e)) {
            return 0;
        }
        C36758e eVar = (C36758e) obj;
        if (mo135447d() > eVar.mo135447d()) {
            return -1;
        }
        if (mo135447d() == eVar.mo135447d()) {
            return 0;
        }
        return 1;
    }
}
