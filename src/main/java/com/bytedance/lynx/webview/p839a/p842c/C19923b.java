package com.bytedance.lynx.webview.p839a.p842c;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bytedance.lynx.webview.a.c.b */
public class C19923b {

    /* renamed from: a */
    int f48680a;

    /* renamed from: b */
    int f48681b;

    /* renamed from: c */
    InputStream f48682c;

    /* renamed from: a */
    public final void mo67480a() {
        this.f48682c = null;
    }

    /* renamed from: b */
    public final void mo67482b() throws IOException {
        this.f48681b = 0;
        this.f48680a = -1;
        for (int i = 0; i < 5; i++) {
            this.f48681b = (this.f48681b << 8) | this.f48682c.read();
        }
    }

    /* renamed from: a */
    public final void mo67481a(InputStream inputStream) {
        this.f48682c = inputStream;
    }

    /* renamed from: a */
    public static void m72686a(short[] sArr) {
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = 1024;
        }
    }

    /* renamed from: a */
    public final int mo67478a(int i) throws IOException {
        int i2 = 0;
        while (i != 0) {
            int i3 = this.f48680a >>> 1;
            this.f48680a = i3;
            int i4 = this.f48681b;
            int i5 = (i4 - i3) >>> 31;
            int i6 = i4 - ((i5 - 1) & i3);
            this.f48681b = i6;
            i2 = (i2 << 1) | (1 - i5);
            if ((i3 & -16777216) == 0) {
                this.f48681b = (i6 << 8) | this.f48682c.read();
                this.f48680a <<= 8;
            }
            i--;
        }
        return i2;
    }

    /* renamed from: a */
    public int mo67479a(short[] sArr, int i) throws IOException {
        short s = sArr[i];
        int i2 = this.f48680a;
        int i3 = (i2 >>> 11) * s;
        int i4 = this.f48681b;
        if ((i4 ^ Integer.MIN_VALUE) < (Integer.MIN_VALUE ^ i3)) {
            this.f48680a = i3;
            sArr[i] = (short) (s + ((2048 - s) >>> 5));
            if ((i3 & -16777216) != 0) {
                return 0;
            }
            this.f48681b = (i4 << 8) | this.f48682c.read();
            this.f48680a <<= 8;
            return 0;
        }
        int i5 = i2 - i3;
        this.f48680a = i5;
        int i6 = i4 - i3;
        this.f48681b = i6;
        sArr[i] = (short) (s - (s >>> 5));
        if ((i5 & -16777216) != 0) {
            return 1;
        }
        this.f48681b = (i6 << 8) | this.f48682c.read();
        this.f48680a <<= 8;
        return 1;
    }
}
