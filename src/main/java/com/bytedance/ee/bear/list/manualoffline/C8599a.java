package com.bytedance.ee.bear.list.manualoffline;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.leanmode.AbstractC5197b;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.AbstractC7741a;
import com.bytedance.ee.bear.list.AbstractC8651p;
import com.bytedance.ee.bear.list.C8140a;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.C8674q;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.homepage.AbstractC8463b;
import com.bytedance.ee.bear.list.homepage.AbstractC8473d;
import com.bytedance.ee.bear.list.homepage.AbstractC8474e;
import com.bytedance.ee.bear.list.homepage.AbstractC8476f;
import com.bytedance.ee.bear.list.homepage.p432a.C8460a;
import com.bytedance.ee.bear.list.homepage.title.AbstractC8505c;
import com.bytedance.ee.bear.list.homepage.title.C8507e;
import com.bytedance.ee.bear.list.homepage.title.HomeMainTitleBar;
import com.bytedance.ee.bear.list.homepage.title.MainTabTitleBar;
import com.bytedance.ee.bear.list.homepage.title.SubMenuView;
import com.bytedance.ee.bear.list.sort.C8777j;
import com.bytedance.ee.bear.list.sort.C8786n;
import com.bytedance.ee.bear.list.sort.C8787o;
import com.bytedance.ee.bear.list.sort.FilterType;
import com.bytedance.ee.log.C13479a;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27126e;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.manualoffline.a */
public class C8599a extends C7667e implements AbstractC8463b, AbstractC8474e.AbstractC8475a, AbstractC8651p.AbstractC8660i {

    /* renamed from: a */
    private AbstractC8505c f23344a;

    /* renamed from: b */
    private SubMenuView f23345b;

    /* renamed from: c */
    private SubMenuView f23346c;

    /* renamed from: d */
    private AbstractC7741a f23347d;

    /* renamed from: e */
    private C8460a f23348e;

    /* renamed from: f */
    private View f23349f;

    /* renamed from: g */
    private int f23350g;

    /* renamed from: h */
    private FolderSortStrategy f23351h;

    /* renamed from: c */
    private String m35891c() {
        return "manual_offline";
    }

    /* renamed from: a */
    public String mo33544a() {
        return "offline";
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8463b
    public void y_() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C13479a.m54764b("HomeOfflineFragment", "onDestroyView()...");
    }

