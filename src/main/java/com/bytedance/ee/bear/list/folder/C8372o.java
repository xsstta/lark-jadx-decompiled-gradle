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
import com.bytedance.ee.bear.lark.p414b.AbstractC7993f;
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
import com.bytedance.ee.bear.list.folder.AbstractC8317ac;
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

/* renamed from: com.bytedance.ee.bear.list.folder.o */
public class C8372o extends BaseListView<AbstractC8317ac.AbstractC8318a> implements AbstractC8317ac, AbstractC8474e.AbstractC8475a, AbstractC8651p.AbstractC8652a {

    /* renamed from: A */
    private int f22599A;

    /* renamed from: B */
    private boolean f22600B;

    /* renamed from: C */
    private boolean f22601C;

    /* renamed from: D */
    private final String f22602D;

    /* renamed from: E */
    private final String f22603E;

    /* renamed from: F */
    private final int f22604F;

    /* renamed from: a */
    public Document f22605a;

    /* renamed from: t */
    private HomeMainTitleBar f22606t;

    /* renamed from: u */
    private SubMenuView f22607u;

    /* renamed from: v */
    private View f22608v;

    /* renamed from: w */
    private FolderForbiddenView f22609w;

    /* renamed from: x */
    private CommonCreateButton f22610x;

    /* renamed from: y */
    private final String f22611y;

