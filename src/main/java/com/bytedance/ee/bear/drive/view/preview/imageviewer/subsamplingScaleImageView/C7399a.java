package com.bytedance.ee.bear.drive.view.preview.imageviewer.subsamplingScaleImageView;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Objects;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.imageviewer.subsamplingScaleImageView.a */
public final class C7399a {

    /* renamed from: a */
    private final Uri f19878a;

    /* renamed from: b */
    private final Bitmap f19879b;

    /* renamed from: c */
    private final Integer f19880c;

    /* renamed from: d */
    private boolean f19881d;

    /* renamed from: e */
    private int f19882e;

    /* renamed from: f */
    private int f19883f;

    /* renamed from: g */
    private Rect f19884g;

    /* renamed from: h */
    private boolean f19885h;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Uri mo28880b() {
        return this.f19878a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Bitmap mo28881c() {
        return this.f19879b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Integer mo28882d() {
        return this.f19880c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo28883e() {
        return this.f19881d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final int mo28884f() {
        return this.f19882e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo28885g() {
        return this.f19883f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final Rect mo28886h() {
        return this.f19884g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo28887i() {
        return this.f19885h;
    }

    /* renamed from: a */
    public C7399a mo28878a() {
        return mo28879a(true);
    }

    /* renamed from: a */
    public C7399a mo28879a(boolean z) {
        this.f19881d = z;
        return this;
    }

    /* renamed from: a */
    public static C7399a m29566a(int i) {
        return new C7399a(i);
    }

    private C7399a(int i) {
        this.f19880c = Integer.valueOf(i);
        this.f19881d = true;
    }

    /* renamed from: a */
    public static C7399a m29567a(String str) {
        Objects.requireNonNull(str, "Asset name must not be null");
        return m29568b("file:///android_asset/" + str);
    }

    private C7399a(Uri uri) {
        String uri2 = uri.toString();
        if (uri2.startsWith("file:///") && !new File(uri2.substring(7)).exists()) {
            try {
                uri = Uri.parse(URLDecoder.decode(uri2, "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
        }
        this.f19879b = null;
        this.f19878a = uri;
        this.f19880c = null;
        this.f19881d = true;
    }

    /* renamed from: b */
    public static C7399a m29568b(String str) {
        Objects.requireNonNull(str, "Uri must not be null");
        if (!str.contains("://")) {
            if (str.startsWith("/")) {
                str = str.substring(1);
            }
            str = "file:///" + str;
        }
        return new C7399a(Uri.parse(str));
    }
}
