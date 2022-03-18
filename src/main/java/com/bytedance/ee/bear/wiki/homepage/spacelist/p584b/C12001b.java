package com.bytedance.ee.bear.wiki.homepage.spacelist.p584b;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.contract.route.parcelable.WikiDocument;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.list.cache.C8213o;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.bytedance.ee.bear.wiki.common.p580b.C11933b;
import com.bytedance.ee.bear.wiki.homepage.spacelist.p583a.AbstractC11994a;
import com.bytedance.ee.bear.wiki.homepage.spacelist.p583a.C11996b;
import com.bytedance.ee.bear.wiki.homepage.spacelist.p584b.p585a.C11998a;
import com.bytedance.ee.bear.wiki.search.C12033c;
import com.bytedance.ee.bear.wiki.search.C12040e;
import com.bytedance.ee.bear.wiki.search.C12041f;
import com.bytedance.ee.bear.wiki.search.SearchMode;
import com.bytedance.ee.bear.wiki.search.WikiSearchView;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13727b;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.wiki.homepage.spacelist.b.b */
public class C12001b extends C7667e implements AbstractC11997a {

    /* renamed from: a */
    public int f32398a;

    /* renamed from: b */
    public LinearLayout f32399b;

    /* renamed from: c */
    public FrameLayout f32400c;

    /* renamed from: d */
    public C11998a f32401d;

    /* renamed from: e */
    public FrameLayout f32402e;

    /* renamed from: f */
    public WikiSearchView f32403f;

    /* renamed from: g */
    public C12040e f32404g;

    /* renamed from: h */
    public boolean f32405h;

    /* renamed from: i */
    private List<Document> f32406i = new ArrayList();

    /* renamed from: j */
    private BaseTitleBar f32407j;

    /* renamed from: k */
    private RecyclerView f32408k;

    /* renamed from: l */
    private SpaceEmptyState f32409l;

    /* renamed from: m */
    private LiveData<ConnectionService.NetworkState> f32410m;

    /* renamed from: n */
    private ConnectionService f32411n;

    /* renamed from: o */
    private C12007a f32412o;

    /* renamed from: p */
    private AbstractC11994a f32413p;

    /* renamed from: q */
    private int f32414q;

