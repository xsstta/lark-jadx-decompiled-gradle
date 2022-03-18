package com.ss.android.bytedcert.manager;

import android.graphics.Bitmap;
import android.util.Base64;
import android.util.Pair;
import com.ss.android.bytedcert.p1304b.C28317a;
import com.ss.android.bytedcert.utils.C28432b;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* renamed from: com.ss.android.bytedcert.manager.c */
public class C28418c {

    /* renamed from: a */
    public String f71469a;

    /* renamed from: b */
    public byte[] f71470b;

    /* renamed from: c */
    public byte[] f71471c;

    /* renamed from: d */
    public int f71472d;

    /* renamed from: e */
    public int f71473e;

    /* renamed from: f */
    public int f71474f;

    /* renamed from: g */
    public int f71475g;

    /* renamed from: h */
    public int f71476h;

    /* renamed from: i */
    public boolean f71477i;

    /* renamed from: j */
    public Pair f71478j;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.bytedcert.manager.c$a */
    public static class C28420a {

        /* renamed from: a */
        public static C28418c f71479a = new C28418c();
    }

    /* renamed from: c */
    public static C28418c m104143c() {
        return C28420a.f71479a;
    }

    private C28418c() {
        this.f71476h = 100;
    }

    /* renamed from: a */
    public String mo101195a() {
        byte[] bArr = this.f71470b;
        if (bArr != null) {
            return m104142a(bArr, this.f71473e, this.f71472d, this.f71476h);
        }
        return null;
    }

    /* renamed from: b */
    public String mo101197b() {
        byte[] bArr = this.f71471c;
        if (bArr != null) {
            return m104142a(bArr, this.f71475g, this.f71474f, this.f71476h);
        }
        return null;
    }

    /* renamed from: a */
    public void mo101196a(int i, int i2, int i3, int i4) {
        this.f71472d = i4;
        this.f71473e = i3;
        this.f71474f = i2;
        this.f71475g = i;
    }

    /* renamed from: a */
    private String m104142a(byte[] bArr, int i, int i2, int i3) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(Bitmap.CompressFormat.JPEG, i3, byteArrayOutputStream);
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            createBitmap.recycle();
            return encodeToString;
        } catch (Exception e) {
            C28432b.m104210a(e, C28317a.m103908b(e));
            e.printStackTrace();
            return "";
        }
    }
}
