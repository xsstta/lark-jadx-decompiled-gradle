package com.bytedance.ee.bear.onboarding;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.BinderAccountChangeCallback;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.onboarding.export.OnBoardingColorStyle;
import com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d;
import com.bytedance.ee.bear.onboarding.export.ui.AbstractC10405c;
import com.bytedance.ee.bear.onboarding.export.ui.C10403a;
import com.bytedance.ee.bear.onboarding.synchronization.OnBoardingSynchronizer;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13629i;
import com.ss.android.lark.util.share_preference.UserSP;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.onboarding.a */
public class C10370a {

    /* renamed from: a */
    static BinderAccountChangeCallback.Stub f27895a = new OnBoardingManager$1();

    /* renamed from: b */
    private static boolean f27896b;

    /* renamed from: c */
    private static C10917c f27897c;

    /* renamed from: d */
    private static Context f27898d;

    /* renamed from: e */
    private static Map<String, OnBoardingColorStyle> f27899e = new HashMap();

    /* renamed from: f */
    private static Set<String> f27900f;

    /* renamed from: g */
    private static C10370a f27901g;

    /* renamed from: h */
    private static boolean f27902h = false;

    /* renamed from: i */
    private static CopyOnWriteArrayList<AbstractC10371a> f27903i = new CopyOnWriteArrayList<>();

    /* renamed from: j */
    private String f27904j;

    /* renamed from: k */
    private OnBoardingMissionTaskManager f27905k = new OnBoardingMissionTaskManager();

    /* renamed from: l */
    private OnBoardingSynchronizer f27906l = new OnBoardingSynchronizer();

    /* renamed from: m */
    private C10385d f27907m = new C10385d();

    /* renamed from: com.bytedance.ee.bear.onboarding.a$a */
    public interface AbstractC10371a {
        /* renamed from: a */
        void mo39506a();
    }

    /* renamed from: b */
    public static void m43111b() {
        m43130h();
        m43131i();
    }

    /* renamed from: l */
    private Map<String, Boolean> m43134l() {
        return this.f27906l.mo39680d();
    }

