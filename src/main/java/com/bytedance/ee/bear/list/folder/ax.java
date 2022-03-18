package com.bytedance.ee.bear.list.folder;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import androidx.recyclerview.widget.C1374g;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.leanmode.AbstractC5197b;
import com.bytedance.ee.bear.contract.net.C5203d;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.AbstractC7741a;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.DigitDanceHeader;
import com.bytedance.ee.bear.list.AbstractC8651p;
import com.bytedance.ee.bear.list.C8140a;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.C8674q;
import com.bytedance.ee.bear.list.ToCUtil;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.create.C8238f;
import com.bytedance.ee.bear.list.create.C8254n;
import com.bytedance.ee.bear.list.create.SelectCreationMenuConfig;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.list.folder.AbstractC8322ag;
import com.bytedance.ee.bear.list.folder.complaint.FolderForbiddenView;
import com.bytedance.ee.bear.list.homepage.AbstractC8474e;
import com.bytedance.ee.bear.list.homepage.HomeCoordinatorLayout;
import com.bytedance.ee.bear.list.homepage.title.HomeMainTitleBar;
import com.bytedance.ee.bear.list.homepage.title.SubMenuView;
import com.bytedance.ee.bear.list.list.AbstractC8538g;
import com.bytedance.ee.bear.list.list.BaseListView;
import com.bytedance.ee.bear.list.loadstateview.C8594b;
import com.bytedance.ee.bear.list.loadstateview.EmptyCategory;
import com.bytedance.ee.bear.list.loadstateview.LoadFailCategory;
import com.bytedance.ee.bear.list.loadstateview.LoadStateView;
import com.bytedance.ee.bear.list.more.itemv2.C8634d;
import com.bytedance.ee.bear.list.sort.C8787o;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderUserPermission;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.widgets.button.CommonCreateButton;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.ss.ttm.player.MediaPlayer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;

public class ax extends BaseListView<AbstractC8322ag.AbstractC8323a> implements AbstractC8322ag, AbstractC8474e.AbstractC8475a, AbstractC8651p.AbstractC8652a {

    /* renamed from: A */
    private boolean f22499A;

    /* renamed from: B */
    private boolean f22500B;

    /* renamed from: C */
    private final String f22501C;

    /* renamed from: D */
    private final String f22502D;

    /* renamed from: E */
    private final int f22503E;

    /* renamed from: F */
    private ShareFolderUserPermission f22504F;

    /* renamed from: a */
    public Document f22505a;

    /* renamed from: t */
    private HomeMainTitleBar f22506t;

    /* renamed from: u */
    private SubMenuView f22507u;

    /* renamed from: v */
    private View f22508v;

    /* renamed from: w */
    private FolderForbiddenView f22509w;

    /* renamed from: x */
    private CommonCreateButton f22510x;

    /* renamed from: y */
    private final String f22511y;