    /* renamed from: z */
    private final String f22612z;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: g */
    public String mo32615g() {
        return "FolderDetailView";
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e.AbstractC8475a
    /* renamed from: h */
    public void mo30969h() {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: n */
    public String mo32750n() {
        return this.f22611y;
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListView, com.bytedance.ee.bear.list.AbstractC8651p.AbstractC8660i
    /* renamed from: a */
    public void mo30963a(boolean z) {
        super.mo30963a(z);
        this.f22607u.mo33137a(z);
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
        m34661O();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: Q */
    private /* synthetic */ void m34663Q() {
        onRefresh(null);
    }

    @Override // com.bytedance.ee.bear.list.common.header.DriveUploadView.AbstractC8225a, com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: c */
    public void mo32244c() {
        super.mo32244c();
        onRefresh(null);
    }

    /* renamed from: H */
    private void m34654H() {
        this.f22610x.setEnabled(m34656J());
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8651p.AbstractC8652a
    /* renamed from: a */
    public void mo32604a() {
        C13479a.m54764b(mo32615g(), "onCreatePersonalFolder()...");
        onRefresh(null);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: f */
    public String mo32614f() {
        if (TextUtils.isEmpty(this.f22611y)) {
            return "root";
        }
        return this.f22611y;
    }

    /* renamed from: F */
    private void m34652F() {
        SubMenuView subMenuView = (SubMenuView) this.f23091c.findViewById(R.id.home_sub_title_view);
        this.f22607u = subMenuView;
        subMenuView.mo33138b();
        this.f22607u.setViewDelegate(this);
        this.f22607u.mo33137a(this.f23095g);
    }

    /* renamed from: G */
    private void m34653G() {
        CommonCreateButton commonCreateButton = (CommonCreateButton) this.f23091c.findViewById(R.id.common_create_button);
        this.f22610x = commonCreateButton;
        commonCreateButton.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.list.folder.C8372o.C83731 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C8372o.this.mo32748c(false);
            }
        });
        m34654H();
        m34658L();
    }

    /* renamed from: J */
    private boolean m34656J() {
        if (this.f22601C) {
            return true;
        }
        if (!mo33326E() || this.f22599A != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    private void m34659M() {
        C13479a.m54764b(mo32615g(), "closePopupMenu()...");
        C8238f N = m34660N();
        if (N != null) {
            C13479a.m54764b("FolderDetailView", "creationMenu is exist");
            N.mo5513b();
        }
    }

    /* renamed from: O */
    private void m34661O() {
        boolean z;
        HomeMainTitleBar homeMainTitleBar = this.f22606t;
        if (!this.f22600B || !ToCUtil.f23737a.mo33873a(this.f23103o)) {
            z = false;
        } else {
            z = true;
        }
        homeMainTitleBar.mo33182c(z);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: k */
    public String mo32810k() {
        if (TextUtils.isEmpty(this.f22611y)) {
            return this.f23090b.getString(R.string.Doc_List_FolderRefreshTips);
        }
        return super.mo32810k();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: m */
    public String mo32618m() {
        if (TextUtils.isEmpty(this.f22611y)) {
            return "personal_folder_root";
        }
        if (this.f22601C) {
            return "personal_subfolder";
        }
        return "shared_subfolder";
    }

    /* renamed from: L */
    private void m34658L() {
        if (this.f23092d.getActivity() == null) {
            C13479a.m54758a("FolderDetailView", "observeCreatePopupMenu()...activity is null");
        } else {
            ((C8254n) aj.m5366a(this.f23092d.getActivity()).mo6005a(C8254n.class)).getSelectedCreationTypeLiveData().mo5923a(this.f23092d, new AbstractC1178x() {
                /* class com.bytedance.ee.bear.list.folder.$$Lambda$o$nU2cNQQsX6O0t_OLITnF7s3M7_k */

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    C8372o.this.m34664a((C8372o) ((Integer) obj));
                }
            });
        }
    }

    /* renamed from: N */
    private C8238f m34660N() {
        if (this.f23092d.getActivity() == null) {
            return null;
        }
        Fragment findFragmentByTag = this.f23092d.getActivity().getSupportFragmentManager().findFragmentByTag("CreationMenuPanel");
        if (!(findFragmentByTag instanceof C8238f)) {
            return null;
        }
        C13479a.m54764b("FolderDetailView", "getCreationMenuPanel()...success");
        return (C8238f) findFragmentByTag;
    }

    /* renamed from: P */
    private void m34662P() {
        if (TextUtils.isEmpty(this.f22611y)) {
            ListAnalysis.m32497a(C5234y.m21391b(), mo32618m());
        } else {
            ListAnalysis.m32504a(C5234y.m21391b(), mo32618m(), (String) null, this.f22602D, this.f22603E);
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
            gVar = new C8360g(this.f23094f, mo32618m(), this.f23104p, this.f22600B);
            ((C8360g) gVar).mo32797a((ao) this);
        } else {
            gVar = new C8364j(this.f23094f, mo32618m(), this.f23104p, this.f23101m, this.f22600B);
            ((C8364j) gVar).mo32802a((ao) this);
        }
        mo33329a(gVar);
        mo33332b(gVar);
        return gVar;
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e.AbstractC8475a
    /* renamed from: j */
    public void mo30971j() {
        C13479a.m54764b("FolderDetailView", "onClickSortMenu()...");
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
    private void m34655I() {
        C13479a.m54764b(mo32615g(), "initTitleBar()...");
        HomeMainTitleBar homeMainTitleBar = (HomeMainTitleBar) this.f23091c.findViewById(R.id.list_folder_title_bar);
        this.f22606t = homeMainTitleBar;
        ((HomeCoordinatorLayout) this.f23091c.findViewById(R.id.list_home_coordinator_layout)).setMainTitle(homeMainTitleBar);
        if (TextUtils.isEmpty(this.f22611y)) {
            this.f22606t.mo33179b();
        } else {
            this.f22606t.mo33181c();
        }
        this.f22606t.setOnMoreViewClickListener(new AbstractView$OnClickListenerC11839e(MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL) {
            /* class com.bytedance.ee.bear.list.folder.C8372o.C83742 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C8372o.this.f22605a != null) {
                    C8372o oVar = C8372o.this;
                    oVar.mo32606a(view, -99, oVar.f22605a, true);
                }
            }
        });
        this.f22606t.setTitle(this.f22612z);
        this.f22606t.setOnSearchBtnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.list.folder.C8372o.C83753 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C8372o.this.mo32749e();
            }
        });
        HashMap hashMap = new HashMap();
        hashMap.put("module", mo32618m());
        BaseTitleBar titleBar = this.f22606t.getTitleBar();
        if (titleBar != null) {
            titleBar.setTag(R.id.title_bar_common_params, hashMap);
        }
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
        this.f22608v = this.f23091c.findViewById(R.id.no_net_container);
        FolderForbiddenView folderForbiddenView = (FolderForbiddenView) this.f23091c.findViewById(R.id.list_folder_forbidden);
        this.f22609w = folderForbiddenView;
        folderForbiddenView.setViewDelegate((FolderForbiddenView.AbstractC8342a) this.f23093e);
        m34655I();
        m34652F();
        m34653G();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: l */
    public void mo32617l() {
        this.f23100l = new C8594b((LoadStateView) this.f23091c.findViewById(R.id.list_state_view_root), Looper.getMainLooper());
        if (m34656J()) {
            this.f23100l.mo33511a(false, EmptyCategory.f23246j);
        } else {
            this.f23100l.mo33511a(false, EmptyCategory.f23247k);
        }
        this.f23100l.mo33509a(new LoadStateView.AbstractC8574f() {
            /* class com.bytedance.ee.bear.list.folder.$$Lambda$o$rknvIV0TT7REoehceQNB23jGw_c */

            @Override // com.bytedance.ee.bear.list.loadstateview.LoadStateView.AbstractC8574f
            public final void onTouchEvent() {
                C8372o.this.m34663Q();
            }
        });
        this.f23100l.mo33508a(new LoadStateView.AbstractC8570b() {
            /* class com.bytedance.ee.bear.list.folder.C8372o.C83764 */

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
                C8372o.this.mo32748c(true);
            }
        });
    }

    /* renamed from: K */
    private SelectCreationMenuConfig m34657K() {
        boolean z;
        boolean e = ((AbstractC7993f) KoinJavaComponent.m268610a(AbstractC7993f.class)).mo30993e();
        SelectCreationMenuConfig selectCreationMenuConfig = new SelectCreationMenuConfig();
        SelectCreationMenuConfig h = selectCreationMenuConfig.mo32298k(((AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class)).mo20801b().mo20777c().f14914a).mo32292h(C8292f.m34174b());
        if (!e || C4211a.m17514a().mo16536a("ccm.spacekit.bitable.enable", false)) {
            z = true;
        } else {
            z = false;
        }
        h.mo32294i(z).mo32296j(C4211a.m17514a().mo16538b("spacekit.mobile.docx_create_enable", false)).mo32290g(true).mo32281c(mo33326E()).mo32277a(m34656J()).mo32279b(m34656J()).mo32283d(m34656J()).mo32288f(m34656J()).mo32286e(m34656J());
        return selectCreationMenuConfig;
    }

    /* renamed from: e */
    public void mo32749e() {
        int i;
        String str;
        C13479a.m54764b(mo32615g(), "onSearchClick()...");
        if (TextUtils.isEmpty(this.f22611y)) {
            i = 1;
        } else {
            i = 2;
        }
        C8292f.m34146a(this.f22606t.getTitleSnapshot());
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17295b("/search/space_search/activity").mo17308a("KEY_SEARCH_BAR_DY", this.f22606t.getTitleBarHeight()).mo17308a("KEY_SEARCH_PAGE_TYPE", i).mo17314a("KEY_FOLDER_TOKEN", this.f22611y).mo17306a(R.anim.facade_hold, R.anim.facade_hold).mo17314a("module", mo32618m()).mo17317a();
        String m = mo32618m();
        String str2 = this.f22611y;
        int b = C8275a.f22370c.mo32555b();
        String str3 = this.f22611y;
        boolean z = !this.f22601C;
        boolean z2 = !TextUtils.isEmpty(str3);
        int i2 = this.f22604F;
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
    private /* synthetic */ void m34664a(Integer num) {
        m34659M();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: b */
    public C8634d.AbstractC8635a mo32609b(Document document) {
        return new C8369l(document, mo32618m(), "", this.f22611y);
    }

    /* renamed from: e */
    private String m34665e(int i) {
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
        if (TextUtils.isEmpty(this.f22611y)) {
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
        C8674q.m36243f().mo33641a(C5234y.m21391b(), z, mo32618m());
        ListAnalysis.m32518a("ccm_space_folder_click", mo32618m(), "", "", this.f22611y, C8275a.f22370c.mo32555b(), "", true, !this.f22601C, !TextUtils.isEmpty(this.f22611y), this.f22604F, this.f22611y);
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i, com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: a */
    public void mo32744a(int i) {
        super.mo32744a(i);
        m34661O();
    }

    /* renamed from: c */
    public void mo32748c(boolean z) {
        String str;
        C13479a.m54764b(mo32615g(), "onMenuCreateClick()...");
        C8238f N = m34660N();
        if (N == null || N.v_() == null || !N.v_().isShowing()) {
            Bundle bundle = new Bundle();
            bundle.putString("key_module", mo32618m());
            bundle.putString("key_src_module", this.f22602D);
            bundle.putString("key_parent_token", this.f22611y);
            bundle.putString("key_parent_name", this.f22612z);
            bundle.putParcelable("key_config", m34657K());
            bundle.putBoolean("key_is_folder", !TextUtils.isEmpty(this.f22611y));
            bundle.putBoolean("key_is_from_empty", z);
            bundle.putBoolean("key_folder_version", false);
            C8238f.m33821a(this.f23092d.getActivity(), bundle);
            String m = mo32618m();
            String str2 = this.f22611y;
            int b = C8275a.f22370c.mo32555b();
            String str3 = this.f22611y;
            boolean z2 = !this.f22601C;
            boolean z3 = !TextUtils.isEmpty(str3);
            int i = this.f22604F;
            Boolean valueOf = Boolean.valueOf(mo33350v());
            if (mo33350v()) {
                str = "middle";
            } else {
                str = "suspend_create";
            }
            ListAnalysis.m32523a("ccm_space_folder_click", m, "", "create", "ccm_space_create_new_view", "", str2, b, "", str3, true, z2, z3, i, valueOf, str);
            return;
        }
        C13479a.m54764b("FolderDetailView", "create menu is already showing");
        N.mo5513b();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: a */
    public void mo32745a(ConnectionService.NetworkState networkState) {
        int i;
        super.mo32745a(networkState);
        m34654H();
        this.f22606t.setMoreViewEnable(mo33326E());
        View view = this.f22608v;
        if (networkState.mo20041b()) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        this.f22607u.setOffline(!networkState.mo20041b());
        if (!mo33326E()) {
            this.f22609w.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: a */
    public void mo32733a(FolderSortStrategy folderSortStrategy) {
        super.mo32733a(folderSortStrategy);
        this.f22607u.mo33136a(m34665e(folderSortStrategy.mo31549b()));
    }

    @Override // com.bytedance.ee.bear.list.folder.AbstractC8317ac
    /* renamed from: a */
    public void mo32713a(Document document) {
        boolean z;
        if (this.f22605a == null) {
            z = true;
        } else {
            z = false;
        }
        this.f22605a = document;
        if (document != null) {
            this.f22599A = document.mo32398N();
            this.f22600B = document.mo32400P();
            this.f22601C = FolderVersion.isPersonalFolder(document.an(), document.ap());
            if (this.f23102n instanceof C8364j) {
                ((C8364j) this.f23102n).mo32805a(this.f22600B);
                this.f23102n.notifyDataSetChanged();
            }
            if (this.f23102n instanceof C8360g) {
                ((C8360g) this.f23102n).mo32800a(this.f22600B);
                this.f23102n.notifyDataSetChanged();
            }
            if (document.mo32483t() != 4) {
                this.f22606t.setTitle(C8292f.m34193g(this.f23090b, document));
            }
            m34654H();
            m34661O();
            if (m34656J()) {
                this.f23100l.mo33506a(EmptyCategory.f23246j);
            }
        }
        if (z) {
            m34662P();
            ListAnalysis.m32524a(mo32618m(), this.f22611y, true ^ this.f22601C);
        }
    }

    @Override // com.bytedance.ee.bear.list.folder.AbstractC8317ac
    /* renamed from: a */
    public void mo32714a(FolderForbiddenView.ForbiddenState forbiddenState) {
        C13479a.m54764b("FolderDetailView", "showForbidden()...state = " + forbiddenState.ordinal());
        this.f22609w.mo32779a(forbiddenState);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: a */
    public C1374g.AbstractC1376a mo32602a(List<Document> list, List<Document> list2) {
        return new FolderDetailItemDiffCallback(list, list2);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: a */
    public C8634d.AbstractC8636b mo32603a(Document document, boolean z) {
        return new C8359f(this.f23092d.getActivity(), this.f23094f, document, this.f23103o, mo33322A(), mo32618m(), z, this.f23093e);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListView
    /* renamed from: b */
    public C8634d.AbstractC8636b mo32734b(Document document, boolean z) {
        return new C8363i(this.f23092d, this.f23094f, document, this.f23103o, z, mo32618m(), this.f22611y);
    }

    @Override // com.bytedance.ee.bear.list.folder.ao
    /* renamed from: c */
    public void mo32738c(View view, int i, Document document, boolean z) {
        ((AbstractC8317ac.AbstractC8318a) this.f23093e).mo32649a(view, i, document, z);
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
        String str2 = this.f22611y;
        if (document.mo32483t() == C8275a.f22370c.mo32555b()) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean isShareFolder = FolderVersion.isShareFolder(document.an(), document.ap());
        boolean z3 = !TextUtils.isEmpty(this.f22611y);
        int i2 = this.f22604F;
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
        String str2 = this.f22611y;
        if (document.mo32483t() == C8275a.f22370c.mo32555b()) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean isShareFolder = FolderVersion.isShareFolder(document.an(), document.ap());
        boolean z3 = !TextUtils.isEmpty(this.f22611y);
        int i2 = this.f22604F;
        Boolean valueOf = Boolean.valueOf(mo33350v());
        if (mo33350v()) {
            str = "middle";
        } else {
            str = "suspend_create";
        }
        ListAnalysis.m32523a("ccm_space_folder_click", m, "", "more", "ccm_space_right_click_menu_view", "", o, t, C, str2, z2, isShareFolder, z3, i2, valueOf, str);
    }

    C8372o(Context context, View view, C7718l lVar, C10917c cVar, String str, String str2, int i, boolean z, boolean z2, String str3, String str4, int i2) {
        super(context, view, lVar, cVar);
        this.f22611y = str;
        this.f22612z = str2;
        this.f22599A = i;
        this.f22600B = z;
        this.f22601C = z2;
        this.f22602D = str3;
        this.f22603E = str4;
        this.f22604F = i2;
    }
}
