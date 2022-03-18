package com.bytedance.ee.bear.list.share;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.leanmode.AbstractC5197b;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.AbstractC7741a;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.DigitDanceHeader;
import com.bytedance.ee.bear.lark.p414b.AbstractC7993f;
import com.bytedance.ee.bear.list.C8140a;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.C8674q;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.config.SpaceFeatureGatingV2;
import com.bytedance.ee.bear.list.create.C8238f;
import com.bytedance.ee.bear.list.create.C8254n;
import com.bytedance.ee.bear.list.create.SelectCreationMenuConfig;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.list.folder.FolderSort;
import com.bytedance.ee.bear.list.homepage.AbstractC8474e;
import com.bytedance.ee.bear.list.homepage.HomeCoordinatorLayout;
import com.bytedance.ee.bear.list.homepage.title.HomeMainTitleBar;
import com.bytedance.ee.bear.list.homepage.title.SubMenuView;
import com.bytedance.ee.bear.list.list.AbstractC8538g;
import com.bytedance.ee.bear.list.list.BaseListView;
import com.bytedance.ee.bear.list.loadstateview.C8594b;
import com.bytedance.ee.bear.list.loadstateview.EmptyCategory;
import com.bytedance.ee.bear.list.loadstateview.LoadStateView;
import com.bytedance.ee.bear.list.more.itemv2.C8634d;
import com.bytedance.ee.bear.list.share.AbstractC8741p;
import com.bytedance.ee.bear.list.sort.C8787o;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.widgets.button.CommonCreateButton;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;

public class ak extends BaseListView<AbstractC8741p.AbstractC8742a> implements AbstractC8474e.AbstractC8475a, AbstractC8741p {

    /* renamed from: a */
    private HomeMainTitleBar f23564a;

    /* renamed from: t */
    private SubMenuView f23565t;

