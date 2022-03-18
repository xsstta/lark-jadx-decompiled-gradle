package com.bytedance.ee.lark.infra.network.ref.entity;

/* renamed from: com.bytedance.ee.lark.infra.network.ref.entity.a */
public class C12874a<T> {

    /* renamed from: a */
    private ECONetworkException f34360a;

    /* renamed from: b */
    private T f34361b;

    /* renamed from: b */
    public T mo48549b() {
        return this.f34361b;
    }

    /* renamed from: c */
    public ECONetworkException mo48550c() {
        return this.f34360a;
    }

    /* renamed from: a */
    public boolean mo48548a() {
        if (this.f34360a != null) {
            return true;
        }
        if (this.f34361b != null) {
            return false;
        }
        this.f34360a = new ECONetworkException("unexpected error: t is null ");
        return true;
    }

    public C12874a(ECONetworkException eCONetworkException) {
        this.f34360a = eCONetworkException;
    }

    public C12874a(T t) {
        this.f34361b = t;
    }
}
