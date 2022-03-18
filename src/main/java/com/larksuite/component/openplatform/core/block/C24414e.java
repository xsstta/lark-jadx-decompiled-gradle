package com.larksuite.component.openplatform.core.block;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25891b;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65806i;
import com.tt.refer.impl.business.p3431b.AbstractC67896a;
import com.tt.refer.p3400a.p3401a.p3402a.C67706e;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.larksuite.component.openplatform.core.block.e */
public class C24414e extends AbstractC67896a {

    /* renamed from: a */
    public final ExecutorService f60246a = Executors.newSingleThreadExecutor();

    /* renamed from: b */
    private final IAppContext f60247b;

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService, com.tt.refer.impl.business.p3431b.AbstractC67896a
    public void release() {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.refer.impl.business.p3431b.AbstractC67896a
    /* renamed from: a */
    public AbstractC65806i mo50160a() {
        return new AbstractC65806i() {
            /* class com.larksuite.component.openplatform.core.block.C24414e.C244151 */

            @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65806i
            public void executeAsyncApiHandle(String str, Runnable runnable) {
                C24414e.this.f60246a.execute(runnable);
            }
        };
    }

    public C24414e(IAppContext iAppContext) {
        super(iAppContext);
        this.f60247b = iAppContext;
    }

    @Override // com.tt.refer.p3400a.p3403b.AbstractC67717a
    /* renamed from: a */
    public void mo50162a(C67706e eVar) {
        AppBrandLogger.m52828d("BlockJsBridge", "invokeJsRunTimeApi, api: " + eVar.mo235006d() + " ,param:" + eVar.mo235007e());
        AbstractC25891b appContainer = this.f60247b.getAppContainer();
        if (appContainer instanceof AbstractC24461b) {
            ((AbstractC24461b) appContainer).mo87110a(eVar.mo235006d(), eVar.mo235007e());
            return;
        }
        AppBrandLogger.m52829e("BlockJsBridge", "container is null AbsAppContainer");
    }
}
