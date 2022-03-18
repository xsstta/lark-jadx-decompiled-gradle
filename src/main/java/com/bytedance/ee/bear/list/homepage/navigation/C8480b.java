package com.bytedance.ee.bear.list.homepage.navigation;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.route.parcelable.IWiki;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.config.SpaceFeatureGatingV2;
import com.bytedance.ee.bear.list.homepage.AbstractC8459a;
import com.bytedance.ee.bear.list.homepage.navigation.C8477a;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.templates.TemplateReport;
import com.bytedance.ee.bear.widgets.BaseRecyclerView;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p718t.C13742g;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.util.share_preference.C57744a;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.homepage.navigation.b */
public class C8480b extends C7667e {

    /* renamed from: b */
    static final /* synthetic */ boolean f22899b = true;

    /* renamed from: a */
    public final Runnable f22900a = new Runnable() {
        /* class com.bytedance.ee.bear.list.homepage.navigation.$$Lambda$b$7SOmYkvsVzBXbfxsPXQwtdFc7Po */

        public final void run() {
            C8480b.this.m35151f();
        }
    };

    /* renamed from: c */
    private final C10917c f22901c = new C10917c(new C10929e());

    /* renamed from: d */
    private BaseRecyclerView f22902d;

    /* renamed from: e */
    private C8477a f22903e;

    /* renamed from: c */
    private void m35147c() {
        C13742g.m55710c(this.f22900a);
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onDestroy() {
        super.onDestroy();
        m35147c();
    }

    /* renamed from: d */
    private void m35148d() {
        C13479a.m54764b("NavigationFragment", "initView()...");
        m35150e();
    }

    /* renamed from: a */
    public void mo33149a() {
        C13479a.m54764b("NavigationFragment", "reload()...");
        m35150e();
        m35147c();
    }

    /* renamed from: h */
    private String m35153h() {
        if (getParentFragment() instanceof AbstractC8459a) {
            return ((AbstractC8459a) getParentFragment()).mo30967e();
        }
        return "";
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m35151f() {
        if (SpaceFeatureGatingV2.m32622a() && C4211a.m17514a().mo16536a("spacekit.mobile.shared_with_me_onboarding", false)) {
            new C8484e(getActivity(), this.f22903e.mo18916a()).mo33154a();
        }
    }

    /* renamed from: b */
    public void mo33150b() {
        C8477a aVar = this.f22903e;
        if (aVar == null || C13657b.m55421a(aVar.mo70673b())) {
            C13479a.m54764b("NavigationFragment", "reportIconShow()...mAdapter or mAdapter.getData() is null");
        } else {
            ListAnalysis.m32537f(C5234y.m21391b(), m35143a(this.f22903e.mo70673b()));
        }
    }

    /* renamed from: e */
    private void m35150e() {
        C13479a.m54764b("NavigationFragment", "showNavigation()...");
        if (this.f22903e == null) {
            C8477a aVar = new C8477a();
            this.f22903e = aVar;
            aVar.mo33146a((C8477a.AbstractC8479a) new C8477a.AbstractC8479a() {
                /* class com.bytedance.ee.bear.list.homepage.navigation.$$Lambda$b$OxKFiAsDEPOpzjrEthLII5hZiXY */

                @Override // com.bytedance.ee.bear.list.homepage.navigation.C8477a.AbstractC8479a
                public final void onItemClick(View view, int i, C8482c cVar) {
                    C8480b.this.m35144a(view, i, cVar);
                }
            });
            this.f22902d.setAdapter(this.f22903e);
        }
        List<C8482c> g = m35152g();
        this.f22902d.setLayoutManager(new GridLayoutManager(getContext(), m35142a(g.size()), 1, false) {
            /* class com.bytedance.ee.bear.list.homepage.navigation.C8480b.C84811 */

            @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
            public void onLayoutCompleted(RecyclerView.State state) {
                super.onLayoutCompleted(state);
                C13479a.m54764b("NavigationFragment", "onLayoutCompleted()...");
                C13742g.m55706a(C8480b.this.f22900a, 1000);
            }
        });
        this.f22903e.mo70690f(g);
    }

    /* renamed from: g */
    private List<C8482c> m35152g() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C8482c(NavigationEnum.MY_SPACE.id, R.drawable.ud_icon_file_folder_colorful, R.string.Doc_List_My_Space));
        C8482c cVar = new C8482c(NavigationEnum.SHARED_SPACE.id, R.drawable.ud_icon_sharedspace_colorful, R.string.Doc_List_Shared_Space);
        if (SpaceFeatureGatingV2.m32622a()) {
            cVar.mo33152a(R.string.CreationMobile_ECM_ShareWithMe_Tab);
        }
        arrayList.add(cVar);
        if (((IWiki) KoinJavaComponent.m268610a(IWiki.class)).mo21070c() || ((IWiki) KoinJavaComponent.m268610a(IWiki.class)).mo21068b()) {
            z = f22899b;
        } else {
            z = false;
        }
        if (z) {
            arrayList.add(new C8482c(NavigationEnum.WIKI.id, R.drawable.ud_icon_wiki_colorful, R.string.Doc_Facade_Wiki));
        }
        arrayList.add(new C8482c(NavigationEnum.FAVORITE.id, R.drawable.ud_icon_favorites_colorful, R.string.Doc_List_MainTabHomeFavorite));
        arrayList.add(new C8482c(NavigationEnum.MANUAL_OFFLINE.id, R.drawable.ud_icon_offline2_colorful, R.string.Doc_List_OfflineTitle));
        arrayList.add(new C8482c(NavigationEnum.TEMPLATE.id, R.drawable.ud_icon_template_colorful, R.string.CreationMobile_Onboarding_Templates_Button));
        boolean a = C4211a.m17514a().mo16536a("spacekit.mobile.doc_todo_center_enable", false);
        if (a) {
            arrayList.add(new C8482c(NavigationEnum.TODO.id, R.drawable.ic_ig_icon_todo, R.string.CreationMobile_Docs_TaskCenter_Title, C57744a.m224104a().getBoolean("todo", f22899b)));
        }
        C13479a.m54764b("NavigationFragment", "getNavigationItems()...enableWikiHomeInSpace = " + z + ", todoCenter = " + a);
        return arrayList;
    }

