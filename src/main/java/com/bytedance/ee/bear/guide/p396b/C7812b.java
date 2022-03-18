package com.bytedance.ee.bear.guide.p396b;

import android.view.View;
import android.view.Window;
import com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener;
import com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d;
import com.bytedance.ee.bear.onboarding.export.p516a.p517a.C10395e;
import com.bytedance.ee.bear.onboarding.export.ui.AbstractC10405c;

/* renamed from: com.bytedance.ee.bear.guide.b.b */
public class C7812b implements AbstractC10397d {

    /* renamed from: a */
    private View f21103a;

    /* renamed from: b */
    private Window f21104b;

    /* renamed from: c */
    private String f21105c;

    /* renamed from: d */
    private AbstractC7814a f21106d;

    /* renamed from: com.bytedance.ee.bear.guide.b.b$a */
    public interface AbstractC7814a {
        void OnFinishMission();
    }

    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: a */
    public String mo21350a() {
        return "space";
    }

    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: b */
    public String mo21352b() {
        return "mobile_doc_share_callout";
    }

    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: c */
    public /* synthetic */ String mo21356c() {
        return AbstractC10397d.CC.$default$c(this);
    }

    /* renamed from: d */
    public void mo30551d() {
        AbstractC7814a aVar = this.f21106d;
        if (aVar != null) {
            aVar.OnFinishMission();
        }
    }

    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: a */
    public boolean mo24400a(AbstractC10405c cVar) {
        cVar.mo39611b(this.f21104b, new C10395e(this.f21105c, this.f21103a), new OnBoardingListener() {
            /* class com.bytedance.ee.bear.guide.p396b.C7812b.C78131 */

            @Override // com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener
            /* renamed from: a */
            public void mo30552a(AbstractC10397d<? extends AbstractC10405c> dVar) {
            }

            @Override // com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener
            /* renamed from: b */
            public void mo30553b(AbstractC10397d<? extends AbstractC10405c> dVar) {
            }

            @Override // com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener
            /* renamed from: c */
            public void mo30554c(AbstractC10397d<? extends AbstractC10405c> dVar) {
                C7812b.this.mo30551d();
            }
        });
        return true;
    }

    public C7812b(View view, Window window, String str, AbstractC7814a aVar) {
        this.f21103a = view;
        this.f21104b = window;
        this.f21105c = str;
        this.f21106d = aVar;
    }
}
