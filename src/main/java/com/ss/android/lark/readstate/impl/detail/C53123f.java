package com.ss.android.lark.readstate.impl.detail;

import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;

/* renamed from: com.ss.android.lark.readstate.impl.detail.f */
public class C53123f implements Comparable<C53123f> {

    /* renamed from: a */
    public boolean f131376a;

    /* renamed from: b */
    public boolean f131377b;

    /* renamed from: c */
    public boolean f131378c;

    /* renamed from: d */
    public boolean f131379d;

    /* renamed from: e */
    public String f131380e;

    /* renamed from: f */
    public Chatter f131381f;

    /* renamed from: g */
    public int f131382g;

    /* renamed from: h */
    public int f131383h;

    /* renamed from: i */
    public Message.Type f131384i;

    public C53123f(String str) {
        this.f131380e = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.f131382g == ((C53123f) obj).f131382g) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public int compareTo(C53123f fVar) {
        int i;
        int i2 = 2;
        if (this.f131376a) {
            i = 2;
        } else {
            i = 1;
        }
        if (!fVar.f131376a) {
            i2 = 1;
        }
        if (i != i2) {
            return i2 - i;
        }
        if (this.f131377b) {
            i <<= 1;
        }
        if (fVar.f131377b) {
            i2 <<= 1;
        }
        if (i != i2) {
            return i2 - i;
        }
        return this.f131381f.getNamePinyin().compareTo(fVar.f131381f.getNamePinyin());
    }
}
