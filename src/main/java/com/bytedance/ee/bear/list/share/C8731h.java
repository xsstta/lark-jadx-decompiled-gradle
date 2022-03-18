package com.bytedance.ee.bear.list.share;

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
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27126e;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.share.h */
public class C8731h extends C7663b implements AbstractC8474e.AbstractC8475a, AbstractC8651p.AbstractC8660i, AbstractC8736k {

    /* renamed from: c */
    private AbstractC8505c f23590c;

    /* renamed from: d */
    private SubMenuView f23591d;

    /* renamed from: e */
    private SubMenuView f23592e;

    /* renamed from: f */
    private AbstractC7741a f23593f;

    /* renamed from: g */
    private C8460a f23594g;

    /* renamed from: h */
    private View f23595h;

    /* renamed from: i */
    private View f23596i;

    /* renamed from: j */
    private ConnectionService.NetworkState f23597j;

    /* renamed from: k */
    private int f23598k;

    /* renamed from: l */
    private FolderSortStrategy f23599l;

    /* renamed from: r */
    private String m36698r() {
        return "shared";
    }

    /* renamed from: a */
    public String mo33777a() {
        return "shared";
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8463b
    public void y_() {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.p380a.C7663b
    public void x_() {
        super.x_();
        C13479a.m54764b("HomeSharedFragment", "onDestroyViewLazy()...");
    }

    /* renamed from: k */
    private void m36693k() {
        this.f23596i = mo30111b(R.id.history_shared_folder);
        mo30111b(R.id.hyperlink).setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.list.share.C8731h.C87332 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17295b("/list/share/activity").mo17316a("show_history_folders", true).mo17317a();
            }
        });
    }

    /* renamed from: p */
    private void m36696p() {
        AppBarLayout appBarLayout = (AppBarLayout) mo30111b(R.id.list_sub_menu_layout);
        appBarLayout.addOnOffsetChangedListener((AppBarLayout.AbstractC22134b) new AppBarLayout.AbstractC22134b(appBarLayout) {
            /* class com.bytedance.ee.bear.list.share.$$Lambda$h$rApJLV_UsRW84iUT_o9GO5O9EeU */
            public final /* synthetic */ AppBarLayout f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.google.android.material.appbar.AppBarLayout.AbstractC22133a
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                C8731h.this.m36685a(this.f$1, appBarLayout, i);
            }
        });
    }

    /* renamed from: s */
    private void m36699s() {
        C5084ad.m20847d().mo20037a().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.list.share.$$Lambda$h$AH1VbQeb6_CJ6CUb6mvFhChlM8I */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C8731h.this.m36689c((C8731h) ((ConnectionService.NetworkState) obj));
            }
        });
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.p380a.C7662a, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C13479a.m54764b("HomeSharedFragment", "onDestroy()...");
        C8460a aVar = this.f23594g;
        if (aVar != null) {
            aVar.mo33075a();
        }
        C8674q.m36243f().mo33649b(this);
    }

    /* renamed from: l */
    private void m36694l() {
        if (getActivity() != null) {
            ((C8786n) aj.m5366a(getActivity()).mo6005a(C8786n.class)).getSortStrategyLiveData().mo5923a(this, new AbstractC1178x() {
                /* class com.bytedance.ee.bear.list.share.$$Lambda$h$fuxkxQQki_2vOJY1rna2hf06erw */

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    C8731h.this.m36688b((C8731h) ((FolderSortStrategy) obj));
                }
            });
        }
    }

    /* renamed from: o */
    private void m36695o() {
        this.f23591d = (SubMenuView) mo30111b(R.id.home_sub_title_view);
        this.f23592e = (SubMenuView) mo30111b(R.id.fixed_at_top_title_view);
        this.f23591d.setViewDelegate(this);
        this.f23592e.setViewDelegate(this);
        mo30963a(C8292f.f22432b);
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e.AbstractC8475a
    /* renamed from: j */
    public void mo30971j() {
        ConnectionService.NetworkState networkState = this.f23597j;
        if (networkState == null || !networkState.mo20041b()) {
            Toast.showFailureText(this.f20782b, this.f20782b.getString(R.string.Doc_Facade_Offline), 0);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("key_token", m36698r());
        bundle.putParcelable("key_sort_strategy", this.f23599l);
        C8140a.m32491a(getActivity(), C8787o.class, bundle);
    }

    /* renamed from: q */
    private void m36697q() {
        AbstractC7741a aVar;
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) mo30111b(R.id.list_collapsing_layout);
        if (collapsingToolbarLayout != null && (aVar = this.f23593f) != null && (aVar instanceof ViewGroup)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((ViewGroup) aVar).getLayoutParams();
            AbstractC8505c cVar = this.f23590c;
            if ((cVar instanceof C8507e) || (cVar instanceof MainTabTitleBar) || cVar.getTitleType() == HomeMainTitleBar.TitleType.SPACE_ROUTE.ordinal()) {
                marginLayoutParams.topMargin = 0;
            } else {
                marginLayoutParams.topMargin = getResources().getDimensionPixelSize(R.dimen.list_home_title_search_height);
            }
            ((ViewGroup) this.f23593f).setLayoutParams(marginLayoutParams);
            collapsingToolbarLayout.setMinimumHeight(this.f23590c.getTitleBarHeight());
        }
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e.AbstractC8475a
    /* renamed from: h */
    public void mo30969h() {
        ConnectionService.NetworkState networkState = this.f23597j;
        if (networkState == null || !networkState.mo20041b()) {
            Toast.showFailureText(this.f20782b, this.f20782b.getString(R.string.Doc_Facade_Offline), 0);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("key_module", mo33777a());
        bundle.putString("key_token", m36698r());
        bundle.putParcelable("key_sort_strategy", this.f23599l);
        bundle.putBoolean("key_sort_filter_enable", false);
        bundle.putBoolean("key_filter_folder", true);
        C8140a.m32491a(getActivity(), C8777j.class, bundle);
    }

    /* renamed from: d */
    private SubMenuView.FilterState m36690d(int i) {
        if (i == FilterType.ALL.getType()) {
            return SubMenuView.FilterState.DEFAULT;
        }
        return SubMenuView.FilterState.CHECKED;
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8651p.AbstractC8660i
    /* renamed from: a */
    public void mo30963a(boolean z) {
        this.f23591d.mo33137a(z);
        this.f23592e.mo33137a(z);
    }

    @Override // com.bytedance.ee.bear.list.share.AbstractC8736k
    /* renamed from: c */
    public void mo33778c(boolean z) {
        int i;
        View view = this.f23596i;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        C13479a.m54764b("HomeSharedFragment", "onAttach()...");
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.p380a.C7662a, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C13479a.m54764b("HomeSharedFragment", "onCreate()...");
    }

    @Override // com.bytedance.ee.bear.facade.common.p380a.C7662a, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C13479a.m54764b("HomeSharedFragment", "onSaveInstanceState()...");
    }

    /* renamed from: a */
    private void m36683a(ConnectionService.NetworkState networkState) {
        boolean z;
        if (networkState == null || !networkState.mo20041b()) {
            z = true;
        } else {
            z = false;
        }
        SubMenuView subMenuView = this.f23591d;
        if (subMenuView != null) {
            subMenuView.setOffline(z);
        }
        SubMenuView subMenuView2 = this.f23592e;
        if (subMenuView2 != null) {
            subMenuView2.setOffline(z);
        }
    }

    /* renamed from: b */
    private void m36687b(ConnectionService.NetworkState networkState) {
        if (networkState.mo20041b()) {
            this.f23595h.setVisibility(8);
        } else {
            this.f23595h.setVisibility(0);
        }
        this.f23597j = networkState;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m36689c(ConnectionService.NetworkState networkState) {
        if (networkState != null) {
            m36687b(networkState);
            C8460a aVar = this.f23594g;
            if (aVar != null) {
                aVar.mo33076a(networkState);
            }
            m36683a(networkState);
        }
    }

    /* renamed from: d */
    private void m36691d(boolean z) {
        int i;
        SubMenuView subMenuView = this.f23592e;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        subMenuView.setVisibility(i);
    }

    /* renamed from: a */
    private void m36684a(FolderSortStrategy folderSortStrategy) {
        this.f23599l = folderSortStrategy;
        SubMenuView.FilterState d = m36690d(folderSortStrategy.mo31554d());
        String e = m36692e(folderSortStrategy.mo31549b());
        this.f23591d.setFilterState(d);
        this.f23591d.mo33136a(e);
        this.f23592e.setFilterState(d);
        this.f23592e.mo33136a(e);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m36688b(FolderSortStrategy folderSortStrategy) {
        if (folderSortStrategy != null && TextUtils.equals(m36698r(), folderSortStrategy.mo31545a())) {
            m36684a(folderSortStrategy);
        }
    }

    /* renamed from: e */
    private String m36692e(int i) {
        if (i == ShareFileSort.CREATE_TIME.getRank()) {
            return getString(R.string.CreationMobile_ECM_ManageGroup_SortBy_Option_Created);
        }
        if (i == ShareFileSort.SHARE_TIME.getRank()) {
            return getString(R.string.CreationMobile_ECM_ManageGroup_SortBy_Option_Shared);
        }
        return getString(R.string.CreationMobile_ECM_ManageGroup_SortBy_Option_LastUpdated);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.p380a.C7663b
    /* renamed from: b */
    public void mo30113b(Bundle bundle) {
        super.mo30113b(bundle);
        mo30107a(R.layout.list_home_shared);
        if (getActivity() instanceof AbstractC8476f) {
            this.f23590c = ((AbstractC8476f) getActivity()).mo30786c();
        }
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) mo30111b(R.id.list_refresh_layout);
        AbstractC8473d dVar = (AbstractC8473d) getChildFragmentManager().findFragmentById(R.id.list_home_sub_fragment);
        if (dVar != null) {
            dVar.mo32694a(smartRefreshLayout);
        }
        m36686a(smartRefreshLayout);
        m36696p();
        m36697q();
        m36695o();
        this.f23594g = new C8460a(this.f20782b, smartRefreshLayout, new C8460a.AbstractC8461a() {
            /* class com.bytedance.ee.bear.list.share.C8731h.C87321 */

            @Override // com.bytedance.ee.bear.list.homepage.p432a.C8460a.AbstractC8461a
            /* renamed from: b */
            public String mo31038b() {
                return "none";
            }

            @Override // com.bytedance.ee.bear.list.homepage.p432a.C8460a.AbstractC8461a
            /* renamed from: a */
            public String mo31037a() {
                return C8731h.this.mo33777a();
            }
        });
        this.f23595h = mo30111b(R.id.no_net_container);
        m36693k();
        m36699s();
        m36694l();
        C8674q.m36243f().mo33642a(this);
    }

    /* renamed from: a */
    private void m36686a(SmartRefreshLayout smartRefreshLayout) {
        View b = mo30111b(R.id.list_appbar_refresh_header);
        if (((AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class)).mo20801b().mo20783h().f14914a) {
            b.setVisibility(0);
            this.f23593f = (AbstractC7741a) b;
        } else {
            View b2 = mo30111b(R.id.list_appbar_refresh_lean_header);
            b2.setVisibility(0);
            b.setVisibility(8);
            this.f23593f = (AbstractC7741a) b2;
        }
        AbstractC27126e refreshHeader = smartRefreshLayout.getRefreshHeader();
        if (refreshHeader instanceof AbstractC7741a) {
            this.f23593f.setCustomText(getString(R.string.Doc_List_RefreshDocTips));
            ((AbstractC7741a) refreshHeader).setAssociatedHeader(this.f23593f);
        }
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e.AbstractC8475a
    /* renamed from: b */
    public void mo30965b(boolean z) {
        mo30963a(z);
        C8674q.m36243f().mo33641a(C5234y.m21391b(), z, mo33777a());
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8463b
    /* renamed from: a */
    public void mo30959a(int i, int i2) {
        AbstractC8505c cVar = this.f23590c;
        if (cVar != null) {
            cVar.mo33176a(i, i2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m36685a(AppBarLayout appBarLayout, AppBarLayout appBarLayout2, int i) {
        boolean z;
        AbstractC8505c cVar;
        if (this.f23598k != i) {
            this.f23598k = i;
            if (i == 0 && (cVar = this.f23590c) != null) {
                cVar.mo33198k();
            }
            if (Math.abs(i) >= appBarLayout.getTotalScrollRange()) {
                z = true;
            } else {
                z = false;
            }
            m36691d(z);
        }
    }
}
