package com.ss.android.lark.audit;

import com.ss.android.lark.audit.model.AuditEvent;
import com.ss.android.lark.audit.model.Env;
import com.ss.android.lark.audit.model.Extend;
import com.ss.android.lark.audit.model.ObjectEntity;
import com.ss.android.lark.audit.model.OperatorEntity;
import com.ss.android.lark.audit.model.RecipientEntity;
import java.util.List;

/* renamed from: com.ss.android.lark.audit.a */
public class C29282a {

    /* renamed from: a */
    private int f73304a;

    /* renamed from: b */
    private int f73305b;

    /* renamed from: c */
    private long f73306c;

    /* renamed from: d */
    private String f73307d;

    /* renamed from: e */
    private OperatorEntity f73308e;

    /* renamed from: f */
    private List<RecipientEntity> f73309f;

    /* renamed from: g */
    private List<ObjectEntity> f73310g;

    /* renamed from: h */
    private Env f73311h;

    /* renamed from: i */
    private Extend f73312i;

    /* renamed from: a */
    public AuditEvent mo103803a() {
        return new AuditEvent(this.f73304a, this.f73305b, this.f73307d, this.f73308e, this.f73309f, this.f73310g, this.f73311h, this.f73312i, this.f73306c);
    }

    /* renamed from: a */
    public C29282a mo103796a(int i) {
        this.f73304a = i;
        return this;
    }

    /* renamed from: b */
    public C29282a mo103804b(int i) {
        this.f73305b = i;
        return this;
    }

    /* renamed from: a */
    public C29282a mo103797a(long j) {
        this.f73306c = j;
        return this;
    }

    /* renamed from: a */
    public C29282a mo103798a(Env env) {
        this.f73311h = env;
        return this;
    }

    /* renamed from: a */
    public C29282a mo103799a(Extend extend) {
        this.f73312i = extend;
        return this;
    }

    /* renamed from: a */
    public C29282a mo103800a(OperatorEntity operatorEntity) {
        this.f73308e = operatorEntity;
        return this;
    }

    /* renamed from: a */
    public C29282a mo103801a(String str) {
        this.f73307d = str;
        return this;
    }

    /* renamed from: a */
    public C29282a mo103802a(List<ObjectEntity> list) {
        this.f73310g = list;
        return this;
    }
}
