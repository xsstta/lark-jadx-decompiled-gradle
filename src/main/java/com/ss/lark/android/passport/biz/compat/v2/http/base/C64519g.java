package com.ss.lark.android.passport.biz.compat.v2.http.base;

import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.ss.lark.android.passport.biz.compat.v2.http.base.g */
public class C64519g implements AbstractC64517e {

    /* renamed from: a */
    public Object f162898a;

    /* renamed from: b */
    private Iterator<AbstractC64517e> f162899b;

    /* renamed from: c */
    private UniContext f162900c;

    public C64519g(UniContext uniContext, AbstractC64517e... eVarArr) {
        Iterator<AbstractC64517e> it;
        this.f162900c = uniContext;
        if (eVarArr != null) {
            it = Arrays.asList(eVarArr).iterator();
        } else {
            it = null;
        }
        this.f162899b = it;
    }

    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.AbstractC64517e
    /* renamed from: a */
    public void mo223181a(final BaseV3HttpRequest baseV3HttpRequest, final AbstractC49352d dVar) {
        Iterator<AbstractC64517e> it = this.f162899b;
        if (it == null || !it.hasNext()) {
            dVar.mo145179a(this.f162898a);
        } else {
            this.f162899b.next().mo223181a(baseV3HttpRequest, new AbstractC49352d() {
                /* class com.ss.lark.android.passport.biz.compat.v2.http.base.C64519g.C645201 */

                @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
                /* renamed from: a */
                public void mo145178a(NetworkErrorResult networkErrorResult) {
                    dVar.mo145178a(networkErrorResult);
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
                /* renamed from: a */
                public void mo145179a(Object obj) {
                    C64519g.this.f162898a = obj;
                    C64519g.this.mo223181a(baseV3HttpRequest, dVar);
                }
            });
        }
    }
}
