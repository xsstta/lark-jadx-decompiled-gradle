package com.bytedance.ee.bear.search.space;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.aj;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.DocObjInfo;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.basesdk.services.C4511g;
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
import com.bytedance.ee.bear.p522q.p523a.AbstractC10549e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.route.AbstractC10740f;
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
import com.bytedance.ee.bear.search.adapter.C10811c;
import com.bytedance.ee.bear.search.adapter.SearchByTypeAdapter;
import com.bytedance.ee.bear.search.model.ChatInfo;
import com.bytedance.ee.bear.search.model.OwnerInfo;
import com.bytedance.ee.bear.search.model.SearchRecord;
import com.bytedance.ee.bear.search.model.SearchResponse;
import com.bytedance.ee.bear.search.model.SearchResult;
import com.bytedance.ee.bear.search.report.SearchReport;
import com.bytedance.ee.bear.search.space.SpaceSearchFragment;
import com.bytedance.ee.bear.search.widget.SearchFilterView;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p712o.p713a.C13716b;
import com.bytedance.ee.util.p718t.C13748k;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27125d;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.scwang.smartrefresh.layout.p1236c.AbstractC27137a;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.koin.java.KoinJavaComponent;

public class SpaceSearchFragment extends C7667e implements C10804b.AbstractC10809b, C10811c.AbstractC10812a, SearchFilterView.AbstractC10892b {

    /* renamed from: s */
    static final /* synthetic */ boolean f29205s = true;

    /* renamed from: t */
    private static final String f29206t = String.valueOf(System.currentTimeMillis());

    /* renamed from: A */
    private String f29207A;

    /* renamed from: B */
    private String f29208B;

    /* renamed from: C */
    private String f29209C;

    /* renamed from: D */
    private NetService f29210D;

    /* renamed from: E */
    private AccountService.Account f29211E;

    /* renamed from: F */
    private SearchTypeEnv f29212F = SearchTypeEnv.NET;

    /* renamed from: G */
    private ArrayList<Document> f29213G = new ArrayList<>();

    /* renamed from: H */
    private String f29214H = "none";

    /* renamed from: I */
    private boolean f29215I = false;

    /* renamed from: J */
    private C68289a f29216J = new C68289a();

    /* renamed from: K */
    private int f29217K = 0;

