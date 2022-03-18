package com.ss.android.vc.irtc;

/* renamed from: com.ss.android.vc.irtc.t */
public class C61070t {

    /* renamed from: a */
    public byte[] f152936a;

    /* renamed from: b */
    public int f152937b;

    /* renamed from: c */
    public int f152938c;

    /* renamed from: d */
    public int f152939d;

    /* renamed from: e */
    public int f152940e;

    public C61070t() {
    }

    public String toString() {
        return "VcAudioFrame{samplesSize=" + this.f152936a.length + ", numOfSamples=" + this.f152937b + ", bytesPerSample=" + this.f152938c + ", channels=" + this.f152939d + ", samplesPerSec=" + this.f152940e + '}';
    }

    public C61070t(byte[] bArr, int i, int i2, int i3, int i4) {
        this.f152936a = bArr;
        this.f152937b = i;
        this.f152938c = i2;
        this.f152939d = i3;
        this.f152940e = i4;
    }
}
