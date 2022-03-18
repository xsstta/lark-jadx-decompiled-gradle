package com.ss.android.lark.appcenter.wrapper.impl.p1362a;

import android.content.Context;
import com.ss.android.appcenter.p1262a.AbstractC27551b;
import com.ss.android.appcenter.p1262a.p1263a.AbstractC27533a;
import com.ss.android.appcenter.p1262a.p1263a.AbstractC27534b;
import com.ss.android.appcenter.p1262a.p1263a.AbstractC27536c;
import com.ss.android.appcenter.p1262a.p1263a.AbstractC27537d;
import com.ss.android.appcenter.p1262a.p1263a.AbstractC27540e;
import com.ss.android.appcenter.p1262a.p1263a.AbstractC27541f;
import com.ss.android.appcenter.p1262a.p1263a.AbstractC27542g;
import com.ss.android.appcenter.p1262a.p1263a.AbstractC27543h;
import com.ss.android.appcenter.p1262a.p1263a.AbstractC27544i;
import com.ss.android.appcenter.p1262a.p1263a.AbstractC27545j;
import com.ss.android.appcenter.p1262a.p1263a.AbstractC27546k;
import com.ss.android.appcenter.p1262a.p1263a.AbstractC27547l;

/* renamed from: com.ss.android.lark.appcenter.wrapper.impl.a.c */
public class C29147c implements AbstractC27551b {

    /* renamed from: a */
    private Context f72968a;

    /* renamed from: b */
    private C29146b f72969b;

    @Override // com.ss.android.appcenter.p1262a.AbstractC27551b
    /* renamed from: a */
    public AbstractC27533a mo98216a() {
        return new C29145a(this.f72968a);
    }

    @Override // com.ss.android.appcenter.p1262a.AbstractC27551b
    /* renamed from: b */
    public AbstractC27536c mo98218b() {
        return new C29148d();
    }

    @Override // com.ss.android.appcenter.p1262a.AbstractC27551b
    /* renamed from: c */
    public AbstractC27540e mo98219c() {
        return new C29150f();
    }

    @Override // com.ss.android.appcenter.p1262a.AbstractC27551b
    /* renamed from: d */
    public AbstractC27546k mo98220d() {
        return new C29157l();
    }

    @Override // com.ss.android.appcenter.p1262a.AbstractC27551b
    /* renamed from: e */
    public AbstractC27547l mo98221e() {
        return new C29159m();
    }

    @Override // com.ss.android.appcenter.p1262a.AbstractC27551b
    /* renamed from: f */
    public AbstractC27545j mo98222f() {
        return new C29155k(this.f72968a);
    }

    @Override // com.ss.android.appcenter.p1262a.AbstractC27551b
    /* renamed from: g */
    public AbstractC27537d mo98223g() {
        return new C29149e();
    }

    @Override // com.ss.android.appcenter.p1262a.AbstractC27551b
    /* renamed from: h */
    public AbstractC27543h mo98224h() {
        return new C29153i();
    }

    @Override // com.ss.android.appcenter.p1262a.AbstractC27551b
    /* renamed from: i */
    public AbstractC27541f mo98225i() {
        return new C29151g();
    }

    @Override // com.ss.android.appcenter.p1262a.AbstractC27551b
    /* renamed from: j */
    public AbstractC27544i mo98226j() {
        return new C29154j();
    }

    @Override // com.ss.android.appcenter.p1262a.AbstractC27551b
    /* renamed from: k */
    public AbstractC27542g mo98227k() {
        return new C29152h();
    }

    @Override // com.ss.android.appcenter.p1262a.AbstractC27551b
    /* renamed from: l */
    public AbstractC27534b mo98228l() {
        if (this.f72969b == null) {
            this.f72969b = new C29146b();
        }
        return this.f72969b;
    }

    public C29147c(Context context) {
        this.f72968a = context.getApplicationContext();
    }
}
