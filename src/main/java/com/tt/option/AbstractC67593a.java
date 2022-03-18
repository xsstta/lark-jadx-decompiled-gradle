package com.tt.option;

/* renamed from: com.tt.option.a */
public abstract class AbstractC67593a<T> {

    /* renamed from: a */
    protected T f170423a;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo232057b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo234790c() {
        if (this.f170423a != null) {
            return true;
        }
        T b = mo232057b();
        this.f170423a = b;
        if (b != null) {
            return true;
        }
        return false;
    }
}
