package com.bytedance.ee.webapp;

import android.content.Context;
import com.bytedance.ee.webapp.AbstractC13794f;
import com.ss.android.lark.openapi.jsapi.AbstractC48760b;
import com.ss.android.lark.openapi.jsapi.AbstractC48761c;
import com.ss.android.lark.openapi.jsapi.AbstractC48762d;
import com.ss.android.lark.openapi.permission.bean.C48768a;

/* renamed from: com.bytedance.ee.webapp.c */
public class C13764c implements AbstractC48762d {

    /* renamed from: a */
    AbstractC13794f.AbstractC13796b f35989a = C13802g.m55926a().mo50866b().mo50839b();

    /* renamed from: b */
    AbstractC48762d f35990b;

    @Override // com.ss.android.lark.openapi.jsapi.AbstractC48762d
    /* renamed from: a */
    public boolean mo50753a() {
        return true;
    }

    public C13764c(AbstractC48762d dVar) {
        this.f35990b = dVar;
    }

    @Override // com.ss.android.lark.openapi.jsapi.AbstractC48762d
    /* renamed from: a */
    public AbstractC48760b mo50752a(Context context, AbstractC48761c cVar, String str, String str2) {
        if (!mo50753a()) {
            return C48768a.m192107a();
        }
        if (cVar != null && !cVar.mo170040a()) {
            return C48768a.m192107a();
        }
        AbstractC48762d dVar = this.f35990b;
        if (dVar == null) {
            return C48768a.m192107a();
        }
        if (!dVar.mo50753a()) {
            return C48768a.m192107a();
        }
        return this.f35990b.mo50752a(context, cVar, str, str2);
    }
}
