package com.ss.android.lark.widget.photo_picker.subsampling;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Objects;

/* renamed from: com.ss.android.lark.widget.photo_picker.subsampling.a */
public final class C58844a {

    /* renamed from: a */
    private final Uri f145553a;

    /* renamed from: b */
    private final Bitmap f145554b;

    /* renamed from: c */
    private final Integer f145555c;

    /* renamed from: d */
    private boolean f145556d;

    /* renamed from: e */
    private int f145557e;

    /* renamed from: f */
    private int f145558f;

    /* renamed from: g */
    private Rect f145559g;

    /* renamed from: h */
    private boolean f145560h;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Uri mo199428b() {
        return this.f145553a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Bitmap mo199429c() {
        return this.f145554b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Integer mo199430d() {
        return this.f145555c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo199431e() {
        return this.f145556d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final int mo199432f() {
        return this.f145557e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo199433g() {
        return this.f145558f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final Rect mo199434h() {
        return this.f145559g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo199435i() {
        return this.f145560h;
    }

    /* renamed from: j */
    private void m228253j() {
        Rect rect = this.f145559g;
        if (rect != null) {
            this.f145556d = true;
            this.f145557e = rect.width();
            this.f145558f = this.f145559g.height();
        }
    }

    /* renamed from: a */
    public C58844a mo199425a() {
        return mo199427a(true);
    }

    /* renamed from: a */
    public C58844a mo199427a(boolean z) {
        this.f145556d = z;
        return this;
    }

    /* renamed from: a */
    public static C58844a m228248a(int i) {
        return new C58844a(i);
    }

    private C58844a(int i) {
        this.f145555c = Integer.valueOf(i);
        this.f145556d = true;
    }

    /* renamed from: a */
    public static C58844a m228249a(Bitmap bitmap) {
        Objects.requireNonNull(bitmap, "Bitmap must not be null");
        return new C58844a(bitmap, true);
    }

    /* renamed from: a */
    public static C58844a m228250a(Uri uri) {
        Objects.requireNonNull(uri, "Uri must not be null");
        return new C58844a(uri);
    }

    private C58844a(Uri uri) {
        String uri2 = uri.toString();
        if (uri2.startsWith("file:///") && !new File(uri2.substring(7)).exists()) {
            try {
                uri = Uri.parse(URLDecoder.decode(uri2, "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
        }
        this.f145554b = null;
        this.f145553a = uri;
        this.f145555c = null;
        this.f145556d = true;
    }

    /* renamed from: a */
    public static C58844a m228251a(String str) {
        Objects.requireNonNull(str, "Asset name must not be null");
        return m228252b("file:///android_asset/" + str);
    }

    /* renamed from: b */
    public static C58844a m228252b(String str) {
        Objects.requireNonNull(str, "Uri must not be null");
        if (!str.contains("://")) {
            if (str.startsWith("/")) {
                str = str.substring(1);
            }
            str = "file:///" + str;
        }
        return new C58844a(Uri.parse(str));
    }

    private C58844a(Bitmap bitmap, boolean z) {
        this.f145554b = bitmap;
        this.f145557e = bitmap.getWidth();
        this.f145558f = bitmap.getHeight();
        this.f145560h = z;
    }

    /* renamed from: a */
    public C58844a mo199426a(int i, int i2) {
        if (this.f145554b == null) {
            this.f145557e = i;
            this.f145558f = i2;
        }
        m228253j();
        return this;
    }
}
