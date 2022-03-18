package org.tukaani.xz.p3528f;

/* access modifiers changed from: package-private */
/* renamed from: org.tukaani.xz.f.c */
public final class C70074c {

    /* renamed from: a */
    private int f175145a;

    C70074c() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo246771a() {
        this.f175145a = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo246772b() {
        return this.f175145a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo246773c() {
        int i = this.f175145a;
        this.f175145a = i <= 3 ? 0 : i <= 9 ? i - 3 : i - 6;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo246774d() {
        int i = 7;
        if (this.f175145a >= 7) {
            i = 10;
        }
        this.f175145a = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo246775e() {
        this.f175145a = this.f175145a < 7 ? 8 : 11;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo246776f() {
        this.f175145a = this.f175145a < 7 ? 9 : 11;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo246777g() {
        return this.f175145a < 7;
    }
}
