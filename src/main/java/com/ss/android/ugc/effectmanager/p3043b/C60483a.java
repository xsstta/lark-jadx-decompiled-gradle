package com.ss.android.ugc.effectmanager.p3043b;

import android.content.Context;
import com.ss.android.ugc.effectmanager.C60549e;
import com.ss.android.ugc.effectmanager.common.p3053h.C60525c;
import com.ss.android.ugc.effectmanager.p3065f.p3066a.p3067a.C60627a;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.b.a */
public class C60483a {

    /* renamed from: a */
    private C60549e f151169a;

    /* renamed from: a */
    public C60549e mo207066a() {
        return this.f151169a;
    }

    /* renamed from: c */
    public Context mo207068c() {
        return this.f151169a.mo207311B();
    }

    /* renamed from: b */
    public String mo207067b() {
        List<C60627a> C = this.f151169a.mo207312C();
        if (C60525c.m235234a((List) C)) {
            return "";
        }
        return C.get(0).mo208018c();
    }

    public C60483a(C60549e eVar) {
        this.f151169a = eVar;
    }
}
