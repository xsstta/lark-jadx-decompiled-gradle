package com.ss.android.lark.browser.impl.p1421a;

import com.larksuite.component.metriclogger.consts.domains.C24341b;
import com.ss.android.lark.browser.C29638a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.browser.impl.a.b */
public class C29926b {

    /* renamed from: a */
    private Map<String, Object> f74653a = new HashMap();

    /* renamed from: b */
    private List<Integer> f74654b = new ArrayList();

    /* renamed from: c */
    private int f74655c;

    /* renamed from: d */
    private int f74656d;

    /* renamed from: e */
    private long f74657e;

    /* renamed from: f */
    private boolean f74658f;

    /* renamed from: a */
    public void mo107792a() {
        C29638a.m109622a().getManisDependency().mo107697a(this.f74658f, this.f74657e, this.f74655c, this.f74656d, this.f74654b, this.f74653a);
    }

    /* renamed from: a */
    public static C29926b m110640a(C24341b bVar) {
        return new C29926b(false, 1, bVar.mo87091a(), bVar.mo87092b()).mo107791a(bVar.mo87093c());
    }

    /* renamed from: a */
    public C29926b mo107791a(int... iArr) {
        if (this.f74654b == null) {
            this.f74654b = new ArrayList();
        }
        for (int i : iArr) {
            this.f74654b.add(Integer.valueOf(i));
        }
        return this;
    }

    /* renamed from: a */
    public static C29926b m110639a(long j, C24341b bVar) {
        return new C29926b(true, j, bVar.mo87091a(), bVar.mo87092b()).mo107791a(bVar.mo87093c());
    }

    /* renamed from: a */
    public C29926b mo107790a(String str, Object obj) {
        if (this.f74653a == null) {
            this.f74653a = new HashMap();
        }
        this.f74653a.put(str, obj);
        return this;
    }

    public C29926b(boolean z, long j, int i, int i2) {
        this.f74657e = j;
        this.f74658f = z;
        this.f74655c = i;
        this.f74656d = i2;
    }
}
