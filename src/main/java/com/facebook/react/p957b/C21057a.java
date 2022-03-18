package com.facebook.react.p957b;

import com.facebook.react.bridge.WritableMap;

/* renamed from: com.facebook.react.b.a */
public class C21057a {

    /* renamed from: a */
    private final String f51467a;

    /* renamed from: b */
    private final WritableMap f51468b;

    /* renamed from: c */
    private final long f51469c;

    /* renamed from: d */
    private final boolean f51470d;

    /* renamed from: e */
    private final AbstractC21063d f51471e;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo71412a() {
        return this.f51467a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public WritableMap mo71413b() {
        return this.f51468b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public long mo71414c() {
        return this.f51469c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo71415d() {
        return this.f51470d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public AbstractC21063d mo71416e() {
        return this.f51471e;
    }

    public C21057a(C21057a aVar) {
        this.f51467a = aVar.f51467a;
        this.f51468b = aVar.f51468b.copy();
        this.f51469c = aVar.f51469c;
        this.f51470d = aVar.f51470d;
        AbstractC21063d dVar = aVar.f51471e;
        if (dVar != null) {
            this.f51471e = dVar.mo71432d();
        } else {
            this.f51471e = null;
        }
    }

    public C21057a(String str, WritableMap writableMap, long j, boolean z, AbstractC21063d dVar) {
        this.f51467a = str;
        this.f51468b = writableMap;
        this.f51469c = j;
        this.f51470d = z;
        this.f51471e = dVar;
    }
}
