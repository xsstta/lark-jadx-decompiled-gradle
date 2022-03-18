package com.larksuite.component.openplatform.core.plugin.messenger;

import android.os.Handler;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.util.Collections;
import java.util.List;

@ApiSupportType(apiName = {"hideToast"}, support = {AppType.WebAPP}, testSupport = {AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.n */
public class C25231n extends AbstractC65797c {
    public C25231n() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("hideToast");
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        AppBrandLogger.m52830i("HideToastHandler", bVar.mo234988d());
        new Handler(mo230473f().getApplicationContext().getMainLooper()).post(new Runnable() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.C25231n.RunnableC252321 */

            public void run() {
                C25231n.this.mo230475h().mo235059j();
                C25231n.this.mo230494j();
            }
        });
    }

    public C25231n(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}
