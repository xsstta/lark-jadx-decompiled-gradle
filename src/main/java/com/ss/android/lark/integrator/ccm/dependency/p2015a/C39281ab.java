package com.ss.android.lark.integrator.ccm.dependency.p2015a;

import com.bytedance.ee.bear.lark.p414b.AbstractC8002m;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.mira.MiraModule;
import com.ss.android.lark.mira.UIGetPluginCallback;

/* renamed from: com.ss.android.lark.integrator.ccm.dependency.a.ab */
public class C39281ab implements AbstractC8002m {
    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC8002m
    /* renamed from: a */
    public <T> void mo31014a(String str, Class<T> cls, String str2, final AbstractC8002m.AbstractC8003a<T> aVar) {
        MiraModule.m205160a(str, cls, str2, new UIGetPluginCallback<T>() {
            /* class com.ss.android.lark.integrator.ccm.dependency.p2015a.C39281ab.C392821 */

            @Override // com.ss.android.lark.mira.UIGetPluginCallback
            /* renamed from: a */
            public void mo143154a() {
                C13479a.m54764b("MiraDependencyImpl", "onPluginLoading()...");
                AbstractC8002m.AbstractC8003a aVar = aVar;
                if (aVar != null) {
                    aVar.mo26086a();
                }
            }

            @Override // com.larksuite.framework.callback.UIGetDataCallback
            public void onErrored(ErrorResult errorResult) {
                super.onErrored(errorResult);
                C13479a.m54764b("MiraDependencyImpl", "onErrored()...error = " + errorResult);
                AbstractC8002m.AbstractC8003a aVar = aVar;
                if (aVar != null) {
                    aVar.onErrored(errorResult);
                }
            }

            @Override // com.larksuite.framework.callback.UIGetDataCallback
            public void onSuccessed(T t) {
                super.onSuccessed(t);
                C13479a.m54764b("MiraDependencyImpl", "onSuccessed()...plugin = " + ((Object) t));
                AbstractC8002m.AbstractC8003a aVar = aVar;
                if (aVar != null) {
                    aVar.onSuccessed(t);
                }
            }
        });
    }
}
