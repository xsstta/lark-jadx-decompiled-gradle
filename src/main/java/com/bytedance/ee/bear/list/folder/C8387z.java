package com.bytedance.ee.bear.list.folder;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.leanmode.AbstractC5197b;
import com.bytedance.ee.bear.facade.common.p380a.C7663b;
import com.bytedance.ee.bear.facade.common.widget.Toast;
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

/* renamed from: com.bytedance.ee.bear.list.folder.z */
public class C8387z extends C7663b implements AbstractC8463b, AbstractC8474e.AbstractC8475a, AbstractC8651p.AbstractC8660i {

    /* renamed from: c */
    private AbstractC8505c f22623c;

    /* renamed from: d */
    private SubMenuView f22624d;

    /* renamed from: e */
    private SubMenuView f22625e;

    /* renamed from: f */
    private AbstractC7741a f22626f;

    /* renamed from: g */
    private C8460a f22627g;

    /* renamed from: h */
    private View f22628h;

    /* renamed from: i */
    private ConnectionService.NetworkState f22629i;

    /* renamed from: j */
    private int f22630j;

    /* renamed from: k */
    private FolderSortStrategy f22631k;

    /* renamed from: q */
    private String m34745q() {
        return "my_root";
    }

    /* renamed from: a */
    public String mo32820a() {
        return "personal";
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8463b
    public void y_() {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.p380a.C7663b
    public void x_() {
        super.x_();
        C13479a.m54764b("HomePersonalFragment", "onDestroyViewLazy()...");
    }

    /* renamed from: o */
    private void m34743o() {
        AppBarLayout appBarLayout = (AppBarLayout) mo30111b(R.id.list_sub_menu_layout);
        appBarLayout.addOnOffsetChangedListener((AppBarLayout.AbstractC22134b) new AppBarLayout.AbstractC22134b(appBarLayout) {
            /* class com.bytedance.ee.bear.list.folder.$$Lambda$z$zw9ejV0_VH8K1zcDTbTBUQ6jec */
            public final /* synthetic */ AppBarLayout f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.google.android.material.appbar.AppBarLayout.AbstractC22133a
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                C8387z.this.m34733a(this.f$1, appBarLayout, i);
            }
        });
    }

    /* renamed from: r */
    private void m34746r() {
        C5084ad.m20847d().mo20037a().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.list.folder.$$Lambda$z$sSTwvfxzplC2QQ51vFmV2N2o7M */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C8387z.this.m34737c((C8387z) ((ConnectionService.NetworkState) obj));
            }
        });
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.p380a.C7662a, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C13479a.m54764b("HomePersonalFragment", "onDestroy()...");
        C8460a aVar = this.f22627g;
        if (aVar != null) {
            aVar.mo33075a();
        }
        C8674q.m36243f().mo33649b(this);
    }

    /* renamed from: k */
    private void m34741k() {
        if (getActivity() != null) {
            ((C8786n) aj.m5366a(getActivity()).mo6005a(C8786n.class)).getSortStrategyLiveData().mo5923a(this, new AbstractC1178x() {
                /* class com.bytedance.ee.bear.list.folder.$$Lambda$z$MCmpoh5DHhG2Cgmr7Do5wje4HYo */

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    C8387z.this.m34736b((C8387z) ((FolderSortStrategy) obj));
                }
            });
        }
    }

    /* renamed from: l */
    private void m34742l() {
        this.f22624d = (SubMenuView) mo30111b(R.id.home_sub_title_view);
        this.f22625e = (SubMenuView) mo30111b(R.id.fixed_at_top_title_view);
        this.f22624d.mo33138b();
        this.f22625e.mo33138b();
        this.f22624d.setViewDelegate(this);
        this.f22625e.setViewDelegate(this);
        mo30963a(C8292f.f22432b);
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e.AbstractC8475a
    /* renamed from: j */
    public void mo30971j() {
        ConnectionService.NetworkState networkState = this.f22629i;
        if (networkState == null || !networkState.mo20041b()) {
            Toast.showFailureText(this.f20782b, this.f20782b.getString(R.string.Doc_Facade_Offline), 0);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("key_token", m34745q());
        bundle.putParcelable("key_sort_strategy", this.f22631k);
        C8140a.m32491a(getActivity(), C8787o.class, bundle);
    }

    /* renamed from: p */
    private void m34744p() {
        AbstractC7741a aVar;
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) mo30111b(R.id.list_collapsing_layout);
        if (collapsingToolbarLayout != null && (aVar = this.f22626f) != null && (aVar instanceof ViewGroup)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((ViewGroup) aVar).getLayoutParams();
            AbstractC8505c cVar = this.f22623c;
            if ((cVar instanceof C8507e) || (cVar instanceof MainTabTitleBar) || cVar.getTitleType() == HomeMainTitleBar.TitleType.SPACE_ROUTE.ordinal()) {
                marginLayoutParams.topMargin = 0;
            } else {
                marginLayoutParams.topMargin = getResources().getDimensionPixelSize(R.dimen.list_home_title_search_height);
            }
            ((ViewGroup) this.f22626f).setLayoutParams(marginLayoutParams);
            collapsingToolbarLayout.setMinimumHeight(this.f22623c.getTitleBarHeight());
        }
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e.AbstractC8475a
    /* renamed from: h */
    public void mo30969h() {
        ConnectionService.NetworkState networkState = this.f22629i;
        if (networkState == null || !networkState.mo20041b()) {
            Toast.showFailureText(this.f20782b, this.f20782b.getString(R.string.Doc_Facade_Offline), 0);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("key_module", mo32820a());
        bundle.putString("key_token", m34745q());
        bundle.putParcelable("key_sort_strategy", this.f22631k);
        bundle.putBoolean("key_sort_filter_enable", false);
        bundle.putBoolean("key_filter_folder", true);
        C8140a.m32491a(getActivity(), C8777j.class, bundle);
    }

    /* renamed from: c */
    private void m34738c(boolean z) {
        int i;
        SubMenuView subMenuView = this.f22625e;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        subMenuView.setVisibility(i);
    }

    /* renamed from: d */
    private SubMenuView.FilterState m34739d(int i) {
        if (i == FilterType.ALL.getType()) {
            return SubMenuView.FilterState.DEFAULT;
        }
        return SubMenuView.FilterState.CHECKED;
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8651p.AbstractC8660i
    /* renamed from: a */
    public void mo30963a(boolean z) {
        this.f22624d.mo33137a(z);
        this.f22625e.mo33137a(z);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        C13479a.m54764b("HomePersonalFragment", "onAttach()...");
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.p380a.C7662a, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C13479a.m54764b("HomePersonalFragment", "onCreate()...");
    }

    @Override // com.bytedance.ee.bear.facade.common.p380a.C7662a, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C13479a.m54764b("HomePersonalFragment", "onSaveInstanceState()...");
    }

    /* renamed from: a */
    private void m34731a(ConnectionService.NetworkState networkState) {
        boolean z;
        if (networkState == null || !networkState.mo20041b()) {
            z = true;
        } else {
            z = false;
        }
        SubMenuView subMenuView = this.f22624d;
        if (subMenuView != null) {
            subMenuView.setOffline(z);
        }
        SubMenuView subMenuView2 = this.f22625e;
        if (subMenuView2 != null) {
            subMenuView2.setOffline(z);
        }
    }

    /* renamed from: b */
    private void m34735b(ConnectionService.NetworkState networkState) {
        if (networkState.mo20041b()) {
            this.f22628h.setVisibility(8);
        } else {
            this.f22628h.setVisibility(0);
        }
        this.f22629i = networkState;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m34737c(ConnectionService.NetworkState networkState) {
        if (networkState != null) {
            m34735b(networkState);
            C8460a aVar = this.f22627g;
            if (aVar != null) {
                aVar.mo33076a(networkState);
            }
            m34731a(networkState);
        }
    }

    /* renamed from: a */
    private void m34732a(FolderSortStrategy folderSortStrategy) {
        this.f22631k = folderSortStrategy;
        SubMenuView.FilterState d = m34739d(folderSortStrategy.mo31554d());
        String e = m34740e(folderSortStrategy.mo31549b());
        this.f22624d.setFilterState(d);
        this.f22624d.mo33136a(e);
        this.f22625e.setFilterState(d);
        this.f22625e.mo33136a(e);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m34736b(FolderSortStrategy folderSortStrategy) {
        if (folderSortStrategy != null && TextUtils.equals(m34745q(), folderSortStrategy.mo31545a())) {
            m34732a(folderSortStrategy);
        }
    }

    /* renamed from: e */
    private String m34740e(int i) {
        if (i == FolderSort.CREATED_TIME.getRank()) {
            return getString(R.string.CreationMobile_ECM_ManageGroup_SortBy_Option_Created);
        }
        if (i == FolderSort.NAME.getRank()) {
            return getString(R.string.CreationMobile_ECM_ManageGroup_SortBy_Option_Name);
        }
        return getString(R.string.CreationMobile_ECM_ManageGroup_SortBy_Option_LastUpdated);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.p380a.C7663b
    /* renamed from: b */
    public void mo30113b(Bundle bundle) {
        super.mo30113b(bundle);
        mo30107a(R.layout.list_home_personal);
        if (getActivity() instanceof AbstractC8476f) {
            this.f22623c = ((AbstractC8476f) getActivity()).mo30786c();
        }
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) mo30111b(R.id.list_refresh_layout);
        AbstractC8473d dVar = (AbstractC8473d) getChildFragmentManager().findFragmentById(R.id.list_home_sub_fragment);
        if (dVar != null) {
            dVar.mo32694a(smartRefreshLayout);
        }
        m34734a(smartRefreshLayout);
        m34743o();
        m34744p();
        m34742l();
        this.f22627g = new C8460a(this.f20782b, smartRefreshLayout, new C8460a.AbstractC8461a() {
            /* class com.bytedance.ee.bear.list.folder.C8387z.C83881 */

            @Override // com.bytedance.ee.bear.list.homepage.p432a.C8460a.AbstractC8461a
            /* renamed from: b */
            public String mo31038b() {
                return "none";
            }

            @Override // com.bytedance.ee.bear.list.homepage.p432a.C8460a.AbstractC8461a
            /* renamed from: a */
            public String mo31037a() {
                return C8387z.this.mo32820a();
            }
        });
        this.f22628h = mo30111b(R.id.no_net_container);
        m34746r();
        m34741k();
        C8674q.m36243f().mo33642a(this);
    }

    /* renamed from: a */
    private void m34734a(SmartRefreshLayout smartRefreshLayout) {
        View b = mo30111b(R.id.list_appbar_refresh_header);
        if (((AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class)).mo20801b().mo20783h().f14914a) {
            b.setVisibility(0);
            this.f22626f = (AbstractC7741a) b;
        } else {
            View b2 = mo30111b(R.id.list_appbar_refresh_lean_header);
            b2.setVisibility(0);
            b.setVisibility(8);
            this.f22626f = (AbstractC7741a) b2;
        }
        AbstractC27126e refreshHeader = smartRefreshLayout.getRefreshHeader();
        if (refreshHeader instanceof AbstractC7741a) {
            this.f22626f.setCustomText(getString(R.string.Doc_List_RefreshDocTips));
            ((AbstractC7741a) refreshHeader).setAssociatedHeader(this.f22626f);
        }
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e.AbstractC8475a
    /* renamed from: b */
    public void mo30965b(boolean z) {
        mo30963a(z);
        C8674q.m36243f().mo33641a(C5234y.m21391b(), z, mo32820a());
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8463b
    /* renamed from: a */
    public void mo30959a(int i, int i2) {
        AbstractC8505c cVar = this.f22623c;
        if (cVar != null) {
            cVar.mo33176a(i, i2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m34733a(AppBarLayout appBarLayout, AppBarLayout appBarLayout2, int i) {
        boolean z;
        AbstractC8505c cVar;
        if (this.f22630j != i) {
            this.f22630j = i;
            if (i == 0 && (cVar = this.f22623c) != null) {
                cVar.mo33198k();
            }
            if (Math.abs(i) >= appBarLayout.getTotalScrollRange()) {
                z = true;
            } else {
                z = false;
            }
            m34738c(z);
        }
    }
}
