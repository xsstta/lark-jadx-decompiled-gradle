package com.bytedance.applog.p197a;

import com.bytedance.applog.util.C3469r;
import com.bytedance.common.utility.NetworkUtils;
import org.json.JSONException;

/* renamed from: com.bytedance.applog.a.c */
public abstract class AbstractC3371c {

    /* renamed from: a */
    final C3373e f10672a;

    /* renamed from: b */
    private int f10673b;

    /* renamed from: c */
    private boolean f10674c;

    /* renamed from: d */
    private long f10675d;

    /* renamed from: e */
    private boolean f10676e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo13590a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract long mo13591b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract long[] mo13592c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo13593d() throws JSONException;

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract String mo13594e();

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo13596f() {
        return this.f10676e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final long mo13597g() {
        long i = m14068i();
        if (i <= System.currentTimeMillis()) {
            return m14069j();
        }
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.applog.a.c */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public <T extends AbstractC3371c> T mo13598h() {
        C3469r.m14665a("setImmediately, " + mo13594e());
        this.f10674c = true;
        return this;
    }

    /* renamed from: i */
    private long m14068i() {
        if (!mo13590a() || this.f10672a.mo13611e() != NetworkUtils.NetworkType.NONE.getValue()) {
            long j = 0;
            if (this.f10674c) {
                this.f10675d = 0;
                this.f10674c = false;
            } else {
                int i = this.f10673b;
                if (i > 0) {
                    j = m14067a(i - 1);
                } else {
                    j = mo13591b();
                }
            }
            return this.f10675d + j;
        }
        C3469r.m14665a("checkWorkTime, 0");
        return System.currentTimeMillis() + 5000;
    }

    /* renamed from: j */
    private long m14069j() {
        String str;
        try {
            boolean d = mo13593d();
            this.f10675d = System.currentTimeMillis();
            if (d) {
                this.f10673b = 0;
            } else {
                this.f10673b++;
            }
            str = mo13594e() + " worked:" + d;
        } catch (Exception e) {
            C3469r.m14667a(e);
            this.f10675d = System.currentTimeMillis();
            this.f10673b++;
            str = mo13594e() + " worked:" + false;
        } catch (Throwable th) {
            this.f10675d = System.currentTimeMillis();
            this.f10673b++;
            C3469r.m14670d(mo13594e() + " worked:" + false, null);
            throw th;
        }
        C3469r.m14670d(str, null);
        return m14068i();
    }

    /* renamed from: a */
    public void mo13595a(boolean z) {
        this.f10676e = z;
    }

    public AbstractC3371c(C3373e eVar) {
        this.f10672a = eVar;
    }

    /* renamed from: a */
    private long m14067a(int i) {
        long[] c = mo13592c();
        return c[i % c.length];
    }

    AbstractC3371c(C3373e eVar, long j) {
        this(eVar);
        this.f10675d = j;
    }
}
