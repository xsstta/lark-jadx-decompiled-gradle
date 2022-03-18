package com.ss.android.lark.appcenter.wrapper.impl.view;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.ref.card.C13518b;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.appcenter.C27528a;
import com.ss.android.appcenter.business.net.workplacehome.C27771a;
import com.ss.android.appcenter.business.tab.business.C27782a;
import com.ss.android.appcenter.business.tab.fragmentv2.C27973a;
import com.ss.android.appcenter.business.tab.fragmentv3.C28025a;
import com.ss.android.appcenter.p1262a.AbstractC27567c;
import com.ss.android.appcenter.p1262a.p1263a.AbstractC27534b;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import com.ss.android.lark.appcenter.wrapper.AppCenterModule;
import com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency;
import com.ss.android.lark.appcenter.wrapper.impl.statistics.AppCenterHitPoint;
import com.ss.android.lark.appcenter.wrapper.p1359a.AbstractC29129b;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.base.MainWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.p1787a.C36517b;
import com.ss.android.lark.desktopmode.p1788b.p1793e.AbstractC36553a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.ITitleInfo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.lark.appcenter.wrapper.impl.view.b */
public class C29175b implements AbstractC36553a, AbstractC44552i, AbstractC44552i.AbstractC44555c, AbstractC44552i.AbstractC44556d {

    /* renamed from: p */
    private static Set f73008p = new HashSet();

    /* renamed from: q */
    private static Set f73009q = new HashSet();

    /* renamed from: a */
    IAppCenterModuleDependency.AbstractC29134e f73010a = AppCenterModule.m107044a().getLittleAppDependency();

    /* renamed from: b */
    AbstractC27567c f73011b;

    /* renamed from: c */
    public AppCenterMainTabView f73012c;

    /* renamed from: d */
    public boolean f73013d = false;

    /* renamed from: e */
    public Object f73014e = new Object();

    /* renamed from: f */
    private Context f73015f;

    /* renamed from: g */
    private int f73016g;

    /* renamed from: h */
    private AppCenterNavigationTabView f73017h;

    /* renamed from: i */
    private ITitleController f73018i;

    /* renamed from: j */
    private AbstractC44548e f73019j;

    /* renamed from: k */
    private boolean f73020k = false;

    /* renamed from: l */
    private final AbstractC27534b.AbstractC27535a f73021l;

    /* renamed from: m */
    private AbstractC44552i.AbstractC44553a f73022m;

    /* renamed from: n */
    private AbstractC29129b f73023n;

    /* renamed from: o */
    private C27528a.AbstractC27531b f73024o;

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: a */
    public void mo31309a(Bundle bundle) {
    }

