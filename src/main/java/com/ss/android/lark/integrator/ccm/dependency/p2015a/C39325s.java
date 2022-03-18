package com.ss.android.lark.integrator.ccm.dependency.p2015a;

import com.bytedance.ee.bear.basesdk.p253d.AbstractC4473d;
import com.bytedance.ee.bear.basesdk.p253d.C4475f;
import com.ss.android.lark.biz.core.api.AbstractC29540ab;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57765ac;
import com.ss.android.lark.utils.LarkContext;
import java.util.Locale;

/* renamed from: com.ss.android.lark.integrator.ccm.dependency.a.s */
class C39325s implements AbstractC4473d {

    /* renamed from: com.ss.android.lark.integrator.ccm.dependency.a.s$a */
    public interface AbstractC39327a {
        void onLanguageChange(Locale locale, Locale locale2);
    }

    C39325s() {
    }

    @Override // com.bytedance.ee.bear.basesdk.p253d.AbstractC4473d
    /* renamed from: a */
    public void mo17241a(C4475f.AbstractC4476a aVar) {
        aVar.getClass();
        m155063a(new AbstractC39327a() {
            /* class com.ss.android.lark.integrator.ccm.dependency.p2015a.$$Lambda$2sfhrXs4qAIcfyxwZBEc1oc9GvQ */

            @Override // com.ss.android.lark.integrator.ccm.dependency.p2015a.C39325s.AbstractC39327a
            public final void onLanguageChange(Locale locale, Locale locale2) {
                C4475f.AbstractC4476a.this.onLanguageChange(locale, locale2);
            }
        });
    }

    /* renamed from: a */
    private void m155063a(final AbstractC39327a aVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).registerLanguageChangeListener(new AbstractC29540ab() {
            /* class com.ss.android.lark.integrator.ccm.dependency.p2015a.C39325s.C393261 */

            @Override // com.ss.android.lark.biz.core.api.AbstractC29540ab
            public void onLanguageChange(Locale locale, Locale locale2) {
                aVar.onLanguageChange(locale, locale2);
                if (C57765ac.m224187a(LarkContext.getApplication())) {
                    ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).injectWebViewCoreResource(LarkContext.getApplication());
                }
            }
        });
    }
}
