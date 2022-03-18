package com.ss.android.ttve.nativePort;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.ss.android.vesdk.C63929ab;
import java.nio.charset.Charset;

/* renamed from: com.ss.android.ttve.nativePort.c */
public class C60269c {

    /* renamed from: a */
    byte[] f150478a;

    /* renamed from: b */
    int f150479b;

    /* renamed from: e */
    public Bitmap mo206319e() {
        byte[] bArr = this.f150478a;
        if (bArr.length != 0) {
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        }
        return null;
    }

    /* renamed from: c */
    public Long mo206317c() {
        if (this.f150479b + 8 <= this.f150478a.length) {
            return Long.valueOf(String.valueOf(mo206315a()));
        }
        C63929ab.m250980d("TEParcel", "out of border");
        return null;
    }

    /* renamed from: d */
    public boolean mo206318d() {
        if (this.f150479b + 4 > this.f150478a.length) {
            C63929ab.m250980d("TEParcel", "out of border");
            return false;
        } else if (mo206315a() != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public int mo206315a() {
        int i = this.f150479b;
        int i2 = i + 4;
        byte[] bArr = this.f150478a;
        if (i2 > bArr.length) {
            C63929ab.m250980d("TEParcel", "out of border");
            return -1;
        }
        int i3 = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & Byte.MAX_VALUE) << 24);
        if ((bArr[i + 3] >> 7) != 0) {
            i3 -= Integer.MIN_VALUE;
        }
        this.f150479b = i + 4;
        return i3;
    }

    /* renamed from: b */
    public String mo206316b() {
        int a = mo206315a();
        if (this.f150479b + a > this.f150478a.length) {
            C63929ab.m250980d("TEParcel", "readString out of bound(data size=" + this.f150478a.length + ", start=" + this.f150479b + ", len=" + a + ")");
            return null;
        }
        String str = new String(this.f150478a, this.f150479b, a, Charset.forName("UTF-8"));
        this.f150479b += a;
        return str;
    }

    public C60269c(byte[] bArr) {
        this.f150478a = bArr;
    }
}
