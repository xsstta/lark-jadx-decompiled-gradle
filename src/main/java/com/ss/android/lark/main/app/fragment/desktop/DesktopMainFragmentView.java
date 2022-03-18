package com.ss.android.lark.main.app.fragment.desktop;

import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import butterknife.BindView;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.component.ui.p1151c.C25633a;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.p1787a.C36519d;
import com.ss.android.lark.desktopmode.utils.p1796b.C36580a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.main.app.C44325i;
import com.ss.android.lark.main.app.C44331k;
import com.ss.android.lark.main.app.fragment.C44274f;
import com.ss.android.lark.main.app.fragment.C44279g;
import com.ss.android.lark.main.app.fragment.C44282j;
import com.ss.android.lark.main.app.tab.AbstractC44371p;
import com.ss.android.lark.main.app.tab.AbstractC44372q;
import com.ss.android.lark.main.app.tab.C44373s;
import com.ss.android.lark.main.app.tab.DesktopNavigationTab;
import com.ss.android.lark.main.app.tab.MainTab;
import com.ss.android.lark.main.app.widgets.MainDropRelativeLayout;
import com.ss.android.lark.main.app.widgets.MainViewContainer;
import com.ss.android.lark.main.app.widgets.desktop.TenantSwitchLoadingView;
import com.ss.android.lark.main.app.widgets.desktop.avatar.MainAvatar;
import com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.AbstractC44462a;
import com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.MainTenantSwitcher;
import com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.entity.C44487b;
import com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.entity.C44488c;
import com.ss.android.lark.main.interfaces.NetworkLevel;
import com.ss.android.lark.main.p2231a.AbstractC44136a;
import com.ss.android.lark.main.statistics.MainHitPointHelper;
import com.ss.android.lark.maincore.AbstractC44544a;
import com.ss.android.lark.maincore.AbstractC44547d;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.TabType;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DesktopMainFragmentView implements ComponentCallbacks2, C44274f.AbstractC44277b, AbstractC44547d {

    /* renamed from: a */
    public FragmentManager f112255a;

    /* renamed from: b */
    public C44331k f112256b = new C44331k();

    /* renamed from: c */
    public AbstractC44269a f112257c;

    /* renamed from: d */
    public AbstractC44136a.AbstractC44154j f112258d;

    /* renamed from: e */
    public AbstractC44136a.AbstractC44151g f112259e;

    /* renamed from: f */
    public FragmentActivity f112260f;

    /* renamed from: g */
    public DesktopNavigationTab f112261g;

    /* renamed from: h */
    private C44282j f112262h;

    /* renamed from: i */
    private Bundle f112263i;

    /* renamed from: j */
    private AbstractC44136a.AbstractC44171x f112264j;

    /* renamed from: k */
    private AbstractC44544a f112265k = new AbstractC44544a() {
        /* class com.ss.android.lark.main.app.fragment.desktop.DesktopMainFragmentView.C442571 */

        @Override // com.ss.android.lark.maincore.AbstractC44544a
        /* renamed from: a */
        public void mo102546a() {
        }

        @Override // com.ss.android.lark.maincore.AbstractC44544a
        /* renamed from: b */
        public void mo102548b() {
        }

        @Override // com.ss.android.lark.maincore.AbstractC44544a
        /* renamed from: a */
        public void mo102547a(String str) {
            for (AbstractC44552i iVar : DesktopMainFragmentView.this.f112256b.mo157462d()) {
                if (iVar.mo31313d() == 10) {
                    iVar.mo31315f();
                }
            }
        }
    };

    /* renamed from: l */
    private AbstractC44462a.AbstractC44463a f112266l = new AbstractC44462a.AbstractC44463a() {
        /* class com.ss.android.lark.main.app.fragment.desktop.DesktopMainFragmentView.C442614 */

        @Override // com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.AbstractC44462a.AbstractC44463a
        /* renamed from: a */
        public void mo157338a(C44487b bVar) {
            DesktopMainFragmentView.this.mMainAvatar.mo157823a(bVar.mo157914g(), bVar.mo157910c());
        }

        @Override // com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.AbstractC44462a.AbstractC44463a
        /* renamed from: a */
        public void mo157339a(boolean z) {
            DesktopMainFragmentView.this.f112258d.mo133275a(z);
            DesktopMainFragmentView.this.mo157331f(z);
        }

        @Override // com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.AbstractC44462a.AbstractC44463a
        /* renamed from: b */
        public void mo157340b(boolean z) {
            if (!z) {
                DesktopMainFragmentView.this.mMainAvatar.setVisibility(8);
                DesktopMainFragmentView.this.mMainTab.setVisibility(8);
                return;
            }
            DesktopMainFragmentView.this.mMainAvatar.setVisibility(0);
            DesktopMainFragmentView.this.mMainTab.setVisibility(0);
        }
    };

    /* renamed from: m */
    private C36519d.AbstractC36527c f112267m = new C36519d.AbstractC36527c() {
        /* class com.ss.android.lark.main.app.fragment.desktop.DesktopMainFragmentView.C442625 */

        @Override // com.ss.android.lark.desktopmode.p1787a.C36519d.AbstractC36527c
        /* renamed from: a */
        public Activity mo134837a() {
            return DesktopMainFragmentView.this.f112260f;
        }

        @Override // com.ss.android.lark.desktopmode.p1787a.C36519d.AbstractC36527c
        /* renamed from: b */
        public FragmentManager mo134838b() {
            return DesktopMainFragmentView.this.f112255a;
        }

        @Override // com.ss.android.lark.desktopmode.p1787a.C36519d.AbstractC36527c
        /* renamed from: d */
        public DrawerLayout mo134840d() {
            return DesktopMainFragmentView.this.mDrawerLayout;
        }

        @Override // com.ss.android.lark.desktopmode.p1787a.C36519d.AbstractC36527c
        /* renamed from: e */
        public FrameLayout mo134841e() {
            return DesktopMainFragmentView.this.mSideMenuContainer;
        }

        @Override // com.ss.android.lark.desktopmode.p1787a.C36519d.AbstractC36527c
        /* renamed from: f */
        public C36519d.AbstractC36527c.AbstractC36528a mo134842f() {
            return new C36519d.AbstractC36527c.AbstractC36528a() {
                /* class com.ss.android.lark.main.app.fragment.desktop.DesktopMainFragmentView.C442625.C442631 */

                @Override // com.ss.android.lark.desktopmode.p1787a.C36519d.AbstractC36527c.AbstractC36528a
                /* renamed from: a */
                public void mo134843a(String str, String str2) {
                    DesktopMainFragmentView.this.f112256b.mo157468h(str2);
                    DesktopMainFragmentView.this.mo157328b(str, str2);
                }
            };
        }

        @Override // com.ss.android.lark.desktopmode.p1787a.C36519d.AbstractC36527c
        /* renamed from: c */
        public Map<ContainerType, C36519d.C36525a> mo134839c() {
            C36519d.C36525a aVar = new C36519d.C36525a(R.id.left_container, DesktopMainFragmentView.this.mLeftContainer, ContainerType.Left);
            C36519d.C36525a aVar2 = new C36519d.C36525a(R.id.right_container, DesktopMainFragmentView.this.mRightContainer, ContainerType.Right);
            C36519d.C36525a aVar3 = new C36519d.C36525a(R.id.drawer_container, DesktopMainFragmentView.this.mDrawerContainer, ContainerType.Drawer);
            C36519d.C36525a aVar4 = new C36519d.C36525a(R.id.all_container, DesktopMainFragmentView.this.mALLContainer, ContainerType.ALL);
            C36519d.C36525a aVar5 = new C36519d.C36525a(R.id.float_container, DesktopMainFragmentView.this.mFloatContainer, ContainerType.Float);
            HashMap hashMap = new HashMap();
            hashMap.put(ContainerType.Left, aVar);
            hashMap.put(ContainerType.Right, aVar2);
            hashMap.put(ContainerType.ALL, aVar4);
            hashMap.put(ContainerType.Drawer, aVar3);
            hashMap.put(ContainerType.Float, aVar5);
            return hashMap;
        }
    };
    @BindView(6626)
    FrameLayout mALLContainer;
    @BindView(6884)
    FrameLayout mDingDialogContainer;
    @BindView(6912)
    FrameLayout mDrawerContainer;
    @BindView(7549)
    DrawerLayout mDrawerLayout;
    @BindView(6996)
    FrameLayout mFloatContainer;
    @BindView(7193)
    FrameLayout mLeftContainer;
    @BindView(7195)
    MainViewContainer mLeftDrawer;
    @BindView(7272)
    MainAvatar mMainAvatar;
    @BindView(7282)
    MainTab mMainTab;
    @BindView(7377)
    View mNetWorkStatusView;
    @BindView(7376)
    TextView mNetworkTV;
    @BindView(7541)
    FrameLayout mRightContainer;
    @BindView(7548)
    MainDropRelativeLayout mRootView;
    @BindView(7669)
    FrameLayout mSideMenuContainer;
    @BindView(7775)
    MainTenantSwitcher mTenantSwitcher;

    /* renamed from: n */
    private C36512a.AbstractC36515b f112268n = new C36512a.AbstractC36515b() {
        /* class com.ss.android.lark.main.app.fragment.desktop.DesktopMainFragmentView.C442646 */

        @Override // com.ss.android.lark.desktopmode.C36512a.AbstractC36515b
        /* renamed from: a */
        public void mo134779a(Dialog dialog) {
            C44134a.m174959a().mo133257m().mo133340a(dialog);
        }
    };

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.main.app.fragment.desktop.DesktopMainFragmentView$a */
    public interface AbstractC44269a {
        /* renamed from: a */
        void mo157346a(Context context);

        /* renamed from: a */
        void mo157347a(Context context, int[] iArr);

        /* renamed from: a */
        void mo157348a(C44274f.AbstractC44277b bVar);
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: a */
    public Fragment mo157305a() {
        return null;
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: a */
    public void mo157306a(long j) {
    }

    /* renamed from: a */
    public void setViewDelegate(C44274f.AbstractC44277b.AbstractC44278a aVar) {
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: a */
    public void mo157312a(String str, String str2) {
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: a */
    public void mo157313a(List<TenantInfo> list) {
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: b */
    public void mo157318b(boolean z) {
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: c */
    public void mo157320c(boolean z) {
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: d */
    public void mo157321d(boolean z) {
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: e */
    public void mo157322e(boolean z) {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: c */
    public void mo157319c() {
        m175544r();
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: a */
    public void mo157314a(boolean z) {
        String e = this.f112256b.mo157465e();
        for (AbstractC44552i iVar : this.f112256b.mo157462d()) {
            if (iVar.mo31321l() != null) {
                iVar.mo31321l().mo31324a(e, "");
            }
        }
        this.f112256b.mo157468h("");
        this.f112256b.mo157457b(this.f112260f, null, null);
        m175543q();
        m175542p();
        for (AbstractC44552i iVar2 : this.f112256b.mo157462d()) {
            boolean z2 = iVar2 instanceof AbstractC44552i.AbstractC44556d;
            if (this.f112256b.mo157463d(iVar2.mo31311b())) {
                iVar2.mo31323n();
            }
            if (z2) {
                ((AbstractC44552i.AbstractC44556d) iVar2).mo103432q();
            }
        }
        String b = this.f112256b.mo157461c().mo31311b();
        mo157311a(b, (Bundle) null);
        AbstractC44552i e2 = this.f112256b.mo157464e(e);
        if (!(e2 == null || e2.mo31321l() == null)) {
            e2.mo31321l().mo31324a("", b);
        }
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: a */
    public boolean mo157315a(KeyEvent keyEvent) {
        return C36580a.m144317a().mo134972a(keyEvent, new C36580a.AbstractC36583b() {
            /* class com.ss.android.lark.main.app.fragment.desktop.DesktopMainFragmentView.C442593 */

            @Override // com.ss.android.lark.desktopmode.utils.p1796b.C36580a.AbstractC36583b
            /* renamed from: b */
            public /* synthetic */ boolean mo102793b() {
                return C36580a.AbstractC36583b.CC.$default$b(this);
            }

            @Override // com.ss.android.lark.desktopmode.utils.p1796b.C36580a.AbstractC36583b
            /* renamed from: b */
            public /* synthetic */ boolean mo102794b(int i) {
                return C36580a.AbstractC36583b.CC.$default$b(this, i);
            }

            @Override // com.ss.android.lark.desktopmode.utils.p1796b.C36580a.AbstractC36583b
            /* renamed from: c */
            public /* synthetic */ boolean mo102795c() {
                return C36580a.AbstractC36583b.CC.$default$c(this);
            }

            @Override // com.ss.android.lark.desktopmode.utils.p1796b.C36580a.AbstractC36583b
            /* renamed from: c */
            public /* synthetic */ boolean mo102796c(int i) {
                return C36580a.AbstractC36583b.CC.$default$c(this, i);
            }

            @Override // com.ss.android.lark.desktopmode.utils.p1796b.C36580a.AbstractC36583b
            /* renamed from: d */
            public /* synthetic */ boolean mo102797d() {
                return C36580a.AbstractC36583b.CC.$default$d(this);
            }

            @Override // com.ss.android.lark.desktopmode.utils.p1796b.C36580a.AbstractC36583b
            /* renamed from: d */
            public /* synthetic */ boolean mo102798d(int i) {
                return C36580a.AbstractC36583b.CC.$default$d(this, i);
            }

            @Override // com.ss.android.lark.desktopmode.utils.p1796b.C36580a.AbstractC36583b
            /* renamed from: e */
            public /* synthetic */ boolean mo102799e(int i) {
                return C36580a.AbstractC36583b.CC.$default$e(this, i);
            }

            @Override // com.ss.android.lark.desktopmode.utils.p1796b.C36580a.AbstractC36583b
            /* renamed from: f */
            public /* synthetic */ boolean mo102800f(int i) {
                return C36580a.AbstractC36583b.CC.$default$f(this, i);
            }

            @Override // com.ss.android.lark.desktopmode.utils.p1796b.C36580a.AbstractC36583b
            /* renamed from: a */
            public boolean mo102791a() {
                if (!DesktopMainFragmentView.this.mDrawerLayout.mo4946g(8388613)) {
                    return false;
                }
                C36519d.m144080a().mo134822d();
                return true;
            }

            @Override // com.ss.android.lark.desktopmode.utils.p1796b.C36580a.AbstractC36583b
            /* renamed from: a */
            public boolean mo102792a(int i) {
                if (i != 39) {
                    return false;
                }
                UICallbackExecutor.executeDelayed(new Runnable() {
                    /* class com.ss.android.lark.main.app.fragment.desktop.DesktopMainFragmentView.C442593.RunnableC442601 */

                    public void run() {
                        DesktopMainFragmentView.this.f112257c.mo157346a(DesktopMainFragmentView.this.f112260f);
                    }
                }, 50);
                return true;
            }
        });
    }

    /* renamed from: k */
    private void m175537k() {
        MainViewContainer mainViewContainer = this.mLeftDrawer;
        if (mainViewContainer != null) {
            mainViewContainer.mo157768f();
        }
    }

    /* renamed from: m */
    private void m175539m() {
        MainAvatar mainAvatar = this.mMainAvatar;
        if (mainAvatar != null) {
            mainAvatar.mo157824b();
        }
    }

    /* renamed from: g */
    private void m175533g() {
        C44134a.m174959a().mo133182B().mo133362a();
    }

    /* renamed from: n */
    private void m175540n() {
        this.mTenantSwitcher.mo157845a();
        this.mTenantSwitcher.mo157846a(this.f112266l);
    }

    /* renamed from: o */
    private void m175541o() {
        this.mTenantSwitcher.mo157848b(this.f112266l);
        this.mTenantSwitcher.mo157847b();
    }

    /* renamed from: f */
    private void m175532f() {
        C44282j jVar = new C44282j(this.f112260f, this.f112256b);
        this.f112262h = jVar;
        jVar.mo157366a(new C44282j.AbstractC44283a() {
            /* class com.ss.android.lark.main.app.fragment.desktop.DesktopMainFragmentView.C442657 */

            @Override // com.ss.android.lark.main.app.fragment.C44282j.AbstractC44283a
            /* renamed from: a */
            public void mo157342a(List<String> list, int i) {
                for (String str : list) {
                    Log.m165389i("MainModule_DesktopMainFragmentView", "trim pages: " + str);
                    C36512a.m144041a().mo134778d(str);
                }
            }

            @Override // com.ss.android.lark.main.app.fragment.C44282j.AbstractC44283a
            /* renamed from: a */
            public void mo157341a(final String str, int i) {
                Log.m165389i("MainModule_DesktopMainFragmentView", "trim level: " + i);
                if (i >= 80) {
                    if (!DesktopMainFragmentView.this.f112256b.mo157463d(DesktopMainFragmentView.this.f112259e.mo133299a())) {
                        return;
                    }
                    if (str.equals(DesktopMainFragmentView.this.f112259e.mo133299a())) {
                        C36512a.m144041a().mo134776c(DesktopMainFragmentView.this.f112256b.mo157461c().mo31311b());
                        UICallbackExecutor.executeDelayed(new Runnable() {
                            /* class com.ss.android.lark.main.app.fragment.desktop.DesktopMainFragmentView.C442657.RunnableC442661 */

                            public void run() {
                                DesktopMainFragmentView.this.mo157326a(str);
                            }
                        }, 200);
                        return;
                    }
                    DesktopMainFragmentView desktopMainFragmentView = DesktopMainFragmentView.this;
                    desktopMainFragmentView.mo157326a(desktopMainFragmentView.f112259e.mo133299a());
                } else if (i >= 60 && DesktopMainFragmentView.this.f112256b.mo157463d(DesktopMainFragmentView.this.f112259e.mo133299a())) {
                    C44134a.m174959a().mo133202V().mo133300a(DesktopMainFragmentView.this.f112256b.mo157464e(DesktopMainFragmentView.this.f112259e.mo133299a()), str.equals(DesktopMainFragmentView.this.f112259e.mo133299a()));
                }
            }
        });
    }

    /* renamed from: h */
    private void m175534h() {
        m175531c("initTab");
        m175542p();
        m175533g();
        m175538l();
        m175540n();
        m175536j();
        m175531c("initViewPager");
        m175533g();
        m175535i();
    }

    /* renamed from: i */
    private void m175535i() {
        if (this.mDingDialogContainer != null) {
            this.mDingDialogContainer.setLayoutTransition(C44279g.m175651a(0, -UIHelper.dp2px(200.0f), LocationRequest.PRIORITY_INDOOR));
        }
    }

    /* renamed from: j */
    private void m175536j() {
        this.mLeftDrawer.mo157767e();
        this.mLeftDrawer.setScrimColor(C25633a.m91707a(this.f112260f.getResources().getColor(R.color.lkui_N900), 0.3f));
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: b */
    public AbstractC44552i mo157316b() {
        return this.f112256b.mo157466f(this.f112256b.mo157465e());
    }

    /* renamed from: d */
    public int[] mo157329d() {
        return new int[]{UIHelper.dp2px(60.0f), UIHelper.dp2px(26.0f)};
    }

    /* renamed from: q */
    private void m175543q() {
        for (AbstractC44552i iVar : this.f112256b.mo157462d()) {
            C44373s.m176069a().mo157633a(iVar.mo31311b(), (Object) null);
        }
        this.mMainTab.mo157476b();
        DesktopNavigationTab aVar = this.f112261g;
        if (aVar != null) {
            aVar.mo157540b();
        }
    }

    /* renamed from: r */
    private void m175544r() {
        List<AbstractC44552i> d = this.f112256b.mo157462d();
        if (!(d == null || d.isEmpty())) {
            for (AbstractC44552i iVar : d) {
                if (iVar instanceof AbstractC44552i.AbstractC44556d) {
                    ((AbstractC44552i.AbstractC44556d) iVar).mo103432q();
                }
            }
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C44325i.m175831a().mo157444b(this.f112265k);
        C44134a.m174959a().mo133233b(this);
        this.f112260f = null;
        m175537k();
        m175543q();
        m175541o();
        m175539m();
        this.f112256b.mo157458b();
    }

    /* renamed from: l */
    private void m175538l() {
        this.mMainAvatar.mo157822a();
        this.mMainAvatar.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.main.app.fragment.desktop.DesktopMainFragmentView.View$OnClickListenerC442678 */

            public void onClick(View view) {
                DesktopMainFragmentView.this.f112257c.mo157347a(DesktopMainFragmentView.this.f112260f, DesktopMainFragmentView.this.mo157329d());
            }
        });
        List<C44487b> a = C44488c.m176497a(this.f112264j.mo133395a());
        if (!CollectionUtils.isEmpty(a)) {
            for (C44487b bVar : a) {
                if (bVar.mo157911d()) {
                    this.mMainAvatar.mo157823a(bVar.mo157914g(), bVar.mo157910c());
                    return;
                }
            }
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m175531c("create");
        if (this.f112257c != null) {
            m175531c("injectView");
            this.f112257c.mo157348a(this);
            m175533g();
            this.mLeftDrawer.setiMainViewController(this);
            C36512a.m144041a().mo134764a(this.f112267m, this.f112268n);
            m175531c("tab_init");
            this.f112256b.mo157452a(this.f112260f, this.mLeftDrawer, null);
            m175533g();
            m175531c("init_view");
            m175534h();
            m175533g();
            mo157311a(this.f112256b.mo157461c().mo31311b(), this.f112263i);
            this.f112263i = null;
        }
        C44325i.m175831a().mo157440a(this.f112265k);
        C44134a.m174959a().mo133211a(this);
        m175533g();
    }

    /* renamed from: e */
    public void mo157330e() {
        FragmentActivity fragmentActivity = this.f112260f;
        if (!(fragmentActivity == null || fragmentActivity.isFinishing())) {
            this.f112261g = new DesktopNavigationTab(this.f112260f);
            for (AbstractC44552i iVar : this.f112256b.mo157462d()) {
                if (this.f112256b.mo157469i(iVar.mo31311b()) != TabType.Main) {
                    this.f112261g.mo157538a(iVar.mo31311b(), iVar.mo31319j());
                    C44373s.m176069a().mo157633a(iVar.mo31311b(), iVar.mo31319j());
                }
            }
            this.f112261g.mo157537a(this.mMainTab.getOnTabItemClickListener());
            if (!this.f112261g.mo157539a()) {
                this.mMainTab.mo157475a(false);
                return;
            }
            this.mMainTab.mo157475a(true);
            this.mMainTab.setOnDesktopNavIconClickListener(new OnSingleClickListener() {
                /* class com.ss.android.lark.main.app.fragment.desktop.DesktopMainFragmentView.C442582 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    DesktopMainFragmentView.this.f112261g.mo157536a(view);
                    MainHitPointHelper.m176667a("click");
                }
            });
        }
    }

    /* renamed from: p */
    private void m175542p() {
        this.mMainTab.mo157473a();
        for (AbstractC44552i iVar : this.f112256b.mo157462d()) {
            if (iVar.mo31312c() != null) {
                m175531c("tab_" + iVar.mo31311b());
                if (this.f112256b.mo157469i(iVar.mo31311b()) == TabType.Main) {
                    this.mMainTab.mo157474a(iVar.mo31311b(), iVar.mo31312c());
                    C44373s.m176069a().mo157633a(iVar.mo31311b(), iVar.mo31312c());
                }
                m175533g();
            }
        }
        this.mMainTab.setOnTabItemClickListener(new AbstractC44371p() {
            /* class com.ss.android.lark.main.app.fragment.desktop.DesktopMainFragmentView.C442689 */

            @Override // com.ss.android.lark.main.app.tab.AbstractC44371p
            /* renamed from: a */
            public void mo157345a(String str) {
                String e = DesktopMainFragmentView.this.f112256b.mo157465e();
                Log.m165389i("MainModule_DesktopMainFragmentView", "onItemClick type=" + e + " current = " + str);
                if (TextUtils.equals(e, str)) {
                    AbstractC44552i f = DesktopMainFragmentView.this.f112256b.mo157466f(str);
                    if (f != null && f.mo31321l() != null) {
                        f.mo31321l().mo31324a(e, str);
                        return;
                    }
                    return;
                }
                AbstractC44552i f2 = DesktopMainFragmentView.this.f112256b.mo157466f(str);
                if (!(f2 == null || f2.mo31321l() == null)) {
                    f2.mo31321l().mo31325b(e, str);
                }
                DesktopMainFragmentView.this.mo157327b(str, (Bundle) null);
            }
        });
        this.mMainTab.setOnTabItemDoubleTapListener(new AbstractC44372q() {
            /* class com.ss.android.lark.main.app.fragment.desktop.DesktopMainFragmentView.AnonymousClass10 */

            @Override // com.ss.android.lark.main.app.tab.AbstractC44372q
            /* renamed from: a */
            public void mo157335a(String str) {
                Log.m165389i("MainModule_DesktopMainFragmentView", "onItemDoubleClick type=" + str);
                AbstractC44552i f = DesktopMainFragmentView.this.f112256b.mo157466f(str);
                if (f != null && f.mo31322m() != null) {
                    f.mo31322m().mo137782a();
                }
            }
        });
        this.mMainTab.postDelayed(new Runnable() {
            /* class com.ss.android.lark.main.app.fragment.desktop.DesktopMainFragmentView.AnonymousClass11 */

            public void run() {
                DesktopMainFragmentView.this.mo157330e();
            }
        }, 500);
    }

    /* renamed from: a */
    private void m175529a(int i) {
        MainViewContainer mainViewContainer = this.mLeftDrawer;
        if (mainViewContainer != null) {
            mainViewContainer.setDrawerLockMode(i);
        }
    }

    /* renamed from: b */
    private void m175530b(String str) {
        AbstractC44552i f = this.f112256b.mo157466f(str);
        if (f instanceof AbstractC44552i.AbstractC44555c) {
            ((AbstractC44552i.AbstractC44555c) f).mo103434s();
        }
    }

    /* renamed from: c */
    private void m175531c(String str) {
        C44134a.m174959a().mo133182B().mo133363a(str, null);
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: a */
    public void mo157307a(Bundle bundle) {
        this.f112263i = bundle;
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
        }
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

    /* renamed from: f */
    public void mo157331f(boolean z) {
        TenantSwitchLoadingView tenantSwitchLoadingView = new TenantSwitchLoadingView(this.f112260f);
        if (z) {
            mo157311a(this.f112256b.mo157461c().mo31311b(), (Bundle) null);
            tenantSwitchLoadingView.mo157819a();
            if (tenantSwitchLoadingView.getParent() == null) {
                this.mLeftDrawer.mo157762b("MainModule_DesktopMainFragmentView", tenantSwitchLoadingView);
                return;
            }
            return;
        }
        tenantSwitchLoadingView.mo157820b();
        this.mLeftDrawer.mo157765d("MainModule_DesktopMainFragmentView");
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
            Log.m165389i("MainModule_DesktopMainFragmentView", "onTrimMemory keepSize = " + i2);
            this.f112262h.mo157365a(i);
            this.f112262h.mo157368b(i2);
            this.f112262h.mo157364a();
        }
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: a */
    public void mo157310a(NetworkLevel networkLevel) {
        if (networkLevel == NetworkLevel.NET_UNAVAILABLE) {
            this.mNetWorkStatusView.setVisibility(0);
            this.mNetworkTV.setText(this.f112260f.getResources().getString(R.string.Lark_Legacy_NetConnectionError));
        } else if (networkLevel == NetworkLevel.SERVICE_UNAVAILABLE) {
            this.mNetWorkStatusView.setVisibility(0);
            this.mNetworkTV.setText(this.f112260f.getResources().getString(R.string.Lark_Legacy_ChatTableHeaderServiceUnavailable));
        } else {
            this.mNetWorkStatusView.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo157326a(String str) {
        this.f112256b.mo157459b(str);
        m175530b(str);
        C36512a.m144041a().mo134778d(str);
    }

    /* renamed from: b */
    public void mo157327b(String str, Bundle bundle) {
        AbstractC44552i f = this.f112256b.mo157466f(str);
        C36512a.m144041a().mo134774b(f.mo31311b());
        if (f instanceof AbstractC44552i.AbstractC44555c) {
            this.f112262h.mo157367a((AbstractC44552i.AbstractC44555c) f);
        }
        if (bundle != null) {
            f.mo31309a(bundle);
        }
    }

    /* renamed from: b */
    public void mo157328b(String str, String str2) {
        AbstractC44552i f = this.f112256b.mo157466f(str2);
        if (f != null) {
            if (!this.f112256b.mo157463d(f.mo31311b())) {
                this.f112256b.mo157454a(f);
            }
            this.mLeftDrawer.mo157760a(f.mo31311b());
            this.mLeftDrawer.mo4944f(8388611);
            m175529a(f.mo31317h());
            for (int i = 0; i < this.f112256b.mo157462d().size(); i++) {
                AbstractC44552i iVar = this.f112256b.mo157462d().get(i);
                if (!(iVar == null || !this.f112256b.mo157463d(iVar.mo31311b()) || iVar.mo31321l() == null)) {
                    iVar.mo31321l().mo31324a(str, str2);
                }
            }
        }
    }

    @Override // com.ss.android.lark.main.app.fragment.C44274f.AbstractC44277b
    /* renamed from: a */
    public void mo157311a(String str, Bundle bundle) {
        if (str == null) {
            str = "";
        }
        AbstractC44552i f = this.f112256b.mo157466f(str);
        if (f == null) {
            Log.m165397w("MainModule_DesktopMainFragmentView", "showTabFragment pageNotExist = " + str);
            f = this.f112256b.mo157461c();
        }
        this.f112256b.mo157468h(f.mo31311b());
        mo157327b(f.mo31311b(), bundle);
    }

    public DesktopMainFragmentView(AbstractC44269a aVar, FragmentActivity fragmentActivity, FragmentManager fragmentManager) {
        this.f112260f = fragmentActivity;
        this.f112257c = aVar;
        this.f112258d = C44134a.m174959a().mo133240c();
        this.f112264j = C44134a.m174959a().mo133188H();
        this.f112259e = C44134a.m174959a().mo133202V();
        this.f112255a = fragmentManager;
        m175532f();
    }
}
