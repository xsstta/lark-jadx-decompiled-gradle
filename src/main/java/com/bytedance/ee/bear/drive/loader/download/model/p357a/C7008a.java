package com.bytedance.ee.bear.drive.loader.download.model.p357a;

import com.bytedance.ee.bear.drive.loader.download.model.C7007a;
import com.bytedance.ee.util.p716r.C13721c;

/* renamed from: com.bytedance.ee.bear.drive.loader.download.model.a.a */
public final class C7008a {

    /* renamed from: a */
    private final String f18940a;

    /* renamed from: b */
    private final String f18941b;

    /* renamed from: c */
    private final String f18942c;

    /* renamed from: d */
    private final int f18943d;

    /* renamed from: e */
    private final String f18944e;

    /* renamed from: f */
    private final int f18945f;

    /* renamed from: g */
    private final int f18946g;

    /* renamed from: h */
    private final int f18947h;

    /* renamed from: i */
    private final C7007a f18948i;

    /* renamed from: j */
    private final boolean f18949j;

    /* renamed from: k */
    private final long f18950k;

    /* renamed from: l */
    private final String f18951l;

    /* renamed from: a */
    public int mo27542a() {
        return this.f18945f;
    }

    /* renamed from: b */
    public int mo27543b() {
        return this.f18947h;
    }

    /* renamed from: c */
    public C7007a mo27544c() {
        return this.f18948i;
    }

    /* renamed from: d */
    public boolean mo27545d() {
        return this.f18949j;
    }

    /* renamed from: e */
    public long mo27546e() {
        return this.f18950k;
    }

    /* renamed from: f */
    public String mo27547f() {
        return this.f18951l;
    }

    public String toString() {
        return "DrivePreviewGetModel{fileToken='" + C13721c.m55650d(this.f18940a) + '\'' + ", mountNodeToken='" + C13721c.m55650d(this.f18941b) + '\'' + ", mountPoint='" + this.f18942c + '\'' + ", previewType=" + this.f18943d + ", version='" + this.f18944e + '\'' + ", status=" + this.f18945f + ", interval=" + this.f18946g + ", longPushRetryInterval=" + this.f18947h + ", content=" + this.f18948i + ", linearized=" + this.f18949j + ", previewFileSize=" + this.f18950k + ", extra='" + this.f18951l + '\'' + '}';
    }

    public C7008a(String str, String str2, String str3, int i, String str4, int i2, int i3, int i4, C7007a aVar, boolean z, long j, String str5) {
        this.f18940a = str;
        this.f18941b = str2;
        this.f18942c = str3;
        this.f18943d = i;
        this.f18944e = str4;
        this.f18945f = i2;
        this.f18946g = i3;
        this.f18947h = i4;
        this.f18948i = aVar;
        this.f18949j = z;
        this.f18950k = j;
        this.f18951l = str5;
    }
}
