package com.larksuite.component.openplatform.core.plugin.infra;

import com.tt.miniapp.p3324r.p3326b.AbstractC66715a;
import com.tt.miniapp.util.C67068y;
import com.tt.miniapphost.AppbrandContext;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.c */
public class C24886c extends AbstractC66715a {
    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: a */
    public String mo87633a() {
        return "getSystemInfoSync";
    }

    public C24886c() {
    }

    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: b */
    public String mo87634b() {
        try {
            return mo232446a(C67068y.m261378a(AppbrandContext.getInst().getApplicationContext(), AppbrandContext.getInst().isGame(), mo232455f()));
        } catch (Exception e) {
            return mo232445a(e);
        }
    }

    public C24886c(String str) {
        super(str);
    }
}
