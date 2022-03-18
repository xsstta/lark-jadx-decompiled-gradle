package com.bytedance.ee.bear.wiki.wikitree;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.aj;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.AbstractC2536f;
import com.bumptech.glide.request.p095a.AbstractC2513c;
import com.bumptech.glide.request.p095a.AbstractC2522j;
import com.bumptech.glide.request.p096b.AbstractC2529b;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.contract.route.parcelable.WikiDocument;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.widget.statusbar.C11789c;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.wiki.common.p580b.C11933b;
import com.bytedance.ee.bear.wiki.favourite.C11949a;
import com.bytedance.ee.bear.wiki.favourite.p581a.C11952a;
import com.bytedance.ee.bear.wiki.search.C12033c;
import com.bytedance.ee.bear.wiki.search.C12040e;
import com.bytedance.ee.bear.wiki.search.C12041f;
import com.bytedance.ee.bear.wiki.search.SearchMode;
import com.bytedance.ee.bear.wiki.search.WikiSearchView;
import com.bytedance.ee.bear.wiki.wikitree.C12105g;
import com.bytedance.ee.bear.wiki.wikitree.C12113h;
import com.bytedance.ee.bear.wiki.wikitree.WikiCoverCoordinatorLayout;
import com.bytedance.ee.bear.wiki.wikitree.bean.HomePage;
import com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12144f;
import com.bytedance.ee.bear.wiki.wikitree.tree.C12158n;
import com.bytedance.ee.bear.wiki.wikitree.tree.C12164q;
import com.bytedance.ee.bear.wiki.wikitree.tree.WikiTreeType;
import com.bytedance.ee.bear.wiki.wikitree.tree.p586a.C12139h;
import com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p703f.C13664a;
import com.bytedance.ee.util.p718t.C13726a;
import com.bytedance.ee.util.p718t.C13727b;
import com.bytedance.ee.util.p718t.C13746i;
import com.bytedance.ee.util.p718t.C13749l;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.HashMap;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.wiki.wikitree.g */
public class C12105g extends C7667e {

    /* renamed from: a */
    public C12164q f32607a;

    /* renamed from: b */
    public AppBarLayout f32608b;

    /* renamed from: c */
    public int f32609c;

    /* renamed from: d */
    public WikiCoverCoordinatorLayout f32610d;

    /* renamed from: e */
    public boolean f32611e;

    /* renamed from: f */
    public int f32612f;

    /* renamed from: g */
    public int f32613g;

    /* renamed from: h */
    private String f32614h;

    /* renamed from: i */
    private String f32615i;

    /* renamed from: j */
    private String f32616j;

    /* renamed from: k */
    private WikiDocument f32617k;

    /* renamed from: l */
    private C12113h f32618l;

    /* renamed from: m */
    private View f32619m;

    /* renamed from: n */
    private C12117i f32620n;

    /* renamed from: o */
    private C12040e f32621o;

    /* renamed from: p */
    private BaseTitleBar.C11803d f32622p;

    /* renamed from: q */
    private ImageView f32623q;

    /* renamed from: r */
    private ImageView f32624r;

    /* renamed from: s */
    private WikiSearchView f32625s;

    /* renamed from: t */
    private Toolbar f32626t;

    /* renamed from: u */
    private boolean f32627u;

    /* renamed from: v */
    private PointF f32628v = new PointF();

