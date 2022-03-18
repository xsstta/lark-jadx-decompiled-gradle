package com.bytedance.lynx.webview.p839a.p840a;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.bytedance.lynx.webview.a.a.a */
public class C19916a {

    /* renamed from: a */
    byte[] f48643a;

    /* renamed from: b */
    int f48644b;

    /* renamed from: c */
    int f48645c;

    /* renamed from: d */
    int f48646d;

    /* renamed from: e */
    OutputStream f48647e;

    /* renamed from: a */
    public void mo67453a() throws IOException {
        mo67460b();
        this.f48647e = null;
    }

    /* renamed from: b */
    public void mo67460b() throws IOException {
        int i = this.f48644b;
        int i2 = this.f48646d;
        int i3 = i - i2;
        if (i3 != 0) {
            this.f48647e.write(this.f48643a, i2, i3);
            if (this.f48644b >= this.f48645c) {
                this.f48644b = 0;
            }
            this.f48646d = this.f48644b;
        }
    }

    /* renamed from: a */
    public void mo67457a(OutputStream outputStream) throws IOException {
        mo67453a();
        this.f48647e = outputStream;
    }

    /* renamed from: b */
    public byte mo67459b(int i) {
        int i2 = (this.f48644b - i) - 1;
        if (i2 < 0) {
            i2 += this.f48645c;
        }
        return this.f48643a[i2];
    }

    /* renamed from: a */
    public void mo67454a(byte b) throws IOException {
        byte[] bArr = this.f48643a;
        int i = this.f48644b;
        int i2 = i + 1;
        this.f48644b = i2;
        bArr[i] = b;
        if (i2 >= this.f48645c) {
            mo67460b();
        }
    }

    /* renamed from: a */
    public void mo67455a(int i) {
        if (this.f48643a == null || this.f48645c != i) {
            this.f48643a = new byte[i];
        }
        this.f48645c = i;
        this.f48644b = 0;
        this.f48646d = 0;
    }

    /* renamed from: a */
    public void mo67458a(boolean z) {
        if (!z) {
            this.f48646d = 0;
            this.f48644b = 0;
        }
    }

    /* renamed from: a */
    public void mo67456a(int i, int i2) throws IOException {
        int i3 = (this.f48644b - i) - 1;
        if (i3 < 0) {
            i3 += this.f48645c;
        }
        while (i2 != 0) {
            int i4 = this.f48645c;
            if (i3 >= i4) {
                i3 = 0;
            }
            byte[] bArr = this.f48643a;
            int i5 = this.f48644b;
            int i6 = i5 + 1;
            this.f48644b = i6;
            int i7 = i3 + 1;
            bArr[i5] = bArr[i3];
            if (i6 >= i4) {
                mo67460b();
            }
            i2--;
            i3 = i7;
        }
    }
}