    @Override // com.ss.android.lark.desktopmode.p1788b.p1793e.AbstractC36553a, com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: b */
    public String mo31311b() {
        return "appCenter";
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: e */
    public boolean mo31314e() {
        return false;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: f */
    public void mo31315f() {
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: h */
    public int mo31317h() {
        return 1;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: m */
    public AbstractC44552i.AbstractC44554b mo31322m() {
        return null;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: d */
    public int mo31313d() {
        return this.f73016g;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: l */
    public AbstractC44552i.AbstractC44553a mo31321l() {
        return this.f73022m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public AppCenterMainTabView mo103430o() {
        return new AppCenterMainTabView(this.f73015f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public AppCenterNavigationTabView mo103431p() {
        return new AppCenterNavigationTabView(this.f73015f);
    }

    /* renamed from: u */
    private boolean m107240u() {
        return AppCenterModule.m107044a().getFeatureGatingDependency().mo103376a("gadget.open_app.badge");
    }

    /* renamed from: v */
    private void m107241v() {
        AppCenterMainTabView appCenterMainTabView = this.f73012c;
        if (appCenterMainTabView != null) {
            appCenterMainTabView.mo201233a(0);
        }
        AppCenterNavigationTabView appCenterNavigationTabView = this.f73017h;
        if (appCenterNavigationTabView != null) {
            appCenterNavigationTabView.mo201263a(0);
        }
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: c */
    public <T extends View> T mo31312c() {
        if (this.f73012c == null) {
            this.f73012c = mo103430o();
            m107239t();
        }
        return this.f73012c;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: j */
    public <T extends View> T mo31319j() {
        if (this.f73017h == null) {
            this.f73017h = mo103431p();
            m107239t();
        }
        return this.f73017h;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: k */
    public ITitleInfo mo31320k() {
        AbstractC27567c cVar = this.f73011b;
        if (cVar != null) {
            return cVar.mo98246d();
        }
        return null;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44555c
    /* renamed from: s */
    public void mo103434s() {
        AppCenterModule.m107044a().getLittleAppDependency().mo103386b();
        this.f73011b = null;
    }

    /* renamed from: t */
    private void m107239t() {
        if (!m107240u()) {
            m107241v();
            return;
        }
        C27771a.m101486a().mo99120d();
        C27771a.m101486a().mo99121e();
    }

    /* renamed from: x */
    private boolean m107243x() {
        return f73008p.contains(C27548m.m100547m().mo98221e().mo98215d());
    }

    /* renamed from: y */
    private boolean m107244y() {
        return f73009q.contains(C27548m.m100547m().mo98221e().mo98215d());
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: i */
    public Fragment mo31318i() {
        if (this.f73011b == null) {
            this.f73011b = m107242w();
        }
        return this.f73011b.mo98247e();
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: n */
    public void mo31323n() {
        AbstractC27567c cVar = this.f73011b;
        if (cVar == null) {
            this.f73011b = m107242w();
        } else {
            cVar.mo98243a();
        }
        Fragment e = this.f73011b.mo98247e();
        if (e == null || !e.isAdded()) {
            m107239t();
        }
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44556d
    /* renamed from: q */
    public void mo103432q() {
        AbstractC27567c cVar = this.f73011b;
        if (cVar == null || !cVar.mo98247e().isAdded()) {
            m107239t();
        }
    }

    static {
        f73008p.add("6914821733941772289");
        f73008p.add("6960874476485492739");
        f73009q.add("6901477956552671233");
        f73009q.add("6911980405696659460");
        f73009q.add("6688972696446910723");
        f73009q.add("6763503897446203659");
    }

    /* renamed from: a */
    public void mo103429a() {
        if (!this.f73020k) {
            this.f73020k = true;
            AppCenterModule.m107044a().registerWebLifecycleListener();
            AppCenterModule.m107044a().registerDrawerListener(this.f73023n);
            C27528a.m100471a().mo98141a(this.f73024o);
        }
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: g */
    public void mo31316g() {
        AbstractC27534b l = C27548m.m100547m().mo98228l();
        if (l != null) {
            l.mo98168b(this.f73021l);
        }
        AppCenterModule.m107044a().unregisterDrawerListener(this.f73023n);
        C27528a.m100471a().mo98144b(this.f73024o);
        AppCenterModule.m107044a().getLittleAppDependency().mo103386b();
        this.f73017h = null;
    }

    @Override // com.ss.android.lark.desktopmode.p1788b.p1793e.AbstractC36553a
    /* renamed from: r */
    public Map<ContainerType, C36516a> mo103433r() {
        mo31318i();
        HashMap hashMap = new HashMap();
        C36517b a = C36517b.m144069a((Fragment) this.f73011b);
        a.setFragmentParams(new MainWindowParams.C36570a(ContainerType.ALL).mo134958a(mo31311b()).mo134930b());
        hashMap.put(ContainerType.ALL, a);
        return hashMap;
    }

    /* renamed from: w */
    private AbstractC27567c m107242w() {
        C13518b.m54918a(this.f73015f);
        boolean a = AppCenterModule.m107044a().getFeatureGatingDependency().mo103376a("lark.workplace.template.test");
        boolean a2 = AppCenterModule.m107044a().getFeatureGatingDependency().mo103376a("lark.workplace.template.router");
        Log.m165389i("AppCenterTabPageSpec", "getAppCenterFragment>>> routerFg:" + a2 + " testFg:" + a);
        if (a2) {
            return new C27782a(this.f73019j, this.f73018i);
        }
        if (m107243x()) {
            boolean a3 = AppCenterModule.m107044a().getFeatureGatingDependency().mo103376a("lark.workplace.template.reset");
            Log.m165389i("AppCenterTabPageSpec", "getAppCenterFragment>>> isTemplateGATenant resetFg:" + a3);
            if (a3) {
                return new C27973a(this.f73015f, this.f73018i);
            }
            return new C28025a(this.f73015f, this.f73019j, this.f73018i);
        } else if (m107244y()) {
            boolean a4 = AppCenterModule.m107044a().getFeatureGatingDependency().mo103376a("lark.workplace.template.reset");
            Log.m165389i("AppCenterTabPageSpec", "getAppCenterFragment>>> isTemplatePartGATenant resetFg:" + a4);
            if (a4) {
                return new C27973a(this.f73015f, this.f73018i);
            }
            return new C27782a(this.f73019j, this.f73018i);
        } else {
            boolean a5 = AppCenterModule.m107044a().getFeatureGatingDependency().mo103376a("lark.workplace.template");
            Log.m165389i("AppCenterTabPageSpec", "getAppCenterFragment>>> templateFg:" + a5);
            if (a5) {
                return new C28025a(this.f73015f, this.f73019j, this.f73018i);
            }
            return new C27973a(this.f73015f, this.f73018i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m107237a(int i) {
        UICallbackExecutor.execute(new Runnable(i) {
            /* class com.ss.android.lark.appcenter.wrapper.impl.view.$$Lambda$b$4kI3O0bb1EycO6KF6XWdZpm0ia0 */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C29175b.this.m107238b(this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m107238b(int i) {
        if (!m107240u()) {
            AppCenterMainTabView appCenterMainTabView = this.f73012c;
            if (appCenterMainTabView != null) {
                appCenterMainTabView.mo201233a(0);
            }
            AppCenterNavigationTabView appCenterNavigationTabView = this.f73017h;
            if (appCenterNavigationTabView != null) {
                appCenterNavigationTabView.mo201263a(0);
                return;
            }
            return;
        }
        AppCenterMainTabView appCenterMainTabView2 = this.f73012c;
        if (appCenterMainTabView2 != null) {
            appCenterMainTabView2.mo201233a(i);
        }
        AppCenterNavigationTabView appCenterNavigationTabView2 = this.f73017h;
        if (appCenterNavigationTabView2 != null) {
            appCenterNavigationTabView2.mo201263a(i);
        }
    }

    public C29175b(Context context, AbstractC44548e eVar, ITitleController iTitleController) {
        $$Lambda$b$_8lKxIBYI_8LDamlV4tDY__u8 r0 = new AbstractC27534b.AbstractC27535a() {
            /* class com.ss.android.lark.appcenter.wrapper.impl.view.$$Lambda$b$_8lKxIBYI_8LDamlV4tDY__u8 */

            @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27534b.AbstractC27535a
            public final void onBadgeSumChanged(int i) {
                C29175b.this.m107237a((C29175b) i);
            }
        };
        this.f73021l = r0;
        this.f73022m = new AbstractC44552i.AbstractC44553a() {
            /* class com.ss.android.lark.appcenter.wrapper.impl.view.C29175b.C291761 */

            @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44553a
            /* renamed from: b */
            public void mo31325b(String str, String str2) {
            }

            @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44553a
            /* renamed from: a */
            public void mo31324a(String str, String str2) {
                boolean equals = TextUtils.equals("appCenter", str);
                boolean equals2 = TextUtils.equals("appCenter", str2);
                C29175b.this.mo103429a();
                if (equals2 && !TextUtils.equals(str, str2)) {
                    synchronized (C29175b.this.f73014e) {
                        if (C29175b.this.f73011b == null) {
                            C29175b.this.mo31318i();
                        } else {
                            C29175b.this.f73011b.mo98243a();
                            C29175b.this.f73011b.mo98244b();
                        }
                    }
                    AppCenterHitPoint.m107225a(C27528a.m100471a().mo98145c());
                    if (C29175b.this.f73010a != null) {
                        C29175b.this.f73010a.mo103380a();
                    }
                    if (!C29175b.this.f73013d) {
                        C29175b.this.f73013d = true;
                    }
                }
                if (C29175b.this.f73012c != null) {
                    if (equals && !equals2) {
                        C29175b.this.f73012c.mo110683b();
                    }
                    if (!equals && equals2) {
                        C29175b.this.f73012c.mo110677a();
                    }
                }
            }
        };
        this.f73023n = new AbstractC29129b() {
            /* class com.ss.android.lark.appcenter.wrapper.impl.view.C29175b.C291772 */

            @Override // com.ss.android.lark.appcenter.wrapper.p1359a.AbstractC29129b
            /* renamed from: a */
            public void mo103331a(int i) {
            }

            @Override // com.ss.android.lark.appcenter.wrapper.p1359a.AbstractC29129b
            /* renamed from: b */
            public void mo103332b() {
            }

            @Override // com.ss.android.lark.appcenter.wrapper.p1359a.AbstractC29129b
            /* renamed from: c */
            public void mo103333c() {
            }

            @Override // com.ss.android.lark.appcenter.wrapper.p1359a.AbstractC29129b
            /* renamed from: d */
            public void mo103334d() {
            }

            @Override // com.ss.android.lark.appcenter.wrapper.p1359a.AbstractC29129b
            /* renamed from: a */
            public void mo103330a() {
                Log.m165389i("AppCenterTabPageSpec", "onDrawerWillShow>>>");
                if (C29175b.this.f73011b != null) {
                    C29175b.this.f73011b.mo98245c();
                }
            }
        };
        this.f73024o = new C27528a.AbstractC27531b() {
            /* class com.ss.android.lark.appcenter.wrapper.impl.view.C29175b.C291783 */

            @Override // com.ss.android.appcenter.C27528a.AbstractC27531b
            /* renamed from: a */
            public void mo98150a() {
                synchronized (C29175b.this.f73014e) {
                    C29175b.this.mo103434s();
                }
            }
        };
        this.f73015f = context.getApplicationContext();
        this.f73018i = iTitleController;
        this.f73019j = eVar;
        this.f73016g = 1;
        AbstractC27534b l = C27548m.m100547m().mo98228l();
        if (l != null) {
            l.mo98167a(r0);
        }
    }
}
