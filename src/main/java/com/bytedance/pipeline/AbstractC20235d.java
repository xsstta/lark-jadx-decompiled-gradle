package com.bytedance.pipeline;

import com.bytedance.pipeline.p859a.AbstractC20231a;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.bytedance.pipeline.d */
public abstract class AbstractC20235d<IN, OUT> {

    /* renamed from: a */
    private static AtomicLong f49509a = new AtomicLong();

    /* renamed from: b */
    private AbstractC20231a f49510b;

    /* renamed from: c */
    AbstractC20235d f49511c;

    /* renamed from: d */
    IN f49512d;

    /* renamed from: e */
    OUT f49513e;

    /* renamed from: f */
    private AbstractC20233b f49514f;

    /* renamed from: g */
    private long f49515g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo52179a(Object... objArr) {
    }

    public abstract Object a_(AbstractC20233b<OUT> bVar, IN in) throws Throwable;

    /* renamed from: c */
    public long mo68491c() {
        return this.f49515g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public AbstractC20233b mo68497g() {
        return this.f49514f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo68493d() {
        AbstractC20231a aVar = this.f49510b;
        if (aVar != null) {
            aVar.mo68475d(this.f49514f, this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo68495e() {
        AbstractC20231a aVar = this.f49510b;
        if (aVar != null) {
            aVar.mo68479f(this.f49514f, this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo68496f() {
        AbstractC20231a aVar = this.f49510b;
        if (aVar != null) {
            aVar.mo68477e(this.f49514f, this);
        }
    }

    /* renamed from: a */
    private void mo52216a() {
        AbstractC20235d dVar = this.f49511c;
        if (dVar != null) {
            this.f49515g = dVar.f49515g;
            return;
        }
        long andIncrement = f49509a.getAndIncrement();
        this.f49515g = andIncrement;
        if (andIncrement < 0) {
            throw new RuntimeException("Pipeline ID use up!");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo68490b(Throwable th) {
        AbstractC20231a aVar = this.f49510b;
        if (aVar != null) {
            aVar.mo68474c(this.f49514f, this, th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo68492c(Throwable th) {
        AbstractC20231a aVar = this.f49510b;
        if (aVar != null) {
            aVar.mo68478e(this.f49514f, this, th);
        }
    }

    /* renamed from: d */
    public final void mo68494d(Throwable th) {
        AbstractC20231a aVar = this.f49510b;
        if (aVar != null) {
            aVar.mo68476d(this.f49514f, this, th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo68489a(AbstractC20233b bVar, AbstractC20235d dVar, IN in, AbstractC20231a aVar, Object[] objArr) {
        this.f49514f = new C20250m(bVar);
        this.f49511c = dVar;
        this.f49512d = in;
        this.f49510b = aVar;
        mo52216a();
        mo52179a(objArr);
    }
}
