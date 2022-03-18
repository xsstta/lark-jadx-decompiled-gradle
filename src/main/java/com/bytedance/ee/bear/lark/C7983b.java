package com.bytedance.ee.bear.lark;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.banner.p248c.AbstractC4337c;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.contract.leanmode.AbstractC5197b;
import com.bytedance.ee.bear.contract.p278b.AbstractC5115a;
import com.bytedance.ee.bear.drive.services.AbstractC7184l;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.lark.p414b.AbstractC7993f;
import com.bytedance.ee.bear.lark.p414b.C8011t;
import com.bytedance.ee.bear.lark.p415c.AbstractC8020e;
import com.bytedance.ee.bear.lark.p415c.C8015a;
import com.bytedance.ee.bear.lark.p415c.C8017c;
import com.bytedance.ee.bear.lark.p415c.C8022g;
import com.bytedance.ee.bear.lark.p416d.C8028a;
import com.bytedance.ee.bear.lark.p418f.C8039a;
import com.bytedance.ee.bear.list.AbstractC8651p;
import com.bytedance.ee.bear.list.C8140a;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.C8674q;
import com.bytedance.ee.bear.list.C8677r;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.config.SpaceFeatureGatingV2;
import com.bytedance.ee.bear.list.create.C8238f;
import com.bytedance.ee.bear.list.create.C8254n;
import com.bytedance.ee.bear.list.create.SelectCreationMenuConfig;
import com.bytedance.ee.bear.list.homepage.AbstractC8459a;
import com.bytedance.ee.bear.list.homepage.AbstractC8463b;
import com.bytedance.ee.bear.list.homepage.AbstractC8474e;
import com.bytedance.ee.bear.list.homepage.AbstractC8476f;
import com.bytedance.ee.bear.list.homepage.navigation.C8484e;
import com.bytedance.ee.bear.list.homepage.tab.C8491a;
import com.bytedance.ee.bear.list.homepage.tab.C8492b;
import com.bytedance.ee.bear.list.homepage.tab.C8493c;
import com.bytedance.ee.bear.list.homepage.tab.HomeSubMenuView;
import com.bytedance.ee.bear.list.homepage.tab.HomeTabEnum;
import com.bytedance.ee.bear.list.homepage.title.AbstractC8505c;
import com.bytedance.ee.bear.list.homepage.title.C8507e;
import com.bytedance.ee.bear.list.homepage.title.C8508f;
import com.bytedance.ee.bear.list.p422a.C8143b;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.list.p427e.C8288c;
import com.bytedance.ee.bear.list.p427e.p428a.C8282d;
import com.bytedance.ee.bear.list.preload.C8664a;
import com.bytedance.ee.bear.list.preload.C8672e;
import com.bytedance.ee.bear.list.recent.RecentSort;
import com.bytedance.ee.bear.list.sort.C8777j;
import com.bytedance.ee.bear.list.sort.C8786n;
import com.bytedance.ee.bear.list.sort.FilterType;
import com.bytedance.ee.bear.templates.TemplateV4;
import com.bytedance.ee.bear.templates.recommend.NewRecommendTemplateViewModel;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.button.CommonCreateButton;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.ITitleInfo;
import com.ss.android.lark.process_statistics.C52238a;
import com.ss.android.lark.process_statistics.IProcessLauchReporter;
import com.ss.android.lark.util.share_preference.C57744a;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.functions.Function;
import java.util.List;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.C69619a;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.lark.b */
public class C7983b extends C7667e implements AbstractC8027d, AbstractC8459a, AbstractC8463b, AbstractC8474e.AbstractC8475a, AbstractC8476f, AbstractC8651p.AbstractC8660i, C8664a.AbstractC8665a {

    /* renamed from: a */
    public ViewPager f21455a;

    /* renamed from: b */
    public HomeSubMenuView f21456b;

    /* renamed from: c */
    public int f21457c;