    /* renamed from: a */
    private String m35143a(List<C8482c> list) {
        if (list == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            String b = m35146b(list.get(i).mo33151a());
            if (i == list.size() - 1) {
                sb.append(b);
            } else {
                sb.append(b);
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private int m35142a(int i) {
        if (f22899b || getContext() != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            int i2 = displayMetrics.widthPixels;
            int i3 = displayMetrics.heightPixels;
            int a = C57582a.m223600a(80);
            int a2 = C57582a.m223600a(8);
            C13479a.m54764b("NavigationFragment", "calculateLineCount()...screenWidth = " + i2 + ", screenHeight = " + i3 + ", total = " + i);
            if (i > 0 && i <= 4) {
                return 4;
            }
            if (i == 5) {
                return 5;
            }
            if ((a * i) + (a2 * 2) < i2) {
                return i;
            }
            if (i == 6) {
                return 4;
            }
            return 5;
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    private String m35146b(int i) {
        if (i == NavigationEnum.WIKI.id) {
            return "wiki";
        }
        if (i == NavigationEnum.MY_SPACE.id) {
            return "personal";
        }
        if (i == NavigationEnum.SHARED_SPACE.id) {
            return "sharetome";
        }
        if (i == NavigationEnum.FAVORITE.id) {
            return "favorites";
        }
        if (i == NavigationEnum.MANUAL_OFFLINE.id) {
            return "offline";
        }
        if (i == NavigationEnum.TEMPLATE.id) {
            return "template";
        }
        if (i == NavigationEnum.TODO.id) {
            return "todo";
        }
        return "";
    }

    /* renamed from: d */
    private void m35149d(int i) {
        if (i == NavigationEnum.WIKI.id) {
            ListAnalysis.m32517a("home", m35153h(), "wiki", "ccm_space_wiki_page_view", m35153h());
        } else if (i == NavigationEnum.MY_SPACE.id) {
            ListAnalysis.m32517a("home", m35153h(), "personal", "ccm_space_personal_page_view", m35153h());
        } else if (i == NavigationEnum.SHARED_SPACE.id) {
            ListAnalysis.m32517a("home", m35153h(), "shared", "ccm_space_shared_page_view", m35153h());
        } else if (i == NavigationEnum.FAVORITE.id) {
            ListAnalysis.m32517a("home", m35153h(), "favorites", "ccm_space_favorites_page_view", m35153h());
        } else if (i == NavigationEnum.MANUAL_OFFLINE.id) {
            ListAnalysis.m32517a("home", m35153h(), "offline", "ccm_space_offline_page_view", m35153h());
        } else if (i == NavigationEnum.TEMPLATE.id) {
            ListAnalysis.m32517a("home", m35153h(), "templates", "ccm_space_templates_page_view", m35153h());
        } else if (i == NavigationEnum.TODO.id) {
            ListAnalysis.m32517a("home", m35153h(), "todo", "ccm_doc_todo_center_page_view", m35153h());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m35148d();
    }

    /* renamed from: a */
    private void m35145a(C8482c cVar, int i) {
        C13479a.m54764b("NavigationFragment", "onNavigationItemClick()...item = " + cVar.mo33151a());
        AbstractC5233x b = C5234y.m21391b();
        AbstractC10740f fVar = (AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class);
        if (cVar.mo33151a() == NavigationEnum.TEMPLATE.id) {
            TemplateReport.f31011b.mo44233c("from_space_icon");
            C8292f.m34153a(fVar, "home", "", "space_icon", "space_template");
            ListAnalysis.m32504a(b, "template", (String) null, "home", (String) null);
            ListAnalysis.m32526b(b, "template");
        } else if (cVar.mo33151a() == NavigationEnum.TODO.id) {
            C57744a.m224104a().putBoolean("todo", false);
            cVar.mo33153a(false);
            this.f22903e.notifyItemChanged(i);
            fVar.mo17295b("/list/todo/activity").mo17308a("extra_destination", cVar.f22905a).mo17317a();
            ListAnalysis.m32526b(b, "todo");
            ListAnalysis.m32504a(b, "todo", (String) null, "home", (String) null);
        } else {
            fVar.mo17295b("/list/space/activity").mo17308a("extra_destination", cVar.f22905a).mo17317a();
        }
        ListAnalysis.m32539g(b, m35146b(cVar.f22905a));
        m35149d(cVar.f22905a);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C13479a.m54764b("NavigationFragment", "onCreateView()...");
        if (this.f22902d == null) {
            BaseRecyclerView baseRecyclerView = new BaseRecyclerView(getContext());
            this.f22902d = baseRecyclerView;
            baseRecyclerView.setOverScrollMode(2);
            this.f22902d.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        }
        return this.f22902d;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m35144a(View view, int i, C8482c cVar) {
        C13479a.m54764b("NavigationFragment", "onItemClick()...position = " + i + ", item = " + cVar.mo33151a());
        m35145a(cVar, i);
    }
}
