package com.ss.android.lark.ding.service.impl.controller;

import com.ss.android.lark.chat.entity.chatter.Chatter;

/* renamed from: com.ss.android.lark.ding.service.impl.controller.e */
public class C36724e {

    /* renamed from: a */
    public int f94402a;

    /* renamed from: b */
    public int f94403b;

    /* renamed from: c */
    public Chatter f94404c;

    /* renamed from: a */
    public int mo135378a() {
        return this.f94402a;
    }

    /* renamed from: b */
    public Chatter mo135380b() {
        return this.f94404c;
    }

    /* renamed from: c */
    public int mo135381c() {
        return this.f94403b;
    }

    public int hashCode() {
        int i;
        int i2 = this.f94402a * 31;
        Chatter chatter = this.f94404c;
        if (chatter != null) {
            i = chatter.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36724e)) {
            return false;
        }
        C36724e eVar = (C36724e) obj;
        int i = this.f94402a;
        if (i != eVar.f94402a || i != 2) {
            return false;
        }
        Chatter chatter = this.f94404c;
        Chatter chatter2 = eVar.f94404c;
        if (chatter != null) {
            return chatter.equals(chatter2);
        }
        if (chatter2 == null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo135379a(int i, int i2, Chatter chatter) {
        this.f94404c = chatter;
        this.f94402a = i;
        this.f94403b = i2;
    }
}
