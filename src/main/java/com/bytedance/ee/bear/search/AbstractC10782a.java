package com.bytedance.ee.bear.search;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bytedance.ee.bear.contract.AbstractC5094ag;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.document.AbstractC6158t;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.facade.common.widget.BearLottieView;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.LoadMoreFooter;
import com.bytedance.ee.bear.list.cache.C8175b;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.search.AbstractC10782a;
import com.bytedance.ee.bear.search.C10841k;
import com.bytedance.ee.bear.search.adapter.C10804b;
import com.bytedance.ee.bear.search.adapter.C10811c;
import com.bytedance.ee.bear.search.adapter.SearchByTypeAdapter;
import com.bytedance.ee.bear.search.model.ChatInfo;
import com.bytedance.ee.bear.search.model.OwnerInfo;
import com.bytedance.ee.bear.search.model.SearchRecord;
import com.bytedance.ee.bear.search.model.SearchResponse;
import com.bytedance.ee.bear.search.model.SearchResult;
import com.bytedance.ee.bear.search.widget.SearchFilterView;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.BaseRecyclerView;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEditText;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p703f.C13664a;
import com.larksuite.component.universe_design.image.UDAvatar;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27125d;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.scwang.smartrefresh.layout.p1236c.AbstractC27137a;
import io.reactivex.AbstractC68307f;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.search.a */
public abstract class AbstractC10782a extends C7667e implements C10804b.AbstractC10809b, C10811c.AbstractC10812a, SearchFilterView.AbstractC10892b {

    /* renamed from: a */
    protected C10804b f28874a;

    /* renamed from: b */
    protected C10811c f28875b;

    /* renamed from: c */
    public C10870n f28876c;

    /* renamed from: d */
    public AccountService.Account f28877d;

    /* renamed from: e */
    public C10787b f28878e;

    /* renamed from: f */
    protected boolean f28879f = true;

    /* renamed from: g */
    protected boolean f28880g = true;

    /* renamed from: h */
    public boolean f28881h;

    /* renamed from: i */
    protected boolean f28882i;

    /* renamed from: j */
    protected boolean f28883j;

    /* renamed from: k */
    protected SearchTypeEnv f28884k = SearchTypeEnv.NET;

    /* renamed from: l */
    public SearchRecord f28885l = new SearchRecord();

    /* renamed from: m */
    public int f28886m = 0;

    /* renamed from: n */
    public C10841k.C10844a f28887n = new C10841k.C10844a();

    /* renamed from: o */
    public C10823f f28888o;

    /* renamed from: p */
    public String f28889p;

    /* renamed from: q */
    protected String f28890q = "none";

    /* renamed from: r */
    protected boolean f28891r = false;

    /* renamed from: s */
    protected String f28892s = String.valueOf(System.currentTimeMillis());

    /* renamed from: t */
    protected int f28893t = 0;

    /* renamed from: u */
    private C10786a f28894u;

    /* renamed from: v */
    private LinearLayoutManager f28895v;

    /* renamed from: w */
    private ArrayList<Document> f28896w = new ArrayList<>();

    /* renamed from: x */
    private List<Document> f28897x = new ArrayList();

    /* renamed from: y */
    private NetService f28898y;

    /* access modifiers changed from: protected */
    public abstract C10786a G_();

    @Override // com.bytedance.ee.bear.search.adapter.C10804b.AbstractC10809b
    /* renamed from: b */
    public void mo40821b(Document document, int i) {
    }