    /* renamed from: m */
    private void m43135m() {
        this.f27906l.mo39681e();
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static /* synthetic */ Unit m43137o() {
        m43132j();
        return Unit.INSTANCE;
    }

    /* renamed from: d */
    public static void m43121d() {
        if (!m43128g()) {
            f27901g.m43135m();
        }
    }

    /* renamed from: h */
    private static void m43130h() {
        f27902h = true;
        if (!m43128g()) {
            f27901g.m43133k();
        }
    }

    /* renamed from: i */
    private static void m43131i() {
        ((an) KoinJavaComponent.m268610a(an.class)).mo16399a(f27895a);
    }

    /* renamed from: k */
    private void m43133k() {
        if (f27902h) {
            this.f27906l.mo39684h();
        }
    }

    /* renamed from: n */
    private void m43136n() {
        this.f27906l.mo39683g();
        this.f27905k.mo39528c();
    }

    /* renamed from: e */
    private static void m43123e() {
        if (f27900f == null) {
            f27900f = new HashSet(C4211a.m17514a().mo16534a("disabled_onboardings", String.class, new ArrayList()));
        }
    }

    /* renamed from: f */
    private static void m43125f() {
        if (!C13629i.m55302a()) {
            C13479a.m54772d("OnBoardingManager", "reset UserSP instance if not in main process.");
            UserSP.resetInstance();
        }
    }

    /* renamed from: j */
    private static void m43132j() {
        Iterator<AbstractC10371a> it = f27903i.iterator();
        while (it.hasNext()) {
            it.next().mo39506a();
        }
    }

    /* renamed from: c */
    public static Map<String, Boolean> m43120c() {
        if (!m43128g()) {
            return f27901g.m43134l();
        }
        if (!f27896b) {
            C13479a.m54758a("OnBoardingManager", "OnBoarding INSTANCE hasn't init...");
            return new HashMap();
        }
        throw new RuntimeException("OnBoardingManager: OnBoarding INSTANCE hasn't init...");
    }

    /* renamed from: g */
    private static boolean m43128g() {
        boolean z;
        if (f27901g == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C13479a.m54758a("OnBoardingManager", "OnBoardingManager Instance hasn't been created.");
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m43109a() {
        C10370a aVar = f27901g;
        if (aVar == null || !aVar.f27906l.mo39676a()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m43103a(AbstractC10371a aVar) {
        f27903i.add(aVar);
        if (m43109a()) {
            m43132j();
        }
    }

    /* renamed from: b */
    public static void m43112b(AbstractC10371a aVar) {
        f27903i.remove(aVar);
    }

    /* renamed from: e */
    private boolean m43124e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f27906l.mo39678b(str);
    }

    /* renamed from: f */
    private void m43126f(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f27906l.mo39671a(str);
        }
    }

    /* renamed from: b */
    private void m43113b(AbstractC10397d<? extends AbstractC10405c> dVar) {
        if (dVar != null) {
            this.f27905k.mo39522a(dVar);
        } else {
            C13479a.m54758a("OnBoardingManager", "OnBoardingMission is null!");
        }
    }

    /* renamed from: c */
    private static OnBoardingColorStyle m43118c(String str) {
        if (str == null || f27899e.get(str) == null) {
            return OnBoardingColorStyle.Blue;
        }
        return f27899e.get(str);
    }

    /* renamed from: d */
    private static boolean m43122d(String str) {
        Set<String> set;
        if (f27896b || (set = f27900f) == null || str == null || !set.contains(str)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: g */
    private /* synthetic */ Boolean m43127g(String str) {
        if (!f27896b) {
            return Boolean.valueOf(this.f27906l.mo39678b(str));
        }
        C13479a.m54772d("OnBoardingManager", "In DEBUG mode, always play.");
        return false;
    }

    /* renamed from: a */
    public static void m43104a(AbstractC10397d<? extends AbstractC10405c> dVar) {
        if (!m43128g()) {
            f27901g.m43113b(dVar);
        }
    }

    /* renamed from: b */
    public static void m43115b(String str) {
        if (!m43128g()) {
            f27901g.m43126f(str);
        } else if (!f27896b) {
            C13479a.m54758a("OnBoardingManager", "OnBoarding INSTANCE hasn't init...");
        } else {
            throw new RuntimeException("OnBoardingManager: OnBoarding INSTANCE hasn't init...");
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: h */
    private /* synthetic */ Unit m43129h(String str) {
        C13479a.m54772d("OnBoardingManager", "OnBoarding finished: " + str);
        if (!f27896b) {
            this.f27906l.mo39671a(str);
        } else {
            C13479a.m54772d("OnBoardingManager", "In DEBUG mode, didn't set finished.");
        }
        return Unit.INSTANCE;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ Boolean m43119c(AbstractC10397d dVar) {
        String c = dVar.mo21356c();
        if (f27896b || c == null) {
            C13479a.m54772d("OnBoardingManager", "Dependency check ignored.");
        } else if (!m43124e(c)) {
            C13479a.m54772d("OnBoardingManager", "[ " + dVar.mo21352b() + " ]'s dependency[" + c + "] is not finished!");
            return false;
        } else {
            C13479a.m54772d("OnBoardingManager", "Dependency check passed.");
        }
        return true;
    }

    /* renamed from: b */
    private void m43117b(List<String> list) {
        if (list != null && !list.isEmpty()) {
            this.f27906l.mo39674a(list);
        }
    }

    /* renamed from: a */
    public static void m43108a(List<String> list) {
        if (!m43128g()) {
            f27901g.m43117b(list);
        } else if (!f27896b) {
            C13479a.m54758a("OnBoardingManager", "OnBoarding INSTANCE hasn't init...");
        } else {
            throw new RuntimeException("OnBoardingManager: OnBoarding INSTANCE hasn't init...");
        }
    }

    /* renamed from: a */
    public static boolean m43110a(String str) {
        if (!m43128g()) {
            return f27901g.m43124e(str);
        }
        if (!f27896b) {
            C13479a.m54758a("OnBoardingManager", "OnBoarding INSTANCE hasn't init...");
            return true;
        }
        throw new RuntimeException("OnBoardingManager: OnBoarding INSTANCE hasn't init...");
    }

    private C10370a(String str, String str2) {
        this.f27904j = str2;
        f27896b = this.f27906l.mo39679c();
        C13479a.m54772d("OnBoardingManager", "DebugMode: " + f27896b);
        this.f27905k.mo39525a(new Function1() {
            /* class com.bytedance.ee.bear.onboarding.$$Lambda$a$Zh0gBHPrJJ7AdYPMRmHSVgo4PkY */

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C10370a.this.m43129h((String) obj);
            }
        });
        this.f27905k.mo39529c(new Function1() {
            /* class com.bytedance.ee.bear.onboarding.$$Lambda$a$fjXYIHv2eEZ069knMfYmSoJuOg */

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C10370a.this.m43127g((String) obj);
            }
        });
        this.f27905k.mo39527b(new Function1() {
            /* class com.bytedance.ee.bear.onboarding.$$Lambda$a$EkomusLJsDt3i14jdDTwbLufI */

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C10370a.this.m43119c((C10370a) ((AbstractC10397d) obj));
            }
        });
        this.f27906l.mo39675a($$Lambda$a$lZ9hCPSpprmPtA4gyvLqTU4D3oc.INSTANCE);
        this.f27906l.mo39670a(f27897c);
        m43123e();
        m43133k();
    }

    /* renamed from: a */
    public static void m43105a(AbstractC10397d<C10403a> dVar, FragmentActivity fragmentActivity) {
        if (!m43128g()) {
            m43106a(dVar, new C10403a(fragmentActivity, null));
        }
    }

    /* renamed from: b */
    private <UI extends AbstractC10405c> void m43114b(AbstractC10397d<UI> dVar, UI ui) {
        if (dVar != null && ui != null) {
            String b = dVar.mo21352b();
            boolean d = m43122d(b);
            if (f27896b || !d) {
                OnBoardingColorStyle c = m43118c(dVar.mo21350a());
                if (c == null) {
                    c = OnBoardingColorStyle.Blue;
                }
                if (ui instanceof C10403a) {
                    C10403a aVar = (C10403a) ui;
                    aVar.mo39607a(c);
                    aVar.mo39608a(dVar);
                    aVar.mo39610a(this.f27907m);
                }
                this.f27905k.mo39523a(dVar, ui);
                return;
            }
            C13479a.m54772d("OnBoardingManager", "mission[ " + b + "] is in blacklist.");
        }
    }

    /* renamed from: a */
    public static <UI extends AbstractC10405c> void m43106a(AbstractC10397d<UI> dVar, UI ui) {
        if (!m43128g()) {
            f27901g.m43114b(dVar, ui);
        }
    }

    /* renamed from: b */
    private static void m43116b(String str, String str2) {
        if (!m43128g()) {
            f27901g.m43136n();
        }
        f27901g = new C10370a(str, str2);
    }

    /* renamed from: a */
    public static void m43107a(String str, String str2) {
        if (str == null || str2 == null) {
            if (!m43128g()) {
                f27901g.m43136n();
                f27901g = null;
            }
            C13479a.m54758a("OnBoardingManager", "Fail to change user account.");
        } else if (m43128g() || !TextUtils.equals(f27901g.f27904j, str)) {
            C13479a.m54764b("OnBoardingManager", "Login status changed");
            m43125f();
            m43116b(str2, str);
        }
    }

    /* renamed from: a */
    public static void m43102a(Context context, C10917c cVar, Map<String, OnBoardingColorStyle> map) {
        C13479a.m54772d("OnBoardingManager", "Initialize OnBoardingManager");
        f27897c = cVar;
        f27898d = context;
        f27899e.putAll(map);
    }
}
