package com.bytedance.ee.ref.card.p689d;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.ref.card.p687b.C13522b;
import com.lynx.react.bridge.JavaOnlyArray;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65806i;
import com.tt.refer.impl.business.p3431b.AbstractC67896a;
import com.tt.refer.p3400a.p3401a.p3402a.C67706e;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.bytedance.ee.ref.card.d.a */
public class C13529a extends AbstractC67896a {

    /* renamed from: a */
    public ExecutorService f35617a = Executors.newSingleThreadExecutor();

    /* renamed from: b */
    private IAppContext f35618b;

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService, com.tt.refer.impl.business.p3431b.AbstractC67896a
    public void release() {
        super.release();
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.refer.impl.business.p3431b.AbstractC67896a
    /* renamed from: a */
    public AbstractC65806i mo50160a() {
        return new AbstractC65806i() {
            /* class com.bytedance.ee.ref.card.p689d.C13529a.C135301 */

            @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65806i
            public void executeAsyncApiHandle(String str, Runnable runnable) {
                C13529a.this.f35617a.submit(runnable);
            }
        };
    }

    public C13529a(IAppContext iAppContext) {
        super(iAppContext);
        this.f35618b = iAppContext;
    }

    @Override // com.tt.refer.p3400a.p3403b.AbstractC67717a
    /* renamed from: a */
    public void mo50162a(C67706e eVar) {
        C13522b bVar = (C13522b) this.f35618b.getExtra();
        if (bVar == null) {
            throw new RuntimeException("card app context extraInfo is null!");
        } else if (bVar.mo50275a() != null) {
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            javaOnlyArray.pushString(eVar.mo235006d());
            javaOnlyArray.pushString(eVar.mo235007e().toString());
            bVar.mo50275a().mo94673b("BDLynxAPIModule").mo93988a("trigger", javaOnlyArray);
        } else {
            AppBrandLogger.m52830i("card_app_api", "card extraInfo is null! cardId:", bVar.mo50278b());
        }
    }
}
