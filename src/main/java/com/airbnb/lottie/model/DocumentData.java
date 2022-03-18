package com.airbnb.lottie.model;

public class DocumentData {

    /* renamed from: a */
    public final String f6238a;

    /* renamed from: b */
    public final String f6239b;

    /* renamed from: c */
    public final float f6240c;

    /* renamed from: d */
    public final Justification f6241d;

    /* renamed from: e */
    public final int f6242e;

    /* renamed from: f */
    public final float f6243f;

    /* renamed from: g */
    public final float f6244g;

    /* renamed from: h */
    public final int f6245h;

    /* renamed from: i */
    public final int f6246i;

    /* renamed from: j */
    public final float f6247j;

    /* renamed from: k */
    public final boolean f6248k;

    public enum Justification {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public int hashCode() {
        int hashCode = (((((int) (((float) (((this.f6238a.hashCode() * 31) + this.f6239b.hashCode()) * 31)) + this.f6240c)) * 31) + this.f6241d.ordinal()) * 31) + this.f6242e;
        long floatToRawIntBits = (long) Float.floatToRawIntBits(this.f6243f);
        return (((hashCode * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f6245h;
    }

    public DocumentData(String str, String str2, float f, Justification justification, int i, float f2, float f3, int i2, int i3, float f4, boolean z) {
        this.f6238a = str;
        this.f6239b = str2;
        this.f6240c = f;
        this.f6241d = justification;
        this.f6242e = i;
        this.f6243f = f2;
        this.f6244g = f3;
        this.f6245h = i2;
        this.f6246i = i3;
        this.f6247j = f4;
        this.f6248k = z;
    }
}
