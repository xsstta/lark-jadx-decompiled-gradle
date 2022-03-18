package com.bytedance.ee.bear.search.lark.space;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.aj;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.DocObjInfo;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.SimpleListDataChangeCallback;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.contract.leanmode.AbstractC5197b;
import com.bytedance.ee.bear.contract.route.parcelable.DocOperateBean;
import com.bytedance.ee.bear.document.AbstractC6158t;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.DocsLinearLayoutManager;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.LoadMoreFooter;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.more.export.AbstractC10209c;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.CommonMoreItemId;
import com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.MoreItemGroup;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.search.AbstractC10816c;
import com.bytedance.ee.bear.search.AbstractC10819d;
import com.bytedance.ee.bear.search.C10820e;
import com.bytedance.ee.bear.search.C10823f;
import com.bytedance.ee.bear.search.C10824g;
import com.bytedance.ee.bear.search.C10841k;
import com.bytedance.ee.bear.search.C10868m;
import com.bytedance.ee.bear.search.C10870n;
import com.bytedance.ee.bear.search.SearchSelectTypeActivity;
import com.bytedance.ee.bear.search.SearchTypeEnv;
import com.bytedance.ee.bear.search.adapter.C10804b;
import com.bytedance.ee.bear.search.adapter.SearchByTypeAdapter;
import com.bytedance.ee.bear.search.lark.space.SpaceSearchFragment;
import com.bytedance.ee.bear.search.model.ChatInfo;
import com.bytedance.ee.bear.search.model.OwnerInfo;
import com.bytedance.ee.bear.search.model.SearchRecord;
import com.bytedance.ee.bear.search.model.SearchResult;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p718t.C13748k;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27125d;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.scwang.smartrefresh.layout.p1236c.AbstractC27137a;
import com.ss.android.lark.widget.searchfilter.FilterData;
import com.ss.android.lark.widget.searchfilter.FilterView;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.koin.java.KoinJavaComponent;

public class SpaceSearchFragment extends C7667e implements C10804b.AbstractC10809b, AbstractC10816c {

    /* renamed from: f */
    static final /* synthetic */ boolean f29137f = true;

    /* renamed from: a */
    public C10870n f29138a;

    /* renamed from: b */
    public C10804b f29139b;

    /* renamed from: c */
    public DocsLinearLayoutManager f29140c;

    /* renamed from: d */
    public boolean f29141d = f29137f;

    /* renamed from: e */
    public final List<Document> f29142e = new ArrayList();

    /* renamed from: g */
    private C10865b f29143g;

    /* renamed from: h */
    private int f29144h;

    /* renamed from: i */
    private boolean f29145i;

    /* renamed from: j */
    private String f29146j;

    /* renamed from: k */
    private boolean f29147k;

    /* renamed from: l */
    private String f29148l = "";

    /* renamed from: m */
    private boolean f29149m = f29137f;

    /* renamed from: n */
    private NetService f29150n;

    /* renamed from: o */
    private AccountService.Account f29151o;

    /* renamed from: p */
    private SearchTypeEnv f29152p = SearchTypeEnv.NET;

    /* renamed from: q */
    private final ArrayList<Document> f29153q = new ArrayList<>();

    /* renamed from: r */
    private int f29154r = 0;

    /* renamed from: s */
    private final SearchRecord f29155s = new SearchRecord();

    /* renamed from: t */
    private final C10841k.C10844a f29156t = new C10841k.C10844a();

    /* renamed from: u */
    private C10823f f29157u;

    /* renamed from: v */
    private String f29158v = "all";

    /* renamed from: w */
    private SimpleListDataChangeCallback f29159w = new SearchListDataChangeCallback(this);

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m45080a(Boolean bool) throws Exception {
    }

    @Override // com.bytedance.ee.bear.search.AbstractC10816c
    /* renamed from: a */
    public Fragment mo40910a() {
        return this;
    }

    /* renamed from: a */
    public void mo40999a(SpaceFilterData aVar) {
        if (aVar.mo200845e()) {
            this.f29158v = "all";
            if (this.f29144h == 1) {
                this.f29143g.mo41026d();
            }
        } else {
            this.f29158v = "mycontent";
            if (this.f29144h == 1) {
                this.f29143g.mo41027e();
                AccountService.Account account = this.f29151o;
                if (account != null) {
                    this.f29155s.setOwnByUser(account);
                }
            }
        }
        aVar.mo200844b(aVar.mo200845e() ^ f29137f);
        this.f29143g.f29182j.mo200820a(aVar);
        m45097p();
    }

