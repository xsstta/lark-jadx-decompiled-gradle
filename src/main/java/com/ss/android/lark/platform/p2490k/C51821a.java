package com.ss.android.lark.platform.p2490k;

import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.account_provider.integrator.C28513a;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.featuregating.p1844a.AbstractC37245c;
import com.ss.android.lark.featuregating.p1846c.AbstractC37251b;
import com.ss.android.lark.larkconfig.larksetting.C41164c;
import com.ss.android.lark.platform.ae.C51677a;
import com.ss.android.lark.platform.p2490k.C51821a;
import com.ss.android.lark.utils.LarkContext;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.lark.platform.k.a */
public class C51821a {

    /* renamed from: a */
    public static final AtomicBoolean f128777a = new AtomicBoolean(false);

    /* renamed from: b */
    public static final Map<String, Boolean> f128778b = new ConcurrentHashMap();

    /* renamed from: a */
    public static void m200893a() {
        C37239a.m146647a(m200894b());
    }

    /* renamed from: b */
    private static AbstractC37245c m200894b() {
        return new AbstractC37245c() {
            /* class com.ss.android.lark.platform.p2490k.C51821a.C518221 */

            @Override // com.ss.android.lark.featuregating.p1844a.AbstractC37245c
            /* renamed from: a */
            public Context mo136942a() {
                return LarkContext.getApplication();
            }

            @Override // com.ss.android.lark.featuregating.p1844a.AbstractC37245c
            /* renamed from: b */
            public void mo136946b() {
                C51677a.m200443a().mo148569c().mo148563d();
            }

            @Override // com.ss.android.lark.featuregating.p1844a.AbstractC37245c
            /* renamed from: a */
            public void mo136943a(IGetDataCallback<String> iGetDataCallback) {
                C41164c.m163343a().mo148462a(iGetDataCallback);
            }

            @Override // com.ss.android.lark.featuregating.p1844a.AbstractC37245c
            /* renamed from: a */
            public void mo136945a(AbstractC37251b bVar) {
                C28513a.m104513a(new C28513a.AbstractC28515b() {
                    /* class com.ss.android.lark.platform.p2490k.$$Lambda$a$1$lmHXNGk2_mHbsgrunNDkPJe85EI */

                    @Override // com.ss.android.lark.account_provider.integrator.C28513a.AbstractC28515b
                    public final void onLoginStatusChanged(boolean z) {
                        C51821a.C518221.m200895a(AbstractC37251b.this, z);
                    }
                });
            }

            @Override // com.ss.android.lark.featuregating.p1844a.AbstractC37245c
            /* renamed from: a */
            public void mo136944a(IGetDataCallback<Map<String, Boolean>> iGetDataCallback, IGetDataCallback<Map<String, Boolean>> iGetDataCallback2) {
                C37239a.m146646a(iGetDataCallback, iGetDataCallback2);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m200895a(AbstractC37251b bVar, boolean z) {
                if (bVar != null) {
                    bVar.onLoginStatusChanged(z);
                }
            }
        };
    }
}
