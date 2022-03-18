package com.ss.android.lark.integrator.im.chat.dependency;

import com.ss.android.lark.biz.core.api.p1402b.AbstractC29551a;
import com.ss.android.lark.dependency.AbstractC36510y;
import com.ss.android.lark.integrator.im.C39603g;
import java.util.Locale;

/* renamed from: com.ss.android.lark.integrator.im.chat.dependency.p */
class C39541p implements AbstractC36510y {

    /* renamed from: a */
    private final AbstractC29551a f100998a = C39603g.m157159a().getCoreDependency().mo143614t();

    @Override // com.ss.android.lark.dependency.AbstractC36510y
    /* renamed from: c */
    public Locale mo134744c() {
        return this.f100998a.mo105659a();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36510y
    /* renamed from: e */
    public boolean mo134746e() {
        return this.f100998a.mo105664e();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36510y
    /* renamed from: a */
    public Locale mo134742a() {
        return C39603g.m157159a().getCoreDependency().mo143615u();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36510y
    /* renamed from: b */
    public Locale mo134743b() {
        return C39603g.m157159a().getCoreDependency().mo143610r();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36510y
    /* renamed from: d */
    public Locale mo134745d() {
        return C39603g.m157159a().getCoreDependency().mo143609q();
    }

    C39541p() {
    }
}
