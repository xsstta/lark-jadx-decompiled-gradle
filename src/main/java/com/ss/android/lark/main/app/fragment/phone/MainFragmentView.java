package com.ss.android.lark.main.app.fragment.phone;

import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.util.C0844e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.dynamicresources.DynamicResourcesFacade;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.RomUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.core.api.IMainDrawerListener;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.p1788b.p1792d.AbstractC36551c;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.larkconfig.larksetting.handler.customnav.NavDataSource;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.main.app.C44325i;
import com.ss.android.lark.main.app.C44331k;
import com.ss.android.lark.main.app.drawer.FeedDrawerContainer;
import com.ss.android.lark.main.app.fragment.AbstractC44285k;
import com.ss.android.lark.main.app.fragment.C44273e;
import com.ss.android.lark.main.app.fragment.C44274f;
import com.ss.android.lark.main.app.fragment.C44279g;
import com.ss.android.lark.main.app.fragment.C44281i;
import com.ss.android.lark.main.app.fragment.C44282j;
import com.ss.android.lark.main.app.fragment.NavBottomSheetBehavior;
import com.ss.android.lark.main.app.fragment.phone.MainFragmentView;
import com.ss.android.lark.main.app.tab.AbstractC44371p;
import com.ss.android.lark.main.app.tab.AbstractC44372q;
import com.ss.android.lark.main.app.tab.C44364l;
import com.ss.android.lark.main.app.tab.C44373s;
import com.ss.android.lark.main.app.tab.C44384t;
import com.ss.android.lark.main.app.tab.EditorTabInfoList;
import com.ss.android.lark.main.app.tab.EmptyBottomSheetBehavior;
import com.ss.android.lark.main.app.tab.MainTab;
import com.ss.android.lark.main.app.tab.NavigationTab;
import com.ss.android.lark.main.app.tab.NavigationTabBottomSheetController;
import com.ss.android.lark.main.app.tab.NavigationTabEditorView;
import com.ss.android.lark.main.app.tab.NavigationTabRoundableLayoutSlideChangeListener;
import com.ss.android.lark.main.app.tab.RoundableLayoutContainer;
import com.ss.android.lark.main.app.tab.p2233a.C44357a;
import com.ss.android.lark.main.app.title.C44404a;
import com.ss.android.lark.main.app.title.MainTitle;
import com.ss.android.lark.main.app.widgets.C44428b;
import com.ss.android.lark.main.app.widgets.C44431d;
import com.ss.android.lark.main.app.widgets.MainDrawerListenerManager;
import com.ss.android.lark.main.app.widgets.MainViewContainer;
import com.ss.android.lark.main.app.widgets.MainViewPager;
import com.ss.android.lark.main.interfaces.AbstractC44504g;
import com.ss.android.lark.main.interfaces.IMainDrawer;
import com.ss.android.lark.main.interfaces.NetworkLevel;
import com.ss.android.lark.main.p2235b.C44498d;
import com.ss.android.lark.main.splash.SplashAdManagerHolder;
import com.ss.android.lark.main.statistics.C44524a;
import com.ss.android.lark.main.statistics.MainHitPointHelper;
import com.ss.android.lark.maincore.AbstractC44544a;
import com.ss.android.lark.maincore.AbstractC44547d;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.TabType;
import com.ss.android.lark.maincore.dto.TabAppInfo;
import com.ss.android.lark.maincore.dto.TabInfo;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.StatusBarUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.p2905b.C57811b;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public class MainFragmentView implements ComponentCallbacks2, C44274f.AbstractC44277b, AbstractC44547d {

    /* renamed from: a */
    NavigationTab f112303a;

    /* renamed from: b */
    public C44431d f112304b;

    /* renamed from: c */
    public final C44331k f112305c = new C44331k();

    /* renamed from: d */
    public FragmentActivity f112306d;

    /* renamed from: e */
    public IMainDrawer f112307e;

    /* renamed from: f */
    public C44274f.AbstractC44277b.AbstractC44278a f112308f;

    /* renamed from: g */
    public NavigationTabBottomSheetController f112309g;

    /* renamed from: h */
    public boolean f112310h = false;

    /* renamed from: i */
    public String f112311i;

    /* renamed from: j */
    public boolean f112312j;

    /* renamed from: k */
    IMainDrawerListener f112313k;

    /* renamed from: l */
    private C44404a f112314l;

    /* renamed from: m */
    private final AbstractC44285k f112315m;
    FrameLayout mDingDialogContainer;
    MainViewContainer mDrawerContainer;
    ViewGroup mMainLayout;
    MainTab mMainTab;
    MainTitle mMainTitle;
    MainViewPager mMainViewPager;
    View mNavLine;
    View mShadow;
    View mStatusBarBackground;

    /* renamed from: n */
    private final FragmentManager f112316n;

    /* renamed from: o */
    private Bundle f112317o;

    /* renamed from: p */
    private C44282j f112318p;

    /* renamed from: q */
    private final C44325i.AbstractC44328b f112319q = new C44325i.AbstractC44328b() {
        /* class com.ss.android.lark.main.app.fragment.phone.$$Lambda$MainFragmentView$iBobjH14DFue9tsflpGDKQ869tM */

        @Override // com.ss.android.lark.main.app.C44325i.AbstractC44328b
        public final void onFirstContentDraw(String str) {
            MainFragmentView.lambda$iBobjH14DFue9tsflpGDKQ869tM(MainFragmentView.this, str);
        }
    };

    /* renamed from: r */
    private AbstractC44504g f112320r = new AbstractC44504g() {
        /* class com.ss.android.lark.main.app.fragment.phone.MainFragmentView.C442861 */

        @Override // com.ss.android.lark.main.interfaces.AbstractC44504g
        /* renamed from: a */
        public void mo157175a() {
        }

        /* access modifiers changed from: public */
        /* renamed from: b */
        private /* synthetic */ void m175746b() {
            MainFragmentView.this.mo157385d();
        }

        @Override // com.ss.android.lark.main.interfaces.AbstractC44504g
        /* renamed from: a */
        public void mo157176a(boolean z) {
            if (z && MainFragmentView.this.f112308f != null && MainFragmentView.this.f112308f.mo157303a()) {
                MainFragmentView.this.f112308f.mo157302a(false);
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.main.app.fragment.phone.$$Lambda$MainFragmentView$1$Ggggh1OuAbcVG08Dkcs3ycbOoV0 */

                    public final void run() {
                        MainFragmentView.C442861.lambda$Ggggh1OuAbcVG08Dkcs3ycbOoV0(MainFragmentView.C442861.this);
                    }
                });
            }
        }
    };

    /* renamed from: s */
    private boolean f112321s;

    /* renamed from: t */
    private final AbstractC44544a f112322t = new AbstractC44544a() {
        /* class com.ss.android.lark.main.app.fragment.phone.MainFragmentView.AnonymousClass11 */

        @Override // com.ss.android.lark.maincore.AbstractC44544a
        /* renamed from: b */
        public void mo102548b() {
        }

        @Override // com.ss.android.lark.maincore.AbstractC44544a
        /* renamed from: a */
        public void mo102546a() {
            C57865c.m224576a(new Runnable() {
                /* class com.ss.android.lark.main.app.fragment.phone.MainFragmentView.AnonymousClass11.RunnableC442871 */

                public void run() {
                    C44134a.m174959a().mo133188H().mo133404a(C44373s.m176069a().mo157642d());
                }
            });
        }

        /* access modifiers changed from: public */
        /* renamed from: c */
        private /* synthetic */ void m175751c() {
            if (MainFragmentView.this.f112306d != null && !MainFragmentView.this.f112306d.isFinishing()) {
                MainFragmentView.this.mo157388f(false);
                for (AbstractC44552i iVar : MainFragmentView.this.f112305c.mo157462d()) {
                    if (iVar.mo31313d() == 10) {
                        iVar.mo31315f();
                    }
                }
            }
            C44134a.m174959a().mo133197Q().mo133272a();
            C44373s.m176069a().mo157636a(true, true, (IGetDataCallback<Boolean>) null);
        }

        @Override // com.ss.android.lark.maincore.AbstractC44544a
        /* renamed from: a */
        public void mo102547a(String str) {
            UICallbackExecutor.executeDelayed(new Runnable() {
                /* class com.ss.android.lark.main.app.fragment.phone.$$Lambda$MainFragmentView$11$LorWETv7JQB16L5dWFBcNTblxJw */

                public final void run() {
                    MainFragmentView.AnonymousClass11.lambda$LorWETv7JQB16L5dWFBcNTblxJw(MainFragmentView.AnonymousClass11.this);
                }
            }, 500);
        }
    };

    /* renamed from: b */
    public static /* synthetic */ NavigationTabEditorView m175692b(NavigationTabEditorView navigationTabEditorView) {
        return navigationTabEditorView;
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: a */
    public boolean mo157315a(KeyEvent keyEvent) {
        return false;
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
    }

    /* access modifiers changed from: public */
    /* renamed from: B */
    private /* synthetic */ NavigationTab m175680B() {
        return this.f112303a;
    }

    /* renamed from: a */
    public AbstractC44552i mo157380a(String str) {
        return m175682a(str, false);
    }

    /* renamed from: a */
    public void mo157381a(C0844e<String, C44357a> eVar) {
        FragmentActivity fragmentActivity;
        S s;
        if (!(C44134a.m174959a().mo133200T().mo133289e() || eVar == null || (fragmentActivity = this.f112306d) == null || fragmentActivity.isFinishing() || (s = eVar.f3318b) == null)) {
            if (s.mo157551e() != null) {
                for (TabAppInfo tabAppInfo : s.mo157551e()) {
                    C44373s.m176069a().mo157634a(tabAppInfo.getKey(), true);
                    NavigationTab navigationTab = this.f112303a;
                    if (navigationTab != null) {
                        navigationTab.mo157497a(tabAppInfo.getKey(), true);
                    }
                }
            }
            if (s.mo157545a()) {
                ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f112306d).inflate(R.layout.main_nav_update_notify_layout, (ViewGroup) null);
                TextView textView = (TextView) viewGroup.findViewById(R.id.nav_update_add);
                TextView textView2 = (TextView) viewGroup.findViewById(R.id.nav_update_order);
                String country = C44134a.m174959a().mo133204X().getCountry();
                int a = m175681a((TextView) viewGroup.findViewById(R.id.nav_update_remove), m175681a(textView, 1, s.mo157546b(), country, R.string.Lark_Legacy_NavigationAddApp), s.mo157548c(), country, R.string.Lark_Legacy_NavigationRemoveApp);
                if (!s.mo157550d()) {
                    textView2.setVisibility(8);
                } else {
                    textView2.setText(a + ". " + this.f112306d.getResources().getString(R.string.Lark_Legacy_NavigationAdjust));
                }
                final Dialog a2 = C57811b.m224342a((Context) this.f112306d, (View) viewGroup, (int) R.style.customDialog, true);
                m175686a(this.f112306d, a2, 70);
                Log.m165389i("MainModule_MainFragmentView", "Show nav tip dialog");
                ((TextView) viewGroup.findViewById(R.id.nav_update_ok)).setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.lark.main.app.fragment.phone.MainFragmentView.View$OnClickListenerC442937 */

                    public void onClick(View view) {
                        Log.m165389i("MainModule_MainFragmentView", "Close nav tip dialog");
                        a2.dismiss();
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public void setViewDelegate(C44274f.AbstractC44277b.AbstractC44278a aVar) {
        this.f112308f = aVar;
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: a */
    public void mo157311a(String str, Bundle bundle) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        AbstractC44552i a = m175682a(str, true);
        if (a == null) {
            Log.m165397w("MainModule_MainFragmentView", "showTabFragment pageNotExist = " + str);
            a = this.f112305c.mo157461c();
        }
        String e = this.f112305c.mo157465e();
        if (a.mo31321l() != null) {
            AbstractC44552i.AbstractC44553a l = a.mo31321l();
            if (e != null) {
                str2 = e;
            }
            l.mo31325b(str2, a.mo31311b());
        }
        this.f112305c.mo157468h(a.mo31311b());
        mo157383a(e, a.mo31311b(), bundle);
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: a */
    public Fragment mo157305a() {
        AbstractC44552i b = mo157316b();
        if (b != null) {
            return b.mo31318i();
        }
        return null;
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: a */
    public void mo157313a(List<TenantInfo> list) {
        String str;
        TenantInfo tenantInfo;
        Iterator<TenantInfo> it = list.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                tenantInfo = null;
                break;
            }
            tenantInfo = it.next();
            if (tenantInfo.isCurrentUser()) {
                break;
            }
        }
        if (tenantInfo != null) {
            if (list.size() >= 2) {
                str = tenantInfo.getTenantName();
            }
            this.f112314l.mo157710a(new C44404a.C44410b(tenantInfo.getUserId(), tenantInfo.getChatterAvatarKey(), str));
            return;
        }
        Log.m165383e("MainModule_MainFragmentView", "show title fail: current tenant is null");
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: a */
    public void mo157310a(NetworkLevel networkLevel) {
        if (networkLevel == NetworkLevel.NET_UNAVAILABLE) {
            this.f112314l.mo157731t();
        } else {
            this.f112314l.mo157732u();
        }
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: a */
    public void mo157306a(long j) {
        Log.m165389i("MainModule_MainFragmentView", "updateTenantBadge: badgeCount= " + j);
        this.f112314l.mo157707a(j);
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: a */
    public void mo157312a(String str, String str2) {
        this.f112314l.mo157712a(str2, str);
    }

    /* renamed from: a */
    public void mo157383a(String str, String str2, Bundle bundle) {
        Log.m165389i("MainModule_MainFragmentView", "showTabFragmentImpl: preSelectTab=" + str + "; currentSelecTab= " + str2);
        this.f112312j = this.f112305c.mo157463d(str2);
        HashMap hashMap = new HashMap();
        hashMap.put("to_tab_key", str2);
        this.f112311i = AppreciableKit.m107394b().mo103510a(Biz.Messenger, m175696d(str2), Event.switch_tab_cost, (String) null, false, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) hashMap);
        AbstractC44552i a = m175682a(str2, true);
        if (!this.f112305c.mo157463d(a.mo31311b())) {
            C44273e b = this.f112305c.mo157456b(a);
            this.f112304b.mo157814a(this.f112305c.mo157460c(a.mo31311b()), b);
            this.f112304b.notifyDataSetChanged();
        }
        if (a instanceof AbstractC44552i.AbstractC44555c) {
            this.f112318p.mo157367a((AbstractC44552i.AbstractC44555c) a);
        }
        if (bundle != null) {
            a.mo31309a(bundle);
        }
        this.mMainViewPager.setCurrentItem(this.f112305c.mo157460c(a.mo31311b()), false);
        this.mDrawerContainer.mo157760a(a.mo31311b());
        if (m175693b(str, str2)) {
            this.mMainTitle.mo157681b();
        }
        m175685a(0);
        for (AbstractC44552i iVar : this.f112305c.mo157462d()) {
            if (!(iVar == null || iVar.mo31321l() == null)) {
                iVar.mo31321l().mo31324a(str, str2);
            }
        }
        this.f112314l.mo157711a(a.mo31311b(), a.mo31320k());
        this.f112308f.mo157301a(C44331k.m175850a(a.mo31311b()));
        C44373s.m176069a().mo157628a((Activity) this.f112306d, C44331k.m175850a(a.mo31311b()));
        C44373s.m176069a().mo157634a(a.mo31311b(), false);
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: a */
    public void mo157308a(View view) {
        if (this.mDingDialogContainer != null && view != null) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.mDingDialogContainer.getChildCount()) {
                    break;
                } else if (this.mDingDialogContainer.getChildAt(i) == view) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                this.mDingDialogContainer.addView(view);
            }
            this.mDingDialogContainer.bringToFront();
        }
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: a */
    public void mo157314a(boolean z) {
        if (this.f112306d != null) {
            boolean z2 = false;
            if (!z) {
                boolean z3 = this.f112321s;
                C44134a.m174959a().mo133209a();
                this.f112321s = m175679A();
                if (C37239a.m146648b().mo136951a("lark.splash.ad.clear.tenant")) {
                    SplashAdManagerHolder.m176617c(this.f112306d);
                }
                if (z3 || this.f112321s) {
                    z2 = true;
                }
            }
            if (z2) {
                Log.m165389i("MainModule_MainFragmentView", "reload and process fully recreate.");
                this.f112305c.mo157451a();
                this.f112304b.mo157813a();
                this.mMainViewPager.setAdapter(this.f112304b);
            }
            String e = this.f112305c.mo157465e();
            if (!z) {
                for (AbstractC44552i iVar : this.f112305c.mo157462d()) {
                    if (iVar.mo31321l() != null) {
                        iVar.mo31321l().mo31324a(e, "");
                    }
                }
            }
            this.f112305c.mo157468h("");
            this.f112304b.mo157816a(this.f112305c.mo157457b(this.f112306d, this.mDrawerContainer, this.f112314l));
            this.f112304b.notifyDataSetChanged();
            m175714u();
            m175712s();
            this.mMainViewPager.setOffscreenPageLimit(this.f112305c.mo157462d().size());
            UICallbackExecutor.executeDelayed(new Runnable(z) {
                /* class com.ss.android.lark.main.app.fragment.phone.$$Lambda$MainFragmentView$onXAm__82y9LMQSrWZe95yDxm1o */
                public final /* synthetic */ boolean f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    MainFragmentView.lambda$onXAm__82y9LMQSrWZe95yDxm1o(MainFragmentView.this, this.f$1);
                }
            }, 500);
            if (!z) {
                for (AbstractC44552i iVar2 : this.f112305c.mo157462d()) {
                    if (this.f112305c.mo157463d(iVar2.mo31311b())) {
                        iVar2.mo31323n();
                    }
                    if (iVar2 instanceof AbstractC44552i.AbstractC44556d) {
                        ((AbstractC44552i.AbstractC44556d) iVar2).mo103432q();
                    }
                }
            }
            String b = this.f112305c.mo157461c().mo31311b();
            if (z2) {
                this.f112304b.mo157813a();
            }
            mo157311a(z ? e : b, (Bundle) null);
            if (!z) {
                AbstractC44552i e2 = this.f112305c.mo157464e(e);
                if (!(e2 == null || e2.mo31321l() == null)) {
                    e2.mo31321l().mo31324a("", b);
                }
                this.f112314l.mo157720i();
            }
            this.f112314l.mo157721j();
        }
    }

    /* renamed from: a */
    private void m175691a(EditorTabInfoList cVar) {
        LKUIToast.showLoading(this.f112306d, (int) R.string.Lark_Legacy_LoadingNow);
        final TabInfo a = C44384t.m176123a(cVar);
        C44373s.m176069a().mo157630a(a, new UIGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.main.app.fragment.phone.MainFragmentView.C442959 */

            @Override // com.larksuite.framework.callback.UIGetDataCallback
            public void onErrored(ErrorResult errorResult) {
                super.onErrored(errorResult);
                if (MainFragmentView.this.f112306d != null) {
                    LKUIToast.loadFail(MainFragmentView.this.f112306d, (int) R.string.Lark_Legacy_NetError);
                }
                Log.m165383e("MainModule_MainFragmentView", "modifyNavigationOrder error:" + errorResult.getDebugMsg());
            }

            /* renamed from: a */
            public void onSuccessed(Boolean bool) {
                super.onSuccessed(bool);
                LKUIToast.cancelLoading();
                MainFragmentView.this.f112309g.mo157614a(4);
                C44134a.m174959a().mo133201U().mo133295a(C44384t.m176128a(a), NavDataSource.V2);
                MainFragmentView.this.mo157314a(true);
                MainFragmentView.this.f112305c.mo157455a(a.getMainApps(), a.getNavApps());
                Log.m165389i("MainModule_MainFragmentView", "modifyNavigationOrder:" + bool);
            }
        });
    }

    /* renamed from: A */
    private boolean m175679A() {
        return DynamicResourcesFacade.m88635b((int) R.color.suite_skin_vi_color);
    }

    /* renamed from: l */
    private void m175705l() {
        C44404a aVar = this.f112314l;
        if (aVar != null) {
            aVar.mo157719h();
        }
    }

    /* renamed from: o */
    private void m175708o() {
        MainViewContainer mainViewContainer = this.mDrawerContainer;
        if (mainViewContainer != null) {
            mainViewContainer.mo157768f();
        }
    }

    /* renamed from: x */
    private void m175717x() {
        this.f112308f.mo157304b();
    }

    /* renamed from: y */
    private void m175718y() {
        this.f112309g.mo157618c();
    }

    /* renamed from: g */
    private void m175699g() {
        C44134a.m174959a().mo133182B().mo133362a();
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: b */
    public AbstractC44552i mo157316b() {
        return m175682a(this.f112305c.mo157465e(), true);
    }

    /* renamed from: i */
    private void m175702i() {
        FragmentActivity fragmentActivity = this.f112306d;
        if (RomUtils.m94934a(fragmentActivity, fragmentActivity.getWindow())) {
            StatusBarUtil.setTransparentForImageView(this.f112306d, this.mMainViewPager, this.mMainTitle);
        }
    }

    /* renamed from: k */
    private void m175704k() {
        C44134a.m174959a().mo133261q().mo133330a(new AbstractC36551c.AbstractC36552a() {
            /* class com.ss.android.lark.main.app.fragment.phone.MainFragmentView.AnonymousClass13 */

            @Override // com.ss.android.lark.desktopmode.p1788b.p1792d.AbstractC36551c.AbstractC36552a
            /* renamed from: a */
            public FragmentManager mo134828a() {
                return MainFragmentView.this.f112306d.getSupportFragmentManager();
            }

            @Override // com.ss.android.lark.desktopmode.p1788b.p1792d.AbstractC36551c.AbstractC36552a
            /* renamed from: b */
            public Map<ContainerType, Integer> mo134829b() {
                HashMap hashMap = new HashMap(1);
                hashMap.put(ContainerType.ALL, 16908290);
                return hashMap;
            }
        });
    }

    /* renamed from: m */
    private void m175706m() {
        if (this.mDingDialogContainer != null) {
            this.mDingDialogContainer.setLayoutTransition(C44279g.m175651a(0, -UIHelper.dp2px(200.0f), LocationRequest.PRIORITY_INDOOR));
        }
    }

    /* renamed from: n */
    private void m175707n() {
        this.mDrawerContainer.mo157767e();
        this.mDrawerContainer.setScrimColor(this.f112306d.getResources().getColor(R.color.bg_mask));
    }

    /* renamed from: p */
    private void m175709p() {
        MainDrawerListenerManager.f112748a.mo157810a().mo157809b(this.f112313k);
        this.f112313k = null;
        m175711r();
    }

    /* renamed from: q */
    private void m175710q() {
        if (this.mDrawerContainer == null) {
            Log.m165383e("MainModule_MainFragmentView", "initDrawerView failed!");
            return;
        }
        this.f112313k = new IMainDrawerListener() {
            /* class com.ss.android.lark.main.app.fragment.phone.MainFragmentView.AnonymousClass14 */

            @Override // com.ss.android.lark.biz.core.api.IMainDrawerListener
            /* renamed from: a */
            public void mo105898a(int i) {
            }

            @Override // com.ss.android.lark.biz.core.api.IMainDrawerListener
            /* renamed from: b */
            public void mo105899b() {
                if (MainFragmentView.this.f112307e != null) {
                    MainFragmentView.this.f112307e.mo157183a(1);
                }
            }

            @Override // com.ss.android.lark.biz.core.api.IMainDrawerListener
            /* renamed from: c */
            public void mo105900c() {
                if (MainFragmentView.this.f112307e != null) {
                    MainFragmentView.this.f112307e.mo157183a(0);
                }
            }

            @Override // com.ss.android.lark.biz.core.api.IMainDrawerListener
            /* renamed from: d */
            public void mo105901d() {
                if (MainFragmentView.this.f112307e != null) {
                    MainFragmentView.this.f112307e.mo157183a(2);
                }
            }

            @Override // com.ss.android.lark.biz.core.api.IMainDrawerListener
            /* renamed from: a */
            public void mo105897a() {
                MainFragmentView.this.mo157386e();
                if (MainFragmentView.this.f112307e != null) {
                    MainFragmentView.this.f112307e.mo157183a(3);
                }
            }
        };
        MainDrawerListenerManager.f112748a.mo157810a().mo157808a(this.f112313k);
    }

    /* renamed from: r */
    private void m175711r() {
        if (this.f112307e != null) {
            this.mDrawerContainer.mo157764c("conversation");
            this.f112307e.mo157182a();
        }
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: c */
    public void mo157319c() {
        m175716w();
        m175717x();
    }

    /* renamed from: h */
    private void m175701h() {
        this.f112321s = m175679A();
        m175702i();
        m175695c("initTab");
        m175712s();
        m175699g();
        m175707n();
        m175710q();
        m175695c("initViewPager");
        m175715v();
        m175699g();
        m175706m();
    }

    /* renamed from: j */
    private void m175703j() {
        C44404a aVar = new C44404a(this.mMainTitle);
        this.f112314l = aVar;
        aVar.mo157708a(this.mMainTitle.getContext());
        this.f112314l.mo157713b(this.mStatusBarBackground);
        this.f112314l.mo157709a(new C44404a.AbstractC44409a() {
            /* class com.ss.android.lark.main.app.fragment.phone.MainFragmentView.AnonymousClass12 */

            @Override // com.ss.android.lark.main.app.title.C44404a.AbstractC44409a
            /* renamed from: a */
            public void mo157393a() {
                MainFragmentView.this.mo157385d();
            }

            @Override // com.ss.android.lark.main.app.title.C44404a.AbstractC44409a
            /* renamed from: d */
            public void mo157397d() {
                MainFragmentView.this.f112308f.mo157304b();
            }

            @Override // com.ss.android.lark.main.app.title.C44404a.AbstractC44409a
            /* renamed from: c */
            public void mo157396c() {
                C44134a.m174959a().mo133250f().mo133312a(MainFragmentView.this.mo157305a().getActivity(), 2891);
            }

            @Override // com.ss.android.lark.main.app.title.C44404a.AbstractC44409a
            /* renamed from: b */
            public boolean mo157395b() {
                if (MainFragmentView.this.mo157316b() == null) {
                    return false;
                }
                return TextUtils.equals(MainFragmentView.this.mo157316b().mo31311b(), MainFragmentView.this.f112305c.mo157461c().mo31311b());
            }

            @Override // com.ss.android.lark.main.app.title.C44404a.AbstractC44409a
            /* renamed from: a */
            public void mo157394a(View view) {
                C44498d.m176513a("main_title_avatar", view);
            }
        });
    }

    /* renamed from: u */
    private void m175714u() {
        for (AbstractC44552i iVar : this.f112305c.mo157462d()) {
            C44373s.m176069a().mo157633a(iVar.mo31311b(), (Object) null);
        }
        this.mMainTab.mo157476b();
        NavigationTab navigationTab = this.f112303a;
        if (navigationTab != null) {
            navigationTab.setNavRedDotListener(null);
            this.f112303a.mo157499b();
        }
    }

    /* renamed from: w */
    private void m175716w() {
        List<AbstractC44552i> d = this.f112305c.mo157462d();
        if (!(d == null || d.isEmpty())) {
            for (AbstractC44552i iVar : d) {
                if (iVar instanceof AbstractC44552i.AbstractC44556d) {
                    ((AbstractC44552i.AbstractC44556d) iVar).mo103432q();
                }
            }
        }
    }

    /* renamed from: d */
    public void mo157385d() {
        if (this.f112307e == null) {
            mo157386e();
        }
        if (this.mDrawerContainer != null && mo157316b() != null && this.mDrawerContainer.mo157763b(mo157316b().mo31311b())) {
            this.mDrawerContainer.aS_();
        }
    }

    /* renamed from: t */
    private void m175713t() {
        FragmentActivity fragmentActivity;
        if (this.f112303a == null && (fragmentActivity = this.f112306d) != null && !fragmentActivity.isFinishing()) {
            this.f112303a = new NavigationTab(this.f112306d);
            CoordinatorLayout.LayoutParams layoutParams = new CoordinatorLayout.LayoutParams(-1, -2);
            int i = 0;
            this.f112303a.setPadding(0, UIUtils.dp2px(this.f112306d, 40.0f), 0, UIUtils.dp2px(this.f112306d, 65.0f));
            this.f112303a.setVisibility(8);
            layoutParams.setBehavior(new EmptyBottomSheetBehavior(this.f112306d, null));
            ViewGroup viewGroup = this.mMainLayout;
            if (viewGroup != null) {
                int indexOfChild = viewGroup.indexOfChild(this.mNavLine);
                ViewGroup viewGroup2 = this.mMainLayout;
                NavigationTab navigationTab = this.f112303a;
                if (indexOfChild != -1) {
                    i = indexOfChild;
                }
                viewGroup2.addView(navigationTab, i, layoutParams);
            }
        }
    }

    /* renamed from: z */
    private NavigationTabEditorView m175719z() {
        FragmentActivity fragmentActivity = this.f112306d;
        NavigationTabEditorView navigationTabEditorView = new NavigationTabEditorView(fragmentActivity);
        navigationTabEditorView.setupTabs(C44384t.m176131b(this.f112305c.mo157462d()));
        navigationTabEditorView.setOnEditFinishedListener(new Function2() {
            /* class com.ss.android.lark.main.app.fragment.phone.$$Lambda$MainFragmentView$iPWmYeqBvJACmyAq4roY7I6tII */

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MainFragmentView.m270796lambda$iPWmYeqBvJACmyAq4roY7I6tII(MainFragmentView.this, (NavigationTabEditorView) obj, (EditorTabInfoList) obj2);
            }
        });
        navigationTabEditorView.setOnEditCanceledListener(new Function1() {
            /* class com.ss.android.lark.main.app.fragment.phone.$$Lambda$MainFragmentView$SgQWVRezEVIa0IUAwP4PH0_Ehj8 */

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainFragmentView.lambda$SgQWVRezEVIa0IUAwP4PH0_Ehj8(MainFragmentView.this, (NavigationTabEditorView) obj);
            }
        });
        CoordinatorLayout.LayoutParams layoutParams = new CoordinatorLayout.LayoutParams(-1, this.mMainLayout.getHeight() - CommonTitleBar.getStatusBarHeight());
        EmptyBottomSheetBehavior emptyBottomSheetBehavior = new EmptyBottomSheetBehavior(fragmentActivity, null);
        layoutParams.setBehavior(emptyBottomSheetBehavior);
        m175687a(navigationTabEditorView, layoutParams);
        emptyBottomSheetBehavior.mo76702a(0);
        navigationTabEditorView.post(new Runnable() {
            /* class com.ss.android.lark.main.app.fragment.phone.$$Lambda$MainFragmentView$Sybjw0v7iqbf8q64VukE74gM49w */

            public final void run() {
                MainFragmentView.lambda$Sybjw0v7iqbf8q64VukE74gM49w(NavBottomSheetBehavior.this);
            }
        });
        return navigationTabEditorView;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m175695c("create");
        if (this.f112315m != null) {
            m175695c("injectView");
            this.f112315m.mo157372a(this);
            m175699g();
            this.mDrawerContainer.setiMainViewController(this);
            m175703j();
            m175704k();
            m175695c("tab_init");
            this.f112305c.mo157452a(this.f112306d, this.mDrawerContainer, this.f112314l);
            m175699g();
            m175695c("init_view");
            m175701h();
            m175699g();
            mo157311a(this.f112305c.mo157461c().mo31311b(), this.f112317o);
            this.f112317o = null;
        }
        C44325i.m175831a().mo157440a(this.f112322t);
        C44325i.m175831a().mo157439a(this.f112319q);
        C44134a.m174959a().mo133211a(this);
        C44134a.m174959a().mo133188H().mo133401a(this.f112320r);
        m175699g();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C44325i.m175831a().mo157444b(this.f112322t);
        C44325i.m175831a().mo157443b(this.f112319q);
        C44134a.m174959a().mo133233b(this);
        C44134a.m174959a().mo133261q().mo133333b();
        C44134a.m174959a().mo133188H().mo133409b(this.f112320r);
        this.f112306d = null;
        m175709p();
        m175708o();
        m175714u();
        m175705l();
        this.f112305c.mo157458b();
    }

    /* renamed from: e */
    public void mo157386e() {
        if (this.f112307e == null) {
            FeedDrawerContainer feedDrawerContainer = new FeedDrawerContainer(this.mDrawerContainer.getContainerContext());
            this.f112307e = feedDrawerContainer;
            feedDrawerContainer.mo157184a(this.f112316n, this.mDrawerContainer);
            this.mDrawerContainer.mo157761a("conversation", this.f112307e.getContentView());
        }
    }

    /* renamed from: f */
    public void mo157387f() {
        FragmentActivity fragmentActivity;
        if (!C57744a.m224104a().getBoolean("navtab_v2_guide", false) && (fragmentActivity = this.f112306d) != null && !fragmentActivity.isFinishing() && this.f112303a != null && !C44134a.m174959a().mo133200T().mo133289e()) {
            ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f112306d).inflate(R.layout.main_nav_show_notify, (ViewGroup) null);
            final Dialog a = C57811b.m224342a((Context) this.f112306d, (View) viewGroup, (int) R.style.customDialog, true);
            FragmentActivity fragmentActivity2 = this.f112306d;
            m175686a(fragmentActivity2, a, UIUtils.px2dp(fragmentActivity2, (float) this.f112303a.getHeight()) - 15);
            Log.m165389i("MainModule_MainFragmentView", "showNavTabGuide");
            C57744a.m224104a().putBoolean("navtab_v2_guide", true);
            ((TextView) viewGroup.findViewById(R.id.nav_show_notify_ok)).setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.main.app.fragment.phone.MainFragmentView.View$OnClickListenerC442926 */

                public void onClick(View view) {
                    Log.m165389i("MainModule_MainFragmentView", "Close showNavTabGuide");
                    a.dismiss();
                }
            });
        }
    }

    /* renamed from: s */
    private void m175712s() {
        this.mMainTab.mo157473a();
        List<AbstractC44552i> d = this.f112305c.mo157462d();
        for (int i = 0; i < d.size(); i++) {
            AbstractC44552i iVar = d.get(i);
            TabType i2 = this.f112305c.mo157469i(iVar.mo31311b());
            m175695c("tab_" + iVar.mo31311b());
            if (i2 == TabType.Main) {
                this.mMainTab.mo157474a(iVar.mo31311b(), iVar.mo31312c());
                C44373s.m176069a().mo157633a(iVar.mo31311b(), iVar.mo31312c());
            }
            m175699g();
        }
        this.mMainTab.mo157477b(true);
        this.mMainTab.setOnMoreClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.main.app.fragment.phone.MainFragmentView.AnonymousClass15 */

            public void onClick(View view) {
                if (!view.isSelected()) {
                    MainFragmentView mainFragmentView = MainFragmentView.this;
                    if (mainFragmentView.mo157384b(mainFragmentView.f112305c.mo157465e())) {
                        MainFragmentView.this.mMainTab.mo157478c(true);
                    }
                }
                if (MainFragmentView.this.f112309g != null) {
                    MainFragmentView.this.f112310h = true;
                    if (MainFragmentView.this.f112309g.mo157613a() == 3) {
                        MainFragmentView.this.f112309g.mo157614a(4);
                    } else if (MainFragmentView.this.f112309g.mo157613a() == 4) {
                        MainFragmentView.this.f112309g.mo157614a(3);
                        MainHitPointHelper.m176677g();
                    }
                }
            }
        });
        AnonymousClass16 r0 = new AbstractC44371p() {
            /* class com.ss.android.lark.main.app.fragment.phone.MainFragmentView.AnonymousClass16 */

            @Override // com.ss.android.lark.main.app.tab.AbstractC44371p
            /* renamed from: a */
            public void mo157345a(String str) {
                if (!C44134a.m174959a().mo133257m().mo133348a()) {
                    Log.m165397w("MainModule_MainFragmentView", "OnTabItemClickListener : Login status has lost!");
                    return;
                }
                String e = MainFragmentView.this.f112305c.mo157465e();
                Log.m165389i("MainModule_MainFragmentView", "onItemClick type=" + e + " current = " + str);
                if (MainFragmentView.this.f112309g != null) {
                    if (MainFragmentView.this.f112305c.mo157463d(str)) {
                        MainFragmentView.this.f112309g.mo157614a(4);
                    } else {
                        MainFragmentView.this.f112309g.mo157619c(4);
                    }
                }
                if (TextUtils.equals(e, str)) {
                    AbstractC44552i f = MainFragmentView.this.f112305c.mo157466f(str);
                    if (f.mo31321l() != null) {
                        f.mo31321l().mo31324a(e, str);
                    }
                } else {
                    AbstractC44552i a = MainFragmentView.this.mo157380a(str);
                    if (!(a == null || a.mo31321l() == null)) {
                        a.mo31321l().mo31325b(e, str);
                    }
                    MainFragmentView.this.f112305c.mo157468h(str);
                    MainFragmentView.this.mo157383a(e, str, (Bundle) null);
                }
                MainFragmentView.this.mMainTab.mo157478c(MainFragmentView.this.mo157384b(str));
                Integer g = MainFragmentView.this.f112305c.mo157467g(str);
                if (g != null) {
                    int i = 1;
                    C44524a.m176678a().mo157983a(1, str, MainFragmentView.this.f112305c.mo157469i(str), g.intValue() + 1);
                    C44524a.m176678a().mo157984b(1, str, MainFragmentView.this.f112305c.mo157469i(str), g.intValue() + 1);
                    if (C44373s.m176069a().mo157637b().getMainAppNames().indexOf(str) < 0) {
                        i = 2;
                    }
                    MainHitPointHelper.m176665a(i, str, g.intValue());
                }
            }
        };
        AnonymousClass17 r1 = new AbstractC44372q() {
            /* class com.ss.android.lark.main.app.fragment.phone.MainFragmentView.AnonymousClass17 */

            @Override // com.ss.android.lark.main.app.tab.AbstractC44372q
            /* renamed from: a */
            public void mo157335a(String str) {
                if (!C44134a.m174959a().mo133257m().mo133348a()) {
                    Log.m165397w("MainModule_MainFragmentView", "OnTabItemDoubleTapListener : Login status has lost!");
                    return;
                }
                Log.m165389i("MainModule_MainFragmentView", "onItemDoubleClick type=" + str);
                AbstractC44552i a = MainFragmentView.this.mo157380a(str);
                if (a.mo31322m() != null) {
                    a.mo31322m().mo137782a();
                }
                Integer g = MainFragmentView.this.f112305c.mo157467g(str);
                if (g != null) {
                    C44524a.m176678a().mo157983a(2, str, MainFragmentView.this.f112305c.mo157469i(str), g.intValue() + 1);
                    C44524a.m176678a().mo157984b(2, str, MainFragmentView.this.f112305c.mo157469i(str), g.intValue() + 1);
                }
            }
        };
        this.mMainTab.setOnTabItemClickListener(r0);
        this.mMainTab.setOnTabItemDoubleTapListener(r1);
    }

    /* renamed from: v */
    private void m175715v() {
        this.f112304b = new C44431d(this.f112316n);
        for (AbstractC44552i iVar : this.f112305c.mo157462d()) {
            m175695c("page_" + iVar.mo31311b());
            if (this.f112305c.mo157461c() == iVar) {
                this.f112304b.mo157815a(this.f112305c.mo157456b(iVar));
                if (iVar instanceof AbstractC44552i.AbstractC44555c) {
                    this.f112318p.mo157367a((AbstractC44552i.AbstractC44555c) iVar);
                }
            }
            m175699g();
        }
        this.mMainViewPager.setAdapter(this.f112304b);
        this.mMainViewPager.setOffscreenPageLimit(this.f112305c.mo157462d().size());
        this.mMainViewPager.setPageMargin(UIUtils.dp2px(this.f112306d, 5.0f));
        this.mMainViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            /* class com.ss.android.lark.main.app.fragment.phone.MainFragmentView.C442948 */

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                Log.m165389i("MainModule_MainFragmentView", "onPageSelected type=" + "" + " position=" + i);
                if (MainFragmentView.this.f112312j) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("is_initialize", true);
                    hashMap.put("is_in_background", false);
                    AppreciableKit.m107394b().mo103523c(MainFragmentView.this.f112311i, null, null, null, hashMap);
                }
            }
        });
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: a */
    public void mo157307a(Bundle bundle) {
        this.f112317o = bundle;
    }

    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m175694c(View view) {
        this.f112309g.mo157614a(4);
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: e */
    public void mo157322e(boolean z) {
        this.f112314l.mo157714c(z);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ Unit m175683a(NavigationTabEditorView navigationTabEditorView) {
        this.f112309g.mo157614a(4);
        MainHitPointHelper.m176672c();
        return Unit.INSTANCE;
    }

    /* renamed from: c */
    private void m175695c(String str) {
        C44134a.m174959a().mo133182B().mo133363a(str, null);
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: d */
    public void mo157321d(boolean z) {
        if (z) {
            this.f112314l.mo157729r();
        } else {
            this.f112314l.mo157730s();
        }
    }

    /* renamed from: d */
    public static /* synthetic */ C44364l.AbstractC44366b m175697d(View view) {
        if (view instanceof RoundableLayoutContainer) {
            return new NavigationTabRoundableLayoutSlideChangeListener(((RoundableLayoutContainer) view).mo157501d());
        }
        return null;
    }

    /* access modifiers changed from: public */
    /* renamed from: g */
    private /* synthetic */ void m175700g(boolean z) {
        FragmentActivity fragmentActivity = this.f112306d;
        if (fragmentActivity != null && !fragmentActivity.isFinishing()) {
            mo157388f(z);
        }
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: b */
    public void mo157318b(boolean z) {
        if (z) {
            this.f112314l.mo157723l();
        } else {
            this.f112314l.mo157724m();
        }
    }

    /* renamed from: a */
    private void m175685a(int i) {
        MainViewContainer mainViewContainer = this.mDrawerContainer;
        if (mainViewContainer != null) {
            mainViewContainer.setDrawerLockModeWithState(i);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: e */
    private /* synthetic */ void m175698e(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("is_initialize", false);
        hashMap.put("is_in_background", false);
        AppreciableKit.m107394b().mo103523c(this.f112311i, null, null, null, hashMap);
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: b */
    public void mo157317b(View view) {
        if (!(this.mDingDialogContainer == null || view == null)) {
            for (int i = 0; i < this.mDingDialogContainer.getChildCount(); i++) {
                if (this.mDingDialogContainer.getChildAt(i) == view) {
                    this.mDingDialogContainer.removeViewAt(i);
                    return;
                }
            }
        }
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: c */
    public void mo157320c(boolean z) {
        if (z) {
            this.f112314l.mo157725n();
        } else {
            this.f112314l.mo157726o();
        }
    }

    public void onTrimMemory(int i) {
        int i2;
        if (i >= 15) {
            if (i >= 80) {
                i2 = 1;
            } else if (i >= 60) {
                i2 = 2;
            } else {
                i2 = 3;
            }
            Log.m165389i("MainModule_MainFragmentView", "onTrimMemory keepSize = " + i2);
            this.f112318p.mo157365a(i);
            this.f112318p.mo157368b(i2);
            this.f112318p.mo157364a();
        }
    }

    /* renamed from: b */
    public boolean mo157384b(String str) {
        if (this.f112305c.mo157469i(str) == TabType.Navigation) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private Scene m175696d(String str) {
        if (TextUtils.isEmpty(str)) {
            return Scene.Feed;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -178324674:
                if (str.equals("calendar")) {
                    c = 0;
                    break;
                }
                break;
            case 110997:
                if (str.equals("pin")) {
                    c = 1;
                    break;
                }
                break;
            case 3343799:
                if (str.equals("mail")) {
                    c = 2;
                    break;
                }
                break;
            case 3649456:
                if (str.equals("wiki")) {
                    c = 3;
                    break;
                }
                break;
            case 98629247:
                if (str.equals("group")) {
                    c = 4;
                    break;
                }
                break;
            case 109637894:
                if (str.equals("space")) {
                    c = 5;
                    break;
                }
                break;
            case 740154499:
                if (str.equals("conversation")) {
                    c = 6;
                    break;
                }
                break;
            case 951526432:
                if (str.equals("contact")) {
                    c = 7;
                    break;
                }
                break;
            case 1027823062:
                if (str.equals("appCenter")) {
                    c = '\b';
                    break;
                }
                break;
            case 1333391955:
                if (str.equals("videochat")) {
                    c = '\t';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return Scene.CalDiagram;
            case 1:
                return Scene.Pin;
            case 2:
                return Scene.Feed;
            case 3:
                return Scene.Feed;
            case 4:
                return Scene.Playground;
            case 5:
                return Scene.Feed;
            case 6:
                return Scene.Feed;
            case 7:
                return Scene.Contact;
            case '\b':
                return Scene.Feed;
            case '\t':
                return Scene.MeetingView;
            default:
                return Scene.Feed;
        }
    }

    /* renamed from: f */
    public void mo157388f(boolean z) {
        m175713t();
        NavigationTab navigationTab = this.f112303a;
        if (navigationTab != null) {
            navigationTab.mo157500c();
            this.f112303a.setNavRedDotListener(this.mMainTab.getNavRedDotListener());
            for (AbstractC44552i iVar : this.f112305c.mo157462d()) {
                if (this.f112305c.mo157469i(iVar.mo31311b()) != TabType.Main) {
                    this.f112303a.mo157496a(iVar.mo31311b(), iVar.mo31319j());
                    C44373s.m176069a().mo157633a(iVar.mo31311b(), iVar.mo31319j());
                }
            }
            if (!this.f112303a.mo157498a()) {
                if (C44373s.m176069a().mo157648i()) {
                    this.f112303a.setVisibility(8);
                    this.mShadow.setVisibility(8);
                    this.f112309g = null;
                    return;
                }
                this.f112303a.mo157502e();
            }
            boolean z2 = false;
            this.f112303a.setVisibility(0);
            NavigationTabBottomSheetController mVar = new NavigationTabBottomSheetController(new Function0() {
                /* class com.ss.android.lark.main.app.fragment.phone.$$Lambda$MainFragmentView$KnxlE8QTEjqlpwyQA0YfUGAwG0 */

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MainFragmentView.m270794lambda$KnxlE8QTEjqlpwyQA0YfUGAwG0(MainFragmentView.this);
                }
            }, $$Lambda$MainFragmentView$lyqNxgJKoDdKiniVPZ4y59FbIwY.INSTANCE, new C44281i(this.mShadow), new C44364l.AbstractC44365a() {
                /* class com.ss.android.lark.main.app.fragment.phone.MainFragmentView.C442882 */

                @Override // com.ss.android.lark.main.app.tab.C44364l.AbstractC44365a, com.ss.android.lark.main.app.tab.C44364l.AbstractC44366b
                /* renamed from: b */
                public void mo157360b(View view) {
                    super.mo157360b(view);
                    MainFragmentView.this.mNavLine.setVisibility(0);
                }

                @Override // com.ss.android.lark.main.app.tab.C44364l.AbstractC44365a, com.ss.android.lark.main.app.tab.C44364l.AbstractC44366b
                /* renamed from: d */
                public void mo157362d(View view) {
                    super.mo157361c(view);
                    if (MainFragmentView.this.mDrawerContainer != null) {
                        MainFragmentView.this.mDrawerContainer.mo157771i();
                    }
                    MainFragmentView.this.mNavLine.setAlpha(BitmapDescriptorFactory.HUE_RED);
                    MainFragmentView.this.mNavLine.setVisibility(8);
                    MainFragmentView.this.f112310h = false;
                    MainTab mainTab = MainFragmentView.this.mMainTab;
                    MainFragmentView mainFragmentView = MainFragmentView.this;
                    mainTab.mo157478c(mainFragmentView.mo157384b(mainFragmentView.f112305c.mo157465e()));
                }

                @Override // com.ss.android.lark.main.app.tab.C44364l.AbstractC44365a, com.ss.android.lark.main.app.tab.C44364l.AbstractC44366b
                /* renamed from: a */
                public void mo157358a(View view) {
                    String str;
                    super.mo157358a(view);
                    if (MainFragmentView.this.mDrawerContainer != null) {
                        MainFragmentView.this.mDrawerContainer.mo157770h();
                    }
                    MainFragmentView.this.mNavLine.setAlpha(1.0f);
                    MainFragmentView.this.mNavLine.setVisibility(0);
                    if (MainFragmentView.this.f112310h) {
                        str = "click";
                    } else {
                        str = "slide";
                    }
                    MainHitPointHelper.m176667a(str);
                    MainFragmentView.this.f112310h = false;
                    MainFragmentView.this.mMainTab.mo157478c(true);
                    if (view == MainFragmentView.this.f112303a && !C44373s.m176069a().mo157648i()) {
                        MainFragmentView.this.mo157387f();
                    }
                }

                @Override // com.ss.android.lark.main.app.tab.C44364l.AbstractC44365a, com.ss.android.lark.main.app.tab.C44364l.AbstractC44366b
                /* renamed from: a */
                public void mo157359a(View view, float f) {
                    super.mo157359a(view, f);
                    MainFragmentView.this.mNavLine.setVisibility(0);
                    MainFragmentView.this.mNavLine.setAlpha(f);
                }
            });
            this.f112309g = mVar;
            mVar.mo157617b(UIUtils.dp2px(this.f112303a.getContext(), 65.0f));
            this.f112309g.mo157614a(4);
            this.mShadow.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.main.app.fragment.phone.$$Lambda$MainFragmentView$HSZCgjYfxaCv3RQRvodJLGbIxdc */

                public final void onClick(View view) {
                    MainFragmentView.lambda$HSZCgjYfxaCv3RQRvodJLGbIxdc(MainFragmentView.this, view);
                }
            });
            this.f112303a.setOnTabItemClickListener(this.mMainTab.getOnTabItemClickListener());
            ((ViewGroup.MarginLayoutParams) this.mMainViewPager.getLayoutParams()).bottomMargin = (int) C25653b.m91892a(this.mMainViewPager.getContext(), 65.0f);
            this.f112303a.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.main.app.fragment.phone.MainFragmentView.View$OnClickListenerC442893 */

                public void onClick(View view) {
                    if (MainFragmentView.this.f112309g != null) {
                        MainFragmentView.this.f112310h = true;
                        if (MainFragmentView.this.f112309g.mo157613a() == 4) {
                            MainFragmentView.this.f112309g.mo157614a(3);
                        }
                    }
                }
            });
            this.f112303a.setOnTabEditClickListener(new NavigationTab.AbstractC44343b() {
                /* class com.ss.android.lark.main.app.fragment.phone.$$Lambda$MainFragmentView$dqVtrNBYrNUnN2t67ExG6RnVDQ8 */

                @Override // com.ss.android.lark.main.app.tab.NavigationTab.AbstractC44343b
                public final void onNavigationTabEditorClick(NavigationTab navigationTab) {
                    MainFragmentView.lambda$dqVtrNBYrNUnN2t67ExG6RnVDQ8(MainFragmentView.this, navigationTab);
                }
            });
            Boolean a = C44134a.m174959a().mo133201U().mo133292a();
            boolean a2 = C44134a.m174959a().mo133187G().mo133371a();
            if (a != null && a.booleanValue() && a2) {
                z2 = true;
            }
            if (!z2 && !z) {
                this.f112305c.mo157453a(new IGetDataCallback<C0844e<String, C44357a>>() {
                    /* class com.ss.android.lark.main.app.fragment.phone.MainFragmentView.C442904 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                    }

                    /* access modifiers changed from: public */
                    /* renamed from: b */
                    private /* synthetic */ Unit m175773b(C0844e eVar) {
                        MainFragmentView.this.mo157381a(eVar);
                        return null;
                    }

                    /* renamed from: a */
                    public void onSuccess(C0844e<String, C44357a> eVar) {
                        if (eVar != null && eVar.f3317a != null && eVar.f3318b != null) {
                            if (TextUtils.equals(eVar.f3317a, C44134a.m174959a().mo133196P())) {
                                C44428b.m176319a(new Function0(eVar) {
                                    /* class com.ss.android.lark.main.app.fragment.phone.$$Lambda$MainFragmentView$4$3cf4gapORq2Pmq6lYwdcdpS64rE */
                                    public final /* synthetic */ C0844e f$1;

                                    {
                                        this.f$1 = r2;
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return MainFragmentView.C442904.lambda$3cf4gapORq2Pmq6lYwdcdpS64rE(MainFragmentView.C442904.this, this.f$1);
                                    }
                                });
                            } else {
                                Log.m165397w("MainModule_MainFragmentView", "receive tab update result, but user id not match;");
                            }
                        }
                    }
                });
            }
            UICallbackExecutor.executeDelayed(new Runnable() {
                /* class com.ss.android.lark.main.app.fragment.phone.MainFragmentView.RunnableC442915 */

                public void run() {
                    if (UIUtils.isActivityRunning(MainFragmentView.this.f112306d)) {
                        C44134a.m174959a().mo133259o().mo133355a(MainFragmentView.this.f112306d, MainFragmentView.this.mMainTab);
                        C44134a.m174959a().mo133259o().mo133356a(MainFragmentView.this.f112306d);
                    }
                }
            }, 1000);
        }
    }

    /* renamed from: a */
    private void m175688a(FragmentActivity fragmentActivity) {
        C44282j jVar = new C44282j(fragmentActivity, this.f112305c);
        this.f112318p = jVar;
        jVar.mo157366a(new C44282j.AbstractC44283a() {
            /* class com.ss.android.lark.main.app.fragment.phone.MainFragmentView.AnonymousClass10 */

            @Override // com.ss.android.lark.main.app.fragment.C44282j.AbstractC44283a
            /* renamed from: a */
            public /* synthetic */ void mo157341a(String str, int i) {
                C44282j.AbstractC44283a.CC.$default$a(this, str, i);
            }

            @Override // com.ss.android.lark.main.app.fragment.C44282j.AbstractC44283a
            /* renamed from: a */
            public void mo157342a(List<String> list, int i) {
                if (MainFragmentView.this.f112304b != null && list.size() > 0) {
                    MainFragmentView.this.f112304b.mo157816a(list);
                    MainFragmentView.this.f112304b.notifyDataSetChanged();
                }
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m175690a(NavigationTab navigationTab) {
        NavigationTabEditorView z = m175719z();
        Statistics.sendEvent("navigation_more_edit");
        this.f112309g.mo157615a(new Function0() {
            /* class com.ss.android.lark.main.app.fragment.phone.$$Lambda$MainFragmentView$gM87zf_mui0_dZnHdEA0MtKlIs */

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainFragmentView.m270795lambda$gM87zf_mui0_dZnHdEA0MtKlIs(NavigationTabEditorView.this);
            }
        });
        m175718y();
    }

    /* renamed from: a */
    private AbstractC44552i m175682a(String str, boolean z) {
        return this.f112305c.mo157450a(str, z);
    }

    /* renamed from: b */
    private boolean m175693b(String str, String str2) {
        return !TextUtils.equals(str, str2);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ Unit m175684a(NavigationTabEditorView navigationTabEditorView, EditorTabInfoList cVar) {
        MainHitPointHelper.m176670b();
        m175691a(cVar);
        return Unit.INSTANCE;
    }

    /* renamed from: a */
    private void m175687a(View view, CoordinatorLayout.LayoutParams layoutParams) {
        ((CoordinatorLayout) this.mMainLayout).addView(view, layoutParams);
    }

    public MainFragmentView(AbstractC44285k kVar, FragmentActivity fragmentActivity, FragmentManager fragmentManager) {
        this.f112306d = fragmentActivity;
        this.f112315m = kVar;
        this.f112316n = fragmentManager;
        m175688a(fragmentActivity);
    }

    /* renamed from: a */
    private static void m175686a(Context context, Dialog dialog, int i) {
        Window window = dialog.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            attributes.gravity = 80;
            attributes.verticalMargin = ((float) UIUtils.dp2px(context, (float) i)) / ((float) displayMetrics.heightPixels);
            window.setAttributes(attributes);
            window.setDimAmount(BitmapDescriptorFactory.HUE_RED);
            dialog.show();
        }
    }

    /* renamed from: a */
    private int m175681a(TextView textView, int i, List<TabAppInfo> list, String str, int i2) {
        boolean equalsIgnoreCase = str.equalsIgnoreCase("CN");
        boolean equalsIgnoreCase2 = str.equalsIgnoreCase("JP");
        if (list == null || list.size() == 0) {
            textView.setVisibility(8);
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(". ");
        sb.append(this.f112306d.getString(i2));
        for (int i3 = 0; i3 < list.size(); i3++) {
            TabAppInfo.Name name = list.get(i3).getName();
            if (i3 > 0) {
                if (equalsIgnoreCase || equalsIgnoreCase2) {
                    sb.append("、");
                } else {
                    sb.append(", ");
                }
            }
            if (equalsIgnoreCase) {
                sb.append(name.getCn());
            } else if (equalsIgnoreCase2) {
                sb.append(name.getJp());
            } else {
                sb.append(name.getUs());
            }
        }
        textView.setText(sb.toString());
        return i + 1;
    }
}
