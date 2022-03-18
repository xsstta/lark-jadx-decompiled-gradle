package com.larksuite.framework.apiplugin.entity;

import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;

public class LKPluginInterceptResult extends LKBasePluginResult {

    /* renamed from: d */
    public static final LKPluginInterceptResult f64253d = new C25943a().mo92286a();

    /* renamed from: f */
    public boolean mo92284f() {
        return this.f64239a;
    }

    /* renamed from: com.larksuite.framework.apiplugin.entity.LKPluginInterceptResult$a */
    public static class C25943a extends LKBasePluginResult.AbstractC25940a<C25943a> {

        /* renamed from: e */
        public boolean f64254e;

        /* renamed from: a */
        public LKPluginInterceptResult mo92286a() {
            return new LKPluginInterceptResult(this);
        }

        /* renamed from: a */
        public C25943a mo92285a(boolean z) {
            this.f64254e = z;
            return this;
        }
    }

    public LKPluginInterceptResult(C25943a aVar) {
        super(aVar.f64254e, aVar.f64244a, aVar.f64245b, aVar.f64246c, aVar.f64247d);
    }
}