    /* renamed from: u */
    private View f23566u;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: f */
    public String mo32614f() {
        return "shared_folder";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: g */
    public String mo32615g() {
        return "ShareFolderView";
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e.AbstractC8475a
    /* renamed from: h */
    public void mo30969h() {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: m */
    public String mo32618m() {
        return "shared_folder_root";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: q */
    public boolean mo33345q() {
        return false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: M */
    private /* synthetic */ void m36519M() {
        onRefresh(null);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: k */
    public String mo32810k() {
        return this.f23090b.getString(R.string.Doc_List_FolderRefreshTips);
    }

    /* renamed from: F */
    private void m36512F() {
        SubMenuView subMenuView = (SubMenuView) this.f23091c.findViewById(R.id.home_sub_title_view);
        this.f23565t = subMenuView;
        subMenuView.mo33138b();
        this.f23565t.setViewDelegate(this);
        this.f23565t.mo33137a(this.f23095g);
    }

    /* renamed from: G */
    private void m36513G() {
        ((CommonCreateButton) this.f23091c.findViewById(R.id.common_create_button)).setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.list.share.ak.C87181 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                ak.this.mo32749e();
            }
        });
        m36516J();
    }

    /* renamed from: K */
    private void m36517K() {
        C13479a.m54764b(mo32615g(), "closePopupMenu()...");
        C8238f L = m36518L();
        if (L != null) {
            C13479a.m54764b("ShareFolderView", "creationMenu is exist");
            L.mo5513b();
        }
    }

    /* renamed from: J */
    private void m36516J() {
        if (this.f23092d.getActivity() == null) {
            C13479a.m54758a("ShareFolderView", "observeCreatePopupMenu()...activity is null");
        } else {
            ((C8254n) aj.m5366a(this.f23092d.getActivity()).mo6005a(C8254n.class)).getSelectedCreationTypeLiveData().mo5923a(this.f23092d, new AbstractC1178x() {
                /* class com.bytedance.ee.bear.list.share.$$Lambda$ak$Bk55VQOL9_9iSvoYymoLuRYv0xQ */

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    ak.this.m36520a((ak) ((Integer) obj));
                }
            });
        }
    }

    /* renamed from: L */
    private C8238f m36518L() {
        if (this.f23092d.getActivity() == null) {
            return null;
        }
        Fragment findFragmentByTag = this.f23092d.getActivity().getSupportFragmentManager().findFragmentByTag("CreationMenuPanel");
        if (!(findFragmentByTag instanceof C8238f)) {
            return null;
        }
        C13479a.m54764b("ShareFolderView", "getCreationMenuPanel()...success");
        return (C8238f) findFragmentByTag;
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListView, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ListAnalysis.m32497a(C5234y.m21391b(), mo32618m());
        ListAnalysis.m32526b(C5234y.m21391b(), mo32618m());
        ListAnalysis.m32524a(mo32618m(), "", true);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: d */
    public void mo32613d() {
        super.mo32613d();
        this.f23099k = (AbstractC27129h) this.f23091c.findViewById(R.id.list_refresh_layout);
        AbstractC7741a aVar = (AbstractC7741a) this.f23099k.getRefreshHeader();
        DigitDanceHeader digitDanceHeader = (DigitDanceHeader) this.f23091c.findViewById(R.id.list_appbar_refresh_header);
        if (aVar != null) {
            aVar.setAssociatedHeader(digitDanceHeader);
        }
        mo33352x();
        this.f23566u = this.f23091c.findViewById(R.id.no_net_container);
        m36514H();
        m36512F();
        m36513G();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: i */
    public AbstractC8538g mo32616i() {
        AbstractC8538g gVar;
        this.f23102n = null;
        if (this.f23095g) {
            gVar = new C8711ac(this.f23094f, mo32618m(), this.f23104p);
        } else {
            gVar = new C8715ah(this.f23094f, mo32618m(), this.f23104p, this.f23101m);
        }
        mo33329a(gVar);
        mo33332b(gVar);
        return gVar;
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e.AbstractC8475a
    /* renamed from: j */
    public void mo30971j() {
        C13479a.m54764b("ShareFolderView", "onClickSortMenu()...");
        if (mo33326E()) {
            Bundle bundle = new Bundle();
            bundle.putString("key_token", mo32614f());
            bundle.putParcelable("key_sort_strategy", this.f23096h);
            C8140a.m32491a(this.f23092d.getActivity(), C8787o.class, bundle);
            return;
        }
        Toast.showFailureText(this.f23090b, this.f23090b.getString(R.string.Doc_Facade_Offline), 0);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: l */
    public void mo32617l() {
        this.f23100l = new C8594b((LoadStateView) this.f23091c.findViewById(R.id.list_state_view_root), Looper.getMainLooper());
        this.f23100l.mo33511a(false, EmptyCategory.f23242f);
        this.f23100l.mo33509a(new LoadStateView.AbstractC8574f() {
            /* class com.bytedance.ee.bear.list.share.$$Lambda$ak$K99ObvNEWgADhQGAPWsbrAMO_L8 */

            @Override // com.bytedance.ee.bear.list.loadstateview.LoadStateView.AbstractC8574f
            public final void onTouchEvent() {
                ak.this.m36519M();
            }
        });
    }

    /* renamed from: H */
    private void m36514H() {
        HomeMainTitleBar homeMainTitleBar = (HomeMainTitleBar) this.f23091c.findViewById(R.id.list_folder_title_bar);
        this.f23564a = homeMainTitleBar;
        ((HomeCoordinatorLayout) this.f23091c.findViewById(R.id.list_home_coordinator_layout)).setMainTitle(homeMainTitleBar);
        this.f23564a.mo33179b();
        this.f23564a.setTitle(this.f23090b.getString(R.string.Doc_List_ShareFolders));
        this.f23564a.setOnSearchBtnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.list.share.ak.C87192 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                ak.this.mo32604a();
            }
        });
        HashMap hashMap = new HashMap();
        hashMap.put("module", mo32618m());
        BaseTitleBar titleBar = this.f23564a.getTitleBar();
        if (titleBar != null) {
            titleBar.setTag(R.id.title_bar_common_params, hashMap);
        }
    }

    /* renamed from: I */
    private SelectCreationMenuConfig m36515I() {
        boolean z;
        boolean e = ((AbstractC7993f) KoinJavaComponent.m268610a(AbstractC7993f.class)).mo30993e();
        boolean z2 = ((AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class)).mo20801b().mo20777c().f14914a;
        SelectCreationMenuConfig h = new SelectCreationMenuConfig().mo32292h(C8292f.m34174b());
        if (!e || C4211a.m17514a().mo16536a("ccm.spacekit.bitable.enable", false)) {
            z = true;
        } else {
            z = false;
        }
        return h.mo32294i(z).mo32296j(C4211a.m17514a().mo16538b("spacekit.mobile.docx_create_enable", false)).mo32290g(true).mo32298k(z2).mo32281c(false).mo32286e(false).mo32288f(false);
    }

    /* renamed from: a */
    public void mo32604a() {
        C13479a.m54764b(mo32615g(), "onSearchClick()...");
        C8292f.m34146a(this.f23564a.getTitleSnapshot());
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17295b("/search/space_search/activity").mo17308a("KEY_SEARCH_BAR_DY", this.f23564a.getTitleBarHeight()).mo17308a("KEY_SEARCH_PAGE_TYPE", 1).mo17314a("KEY_FOLDER_TOKEN", "").mo17306a(R.anim.facade_hold, R.anim.facade_hold).mo17314a("module", mo32618m()).mo17317a();
        ListAnalysis.m32523a("ccm_space_folder_click", mo32618m(), "", "search", "search_main_view", "", "", C8275a.f22370c.mo32555b(), "", "", true, true, false, 0, Boolean.valueOf(mo33350v()), "suspend_create");
    }

    /* renamed from: e */
    public void mo32749e() {
        C13479a.m54764b(mo32615g(), "onMenuCreateClick()...");
        C8238f L = m36518L();
        if (L == null || L.v_() == null || !L.v_().isShowing()) {
            Bundle bundle = new Bundle();
            bundle.putString("key_module", mo32618m());
            bundle.putBoolean("key_folder_version", SpaceFeatureGatingV2.m32622a());
            bundle.putParcelable("key_config", m36515I());
            C8238f.m33821a(this.f23092d.getActivity(), bundle);
            ListAnalysis.m32523a("ccm_space_folder_click", mo32618m(), "", "create", "ccm_space_create_new_view", "", "", C8275a.f22370c.mo32555b(), "", "", true, true, false, 0, Boolean.valueOf(mo33350v()), "suspend_create");
            return;
        }
        C13479a.m54764b("ShareFolderView", "create menu is already showing");
        L.mo5513b();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m36520a(Integer num) {
        m36517K();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: d */
    public GridLayoutManager.AbstractC1297b mo33337d(int i) {
        return new C8714ag(this.f23102n, i);
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListView, com.bytedance.ee.bear.list.AbstractC8651p.AbstractC8660i
    /* renamed from: a */
    public void mo30963a(boolean z) {
        super.mo30963a(z);
        this.f23564a.mo33178a(z);
    }

    /* renamed from: e */
    private String m36521e(int i) {
        if (i == FolderSort.CREATED_TIME.getRank()) {
            return this.f23090b.getString(R.string.CreationMobile_ECM_ManageGroup_SortBy_Option_Created);
        }
        if (i == FolderSort.NAME.getRank()) {
            return this.f23090b.getString(R.string.CreationMobile_ECM_ManageGroup_SortBy_Option_Name);
        }
        if (i == FolderSort.OWNER.getRank()) {
            return this.f23090b.getString(R.string.CreationMobile_ECM_ManageGroup_SortBy_Option_Owner);
        }
        return this.f23090b.getString(R.string.CreationMobile_ECM_ManageGroup_SortBy_Option_LastUpdated);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: a */
    public void mo32745a(ConnectionService.NetworkState networkState) {
        int i;
        super.mo32745a(networkState);
        View view = this.f23566u;
        if (networkState.mo20041b()) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        this.f23565t.setOffline(!networkState.mo20041b());
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i, com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: b */
    public void mo33334b(ArrayList<Document> arrayList) {
        if (arrayList == null) {
            C13479a.m54764b(mo32615g(), "showList()...list is null");
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<Document> it = arrayList.iterator();
        while (it.hasNext()) {
            Document next = it.next();
            if (next.ab()) {
                arrayList3.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        ArrayList<Document> arrayList4 = new ArrayList<>(arrayList2);
        if (CollectionUtils.isNotEmpty(arrayList3)) {
            arrayList4.add(new TitleDocument());
        }
        arrayList4.addAll(arrayList3);
        super.mo33334b(arrayList4);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: a */
    public void mo32733a(FolderSortStrategy folderSortStrategy) {
        super.mo32733a(folderSortStrategy);
        this.f23565t.mo33136a(m36521e(folderSortStrategy.mo31549b()));
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e.AbstractC8475a
    /* renamed from: b */
    public void mo30965b(boolean z) {
        C13479a.m54764b("ShareFolderView", "onClickGridMenu()...showGrid = " + z);
        C8674q.m36243f().mo33641a(C5234y.m21391b(), z, mo32618m());
        ListAnalysis.m32518a("ccm_space_folder_click", mo32618m(), "", "", "", C8275a.f22370c.mo32555b(), "", true, true, false, 0, "");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: a */
    public C1374g.AbstractC1376a mo32602a(List<Document> list, List<Document> list2) {
        return new ShareFolderItemDiffCallback(list, list2);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: a */
    public C8634d.AbstractC8636b mo32603a(Document document, boolean z) {
        return new C8710ab(this.f23092d.getActivity(), this.f23094f, document, this.f23103o, mo33322A(), mo32618m(), z, this.f23093e);
    }

    ak(Context context, View view, C7718l lVar, C10917c cVar) {
        super(context, view, lVar, cVar);
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListView, com.bytedance.ee.bear.list.list.AbstractC8538g.AbstractC8540b
    /* renamed from: b */
    public void mo32610b(View view, int i, Document document, boolean z) {
        String str;
        boolean z2;
        String g = mo32615g();
        C13479a.m54764b(g, "onRightSlideMenuClick()...position = " + i);
        ((AbstractC8741p.AbstractC8742a) this.f23093e).mo32659c(document);
        String m = mo32618m();
        if (document.mo32456j()) {
            str = "remove_from_favorites";
        } else {
            str = "add_to_favorites";
        }
        String o = document.mo32472o();
        int t = document.mo32483t();
        String C = document.mo32377C();
        if (document.mo32483t() == C8275a.f22370c.mo32555b()) {
            z2 = true;
        } else {
            z2 = false;
        }
        ListAnalysis.m32523a("ccm_space_folder_click", m, "", str, "none", "", o, t, C, "", z2, FolderVersion.isShareFolder(document.an(), document.ap()), false, 0, Boolean.valueOf(mo33350v()), "suspend_create");
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListView, com.bytedance.ee.bear.list.list.AbstractC8538g.AbstractC8540b
    /* renamed from: a */
    public void mo32606a(View view, int i, Document document, boolean z) {
        boolean z2;
        super.mo32606a(view, i, document, z);
        String m = mo32618m();
        String o = document.mo32472o();
        int t = document.mo32483t();
        String C = document.mo32377C();
        if (document.mo32483t() == C8275a.f22370c.mo32555b()) {
            z2 = true;
        } else {
            z2 = false;
        }
        ListAnalysis.m32523a("ccm_space_folder_click", m, "", "more", "ccm_space_right_click_menu_view", "", o, t, C, "", z2, FolderVersion.isShareFolder(document.an(), document.ap()), false, 0, Boolean.valueOf(mo33350v()), "suspend_create");
    }
}