    /* renamed from: d */
    private AbstractC8505c f21458d;

    /* renamed from: e */
    private ITitleController f21459e;

    /* renamed from: f */
    private C8508f f21460f;

    /* renamed from: g */
    private View.OnClickListener f21461g;

    /* renamed from: h */
    private boolean f21462h;

    /* renamed from: i */
    private AbstractC8020e f21463i;

    /* renamed from: j */
    private C8282d f21464j;

    /* renamed from: k */
    private CommonCreateButton f21465k;

    /* renamed from: l */
    private C8491a f21466l;

    /* renamed from: m */
    private SmartRefreshLayout f21467m;

    /* renamed from: n */
    private C8786n f21468n;

    /* renamed from: o */
    private C8254n f21469o;

    /* renamed from: p */
    private NewRecommendTemplateViewModel f21470p;

    /* renamed from: q */
    private FolderSortStrategy f21471q;

    /* renamed from: r */
    private ConnectionService.NetworkState f21472r;

    /* renamed from: s */
    private final C68289a f21473s = new C68289a();

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e.AbstractC8475a
    /* renamed from: j */
    public void mo30971j() {
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8463b
    public void y_() {
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8476f
    /* renamed from: c */
    public AbstractC8505c mo30786c() {
        return this.f21458d;
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8459a
    /* renamed from: g */
    public SmartRefreshLayout mo30968g() {
        return this.f21467m;
    }

    @Override // com.bytedance.ee.bear.lark.AbstractC8027d
    /* renamed from: a */
    public void mo30962a(ITitleController iTitleController, View.OnClickListener onClickListener) {
        this.f21459e = iTitleController;
        this.f21461g = new View.OnClickListener(onClickListener) {
            /* class com.bytedance.ee.bear.lark.$$Lambda$b$kV0lEk_3CuzvWJGDw3nFokSaN8 */
            public final /* synthetic */ View.OnClickListener f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C7983b.this.m31881a((C7983b) this.f$1, (View.OnClickListener) view);
            }
        };
    }

    /* renamed from: a */
    public void mo30960a(AbstractC4337c cVar) {
        C13479a.m54764b("DocTabFragment", "UserNavigationBannerListener... begin guide");
        C8288c.m34111a(getActivity());
        C8282d dVar = new C8282d(getActivity(), this, ar.m20936a(), ((C8022g) this.f21463i.mo31035a(C8022g.class)).mo31039e(), this.f21465k, this);
        this.f21464j = dVar;
        C8288c.m34113a(dVar);
        C8288c.m34110a();
        cVar.getClass();
        C8288c.m34114a(new C8288c.AbstractC8291b() {
            /* class com.bytedance.ee.bear.lark.$$Lambda$1ArhNn24YzLMIl6Mxrqq9OhHGI */

            @Override // com.bytedance.ee.bear.list.p427e.C8288c.AbstractC8291b
            public final void onAllGuideFinish() {
                AbstractC4337c.this.mo16912a();
            }
        });
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8651p.AbstractC8660i
    /* renamed from: a */
    public void mo30963a(boolean z) {
        this.f21456b.mo33137a(z);
        C8292f.f22432b = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo30961a(FolderSortStrategy folderSortStrategy) {
        C13479a.m54764b("DocTabFragment", "onFilterChanged()...");
        this.f21471q = folderSortStrategy;
        this.f21456b.mo33157b(m31889b(folderSortStrategy));
    }

    @Override // com.bytedance.ee.bear.lark.AbstractC8027d
    /* renamed from: a */
    public ITitleInfo mo30958a() {
        return this.f21460f;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        mo30972k();
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8459a
    /* renamed from: e */
    public String mo30967e() {
        if (this.f21457c == 1) {
            return "quick_access";
        }
        return "recent";
    }

    /* renamed from: k */
    public void mo30972k() {
        ListAnalysis.m32529b("ccm_space_home_page_view", "home", mo30967e(), mo30967e());
    }

    @Override // com.bytedance.ee.bear.list.preload.C8664a.AbstractC8665a
    public void onFirstContentDraw() {
        m31907t();
        m31908u();
        m31909v();
        m31910w();
    }

    /* renamed from: o */
    private void m31902o() {
        C8786n nVar = this.f21468n;
        if (nVar != null) {
            nVar.getSortStrategyLiveData().mo5922a(this);
            this.f21468n = null;
        }
        mo30961a((FolderSortStrategy) null);
        mo30970i();
    }

    /* renamed from: p */
    private void m31903p() {
        C8254n nVar = this.f21469o;
        if (nVar != null) {
            nVar.getSelectedCreationTypeLiveData().mo5922a(this);
            this.f21469o = null;
        }
        m31908u();
    }

    /* renamed from: q */
    private void m31904q() {
        NewRecommendTemplateViewModel fVar = this.f21470p;
        if (fVar != null) {
            fVar.m269994getSelectedTemplate().mo5922a(this);
            this.f21470p = null;
        }
        m31909v();
    }

    /* renamed from: s */
    private void m31906s() {
        C13479a.m54764b("DocTabFragment", "notifyFirstFrameDraw()...");
        final View view = getView();
        if (view != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                /* class com.bytedance.ee.bear.lark.C7983b.ViewTreeObserver$OnPreDrawListenerC79852 */

                public boolean onPreDraw() {
                    ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31520d().mo33056b("space");
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    return true;
                }
            });
        }
    }

    /* renamed from: t */
    private void m31907t() {
        ConnectionService d = C5084ad.m20847d();
        if (d != null) {
            d.mo20037a().mo5923a(getViewLifecycleOwner(), new AbstractC1178x() {
                /* class com.bytedance.ee.bear.lark.$$Lambda$b$L3X8fWpwEeGPzc9Kl3GvRlQrfN8 */

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    C7983b.this.m31884a((C7983b) ((ConnectionService.NetworkState) obj));
                }
            });
        }
    }

    /* renamed from: d */
    public void mo30966d() {
        C13479a.m54764b("DocTabFragment", "closePopupMenu()...");
        C8238f r = m31905r();
        if (r != null) {
            C13479a.m54764b("DocTabFragment", "creationMenuPanel is exist");
            r.mo5513b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        C13479a.m54764b("DocTabFragment", "onStop()...");
        C8143b.m32605a().mo31467b();
    }

    public C7983b() {
        C13479a.m54764b("DocTabFragment", "DocTabFragment()...");
        C8292f.f22431a = true;
        C52238a aVar = new C52238a();
        aVar.mo178816a(IProcessLauchReporter.LaunchReason.PRELOAD_DOC_TAB);
        aVar.mo178815a(IProcessLauchReporter.BusinessType.DOC, System.currentTimeMillis());
        m31901l();
    }

    /* renamed from: l */
    private void m31901l() {
        C13479a.m54764b("DocTabFragment", "preloadAsyncJob()...");
        this.f21473s.mo237937a(AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238001b($$Lambda$b$6DbR8f5yQ0dE2EVj6iL9AUfZwKo.INSTANCE, $$Lambda$b$o3OG1nK79cC8RLuLPnzGBUEOD4Y.INSTANCE));
    }

    /* renamed from: r */
    private C8238f m31905r() {
        if (getActivity() == null) {
            return null;
        }
        Fragment findFragmentByTag = getActivity().getSupportFragmentManager().findFragmentByTag("CreationMenuPanel");
        if (!(findFragmentByTag instanceof C8238f)) {
            return null;
        }
        C13479a.m54764b("DocTabFragment", "getCreationMenuPanel()...success");
        return (C8238f) findFragmentByTag;
    }

    /* renamed from: u */
    private void m31908u() {
        if (getActivity() == null) {
            C13479a.m54758a("DocTabFragment", "observeCreatePopupMenu()...activity is null");
            return;
        }
        if (this.f21469o == null) {
            this.f21469o = (C8254n) aj.m5366a(getActivity()).mo6005a(C8254n.class);
        }
        this.f21469o.getSelectedCreationTypeLiveData().mo5923a(getViewLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.lark.$$Lambda$b$pz11i08SerAbN9XqFrrSLriz534 */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C7983b.this.m31887a((C7983b) ((Integer) obj));
            }
        });
    }

    /* renamed from: v */
    private void m31909v() {
        if (getActivity() == null) {
            C13479a.m54758a("DocTabFragment", "observeNewTemplateSelect()...activity is null");
            return;
        }
        if (this.f21470p == null) {
            this.f21470p = (NewRecommendTemplateViewModel) aj.m5366a(getActivity()).mo6005a(NewRecommendTemplateViewModel.class);
        }
        this.f21470p.m269994getSelectedTemplate().mo5923a(getViewLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.lark.$$Lambda$b$nE9njUoqPWqfsVWSQaX2FSvkIg */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C7983b.this.m31885a((C7983b) ((TemplateV4) obj));
            }
        });
    }

    /* renamed from: w */
    private void m31910w() {
        C13479a.m54764b("DocTabFragment", "pullUser()...");
        this.f21473s.mo237937a(AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48480d()).mo237998a((AbstractC68322n) $$Lambda$b$jNZDugfQgfF2dm1rqBseTnXryDI.INSTANCE).mo238014c($$Lambda$b$XgU4dqVxEBpAXO5a2cHE0dNl2Bo.INSTANCE).mo238001b($$Lambda$b$68gxRYlM8QYGkqO8lhwwgpnk7UM.INSTANCE, $$Lambda$b$0wMSU7OgUuvcZQDlnayuBg24fPs.INSTANCE));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo30970i() {
        if (getActivity() == null) {
            C13479a.m54758a("DocTabFragment", "observeSortAndFilter()...activity is null");
            return;
        }
        if (this.f21468n == null) {
            this.f21468n = (C8786n) aj.m5366a(getActivity()).mo6005a(C8786n.class);
        }
        this.f21468n.getSortStrategyLiveData().mo5923a(getViewLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.lark.$$Lambda$b$wQe2MNbi7kx1YRjOqPX7iZMVc4 */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C7983b.this.m31895c((C7983b) ((FolderSortStrategy) obj));
            }
        });
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C8674q.m36243f().mo33649b(this);
        C8674q.m36243f().mo33652e();
        if (!this.f21473s.isDisposed()) {
            this.f21473s.mo237935a();
        }
        C8143b.m32605a().mo31467b();
        C8672e.m36232a(getContext()).mo33680c();
        C13479a.m54764b("DocTabFragment", "onDestroy()...");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        C13479a.m54764b("DocTabFragment", "onDestroyView()...");
        this.f21462h = false;
        C8288c.m34117c();
        this.f21464j = null;
        super.onDestroyView();
        C8012c.m31983a().mo31025b();
        ((AbstractC5115a) KoinJavaComponent.m268610a(AbstractC5115a.class)).mo20220a("ccm_space_home");
        C8664a.m36219b(this);
        AbstractC8020e eVar = this.f21463i;
        if (eVar != null) {
            eVar.mo31033c();
            this.f21463i = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public boolean m31911x() {
        boolean z;
        boolean z2 = true;
        if (getActivity() != null) {
            Integer b = ((C8254n) aj.m5366a(getActivity()).mo6005a(C8254n.class)).getSelectCreationMenuStateLiveData().mo5927b();
            Integer b2 = ((C8786n) aj.m5366a(getActivity()).mo6005a(C8786n.class)).getSortAndFilterMenuStateLiveData().mo5927b();
            if ((b == null || b.intValue() != 1) && (b2 == null || b2.intValue() != 1)) {
                z = false;
            } else {
                z = true;
            }
            if (!getUserVisibleHint() || z) {
                z2 = false;
            }
        }
        C13479a.m54764b("DocTabFragment", "canShowMagicPanel = " + z2);
        return z2;
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e.AbstractC8475a
    /* renamed from: h */
    public void mo30969h() {
        ConnectionService.NetworkState networkState = this.f21472r;
        if (networkState == null || !networkState.mo20041b()) {
            Toast.showFailureText(getContext(), getString(R.string.Doc_Facade_Offline), 0);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("key_module", "home");
            bundle.putString("key_sub_module", mo30967e());
            bundle.putString("key_token", "recent");
            bundle.putBoolean("key_sort_asc_enable", false);
            bundle.putInt("key_sort_title_res", R.string.Doc_List_Filter_Recent_Activity);
            bundle.putParcelable("key_sort_strategy", this.f21471q);
            C8140a.m32491a(getActivity(), C8777j.class, bundle);
        }
        ListAnalysis.m32517a("home", mo30967e(), "filter", "ccm_space_header_filter_view", mo30967e());
    }

    @Override // com.bytedance.ee.bear.lark.AbstractC8027d
    /* renamed from: b */
    public void mo30964b() {
        if (!this.f21462h || getView() == null) {
            C13479a.m54758a("DocTabFragment", "reload, but fragment hasn't inited");
            return;
        }
        m31891b(getView());
        m31902o();
        m31903p();
        m31904q();
        C8677r.m36258a().mo33683b();
        AbstractC8020e eVar = this.f21463i;
        if (eVar != null) {
            eVar.mo31034d();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m31885a(TemplateV4 templateV4) {
        mo30966d();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.lark.b$b */
    public class C7987b implements C8028a.AbstractC8031a {
        /* renamed from: a */
        private String m31931a(int i) {
            return i == 1 ? "quick_access" : "recent";
        }

        private C7987b() {
        }

        @Override // com.bytedance.ee.bear.lark.p416d.C8028a.AbstractC8031a
        /* renamed from: a */
        public void mo30976a(int i, C8493c cVar) {
            C13479a.m54764b("DocTabFragment", "onTabSelected()...index = " + i);
            if (C7983b.this.f21457c != i) {
                C7983b.this.f21455a.setCurrentItem(i);
                ListAnalysis.m32541h(C5234y.m21391b(), m31931a(i));
                ListAnalysis.m32517a("home", C7983b.this.mo30967e(), m31931a(i), "ccm_space_home_page_view", C7983b.this.mo30967e());
                C7983b.this.mo30972k();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ boolean m31897c(Boolean bool) throws Exception {
        return !TextUtils.isEmpty(C4511g.m18594d().mo17372v());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C13479a.m54764b("DocTabFragment", "onSaveInstanceState()...");
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.lark.b$a */
    public class C7986a implements ViewPager.OnPageChangeListener {

        /* renamed from: b */
        private final C8491a f21478b;

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        /* renamed from: a */
        private boolean m31930a(int i) {
            C8493c a = this.f21478b.mo33168a(i);
            if (a == null || a.mo33170a() != HomeTabEnum.PIN.id) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        private void m31929a(boolean z) {
            C13479a.m54764b("DocTabFragment", "updateHomeSubMenuView()...isPin = " + z);
            if (z) {
                C7983b.this.f21456b.mo33138b();
            } else {
                C7983b.this.f21456b.mo33158c();
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            C13479a.m54764b("DocTabFragment", "onPageSelected()...position = " + i);
            if (i < 0 || i >= this.f21478b.getCount()) {
                C13479a.m54764b("DocTabFragment", "illegal position");
                return;
            }
            C7983b.this.f21457c = i;
            m31929a(m31930a(i));
        }

        public C7986a(C8491a aVar) {
            this.f21478b = aVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ AbstractC70020b m31890b(Boolean bool) throws Exception {
        return ((an) KoinJavaComponent.m268610a(an.class)).mo16396a(C4511g.m18594d().mo17372v());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m31895c(FolderSortStrategy folderSortStrategy) {
        if (folderSortStrategy != null && TextUtils.equals("recent", folderSortStrategy.mo31545a()) && !folderSortStrategy.equals(this.f21471q)) {
            mo30961a(folderSortStrategy);
        }
    }

    /* renamed from: a */
    private void m31883a(ViewGroup viewGroup) {
        C13479a.m54764b("DocTabFragment", "initView()...rootView = " + viewGroup);
        m31891b((View) viewGroup);
        m31894c(viewGroup);
        m31898d(viewGroup);
        m31882a((View) viewGroup);
        m31892b(viewGroup);
        mo30970i();
        C8664a.m36218a(this);
        this.f21462h = true;
        C8143b.m32605a().mo31462a("doc_tab_fragment_init");
    }

    /* renamed from: b */
    private void m31891b(View view) {
        C8508f fVar = new C8508f();
        this.f21460f = fVar;
        fVar.mo33254a(true);
        this.f21458d = new C8507e(view.getContext(), this.f21459e, this.f21460f, this.f21461g);
        ITitleController iTitleController = this.f21459e;
        if (iTitleController != null) {
            iTitleController.mo99192a(true);
        }
        this.f21458d.setSearchViewClickListener(this.f21461g);
        this.f21458d.mo33175a();
        this.f21458d.setTitle(getString(R.string.Doc_List_Space));
    }

    /* renamed from: c */
    private void m31894c(View view) {
        C13479a.m54764b("DocTabFragment", "initHeader()...");
        if (this.f21463i == null) {
            C13479a.m54764b("DocTabFragment", "mHeaderManager is null, init");
            C8017c cVar = new C8017c(this);
            this.f21463i = cVar;
            cVar.mo31036a((ViewGroup) view.findViewById(R.id.list_header_container));
        }
    }

    /* renamed from: d */
    private void m31898d(View view) {
        C13479a.m54764b("DocTabFragment", "initRefreshLayout()...");
        this.f21467m = (SmartRefreshLayout) view.findViewById(R.id.list_refresh_layout);
        C8015a aVar = (C8015a) this.f21463i.mo31035a(C8015a.class);
        if (aVar == null) {
            C13479a.m54758a("DocTabFragment", "initRefreshLayout()...digitalRefreshHeader is null");
        } else {
            aVar.mo31028a(this.f21467m);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m31884a(ConnectionService.NetworkState networkState) {
        boolean z;
        C13479a.m54764b("DocTabFragment", "on network changed, state = " + networkState);
        this.f21472r = networkState;
        if (networkState == null || !networkState.mo20041b()) {
            z = true;
        } else {
            z = false;
        }
        HomeSubMenuView homeSubMenuView = this.f21456b;
        if (homeSubMenuView != null) {
            homeSubMenuView.setOffline(z);
        }
    }

    /* renamed from: b */
    private String m31889b(FolderSortStrategy folderSortStrategy) {
        String str = "";
        if (folderSortStrategy == null) {
            return str;
        }
        FilterType filterByType = FilterType.getFilterByType(folderSortStrategy.mo31554d(), folderSortStrategy.mo31560f(), folderSortStrategy.mo31561g());
        if (filterByType != FilterType.ALL) {
            str = getString(filterByType.getResId());
        }
        RecentSort sort = RecentSort.getSort(folderSortStrategy.mo31549b());
        if (sort == RecentSort.ALL) {
            return str;
        }
        if (!TextUtils.isEmpty(str)) {
            str = str + "、";
        }
        return str + getString(sort.getResId());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m31896c(Throwable th) throws Exception {
        C13479a.m54758a("DocTabFragment", "preloadAsyncJob()...throwable = " + th);
    }

    /* renamed from: a */
    private void m31882a(View view) {
        this.f21455a = (ViewPager) view.findViewById(R.id.list_home_viewpager);
        List<C8493c> a = new C8492b().mo33169a();
        C8491a aVar = new C8491a(getChildFragmentManager(), getContext(), a);
        this.f21466l = aVar;
        this.f21455a.setAdapter(aVar);
        this.f21455a.setCurrentItem(this.f21457c);
        this.f21455a.setOffscreenPageLimit(1);
        this.f21455a.addOnPageChangeListener(new C7986a(this.f21466l));
        HomeSubMenuView homeSubMenuView = (HomeSubMenuView) view.findViewById(R.id.home_sub_title_view);
        this.f21456b = homeSubMenuView;
        homeSubMenuView.setViewDelegate(this);
        MagicIndicator magicIndicator = this.f21456b.getMagicIndicator();
        C69619a aVar2 = new C69619a(getContext());
        aVar2.setAdapter(new C8028a(getContext(), magicIndicator, a, new C7987b()));
        magicIndicator.setNavigator(aVar2);
        mo30963a(C57744a.m224104a().getBoolean("is_grid", false));
        C8674q.m36243f().mo33642a(this);
    }

    /* renamed from: b */
    private void m31892b(ViewGroup viewGroup) {
        CommonCreateButton commonCreateButton = (CommonCreateButton) viewGroup.findViewById(R.id.common_create_button);
        this.f21465k = commonCreateButton;
        commonCreateButton.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.lark.C7983b.C79841 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C7983b.this.onMenuCreateClick(view);
            }
        });
        C7958a.m31810a(this.f21465k.getCreateButton(), C7958a.m31809a(0.1f, (int) R.color.lkui_N1000));
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8476f
    public void onMenuCreateClick(View view) {
        boolean z;
        C13479a.m54764b("DocTabFragment", "onMenuCreateClick()...");
        C8238f r = m31905r();
        if (r == null || r.v_() == null || !r.v_().isShowing()) {
            boolean z2 = ((AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class)).mo20801b().mo20777c().f14914a;
            boolean e = ((AbstractC7993f) KoinJavaComponent.m268610a(AbstractC7993f.class)).mo30993e();
            SelectCreationMenuConfig selectCreationMenuConfig = new SelectCreationMenuConfig();
            boolean z3 = true;
            SelectCreationMenuConfig h = selectCreationMenuConfig.mo32290g(true).mo32292h(C8292f.m34174b());
            if (!e || C4211a.m17514a().mo16536a("ccm.spacekit.bitable.enable", false)) {
                z = true;
            } else {
                z = false;
            }
            h.mo32294i(z).mo32296j(C4211a.m17514a().mo16538b("spacekit.mobile.docx_create_enable", false)).mo32298k(z2).mo32281c(true).mo32286e(true).mo32288f(true);
            Bundle bundle = new Bundle();
            bundle.putString("key_module", "home");
            bundle.putString("key_sub_module", mo30967e());
            bundle.putParcelable("key_config", selectCreationMenuConfig);
            if (view != null) {
                z3 = false;
            }
            bundle.putBoolean("key_is_from_empty", z3);
            bundle.putBoolean("key_folder_version", SpaceFeatureGatingV2.m32622a());
            C8238f a = C8238f.m33821a(getActivity(), bundle);
            C8282d dVar = this.f21464j;
            if (dVar != null) {
                dVar.mo32575a(a);
            }
            ListAnalysis.m32517a("home", mo30967e(), "create", "ccm_space_create_new_view", mo30967e());
            return;
        }
        C13479a.m54764b("DocTabFragment", "create menu is already showing");
        r.mo5513b();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        C13479a.m54764b("DocTabFragment", "  setUserVisibleHint  isVisibleToUser: " + z);
        if (!(C8011t.m31981a() == null || C8011t.m31981a().mo30998a() == null)) {
            ar.m20936a().mo41505a(AbstractC7184l.class, C11678b.m48482f()).mo238020d(new Function(z) {
                /* class com.bytedance.ee.bear.lark.$$Lambda$b$J2Qby3S0_u4rzBwO7uDe0Ck09zM */
                public final /* synthetic */ boolean f$0;

                {
                    this.f$0 = r1;
                }

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C7983b.m31880a(this.f$0, (AbstractC7184l) obj);
                }
            }).mo238001b($$Lambda$b$TPLNU9ClaNtJbI_mnnfQU44MccM.INSTANCE, $$Lambda$b$ElHdsKXugmhUmBzP1avpCIjacM.INSTANCE);
        }
        if (!this.f21462h) {
            C13479a.m54764b("DocTabFragment", "setUserVisibleHint: have not init so skip");
            return;
        }
        AbstractC8020e eVar = this.f21463i;
        if (eVar != null) {
            eVar.mo31029a(z);
        }
        if (z) {
            ListAnalysis.m32535e(C5234y.m21391b(), "applicationToMainShow");
            C8491a aVar = this.f21466l;
            if (aVar != null && aVar.mo33167a() != null) {
                this.f21466l.mo33167a().setUserVisibleHint(z);
                return;
            }
            return;
        }
        mo30966d();
        C8484e.f22910a = false;
        C8143b.m32605a().mo31467b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m31886a(Boolean bool) throws Exception {
        C13479a.m54764b("DocTabFragment", "pull user result = " + bool);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m31887a(Integer num) {
        C13479a.m54764b("DocTabFragment", "on select creation type = " + num);
        if (num != null) {
            mo30966d();
        }
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e.AbstractC8475a
    /* renamed from: b */
    public void mo30965b(boolean z) {
        C13479a.m54764b("DocTabFragment", "onClickGrid()...showGrid = " + z);
        mo30963a(z);
        C8674q.m36243f().mo33641a(C5234y.m21391b(), z, mo30967e());
        ListAnalysis.m32514a("home", mo30967e(), mo30967e());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m31888a(Throwable th) throws Exception {
        C13479a.m54758a("DocTabFragment", "pull user error = " + th);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m31906s();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m31880a(boolean z, AbstractC7184l lVar) throws Exception {
        lVar.setDocPageVisiable(z);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m31881a(View.OnClickListener onClickListener, View view) {
        if (onClickListener != null) {
            onClickListener.onClick(view);
            ListAnalysis.m32517a("home", mo30967e(), "search", "search_main_view", mo30967e());
        }
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8463b
    /* renamed from: a */
    public void mo30959a(int i, int i2) {
        AbstractC8505c cVar = this.f21458d;
        if (cVar != null) {
            cVar.mo33176a(i, i2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ListAnalysis.m32535e(C5234y.m21391b(), "applicationToMain");
        ((AbstractC5115a) KoinJavaComponent.m268610a(AbstractC5115a.class)).mo20221a("ccm_space_home", null, getContext(), new AbstractC5115a.AbstractC5116a() {
            /* class com.bytedance.ee.bear.lark.$$Lambda$b$bVYoNCc1a5iqj0xRNzTwPbYNBg */

            @Override // com.bytedance.ee.bear.contract.p278b.AbstractC5115a.AbstractC5116a
            public final boolean canShow() {
                return C7983b.this.m31911x();
            }
        });
        C8143b.m32605a().mo31470c("inflate_doc_tab_layout");
        ViewGroup b = C8039a.m32112a().mo31078b();
        if (b == null) {
            C13479a.m54764b("SpaceReport", "hasCache = false");
            b = C8012c.m31983a().mo31024a(getContext(), true);
        } else {
            C13479a.m54764b("DocTabFragment", "onCreateView()...hasCache = true");
        }
        C8143b.m32605a().mo31468b("inflate_doc_tab_layout");
        ListAnalysis.m32494a(C5234y.m21391b());
        m31883a(b);
        return b;
    }
}
