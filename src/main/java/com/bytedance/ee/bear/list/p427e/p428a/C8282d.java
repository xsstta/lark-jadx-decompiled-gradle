package com.bytedance.ee.bear.list.p427e.p428a;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.create.C8238f;
import com.bytedance.ee.bear.list.create.C8254n;
import com.bytedance.ee.bear.list.homepage.AbstractC8476f;
import com.bytedance.ee.bear.list.p427e.AbstractC8278a;
import com.bytedance.ee.bear.list.p427e.C8288c;
import com.bytedance.ee.bear.onboarding.export.AbstractC10398b;
import com.bytedance.ee.bear.onboarding.export.mission.SimpleOnBoardingListener;
import com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d;
import com.bytedance.ee.bear.onboarding.export.ui.AbstractC10405c;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p716r.C13721c;
import com.larksuite.suite.R;
import java.util.Arrays;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.e.a.d */
public class C8282d extends AbstractC8278a {

    /* renamed from: c */
    public final View f22408c;

    /* renamed from: d */
    public final AbstractC8476f f22409d;

    /* renamed from: e */
    public boolean f22410e;

    /* renamed from: f */
    public boolean f22411f;

    /* renamed from: g */
    private final FragmentActivity f22412g;

    /* renamed from: h */
    private final C7718l f22413h;

    /* renamed from: i */
    private final C10917c f22414i;

    /* renamed from: j */
    private final View f22415j;

    /* renamed from: k */
    private C8238f f22416k;

    /* renamed from: h */
    public boolean mo32581h() {
        return m34090a(this.f22414i);
    }

    /* renamed from: f */
    public void mo32580f() {
        C13479a.m54764b("SpaceNewUserGuide", "finishGuide()...");
        m34091g();
        if (this.f22410e) {
            C8288c.m34116b();
        } else {
            mo32567a();
        }
    }