    @Override // com.bytedance.ee.bear.search.adapter.C10804b.AbstractC10809b
    /* renamed from: c */
    public void mo40825c(Document document, int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo40826c(boolean z) {
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public boolean mo40840s() {
        return true;
    }

    @Override // com.bytedance.ee.bear.search.adapter.C10811c.AbstractC10812a
    /* renamed from: a */
    public void mo40818a(String str, int i) {
        mo40989a(str);
        this.f28890q = "correction";
        this.f28888o.mo40922a(this.f28886m, i, "correction");
    }

    @Override // com.bytedance.ee.bear.search.adapter.C10811c.AbstractC10812a
    /* renamed from: a */
    public void mo40817a(SearchResponse.Data.Candidates candidates, int i) {
        this.f28883j = true;
        this.f28878e.f28919k.setVisibility(8);
        this.f28878e.f28922n.setVisibility(8);
        this.f28878e.f28923o.setVisibility(0);
        this.f28878e.f28925q.setText(candidates.getOwner_name());
        ((C2124f) ComponentCallbacks2C2115c.m9151c(getContext()).mo10414a(new C13664a(candidates.getAvatar_url())).mo11123a((int) R.drawable.search_owner_place_holder)).mo10399a((ImageView) this.f28878e.f28924p);
        this.f28891r = true;
        this.f28890q = "people";
        this.f28888o.mo40922a(this.f28886m, i, "people");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo40819a(boolean z) {
        this.f28878e.f28922n.setVisibility(0);
        this.f28878e.f28923o.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.bytedance.ee.bear.search.a$b */
    public static class C10787b {

        /* renamed from: a */
        View f28909a;

        /* renamed from: b */
        TextView f28910b;

        /* renamed from: c */
        TextView f28911c;

        /* renamed from: d */
        protected View f28912d;

        /* renamed from: e */
        TextView f28913e;

        /* renamed from: f */
        ImageView f28914f;

        /* renamed from: g */
        View f28915g;

        /* renamed from: h */
        public SearchFilterView f28916h;

        /* renamed from: i */
        SmartRefreshLayout f28917i;

        /* renamed from: j */
        BaseRecyclerView f28918j;

        /* renamed from: k */
        RecyclerView f28919k;

        /* renamed from: l */
        SpaceEmptyState f28920l;

        /* renamed from: m */
        BearLottieView f28921m;

        /* renamed from: n */
        protected View f28922n;

        /* renamed from: o */
        public View f28923o;

        /* renamed from: p */
        UDAvatar f28924p;

        /* renamed from: q */
        TextView f28925q;

        /* renamed from: r */
        ImageView f28926r;

        /* renamed from: s */
        protected View f28927s;

        /* renamed from: t */
        private Disposable f28928t;

        /* renamed from: d */
        public void mo40845d() {
            this.f28912d.setVisibility(0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo40849h() {
            this.f28916h.mo41410g();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo40850i() {
            this.f28916h.mo41408e();
        }

        /* renamed from: m */
        private boolean m44766m() {
            if (this.f28921m.getVisibility() == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: n */
        private void m44767n() {
            Disposable disposable = this.f28928t;
            if (disposable != null && !disposable.isDisposed()) {
                this.f28928t.dispose();
            }
        }

        /* renamed from: a */
        public void mo40841a() {
            m44765l();
            this.f28917i.setVisibility(8);
            this.f28920l.setVisibility(8);
        }

        /* renamed from: j */
        public void mo40851j() {
            this.f28927s.setVisibility(0);
            this.f28922n.setVisibility(8);
        }

        /* renamed from: k */
        public void mo40852k() {
            this.f28927s.setVisibility(8);
            this.f28922n.setVisibility(0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo40843b() {
            m44767n();
            this.f28917i.setVisibility(0);
            this.f28921m.setVisibility(8);
            this.f28920l.setVisibility(8);
        }

        /* renamed from: e */
        public void mo40846e() {
            if (this.f28916h.mo41406c()) {
                mo40848g();
            }
            this.f28912d.setVisibility(8);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo40847f() {
            this.f28916h.mo41401a();
            this.f28914f.animate().rotationBy(180.0f).setDuration(100).start();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo40848g() {
            this.f28916h.mo41405b();
            this.f28914f.animate().rotationBy(-180.0f).setDuration(100).start();
        }

        /* renamed from: l */
        private void m44765l() {
            C13479a.m54772d("BaseSearchFragment", "resetLoadingViewTimer: ");
            m44767n();
            if (!m44766m()) {
                C13479a.m54772d("BaseSearchFragment", "resetLoadingViewTimer: send timer");
                this.f28928t = Observable.timer(500, TimeUnit.MILLISECONDS).subscribeOn(C11678b.m48480d()).observeOn(C11678b.m48481e()).doOnComplete(new AbstractC68309a() {
                    /* class com.bytedance.ee.bear.search.$$Lambda$a$b$185HWqPndoc5RbE7Ol258pbJp1o */

                    @Override // io.reactivex.functions.AbstractC68309a
                    public final void run() {
                        AbstractC10782a.C10787b.this.m44768o();
                    }
                }).subscribe();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public /* synthetic */ void m44768o() throws Exception {
            C13479a.m54772d("BaseSearchFragment", "handleMessage: exec timer to show loading view");
            BearLottieView bearLottieView = this.f28921m;
            if (bearLottieView == null || bearLottieView.getWindowToken() == null) {
                C13479a.m54772d("BaseSearchFragment", "handleMessage: loading view is null");
                return;
            }
            this.f28921m.setVisibility(0);
            this.f28921m.playAnimation();
        }

        /* renamed from: c */
        public void mo40844c() {
            m44767n();
            this.f28921m.setVisibility(8);
            this.f28917i.setVisibility(8);
            this.f28920l.setVisibility(0);
            SpaceEmptyState spaceEmptyState = this.f28920l;
            spaceEmptyState.setDesc(spaceEmptyState.getContext().getString(R.string.Doc_Search_SearchNotFoundTip));
        }

        /* renamed from: a */
        public void mo40842a(boolean z) {
            this.f28916h.mo41404a(z);
            if (z) {
                this.f28916h.mo41410g();
                this.f28916h.mo41415h();
            }
        }

        public C10787b(View view) {
            this.f28909a = view.findViewById(R.id.search_container_layout);
            this.f28910b = (TextView) view.findViewById(R.id.search_result_all_txt);
            this.f28911c = (TextView) view.findViewById(R.id.search_result_subtype);
            this.f28912d = view.findViewById(R.id.search_filter_ll);
            this.f28913e = (TextView) view.findViewById(R.id.search_filter_txt);
            this.f28914f = (ImageView) view.findViewById(R.id.search_filter_arrow_icon);
            this.f28915g = view.findViewById(R.id.vertical_divider);
            this.f28916h = (SearchFilterView) view.findViewById(R.id.search_filter_view);
            this.f28918j = (BaseRecyclerView) view.findViewById(R.id.search_result_recycler);
            this.f28917i = (SmartRefreshLayout) view.findViewById(R.id.search_refresh_layout);
            this.f28920l = (SpaceEmptyState) view.findViewById(R.id.search_not_found_empty_state);
            this.f28921m = (BearLottieView) view.findViewById(R.id.search_loading);
            this.f28919k = (RecyclerView) view.findViewById(R.id.search_suggestion_list);
            this.f28922n = view.findViewById(R.id.search_filter_group);
            this.f28923o = view.findViewById(R.id.search_filter_owner_item);
            this.f28924p = (UDAvatar) view.findViewById(R.id.search_filter_owner_item_avatar);
            this.f28925q = (TextView) view.findViewById(R.id.search_filter_owner_item_name);
            this.f28926r = (ImageView) view.findViewById(R.id.search_filter_owner_item_delete);
            this.f28927s = view.findViewById(R.id.search_offline_title);
        }
    }

    @Override // com.bytedance.ee.bear.search.widget.SearchFilterView.AbstractC10892b
    /* renamed from: h */
    public void mo40831h() {
        this.f28878e.mo40848g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public NetService.C5076e mo40838q() {
        return C10841k.m44960b();
    }

    /* renamed from: r */
    public NetService.C5076e mo40839r() {
        return C10841k.m44951a("docs");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo40820b() {
        this.f28878e.mo40842a(false);
    }

    @Override // com.bytedance.ee.bear.search.widget.SearchFilterView.AbstractC10892b
    /* renamed from: f */
    public void mo40829f() {
        this.f28888o.mo40935f(this.f28886m, this.f28889p);
    }

    @Override // com.bytedance.ee.bear.search.widget.SearchFilterView.AbstractC10892b
    /* renamed from: g */
    public void mo40830g() {
        this.f28888o.mo40934e(this.f28886m, this.f28889p);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo40835l() {
        this.f28897x.clear();
        this.f28884k = SearchTypeEnv.NET;
    }

    /* renamed from: v */
    private void mo40943v() {
        C5084ad.m20847d().mo20037a().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.search.$$Lambda$a$_lNzlJnBydyK2DiE9ZAMBVFYqz0 */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                AbstractC10782a.this.m44723a((AbstractC10782a) ((ConnectionService.NetworkState) obj));
            }
        });
        this.f28876c.getSearchResultList().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.search.$$Lambda$a$csYAh2QU1NRpIa6hl0m0DMysy_M */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                AbstractC10782a.this.m44724a((AbstractC10782a) ((SearchResult) obj));
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo40832i() {
        if (this.f28879f) {
            AbstractC68307f.m265083a("").mo237985a(C11678b.m48480d()).mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.search.$$Lambda$a$manDrHNmgSEAIOr72jnFwtYgdwM */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AbstractC10782a.this.m44729b((AbstractC10782a) ((String) obj));
                }
            }, $$Lambda$a$Ich1RQ65Bd079Fsa7iqUARlch08.INSTANCE);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo40837p() {
        this.f28894u.f28903b.setFocusableInTouchMode(false);
        this.f28894u.f28905d.setFocusable(true);
        this.f28894u.f28905d.requestFocus();
        C10548d.m43703b(this.f28894u.f28905d);
    }

    /* renamed from: u */
    private void mo40942u() {
        this.f28878e.f28926r.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.search.AbstractC10782a.C107831 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                AbstractC10782a.this.mo40819a(true);
            }
        });
        this.f28875b.mo40905a(this);
        this.f28878e.f28918j.addOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.bytedance.ee.bear.search.AbstractC10782a.C107842 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (i == 0) {
                    AbstractC10782a.this.mo40832i();
                }
            }
        });
        this.f28878e.f28917i.mo96368b(new AbstractC27137a() {
            /* class com.bytedance.ee.bear.search.$$Lambda$a$MH7EGjtjOnFIRN3ZYPHLOl6oEWY */

            @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27137a
            public final void onLoadmore(AbstractC27129h hVar) {
                AbstractC10782a.this.m44725a((AbstractC10782a) hVar);
            }
        });
        this.f28878e.f28916h.setListener(this);
        this.f28878e.f28912d.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.search.AbstractC10782a.C107853 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (AbstractC10782a.this.f28878e.f28916h.mo41406c()) {
                    AbstractC10782a.this.f28878e.mo40848g();
                    return;
                }
                AbstractC10782a.this.f28878e.mo40847f();
                AbstractC10782a.this.f28888o.mo40924a(AbstractC10782a.this.f28886m, AbstractC10782a.this.f28889p);
                if (AbstractC10782a.this.getActivity() != null) {
                    AbstractC10782a.this.mo40836o();
                }
            }
        });
    }

    @Override // com.bytedance.ee.bear.search.widget.SearchFilterView.AbstractC10892b
    /* renamed from: c */
    public void mo40824c() {
        if (getActivity() != null) {
            getActivity().startActivityForResult(new Intent(getActivity(), SearchSelectTypeActivity.class), 3);
            getActivity().overridePendingTransition(R.anim.facade_slide_bottom_in, 0);
        }
        this.f28888o.mo40933d(this.f28886m, this.f28889p);
    }

    @Override // com.bytedance.ee.bear.search.widget.SearchFilterView.AbstractC10892b
    /* renamed from: d */
    public void mo40827d() {
        this.f28888o.mo40932c(this.f28886m, this.f28889p);
        if (getActivity() != null) {
            ((AbstractC10819d) KoinJavaComponent.m268610a(AbstractC10819d.class)).mo40917b(getActivity(), this.f28878e.f28916h.getChatIdList(), "EXTRA_CHAT_INFO", 4098);
        }
    }

    @Override // com.bytedance.ee.bear.search.widget.SearchFilterView.AbstractC10892b
    /* renamed from: e */
    public void mo40828e() {
        this.f28888o.mo40931b(this.f28886m, this.f28889p);
        if (getActivity() != null) {
            ((AbstractC10819d) KoinJavaComponent.m268610a(AbstractC10819d.class)).mo40916a(getActivity(), this.f28878e.f28916h.getOwnerIdList(), "EXTRA_OWNER_INFO", 4097);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo40834k() {
        String obj = this.f28894u.f28905d.getText().toString();
        if (TextUtils.isEmpty(obj)) {
            this.f28876c.searchFromCache(obj);
            this.f28884k = SearchTypeEnv.CACHE;
            return;
        }
        this.f28878e.mo40844c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo40836o() {
        this.f28894u.f28903b.setFocusableInTouchMode(true);
        this.f28894u.f28905d.clearFocus();
        if (getActivity() != null) {
            getActivity().getWindow().setSoftInputMode(2);
        }
        C10548d.m43697a((View) this.f28894u.f28905d);
    }

    /* renamed from: t */
    private void mo40941t() {
        this.f28878e.f28918j.setLayoutManager(this.f28895v);
        this.f28878e.f28918j.setAdapter(this.f28874a);
        SmartRefreshLayout smartRefreshLayout = this.f28878e.f28917i;
        Context context = getContext();
        Objects.requireNonNull(context);
        smartRefreshLayout.mo96367b((AbstractC27125d) new LoadMoreFooter(context));
        this.f28878e.f28919k.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f28878e.f28919k.setAdapter(this.f28875b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo40833j() {
        this.f28874a.mo40899a(this.f28879f);
        if (!this.f28879f) {
            this.f28878e.f28919k.setVisibility(8);
            mo40819a(false);
            if (this.f28897x.size() > 0) {
                HashSet hashSet = new HashSet();
                for (Document document : this.f28897x) {
                    if (((AbstractC6158t) KoinJavaComponent.m268610a(AbstractC6158t.class)).mo20316a(document.mo32483t())) {
                        hashSet.add(document.mo32472o());
                    }
                }
                C13479a.m54764b("BaseSearchFragment", "objTokens size = " + hashSet.size());
                if (!hashSet.isEmpty()) {
                    this.f28876c.queryListCacheStatus(hashSet).mo238001b(new Consumer() {
                        /* class com.bytedance.ee.bear.search.$$Lambda$a$DGgHNd6HOOHkRwiNhATx1A3y2Bg */

                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            AbstractC10782a.this.m44728a((AbstractC10782a) ((List) obj));
                        }
                    }, $$Lambda$a$VC2R4ZeyCeEWp39lfFMbwFg1XFc.INSTANCE);
                    return;
                }
                return;
            }
            this.f28878e.mo40851j();
            mo40834k();
            return;
        }
        mo40835l();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m44723a(ConnectionService.NetworkState networkState) {
        if (networkState != null && this.f28879f != networkState.mo20041b()) {
            this.f28879f = networkState.mo20041b();
            mo40833j();
            this.f28878e.f28917i.mo96415m(this.f28879f);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m44725a(AbstractC27129h hVar) {
        if (this.f28879f) {
            this.f28884k = SearchTypeEnv.LOAD_NEXT;
            this.f28887n.f29062b += 20;
            this.f28876c.search(this.f28886m, this.f28887n);
        }
    }

    @Override // com.bytedance.ee.bear.search.widget.SearchFilterView.AbstractC10892b
    /* renamed from: b */
    public void mo40823b(boolean z) {
        int color = getResources().getColor(R.color.primary_pri_500);
        int color2 = getResources().getColor(R.color.text_title);
        TextView textView = this.f28878e.f28913e;
        if (!z) {
            color = color2;
        }
        textView.setTextColor(color);
    }

    /* renamed from: a */
    private void mo40989a(String str) {
        this.f28878e.f28919k.setVisibility(8);
        this.f28894u.f28905d.setText(str);
        this.f28894u.f28905d.setSelection(str.length());
        this.f28882i = false;
        this.f28891r = true;
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NetService netService = (NetService) KoinJavaComponent.m268610a(NetService.class);
        this.f28898y = netService;
        this.f28876c = (C10870n) aj.m5365a(this, C10824g.m44896a(C10841k.m44952a(netService))).mo6005a(C10870n.class);
        this.f28879f = C5084ad.m20847d().mo20038b().mo20041b();
        this.f28895v = new LinearLayoutManager(getContext());
        this.f28874a = new C10804b(ar.m20936a(), this.f28879f, this.f28877d, this);
        this.f28875b = new C10811c(getContext());
        this.f28888o = new C10823f();
        AccountService.Account f = ((an) KoinJavaComponent.m268610a(an.class)).mo16408f();
        this.f28877d = f;
        if (f != null) {
            this.f28874a.mo40896a(f);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m44728a(List list) throws Exception {
        if (!(list == null || list.isEmpty())) {
            C13479a.m54764b("BaseSearchFragment", "cached size = " + list.size());
            boolean z = false;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C8175b bVar = (C8175b) it.next();
                for (Document document : this.f28897x) {
                    if (TextUtils.equals(document.mo32472o(), bVar.mo31677a())) {
                        document.mo32431b(true);
                        z = true;
                    }
                }
            }
            if (z) {
                this.f28874a.notifyDataSetChanged();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m44729b(String str) throws Exception {
        int findFirstVisibleItemPosition = this.f28895v.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = this.f28895v.findLastVisibleItemPosition();
        ArrayList arrayList = new ArrayList(this.f28897x);
        if (arrayList.size() > 0) {
            if (findFirstVisibleItemPosition < 0 || findLastVisibleItemPosition < 0) {
                findFirstVisibleItemPosition = 0;
                findLastVisibleItemPosition = Math.min(8, arrayList.size() - 1);
            }
            C13479a.m54772d("BaseSearchFragment", "preloadDocs firstPos: " + findFirstVisibleItemPosition + "    lastPos: " + findLastVisibleItemPosition);
            ArrayList arrayList2 = new ArrayList();
            while (findFirstVisibleItemPosition <= findLastVisibleItemPosition && findFirstVisibleItemPosition < arrayList.size()) {
                Document document = (Document) arrayList.get(findFirstVisibleItemPosition);
                if (((AbstractC6158t) KoinJavaComponent.m268610a(AbstractC6158t.class)).mo20316a(document.mo32483t())) {
                    arrayList2.add(new OfflineDoc(document.mo32472o(), document.mo32481s(), document.mo32483t(), "tab_search"));
                }
                findFirstVisibleItemPosition++;
            }
            if (arrayList2.size() > 0) {
                ar.m20936a().mo41508c(AbstractC5094ag.class).mo238020d(new Function(arrayList2) {
                    /* class com.bytedance.ee.bear.search.$$Lambda$a$wvA01hRfmWv4nUfkw0dJnHqt6qc */
                    public final /* synthetic */ List f$0;

                    {
                        this.f$0 = r1;
                    }

                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return ((AbstractC5094ag) obj).preloadDocs(this.f$0);
                    }
                }).mo238001b($$Lambda$a$C2Muegbl8XWI_gzuN136cAodmXE.INSTANCE, $$Lambda$a$M3KeWWr0RDYZ3g4qCWbXr3jIrA.INSTANCE);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m44724a(SearchResult searchResult) {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis() - this.f28876c.getSearchStartTime();
        if (this.f28884k == SearchTypeEnv.LOAD_NEXT) {
            this.f28888o.mo40927a("wiki", currentTimeMillis, this.f28876c.getResultType());
        } else {
            this.f28888o.mo40928a("wiki", currentTimeMillis, this.f28876c.getResultType(), C10820e.m44875a().mo40918b());
        }
        if (searchResult == null) {
            this.f28878e.mo40844c();
            return;
        }
        this.f28878e.f28917i.mo96416n();
        String obj = this.f28894u.f28905d.getText().toString();
        if (!this.f28882i || this.f28884k == SearchTypeEnv.CACHE || TextUtils.isEmpty(obj)) {
            z = false;
        } else {
            z = true;
        }
        int i = 8;
        if (!z) {
            this.f28878e.f28919k.setVisibility(8);
        }
        if (z && this.f28884k == SearchTypeEnv.NET) {
            this.f28875b.mo40907a(searchResult.getCandidates(), searchResult.getCorrections(), searchResult.getSuggestions(), this.f28881h);
            RecyclerView recyclerView = this.f28878e.f28919k;
            if (this.f28875b.getItemCount() != 0) {
                i = 0;
            }
            recyclerView.setVisibility(i);
            this.f28888o.mo40929a(this.f28876c.getRequestId(), searchResult);
        }
        if ((this.f28884k == SearchTypeEnv.NET || this.f28884k == SearchTypeEnv.CACHE) && C13657b.m55421a(searchResult.getObjs())) {
            C13479a.m54764b("BaseSearchFragment", "search return empty result");
            this.f28878e.mo40844c();
            this.f28874a.mo40898a(new ArrayList());
            this.f28888o.mo40925a(this.f28886m, this.f28889p, this.f28876c.getRequestId());
            return;
        }
        if (this.f28884k != SearchTypeEnv.LOAD_NEXT) {
            this.f28878e.f28918j.scrollToPosition(0);
            this.f28897x.clear();
            this.f28896w.clear();
        }
        this.f28897x.addAll(searchResult.getObjs());
        for (Document document : searchResult.getObjs()) {
            if (document.mo32483t() == C8275a.f22375h.mo32555b()) {
                document.mo32443g(((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31518c(getContext(), document).replaceAll("<em>", "").replaceAll("</em>", ""));
                this.f28896w.add(document);
            }
        }
        this.f28874a.mo40898a(this.f28897x);
        this.f28878e.mo40843b();
        boolean c = mo40826c(searchResult.isHas_more());
        this.f28878e.f28917i.mo96415m(c);
        this.f28878e.f28917i.mo96401h(!c);
        if (this.f28897x.size() < 15 && c && this.f28879f && this.f28884k == SearchTypeEnv.NET) {
            this.f28884k = SearchTypeEnv.LOAD_NEXT;
            this.f28887n.f29062b += 20;
            this.f28876c.search(this.f28886m, this.f28887n);
        }
        mo40832i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo40814a(View view) {
        this.f28878e = new C10787b(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo40816a(SearchRecord searchRecord) {
        this.f28876c.saveSearchHistory(searchRecord);
    }

    @Override // com.bytedance.ee.bear.search.adapter.C10811c.AbstractC10812a
    /* renamed from: b */
    public void mo40822b(String str, int i) {
        mo40989a(str);
        this.f28890q = "completion";
        this.f28888o.mo40922a(this.f28886m, i, "completion");
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C10786a G_ = G_();
        this.f28894u = G_;
        if (G_ != null || getActivity() == null) {
            mo40814a(this.f28894u.f28902a);
            mo40941t();
            mo40942u();
            mo40943v();
            return;
        }
        getActivity().finish();
    }

    @Override // com.bytedance.ee.bear.search.adapter.C10804b.AbstractC10809b
    /* renamed from: a */
    public void mo40815a(Document document, int i) {
        document.mo32443g(((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31518c(getContext(), document).replaceAll("<em>", "").replaceAll("</em>", ""));
        String s = document.mo32481s();
        try {
            s = Uri.parse(document.mo32481s()).buildUpon().appendQueryParameter("from", "tab_search").build().toString();
        } catch (Exception e) {
            C13479a.m54761a("BaseSearchFragment", e);
        }
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17293a(s, ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31482a(getContext(), document, "search", this.f28896w, "", ""));
        if (this.f28880g && !TextUtils.isEmpty(this.f28885l.getQuery())) {
            this.f28885l.setHighlight(((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31518c(getContext(), document));
            this.f28885l.setToken(document.mo32472o());
            this.f28885l.setType(document.mo32483t());
            mo40816a(this.f28885l);
            C10839j.m44943a().mo40956b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        SearchResponse.Data.SpaceData spaceData;
        super.onActivityResult(i, i2, intent);
        if (i != 2 && i != 1) {
            if (i == 3) {
                this.f28878e.f28916h.setTypeItem((SearchByTypeAdapter.TypeItem) intent.getSerializableExtra("KEY_TYPE_ITEM"));
                return;
            }
            List<OwnerInfo> list = null;
            if (i == 4097) {
                String stringExtra = intent.getStringExtra("EXTRA_OWNER_INFO");
                try {
                    list = JSONObject.parseArray(stringExtra, OwnerInfo.class);
                } catch (Exception e) {
                    C13479a.m54758a("BaseSearchFragment", "select owner info parse json error:" + e.getMessage() + ", origin json:" + stringExtra);
                }
                this.f28878e.f28916h.setOwnerList(list);
            } else if (i == 4098) {
                String stringExtra2 = intent.getStringExtra("EXTRA_CHAT_INFO");
                try {
                    list = JSONObject.parseArray(stringExtra2, ChatInfo.class);
                } catch (Exception e2) {
                    C13479a.m54758a("BaseSearchFragment", "select chat info parse json error:" + e2.getMessage() + ", json:" + stringExtra2);
                }
                this.f28878e.f28916h.setChatList((List<ChatInfo>) list);
            } else if (i == 4 && (spaceData = (SearchResponse.Data.SpaceData) intent.getSerializableExtra("key_type_space_item")) != null) {
                this.f28878e.f28916h.setWikiSpace(spaceData);
            }
        }
    }

    /* renamed from: com.bytedance.ee.bear.search.a$a */
    public static class C10786a {

        /* renamed from: a */
        View f28902a;

        /* renamed from: b */
        ViewGroup f28903b;

        /* renamed from: c */
        ImageView f28904c;

        /* renamed from: d */
        SpaceEditText f28905d;

        /* renamed from: e */
        ImageView f28906e;

        /* renamed from: f */
        TextView f28907f;

        /* renamed from: g */
        View f28908g;

        public C10786a(View view, ViewGroup viewGroup, ImageView imageView, SpaceEditText spaceEditText, ImageView imageView2, TextView textView, View view2) {
            this.f28902a = view;
            this.f28903b = viewGroup;
            this.f28904c = imageView;
            this.f28905d = spaceEditText;
            this.f28906e = imageView2;
            this.f28907f = textView;
            this.f28908g = view2;
        }
    }
}
