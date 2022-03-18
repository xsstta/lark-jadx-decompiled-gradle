package com.bytedance.ee.bear.wiki.search;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.facade.common.widget.BearLottieView;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.LoadMoreFooter;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10549e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widgets.BaseRecyclerView;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEditText;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.bytedance.ee.bear.wiki.common.p580b.C11933b;
import com.bytedance.ee.bear.wiki.search.C12034d;
import com.bytedance.ee.bear.wiki.search.WikiSearchView;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p712o.p713a.C13716b;
import com.bytedance.ee.util.p718t.C13742g;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27125d;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.scwang.smartrefresh.layout.p1236c.AbstractC27137a;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class WikiSearchView extends LinearLayout {

    /* renamed from: A */
    private SearchMode f32428A;

    /* renamed from: B */
    private C12022a f32429B;

    /* renamed from: C */
    private AbstractC10550f f32430C;

    /* renamed from: D */
    private C12030i f32431D;

    /* renamed from: E */
    private AbstractC5233x f32432E;

    /* renamed from: F */
    private C68289a f32433F = new C68289a();

    /* renamed from: a */
    public SpaceEditText f32434a;

    /* renamed from: b */
    public SpaceEditText f32435b;

    /* renamed from: c */
    public ImageView f32436c;

    /* renamed from: d */
    public TextView f32437d;

    /* renamed from: e */
    public C12034d f32438e;

    /* renamed from: f */
    public AbstractC12023b f32439f;

    /* renamed from: g */
    public AbstractC12025d f32440g;

    /* renamed from: h */
    public AbstractC12027f f32441h;

    /* renamed from: i */
    public AbstractC12028g f32442i;

    /* renamed from: j */
    public AbstractC12024c f32443j;

    /* renamed from: k */
    public AbstractC12029h f32444k;

    /* renamed from: l */
    public boolean f32445l = true;

    /* renamed from: m */
    private RelativeLayout f32446m;

    /* renamed from: n */
    private ViewStub f32447n;

    /* renamed from: o */
    private View f32448o;

    /* renamed from: p */
    private RelativeLayout f32449p;

    /* renamed from: q */
    private BearLottieView f32450q;

    /* renamed from: r */
    private SmartRefreshLayout f32451r;

    /* renamed from: s */
    private BaseRecyclerView f32452s;

    /* renamed from: t */
    private RelativeLayout f32453t;

    /* renamed from: u */
    private SpaceEmptyState f32454u;

    /* renamed from: v */
    private LinearLayoutManager f32455v = new LinearLayoutManager(getContext());

    /* renamed from: w */
    private AbstractC12026e f32456w;

    /* renamed from: x */
    private LiveData<ConnectionService.NetworkState> f32457x;

    /* renamed from: y */
    private ConnectionService f32458y;

    /* renamed from: z */
    private C10917c f32459z = new C10917c(new C10929e());

    /* renamed from: com.bytedance.ee.bear.wiki.search.WikiSearchView$b */
    public interface AbstractC12023b {
        void onCancelInputClick();
    }

    /* renamed from: com.bytedance.ee.bear.wiki.search.WikiSearchView$c */
    public interface AbstractC12024c {
        void onCancelQuery();
    }

    /* renamed from: com.bytedance.ee.bear.wiki.search.WikiSearchView$d */
    public interface AbstractC12025d {
        void onCancelSearchClick();
    }

    /* renamed from: com.bytedance.ee.bear.wiki.search.WikiSearchView$e */
    public interface AbstractC12026e {
        void onInputSearchKey(String str);
    }

    /* renamed from: com.bytedance.ee.bear.wiki.search.WikiSearchView$f */
    public interface AbstractC12027f {
        void onPullUpSearchMore();
    }

    /* renamed from: com.bytedance.ee.bear.wiki.search.WikiSearchView$g */
    public interface AbstractC12028g {
        void onSearchTextViewClick();
    }

    /* renamed from: com.bytedance.ee.bear.wiki.search.WikiSearchView$h */
    public interface AbstractC12029h {
        void onSearchItemClick(String str, String str2, String str3, int i);
    }

    /* renamed from: a */
    public void mo45992a(List<C12033c> list) {
        String obj = this.f32435b.getText().toString();
        if (TextUtils.isEmpty(obj)) {
            C13479a.m54764b("WikiSearchTAG", "showSearchResult but key words are empty, show white page");
            mo45997f();
            this.f32436c.setVisibility(8);
        } else if (this.f32438e == null) {
            C13479a.m54764b("WikiSearchTAG", "mWikiSearchResultAdapter == null, show no result page, key words' length are " + obj.length());
            mo46005i();
        } else if (!CollectionUtils.isEmpty(list) || this.f32438e.mo46058b()) {
            C13479a.m54764b("WikiSearchTAG", "has search result, show result page, key words' length are " + obj.length());
            mo46004h();
            this.f32438e.mo46057a(list);
        } else {
            C13479a.m54764b("WikiSearchTAG", "do not has search result, show no result page, key words' length are " + obj.length());
            mo46005i();
        }
    }

    /* renamed from: a */
    public void mo45991a(String str) {
        LiveData<ConnectionService.NetworkState> liveData;
        LiveData<ConnectionService.NetworkState> liveData2;
        mo46009m();
        mo45993b();
        if (TextUtils.isEmpty(str)) {
            C13479a.m54764b("WikiSearchTAG", "query key is \"\" or null, show white page ");
            mo45997f();
            this.f32436c.setVisibility(8);
        } else if (!TextUtils.isEmpty(str) && (liveData2 = this.f32457x) != null && liveData2.mo5927b() != null && this.f32457x.mo5927b().mo20041b()) {
            C13479a.m54764b("WikiSearchTAG", "has net work, query key do search");
            mo45998g();
            AbstractC12026e eVar = this.f32456w;
            if (eVar == null) {
                C13479a.m54758a("WikiSearchTAG", "input search key mOnInputSearchKeyListener == null");
            } else {
                eVar.onInputSearchKey(str);
            }
        } else if (!TextUtils.isEmpty(str) && (liveData = this.f32457x) != null && liveData.mo5927b() != null && !this.f32457x.mo5927b().mo20041b()) {
            C13479a.m54764b("WikiSearchTAG", "net work is un available, show no result page... key words' length is " + str.length());
            mo46005i();
        }
    }

    public String getReportSource() {
        if (this.f32428A == SearchMode.TREE_SEARCH_OPERATION_MODE) {
            return "wiki_pages_operation";
        }
        return "wiki_pages_view";
    }

    public String getReportSubModule() {
        if (this.f32428A == SearchMode.SPACE_SEARCH_MODE) {
            return "wiki_all_space";
        }
        return "wiki_pages";
    }

    public String getSearchEditTextInputText() {
        return this.f32435b.getText().toString();
    }

    /* renamed from: m */
    public void mo46009m() {
        C12034d dVar = this.f32438e;
        if (dVar != null) {
            dVar.mo46055a();
            this.f32438e.notifyDataSetChanged();
        }
    }

    /* renamed from: p */
    public void mo46014p() {
        C13479a.m54764b("WikiSearchTAG", "hidden keyboard");
        C10548d.m43697a(this);
        mo46016r();
    }

    /* renamed from: r */
    public void mo46016r() {
        this.f32446m.setFocusableInTouchMode(true);
        this.f32435b.clearFocus();
    }

    private int getSearchLoadingLayoutMarginTop() {
        RelativeLayout relativeLayout = this.f32449p;
        if (relativeLayout != null) {
            return ((LinearLayout.LayoutParams) relativeLayout.getLayoutParams()).topMargin;
        }
        C13479a.m54758a("WikiSearchTAG", "get search loading view layout params failed, mSearchLoadingLayout == null");
        return 0;
    }

    /* renamed from: u */
    private void m49804u() {
        C12034d dVar = this.f32438e;
        if (dVar == null) {
            C13479a.m54758a("WikiSearchTAG", "mWikiSearchResultAdapter == null, can not set result click listener");
        } else {
            dVar.mo46056a(new C12034d.AbstractC12037a() {
                /* class com.bytedance.ee.bear.wiki.search.WikiSearchView.C120207 */

                @Override // com.bytedance.ee.bear.wiki.search.C12034d.AbstractC12037a
                /* renamed from: a */
                public void mo46040a(String str, String str2, String str3, int i) {
                    if (WikiSearchView.this.f32444k != null) {
                        WikiSearchView.this.f32444k.onSearchItemClick(str2, str, str3, i);
                    }
                    C11933b.m49483a(WikiSearchView.this.getReportSubModule(), WikiSearchView.this.getReportSource(), "click_search_item");
                    C11933b.m49473a(i, C13598b.m55197d(str));
                }
            });
        }
    }

    /* renamed from: d */
    public void mo45995d() {
        C13479a.m54764b("WikiSearchTAG", "clearInput ...");
        mo46011o();
        this.f32435b.setText("");
        this.f32436c.setVisibility(8);
    }

    /* renamed from: e */
    public void mo45996e() {
        C13479a.m54764b("WikiSearchTAG", "showEditBarOriginView");
        mo45995d();
        this.f32437d.setVisibility(8);
        this.f32434a.setVisibility(0);
        this.f32435b.setVisibility(8);
    }

    /* renamed from: f */
    public void mo45997f() {
        C13479a.m54764b("WikiSearchTAG", "showWhitePage ...");
        mo46011o();
        mo46007k();
        setSearchEmptyViewVisibility(8);
    }

    public int getSearchContentViewHeight() {
        View view = this.f32448o;
        if (view != null) {
            return view.getHeight();
        }
        C13479a.m54758a("WikiSearchTAG", "get no result view height failed, mSearchContentView == null");
        return 0;
    }

    /* renamed from: h */
    public void mo46004h() {
        C13479a.m54764b("WikiSearchTAG", "showSearchResultPage ...");
        mo46011o();
        SmartRefreshLayout smartRefreshLayout = this.f32451r;
        if (smartRefreshLayout != null) {
            smartRefreshLayout.setVisibility(0);
        }
        setSearchEmptyViewVisibility(8);
    }

    /* renamed from: j */
    public void mo46006j() {
        C13479a.m54764b("WikiSearchTAG", "showOriginPage ...");
        mo45995d();
        this.f32437d.setVisibility(8);
        this.f32434a.setVisibility(0);
        this.f32435b.setVisibility(8);
        mo45997f();
    }

    /* renamed from: k */
    public void mo46007k() {
        C13479a.m54764b("WikiSearchTAG", "hiddenRefreshLayout ...");
        SmartRefreshLayout smartRefreshLayout = this.f32451r;
        if (smartRefreshLayout != null) {
            smartRefreshLayout.setVisibility(8);
            this.f32451r.mo96416n();
        }
    }

    /* renamed from: l */
    public void mo46008l() {
        C13479a.m54764b("WikiSearchTAG", "show keyboard...");
        this.f32446m.setFocusableInTouchMode(false);
        this.f32435b.setFocusable(true);
        this.f32435b.requestFocus();
        C10548d.m43703b(this.f32435b);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C13479a.m54764b("WikiSearchTAG", "remove network observer");
        mo46015q();
        this.f32433F.mo237935a();
    }

    private int getSearchEmptyViewMarginTop() {
        SpaceEmptyState spaceEmptyState = this.f32454u;
        if (spaceEmptyState != null) {
            return ((RelativeLayout.LayoutParams) spaceEmptyState.getLayoutParams()).topMargin;
        }
        C13479a.m54758a("WikiSearchTAG", "get search empty view layout params failed, mSearchEmptyState == " + ((Object) null));
        return 0;
    }

    /* renamed from: s */
    private void m49802s() {
        this.f32436c.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.wiki.search.WikiSearchView.View$OnClickListenerC120163 */

            public void onClick(View view) {
                C13479a.m54764b("WikiSearchTAG", "cancel input click...");
                WikiSearchView.this.mo45995d();
                WikiSearchView.this.mo45997f();
                if (WikiSearchView.this.f32439f == null) {
                    C13479a.m54758a("WikiSearchTAG", "cancel input mOnCancelInputClickListener == null");
                } else {
                    WikiSearchView.this.f32439f.onCancelInputClick();
                }
            }
        });
        this.f32437d.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.wiki.search.WikiSearchView.View$OnClickListenerC120174 */

            public void onClick(View view) {
                C13479a.m54764b("WikiSearchTAG", "cancel search click...");
                WikiSearchView.this.mo46006j();
                WikiSearchView.this.mo46009m();
                if (WikiSearchView.this.f32440g == null) {
                    C13479a.m54758a("WikiSearchTAG", "cancel search mOnCancelSearchClickListener == null");
                } else {
                    WikiSearchView.this.f32440g.onCancelSearchClick();
                }
            }
        });
        this.f32435b.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            /* class com.bytedance.ee.bear.wiki.search.WikiSearchView.C120185 */

            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 3) {
                    return true;
                }
                C13479a.m54764b("WikiSearchTAG", "click keyboard search button");
                WikiSearchView.this.mo46014p();
                return true;
            }
        });
        this.f32434a.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.wiki.search.WikiSearchView.View$OnClickListenerC120196 */

            public void onClick(View view) {
                C13479a.m54764b("WikiSearchTAG", "search text view click listener");
                WikiSearchView.this.f32434a.setVisibility(8);
                WikiSearchView.this.f32435b.setVisibility(0);
                WikiSearchView.this.f32437d.setVisibility(0);
                WikiSearchView.this.bringToFront();
                WikiSearchView.this.mo45997f();
                if (WikiSearchView.this.f32442i == null) {
                    C13479a.m54758a("WikiSearchTAG", "input search key edit text click mOnSearchEditTextClickListener == null");
                    return;
                }
                WikiSearchView.this.f32442i.onSearchTextViewClick();
                C11933b.m49483a("wiki_pages", "wiki_pages_view", "search_button");
            }
        });
    }

    /* renamed from: t */
    private void m49803t() {
        this.f32433F.mo237937a(C13716b.m55614a(this.f32435b).debounce(300, TimeUnit.MILLISECONDS).observeOn(C11678b.m48481e()).subscribe(new Consumer() {
            /* class com.bytedance.ee.bear.wiki.search.$$Lambda$WikiSearchView$J19m0jTMOMhRanOC72gxeTDNus */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WikiSearchView.this.m49799a((WikiSearchView) ((CharSequence) obj));
            }
        }, $$Lambda$WikiSearchView$o_UqAhj9gSyYlx7YT4w2yhf6Gp8.INSTANCE));
    }

    /* renamed from: b */
    public void mo45993b() {
        if (this.f32436c.getVisibility() == 8) {
            this.f32436c.setVisibility(0);
        }
    }

    /* renamed from: c */
    public void mo45994c() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("refreshLayoutFinishLoadMore mRefreshLayout == null : ");
        if (this.f32451r == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        C13479a.m54764b("WikiSearchTAG", sb.toString());
        SmartRefreshLayout smartRefreshLayout = this.f32451r;
        if (smartRefreshLayout != null) {
            smartRefreshLayout.mo96416n();
        }
    }

    /* renamed from: g */
    public void mo45998g() {
        C13479a.m54764b("WikiSearchTAG", "showLoadingAnimation ...");
        this.f32445l = true;
        mo45989a(getSearchContentViewHeight(), getKeyboardHeight(), true, false, this.f32445l);
        mo46010n();
        mo46007k();
        setSearchEmptyViewVisibility(8);
    }

    public int getKeyboardHeight() {
        AbstractC10550f fVar = this.f32430C;
        if (fVar == null) {
            C13479a.m54758a("WikiSearchTAG", "mKeyboardHeightProvider == null");
            return 0;
        }
        int j = fVar.mo39936j();
        if (!this.f32430C.mo39935i()) {
            C13479a.m54764b("WikiSearchTAG", "keyboard is not showing, set keyboardHeight = 0");
            j = 0;
        }
        if (getSearchContentViewHeight() >= j) {
            return j;
        }
        C13479a.m54764b("WikiSearchTAG", "emptyViewHeight < keyboardHeight, set keyboardHeight = 0");
        return 0;
    }

    /* renamed from: i */
    public void mo46005i() {
        C13479a.m54764b("WikiSearchTAG", "showNoResultPage ... ");
        this.f32445l = false;
        mo46011o();
        mo46007k();
        mo45989a(getSearchContentViewHeight(), getKeyboardHeight(), true, false, this.f32445l);
        setSearchEmptyViewVisibility(0);
    }

    /* renamed from: n */
    public void mo46010n() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("playLoadingAnimation mSearchLoadingLayout != null mSearchLoadingView == null : ");
        boolean z2 = true;
        if (this.f32449p == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(" ");
        if (this.f32450q != null) {
            z2 = false;
        }
        sb.append(z2);
        C13479a.m54764b("WikiSearchTAG", sb.toString());
        RelativeLayout relativeLayout = this.f32449p;
        if (relativeLayout != null && this.f32450q != null) {
            relativeLayout.setVisibility(0);
            this.f32450q.playAnimation();
        }
    }

    /* renamed from: o */
    public void mo46011o() {
        boolean z;
        BearLottieView bearLottieView;
        StringBuilder sb = new StringBuilder();
        sb.append("cancelLoadingAnimation mSearchLoadingLayout != null mSearchLoadingView == null : ");
        boolean z2 = true;
        if (this.f32449p == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(" ");
        if (this.f32450q != null) {
            z2 = false;
        }
        sb.append(z2);
        C13479a.m54764b("WikiSearchTAG", sb.toString());
        if (this.f32449p != null && (bearLottieView = this.f32450q) != null) {
            bearLottieView.cancelAnimation();
            this.f32449p.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f32429B == null) {
            C13479a.m54758a("WikiSearchTAG", "mNetworkStateObserver == null, init mNetworkStateObserver again");
            this.f32429B = new C12022a();
        }
        LiveData<ConnectionService.NetworkState> liveData = this.f32457x;
        if (liveData == null) {
            C13479a.m54758a("WikiSearchTAG", "register network observer failed! mNetworkState == null");
        } else {
            liveData.mo5923a((LifecycleOwner) getContext(), this.f32429B);
        }
        m49803t();
    }

    /* renamed from: q */
    public void mo46015q() {
        boolean z;
        C12022a aVar;
        LiveData<ConnectionService.NetworkState> liveData = this.f32457x;
        if (liveData == null || (aVar = this.f32429B) == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("remove network failed! mNetworkState == null ");
            boolean z2 = true;
            if (this.f32457x == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            sb.append(" mNetworkStateObserver == null ");
            if (this.f32429B != null) {
                z2 = false;
            }
            sb.append(z2);
            C13479a.m54758a("WikiSearchTAG", sb.toString());
            return;
        }
        liveData.mo5928b(aVar);
    }

    /* renamed from: a */
    public void mo45987a() {
        boolean z;
        if (this.f32447n.getParent() == null) {
            C13479a.m54764b("WikiSearchTAG", "viewStub has already initialized");
            return;
        }
        View inflate = this.f32447n.inflate();
        this.f32448o = inflate;
        if (inflate == null) {
            C13479a.m54758a("WikiSearchTAG", "inflate view stub failed");
            return;
        }
        this.f32449p = (RelativeLayout) findViewById(R.id.wiki_search_loading_layout);
        this.f32450q = (BearLottieView) findViewById(R.id.wiki_search_loading);
        this.f32451r = (SmartRefreshLayout) findViewById(R.id.wiki_search_refresh_layout);
        this.f32452s = (BaseRecyclerView) findViewById(R.id.wiki_search_result_view);
        this.f32453t = (RelativeLayout) findViewById(R.id.wiki_search_empty_view);
        this.f32454u = (SpaceEmptyState) findViewById(R.id.wiki_search_no_result_empty_state);
        this.f32452s.setLayoutManager(this.f32455v);
        if (this.f32428A == SearchMode.SPACE_SEARCH_MODE) {
            z = true;
        } else {
            z = false;
        }
        C12034d dVar = new C12034d(z, this.f32459z);
        this.f32438e = dVar;
        this.f32452s.setAdapter(dVar);
        SmartRefreshLayout smartRefreshLayout = this.f32451r;
        Context context = getContext();
        Objects.requireNonNull(context);
        smartRefreshLayout.mo96367b((AbstractC27125d) new LoadMoreFooter(context));
        setRefreshLayoutEnableLoadMore(false);
        m49804u();
        this.f32452s.addOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.bytedance.ee.bear.wiki.search.WikiSearchView.C120141 */

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m49828a() {
                WikiSearchView.this.mo46014p();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (i == 1) {
                    C13742g.m55706a(new Runnable() {
                        /* class com.bytedance.ee.bear.wiki.search.$$Lambda$WikiSearchView$1$imd1eR17UWmk1AOYcxTea7ZtfUY */

                        public final void run() {
                            WikiSearchView.C120141.this.m49828a();
                        }
                    }, 200);
                }
            }
        });
        this.f32451r.mo96368b(new AbstractC27137a() {
            /* class com.bytedance.ee.bear.wiki.search.WikiSearchView.C120152 */

            @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27137a
            public void onLoadmore(AbstractC27129h hVar) {
                C13479a.m54764b("WikiSearchTAG", "load more");
                if (WikiSearchView.this.f32441h != null) {
                    WikiSearchView.this.f32441h.onPullUpSearchMore();
                }
            }
        });
    }

    public void setOnCancelInputClickListener(AbstractC12023b bVar) {
        this.f32439f = bVar;
    }

    public void setOnCancelQueryListener(AbstractC12024c cVar) {
        this.f32443j = cVar;
    }

    public void setOnCancelSearchClickListener(AbstractC12025d dVar) {
        this.f32440g = dVar;
    }

    public void setOnInputSearchKeyListener(AbstractC12026e eVar) {
        this.f32456w = eVar;
    }

    public void setOnPullUpSearchMoreListener(AbstractC12027f fVar) {
        this.f32441h = fVar;
    }

    public void setOnSearchEditTextClickListener(AbstractC12028g gVar) {
        this.f32442i = gVar;
    }

    public void setSearchResultItemClickListener(AbstractC12029h hVar) {
        this.f32444k = hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.wiki.search.WikiSearchView$a */
    public class C12022a implements AbstractC1178x<ConnectionService.NetworkState> {
        private C12022a() {
        }

        /* renamed from: a */
        public void onChanged(ConnectionService.NetworkState networkState) {
            if (WikiSearchView.this.f32438e == null) {
                C13479a.m54758a("WikiSearchTAG", "out net observer, mWikiSearchResultAdapter == null");
                return;
            }
            String obj = WikiSearchView.this.f32435b.getText().toString();
            if (TextUtils.isEmpty(obj)) {
                C13479a.m54764b("WikiSearchTAG", "net work status changed but key words is empty, showWhitePage ... ");
                WikiSearchView.this.mo45997f();
                WikiSearchView.this.f32436c.setVisibility(8);
            } else if (!TextUtils.isEmpty(obj) && !WikiSearchView.this.f32438e.mo46058b()) {
                if (networkState == null || !networkState.mo20041b()) {
                    C13479a.m54764b("WikiSearchTAG", "net work status changed, no net work, key words' length is " + obj.length());
                    WikiSearchView.this.setRefreshLayoutEnableLoadMore(false);
                    WikiSearchView.this.mo46005i();
                    if (WikiSearchView.this.f32443j != null) {
                        WikiSearchView.this.f32443j.onCancelQuery();
                        return;
                    }
                    return;
                }
                WikiSearchView wikiSearchView = WikiSearchView.this;
                wikiSearchView.mo45991a(wikiSearchView.f32435b.getText().toString());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.wiki.search.WikiSearchView$i */
    public class C12030i implements AbstractC10549e {
        private C12030i() {
        }

        @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
        public void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
            if (fVar.mo39935i()) {
                WikiSearchView.this.f32435b.requestFocus();
            } else {
                C13479a.m54764b("WikiSearchTAG", "keyboard dismiss, clear focus");
                WikiSearchView.this.mo46016r();
            }
            WikiSearchView wikiSearchView = WikiSearchView.this;
            wikiSearchView.mo45989a(wikiSearchView.getSearchContentViewHeight(), i, false, false, WikiSearchView.this.f32445l);
        }
    }

    public void setCancelSearchTextViewVisibility(int i) {
        this.f32437d.setVisibility(i);
    }

    public void setSearchEditTextHint(int i) {
        this.f32435b.setHint(i);
    }

    public void setSearchInputEditTextVisibility(int i) {
        this.f32435b.setVisibility(i);
    }

    public void setSearchTextViewEnabled(boolean z) {
        this.f32434a.setEnabled(z);
    }

    public void setSearchTextViewText(int i) {
        this.f32434a.setHint(i);
    }

    public void setSearchTextViewVisible(int i) {
        this.f32434a.setVisibility(i);
    }

    /* renamed from: a */
    public void mo45988a(int i) {
        this.f32446m.setVisibility(i);
    }

    public void setTreePanelNoResultViewPosition(int i) {
        mo45989a(i, getKeyboardHeight(), false, true, this.f32445l);
    }

    public void setKeyBoardHeightChangeListener(Activity activity) {
        if (activity == null) {
            C13479a.m54758a("WikiSearchTAG", "set keyboard listener failed, activity is null");
            return;
        }
        AbstractC10550f b = AbstractC10550f.AbstractC10551a.m43717b(activity);
        this.f32430C = b;
        b.mo39924a(this.f32431D);
    }

    public void setLoadingViewLayoutParams(int i) {
        RelativeLayout relativeLayout = this.f32449p;
        if (relativeLayout == null) {
            C13479a.m54758a("WikiSearchTAG", "set loading view layout params failed, mSearchLoadingLayout == null");
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) relativeLayout.getLayoutParams();
        layoutParams.topMargin = i;
        this.f32449p.setLayoutParams(layoutParams);
    }

    public void setSearchEmptyViewLayoutParams(int i) {
        SpaceEmptyState spaceEmptyState = this.f32454u;
        if (spaceEmptyState == null) {
            C13479a.m54758a("WikiSearchTAG", "set search empty view layout params failed, mSearchEmptyState == null");
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) spaceEmptyState.getLayoutParams();
        layoutParams.topMargin = i;
        this.f32454u.setLayoutParams(layoutParams);
    }

    public WikiSearchView(Context context) {
        super(context);
        m49798a(context);
    }

    public void setRefreshLayoutEnableLoadMore(boolean z) {
        boolean z2;
        StringBuilder sb = new StringBuilder();
        sb.append("mRefreshLayout == null : ");
        if (this.f32451r == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sb.append(z2);
        C13479a.m54764b("WikiSearchTAG", sb.toString());
        SmartRefreshLayout smartRefreshLayout = this.f32451r;
        if (smartRefreshLayout != null) {
            smartRefreshLayout.mo96415m(z);
        }
    }

    public void setSearchEmptyViewVisibility(int i) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("mSearchEmptyView == null : ");
        if (this.f32453t == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        C13479a.m54764b("WikiSearchTAG", sb.toString());
        RelativeLayout relativeLayout = this.f32453t;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(i);
        }
    }

    /* renamed from: a */
    private void m49798a(Context context) {
        View.inflate(context, R.layout.wiki_search_layout, this);
        this.f32446m = (RelativeLayout) findViewById(R.id.wiki_search_bar);
        this.f32434a = (SpaceEditText) findViewById(R.id.wiki_search_bar_item_search_bar_holder);
        this.f32435b = (SpaceEditText) findViewById(R.id.wiki_search_bar_item_search_bar);
        this.f32436c = (ImageView) findViewById(R.id.wiki_search_bar_item_clear_icon);
        this.f32437d = (TextView) findViewById(R.id.wiki_search_bar_item_cancel_button);
        this.f32447n = (ViewStub) findViewById(R.id.wiki_search_content_view_stub);
        m49802s();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m49799a(CharSequence charSequence) throws Exception {
        C13479a.m54772d("WikiSearchTAG", "textChanged, charSeq: " + charSequence.toString());
        mo45991a(charSequence.toString());
    }

    public WikiSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m49798a(context);
    }

    /* renamed from: a */
    private void m49797a(int i, int i2, final boolean z) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.ee.bear.wiki.search.WikiSearchView.C120218 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (z) {
                    WikiSearchView.this.setLoadingViewLayoutParams(((Integer) valueAnimator.getAnimatedValue()).intValue());
                } else {
                    WikiSearchView.this.setSearchEmptyViewLayoutParams(((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            }
        });
        ofInt.setDuration(200L);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.start();
    }

    /* renamed from: a */
    public void mo45990a(C10917c cVar, FragmentActivity fragmentActivity, SearchMode searchMode) {
        this.f32458y = C5084ad.m20847d();
        this.f32432E = C5234y.m21391b();
        this.f32429B = new C12022a();
        this.f32457x = this.f32458y.mo20037a();
        this.f32431D = new C12030i();
        this.f32428A = searchMode;
    }

    /* renamed from: b */
    private void m49801b(int i, int i2, boolean z, boolean z2, boolean z3) {
        if (!z && !z2) {
            m49797a(i, i2, z3);
        } else if (z3) {
            setLoadingViewLayoutParams(i2);
        } else {
            setSearchEmptyViewLayoutParams(i2);
        }
    }

    /* renamed from: a */
    public void mo45989a(int i, int i2, boolean z, boolean z2, boolean z3) {
        RelativeLayout relativeLayout;
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.f32453t == null || (relativeLayout = this.f32449p) == null) {
            C13479a.m54758a("WikiSearchTAG", "set no search view position failed mSearchEmptyView == null, mSearchLoadingLayout == null");
        } else if (relativeLayout.getVisibility() == 8 && this.f32453t.getVisibility() == 8 && !z) {
            C13479a.m54764b("WikiSearchTAG", "mSearchLoadingLayout,s visibility is gone mSearchEmptyView's visibility is gone, do not need calculate height");
        } else if (i <= 0) {
            C13479a.m54758a("WikiSearchTAG", "noResultViewHeight <= 0 ...");
        } else {
            int i7 = i - i2;
            C13479a.m54764b("WikiSearchTAG", "no result view height = " + i + "keyboard height = " + i2);
            if (i7 < 0) {
                C13479a.m54764b("WikiSearchTAG", "set no search view, emptySpaceHeight < 0");
                if (z3) {
                    i6 = (i - getResources().getDimensionPixelSize(R.dimen.space_kit_len_120)) / 2;
                } else {
                    i6 = (i - getResources().getDimensionPixelSize(R.dimen.wiki_search_no_result_image_height)) / 2;
                }
                setSearchEmptyViewLayoutParams(i6);
                return;
            }
            if (z3) {
                i3 = getSearchLoadingLayoutMarginTop();
                i4 = (i7 - getResources().getDimensionPixelSize(R.dimen.space_kit_len_120)) / 2;
            } else {
                i3 = getSearchEmptyViewMarginTop();
                i4 = (i7 - getResources().getDimensionPixelSize(R.dimen.wiki_search_no_result_image_height)) / 2;
            }
            if (i4 <= 0) {
                C13479a.m54764b("WikiSearchTAG", "set no search view, marginTop < 0");
                if (z3) {
                    i5 = -getResources().getDimensionPixelSize(R.dimen.space_kit_len_35);
                } else {
                    i5 = 0;
                }
                m49801b(i3, i5, z2, z, z3);
                return;
            }
            m49801b(i3, i4, z2, z, z3);
        }
    }
}