    /* renamed from: g */
    public static void m34091g() {
        C13479a.m54764b("SpaceNewUserGuide", "setNewerGuideFinished()...");
        ((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39507a().mo39516a(Arrays.asList("mobile_space_newbie_navigation", "mobile_space_newbie_createDocument", "mobile_space_newbie_createTemplate"));
    }

    /* renamed from: i */
    private void m34092i() {
        C13479a.m54764b("SpaceNewUserGuide", "showNavigationGuide()...");
        if (this.f22415j == null) {
            C13479a.m54764b("SpaceNewUserGuide", "mNavigationView is null");
            mo32567a();
            return;
        }
        ((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39507a().mo39514a(new C8281c("mobile_space_newbie_navigation", 1, 3, this.f22415j, new SimpleOnBoardingListener() {
            /* class com.bytedance.ee.bear.list.p427e.p428a.C8282d.C82831 */

            @Override // com.bytedance.ee.bear.onboarding.export.mission.SimpleOnBoardingListener, com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener
            /* renamed from: a */
            public void mo30552a(AbstractC10397d<? extends AbstractC10405c> dVar) {
                C13479a.m54764b("SpaceNewUserGuide", "showNavigationGuide()...onConfirm");
                C8282d.this.f22411f = true;
            }

            @Override // com.bytedance.ee.bear.onboarding.export.mission.SimpleOnBoardingListener, com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener
            /* renamed from: b */
            public void mo30553b(AbstractC10397d<? extends AbstractC10405c> dVar) {
                C13479a.m54764b("SpaceNewUserGuide", "showNavigationGuide()...onCancel");
                C8282d.this.f22410e = true;
                C8282d.this.f22411f = true;
                C8282d.this.mo32580f();
            }

            @Override // com.bytedance.ee.bear.onboarding.export.mission.SimpleOnBoardingListener, com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener
            /* renamed from: c */
            public void mo30554c(AbstractC10397d<? extends AbstractC10405c> dVar) {
                C13479a.m54764b("SpaceNewUserGuide", "showNavigationGuide()...onDismiss");
                if (!C8282d.this.f22410e) {
                    if (!C8282d.this.f22411f) {
                        C8282d.this.f22410e = true;
                        C8282d.this.mo32580f();
                        return;
                    }
                    C8282d.this.mo32577c();
                }
            }
        }), this.f22412g);
    }

    @Override // com.bytedance.ee.bear.list.p427e.AbstractC8287b
    /* renamed from: b */
    public void mo32576b() {
        C13479a.m54764b("SpaceNewUserGuide", "onGuideStart()....");
        if (this.f22412g == null) {
            C13479a.m54764b("SpaceNewUserGuide", "onGuideStart()...mActivity is null");
            mo32567a();
            return;
        }
        m34092i();
        ListAnalysis.m32508a(C5234y.m21391b(), mo32581h(), 1);
    }

    /* renamed from: c */
    public void mo32577c() {
        View view;
        C13479a.m54764b("SpaceNewUserGuide", "showCreateMenu()...");
        AbstractC8476f fVar = this.f22409d;
        if (fVar == null || (view = this.f22408c) == null) {
            C13479a.m54764b("SpaceNewUserGuide", "mMainTabFragment is null or mCreateView is null");
            return;
        }
        fVar.onMenuCreateClick(view);
        final C8254n nVar = (C8254n) aj.m5366a(this.f22412g).mo6005a(C8254n.class);
        nVar.getSelectCreationMenuStateLiveData().mo5923a(this.f22413h, new AbstractC1178x<Integer>() {
            /* class com.bytedance.ee.bear.list.p427e.p428a.C8282d.C82842 */

            /* renamed from: a */
            public void onChanged(Integer num) {
                C13479a.m54764b("SpaceNewUserGuide", "getSelectCreationMenuStateLiveData()...onChange, state = " + num);
                if (num != null) {
                    if (num.intValue() == 1) {
                        C8282d.this.mo32578d();
                        return;
                    }
                    C8282d.this.mo32567a();
                    nVar.getSelectCreationMenuStateLiveData().mo5928b(this);
                }
            }
        });
        ListAnalysis.m32508a(C5234y.m21391b(), mo32581h(), 2);
    }

    /* renamed from: d */
    public void mo32578d() {
        C8238f fVar;
        String str;
        C13479a.m54764b("SpaceNewUserGuide", "showMenuCreateGuide()");
        if (this.f22412g == null || (fVar = this.f22416k) == null || fVar.getView() == null) {
            C13479a.m54764b("SpaceNewUserGuide", "mActivity is null or mCreateMenu is null");
            mo32567a();
            return;
        }
        C82853 r9 = new SimpleOnBoardingListener() {
            /* class com.bytedance.ee.bear.list.p427e.p428a.C8282d.C82853 */

            @Override // com.bytedance.ee.bear.onboarding.export.mission.SimpleOnBoardingListener, com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener
            /* renamed from: a */
            public void mo30552a(AbstractC10397d<? extends AbstractC10405c> dVar) {
                C13479a.m54764b("SpaceNewUserGuide", "showMenuCreateGuide()...onConfirm");
                C8282d.this.f22411f = true;
            }

            @Override // com.bytedance.ee.bear.onboarding.export.mission.SimpleOnBoardingListener, com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener
            /* renamed from: b */
            public void mo30553b(AbstractC10397d<? extends AbstractC10405c> dVar) {
                C13479a.m54764b("SpaceNewUserGuide", "showMenuCreateGuide()...onCancel");
                C8282d.this.f22410e = true;
                C8282d.this.f22411f = true;
                if (C8282d.this.f22409d != null) {
                    C8282d.this.f22409d.onMenuCreateClick(C8282d.this.f22408c);
                }
                C8282d.this.mo32580f();
            }

            @Override // com.bytedance.ee.bear.onboarding.export.mission.SimpleOnBoardingListener, com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener
            /* renamed from: c */
            public void mo30554c(AbstractC10397d<? extends AbstractC10405c> dVar) {
                C13479a.m54764b("SpaceNewUserGuide", "showMenuCreateGuide()...onDismiss");
                if (!C8282d.this.f22410e) {
                    if (!C8282d.this.f22411f) {
                        C8282d.this.f22410e = true;
                        C8282d.this.mo32580f();
                        return;
                    }
                    C8282d.this.mo32579e();
                }
            }
        };
        View findViewById = this.f22416k.getView().findViewById(R.id.list_menu_create_recycler_view);
        if (C8292f.m34174b()) {
            str = this.f22412g.getString(R.string.CreationMobile_Onboarding_Tooltip1);
        } else {
            str = C10539a.m43639a(this.f22412g, R.string.Doc_List_CreateTips, "appendType", "");
        }
        ((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39507a().mo39514a(new C8279a("mobile_space_newbie_createDocument", 2, 3, str, findViewById, this.f22416k.v_().getWindow(), r9), this.f22412g);
    }

    /* renamed from: e */
    public void mo32579e() {
        C8238f fVar;
        C13479a.m54764b("SpaceNewUserGuide", "showMenuTemplatesGuide()...");
        if (!this.f22410e) {
            if (this.f22412g == null || (fVar = this.f22416k) == null || fVar.getView() == null) {
                C13479a.m54764b("SpaceNewUserGuide", "mActivity is null or mCreateMenuView is null");
                mo32567a();
                return;
            }
            ((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39507a().mo39514a(new C8280b("mobile_space_newbie_createTemplate", 3, 3, this.f22412g.getString(R.string.CreationMobile_Onboarding_Tooltip2), this.f22416k.getView().findViewById(R.id.recentTemplatesFragment), this.f22416k.v_().getWindow(), new SimpleOnBoardingListener() {
                /* class com.bytedance.ee.bear.list.p427e.p428a.C8282d.C82864 */

                @Override // com.bytedance.ee.bear.onboarding.export.mission.SimpleOnBoardingListener, com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener
                /* renamed from: c */
                public void mo30554c(AbstractC10397d<? extends AbstractC10405c> dVar) {
                    C13479a.m54764b("SpaceNewUserGuide", "showMenuTemplatesGuide()...onDismiss");
                    C8282d.this.mo32580f();
                    if (C8282d.this.f22409d != null) {
                        C8282d.this.f22409d.onMenuCreateClick(C8282d.this.f22408c);
                    }
                }
            }), this.f22412g);
            ListAnalysis.m32508a(C5234y.m21391b(), mo32581h(), 3);
        }
    }

    /* renamed from: a */
    public void mo32575a(C8238f fVar) {
        C13479a.m54764b("SpaceNewUserGuide", "setCreateMenu()...createMenu = " + fVar);
        this.f22416k = fVar;
    }

    /* renamed from: a */
    public static boolean m34090a(C10917c cVar) {
        boolean z;
        String e = C4511g.m18594d().mo17356e();
        long a = C13721c.m55642a(e, 0L) >> 32;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (currentTimeMillis - a < 604800) {
            z = true;
        } else {
            z = false;
        }
        C13479a.m54764b("SpaceNewUserGuide", "uid = " + e + ", user createTime = " + a + ", currentTime = " + currentTimeMillis + ", oneWeekTime = " + 604800L + ", result = " + z);
        return z;
    }

    public C8282d(FragmentActivity fragmentActivity, C7718l lVar, C10917c cVar, View view, View view2, AbstractC8476f fVar) {
        this.f22412g = fragmentActivity;
        this.f22413h = lVar;
        this.f22414i = cVar;
        this.f22415j = view;
        this.f22408c = view2;
        this.f22409d = fVar;
    }
}
