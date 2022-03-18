package com.ss.android.lark.mail.impl.entity;

import com.bytedance.lark.pb.email.client.v1.Message;

/* renamed from: com.ss.android.lark.mail.impl.entity.n */
public class C42100n {

    /* renamed from: a */
    private String f107114a;

    /* renamed from: b */
    private String f107115b;

    /* renamed from: c */
    private Message.DeliveryState f107116c;

    /* renamed from: d */
    private int f107117d;

    /* renamed from: e */
    private long f107118e;

    /* renamed from: a */
    public long mo152001a() {
        return this.f107118e;
    }

    /* renamed from: b */
    public String mo152002b() {
        return this.f107114a;
    }

    /* renamed from: c */
    public Message.DeliveryState mo152003c() {
        return this.f107116c;
    }

    /* renamed from: d */
    public int mo152004d() {
        return this.f107117d;
    }

    public C42100n(String str, String str2, Message.DeliveryState deliveryState, int i, long j) {
        this.f107114a = str;
        this.f107115b = str2;
        this.f107116c = deliveryState;
        this.f107117d = i;
        this.f107118e = j;
    }
}