    @Override // com.bytedance.ee.bear.search.AbstractC10816c
    /* renamed from: a */
    public void mo40911a(String str) {
        this.f29148l = str;
        this.f29149m = f29137f;
        if (getLifecycle().getCurrentState() == Lifecycle.State.RESUMED) {
            this.f29138a.getSearchKeyword().mo5926a(this.f29148l);
        }
    }

    /* renamed from: a */
    private boolean m45082a(boolean z) {
        if (z) {
            return f29137f;
        }
        if (!TextUtils.isEmpty(this.f29148l) || this.f29156t.mo40974b() || !((AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class)).mo20801b().mo20777c().f14914a || this.f29156t.f29074n == 3) {
            return false;
        }
        return f29137f;
    }

    @Override // com.bytedance.ee.bear.search.adapter.C10804b.AbstractC10809b
    /* renamed from: a */
    public void mo40815a(Document document, int i) {
        mo40998a(getContext(), this.f29153q, document, i);
        this.f29157u.mo40923a(this.f29154r, document, this.f29158v, i, this.f29138a.getRequestId(), "none", this.f29156t.f29076p);
        if (this.f29144h == 1 && !TextUtils.isEmpty(this.f29156t.f29061a)) {
            this.f29155s.setType(document.mo32483t());
            this.f29155s.setToken(document.mo32472o());
            this.f29155s.setQuery(this.f29156t.f29061a);
            this.f29155s.setHighlight(((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31518c(getContext(), document));
            this.f29138a.saveSearchHistory(this.f29155s);
        }
    }

    /* renamed from: a */
    public void mo40998a(Context context, ArrayList<Document> arrayList, Document document, int i) {
        String s = document.mo32481s();
        try {
            s = Uri.parse(document.mo32481s()).buildUpon().appendQueryParameter("from", "tab_search").build().toString();
        } catch (Exception e) {
            C13479a.m54761a("lark.searchSpaceSearchFragment", e);
        }
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17293a(s, ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31482a(context, document, "search", arrayList, "", ""));
    }

    /* renamed from: h */
    private void m45091h() {
        this.f29150n = (NetService) KoinJavaComponent.m268610a(NetService.class);
    }

    /* renamed from: q */
    private String m45098q() {
        AccountService.Account account = this.f29151o;
        if (account == null) {
            return "";
        }
        return account.f14584a;
    }

    /* renamed from: r */
    private void m45099r() {
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    /* renamed from: f */
    public void mo41005f() {
        this.f29143g.mo41031i();
        m45097p();
        this.f29157u.mo40935f(this.f29154r, this.f29158v);
    }

    /* renamed from: g */
    public void mo41006g() {
        this.f29156t.mo40976d();
        if (!this.f29145i && this.f29144h == 1) {
            this.f29156t.f29067g.add(m45098q());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f29149m) {
            this.f29138a.getSearchKeyword().mo5926a(this.f29148l);
        }
    }

    /* renamed from: j */
    private void m45093j() {
        if (f29137f || getActivity() != null) {
            ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31483a(this.f29159w);
            this.f29143g.f29179g.mo96368b(new AbstractC27137a() {
                /* class com.bytedance.ee.bear.search.lark.space.$$Lambda$SpaceSearchFragment$QqskKHugBgbVLJa5Ta11LeIaQTQ */

                @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27137a
                public final void onLoadmore(AbstractC27129h hVar) {
                    SpaceSearchFragment.this.m45079a((SpaceSearchFragment) hVar);
                }
            });
            this.f29143g.f29180h.addOnScrollListener(new RecyclerView.OnScrollListener() {
                /* class com.bytedance.ee.bear.search.lark.space.SpaceSearchFragment.C108643 */

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    if (i == 0) {
                        SpaceSearchFragment.this.f29138a.preloadDocs(ar.m20936a(), SpaceSearchFragment.this.f29140c, SpaceSearchFragment.this.f29142e, SpaceSearchFragment.this.f29141d);
                    }
                }
            });
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: l */
    private void m45095l() {
        C5084ad.m20847d().mo20037a().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.search.lark.space.$$Lambda$SpaceSearchFragment$XqOsQV_JzPIWY1UjbwBaXveHyk8 */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                SpaceSearchFragment.this.m45075a((SpaceSearchFragment) ((ConnectionService.NetworkState) obj));
            }
        });
        this.f29138a.getSearchResultList().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.search.lark.space.$$Lambda$SpaceSearchFragment$VYQIMqjc0__BlWB3_1rcAE4PyvM */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                SpaceSearchFragment.this.m45090d((SearchResult) obj);
            }
        });
        this.f29138a.getSearchKeyword().mo5923a(getViewLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.search.lark.space.$$Lambda$SpaceSearchFragment$C14hIzaXhu5OVCCsRoBG060jM */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                SpaceSearchFragment.this.m45087c((SpaceSearchFragment) ((String) obj));
            }
        });
    }

    /* renamed from: d */
    public void mo41003d() {
        ((AbstractC10819d) KoinJavaComponent.m268610a(AbstractC10819d.class)).mo40917b(getActivity(), new ArrayList<>(this.f29143g.mo41030h()), "EXTRA_CHAT_INFO", 4098);
        this.f29157u.mo40932c(this.f29154r, this.f29158v);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        if (!f29137f && getActivity() == null) {
            throw new AssertionError();
        } else if (this.f29159w != null) {
            ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31508b(this.f29159w);
        }
    }

    /* renamed from: o */
    private void m45096o() {
        this.f29139b.mo40899a(this.f29141d);
        if (this.f29141d) {
            this.f29142e.clear();
            int i = this.f29144h;
            boolean z = f29137f;
            if (i != 1) {
                z = false;
            }
            this.f29145i = z;
            this.f29143g.mo41032j();
            m45097p();
        } else if (C13657b.m55421a(this.f29142e)) {
            this.f29143g.mo41025c();
            m45094k();
        } else {
            this.f29138a.queryListCacheStatus(this.f29142e).mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.search.lark.space.$$Lambda$SpaceSearchFragment$vRMH5jAYLFqF5NK0bwCkkHfWn4I */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    SpaceSearchFragment.this.m45085b((SpaceSearchFragment) ((Boolean) obj));
                }
            }, $$Lambda$SpaceSearchFragment$ROAvR2VJRNgYPlAPE2uRWA3HTXY.INSTANCE);
        }
    }

    /* renamed from: p */
    private void m45097p() {
        int i;
        int i2;
        int i3;
        SearchByTypeAdapter.TypeItem a = this.f29143g.f29186s.mo41012a();
        if (a == null) {
            i2 = -1;
        } else if (a.isFile) {
            i = a.typeId;
            i2 = -1;
            m45073a(i2, i, this.f29143g.f29185r.mo200845e(), this.f29143g.f29187t.mo41015b(), this.f29143g.f29188u.mo41016c(), this.f29143g.f29189v.mo41017d());
        } else {
            if (a.typeId == 9999) {
                i3 = -1;
            } else {
                i3 = a.typeId;
            }
            i2 = i3;
        }
        i = -1;
        m45073a(i2, i, this.f29143g.f29185r.mo200845e(), this.f29143g.f29187t.mo41015b(), this.f29143g.f29188u.mo41016c(), this.f29143g.f29189v.mo41017d());
    }

    /* renamed from: c */
    public void mo41002c() {
        ((AbstractC10819d) KoinJavaComponent.m268610a(AbstractC10819d.class)).mo40916a(getActivity(), new ArrayList<>(this.f29143g.mo41029g()), "EXTRA_OWNER_INFO", 4097);
        this.f29157u.mo40931b(this.f29154r, this.f29158v);
    }

    /* renamed from: e */
    public void mo41004e() {
        DocOperateBean docOperateBean = new DocOperateBean();
        docOperateBean.mo20972a(3);
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17295b("/folder/select/activity").mo17311a("EXTRA_OPERATE_BEAN", docOperateBean).mo17314a("extra_operate_text", getContext().getString(R.string.Doc_Facade_Select)).mo17316a("extra_show_recent_folder", false).mo17316a("extra_disable_create_folder", f29137f).mo17318b(5).mo17306a(R.anim.facade_slide_bottom_in, 0).mo17317a();
        this.f29157u.mo40934e(this.f29154r, this.f29158v);
    }

    /* renamed from: i */
    private void m45092i() {
        boolean z;
        Bundle arguments = getArguments();
        if (arguments == null) {
            C13479a.m54758a("lark.searchSpaceSearchFragment", "getArguments() == null");
            m45099r();
            return;
        }
        this.f29144h = arguments.getInt("KEY_SEARCH_PAGE_TYPE", 1);
        this.f29141d = C5084ad.m20847d().mo20038b().mo20041b();
        this.f29146j = arguments.getString("module");
        boolean z2 = arguments.getBoolean("is_combine_wiki", false);
        this.f29147k = z2;
        if (z2) {
            this.f29154r = 2;
            this.f29156t.f29079s = 0;
        } else {
            this.f29154r = 0;
            this.f29156t.f29079s = 1;
        }
        this.f29156t.f29076p = "search_lark_index";
        if (this.f29144h == 1) {
            z = f29137f;
        } else {
            z = false;
        }
        this.f29145i = z;
        this.f29138a = (C10870n) aj.m5365a(this, C10824g.m44896a(C10841k.m44952a(this.f29150n))).mo6005a(C10870n.class);
        this.f29140c = new DocsLinearLayoutManager(getContext(), 1, false);
        this.f29139b = new C10804b(ar.m20936a(), this.f29141d, false, this.f29140c, this.f29151o, this);
        C10823f fVar = new C10823f();
        this.f29157u = fVar;
        fVar.mo40926a(this.f29154r, f29137f, this.f29146j);
    }

    /* renamed from: k */
    private void m45094k() {
        SearchTypeEnv searchTypeEnv;
        boolean z;
        long j;
        C13479a.m54764b("lark.searchSpaceSearchFragment", "doSearch.");
        if (this.f29141d) {
            searchTypeEnv = SearchTypeEnv.NET;
        } else {
            searchTypeEnv = SearchTypeEnv.CACHE;
        }
        this.f29152p = searchTypeEnv;
        String str = this.f29148l;
        if (str != null) {
            this.f29156t.f29061a = str.trim();
        } else {
            this.f29148l = "";
            this.f29156t.f29061a = "";
        }
        this.f29156t.f29062b = 0;
        this.f29143g.mo41018a();
        if (!TextUtils.isEmpty(this.f29148l) || this.f29156t.f29064d.contains(Integer.valueOf(C8275a.f22370c.mo32555b()))) {
            z = false;
        } else {
            z = f29137f;
        }
        this.f29139b.mo40902b(z);
        C10841k.C10844a aVar = this.f29156t;
        if (z) {
            j = System.currentTimeMillis();
        } else {
            j = 0;
        }
        aVar.f29073m = j;
        C10841k.C10844a aVar2 = this.f29156t;
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        aVar2.f29074n = i;
        this.f29156t.f29078r = 1 ^ (((AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class)).mo20801b().mo20777c().f14914a ? 1 : 0);
        if (this.f29141d) {
            this.f29138a.search(this.f29154r, this.f29156t);
            return;
        }
        this.f29158v = "offline";
        this.f29143g.f29183k.setVisibility(0);
        this.f29143g.f29182j.setVisibility(8);
        this.f29138a.searchFromCache(this.f29148l.trim());
    }

    /* renamed from: b */
    public void mo41001b() {
        if (f29137f || getActivity() != null) {
            getActivity().startActivityForResult(new Intent(getActivity(), SearchSelectTypeActivity.class), 3);
            getActivity().overridePendingTransition(R.anim.facade_slide_bottom_in, 0);
            this.f29157u.mo40933d(this.f29154r, this.f29158v);
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: private */
    public static class SearchListDataChangeCallback extends SimpleListDataChangeCallback {
        private WeakReference<SpaceSearchFragment> mRef;

        public SearchListDataChangeCallback(SpaceSearchFragment spaceSearchFragment) {
            this.mRef = new WeakReference<>(spaceSearchFragment);
        }

        @Override // com.bytedance.ee.bear.contract.SimpleListDataChangeCallback, com.bytedance.ee.bear.contract.am.AbstractC5112e
        public void onPin(String str, boolean z) {
            C13748k.m55732a(new Runnable(str, z) {
                /* class com.bytedance.ee.bear.search.lark.space.$$Lambda$SpaceSearchFragment$SearchListDataChangeCallback$z3nLvXYobPsTNRDuVbUgdcL_joo */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ boolean f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    SpaceSearchFragment.SearchListDataChangeCallback.this.lambda$onPin$0$SpaceSearchFragment$SearchListDataChangeCallback(this.f$1, this.f$2);
                }
            });
        }

        @Override // com.bytedance.ee.bear.contract.SimpleListDataChangeCallback, com.bytedance.ee.bear.contract.am.AbstractC5112e
        public void onStar(String str, boolean z) {
            C13748k.m55732a(new Runnable(str, z) {
                /* class com.bytedance.ee.bear.search.lark.space.$$Lambda$SpaceSearchFragment$SearchListDataChangeCallback$91qANodkAkTf2S9rzfe6vWmLmM */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ boolean f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    SpaceSearchFragment.SearchListDataChangeCallback.this.lambda$onStar$1$SpaceSearchFragment$SearchListDataChangeCallback(this.f$1, this.f$2);
                }
            });
        }

        @Override // com.bytedance.ee.bear.contract.SimpleListDataChangeCallback, com.bytedance.ee.bear.contract.am.AbstractC5112e
        public void onSubscribe(String str, boolean z) {
            C13748k.m55732a(new Runnable(str, z) {
                /* class com.bytedance.ee.bear.search.lark.space.$$Lambda$SpaceSearchFragment$SearchListDataChangeCallback$SP5zz08rdKKu28WGB5wqUysNGo */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ boolean f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    SpaceSearchFragment.SearchListDataChangeCallback.this.lambda$onSubscribe$2$SpaceSearchFragment$SearchListDataChangeCallback(this.f$1, this.f$2);
                }
            });
        }

        public /* synthetic */ void lambda$onPin$0$SpaceSearchFragment$SearchListDataChangeCallback(String str, boolean z) {
            if (this.mRef.get() != null) {
                SpaceSearchFragment spaceSearchFragment = this.mRef.get();
                int b = spaceSearchFragment.mo41000b(str);
                List<Document> list = spaceSearchFragment.f29142e;
                if (b >= 0 && b < list.size() && list.get(b) != null) {
                    list.get(b).mo32438e(z);
                }
            }
        }

        public /* synthetic */ void lambda$onStar$1$SpaceSearchFragment$SearchListDataChangeCallback(String str, boolean z) {
            if (this.mRef.get() != null) {
                SpaceSearchFragment spaceSearchFragment = this.mRef.get();
                List<Document> list = spaceSearchFragment.f29142e;
                int b = spaceSearchFragment.mo41000b(str);
                if (b >= 0 && b < list.size() && list.get(b) != null) {
                    list.get(b).mo32412a(z);
                    if (spaceSearchFragment.f29139b != null) {
                        spaceSearchFragment.f29139b.notifyItemChanged(b);
                    }
                }
            }
        }

        public /* synthetic */ void lambda$onSubscribe$2$SpaceSearchFragment$SearchListDataChangeCallback(String str, boolean z) {
            if (this.mRef.get() != null) {
                SpaceSearchFragment spaceSearchFragment = this.mRef.get();
                List<Document> list = spaceSearchFragment.f29142e;
                int b = spaceSearchFragment.mo41000b(str);
                if (b >= 0 && b < list.size() && list.get(b) != null) {
                    list.get(b).mo32468m(z);
                    if (spaceSearchFragment.f29139b != null) {
                        spaceSearchFragment.f29139b.notifyItemChanged(b);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m45085b(Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            this.f29139b.notifyDataSetChanged();
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m45091h();
        m45092i();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m45087c(String str) {
        C13479a.m54772d("lark.searchSpaceSearchFragment", "textChangeSearch");
        this.f29149m = false;
        if (TextUtils.isEmpty(str)) {
            C10820e.m44875a().mo40919c();
        }
        m45094k();
    }

    /* renamed from: c */
    private boolean m45089c(SearchResult searchResult) {
        if (this.f29142e.size() >= 15 || !m45082a(searchResult.isHas_more()) || this.f29156t.f29064d.contains(Integer.valueOf(C8275a.f22370c.mo32555b())) || !this.f29141d || this.f29152p != SearchTypeEnv.NET) {
            return false;
        }
        return f29137f;
    }

    /* renamed from: b */
    public int mo41000b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        for (int i = 0; i < this.f29142e.size(); i++) {
            if (TextUtils.equals(str, this.f29142e.get(i).mo32472o())) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m45075a(ConnectionService.NetworkState networkState) {
        if (networkState != null && this.f29141d != networkState.mo20041b()) {
            this.f29141d = networkState.mo20041b();
            m45096o();
            this.f29143g.f29179g.mo96415m(this.f29141d);
        }
    }

    /* renamed from: b */
    private C1177w<IMoreInfo> m45083b(Document document) {
        C1177w<IMoreInfo> wVar = new C1177w<>();
        IMoreInfo a = C8292f.m34124a(ar.m20936a(), document);
        wVar.mo5929b(a);
        if (document.mo32483t() != C8275a.f22370c.mo32555b() && ((C4211a.m17514a().mo16536a("spacekit.mobile.more_subscribe_enable", false) && document.mo32483t() == 2) || (document.mo32483t() == 16 && document.ak() == 2))) {
            m45077a(a, wVar, document);
        }
        return wVar;
    }

    /* renamed from: a */
    private void m45076a(Document document) {
        FragmentActivity activity = getActivity();
        boolean a = C4211a.m17514a().mo16536a("spacekit.mobile.doc_insearch_enable_create_shortcut", false);
        MoreItemGroup a2 = new MoreItemGroup().mo39169a(1).mo39170a(m45070a(activity, CommonMoreItemId.ADD)).mo39171a(m45070a(activity, CommonMoreItemId.ADD_SHORT_CUT), a).mo39170a(m45070a(activity, CommonMoreItemId.STAR)).mo39170a(m45070a(activity, CommonMoreItemId.PIN));
        MoreItemGroup a3 = new MoreItemGroup().mo39169a(3).mo39170a(((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38966a("search", this.f29146j)).mo39170a(m45070a(activity, CommonMoreItemId.SUBSCRIBE));
        ArrayList<MoreItemGroup> arrayList = new ArrayList<>();
        arrayList.add(a2);
        arrayList.add(a3);
        ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38962a(getActivity(), arrayList, m45083b(document), C8292f.m34188e(document), (AbstractC10209c) null, (Bundle) null);
        C13479a.m54764b("lark.searchSpaceSearchFragment", "showMoreV2()...add shortcut enable = " + a);
    }

    /* renamed from: b */
    private void m45084b(SearchResult searchResult) {
        boolean z;
        boolean a = m45082a(searchResult.isHas_more());
        SmartRefreshLayout smartRefreshLayout = this.f29143g.f29179g;
        if (!this.f29141d || !a) {
            z = false;
        } else {
            z = f29137f;
        }
        smartRefreshLayout.mo96415m(z);
        this.f29143g.f29179g.mo96401h(a ^ f29137f);
        if (m45089c(searchResult)) {
            C13479a.m54764b("lark.searchSpaceSearchFragment", "auto load more because result can't fill screen");
            this.f29156t.f29074n = 3;
            this.f29156t.f29062b = 0;
            this.f29152p = SearchTypeEnv.LOAD_NEXT;
            this.f29138a.search(this.f29154r, this.f29156t);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m45090d(SearchResult searchResult) {
        C13479a.m54764b("lark.searchSpaceSearchFragment", "searchResult changed. ");
        long currentTimeMillis = System.currentTimeMillis() - this.f29138a.getSearchStartTime();
        if (this.f29152p == SearchTypeEnv.LOAD_NEXT) {
            this.f29157u.mo40927a("docs", currentTimeMillis, this.f29138a.getResultType());
        } else {
            this.f29157u.mo40928a("docs", currentTimeMillis, this.f29138a.getResultType(), C10820e.m44875a().mo40918b());
        }
        this.f29143g.mo41023b();
        this.f29143g.f29179g.mo96416n();
        if (searchResult == null) {
            C13479a.m54758a("lark.searchSpaceSearchFragment", "search result == null");
            this.f29143g.f29181i.setImageRes(Integer.valueOf((int) R.drawable.illustration_empty_neutral_search_failed));
            this.f29143g.f29181i.setDesc(getContext().getString(R.string.Doc_Search_SearchNotFoundTip));
            this.f29143g.f29181i.setVisibility(0);
            C13749l.m55752b(this.f29143g.f29181i);
            return;
        }
        m45078a(searchResult);
    }

    /* renamed from: a */
    private void m45078a(SearchResult searchResult) {
        if (this.f29152p != SearchTypeEnv.LOAD_NEXT) {
            this.f29143g.f29180h.scrollToPosition(0);
            this.f29142e.clear();
            this.f29153q.clear();
        }
        if (this.f29152p == SearchTypeEnv.LOAD_NEXT || !C13657b.m55421a(searchResult.getObjs())) {
            this.f29143g.f29179g.setVisibility(0);
            this.f29143g.f29181i.setVisibility(8);
            this.f29142e.addAll(searchResult.getObjs());
            this.f29153q.addAll(searchResult.getFileDoc());
            this.f29139b.mo40898a(this.f29142e);
            this.f29138a.preloadDocs(ar.m20936a(), this.f29140c, this.f29142e, this.f29141d);
        } else {
            C13479a.m54764b("lark.searchSpaceSearchFragment", "search result is empty");
            if (!m45089c(searchResult)) {
                C13479a.m54764b("lark.searchSpaceSearchFragment", "no more search result, show not found view");
                this.f29143g.f29181i.setImageRes(Integer.valueOf((int) R.drawable.illustration_empty_neutral_search_failed));
                this.f29143g.f29181i.setDesc(getContext().getString(R.string.Doc_Search_SearchNotFoundTip));
                this.f29143g.f29181i.setVisibility(0);
                C13749l.m55752b(this.f29143g.f29181i);
                this.f29157u.mo40925a(this.f29154r, this.f29158v, this.f29138a.getRequestId());
            }
        }
        m45084b(searchResult);
        if (TextUtils.isEmpty(this.f29148l) && this.f29142e.isEmpty()) {
            this.f29143g.f29181i.setImageRes(Integer.valueOf((int) R.drawable.illustration_empty_neutral_no_cloud_document));
            this.f29143g.f29181i.setDesc(getContext().getString(R.string.CeationMobile_Lark_Search_SearchSpacePlaceholder));
            this.f29143g.f29181i.setVisibility(0);
            C13749l.m55752b(this.f29143g.f29181i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m45079a(AbstractC27129h hVar) {
        if (this.f29141d) {
            C13479a.m54764b("lark.searchSpaceSearchFragment", "load more");
            this.f29152p = SearchTypeEnv.LOAD_NEXT;
            this.f29156t.f29062b += 20;
            this.f29138a.search(this.f29154r, this.f29156t);
        }
    }

    @Override // com.bytedance.ee.bear.search.adapter.C10804b.AbstractC10809b
    /* renamed from: b */
    public void mo40821b(Document document, int i) {
        m45076a(document);
    }

    /* renamed from: a */
    private IBaseMoreItem m45070a(FragmentActivity fragmentActivity, CommonMoreItemId commonMoreItemId) {
        return ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38964a(fragmentActivity, commonMoreItemId);
    }

    @Override // com.bytedance.ee.bear.search.adapter.C10804b.AbstractC10809b
    /* renamed from: c */
    public void mo40825c(Document document, int i) {
        this.f29138a.handleShareClick(getActivity(), document, this.f29151o);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m45093j();
        m45095l();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m45071a(Document document, DocObjInfo docObjInfo) throws Exception {
        C8153a.m32844b().mo31612c(document.mo32472o(), docObjInfo.isSubscribed());
        return Boolean.valueOf((boolean) f29137f);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m45072a(IMoreInfo dVar, Document document, DocObjInfo docObjInfo) throws Exception {
        dVar.mo39024a(docObjInfo.isSubscribed());
        AbstractC68307f.m265099b((Callable) new Callable(docObjInfo) {
            /* class com.bytedance.ee.bear.search.lark.space.$$Lambda$SpaceSearchFragment$9Bk7P57O6BIShU2BkoBdGQxyQ74 */
            public final /* synthetic */ DocObjInfo f$1;

            {
                this.f$1 = r2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SpaceSearchFragment.m45071a(Document.this, this.f$1);
            }
        }).mo238004b(C11678b.m48479c()).mo238001b($$Lambda$SpaceSearchFragment$qLuf6Vi5ECcsH9ethnN2aWSgEbc.INSTANCE, $$Lambda$SpaceSearchFragment$FADR7n7VlfFkpDe1UpLbfkt708I.INSTANCE);
        return Boolean.valueOf((boolean) f29137f);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C13479a.m54772d("lark.searchSpaceSearchFragment", "onActivityResult(), requestCode = " + i);
        if (intent != null) {
            if (i == 3) {
                this.f29143g.mo41019a((SearchByTypeAdapter.TypeItem) intent.getSerializableExtra("KEY_TYPE_ITEM"));
            } else if (i == 4097) {
                this.f29143g.mo41020a(intent.getStringExtra("EXTRA_OWNER_INFO"));
            } else if (i == 4098) {
                this.f29143g.mo41024b(intent.getStringExtra("EXTRA_CHAT_INFO"));
            } else if (i == 5) {
                this.f29143g.mo41021a(C10868m.m45143a(intent.getStringExtra("EXTRA_DEST_NAME")), intent.getStringExtra("EXTRA_DEST_TOKEN"));
            }
            m45097p();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_search_sapce_lark, viewGroup, false);
        C10865b bVar = new C10865b(getContext(), inflate);
        this.f29143g = bVar;
        bVar.mo41022a(this.f29141d, new FilterView.IOnFilterItemClick() {
            /* class com.bytedance.ee.bear.search.lark.space.SpaceSearchFragment.C108621 */

            @Override // com.ss.android.lark.widget.searchfilter.FilterView.IOnFilterItemClick
            /* renamed from: a */
            public void mo41007a(FilterData bVar) {
                if (bVar instanceof SpaceFilterData) {
                    SpaceFilterData aVar = (SpaceFilterData) bVar;
                    if (C10865b.f29167m.equals(aVar.mo200849h())) {
                        SpaceSearchFragment.this.mo40999a(aVar);
                    } else if (C10865b.f29168n.equals(aVar.mo200849h())) {
                        SpaceSearchFragment.this.mo41001b();
                    } else if (C10865b.f29169o.equals(aVar.mo200849h())) {
                        SpaceSearchFragment.this.mo41002c();
                    } else if (C10865b.f29170p.equals(aVar.mo200849h())) {
                        SpaceSearchFragment.this.mo41003d();
                    } else if (C10865b.f29171q.equals(aVar.mo200849h())) {
                        SpaceSearchFragment.this.mo41004e();
                    }
                }
            }
        }, new FilterView.IOnResetClick() {
            /* class com.bytedance.ee.bear.search.lark.space.SpaceSearchFragment.C108632 */

            @Override // com.ss.android.lark.widget.searchfilter.FilterView.IOnResetClick
            /* renamed from: a */
            public void mo41008a() {
                SpaceSearchFragment.this.mo41005f();
            }
        });
        SmartRefreshLayout smartRefreshLayout = this.f29143g.f29179g;
        Context context = getContext();
        Objects.requireNonNull(context);
        smartRefreshLayout.mo96367b((AbstractC27125d) new LoadMoreFooter(context));
        this.f29143g.f29180h.setLayoutManager(this.f29140c);
        this.f29143g.f29180h.setAdapter(this.f29139b);
        this.f29143g.f29179g.mo96415m(this.f29141d);
        if (!((AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class)).mo20801b().mo20782g().f14914a) {
            this.f29143g.mo41028f();
        }
        AccountService.Account f = ((an) KoinJavaComponent.m268610a(an.class)).mo16408f();
        this.f29151o = f;
        if (f != null) {
            this.f29139b.mo40896a(f);
        }
        return inflate;
    }

    /* renamed from: a */
    private void m45077a(IMoreInfo dVar, C1177w<IMoreInfo> wVar, Document document) {
        ((AbstractC6158t) KoinJavaComponent.m268610a(AbstractC6158t.class)).mo20314a(document.mo32472o(), document.mo32483t(), false, false, f29137f, "list_detail").mo238020d(new Function(document) {
            /* class com.bytedance.ee.bear.search.lark.space.$$Lambda$SpaceSearchFragment$6fAQd2fccBGZLjVoZ9hXyIkWsxU */
            public final /* synthetic */ Document f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return SpaceSearchFragment.m45072a(IMoreInfo.this, this.f$1, (DocObjInfo) obj);
            }
        }).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(dVar) {
            /* class com.bytedance.ee.bear.search.lark.space.$$Lambda$SpaceSearchFragment$1ocMbqojkdIbSc_8f62kXRwqzQI */
            public final /* synthetic */ IMoreInfo f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                Boolean bool = (Boolean) obj;
                C1177w.this.mo5929b((C1177w) this.f$1);
            }
        }, $$Lambda$SpaceSearchFragment$YrPifJZZ45Wj8o0RbiKT2siOoog.INSTANCE);
    }

    /* renamed from: a */
    private void m45073a(int i, int i2, boolean z, List<OwnerInfo> list, List<ChatInfo> list2, SearchRecord.Folder folder) {
        boolean z2;
        this.f29157u.mo40936g(this.f29154r, this.f29158v);
        mo41006g();
        boolean z3 = f29137f;
        if (i != -1) {
            this.f29156t.f29064d.add(Integer.valueOf(i));
            this.f29155s.getObj_types().add(Integer.valueOf(i));
            z2 = f29137f;
        } else {
            z2 = false;
        }
        if (i2 != -1) {
            this.f29156t.f29064d.add(Integer.valueOf(C8275a.f22375h.mo32555b()));
            this.f29156t.f29065e.add(Integer.valueOf(i2));
            this.f29155s.getObj_types().add(Integer.valueOf(C8275a.f22375h.mo32555b()));
            this.f29155s.getFile_types().add(Integer.valueOf(i2));
            z2 = f29137f;
        }
        if (z) {
            this.f29156t.f29067g.add(m45098q());
            z2 = f29137f;
        } else {
            this.f29156t.f29067g.remove(m45098q());
        }
        if (!C13657b.m55421a(list)) {
            for (OwnerInfo ownerInfo : list) {
                this.f29156t.f29067g.add(ownerInfo.getOwnerId());
                this.f29155s.getOwner().add(SearchRecord.ownerInfo2Owner(ownerInfo));
            }
            z2 = f29137f;
        }
        if (!C13657b.m55421a(list2)) {
            for (ChatInfo chatInfo : list2) {
                if (chatInfo.getChatType() == ChatInfo.ChatType.GROUP_CHAT.getValue()) {
                    this.f29156t.f29068h.add(chatInfo.getChatId());
                } else {
                    this.f29156t.f29069i.add(chatInfo.getChatId());
                }
                this.f29155s.getGroup().add(SearchRecord.chatInfo2Group(chatInfo));
            }
            z2 = f29137f;
        }
        if (folder != null) {
            this.f29156t.f29070j.add(folder.getToken());
            this.f29155s.getFolder().add(folder);
        } else {
            z3 = z2;
        }
        if (z3) {
            this.f29143g.mo41034l();
        } else {
            this.f29143g.mo41033k();
        }
        m45094k();
    }
}