    /* renamed from: z */
    private final String f22512z;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: g */
    public String mo32615g() {
        return "SubFolderView";
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e.AbstractC8475a
    /* renamed from: h */
    public void mo30969h() {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: f */
    public String mo32614f() {
        return this.f22511y;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: n */
    public String mo32750n() {
        return this.f22511y;
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListView, com.bytedance.ee.bear.list.AbstractC8651p.AbstractC8660i
    /* renamed from: a */
    public void mo30963a(boolean z) {
        super.mo30963a(z);
        this.f22507u.mo33137a(z);
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i, com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: a */
    public void mo32746a(Throwable th) {
        String g = mo32615g();
        C13479a.m54764b(g, "showLoadFail()...throwable = " + th);
        if (C5203d.m21235a(th, 3)) {
            this.f23100l.mo33507a(LoadFailCategory.CATEGORY_FOLDER_NOT_FOUND);
        } else {
            this.f23100l.mo33510a(th);
        }
        m34481P();
    }

    @Override // com.bytedance.ee.bear.list.folder.AbstractC8322ag
    /* renamed from: a */
    public void mo32725a(ShareFolderUserPermission shareFolderUserPermission) {
        this.f22504F = shareFolderUserPermission;
        m34480O();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: R */
    private /* synthetic */ void m34483R() {
        onRefresh(null);
    }

    @Override // com.bytedance.ee.bear.list.common.header.DriveUploadView.AbstractC8225a, com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: c */
    public void mo32244c() {
        super.mo32244c();
        onRefresh(null);
    }

    /* renamed from: H */
    private void m34473H() {
        this.f22510x.setEnabled(m34475J());
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8651p.AbstractC8652a
    /* renamed from: a */
    public void mo32604a() {
        C13479a.m54764b(mo32615g(), "onCreatePersonalFolder()...");
        onRefresh(null);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: m */
    public String mo32618m() {
        if (this.f22500B) {
            return "personal_subfolder";
        }
        return "shared_subfolder";
    }

    /* renamed from: F */
    private void m34471F() {
        SubMenuView subMenuView = (SubMenuView) this.f23091c.findViewById(R.id.home_sub_title_view);
        this.f22507u = subMenuView;
        subMenuView.mo33138b();
        this.f22507u.setViewDelegate(this);
        this.f22507u.mo33137a(this.f23095g);
    }

    /* renamed from: G */
    private void m34472G() {
        CommonCreateButton commonCreateButton = (CommonCreateButton) this.f23091c.findViewById(R.id.common_create_button);
        this.f22510x = commonCreateButton;
        commonCreateButton.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.list.folder.ax.C83291 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                ax.this.mo32748c(false);
            }
        });
        m34473H();
        m34477L();
    }

    /* renamed from: J */
    private boolean m34475J() {
        ShareFolderUserPermission shareFolderUserPermission;
        if (this.f22500B) {
            return true;
        }
        if (!mo33326E() || (shareFolderUserPermission = this.f22504F) == null || !shareFolderUserPermission.canCreateSubNode()) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    private void m34478M() {
        C13479a.m54764b(mo32615g(), "closePopupMenu()...");
        C8238f N = m34479N();
        if (N != null) {
            C13479a.m54764b("SubFolderView", "creationMenu is exist");
            N.mo5513b();
        }
    }

    /* renamed from: O */
    private void m34480O() {
        m34473H();
        if (m34475J()) {
            this.f23100l.mo33506a(EmptyCategory.f23246j);
        }
    }

    /* renamed from: P */
    private void m34481P() {
        boolean z;
        HomeMainTitleBar homeMainTitleBar = this.f22506t;
        if (!this.f22499A || !ToCUtil.f23737a.mo33873a(this.f23103o)) {
            z = false;
        } else {
            z = true;
        }
        homeMainTitleBar.mo33182c(z);
    }

    /* renamed from: L */
    private void m34477L() {
        if (this.f23092d.getActivity() == null) {
            C13479a.m54758a("SubFolderView", "observeCreatePopupMenu()...activity is null");
        } else {
            ((C8254n) aj.m5366a(this.f23092d.getActivity()).mo6005a(C8254n.class)).getSelectedCreationTypeLiveData().mo5923a(this.f23092d, new AbstractC1178x() {
                /* class com.bytedance.ee.bear.list.folder.$$Lambda$ax$ajaS0m5yJNfGhIb2Azj0l2Isk4 */

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    ax.this.m34484a((ax) ((Integer) obj));
                }
            });
        }
    }

    /* renamed from: N */
    private C8238f m34479N() {
        if (this.f23092d.getActivity() == null) {
            return null;
        }
        Fragment findFragmentByTag = this.f23092d.getActivity().getSupportFragmentManager().findFragmentByTag("CreationMenuPanel");
        if (!(findFragmentByTag instanceof C8238f)) {
            return null;
        }
        C13479a.m54764b("SubFolderView", "getCreationMenuPanel()...success");
        return (C8238f) findFragmentByTag;
    }

    /* renamed from: Q */
    private void m34482Q() {
        if (TextUtils.isEmpty(this.f22511y)) {
            ListAnalysis.m32497a(C5234y.m21391b(), mo32618m());
        } else {
            ListAnalysis.m32504a(C5234y.m21391b(), mo32618m(), (String) null, this.f22501C, this.f22502D);
        }
        ListAnalysis.m32526b(C5234y.m21391b(), mo32618m());
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: i */
    public AbstractC8538g mo32616i() {
        AbstractC8538g gVar;
        this.f23102n = null;
        if (this.f23095g) {
            gVar = new C8360g(this.f23094f, mo32618m(), this.f23104p, this.f22499A);
        } else {
            gVar = new C8364j(this.f23094f, mo32618m(), this.f23104p, this.f23101m, this.f22499A);
        }
        mo33329a(gVar);
        mo33332b(gVar);
        return gVar;
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e.AbstractC8475a
    /* renamed from: j */
    public void mo30971j() {
        C13479a.m54764b("SubFolderView", "onClickSortMenu()...");
        if (mo33326E()) {
            Bundle bundle = new Bundle();
            bundle.putString("key_token", mo32614f());
            bundle.putParcelable("key_sort_strategy", this.f23096h);
            C8140a.m32491a(this.f23092d.getActivity(), C8787o.class, bundle);
            return;
        }
        Toast.showFailureText(this.f23090b, this.f23090b.getString(R.string.Doc_Facade_Offline), 0);
    }

    /* renamed from: I */
    private void m34474I() {
        C13479a.m54764b(mo32615g(), "initTitleBar()...");
        HomeMainTitleBar homeMainTitleBar = (HomeMainTitleBar) this.f23091c.findViewById(R.id.list_folder_title_bar);
        this.f22506t = homeMainTitleBar;
        ((HomeCoordinatorLayout) this.f23091c.findViewById(R.id.list_home_coordinator_layout)).setMainTitle(homeMainTitleBar);
        this.f22506t.mo33181c();
        this.f22506t.mo33184d(C4211a.m17514a().mo16536a("spacekit.mobile.single_container_tag_enable", false));
        this.f22506t.setOnMoreViewClickListener(new AbstractView$OnClickListenerC11839e(MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL) {
            /* class com.bytedance.ee.bear.list.folder.ax.C83302 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (ax.this.f22505a != null) {
                    ax axVar = ax.this;
                    axVar.mo32606a(view, -99, axVar.f22505a, true);
                }
            }
        });
        this.f22506t.setTitle(this.f22512z);
        this.f22506t.setOnSearchBtnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.list.folder.ax.C83313 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                ax.this.mo32749e();
            }
        });
        HashMap hashMap = new HashMap();
        hashMap.put("module", mo32618m());
        BaseTitleBar titleBar = this.f22506t.getTitleBar();
        if (titleBar != null) {
            titleBar.setTag(R.id.title_bar_common_params, hashMap);
        }
    }

    /* renamed from: K */
    private SelectCreationMenuConfig m34476K() {
        SelectCreationMenuConfig selectCreationMenuConfig = new SelectCreationMenuConfig();
        selectCreationMenuConfig.mo32298k(((AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class)).mo20801b().mo20777c().f14914a).mo32292h(C8292f.m34174b()).mo32294i(true).mo32296j(C4211a.m17514a().mo16538b("spacekit.mobile.docx_create_enable", false)).mo32290g(true).mo32281c(mo33326E()).mo32277a(m34475J()).mo32279b(m34475J()).mo32283d(m34475J()).mo32288f(m34475J()).mo32286e(m34475J());
        return selectCreationMenuConfig;
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
        this.f22508v = this.f23091c.findViewById(R.id.no_net_container);
        FolderForbiddenView folderForbiddenView = (FolderForbiddenView) this.f23091c.findViewById(R.id.list_folder_forbidden);
        this.f22509w = folderForbiddenView;
        folderForbiddenView.setViewDelegate((FolderForbiddenView.AbstractC8342a) this.f23093e);
        m34474I();
        m34471F();
        m34472G();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: l */
    public void mo32617l() {
        this.f23100l = new C8594b((LoadStateView) this.f23091c.findViewById(R.id.list_state_view_root), Looper.getMainLooper());
        if (m34475J()) {
            this.f23100l.mo33511a(false, EmptyCategory.f23246j);
        } else {
            this.f23100l.mo33511a(false, EmptyCategory.f23247k);
        }
        this.f23100l.mo33509a(new LoadStateView.AbstractC8574f() {
            /* class com.bytedance.ee.bear.list.folder.$$Lambda$ax$uqJpalaVkbbcbjSMZRo6_DGF5j4 */

            @Override // com.bytedance.ee.bear.list.loadstateview.LoadStateView.AbstractC8574f
            public final void onTouchEvent() {
                ax.this.m34483R();
            }
        });
        this.f23100l.mo33508a(new LoadStateView.AbstractC8570b() {
            /* class com.bytedance.ee.bear.list.folder.ax.C83324 */

            @Override // com.bytedance.ee.bear.list.loadstateview.LoadStateView.AbstractC8570b
            /* renamed from: b */
            public void mo32736b() {
            }

            @Override // com.bytedance.ee.bear.list.loadstateview.LoadStateView.AbstractC8570b
            /* renamed from: c */
            public void mo32737c() {
            }

            @Override // com.bytedance.ee.bear.list.loadstateview.LoadStateView.AbstractC8570b
            /* renamed from: a */
            public void mo32735a() {
                ax.this.mo32748c(true);
            }
        });
    }

    /* renamed from: e */
    public void mo32749e() {
        int i;
        String str;
        C13479a.m54764b(mo32615g(), "onSearchClick()...");
        if (TextUtils.isEmpty(this.f22511y)) {
            i = 1;
        } else {
            i = 2;
        }
        C8292f.m34146a(this.f22506t.getTitleSnapshot());
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17295b("/search/space_search/activity").mo17308a("KEY_SEARCH_BAR_DY", this.f22506t.getTitleBarHeight()).mo17308a("KEY_SEARCH_PAGE_TYPE", i).mo17314a("KEY_FOLDER_TOKEN", this.f22511y).mo17306a(R.anim.facade_hold, R.anim.facade_hold).mo17314a("module", mo32618m()).mo17317a();
        String m = mo32618m();
        String str2 = this.f22511y;
        int b = C8275a.f22370c.mo32555b();
        String str3 = this.f22511y;
        boolean z = !this.f22500B;
        boolean z2 = !TextUtils.isEmpty(str3);
        int i2 = this.f22503E;
        Boolean valueOf = Boolean.valueOf(mo33350v());
        if (mo33350v()) {
            str = "middle";
        } else {
            str = "suspend_create";
        }
        ListAnalysis.m32523a("ccm_space_folder_click", m, "", "search", "search_main_view", "", str2, b, "", str3, true, z, z2, i2, valueOf, str);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m34484a(Integer num) {
        m34478M();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: b */
    public C8634d.AbstractC8635a mo32609b(Document document) {
        return new C8369l(document, mo32618m(), "", this.f22511y);
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i, com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: a */
    public void mo32744a(int i) {
        super.mo32744a(i);
        m34481P();
    }

    /* renamed from: e */
    private String m34485e(int i) {
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
    public int mo32743a(ArrayList<Document> arrayList) {
        if (TextUtils.isEmpty(this.f22511y)) {
            return super.mo32743a(arrayList);
        }
        int i = 0;
        if (arrayList != null) {
            Iterator<Document> it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next().mo32483t() != C8275a.f22370c.mo32555b()) {
                    i++;
                }
            }
        }
        return i;
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e.AbstractC8475a
    /* renamed from: b */
    public void mo30965b(boolean z) {
        C13479a.m54764b("SubFolderView", "onClickGridMenu()...showGrid = " + z);
        C8674q.m36243f().mo33641a(C5234y.m21391b(), z, mo32618m());
        ListAnalysis.m32518a("ccm_space_folder_click", mo32618m(), "", "", this.f22511y, C8275a.f22370c.mo32555b(), "", true, this.f22500B ^ true, true, this.f22503E, this.f22511y);
    }

    /* renamed from: c */
    public void mo32748c(boolean z) {
        String str;
        C13479a.m54764b(mo32615g(), "onMenuCreateClick()...");
        C8238f N = m34479N();
        if (N == null || N.v_() == null || !N.v_().isShowing()) {
            Bundle bundle = new Bundle();
            bundle.putString("key_module", mo32618m());
            bundle.putString("key_src_module", this.f22501C);
            bundle.putString("key_parent_token", this.f22511y);
            bundle.putString("key_parent_name", this.f22512z);
            bundle.putParcelable("key_config", m34476K());
            bundle.putBoolean("key_is_folder", !TextUtils.isEmpty(this.f22511y));
            bundle.putBoolean("key_is_from_empty", z);
            bundle.putBoolean("key_folder_version", true);
            C8238f.m33821a(this.f23092d.getActivity(), bundle);
            String m = mo32618m();
            String str2 = this.f22511y;
            int b = C8275a.f22370c.mo32555b();
            String str3 = this.f22511y;
            boolean z2 = !this.f22500B;
            boolean z3 = !TextUtils.isEmpty(str3);
            int i = this.f22503E;
            Boolean valueOf = Boolean.valueOf(mo33350v());
            if (mo33350v()) {
                str = "middle";
            } else {
                str = "suspend_create";
            }
            ListAnalysis.m32523a("ccm_space_folder_click", m, "", "create", "ccm_space_create_new_view", "", str2, b, "", str3, true, z2, z3, i, valueOf, str);
            return;
        }
        C13479a.m54764b("SubFolderView", "create menu is already showing");
        N.mo5513b();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: a */
    public void mo32745a(ConnectionService.NetworkState networkState) {
        int i;
        super.mo32745a(networkState);
        m34473H();
        this.f22506t.setMoreViewEnable(mo33326E());
        View view = this.f22508v;
        if (networkState.mo20041b()) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        this.f22507u.setOffline(!networkState.mo20041b());
        if (!mo33326E()) {
            this.f22509w.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: a */
    public void mo32733a(FolderSortStrategy folderSortStrategy) {
        super.mo32733a(folderSortStrategy);
        this.f22507u.mo33136a(m34485e(folderSortStrategy.mo31549b()));
    }

    @Override // com.bytedance.ee.bear.list.folder.AbstractC8322ag
    /* renamed from: a */
    public void mo32723a(Document document) {
        boolean z;
        if (this.f22505a == null) {
            z = true;
        } else {
            z = false;
        }
        this.f22505a = document;
        if (document != null) {
            this.f22499A = document.mo32400P();
            this.f22500B = FolderVersion.isPersonalFolder(document.an(), document.ap());
            if (this.f23102n instanceof C8364j) {
                ((C8364j) this.f23102n).mo32805a(this.f22499A);
                this.f23102n.notifyDataSetChanged();
            }
            if (this.f23102n instanceof C8360g) {
                ((C8360g) this.f23102n).mo32800a(this.f22499A);
                this.f23102n.notifyDataSetChanged();
            }
            this.f22506t.setTitle(C8292f.m34193g(this.f23090b, document));
            m34481P();
            m34480O();
        }
        if (z) {
            m34482Q();
            ListAnalysis.m32524a(mo32618m(), this.f22511y, true ^ this.f22500B);
        }
    }

    @Override // com.bytedance.ee.bear.list.folder.AbstractC8322ag
    /* renamed from: a */
    public void mo32724a(FolderForbiddenView.ForbiddenState forbiddenState) {
        this.f22509w.mo32779a(forbiddenState);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: a */
    public C1374g.AbstractC1376a mo32602a(List<Document> list, List<Document> list2) {
        return new FolderDetailItemDiffCallback(list, list2);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: b */
    public C8634d.AbstractC8636b mo32734b(Document document, boolean z) {
        return new au(this.f23092d, this.f23094f, document, this.f23103o, z, mo32618m(), this.f22511y, this.f22504F, !this.f22500B);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: c */
    public void mo32747c(Document document, boolean z) {
        new C8634d(this.f23092d, this.f23094f, document, mo32609b(document), mo32603a(document, z), mo32734b(document, z), this.f22504F).mo33583a();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: a */
    public C8634d.AbstractC8636b mo32603a(Document document, boolean z) {
        return new C8328at(this.f23092d.getActivity(), this.f23094f, document, this.f23103o, mo33322A(), mo32618m(), z, this.f22511y, this.f22504F, this.f23093e);
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListView, com.bytedance.ee.bear.list.list.AbstractC8538g.AbstractC8540b
    /* renamed from: b */
    public void mo32610b(View view, int i, Document document, boolean z) {
        boolean z2;
        String str;
        super.mo32610b(view, i, document, z);
        String m = mo32618m();
        String o = document.mo32472o();
        int t = document.mo32483t();
        String C = document.mo32377C();
        String str2 = this.f22511y;
        if (document.mo32483t() == C8275a.f22370c.mo32555b()) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean isShareFolder = FolderVersion.isShareFolder(document.an(), document.ap());
        boolean z3 = !TextUtils.isEmpty(this.f22511y);
        int i2 = this.f22503E;
        Boolean valueOf = Boolean.valueOf(mo33350v());
        if (mo33350v()) {
            str = "middle";
        } else {
            str = "suspend_create";
        }
        ListAnalysis.m32523a("ccm_space_folder_click", m, "", "delete", "ccm_space_delete_view", "", o, t, C, str2, z2, isShareFolder, z3, i2, valueOf, str);
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListView, com.bytedance.ee.bear.list.list.AbstractC8538g.AbstractC8540b
    /* renamed from: a */
    public void mo32606a(View view, int i, Document document, boolean z) {
        boolean z2;
        String str;
        super.mo32606a(view, i, document, z);
        String m = mo32618m();
        String o = document.mo32472o();
        int t = document.mo32483t();
        String C = document.mo32377C();
        String str2 = this.f22511y;
        if (document.mo32483t() == C8275a.f22370c.mo32555b()) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean isShareFolder = FolderVersion.isShareFolder(document.an(), document.ap());
        boolean z3 = !TextUtils.isEmpty(this.f22511y);
        int i2 = this.f22503E;
        Boolean valueOf = Boolean.valueOf(mo33350v());
        if (mo33350v()) {
            str = "middle";
        } else {
            str = "suspend_create";
        }
        ListAnalysis.m32523a("ccm_space_folder_click", m, "", "more", "ccm_space_right_click_menu_view", "", o, t, C, str2, z2, isShareFolder, z3, i2, valueOf, str);
    }

    ax(Context context, View view, C7718l lVar, C10917c cVar, String str, String str2, boolean z, boolean z2, String str3, String str4, int i) {
        super(context, view, lVar, cVar);
        this.f22511y = str;
        this.f22512z = str2;
        this.f22499A = z;
        this.f22500B = z2;
        this.f22501C = str3;
        this.f22502D = str4;
        this.f22503E = i;
    }
}
