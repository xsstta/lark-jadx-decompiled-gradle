package com.ss.android.lark.inv.export.mvp;

import com.ss.android.lark.inv.export.mvp.InvBaseView;
import com.ss.android.lark.log.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.inv.export.mvp.b */
public abstract class AbstractC40090b<V extends InvBaseView> {

    /* renamed from: a */
    private V f101883a;

    /* renamed from: b */
    private Map<Class<? extends AbstractC40089a>, AbstractC40089a> f101884b = new HashMap();

    /* renamed from: c */
    private boolean f101885c = true;

    /* renamed from: a */
    public abstract void mo145598a();

    /* renamed from: b */
    public V mo145600b() {
        return this.f101883a;
    }

    /* renamed from: c */
    public void mo145601c() {
        Log.m165389i("UtilsMVP", "destroy presenter: " + getClass().getSimpleName());
        this.f101885c = false;
        for (AbstractC40089a aVar : this.f101884b.values()) {
            if (aVar != null) {
                aVar.mo145597a();
            }
        }
        this.f101884b.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo145599a(V v) {
        this.f101883a = v;
        mo145598a();
    }
}