    /* renamed from: d */
    private void m35894d() {
        C5084ad.m20847d().mo20037a().mo5923a(getViewLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.list.manualoffline.$$Lambda$a$uRmC6j7pxnkNpZhANTAQWQEL4ac */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C8599a.this.m35889b((C8599a) ((ConnectionService.NetworkState) obj));
            }
        });
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C13479a.m54764b("HomeOfflineFragment", "onDestroy()...");
        C8460a aVar = this.f23348e;
        if (aVar != null) {
            aVar.mo33075a();
        }
        C8674q.m36243f().mo33649b(this);
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e.AbstractC8475a
    /* renamed from: h */
    public void mo30969h() {
        Bundle bundle = new Bundle();
        bundle.putString("key_module", mo33544a());
        bundle.putString("key_token", m35891c());
        bundle.putParcelable("key_sort_strategy", this.f23351h);
        bundle.putBoolean("key_sort_filter_enable", false);
        C8140a.m32491a(getActivity(), C8777j.class, bundle);
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e.AbstractC8475a
    /* renamed from: j */
    public void mo30971j() {
        Bundle bundle = new Bundle();
        bundle.putString("key_token", m35891c());
        bundle.putParcelable("key_sort_strategy", this.f23351h);
        bundle.putBoolean("key_sort_asc_enable", false);
        C8140a.m32491a(getActivity(), C8787o.class, bundle);
    }

    /* renamed from: b */
    private void m35887b() {
        if (getActivity() != null) {
            ((C8786n) new C1144ai(getActivity()).mo6005a(C8786n.class)).getSortStrategyLiveData().mo5923a(getViewLifecycleOwner(), new AbstractC1178x() {
                /* class com.bytedance.ee.bear.list.manualoffline.$$Lambda$a$ZR0W1M1465ZjIbfUkBmAb4xOUk */

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    C8599a.this.m35890b((C8599a) ((FolderSortStrategy) obj));
                }
            });
        }
    }

    /* renamed from: a */
    private SubMenuView.FilterState m35880a(int i) {
        if (i == FilterType.ALL.getType()) {
            return SubMenuView.FilterState.DEFAULT;
        }
        return SubMenuView.FilterState.CHECKED;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m35889b(ConnectionService.NetworkState networkState) {
        if (networkState != null) {
            m35882a(networkState);
            C8460a aVar = this.f23348e;
            if (aVar != null) {
                aVar.mo33076a(networkState);
            }
        }
    }

    /* renamed from: c */
    private void m35893c(boolean z) {
        int i;
        SubMenuView subMenuView = this.f23346c;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        subMenuView.setVisibility(i);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        C13479a.m54764b("HomeOfflineFragment", "onAttach()...");
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C13479a.m54764b("HomeOfflineFragment", "onCreate()...");
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C13479a.m54764b("HomeOfflineFragment", "onSaveInstanceState()...");
    }

    /* renamed from: a */
    private void m35882a(ConnectionService.NetworkState networkState) {
        if (networkState.mo20041b()) {
            this.f23349f.setVisibility(8);
        } else {
            this.f23349f.setVisibility(0);
        }
    }

    /* renamed from: b */
    private void m35888b(View view) {
        AppBarLayout appBarLayout = (AppBarLayout) view.findViewById(R.id.list_sub_menu_layout);
        appBarLayout.addOnOffsetChangedListener((AppBarLayout.AbstractC22134b) new AppBarLayout.AbstractC22134b(appBarLayout) {
            /* class com.bytedance.ee.bear.list.manualoffline.$$Lambda$a$He8618Y8tRCX4mzNnqhawRxyMsY */
            public final /* synthetic */ AppBarLayout f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.google.android.material.appbar.AppBarLayout.AbstractC22133a
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                C8599a.this.m35884a(this.f$1, appBarLayout, i);
            }
        });
    }

    /* renamed from: a */
    private void m35881a(View view) {
        this.f23345b = (SubMenuView) view.findViewById(R.id.home_sub_title_view);
        this.f23346c = (SubMenuView) view.findViewById(R.id.fixed_at_top_title_view);
        this.f23345b.setViewDelegate(this);
        this.f23346c.setViewDelegate(this);
        mo30963a(C8292f.f22432b);
    }

    /* renamed from: b */
    private String m35886b(int i) {
        if (i == ManualOfflineSort.CREATED.getRank()) {
            return getString(R.string.CreationMobile_ECM_ManageGroup_SortBy_Option_Created);
        }
        if (i == ManualOfflineSort.MODIFIED.getRank()) {
            return getString(R.string.CreationMobile_ECM_ManageGroup_SortBy_Option_LastUpdated);
        }
        return getString(R.string.CreationMobile_ECM_ManageGroup_SortBy_Option_Added);
    }

    /* renamed from: a */
    private void m35883a(FolderSortStrategy folderSortStrategy) {
        this.f23351h = folderSortStrategy;
        SubMenuView.FilterState a = m35880a(folderSortStrategy.mo31554d());
        String b = m35886b(folderSortStrategy.mo31549b());
        this.f23345b.setFilterState(a);
        this.f23345b.mo33136a(b);
        this.f23346c.setFilterState(a);
        this.f23346c.mo33136a(b);
    }

    /* renamed from: c */
    private void m35892c(View view) {
        AbstractC7741a aVar;
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) view.findViewById(R.id.list_collapsing_layout);
        if (collapsingToolbarLayout != null && (aVar = this.f23347d) != null && (aVar instanceof ViewGroup)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((ViewGroup) aVar).getLayoutParams();
            AbstractC8505c cVar = this.f23344a;
            if ((cVar instanceof C8507e) || (cVar instanceof MainTabTitleBar) || cVar.getTitleType() == HomeMainTitleBar.TitleType.SPACE_ROUTE.ordinal()) {
                marginLayoutParams.topMargin = 0;
            } else {
                marginLayoutParams.topMargin = getResources().getDimensionPixelSize(R.dimen.list_home_title_search_height);
            }
            ((ViewGroup) this.f23347d).setLayoutParams(marginLayoutParams);
            collapsingToolbarLayout.setMinimumHeight(this.f23344a.getTitleBarHeight());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m35890b(FolderSortStrategy folderSortStrategy) {
        if (folderSortStrategy != null && TextUtils.equals(m35891c(), folderSortStrategy.mo31545a())) {
            m35883a(folderSortStrategy);
        }
    }

    /* renamed from: a */
    private void m35885a(SmartRefreshLayout smartRefreshLayout) {
        View findViewById = smartRefreshLayout.findViewById(R.id.list_appbar_refresh_header);
        if (((AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class)).mo20801b().mo20783h().f14914a) {
            findViewById.setVisibility(0);
            this.f23347d = (AbstractC7741a) findViewById;
        } else {
            View findViewById2 = smartRefreshLayout.findViewById(R.id.list_appbar_refresh_lean_header);
            findViewById2.setVisibility(0);
            findViewById.setVisibility(8);
            this.f23347d = (AbstractC7741a) findViewById2;
        }
        AbstractC27126e refreshHeader = smartRefreshLayout.getRefreshHeader();
        if (refreshHeader instanceof AbstractC7741a) {
            this.f23347d.setCustomText(getString(R.string.Doc_List_RefreshDocTips));
            ((AbstractC7741a) refreshHeader).setAssociatedHeader(this.f23347d);
        }
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e.AbstractC8475a
    /* renamed from: b */
    public void mo30965b(boolean z) {
        mo30963a(z);
        C8674q.m36243f().mo33641a(C5234y.m21391b(), z, mo33544a());
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8651p.AbstractC8660i
    /* renamed from: a */
    public void mo30963a(boolean z) {
        this.f23345b.mo33137a(z);
        this.f23346c.mo33137a(z);
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8463b
    /* renamed from: a */
    public void mo30959a(int i, int i2) {
        AbstractC8505c cVar = this.f23344a;
        if (cVar != null) {
            cVar.mo33176a(i, i2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C13479a.m54764b("HomeOfflineFragment", "onViewCreated()...");
        if (getActivity() instanceof AbstractC8476f) {
            this.f23344a = ((AbstractC8476f) getActivity()).mo30786c();
        }
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) view.findViewById(R.id.list_refresh_layout);
        AbstractC8473d dVar = (AbstractC8473d) getChildFragmentManager().findFragmentById(R.id.list_home_sub_fragment);
        if (dVar != null) {
            dVar.mo32694a(smartRefreshLayout);
        }
        m35885a(smartRefreshLayout);
        m35888b(view);
        m35892c(view);
        m35881a(view);
        this.f23348e = new C8460a(getContext(), smartRefreshLayout, new C8460a.AbstractC8461a() {
            /* class com.bytedance.ee.bear.list.manualoffline.C8599a.C86001 */

            @Override // com.bytedance.ee.bear.list.homepage.p432a.C8460a.AbstractC8461a
            /* renamed from: b */
            public String mo31038b() {
                return "none";
            }

            @Override // com.bytedance.ee.bear.list.homepage.p432a.C8460a.AbstractC8461a
            /* renamed from: a */
            public String mo31037a() {
                return C8599a.this.mo33544a();
            }
        });
        this.f23349f = view.findViewById(R.id.no_net_container);
        m35894d();
        m35887b();
        C8674q.m36243f().mo33642a(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.list_home_offline, viewGroup, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m35884a(AppBarLayout appBarLayout, AppBarLayout appBarLayout2, int i) {
        boolean z;
        AbstractC8505c cVar;
        if (this.f23350g != i) {
            this.f23350g = i;
            if (i == 0 && (cVar = this.f23344a) != null) {
                cVar.mo33198k();
            }
            if (Math.abs(i) >= appBarLayout.getTotalScrollRange()) {
                z = true;
            } else {
                z = false;
            }
            m35893c(z);
        }
    }
}
