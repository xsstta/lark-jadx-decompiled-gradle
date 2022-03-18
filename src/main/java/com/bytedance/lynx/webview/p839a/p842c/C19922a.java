package com.bytedance.lynx.webview.p839a.p842c;

import java.io.IOException;

/* renamed from: com.bytedance.lynx.webview.a.c.a */
public class C19922a {

    /* renamed from: a */
    short[] f48678a;

    /* renamed from: b */
    int f48679b;

    /* renamed from: a */
    public void mo67476a() {
        C19923b.m72686a(this.f48678a);
    }

    public C19922a(int i) {
        this.f48679b = i;
        this.f48678a = new short[(1 << i)];
    }

    /* renamed from: b */
    public int mo67477b(C19923b bVar) throws IOException {
        int i = 0;
        int i2 = 1;
        for (int i3 = 0; i3 < this.f48679b; i3++) {
            int a = bVar.mo67479a(this.f48678a, i2);
            i2 = (i2 << 1) + a;
            i |= a << i3;
        }
        return i;
    }

    /* renamed from: a */
    public int mo67475a(C19923b bVar) throws IOException {
        int i = 1;
        for (int i2 = this.f48679b; i2 != 0; i2--) {
            i = bVar.mo67479a(this.f48678a, i) + (i << 1);
        }
        return i - (1 << this.f48679b);
    }

    /* renamed from: a */
    public static int m72682a(short[] sArr, int i, C19923b bVar, int i2) throws IOException {
        int i3 = 0;
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            int a = bVar.mo67479a(sArr, i + i4);
            i4 = (i4 << 1) + a;
            i3 |= a << i5;
        }
        return i3;
    }
}
