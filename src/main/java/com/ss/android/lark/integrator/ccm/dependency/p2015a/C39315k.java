package com.ss.android.lark.integrator.ccm.dependency.p2015a;

import com.bytedance.ee.bear.basesdk.p253d.AbstractC4471c;
import com.ss.android.lark.biz.core.api.IUiModeService;
import com.ss.android.lark.integrator.ccm.dependency.p2015a.C39315k;
import com.ss.android.lark.setting.service.usersetting.appearance.UiModeService;

/* renamed from: com.ss.android.lark.integrator.ccm.dependency.a.k */
class C39315k implements AbstractC4471c {

    /* renamed from: com.ss.android.lark.integrator.ccm.dependency.a.k$a */
    public interface AbstractC39316a {
        void onDarkModeChange(int i);
    }

    C39315k() {
    }

    /* renamed from: a */
    private void m155044a(AbstractC39316a aVar) {
        UiModeService dVar = UiModeService.f135042b;
        aVar.getClass();
        dVar.mo105601a(new IUiModeService.UiModeChangeListener() {
            /* class com.ss.android.lark.integrator.ccm.dependency.p2015a.$$Lambda$LDsybP1bd8C7zHnju3rdk214v2I */

            @Override // com.ss.android.lark.biz.core.api.IUiModeService.UiModeChangeListener
            public final void onNightModeChange(int i) {
                C39315k.AbstractC39316a.this.onDarkModeChange(i);
            }
        });
    }

    @Override // com.bytedance.ee.bear.basesdk.p253d.AbstractC4471c
    /* renamed from: a */
    public void mo17239a(AbstractC4471c.AbstractC4472a aVar) {
        aVar.getClass();
        m155044a(new AbstractC39316a() {
            /* class com.ss.android.lark.integrator.ccm.dependency.p2015a.$$Lambda$43452o52J8VgoP8JxID2AQtXvEE */

            @Override // com.ss.android.lark.integrator.ccm.dependency.p2015a.C39315k.AbstractC39316a
            public final void onDarkModeChange(int i) {
                AbstractC4471c.AbstractC4472a.this.onDarkModeChange(i);
            }
        });
    }
}