    /* renamed from: w */
    private AbstractC1178x<ConnectionService.NetworkState> f32629w;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m50048a(TreeSyncEntity treeSyncEntity) {
        if (treeSyncEntity == null || !TextUtils.equals(treeSyncEntity.getSpaceId(), this.f32607a.mo46516x())) {
            C13479a.m54758a("Wiki_WikiTreeFragment", "WikiTreeFragment.onTreeDataChanged , invalid syncEntity. ");
        } else if (TextUtils.equals(treeSyncEntity.getAction(), "com.bytedance.ee.bear.wiki.treeFocusChanged")) {
            if (treeSyncEntity.getSpaceCore() != null) {
                this.f32607a.mo46499a(treeSyncEntity.getSpaceCore(), treeSyncEntity.getWikiToken());
            } else {
                this.f32607a.mo46505b(treeSyncEntity.getWikiToken());
            }
            m50059d();
        } else if (TextUtils.equals(treeSyncEntity.getAction(), "com.bytedance.ee.bear.wiki.treeTitleChanged")) {
            this.f32607a.mo46506b(treeSyncEntity.getWikiToken(), treeSyncEntity.getNewTitle());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m50053a(ViewConfiguration viewConfiguration, MotionEvent motionEvent) {
        float y = motionEvent.getY() - this.f32628v.y;
        float x = motionEvent.getX() - this.f32628v.x;
        if (motionEvent.getAction() == 2 && this.f32612f == 0 && y > ((float) viewConfiguration.getScaledTouchSlop()) && y > Math.abs(x)) {
            return true;
        }
        this.f32628v.x = motionEvent.getX();
        this.f32628v.y = motionEvent.getY();
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m50049a(AppBarLayout appBarLayout, int i) {
        int height = this.f32626t.getHeight() / 2;
        int height2 = this.f32626t.getHeight() + height;
        if (Math.abs(i) < height) {
            if (this.f32626t.getAlpha() > BitmapDescriptorFactory.HUE_RED || this.f32626t.getTranslationY() > ((float) (-this.f32626t.getHeight()))) {
                this.f32626t.setAlpha(BitmapDescriptorFactory.HUE_RED);
                Toolbar toolbar = this.f32626t;
                toolbar.setTranslationY((float) (-toolbar.getHeight()));
                this.f32626t.setVisibility(8);
            }
        } else if (Math.abs(i) <= height2) {
            this.f32626t.setAlpha(((float) (Math.abs(i) - height)) / ((float) this.f32626t.getHeight()));
            this.f32626t.setTranslationY((float) (Math.abs(i) - height2));
            this.f32626t.setVisibility(0);
        } else if (this.f32626t.getAlpha() < 1.0f || this.f32626t.getTranslationY() < BitmapDescriptorFactory.HUE_RED) {
            this.f32626t.setAlpha(1.0f);
            this.f32626t.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            this.f32626t.setVisibility(0);
        }
        mo46276b();
        if (!(i != 0 || this.f32612f == 0 || this.f32619m == null)) {
            this.f32607a.mo46518z();
        }
        this.f32612f = Math.abs(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m50051a(List list) {
        this.f32625s.mo45994c();
        if (!CollectionUtils.isEmpty(list)) {
            boolean e = ((C12033c) list.get(0)).mo46048e();
            C13479a.m54764b("WikiSearchTAG", "has search result, set enable load more = " + e);
            this.f32625s.setRefreshLayoutEnableLoadMore(e);
        }
        this.f32625s.mo45992a(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m50050a(String str, String str2, String str3, int i) {
        C12158n.m50510a(ar.m20936a(), str, str2, (HomePage) null, false);
    }

    /* renamed from: a */
    public void mo46274a() {
        this.f32625s.setSearchTextViewVisible(8);
        this.f32625s.setSearchInputEditTextVisibility(0);
        this.f32625s.setCancelSearchTextViewVisibility(0);
        this.f32625s.mo45997f();
        this.f32625s.mo46008l();
        this.f32625s.mo45988a(0);
    }

    /* renamed from: a */
    private void m50052a(boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            C11789c.m48865a(getActivity(), getResources().getColor(R.color.space_kit_trans, getActivity().getTheme()), z);
        }
    }

    /* renamed from: a */
    public void mo46275a(int i, final int i2) {
        ValueAnimator a = C13727b.m55679a((View) this.f32608b, i, i2, (int) LocationRequest.PRIORITY_HD_ACCURACY);
        a.addListener(new Animator.AnimatorListener() {
            /* class com.bytedance.ee.bear.wiki.wikitree.C12105g.C121127 */

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                if (i2 == 0) {
                    C12105g.this.f32607a.mo46494A();
                    return;
                }
                C12105g.this.f32607a.mo46507b(true);
                C12105g.this.f32607a.mo46495B();
            }
        });
        a.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m50067h() {
        this.f32621o.cancelSearch();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m50068i() {
        this.f32621o.loadNextPage();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        mo46276b();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m50069j() {
        C13479a.m54764b("WikiSearchTAG", "cancel input, cancel search ...");
        this.f32621o.cancelSearch();
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d, com.bytedance.ee.bear.facade.common.C7667e
    public boolean onBackPressed() {
        boolean e = this.f32607a.mo46349e();
        if (!this.f32611e) {
            return e;
        }
        m50065g();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f32607a.mo46347c();
        this.f32607a.mo46348d();
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m50070k() {
        C13479a.m54764b("Wiki_WikiTreeFragment", "WikiTreeFragment.onClosePage. ");
        if (C13726a.m55676b(getActivity())) {
            getActivity().finish();
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onDestroy() {
        super.onDestroy();
        C12113h hVar = this.f32618l;
        if (hVar != null) {
            hVar.unRegisterTreeDataChange();
        }
        if (this.f32629w != null) {
            C5084ad.m20847d().mo20037a().mo5928b(this.f32629w);
        }
    }

    /* renamed from: c */
    private void m50057c() {
        C12113h hVar = (C12113h) aj.m5364a(this).mo6005a(C12113h.class);
        this.f32618l = hVar;
        hVar.setSpaceId(this.f32615i);
        this.f32618l.setWikiToken(this.f32614h);
        this.f32618l.registerTreeDataChange(getContext());
        this.f32618l.setOnTreeDataChangedListener(new C12113h.AbstractC12116b() {
            /* class com.bytedance.ee.bear.wiki.wikitree.$$Lambda$g$0LFRa6DBvbjCHePHjyJCX9GC0Q */

            @Override // com.bytedance.ee.bear.wiki.wikitree.C12113h.AbstractC12116b
            public final void onTreeDataChanged(TreeSyncEntity treeSyncEntity) {
                C12105g.this.m50048a((C12105g) treeSyncEntity);
            }
        });
        this.f32618l.setOnClosePageListener(new C12113h.AbstractC12115a() {
            /* class com.bytedance.ee.bear.wiki.wikitree.$$Lambda$g$E7Fn01JPLNfdppQNcoUAQZY3rfY */

            @Override // com.bytedance.ee.bear.wiki.wikitree.C12113h.AbstractC12115a
            public final void onClosePage() {
                C12105g.this.m50070k();
            }
        });
    }

    /* renamed from: d */
    private void m50059d() {
        AppBarLayout appBarLayout = this.f32608b;
        if (appBarLayout != null && this.f32626t != null) {
            appBarLayout.setExpanded(false, false);
            this.f32612f = this.f32608b.getTotalScrollRange();
            this.f32626t.setAlpha(1.0f);
            this.f32626t.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            this.f32626t.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m50065g() {
        C13479a.m54764b("WikiSearchTAG", "cancel search stop net query ...");
        this.f32610d.setVisibility(0);
        this.f32621o.cancelSearch();
        this.f32625s.mo46014p();
        this.f32625s.mo46006j();
        this.f32625s.mo46009m();
        this.f32625s.mo45988a(8);
        this.f32611e = false;
        mo46276b();
    }

    /* renamed from: e */
    private void m50061e() {
        if (getArguments() != null) {
            this.f32615i = getArguments().getString("space_id");
            this.f32614h = getArguments().getString("obj_token");
            this.f32616j = getArguments().getString("node_name");
            this.f32617k = (WikiDocument) getArguments().getParcelable("EXTRA_WIKI_DOCUMENT");
        }
        if (this.f32617k == null) {
            C13479a.m54758a("Wiki_WikiTreeFragment", "WikiTreeFragment.parseArgs, parse args fail. ");
            if (getActivity() != null) {
                getActivity().finish();
            }
        }
    }

    /* renamed from: f */
    private void m50063f() {
        this.f32625s.setPadding(0, C13746i.m55722a(getContext()), 0, 0);
        this.f32625s.mo45987a();
        this.f32621o = C12041f.m49866a(this, (NetService) KoinJavaComponent.m268610a(NetService.class));
        this.f32625s.mo45990a(ar.m20936a(), getActivity(), SearchMode.TREE_SEARCH_SCAN_MODE);
        this.f32621o.getWikiTreeSearchResult().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.wiki.wikitree.$$Lambda$g$1TBptkg9HO1d8FV1_xspfBrMdO4 */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C12105g.this.m50051a((C12105g) ((List) obj));
            }
        });
        this.f32625s.setSearchTextViewText(R.string.Doc_Wiki_Tree_Search);
        this.f32625s.setSearchEditTextHint(R.string.Doc_Wiki_Tree_Search);
        m50043a(getActivity(), ar.m20936a());
    }

    /* renamed from: b */
    public void mo46276b() {
        Toolbar toolbar;
        if (this.f32608b != null && (toolbar = this.f32626t) != null) {
            if (this.f32611e || toolbar.getAlpha() > 0.5f) {
                m50052a(true);
            } else {
                m50052a(!this.f32627u);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m50064f(View view) {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m50066g(View view) {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m50061e();
        m50057c();
    }

    /* renamed from: a */
    private String m50042a(String str) {
        if (TextUtils.isEmpty(str) || str.startsWith("#")) {
            return str;
        }
        return "#" + str;
    }

    /* renamed from: b */
    private void m50054b(View view) {
        m50044a(view);
        this.f32607a.mo46503a(false);
        this.f32607a.mo46517y();
        m50058c(view);
        m50063f();
        m50060d(view);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m50055b(String str) {
        C13479a.m54764b("WikiSearchTAG", "onSearchResultFromServer ...");
        if (TextUtils.isEmpty(str)) {
            C13479a.m54758a("WikiSearchTAG", "wiki tree search query key == null or key == \"\" ...");
            return;
        }
        WikiDocument wikiDocument = this.f32617k;
        if (wikiDocument != null && wikiDocument.mo32399O() != null) {
            this.f32621o.wikiSearch(str, this.f32617k.mo32399O(), 1, 1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m50062e(View view) {
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17295b("/wiki/space/detail/activity").mo17314a("space_id", this.f32617k.mo32399O()).mo17314a("EXTRA_WIKI_DESCRIPTION", this.f32617k.mo21008b()).mo17317a();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m50056b(boolean z) {
        if (z) {
            ImageView imageView = this.f32623q;
            if (imageView != null && this.f32624r != null) {
                imageView.setEnabled(true);
                this.f32624r.setEnabled(true);
                return;
            }
            return;
        }
        ImageView imageView2 = this.f32623q;
        if (imageView2 != null && this.f32624r != null) {
            imageView2.setEnabled(false);
            this.f32624r.setEnabled(false);
        }
    }

    /* renamed from: a */
    private void m50044a(View view) {
        this.f32608b = (AppBarLayout) view.findViewById(R.id.wiki_appbar_layout);
        BaseTitleBar baseTitleBar = (BaseTitleBar) view.findViewById(R.id.wiki_main_title);
        HashMap hashMap = new HashMap();
        hashMap.put("module", "wiki");
        baseTitleBar.setTag(R.id.title_bar_common_params, hashMap);
        C12117i iVar = new C12117i(baseTitleBar);
        this.f32620n = iVar;
        iVar.mo46293a(this.f32616j);
        this.f32620n.mo46294a(false);
        this.f32619m = view.findViewById(R.id.wiki_tree_view_ctrl);
        C12164q qVar = new C12164q(getActivity(), ar.m20936a(), this, (AbstractC12177b) this.f32619m, C12139h.m50258a(ar.m20936a()), this.f32618l, WikiTreeType.NORMAL);
        this.f32607a = qVar;
        qVar.mo46501a(new AbstractC12144f.AbstractC12146b() {
            /* class com.bytedance.ee.bear.wiki.wikitree.C12105g.C121061 */

            @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12144f.AbstractC12146b
            /* renamed from: a */
            public void mo46262a() {
            }

            @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12144f.AbstractC12146b
            /* renamed from: a */
            public boolean mo46263a(boolean z) {
                if (z) {
                    C12105g gVar = C12105g.this;
                    gVar.f32609c = gVar.f32608b.getHeight();
                    C12105g gVar2 = C12105g.this;
                    gVar2.mo46275a(gVar2.f32609c, 0);
                    return true;
                }
                C12105g gVar3 = C12105g.this;
                gVar3.mo46275a(0, gVar3.f32609c);
                return true;
            }
        });
        this.f32607a.mo46502a(new AbstractC12144f.AbstractC12147c() {
            /* class com.bytedance.ee.bear.wiki.wikitree.$$Lambda$g$MyNo3_Te8nbdeX9I221Bszym_40 */

            @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12144f.AbstractC12147c
            public final void onSpaceInit(boolean z) {
                C12105g.this.m50056b((C12105g) z);
            }
        });
    }

    /* renamed from: c */
    private void m50058c(View view) {
        this.f32625s = (WikiSearchView) view.findViewById(R.id.wiki_search_view);
        this.f32610d = (WikiCoverCoordinatorLayout) view.findViewById(R.id.wiki_page_coordinator_layout);
        this.f32620n.mo46292a((BaseTitleBar) view.findViewById(R.id.wiki_main_title_floating));
        final RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.wiki_space_header_layout);
        this.f32626t = (Toolbar) view.findViewById(R.id.wiki_header_toolbar);
        final ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f32620n.mo46290a().setBackgroundColor(0);
        this.f32620n.mo46290a().setTitle("");
        this.f32620n.mo46290a().setLeftClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.wiki.wikitree.$$Lambda$g$5EtmaXZ2PnTvlN_eexeieiuMcc */

            public final void onClick(View view) {
                C12105g.this.m50066g(view);
            }
        });
        BaseTitleBar b = this.f32620n.mo46295b();
        if (b != null) {
            b.setTitle(this.f32616j);
            b.setActionIconTint(R.color.icon_n1);
            b.setLeftClickListener(new View.OnClickListener() {
                /* class com.bytedance.ee.bear.wiki.wikitree.$$Lambda$g$HVrNZNxewY377Gx6UEsstDVgizE */

                public final void onClick(View view) {
                    C12105g.this.m50064f(view);
                }
            });
        }
        C121072 r1 = new BaseTitleBar.C11803d(R.drawable.ud_icon_search_outlined) {
            /* class com.bytedance.ee.bear.wiki.wikitree.C12105g.C121072 */

            @Override // com.bytedance.ee.bear.widgets.BaseTitleBar.AbstractC11800a, com.bytedance.ee.bear.widgets.BaseTitleBar.C11801b
            /* renamed from: a */
            public void mo16854a(View view) {
                C11933b.m49483a("wiki_pages", "wiki_pages_view", "click_search_item");
                C12105g.this.mo46274a();
                C12105g.this.f32610d.setVisibility(8);
                C12105g.this.f32611e = true;
                C12105g.this.mo46276b();
            }
        };
        this.f32622p = r1;
        this.f32620n.mo46291a(r1);
        this.f32610d.setOnScrollListener(new WikiCoverCoordinatorLayout.AbstractC12052b() {
            /* class com.bytedance.ee.bear.wiki.wikitree.C12105g.C121083 */

            @Override // com.bytedance.ee.bear.wiki.wikitree.WikiCoverCoordinatorLayout.AbstractC12052b
            /* renamed from: a */
            public void mo46157a() {
                CollapsingToolbarLayout.LayoutParams layoutParams = (CollapsingToolbarLayout.LayoutParams) relativeLayout.getLayoutParams();
                if (layoutParams.height > C12105g.this.f32613g) {
                    ValueAnimator duration = ValueAnimator.ofInt(layoutParams.height, C12105g.this.f32613g).setDuration(200L);
                    duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(relativeLayout) {
                        /* class com.bytedance.ee.bear.wiki.wikitree.$$Lambda$g$3$B7qvE0dfaZxPQYwJCdBESbRI0cY */
                        public final /* synthetic */ RelativeLayout f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            C12105g.C121083.m50077a(CollapsingToolbarLayout.LayoutParams.this, this.f$1, valueAnimator);
                        }
                    });
                    duration.setInterpolator(new DecelerateInterpolator());
                    duration.start();
                }
            }

            @Override // com.bytedance.ee.bear.wiki.wikitree.WikiCoverCoordinatorLayout.AbstractC12052b
            /* renamed from: a */
            public void mo46158a(float f, float f2) {
                CollapsingToolbarLayout.LayoutParams layoutParams = (CollapsingToolbarLayout.LayoutParams) relativeLayout.getLayoutParams();
                if (f2 > ((float) viewConfiguration.getScaledTouchSlop()) || layoutParams.height > C12105g.this.f32613g) {
                    layoutParams.height = (int) (((float) layoutParams.height) + (f2 / 2.0f));
                    if (layoutParams.height < C12105g.this.f32613g) {
                        layoutParams.height = C12105g.this.f32613g;
                    }
                    relativeLayout.requestLayout();
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m50077a(CollapsingToolbarLayout.LayoutParams layoutParams, RelativeLayout relativeLayout, ValueAnimator valueAnimator) {
                layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                relativeLayout.requestLayout();
            }
        });
        this.f32610d.setInterceptTouchEventListener(new WikiCoverCoordinatorLayout.AbstractC12051a(viewConfiguration) {
            /* class com.bytedance.ee.bear.wiki.wikitree.$$Lambda$g$eCWf1aDGxt_WzSB9wKL2P0Aufa4 */
            public final /* synthetic */ ViewConfiguration f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.bytedance.ee.bear.wiki.wikitree.WikiCoverCoordinatorLayout.AbstractC12051a
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                return C12105g.this.m50053a(this.f$1, motionEvent);
            }
        });
        this.f32608b.addOnOffsetChangedListener((AppBarLayout.AbstractC22134b) new AppBarLayout.AbstractC22134b() {
            /* class com.bytedance.ee.bear.wiki.wikitree.$$Lambda$g$gsLdHrJQrRAyIeViL5jpeWNDuyc */

            @Override // com.google.android.material.appbar.AppBarLayout.AbstractC22133a
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                C12105g.this.m50049a((C12105g) appBarLayout, (AppBarLayout) i);
            }
        });
        this.f32607a.mo46497a(new RecyclerView.AbstractC1337f() {
            /* class com.bytedance.ee.bear.wiki.wikitree.C12105g.C121094 */

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1337f
            public boolean onFling(int i, int i2) {
                if (C12105g.this.f32612f != 0 || i2 >= 0) {
                    return false;
                }
                return true;
            }
        });
        C13746i.m55723a(getActivity().getWindow());
        getActivity().getWindow().setStatusBarColor(0);
        int a = C13746i.m55722a(getContext());
        CollapsingToolbarLayout.LayoutParams layoutParams = (CollapsingToolbarLayout.LayoutParams) relativeLayout.getLayoutParams();
        layoutParams.height = C13749l.m55738a(210) + a;
        this.f32613g = layoutParams.height;
        relativeLayout.setLayoutParams(layoutParams);
        CollapsingToolbarLayout.LayoutParams layoutParams2 = (CollapsingToolbarLayout.LayoutParams) this.f32626t.getLayoutParams();
        layoutParams2.height = getResources().getDimensionPixelSize(R.dimen.doc_titlebar_height) + a;
        this.f32626t.setPadding(0, a, 0, 0);
        this.f32626t.setLayoutParams(layoutParams2);
        this.f32626t.setTranslationY((float) (-layoutParams2.height));
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f32620n.mo46290a().getLayoutParams();
        layoutParams3.topMargin = a;
        this.f32620n.mo46290a().setLayoutParams(layoutParams3);
    }

    /* renamed from: d */
    private void m50060d(View view) {
        final ImageView imageView = (ImageView) view.findViewById(R.id.iv_wiki_cover);
        TextView textView = (TextView) view.findViewById(R.id.tv_wiki_title);
        this.f32623q = (ImageView) view.findViewById(R.id.iv_wiki_detail);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.iv_wiki_star_background);
        this.f32624r = (ImageView) view.findViewById(R.id.iv_wiki_star);
        C11949a aVar = new C11949a((NetService) KoinJavaComponent.m268610a(NetService.class), C13615c.f35773a, this.f32624r, this.f32617k.mo32456j());
        textView.setText(this.f32617k.mo32469n());
        if (this.f32617k.mo32456j()) {
            this.f32624r.setImageResource(R.drawable.icon_tool_collect_nor);
        } else {
            this.f32624r.setImageResource(R.drawable.icon_tool_uncollected_nor);
        }
        LiveData<ConnectionService.NetworkState> a = C5084ad.m20847d().mo20037a();
        $$Lambda$g$_2A0CzCNCGM1mViTPnLh6PQqM8g r4 = new AbstractC1178x(imageView2) {
            /* class com.bytedance.ee.bear.wiki.wikitree.$$Lambda$g$_2A0CzCNCGM1mViTPnLh6PQqM8g */
            public final /* synthetic */ ImageView f$1;

            {
                this.f$1 = r2;
            }

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C12105g.this.m50045a((C12105g) this.f$1, (ImageView) ((ConnectionService.NetworkState) obj));
            }
        };
        this.f32629w = r4;
        a.mo5923a(this, r4);
        this.f32623q.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.wiki.wikitree.$$Lambda$g$3uYlGlZrzvOLS5yKNhQCkClBhE */

            public final void onClick(View view) {
                C12105g.this.m50062e(view);
            }
        });
        this.f32624r.setOnClickListener(new View.OnClickListener(aVar) {
            /* class com.bytedance.ee.bear.wiki.wikitree.$$Lambda$g$6SmfGhNWs2gkPOKgRfTt9PQ9FhQ */
            public final /* synthetic */ C11949a f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C12105g.this.m50047a((C12105g) this.f$1, (C11949a) view);
            }
        });
        WikiDocument.SpaceCover d = this.f32617k.mo21014d();
        if (d != null) {
            this.f32627u = d.mo21034d();
            if (d.mo21034d()) {
                m50046a(textView, R.color.static_white);
                m50052a(false);
            } else {
                m50046a(textView, R.color.static_black);
                m50052a(true);
            }
            int a2 = m50040a(d.mo21034d(), d.mo21036e());
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(a2);
            if (TextUtils.isEmpty(d.mo21026a())) {
                C13479a.m54764b("Wiki_WikiTreeFragment", "bindImage spaceCover.thumbnail is empty");
                imageView.setImageDrawable(gradientDrawable);
                return;
            }
            ((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9142a(this).mo10414a(new C13664a(d.mo21026a())).mo11125a((Drawable) gradientDrawable)).mo11140b((Drawable) gradientDrawable)).mo10392a((AbstractC2536f) new AbstractC2536f<Drawable>() {
                /* class com.bytedance.ee.bear.wiki.wikitree.C12105g.C121116 */

                /* renamed from: a */
                public boolean mo11205a(Drawable drawable, Object obj, AbstractC2522j<Drawable> jVar, DataSource dataSource, boolean z) {
                    return false;
                }

                @Override // com.bumptech.glide.request.AbstractC2536f
                /* renamed from: a */
                public boolean mo11204a(GlideException glideException, Object obj, AbstractC2522j<Drawable> jVar, boolean z) {
                    C13479a.m54758a("Wiki_WikiTreeFragment", "bindImage glide onException");
                    C13479a.m54761a("Wiki_WikiTreeFragment", glideException);
                    return false;
                }
            }).mo10397a((AbstractC2522j) new AbstractC2513c<Drawable>() {
                /* class com.bytedance.ee.bear.wiki.wikitree.C12105g.C121105 */

                @Override // com.bumptech.glide.request.p095a.AbstractC2522j
                /* renamed from: a */
                public void mo11036a(Drawable drawable) {
                    if (drawable != null) {
                        imageView.setImageDrawable(drawable);
                    }
                }

                @Override // com.bumptech.glide.request.p095a.AbstractC2513c, com.bumptech.glide.request.p095a.AbstractC2522j
                /* renamed from: b */
                public void mo10444b(Drawable drawable) {
                    if (drawable != null) {
                        imageView.setImageDrawable(drawable);
                    }
                }

                @Override // com.bumptech.glide.request.p095a.AbstractC2513c, com.bumptech.glide.request.p095a.AbstractC2522j
                /* renamed from: c */
                public void mo11172c(Drawable drawable) {
                    if (drawable != null) {
                        imageView.setImageDrawable(drawable);
                    }
                }

                /* renamed from: a */
                public void mo46277a(Drawable drawable, AbstractC2529b<? super Drawable> bVar) {
                    imageView.setImageDrawable(drawable);
                }

                @Override // com.bumptech.glide.request.p095a.AbstractC2522j
                /* renamed from: a */
                public /* bridge */ /* synthetic */ void mo10442a(Object obj, AbstractC2529b bVar) {
                    mo46277a((Drawable) obj, (AbstractC2529b<? super Drawable>) bVar);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m50047a(C11949a aVar, View view) {
        C11952a aVar2 = new C11952a(this.f32624r);
        aVar2.mo45888a();
        aVar.mo45886a(this.f32615i, aVar2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f32607a.mo46344a();
        this.f32607a.mo46346b();
    }

    /* renamed from: a */
    private int m50040a(boolean z, String str) {
        int i;
        if (z) {
            i = getResources().getColor(R.color.space_kit_n950);
        } else {
            i = getResources().getColor(R.color.static_white);
        }
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            i = Color.parseColor(m50042a(str));
        } catch (Exception e) {
            C13479a.m54758a("Wiki_WikiTreeFragment", e.toString());
        }
        C13479a.m54764b("Wiki_WikiTreeFragment", "colorValue:  " + str + "   color:  " + i);
        return i;
    }

    /* renamed from: a */
    private void m50043a(Activity activity, C10917c cVar) {
        this.f32625s.setOnCancelInputClickListener(new WikiSearchView.AbstractC12023b() {
            /* class com.bytedance.ee.bear.wiki.wikitree.$$Lambda$g$EQYBUZ11RhdkqB3w7t7GjbthPk4 */

            @Override // com.bytedance.ee.bear.wiki.search.WikiSearchView.AbstractC12023b
            public final void onCancelInputClick() {
                C12105g.this.m50069j();
            }
        });
        this.f32625s.setOnInputSearchKeyListener(new WikiSearchView.AbstractC12026e() {
            /* class com.bytedance.ee.bear.wiki.wikitree.$$Lambda$g$1ZL4rG_djE8YRYT3vGe2T3AkkzI */

            @Override // com.bytedance.ee.bear.wiki.search.WikiSearchView.AbstractC12026e
            public final void onInputSearchKey(String str) {
                C12105g.this.m50055b((C12105g) str);
            }
        });
        this.f32625s.setOnPullUpSearchMoreListener(new WikiSearchView.AbstractC12027f() {
            /* class com.bytedance.ee.bear.wiki.wikitree.$$Lambda$g$40uoYDYYwkXABqa9NFfcjiq5J4 */

            @Override // com.bytedance.ee.bear.wiki.search.WikiSearchView.AbstractC12027f
            public final void onPullUpSearchMore() {
                C12105g.this.m50068i();
            }
        });
        this.f32625s.setOnCancelQueryListener(new WikiSearchView.AbstractC12024c() {
            /* class com.bytedance.ee.bear.wiki.wikitree.$$Lambda$g$jlu2f6ha48CNmDI7Nw3wVp7MV8 */

            @Override // com.bytedance.ee.bear.wiki.search.WikiSearchView.AbstractC12024c
            public final void onCancelQuery() {
                C12105g.this.m50067h();
            }
        });
        this.f32625s.setOnCancelSearchClickListener(new WikiSearchView.AbstractC12025d() {
            /* class com.bytedance.ee.bear.wiki.wikitree.$$Lambda$g$f0FzNdBaai39WXhJKx7pRWHo */

            @Override // com.bytedance.ee.bear.wiki.search.WikiSearchView.AbstractC12025d
            public final void onCancelSearchClick() {
                C12105g.this.m50065g();
            }
        });
        this.f32625s.setSearchResultItemClickListener($$Lambda$g$6r2ZFzV3zwn4o85yhdlkSAUsrCo.INSTANCE);
        this.f32625s.setKeyBoardHeightChangeListener(activity);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m50045a(ImageView imageView, ConnectionService.NetworkState networkState) {
        boolean z;
        if (networkState == null || !networkState.mo20041b()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f32623q.setEnabled(true);
            this.f32623q.setAlpha(1.0f);
            this.f32624r.setEnabled(true);
            this.f32624r.setAlpha(1.0f);
            imageView.setEnabled(true);
            imageView.setAlpha(1.0f);
            return;
        }
        this.f32623q.setEnabled(false);
        this.f32623q.setAlpha(0.5f);
        this.f32624r.setEnabled(false);
        this.f32624r.setAlpha(0.5f);
        imageView.setEnabled(false);
        imageView.setAlpha(0.5f);
    }

    /* renamed from: a */
    private void m50046a(TextView textView, int i) {
        textView.setTextColor(getResources().getColor(i));
        BaseTitleBar a = this.f32620n.mo46290a();
        if (a != null) {
            a.getLeftImage().getDrawable().setTint(getResources().getColor(i));
            View c = a.mo45086c(this.f32622p);
            if (c != null) {
                View findViewById = c.findViewById(R.id.widgetTitleMenuImg);
                if (findViewById instanceof ImageView) {
                    ((ImageView) findViewById).getDrawable().setTint(getResources().getColor(i));
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f32607a.mo46345a(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.wiki_tree_cover_home_activity, viewGroup, false);
        m50054b(inflate);
        return inflate;
    }

    /* renamed from: a */
    public static C12105g m50041a(String str, String str2, String str3, WikiDocument wikiDocument) {
        C12105g gVar = new C12105g();
        Bundle bundle = new Bundle();
        bundle.putString("space_id", str);
        bundle.putString("obj_token", str2);
        bundle.putString("node_name", str3);
        bundle.putParcelable("EXTRA_WIKI_DOCUMENT", wikiDocument);
        gVar.setArguments(bundle);
        return gVar;
    }
}
