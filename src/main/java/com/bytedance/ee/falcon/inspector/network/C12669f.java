package com.bytedance.ee.falcon.inspector.network;

import java.io.IOException;

/* renamed from: com.bytedance.ee.falcon.inspector.network.f */
public class C12669f implements AbstractC12686o {

    /* renamed from: a */
    private final AbstractC12674i f33913a;

    /* renamed from: b */
    private final String f33914b;

    /* renamed from: c */
    private int f33915c;

    /* renamed from: d */
    private int f33916d = -1;

    /* renamed from: b */
    private void m52478b() {
        AbstractC12674i iVar = this.f33913a;
        String str = this.f33914b;
        int i = this.f33915c;
        int i2 = this.f33916d;
        if (i2 < 0) {
            i2 = i;
        }
        iVar.mo48062b(str, i, i2);
    }

    @Override // com.bytedance.ee.falcon.inspector.network.AbstractC12686o
    /* renamed from: a */
    public void mo48043a() {
        m52478b();
        this.f33913a.mo48057a(this.f33914b);
    }

    @Override // com.bytedance.ee.falcon.inspector.network.AbstractC12686o
    /* renamed from: a */
    public void mo48044a(int i) {
        this.f33915c += i;
    }

    @Override // com.bytedance.ee.falcon.inspector.network.AbstractC12686o
    /* renamed from: a */
    public void mo48045a(IOException iOException) {
        m52478b();
        this.f33913a.mo48063b(this.f33914b, iOException.toString());
    }

    @Override // com.bytedance.ee.falcon.inspector.network.AbstractC12686o
    /* renamed from: b */
    public void mo48046b(int i) {
        if (this.f33916d == -1) {
            this.f33916d = 0;
        }
        this.f33916d += i;
    }

    public C12669f(AbstractC12674i iVar, String str) {
        this.f33913a = iVar;
        this.f33914b = str;
    }
}
