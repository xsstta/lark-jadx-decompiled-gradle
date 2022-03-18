package com.bytedance.ee.bear.account;

import io.reactivex.AbstractC68307f;

/* renamed from: com.bytedance.ee.bear.account.p */
public class C4209p {

    /* renamed from: a */
    private C4165b f12718a;

    /* renamed from: b */
    private NetContract f12719b;

    /* renamed from: a */
    public AbstractC68307f<UserInfo> mo16529a(String str) {
        return this.f12719b.mo16361a("/api/user/", new C4210q(), str);
    }

    public C4209p(C4165b bVar, NetContract netContract) {
        this.f12718a = bVar;
        this.f12719b = netContract;
    }
}