    /* renamed from: L */
    private AbstractC10549e f29218L = new AbstractC10549e() {
        /* class com.bytedance.ee.bear.search.space.$$Lambda$SpaceSearchFragment$LKAa7bkBopWGFVnGsBFJy_tbMFI */

        @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
        public final void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
            SpaceSearchFragment.this.m45172a((SpaceSearchFragment) fVar, (AbstractC10550f) i, i2);
        }
    };

    /* renamed from: M */
    private SimpleListDataChangeCallback f29219M = new SearchListDataChangeCallback(this);

    /* renamed from: a */
    public C10870n f29220a;

    /* renamed from: b */
    public C10880a f29221b;

    /* renamed from: c */
    public C10804b f29222c;

    /* renamed from: d */
    public DocsLinearLayoutManager f29223d;

    /* renamed from: e */
    public int f29224e;

    /* renamed from: f */
    public boolean f29225f = f29205s;

    /* renamed from: g */
    public boolean f29226g;

    /* renamed from: h */
    public boolean f29227h;

    /* renamed from: i */
    public boolean f29228i;

    /* renamed from: j */
    public List<Document> f29229j = new ArrayList();

    /* renamed from: k */
    public int f29230k = 0;

    /* renamed from: l */
    public SearchRecord.Folder f29231l;

    /* renamed from: m */
    public List<OwnerInfo> f29232m = new ArrayList();

    /* renamed from: n */
    public SearchRecord f29233n = new SearchRecord();

    /* renamed from: o */
    public C10841k.C10844a f29234o = new C10841k.C10844a();

    /* renamed from: p */
    public C10823f f29235p;

    /* renamed from: q */
    public String f29236q = "all";

    /* renamed from: r */
    public boolean f29237r = false;

    /* renamed from: u */
    private int f29238u;

    /* renamed from: v */
    private String f29239v = "";

    /* renamed from: w */
    private C10811c f29240w;

    /* renamed from: x */
    private int f29241x;

    /* renamed from: y */
    private boolean f29242y;

    /* renamed from: z */
    private boolean f29243z;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m45175a(Boolean bool) throws Exception {
    }

    @Override // com.bytedance.ee.bear.search.widget.SearchFilterView.AbstractC10892b
    /* renamed from: x */
    public void mo40945x() {
    }

    /* renamed from: j */
    public boolean mo41377j() {
        return this.f29227h;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m45172a(AbstractC10550f fVar, int i, int i2) {
        if (this.f29217K > i) {
            this.f29221b.mo41396j();
        }
        this.f29217K = i;
    }

    /* renamed from: a */
    public int mo41372a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        for (int i = 0; i < this.f29229j.size(); i++) {
            if (TextUtils.equals(str, this.f29229j.get(i).mo32472o())) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m45174a(AbstractC27129h hVar) {
        if (this.f29225f) {
            C13479a.m54764b("SpaceSearchFragment", "load more");
            this.f29212F = SearchTypeEnv.LOAD_NEXT;
            this.f29234o.f29062b += 20;
            this.f29220a.search(this.f29230k, this.f29234o);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m45178a(View view, MotionEvent motionEvent) {
        this.f29221b.mo41396j();
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m45179a(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return f29205s;
        }
        if (this.f29221b.f29278v.mo41406c()) {
            this.f29221b.mo41391e();
            return f29205s;
        }
        mo41375b();
        return f29205s;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m45176a(CharSequence charSequence) throws Exception {
        m45184b(charSequence.toString());
    }

    /* renamed from: a */
    public void mo41373a() {
        if (this.f29226g) {
            this.f29226g = false;
            this.f29221b.mo41387a(getResources(), false);
            this.f29221b.mo41390d();
            if (this.f29224e == 1) {
                this.f29232m = this.f29221b.f29278v.mo41419l();
                if (!m45196q()) {
                    this.f29221b.f29278v.mo41408e();
                    this.f29221b.f29278v.setOwnerList(new ArrayList());
                    this.f29234o.f29067g.clear();
                    this.f29234o.f29067g.add(m45201v());
                }
                AccountService.Account account = this.f29211E;
                if (account != null) {
                    this.f29233n.setOwnByUser(account);
                }
                this.f29236q = "mycontent";
                return;
            }
            this.f29231l = this.f29221b.f29278v.mo41418k();
            this.f29221b.f29278v.mo41415h();
            this.f29221b.f29278v.setFolder(null);
            this.f29234o.f29070j.clear();
            this.f29234o.f29070j.add(this.f29209C);
            this.f29236q = "current_folder";
        }
    }

    /* renamed from: a */
    private void m45173a(SearchResult searchResult) {
        this.f29240w.mo40907a(searchResult.getCandidates(), searchResult.getCorrections(), searchResult.getSuggestions(), this.f29226g);
        int i = 0;
        boolean z = (!this.f29243z || this.f29212F != SearchTypeEnv.NET || TextUtils.isEmpty(this.f29208B) || this.f29240w.getItemCount() == 0) ? false : f29205s;
        RecyclerView recyclerView = this.f29221b.f29267k;
        if (!z) {
            i = 8;
        }
        recyclerView.setVisibility(i);
        this.f29235p.mo40929a(this.f29220a.getRequestId(), searchResult);
    }

    /* renamed from: a */
    private boolean m45180a(boolean z) {
        if (z) {
            return f29205s;
        }
        if (!TextUtils.isEmpty(this.f29208B) || this.f29234o.mo40974b() || !((AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class)).mo20801b().mo20777c().f14914a || this.f29234o.f29074n == 3) {
            return false;
        }
        return f29205s;
    }

    @Override // com.bytedance.ee.bear.search.adapter.C10804b.AbstractC10809b
    /* renamed from: a */
    public void mo40815a(Document document, int i) {
        m45189d(document, i);
        m45166a(getContext(), this.f29213G, document, i);
        this.f29235p.mo40923a(this.f29230k, document, this.f29236q, i, this.f29220a.getRequestId(), this.f29214H, this.f29234o.f29076p);
        if (this.f29224e == 1 && !TextUtils.isEmpty(this.f29234o.f29061a)) {
            this.f29233n.setType(document.mo32483t());
            this.f29233n.setToken(document.mo32472o());
            this.f29233n.setQuery(this.f29234o.f29061a);
            this.f29233n.setHighlight(((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31518c(getContext(), document));
            this.f29220a.saveSearchHistory(this.f29233n);
        }
    }

    @Override // com.bytedance.ee.bear.search.adapter.C10811c.AbstractC10812a
    /* renamed from: a */
    public void mo40817a(SearchResponse.Data.Candidates candidates, int i) {
        this.f29221b.f29278v.mo41420m();
        this.f29234o.f29067g.add(candidates.getOwner_id());
        this.f29234o.f29075o = 0;
        this.f29221b.mo41385a(getContext(), candidates);
        this.f29237r = f29205s;
        this.f29214H = "people";
        this.f29235p.mo40922a(this.f29230k, i, "people");
    }

    @Override // com.bytedance.ee.bear.search.adapter.C10811c.AbstractC10812a
    /* renamed from: a */
    public void mo40818a(String str, int i) {
        m45187c(str);
        this.f29214H = "correction";
        this.f29235p.mo40922a(this.f29230k, i, "correction");
    }

    @Override // com.bytedance.ee.bear.search.widget.SearchFilterView.AbstractC10892b
    /* renamed from: a */
    public void mo40940a(int i, int i2, List<OwnerInfo> list, List<ChatInfo> list2, List<SearchResponse.Data.SpaceData> list3, SearchRecord.Folder folder) {
        this.f29235p.mo40936g(this.f29230k, this.f29236q);
        mo40944w();
        if (i != -1) {
            this.f29234o.f29064d.add(Integer.valueOf(i));
            this.f29233n.getObj_types().add(Integer.valueOf(i));
        }
        if (i2 != -1) {
            this.f29234o.f29064d.add(Integer.valueOf(C8275a.f22375h.mo32555b()));
            this.f29234o.f29065e.add(Integer.valueOf(i2));
            this.f29233n.getObj_types().add(Integer.valueOf(C8275a.f22375h.mo32555b()));
            this.f29233n.getFile_types().add(Integer.valueOf(i2));
        }
        if (!C13657b.m55421a(list)) {
            for (OwnerInfo ownerInfo : list) {
                this.f29234o.f29067g.add(ownerInfo.getOwnerId());
                this.f29233n.getOwner().add(SearchRecord.ownerInfo2Owner(ownerInfo));
            }
        }
        if (!C13657b.m55421a(list2)) {
            for (ChatInfo chatInfo : list2) {
                if (chatInfo.getChatType() == ChatInfo.ChatType.GROUP_CHAT.getValue()) {
                    this.f29234o.f29068h.add(chatInfo.getChatId());
                } else {
                    this.f29234o.f29069i.add(chatInfo.getChatId());
                }
                this.f29233n.getGroup().add(SearchRecord.chatInfo2Group(chatInfo));
            }
        }
        if (folder != null) {
            this.f29234o.f29070j.add(folder.getToken());
            this.f29233n.getFolder().add(folder);
        }
        mo41375b();
    }

    /* renamed from: a */
    public void mo41374a(Animator.AnimatorListener animatorListener) {
        this.f29221b.mo41384a(animatorListener);
    }

    @Override // com.bytedance.ee.bear.search.widget.SearchFilterView.AbstractC10892b
    /* renamed from: h */
    public void mo40831h() {
        this.f29221b.mo41390d();
    }

    /* renamed from: l */
    private void m45193l() {
        this.f29210D = (NetService) KoinJavaComponent.m268610a(NetService.class);
    }

    /* renamed from: v */
    private String m45201v() {
        AccountService.Account account = this.f29211E;
        if (account == null) {
            return "";
        }
        return account.f14584a;
    }

    @Override // com.bytedance.ee.bear.search.widget.SearchFilterView.AbstractC10892b
    /* renamed from: f */
    public void mo40829f() {
        this.f29235p.mo40935f(this.f29230k, this.f29236q);
    }

    /* renamed from: i */
    public void mo41376i() {
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    /* renamed from: q */
    private boolean m45196q() {
        if (!TextUtils.equals(this.f29207A, "favorites") || this.f29226g) {
            return false;
        }
        return f29205s;
    }

    /* renamed from: t */
    private void m45199t() {
        C5084ad.m20847d().mo20037a().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.search.space.$$Lambda$SpaceSearchFragment$ayAQNJ7K7Gn447bDVripO9ij0ME */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                SpaceSearchFragment.this.m45169a((SpaceSearchFragment) ((ConnectionService.NetworkState) obj));
            }
        });
        this.f29220a.getSearchResultList().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.search.space.$$Lambda$SpaceSearchFragment$JVv2vsVPJcZ6pqTWPs48hSMz96A */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                SpaceSearchFragment.this.m45192e((SearchResult) obj);
            }
        });
    }

    /* renamed from: k */
    public void mo41378k() {
        if (!this.f29242y) {
            this.f29221b.f29265i.setText("");
        }
        this.f29221b.mo41394h();
        mo41376i();
    }

    /* renamed from: r */
    private void m45197r() {
        String str;
        if (this.f29234o != null && (str = this.f29208B) != null) {
            SearchReport.m44868a(f29206t, this.f29238u, this.f29207A, "search_request", "none", str.length(), this.f29208B, this.f29234o.mo40974b(), this.f29234o.mo40975c());
        }
    }

    @Override // com.bytedance.ee.bear.search.widget.SearchFilterView.AbstractC10892b
    /* renamed from: c */
    public void mo40824c() {
        if (f29205s || getActivity() != null) {
            getActivity().startActivityForResult(new Intent(getActivity(), SearchSelectTypeActivity.class), 3);
            getActivity().overridePendingTransition(R.anim.facade_slide_bottom_in, 0);
            this.f29235p.mo40933d(this.f29230k, this.f29236q);
            return;
        }
        throw new AssertionError();
    }

    @Override // com.bytedance.ee.bear.search.widget.SearchFilterView.AbstractC10892b
    /* renamed from: e */
    public void mo40828e() {
        ((AbstractC10819d) KoinJavaComponent.m268610a(AbstractC10819d.class)).mo40916a(getActivity(), this.f29221b.f29278v.getOwnerIdList(), "EXTRA_OWNER_INFO", 4097);
        this.f29235p.mo40931b(this.f29230k, this.f29236q);
    }

    @Override // com.bytedance.ee.bear.search.widget.SearchFilterView.AbstractC10892b
    /* renamed from: w */
    public void mo40944w() {
        this.f29234o.mo40976d();
        if (!this.f29226g) {
            int i = this.f29224e;
            if (i == 1) {
                if (!m45196q()) {
                    this.f29234o.f29067g.add(m45201v());
                }
            } else if (i == 2) {
                this.f29234o.f29070j.add(this.f29209C);
            }
        }
    }

    /* renamed from: s */
    private void m45198s() {
        C10804b bVar;
        boolean z;
        if (this.f29234o != null && this.f29239v != null && (bVar = this.f29222c) != null && bVar.f28965c >= 0) {
            String str = f29206t;
            int i = this.f29238u;
            this.f29238u = i + 1;
            String str2 = this.f29207A;
            int length = this.f29239v.length();
            String str3 = this.f29239v;
            boolean b = this.f29234o.mo40974b();
            String c = this.f29234o.mo40975c();
            if (this.f29222c.getItemCount() != 0) {
                z = f29205s;
            } else {
                z = false;
            }
            SearchReport.m44867a(str, i, str2, length, str3, b, c, z, this.f29222c.mo40895a());
        }
    }

    /* renamed from: u */
    private void m45200u() {
        this.f29222c.mo40899a(this.f29225f);
        if (!this.f29225f) {
            this.f29221b.mo41396j();
            this.f29221b.f29278v.mo41420m();
            if (C13657b.m55421a(this.f29229j)) {
                this.f29221b.mo41392f();
                mo41375b();
                return;
            }
            this.f29220a.queryListCacheStatus(this.f29229j).mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.search.space.$$Lambda$SpaceSearchFragment$0mYJ1WP2eB_B_uMZotHYaQG6jco */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    SpaceSearchFragment.this.m45183b((SpaceSearchFragment) ((Boolean) obj));
                }
            }, $$Lambda$SpaceSearchFragment$Sun8rM6PNiEzbpht23KB7nkmkZY.INSTANCE);
            return;
        }
        this.f29229j.clear();
        boolean z = f29205s;
        this.f29243z = f29205s;
        if (this.f29224e != 1) {
            z = false;
        }
        this.f29226g = z;
        this.f29221b.mo41386a(getResources(), this.f29224e, this.f29226g, this.f29228i, this.f29207A);
        mo41375b();
    }

    @Override // com.bytedance.ee.bear.search.widget.SearchFilterView.AbstractC10892b
    /* renamed from: g */
    public void mo40830g() {
        DocOperateBean docOperateBean = new DocOperateBean();
        docOperateBean.mo20972a(3);
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17295b("/folder/select/activity").mo17311a("EXTRA_OPERATE_BEAN", docOperateBean).mo17314a("extra_operate_text", getContext().getString(R.string.Doc_Facade_Select)).mo17316a("extra_show_recent_folder", false).mo17316a("extra_disable_create_folder", f29205s).mo17318b(5).mo17306a(R.anim.facade_slide_bottom_in, 0).mo17317a();
        this.f29235p.mo40934e(this.f29230k, this.f29236q);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        if (f29205s || getActivity() != null) {
            if (this.f29219M != null) {
                ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31508b(this.f29219M);
            }
            AbstractC10550f.AbstractC10551a.m43717b(getActivity()).mo39928b(this.f29218L);
            C68289a aVar = this.f29216J;
            if (aVar != null && !aVar.isDisposed()) {
                this.f29216J.dispose();
                return;
            }
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: o */
    private void m45194o() {
        boolean z;
        String str;
        boolean z2;
        Bundle arguments = getArguments();
        if (arguments == null) {
            C13479a.m54758a("SpaceSearchFragment", "getArguments() == null");
            mo41376i();
            return;
        }
        this.f29241x = arguments.getInt("KEY_SEARCH_BAR_DY");
        this.f29224e = arguments.getInt("KEY_SEARCH_PAGE_TYPE", 1);
        this.f29225f = C5084ad.m20847d().mo20038b().mo20041b();
        this.f29242y = arguments.getBoolean("KEY_FROM_LARK");
        if (C4511g.m18594d().mo17344E() == 2) {
            z = f29205s;
        } else {
            z = false;
        }
        this.f29228i = z;
        String string = arguments.getString("KEY_SEARCH_KEYWORD");
        this.f29208B = string;
        if (string == null) {
            string = "";
        }
        this.f29208B = string;
        this.f29209C = arguments.getString("KEY_FOLDER_TOKEN");
        this.f29207A = arguments.getString("module", "");
        C10841k.C10844a aVar = this.f29234o;
        if (this.f29242y) {
            str = "search_lark_index";
        } else {
            str = "search_docs_pri";
        }
        aVar.f29076p = str;
        int i = this.f29224e;
        if (i == 1) {
            z2 = f29205s;
        } else {
            z2 = false;
        }
        this.f29226g = z2;
        if (i == 2) {
            this.f29234o.f29070j.add(this.f29209C);
            this.f29236q = "current_folder";
            this.f29234o.f29076p = "search_docs_folder";
        }
        this.f29220a = (C10870n) aj.m5365a(this, C10824g.m44896a(C10841k.m44952a(this.f29210D))).mo6005a(C10870n.class);
        this.f29240w = new C10811c(getContext());
        this.f29223d = new DocsLinearLayoutManager(getContext(), 1, false);
        this.f29222c = new C10804b(ar.m20936a(), this.f29225f, f29205s, this.f29223d, this.f29211E, this);
        C10823f fVar = new C10823f();
        this.f29235p = fVar;
        fVar.mo40926a(this.f29230k, this.f29242y, this.f29207A);
    }

    @Override // com.bytedance.ee.bear.search.widget.SearchFilterView.AbstractC10892b
    /* renamed from: d */
    public void mo40827d() {
        ((AbstractC10819d) KoinJavaComponent.m268610a(AbstractC10819d.class)).mo40917b(getActivity(), this.f29221b.f29278v.getChatIdList(), "EXTRA_CHAT_INFO", 4098);
        this.f29235p.mo40932c(this.f29230k, this.f29236q);
    }

    /* renamed from: p */
    private void m45195p() {
        if (f29205s || getActivity() != null) {
            ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31483a(this.f29219M);
            AbstractC10550f.AbstractC10551a.m43717b(getActivity()).mo39924a(this.f29218L);
            this.f29240w.mo40905a(this);
            this.f29221b.f29278v.setListener(this);
            this.f29221b.f29259c.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
                /* class com.bytedance.ee.bear.search.space.SpaceSearchFragment.C108721 */

                /* access modifiers changed from: protected */
                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    SpaceSearchFragment.this.mo41378k();
                }
            });
            this.f29221b.f29264h.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
                /* class com.bytedance.ee.bear.search.space.SpaceSearchFragment.C108732 */

                /* access modifiers changed from: protected */
                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    SpaceSearchFragment.this.f29227h = SpaceSearchFragment.f29205s;
                    SpaceSearchFragment.this.f29221b.f29265i.setText("");
                    SpaceSearchFragment.this.f29221b.f29259c.setVisibility(8);
                    SpaceSearchFragment.this.f29221b.mo41394h();
                    SpaceSearchFragment.this.mo41376i();
                }
            });
            this.f29221b.f29266j.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
                /* class com.bytedance.ee.bear.search.space.SpaceSearchFragment.C108743 */

                /* access modifiers changed from: protected */
                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    SpaceSearchFragment.this.f29221b.f29265i.setText("");
                    SpaceSearchFragment.this.f29221b.f29266j.setVisibility(8);
                }
            });
            this.f29221b.f29275s.mo96368b(new AbstractC27137a() {
                /* class com.bytedance.ee.bear.search.space.$$Lambda$SpaceSearchFragment$H6VuwlPrx0R3kZ5LuNIzdRHO6zs */

                @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27137a
                public final void onLoadmore(AbstractC27129h hVar) {
                    SpaceSearchFragment.this.m45174a((SpaceSearchFragment) hVar);
                }
            });
            this.f29221b.f29277u.setOnTouchListener(new View.OnTouchListener() {
                /* class com.bytedance.ee.bear.search.space.$$Lambda$SpaceSearchFragment$yr8A9wo0r5PjXklYaAe5RjlYso */

                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return SpaceSearchFragment.this.m45178a(view, motionEvent);
                }
            });
            this.f29221b.f29265i.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                /* class com.bytedance.ee.bear.search.space.$$Lambda$SpaceSearchFragment$rbuUXXrIE92lHdHrw0OCWMLIK5Q */

                public final void onFocusChange(View view, boolean z) {
                    SpaceSearchFragment.this.m45167a((SpaceSearchFragment) view, (View) z);
                }
            });
            this.f29221b.f29265i.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                /* class com.bytedance.ee.bear.search.space.$$Lambda$SpaceSearchFragment$SIO6KSSN_nhodlZ4KxTxFsJ_6i4 */

                public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    return SpaceSearchFragment.this.m45179a(textView, i, keyEvent);
                }
            });
            this.f29221b.f29276t.addOnScrollListener(new RecyclerView.OnScrollListener() {
                /* class com.bytedance.ee.bear.search.space.SpaceSearchFragment.C108754 */

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    if (i == 0) {
                        SpaceSearchFragment.this.f29220a.preloadDocs(ar.m20936a(), SpaceSearchFragment.this.f29223d, SpaceSearchFragment.this.f29229j, SpaceSearchFragment.this.f29225f);
                    } else if (i == 1) {
                        SpaceSearchFragment.this.f29221b.mo41396j();
                    }
                }
            });
            this.f29221b.f29272p.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
                /* class com.bytedance.ee.bear.search.space.SpaceSearchFragment.C108765 */

                /* access modifiers changed from: protected */
                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    if (!SpaceSearchFragment.this.f29226g) {
                        SpaceSearchFragment.this.f29226g = SpaceSearchFragment.f29205s;
                        SpaceSearchFragment.this.f29236q = "all";
                        SpaceSearchFragment.this.f29221b.mo41387a(SpaceSearchFragment.this.getResources(), SpaceSearchFragment.f29205s);
                        SpaceSearchFragment.this.f29221b.mo41390d();
                        if (SpaceSearchFragment.this.f29224e == 1) {
                            if (!SpaceSearchFragment.this.f29228i) {
                                SpaceSearchFragment.this.f29221b.f29278v.mo41409f();
                                SpaceSearchFragment.this.f29221b.f29278v.setOwnerList(SpaceSearchFragment.this.f29232m);
                            }
                            SpaceSearchFragment.this.f29234o.f29067g.clear();
                            SpaceSearchFragment.this.f29234o.f29067g.addAll(SpaceSearchFragment.this.f29221b.f29278v.getOwnerIdList());
                            SpaceSearchFragment.this.f29233n.setAllWithOwner(SpaceSearchFragment.this.f29232m);
                        } else {
                            SpaceSearchFragment.this.f29234o.f29070j.clear();
                            SpaceSearchFragment.this.f29221b.f29278v.mo41416i();
                            SpaceSearchFragment.this.f29221b.f29278v.setFolder(SpaceSearchFragment.this.f29231l);
                            if (SpaceSearchFragment.this.f29231l != null) {
                                SpaceSearchFragment.this.f29234o.f29070j.add(SpaceSearchFragment.this.f29231l.getToken());
                            }
                        }
                        SpaceSearchFragment.this.mo41375b();
                    }
                }
            });
            this.f29221b.f29273q.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
                /* class com.bytedance.ee.bear.search.space.SpaceSearchFragment.C108776 */

                /* access modifiers changed from: protected */
                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    SpaceSearchFragment.this.mo41373a();
                    SpaceSearchFragment.this.mo41375b();
                }
            });
            this.f29221b.f29271o.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
                /* class com.bytedance.ee.bear.search.space.SpaceSearchFragment.C108787 */

                /* access modifiers changed from: protected */
                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    SpaceSearchFragment.this.f29237r = false;
                    SpaceSearchFragment.this.f29221b.f29268l.setVisibility(8);
                    SpaceSearchFragment.this.f29221b.f29252A.setVisibility(0);
                    SpaceSearchFragment.this.f29234o.f29075o = 2;
                    SpaceSearchFragment.this.f29234o.f29067g.clear();
                    SpaceSearchFragment.this.mo41375b();
                }
            });
            this.f29221b.f29279w.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
                /* class com.bytedance.ee.bear.search.space.SpaceSearchFragment.C108798 */

                /* access modifiers changed from: protected */
                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    if (SpaceSearchFragment.this.f29221b.f29278v.mo41406c()) {
                        SpaceSearchFragment.this.f29221b.mo41390d();
                        return;
                    }
                    SpaceSearchFragment.this.f29221b.mo41389c();
                    SpaceSearchFragment.this.f29221b.mo41394h();
                    SpaceSearchFragment.this.f29235p.mo40924a(SpaceSearchFragment.this.f29230k, SpaceSearchFragment.this.f29236q);
                }
            });
            if (TextUtils.equals(this.f29207A, "favorites")) {
                mo41373a();
            }
            this.f29216J.mo237937a(C13716b.m55614a(this.f29221b.f29265i).debounce(300, TimeUnit.MILLISECONDS, C11678b.m48480d()).observeOn(C11678b.m48481e()).subscribe(new Consumer() {
                /* class com.bytedance.ee.bear.search.space.$$Lambda$SpaceSearchFragment$_X1tv2t8b60ZaKuu_uPVd6om_C8 */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    SpaceSearchFragment.this.m45176a((SpaceSearchFragment) ((CharSequence) obj));
                }
            }, $$Lambda$SpaceSearchFragment$d2F9bgl7DLPhP3UpZHdac7P_K6w.INSTANCE));
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    public void mo41375b() {
        SearchTypeEnv searchTypeEnv;
        boolean z;
        long j;
        C13479a.m54764b("SpaceSearchFragment", "doSearch.");
        if (this.f29225f) {
            searchTypeEnv = SearchTypeEnv.NET;
        } else {
            searchTypeEnv = SearchTypeEnv.CACHE;
        }
        this.f29212F = searchTypeEnv;
        this.f29234o.f29061a = this.f29208B.trim();
        this.f29234o.f29062b = 0;
        this.f29221b.mo41382a();
        if (!TextUtils.isEmpty(this.f29208B) || this.f29234o.f29064d.contains(Integer.valueOf(C8275a.f22370c.mo32555b()))) {
            z = false;
        } else {
            z = f29205s;
        }
        this.f29222c.mo40902b(z);
        C10841k.C10844a aVar = this.f29234o;
        if (z) {
            j = System.currentTimeMillis();
        } else {
            j = 0;
        }
        aVar.f29073m = j;
        C10841k.C10844a aVar2 = this.f29234o;
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        aVar2.f29074n = i;
        this.f29234o.f29078r = 1 ^ (((AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class)).mo20801b().mo20777c().f14914a ? 1 : 0);
        this.f29234o.f29071k = m45196q();
        m45198s();
        m45197r();
        if (this.f29225f) {
            this.f29220a.search(this.f29230k, this.f29234o);
            return;
        }
        this.f29236q = "offline";
        this.f29221b.f29268l.setVisibility(8);
        this.f29221b.f29282z.setVisibility(0);
        this.f29221b.f29252A.setVisibility(8);
        this.f29220a.searchFromCache(this.f29208B.trim());
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
                /* class com.bytedance.ee.bear.search.space.$$Lambda$SpaceSearchFragment$SearchListDataChangeCallback$qNT0es_8CFRwLXCv30FO7PXwNM4 */
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
                /* class com.bytedance.ee.bear.search.space.$$Lambda$SpaceSearchFragment$SearchListDataChangeCallback$M3qJGVdNgmuf5YuBpjqUt4F3f18 */
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
                /* class com.bytedance.ee.bear.search.space.$$Lambda$SpaceSearchFragment$SearchListDataChangeCallback$c6uVGXehUx3qoNWhVSS8bhALwmI */
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
                int a = spaceSearchFragment.mo41372a(str);
                List<Document> list = spaceSearchFragment.f29229j;
                if (a >= 0 && a < list.size() && list.get(a) != null) {
                    list.get(a).mo32438e(z);
                }
            }
        }

        public /* synthetic */ void lambda$onStar$1$SpaceSearchFragment$SearchListDataChangeCallback(String str, boolean z) {
            if (this.mRef.get() != null) {
                SpaceSearchFragment spaceSearchFragment = this.mRef.get();
                List<Document> list = spaceSearchFragment.f29229j;
                int a = spaceSearchFragment.mo41372a(str);
                if (a >= 0 && a < list.size() && list.get(a) != null) {
                    list.get(a).mo32412a(z);
                    if (spaceSearchFragment.f29222c != null) {
                        spaceSearchFragment.f29222c.notifyItemChanged(a);
                    }
                }
            }
        }

        public /* synthetic */ void lambda$onSubscribe$2$SpaceSearchFragment$SearchListDataChangeCallback(String str, boolean z) {
            if (this.mRef.get() != null) {
                SpaceSearchFragment spaceSearchFragment = this.mRef.get();
                List<Document> list = spaceSearchFragment.f29229j;
                int a = spaceSearchFragment.mo41372a(str);
                if (a >= 0 && a < list.size() && list.get(a) != null) {
                    list.get(a).mo32468m(z);
                    if (spaceSearchFragment.f29222c != null) {
                        spaceSearchFragment.f29222c.notifyItemChanged(a);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m45183b(Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            this.f29222c.notifyDataSetChanged();
        }
    }

    /* renamed from: c */
    private void m45187c(String str) {
        this.f29221b.mo41396j();
        this.f29221b.f29265i.setText(str);
        this.f29221b.f29265i.setSelection(str.length());
        this.f29243z = false;
        this.f29215I = f29205s;
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m45193l();
        m45194o();
        SearchReport.m44871a(f29206t, this.f29207A);
    }

    @Override // com.bytedance.ee.bear.search.widget.SearchFilterView.AbstractC10892b
    /* renamed from: b */
    public void mo40823b(boolean z) {
        int color = getResources().getColor(R.color.primary_pri_500);
        int color2 = getResources().getColor(R.color.text_title);
        TextView textView = this.f29221b.f29280x;
        if (!z) {
            color = color2;
        }
        textView.setTextColor(color);
    }

    /* renamed from: b */
    private C1177w<IMoreInfo> m45181b(Document document) {
        C1177w<IMoreInfo> wVar = new C1177w<>();
        IMoreInfo a = C8292f.m34124a(ar.m20936a(), document);
        wVar.mo5929b(a);
        if (document.mo32483t() != C8275a.f22370c.mo32555b() && ((C4211a.m17514a().mo16536a("spacekit.mobile.more_subscribe_enable", false) && document.mo32483t() == 2) || (document.mo32483t() == 16 && document.ak() == 2))) {
            m45171a(a, wVar, document);
        }
        return wVar;
    }

    /* renamed from: c */
    private void m45186c(SearchResult searchResult) {
        boolean z;
        boolean a = m45180a(searchResult.isHas_more());
        SmartRefreshLayout smartRefreshLayout = this.f29221b.f29275s;
        if (!this.f29225f || !a) {
            z = false;
        } else {
            z = f29205s;
        }
        smartRefreshLayout.mo96415m(z);
        this.f29221b.f29275s.mo96401h(a ^ f29205s);
        if (m45191d(searchResult)) {
            C13479a.m54764b("SpaceSearchFragment", "auto load more because result can't fill screen");
            this.f29234o.f29074n = 3;
            this.f29234o.f29062b = 0;
            this.f29212F = SearchTypeEnv.LOAD_NEXT;
            this.f29220a.search(this.f29230k, this.f29234o);
        }
    }

    /* renamed from: d */
    private boolean m45191d(SearchResult searchResult) {
        if (this.f29229j.size() >= 15 || !m45180a(searchResult.isHas_more()) || this.f29234o.f29064d.contains(Integer.valueOf(C8275a.f22370c.mo32555b())) || !this.f29225f || this.f29212F != SearchTypeEnv.NET) {
            return false;
        }
        return f29205s;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m45192e(SearchResult searchResult) {
        C13479a.m54764b("SpaceSearchFragment", "searchResult changed. ");
        long currentTimeMillis = System.currentTimeMillis() - this.f29220a.getSearchStartTime();
        if (this.f29212F == SearchTypeEnv.LOAD_NEXT) {
            this.f29235p.mo40927a("docs", currentTimeMillis, this.f29220a.getResultType());
        } else {
            this.f29235p.mo40928a("docs", currentTimeMillis, this.f29220a.getResultType(), C10820e.m44875a().mo40918b());
        }
        this.f29221b.mo41388b();
        this.f29221b.f29275s.mo96416n();
        if (searchResult == null) {
            C13479a.m54758a("SpaceSearchFragment", "search result == null");
            if (this.f29229j.isEmpty() && this.f29213G.isEmpty()) {
                this.f29221b.f29277u.setVisibility(0);
                return;
            }
            return;
        }
        m45173a(searchResult);
        m45182b(searchResult);
    }

    /* renamed from: b */
    private void m45182b(SearchResult searchResult) {
        if (this.f29212F != SearchTypeEnv.LOAD_NEXT) {
            this.f29221b.f29276t.scrollToPosition(0);
            this.f29229j.clear();
            this.f29213G.clear();
        }
        if (this.f29212F == SearchTypeEnv.LOAD_NEXT || !C13657b.m55421a(searchResult.getObjs())) {
            this.f29221b.f29275s.setVisibility(0);
            this.f29221b.f29277u.setVisibility(8);
            this.f29229j.addAll(searchResult.getObjs());
            this.f29213G.addAll(searchResult.getFileDoc());
            this.f29222c.mo40898a(this.f29229j);
            this.f29220a.preloadDocs(ar.m20936a(), this.f29223d, this.f29229j, this.f29225f);
        } else {
            C13479a.m54764b("SpaceSearchFragment", "search result is empty");
            if (!m45191d(searchResult)) {
                C13479a.m54764b("SpaceSearchFragment", "no more search result, show not found view");
                this.f29221b.f29277u.setVisibility(0);
                this.f29222c.mo40898a(this.f29229j);
                this.f29235p.mo40925a(this.f29230k, this.f29236q, this.f29220a.getRequestId());
            }
        }
        m45186c(searchResult);
    }

    /* renamed from: b */
    private void m45184b(String str) {
        int i;
        String str2;
        String str3;
        C13479a.m54772d("SpaceSearchFragment", "textChangeSearch");
        if (TextUtils.isEmpty(str)) {
            C10820e.m44875a().mo40919c();
        }
        this.f29243z = f29205s;
        this.f29239v = this.f29208B;
        this.f29208B = str;
        View view = this.f29221b.f29266j;
        if (TextUtils.isEmpty(this.f29208B)) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        if (!this.f29215I) {
            if (TextUtils.isEmpty(this.f29208B)) {
                str3 = "none";
            } else {
                str3 = "search";
            }
            this.f29214H = str3;
        }
        this.f29215I = false;
        if (this.f29237r) {
            str2 = "people";
        } else {
            str2 = this.f29214H;
        }
        this.f29214H = str2;
        if (this.f29221b.f29278v.mo41406c()) {
            this.f29221b.mo41391e();
        } else {
            mo41375b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m45169a(ConnectionService.NetworkState networkState) {
        if (networkState != null && this.f29225f != networkState.mo20041b()) {
            this.f29225f = networkState.mo20041b();
            m45200u();
            this.f29221b.f29275s.mo96415m(this.f29225f);
        }
    }

    /* renamed from: a */
    private void m45170a(Document document) {
        FragmentActivity activity = getActivity();
        boolean a = C4211a.m17514a().mo16536a("spacekit.mobile.doc_insearch_enable_create_shortcut", false);
        MoreItemGroup a2 = new MoreItemGroup().mo39169a(1).mo39170a(m45162a(activity, CommonMoreItemId.ADD)).mo39171a(m45162a(activity, CommonMoreItemId.ADD_SHORT_CUT), a).mo39170a(m45162a(activity, CommonMoreItemId.STAR)).mo39170a(m45162a(activity, CommonMoreItemId.PIN));
        MoreItemGroup a3 = new MoreItemGroup().mo39169a(3).mo39170a(((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38966a("search", this.f29207A)).mo39170a(m45162a(activity, CommonMoreItemId.SUBSCRIBE));
        ArrayList<MoreItemGroup> arrayList = new ArrayList<>();
        arrayList.add(a2);
        arrayList.add(a3);
        ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38962a(getActivity(), arrayList, m45181b(document), C8292f.m34188e(document), (AbstractC10209c) null, (Bundle) null);
        C13479a.m54764b("SpaceSearchFragment", "showMoreV2()...add shortcut enable = " + a);
    }

    @Override // com.bytedance.ee.bear.search.adapter.C10804b.AbstractC10809b
    /* renamed from: b */
    public void mo40821b(Document document, int i) {
        m45170a(document);
    }

    /* renamed from: a */
    private IBaseMoreItem m45162a(FragmentActivity fragmentActivity, CommonMoreItemId commonMoreItemId) {
        return ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38964a(fragmentActivity, commonMoreItemId);
    }

    @Override // com.bytedance.ee.bear.search.adapter.C10804b.AbstractC10809b
    /* renamed from: c */
    public void mo40825c(Document document, int i) {
        this.f29220a.handleShareClick(getActivity(), document, this.f29211E);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m45164a(Document document, DocObjInfo docObjInfo) throws Exception {
        C8153a.m32844b().mo31612c(document.mo32472o(), docObjInfo.isSubscribed());
        return Boolean.valueOf((boolean) f29205s);
    }

    @Override // com.bytedance.ee.bear.search.adapter.C10811c.AbstractC10812a
    /* renamed from: b */
    public void mo40822b(String str, int i) {
        m45187c(str);
        this.f29214H = "completion";
        this.f29235p.mo40922a(this.f29230k, i, "completion");
    }

    /* renamed from: d */
    private void m45189d(Document document, int i) {
        String str;
        if (this.f29234o != null && (str = this.f29208B) != null) {
            SearchReport.m44869a(f29206t, this.f29238u, this.f29207A, "result_click", "ccm_docs_page_view", str.length(), this.f29208B, this.f29234o.mo40974b(), this.f29234o.mo40975c(), document.mo32472o(), C8275a.m34050a(document.mo32483t()), Integer.valueOf(i));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m45195p();
        m45199t();
        if (!TextUtils.isEmpty(this.f29208B)) {
            this.f29221b.f29265i.setText(this.f29208B);
            if (f29205s || getActivity() != null) {
                getActivity().getWindow().setSoftInputMode(2);
                this.f29221b.mo41394h();
                return;
            }
            throw new AssertionError();
        }
        this.f29221b.mo41393g();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m45167a(View view, boolean z) {
        if (z && this.f29240w.getItemCount() != 0 && this.f29225f) {
            this.f29221b.mo41395i();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m45165a(IMoreInfo dVar, Document document, DocObjInfo docObjInfo) throws Exception {
        dVar.mo39024a(docObjInfo.isSubscribed());
        AbstractC68307f.m265099b((Callable) new Callable(docObjInfo) {
            /* class com.bytedance.ee.bear.search.space.$$Lambda$SpaceSearchFragment$JlQhM8NkjNfcli2quMPDzOUTUg */
            public final /* synthetic */ DocObjInfo f$1;

            {
                this.f$1 = r2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SpaceSearchFragment.m45164a(Document.this, this.f$1);
            }
        }).mo238004b(C11678b.m48479c()).mo238001b($$Lambda$SpaceSearchFragment$D3WfmZBwpWSAL8Cr_KXYoGq1zRk.INSTANCE, $$Lambda$SpaceSearchFragment$1dM1nKuxIQasNsQiEDj1sGx0Xko.INSTANCE);
        return Boolean.valueOf((boolean) f29205s);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 5) {
            this.f29221b.f29278v.mo41403a(C10868m.m45143a(intent.getStringExtra("EXTRA_DEST_NAME")), intent.getStringExtra("EXTRA_DEST_TOKEN"));
        } else if (i == 3) {
            this.f29221b.f29278v.setTypeItem((SearchByTypeAdapter.TypeItem) intent.getSerializableExtra("KEY_TYPE_ITEM"));
        } else if (i == 4097) {
            this.f29221b.f29278v.setOwnerList(intent.getStringExtra("EXTRA_OWNER_INFO"));
        } else if (i == 4098) {
            this.f29221b.f29278v.setChatList(intent.getStringExtra("EXTRA_CHAT_INFO"));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.fragment_search_sapce, viewGroup, false);
        C10880a aVar = new C10880a(getContext(), inflate, this.f29241x, this.f29242y ^ f29205s);
        this.f29221b = aVar;
        aVar.mo41383a(this.f29224e, this.f29225f, this.f29207A);
        ImageView imageView = this.f29221b.f29259c;
        int i2 = 8;
        if (this.f29242y) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        View view = this.f29221b.f29266j;
        if (!TextUtils.isEmpty(this.f29208B)) {
            i2 = 0;
        }
        view.setVisibility(i2);
        SmartRefreshLayout smartRefreshLayout = this.f29221b.f29275s;
        Context context = getContext();
        Objects.requireNonNull(context);
        smartRefreshLayout.mo96367b((AbstractC27125d) new LoadMoreFooter(context));
        C10880a aVar2 = this.f29221b;
        Resources resources = getResources();
        if (this.f29224e == 1) {
            z = f29205s;
        }
        aVar2.mo41387a(resources, z);
        this.f29221b.f29267k.setAdapter(this.f29240w);
        this.f29221b.f29267k.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f29221b.f29276t.setLayoutManager(this.f29223d);
        this.f29221b.f29276t.setAdapter(this.f29222c);
        this.f29221b.f29275s.mo96415m(this.f29225f);
        if (this.f29224e == 2 || !((AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class)).mo20801b().mo20782g().f14914a) {
            this.f29221b.f29278v.mo41415h();
        }
        if (C4511g.m18594d().mo17344E() == 2) {
            this.f29221b.f29278v.mo41417j();
        }
        if (this.f29228i) {
            this.f29221b.f29278v.mo41408e();
        }
        AccountService.Account f = ((an) KoinJavaComponent.m268610a(an.class)).mo16408f();
        this.f29211E = f;
        if (f != null) {
            this.f29222c.mo40896a(f);
        }
        return inflate;
    }

    /* renamed from: a */
    private void m45171a(IMoreInfo dVar, C1177w<IMoreInfo> wVar, Document document) {
        ((AbstractC6158t) KoinJavaComponent.m268610a(AbstractC6158t.class)).mo20314a(document.mo32472o(), document.mo32483t(), false, false, f29205s, "list_detail").mo238020d(new Function(document) {
            /* class com.bytedance.ee.bear.search.space.$$Lambda$SpaceSearchFragment$ij1MVCxzdzQNyNqxFrf4S14shYY */
            public final /* synthetic */ Document f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return SpaceSearchFragment.m45165a(IMoreInfo.this, this.f$1, (DocObjInfo) obj);
            }
        }).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(dVar) {
            /* class com.bytedance.ee.bear.search.space.$$Lambda$SpaceSearchFragment$jZu1KCVFLpA6DHkEfpw_TdRr6Zs */
            public final /* synthetic */ IMoreInfo f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                Boolean bool = (Boolean) obj;
                C1177w.this.mo5929b((C1177w) this.f$1);
            }
        }, $$Lambda$SpaceSearchFragment$EviJJlYqY_MRhSoIVvxehCRFnj0.INSTANCE);
    }

    /* renamed from: a */
    private void m45166a(Context context, ArrayList<Document> arrayList, Document document, int i) {
        String s = document.mo32481s();
        try {
            s = Uri.parse(document.mo32481s()).buildUpon().appendQueryParameter("from", "tab_search").build().toString();
        } catch (Exception e) {
            C13479a.m54761a("SpaceSearchFragment", e);
        }
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17293a(s, ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31482a(context, document, "search", arrayList, "", ""));
    }

    /* renamed from: a */
    public static SpaceSearchFragment m45163a(Context context, int i, int i2, boolean z, String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putInt("KEY_SEARCH_BAR_DY", i);
        bundle.putInt("KEY_SEARCH_PAGE_TYPE", i2);
        bundle.putBoolean("KEY_FROM_LARK", z);
        bundle.putString("KEY_SEARCH_KEYWORD", str);
        bundle.putString("KEY_FOLDER_TOKEN", str2);
        bundle.putString("module", str3);
        return (SpaceSearchFragment) Fragment.instantiate(context, SpaceSearchFragment.class.getName(), bundle);
    }
}
