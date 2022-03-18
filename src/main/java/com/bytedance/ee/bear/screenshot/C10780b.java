package com.bytedance.ee.bear.screenshot;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Objects;

/* renamed from: com.bytedance.ee.bear.screenshot.b */
public final class C10780b {

    /* renamed from: a */
    private final Uri f28853a;

    /* renamed from: b */
    private final Bitmap f28854b;

    /* renamed from: c */
    private final Integer f28855c;

    /* renamed from: d */
    private boolean f28856d;

    /* renamed from: e */
    private int f28857e;

    /* renamed from: f */
    private int f28858f;

    /* renamed from: g */
    private Rect f28859g;

    /* renamed from: h */
    private boolean f28860h;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Uri mo40777b() {
        return this.f28853a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Bitmap mo40778c() {
        return this.f28854b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Integer mo40779d() {
        return this.f28855c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo40780e() {
        return this.f28856d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final int mo40781f() {
        return this.f28857e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo40782g() {
        return this.f28858f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final Rect mo40783h() {
        return this.f28859g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo40784i() {
        return this.f28860h;
    }

    /* renamed from: a */
    public C10780b mo40775a() {
        return mo40776a(true);
    }

    /* renamed from: a */
    public C10780b mo40776a(boolean z) {
        this.f28856d = z;
        return this;
    }

    /* renamed from: a */
    public static C10780b m44664a(int i) {
        return new C10780b(i);
    }

    private C10780b(int i) {
        this.f28855c = Integer.valueOf(i);
        this.f28856d = true;
    }

    /* renamed from: a */
    public static C10780b m44665a(Uri uri) {
        Objects.requireNonNull(uri, "Uri must not be null");
        return new C10780b(uri);
    }

    /* renamed from: a */
    public static C10780b m44666a(String str) {
        Objects.requireNonNull(str, "Asset name must not be null");
        return m44667b("file:///android_asset/" + str);
    }

    private C10780b(Uri uri) {
        String uri2 = uri.toString();
        if (uri2.startsWith("file:///") && !new File(uri2.substring(7)).exists()) {
            try {
                uri = Uri.parse(URLDecoder.decode(uri2, "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
        }
        this.f28854b = null;
        this.f28853a = uri;
        this.f28855c = null;
        this.f28856d = true;
    }

    /* renamed from: b */
    public static C10780b m44667b(String str) {
        Objects.requireNonNull(str, "Uri must not be null");
        if (!str.contains("://")) {
            if (str.startsWith("/")) {
                str = str.substring(1);
            }
            str = "file:///" + str;
        }
        return new C10780b(Uri.parse(str));
    }
}
