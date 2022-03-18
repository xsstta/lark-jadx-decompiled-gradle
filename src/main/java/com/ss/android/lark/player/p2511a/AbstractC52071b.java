package com.ss.android.lark.player.p2511a;

import android.content.Context;
import android.os.Bundle;

/* renamed from: com.ss.android.lark.player.a.b */
public abstract class AbstractC52071b implements AbstractC52086h, AbstractC52094m {

    /* renamed from: a */
    private Context f129223a;

    /* renamed from: b */
    private AbstractC52091j f129224b;

    /* renamed from: c */
    private AbstractC52087i f129225c;

    /* renamed from: d */
    private AbstractC52094m f129226d;

    /* renamed from: e */
    private String f129227e;

    @Override // com.ss.android.lark.player.p2511a.AbstractC52086h
    /* renamed from: a */
    public void mo127014a(int i, Bundle bundle) {
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52086h
    /* renamed from: b */
    public void mo127021b(int i, Bundle bundle) {
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52086h
    /* renamed from: c */
    public void mo127025c(int i, Bundle bundle) {
    }

    /* renamed from: k */
    public final Context mo178442k() {
        return this.f129223a;
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52094m
    /* renamed from: j */
    public final AbstractC52092k mo178441j() {
        AbstractC52094m mVar = this.f129226d;
        if (mVar != null) {
            return mVar.mo178441j();
        }
        return null;
    }

    /* renamed from: l */
    public Object mo178443l() {
        return getClass().getSimpleName();
    }

    public AbstractC52071b(Context context) {
        this.f129223a = context;
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52086h
    /* renamed from: a */
    public final void mo178436a(AbstractC52087i iVar) {
        this.f129225c = iVar;
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52086h
    /* renamed from: a */
    public final void mo178437a(AbstractC52091j jVar) {
        this.f129224b = jVar;
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52086h
    /* renamed from: a */
    public final void mo178438a(AbstractC52094m mVar) {
        this.f129226d = mVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo178439a(String str) {
        this.f129227e = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo178440d(int i, Bundle bundle) {
        AbstractC52091j jVar = this.f129224b;
        if (jVar != null) {
            jVar.mo178464a(i, bundle);
        }
    }
}
