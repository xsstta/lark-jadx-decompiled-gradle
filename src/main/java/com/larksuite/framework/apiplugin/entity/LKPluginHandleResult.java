package com.larksuite.framework.apiplugin.entity;

import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;

public class LKPluginHandleResult extends LKBasePluginResult {

    /* renamed from: d */
    public static final LKPluginHandleResult f64251d = new C25942a().mo92283a();

    /* renamed from: f */
    public boolean mo92281f() {
        return this.f64239a;
    }

    /* renamed from: com.larksuite.framework.apiplugin.entity.LKPluginHandleResult$a */
    public static class C25942a extends LKBasePluginResult.AbstractC25940a<C25942a> {

        /* renamed from: e */
        public boolean f64252e;

        /* renamed from: a */
        public LKPluginHandleResult mo92283a() {
            return new LKPluginHandleResult(this);
        }

        /* renamed from: a */
        public C25942a mo92282a(boolean z) {
            this.f64252e = z;
            return this;
        }
    }

    public LKPluginHandleResult(C25942a aVar) {
        super(aVar.f64252e, aVar.f64244a, aVar.f64245b, aVar.f64246c, aVar.f64247d);
    }
}
