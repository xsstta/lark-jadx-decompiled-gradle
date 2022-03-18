package com.bytedance.ee.bear.list.homepage.navigation;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.onboarding.export.AbstractC10386a;
import com.bytedance.ee.bear.onboarding.export.AbstractC10398b;
import com.bytedance.ee.bear.onboarding.export.mission.SimpleOnBoardingListener;
import com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d;
import com.bytedance.ee.bear.onboarding.export.p516a.p517a.C10390c;
import com.bytedance.ee.bear.onboarding.export.ui.AbstractC10405c;
import com.bytedance.ee.bear.onboarding.export.ui.C10403a;
import com.bytedance.ee.bear.onboarding.export.ui.FlowStyleHollowShape;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.homepage.navigation.e */
public class C8484e {

    /* renamed from: a */
    public static boolean f22910a = true;

    /* renamed from: b */
    public final FragmentActivity f22911b;

    /* renamed from: c */
    public final View f22912c;

    /* renamed from: d */
    private Disposable f22913d;

    /* renamed from: b */
    public void mo33155b() {
        ((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39507a().mo39519b("mobile_space_share_with_me_navigation");
    }

    /* renamed from: a */
    public void mo33154a() {
        C13479a.m54764b("SharedWithMeGuide", "onGuideStart()...");
        if (this.f22911b == null || this.f22912c == null) {
            C13479a.m54764b("SharedWithMeGuide", "onGuideStart()...parameter is null, return");
        } else {
            this.f22913d = ((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39507a().mo39520c().mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.list.homepage.navigation.$$Lambda$e$LW2v2UyELSogeHwZBxNDWzZvEdE */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C8484e.this.m35159a((C8484e) ((AbstractC10386a) obj));
                }
            }, $$Lambda$e$okzisGCTYWoINbi1nx7B2RVWdNE.INSTANCE);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.homepage.navigation.e$a */
    public class C8486a extends SimpleOnBoardingListener {
        private C8486a() {
        }

        @Override // com.bytedance.ee.bear.onboarding.export.mission.SimpleOnBoardingListener, com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener
        /* renamed from: a */
        public void mo30552a(AbstractC10397d<? extends AbstractC10405c> dVar) {
            C13479a.m54764b("SharedWithMeGuide", "onConfirm()...");
            C8484e.this.mo33155b();
        }

        @Override // com.bytedance.ee.bear.onboarding.export.mission.SimpleOnBoardingListener, com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener
        /* renamed from: b */
        public void mo30553b(AbstractC10397d<? extends AbstractC10405c> dVar) {
            C13479a.m54764b("SharedWithMeGuide", "onCancel()...");
            C8484e.this.mo33155b();
        }

        @Override // com.bytedance.ee.bear.onboarding.export.mission.SimpleOnBoardingListener, com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener
        /* renamed from: c */
        public void mo30554c(AbstractC10397d<? extends AbstractC10405c> dVar) {
            C13479a.m54764b("SharedWithMeGuide", "onDismiss()...");
            C8484e.this.mo33155b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.homepage.navigation.e$b */
    public class C8487b implements AbstractC10397d<C10403a> {
        @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
        /* renamed from: a */
        public String mo21350a() {
            return "space";
        }

        @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
        /* renamed from: b */
        public String mo21352b() {
            return "mobile_space_share_with_me_navigation";
        }

        @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
        /* renamed from: c */
        public /* synthetic */ String mo21356c() {
            return AbstractC10397d.CC.$default$c(this);
        }

        private C8487b() {
        }

        /* renamed from: a */
        public boolean mo24400a(C10403a aVar) {
            C13479a.m54764b("SharedWithMeGuide", "show()...enable = " + C8484e.f22910a);
            if (C8484e.f22910a) {
                C10390c cVar = new C10390c(C8484e.this.f22911b.getString(R.string.CreationMobile_ECM_ShareWithMe_Tab), true, C8484e.this.f22912c);
                cVar.mo39561a(C8484e.this.f22911b.getString(R.string.CreationMobile_ECM_ShareWithMe_description)).mo39565b(C8484e.this.f22911b.getString(R.string.Doc_Facade_OfflineKnow)).mo39560a(FlowStyleHollowShape.None);
                aVar.mo39604a(C8484e.this.f22911b.getWindow(), cVar, new C8486a());
            }
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m35159a(AbstractC10386a aVar) throws Exception {
        aVar.mo39514a(new C8487b(), this.f22911b);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m35160a(Throwable th) throws Exception {
        C13479a.m54764b("SharedWithMeGuide", "getOnBoardingInstance error : " + th);
    }

    public C8484e(FragmentActivity fragmentActivity, View view) {
        this.f22911b = fragmentActivity;
        this.f22912c = view;
    }
}
