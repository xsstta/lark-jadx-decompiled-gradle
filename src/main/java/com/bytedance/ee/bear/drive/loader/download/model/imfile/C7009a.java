package com.bytedance.ee.bear.drive.loader.download.model.imfile;

import com.bytedance.ee.bear.drive.loader.download.model.C7007a;
import com.bytedance.ee.util.p716r.C13721c;

/* renamed from: com.bytedance.ee.bear.drive.loader.download.model.imfile.a */
public final class C7009a {

    /* renamed from: a */
    private final String f18952a;

    /* renamed from: b */
    private final String f18953b;

    /* renamed from: c */
    private final String f18954c;

    /* renamed from: d */
    private final int f18955d;

    /* renamed from: e */
    private final int f18956e;

    /* renamed from: f */
    private final int f18957f;

    /* renamed from: g */
    private final C7007a f18958g;

    /* renamed from: h */
    private final boolean f18959h;

    /* renamed from: i */
    private final long f18960i;

    /* renamed from: j */
    private final String f18961j;

    /* renamed from: a */
    public int mo27554a() {
        return this.f18955d;
    }

    /* renamed from: b */
    public int mo27555b() {
        return this.f18957f;
    }

    /* renamed from: c */
    public C7007a mo27556c() {
        return this.f18958g;
    }

    /* renamed from: d */
    public boolean mo27557d() {
        return this.f18959h;
    }

    /* renamed from: e */
    public long mo27558e() {
        return this.f18960i;
    }

    /* renamed from: f */
    public String mo27559f() {
        return this.f18961j;
    }

    public String toString() {
        return "SdkPreviewGetModel{appId='" + C13721c.m55650d(this.f18952a) + '\'' + ", appFileId='" + C13721c.m55650d(this.f18953b) + '\'' + ", authExtra='" + C13721c.m55650d(this.f18954c) + '\'' + ", status=" + this.f18955d + ", interval=" + this.f18956e + ", longPushRetryInterval=" + this.f18957f + ", content=" + this.f18958g + ", linearized=" + this.f18959h + ", previewFileSize=" + this.f18960i + ", extra='" + this.f18961j + '\'' + '}';
    }

    public C7009a(String str, String str2, String str3, int i, int i2, int i3, C7007a aVar, boolean z, long j, String str4) {
        this.f18952a = str;
        this.f18953b = str2;
        this.f18954c = str3;
        this.f18955d = i;
        this.f18956e = i2;
        this.f18957f = i3;
        this.f18958g = aVar;
        this.f18959h = z;
        this.f18960i = j;
        this.f18961j = str4;
    }
}