    /* renamed from: a */
    public void mo45962a(List<C8213o> list) {
        if (CollectionUtils.isEmpty(list)) {
            this.f32408k.setVisibility(8);
            this.f32409l.setVisibility(0);
            return;
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f32401d = new C11998a(this, ar.m20936a());
        this.f32408k.setLayoutManager(linearLayoutManager);
        this.f32408k.setAdapter(this.f32401d);
        this.f32401d.mo45958a(list);
        this.f32401d.mo45956a(new C11998a.AbstractC11999a(list) {
            /* class com.bytedance.ee.bear.wiki.homepage.spacelist.p584b.$$Lambda$b$U0Q0ACORsH5nzvuiQ2JYfMzjY1Y */
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.bytedance.ee.bear.wiki.homepage.spacelist.p584b.p585a.C11998a.AbstractC11999a
            public final void onSpaceItemClick(View view, int i, C8213o oVar) {
                C12001b.m49774a(this.f$0, view, i, oVar);
            }
        });
        this.f32409l.setVisibility(8);
        if (this.f32398a == 1) {
            this.f32407j.setTitle(getText(R.string.Doc_Wiki_CreatePage));
            this.f32401d.mo45956a(new C11998a.AbstractC11999a() {
                /* class com.bytedance.ee.bear.wiki.homepage.spacelist.p584b.$$Lambda$b$EC9X5_ItrK299ecxRAzP1qkHjwc */

                @Override // com.bytedance.ee.bear.wiki.homepage.spacelist.p584b.p585a.C11998a.AbstractC11999a
                public final void onSpaceItemClick(View view, int i, C8213o oVar) {
                    C12001b.this.m49773a((C12001b) view, (View) i, (int) oVar);
                }
            });
        }
    }

    @Override // com.bytedance.ee.bear.wiki.homepage.spacelist.p584b.AbstractC11997a
    /* renamed from: a */
    public boolean mo45952a() {
        LiveData<ConnectionService.NetworkState> liveData = this.f32410m;
        return (liveData == null || liveData.mo5927b() == null || !this.f32410m.mo5927b().mo20041b()) ? false : true;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: g */
    private /* synthetic */ void m49783g() {
        this.f32404g.cancelSearch();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: h */
    private /* synthetic */ void m49784h() {
        this.f32404g.loadNextPage();
    }

    /* renamed from: f */
    private void m49782f() {
        this.f32404g.getWikiTreeSearchResult().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.wiki.homepage.spacelist.p584b.$$Lambda$b$7e3F3RSFpxQsZI0lzb8DSDJ9iQ */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C12001b.this.m49779c((C12001b) ((List) obj));
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f32413p.mo45946a(new AbstractC11994a.AbstractC11995a() {
            /* class com.bytedance.ee.bear.wiki.homepage.spacelist.p584b.$$Lambda$b$z2jQhwGdLErMyNrYKhbOmZwU9Ck */

            @Override // com.bytedance.ee.bear.wiki.homepage.spacelist.p583a.AbstractC11994a.AbstractC11995a
            public final void onSpaceLoaded(List list) {
                C12001b.this.m49777b((C12001b) list);
            }
        });
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f32410m.mo5928b(this.f32412o);
        C13479a.m54758a("WikiAllSpaceFragment", "onDestroy Fragment");
    }

    /* renamed from: b */
    private void m49775b() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f32398a = arguments.getInt("EXTRA_PAGE_MODE", 0);
            ArrayList parcelableArrayList = arguments.getParcelableArrayList("space_list_data");
            if (parcelableArrayList != null) {
                this.f32406i.addAll(parcelableArrayList);
            }
            this.f32414q = arguments.getInt("createDocumentType");
        }
    }

    /* renamed from: c */
    private void m49778c() {
        this.f32413p = new C11996b();
        ConnectionService d = C5084ad.m20847d();
        this.f32411n = d;
        this.f32410m = d.mo20037a();
        C12007a aVar = new C12007a();
        this.f32412o = aVar;
        this.f32410m.mo5923a(this, aVar);
    }

    /* renamed from: d */
    private void m49780d() {
        this.f32402e.setTranslationY((float) C13749l.m55738a(45));
        m49771a(C13749l.m55738a(92));
        this.f32402e.setVisibility(0);
        this.f32403f.setSearchTextViewEnabled(true);
        this.f32403f.setSearchTextViewText(R.string.Doc_Wiki_SearchWorkspace);
        this.f32403f.setSearchEditTextHint(R.string.Doc_Wiki_SearchWorkspace);
    }

    /* renamed from: e */
    private void m49781e() {
        this.f32404g = C12041f.m49866a(this, (NetService) KoinJavaComponent.m268610a(NetService.class));
        this.f32403f.mo45990a(ar.m20936a(), getActivity(), SearchMode.SPACE_SEARCH_MODE);
        mo45961a(getActivity(), ar.m20936a());
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d, com.bytedance.ee.bear.facade.common.C7667e
    public boolean onBackPressed() {
        if (!this.f32405h) {
            return false;
        }
        this.f32404g.cancelSearch();
        this.f32400c.setVisibility(0);
        this.f32403f.mo46006j();
        mo45960a((float) C13749l.m55738a(0), (float) C13749l.m55738a(45));
        this.f32403f.mo46014p();
        this.f32403f.mo46009m();
        this.f32405h = false;
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.wiki.homepage.spacelist.b.b$a */
    public class C12007a implements AbstractC1178x<ConnectionService.NetworkState> {
        private C12007a() {
        }

        /* renamed from: a */
        public void onChanged(ConnectionService.NetworkState networkState) {
            if (networkState != null && C12001b.this.f32401d != null) {
                C13479a.m54764b("WikiAllSpaceFragment", "net work status changed, refresh space list");
                C12001b.this.f32401d.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: a */
    private void m49771a(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f32400c.getLayoutParams();
        layoutParams.topMargin = i;
        this.f32400c.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m49776b(String str) {
        C13479a.m54764b("WikiSearchTAG", "onSearchResultFromServer ...");
        if (TextUtils.isEmpty(str)) {
            C13479a.m54758a("WikiSearchTAG", "wiki tree search query key == null or key == \"\" ...");
        } else {
            this.f32404g.wikiSearch(str, "", 2, 0);
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        C13479a.m54764b("WikiAllSpaceFragment", "onCreate");
        super.onCreate(bundle);
        m49775b();
        m49778c();
    }

    /* renamed from: a */
    public WikiDocument mo45959a(String str) {
        for (Document document : this.f32406i) {
            if (TextUtils.equals(document.mo32399O(), str)) {
                return (WikiDocument) document;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m49772a(View view) {
        this.f32399b = (LinearLayout) view.findViewById(R.id.wiki_all_space_title_bar_layout);
        BaseTitleBar baseTitleBar = (BaseTitleBar) view.findViewById(R.id.wiki_all_space_list_title_bar);
        this.f32407j = baseTitleBar;
        baseTitleBar.setTitle(getString(R.string.Doc_Wiki_Home_Title));
        this.f32407j.setDividerVisible(false);
        HashMap hashMap = new HashMap();
        hashMap.put("module", "wiki_home");
        this.f32407j.setTag(R.id.title_bar_common_params, hashMap);
        this.f32400c = (FrameLayout) view.findViewById(R.id.wiki_all_space_content_layout);
        this.f32408k = (RecyclerView) view.findViewById(R.id.wiki_all_space_list_recycler_view);
        this.f32409l = (SpaceEmptyState) view.findViewById(R.id.ud_empty_no_network_state);
        this.f32402e = (FrameLayout) view.findViewById(R.id.wiki_all_space_search_layout);
        WikiSearchView wikiSearchView = (WikiSearchView) view.findViewById(R.id.wiki_all_space_search_view);
        this.f32403f = wikiSearchView;
        wikiSearchView.mo45988a(0);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private void m49777b(List<Document> list) {
        C11998a aVar = this.f32401d;
        if (aVar != null) {
            this.f32406i = list;
            aVar.mo45958a(this.f32413p.mo45945a(list));
            this.f32401d.mo45955a();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m49779c(List list) {
        this.f32403f.mo45994c();
        if (!CollectionUtils.isEmpty(list)) {
            boolean e = ((C12033c) list.get(0)).mo46048e();
            C13479a.m54764b("WikiSearchTAG", "has search result, set enable load more = " + e);
            this.f32403f.setRefreshLayoutEnableLoadMore(e);
        }
        this.f32403f.mo45992a(list);
    }

    /* renamed from: a */
    public void mo45960a(float f, final float f2) {
        ValueAnimator e = C13727b.m55687e(this.f32402e, f, f2, LocationRequest.PRIORITY_HD_ACCURACY);
        e.addListener(new Animator.AnimatorListener() {
            /* class com.bytedance.ee.bear.wiki.homepage.spacelist.p584b.C12001b.C120065 */

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                C13479a.m54764b("WikiSearchTAG", "animation end ......");
                if (f2 == BitmapDescriptorFactory.HUE_RED) {
                    C12001b.this.f32403f.mo46008l();
                    return;
                }
                C12001b.this.f32400c.setVisibility(0);
                C12001b.this.f32403f.mo46014p();
            }
        });
        e.start();
    }

    /* renamed from: a */
    public void mo45961a(Activity activity, C10917c cVar) {
        this.f32403f.setOnCancelInputClickListener(new WikiSearchView.AbstractC12023b() {
            /* class com.bytedance.ee.bear.wiki.homepage.spacelist.p584b.C12001b.C120021 */

            @Override // com.bytedance.ee.bear.wiki.search.WikiSearchView.AbstractC12023b
            public void onCancelInputClick() {
                C13479a.m54764b("WikiSearchTAG", "cancel input, cancel search ...");
                C12001b.this.f32404g.cancelSearch();
            }
        });
        this.f32403f.setOnSearchEditTextClickListener(new WikiSearchView.AbstractC12028g() {
            /* class com.bytedance.ee.bear.wiki.homepage.spacelist.p584b.C12001b.C120032 */

            @Override // com.bytedance.ee.bear.wiki.search.WikiSearchView.AbstractC12028g
            public void onSearchTextViewClick() {
                C13479a.m54764b("WikiSearchTAG", "search space in create mode ...");
                C12001b.this.f32403f.mo45987a();
                C12001b.this.f32400c.setVisibility(8);
                C12001b.this.mo45960a((float) C13749l.m55738a(45), (float) C13749l.m55738a(0));
                C12001b.this.f32405h = true;
            }
        });
        this.f32403f.setOnInputSearchKeyListener(new WikiSearchView.AbstractC12026e() {
            /* class com.bytedance.ee.bear.wiki.homepage.spacelist.p584b.$$Lambda$b$sZzSbt84Dzi0cnM8Mn0RxT0slTU */

            @Override // com.bytedance.ee.bear.wiki.search.WikiSearchView.AbstractC12026e
            public final void onInputSearchKey(String str) {
                C12001b.this.m49776b((C12001b) str);
            }
        });
        this.f32403f.setOnPullUpSearchMoreListener(new WikiSearchView.AbstractC12027f() {
            /* class com.bytedance.ee.bear.wiki.homepage.spacelist.p584b.$$Lambda$b$PBszB7BALPVc58ab5HIbDaIAcPM */

            @Override // com.bytedance.ee.bear.wiki.search.WikiSearchView.AbstractC12027f
            public final void onPullUpSearchMore() {
                C12001b.this.m49784h();
            }
        });
        this.f32403f.setOnCancelQueryListener(new WikiSearchView.AbstractC12024c() {
            /* class com.bytedance.ee.bear.wiki.homepage.spacelist.p584b.$$Lambda$b$HUnPkfpoaeXALlhjxOaaISKzR08 */

            @Override // com.bytedance.ee.bear.wiki.search.WikiSearchView.AbstractC12024c
            public final void onCancelQuery() {
                C12001b.this.m49783g();
            }
        });
        this.f32403f.setOnCancelSearchClickListener(new WikiSearchView.AbstractC12025d() {
            /* class com.bytedance.ee.bear.wiki.homepage.spacelist.p584b.C12001b.C120043 */

            @Override // com.bytedance.ee.bear.wiki.search.WikiSearchView.AbstractC12025d
            public void onCancelSearchClick() {
                C13479a.m54764b("WikiSearchTAG", "cancel search stop net query ...");
                C12001b.this.f32399b.setVisibility(0);
                C12001b.this.f32402e.setVisibility(0);
                C12001b.this.mo45960a((float) C13749l.m55738a(0), (float) C13749l.m55738a(45));
                C12001b.this.f32404g.cancelSearch();
                C12001b.this.f32405h = false;
            }
        });
        this.f32403f.setKeyBoardHeightChangeListener(activity);
        this.f32403f.setSearchResultItemClickListener(new WikiSearchView.AbstractC12029h() {
            /* class com.bytedance.ee.bear.wiki.homepage.spacelist.p584b.C12001b.C120054 */

            @Override // com.bytedance.ee.bear.wiki.search.WikiSearchView.AbstractC12029h
            public void onSearchItemClick(String str, String str2, String str3, int i) {
                ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17295b("/wiki/treehome/activity").mo17314a("space_id", str).mo17314a("obj_token", str2).mo17314a("node_name", str3).mo17318b(4884).mo17308a("EXTRA_PAGE_MODE", C12001b.this.f32398a).mo17311a("EXTRA_WIKI_DOCUMENT", C12001b.this.mo45959a(str)).mo17317a();
            }
        });
    }

    /* renamed from: a */
    public static C12001b m49770a(ArrayList<WikiDocument> arrayList, int i, int i2) {
        C12001b bVar = new C12001b();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("space_list_data", arrayList);
        bundle.putInt("EXTRA_PAGE_MODE", i);
        bundle.putInt("createDocumentType", i2);
        bVar.setArguments(bundle);
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.wiki_all_space_list_fragment, viewGroup, false);
        m49772a(inflate);
        mo45962a(this.f32413p.mo45945a(this.f32406i));
        m49780d();
        m49781e();
        m49782f();
        return inflate;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m49773a(View view, int i, C8213o oVar) {
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17295b("/wiki/treehome/activity").mo17314a("space_id", oVar.mo32176a()).mo17314a("obj_token", oVar.mo32198i()).mo17314a("node_name", oVar.mo32184c()).mo17308a("EXTRA_PAGE_MODE", 1).mo17318b(4884).mo17308a("createDocumentType", this.f32414q).mo17317a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m49774a(List list, View view, int i, C8213o oVar) {
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17295b("/wiki/treehome/activity").mo17314a("space_id", oVar.mo32176a()).mo17314a("obj_token", oVar.mo32198i()).mo17314a("node_name", oVar.mo32184c()).mo17308a("EXTRA_PAGE_MODE", 0).mo17311a("EXTRA_WIKI_DOCUMENT", C8213o.m33654a(oVar)).mo17317a();
        C11933b.m49481a("select_space", "all_workspaces", list.size(), i);
    }
}
