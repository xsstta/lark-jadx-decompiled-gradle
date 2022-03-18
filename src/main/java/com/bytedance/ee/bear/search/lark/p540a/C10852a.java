package com.bytedance.ee.bear.search.lark.p540a;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1178x;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.lark.p414b.AbstractC7993f;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.search.AbstractC10782a;
import com.bytedance.ee.bear.search.C10820e;
import com.bytedance.ee.bear.search.C10839j;
import com.bytedance.ee.bear.search.C10841k;
import com.bytedance.ee.bear.search.SearchSubActivity;
import com.bytedance.ee.bear.search.SearchTypeEnv;
import com.bytedance.ee.bear.search.adapter.SearchByTypeAdapter;
import com.bytedance.ee.bear.search.model.ChatInfo;
import com.bytedance.ee.bear.search.model.OwnerInfo;
import com.bytedance.ee.bear.search.model.SearchHistoryResponse;
import com.bytedance.ee.bear.search.model.SearchRecord;
import com.bytedance.ee.bear.search.model.SearchResponse;
import com.bytedance.ee.bear.search.widget.TagFlowLayout;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEditText;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.AbstractC68309a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.search.lark.a.a */
public class C10852a extends AbstractC10782a implements C10839j.AbstractC10840a {

    /* renamed from: u */
    protected C10859a f29106u;

    /* renamed from: v */
    private String f29107v;

    /* renamed from: w */
    private View f29108w;

    /* renamed from: x */
    private SearchByTypeAdapter f29109x;

    /* renamed from: y */
    private Disposable f29110y;

    @Override // com.bytedance.ee.bear.search.widget.SearchFilterView.AbstractC10892b
    /* renamed from: x */
    public void mo40945x() {
        C13479a.m54764b("lark.searchSearchHomeFragment", "onSelectWikiSpaceClick()...");
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.bytedance.ee.bear.search.lark.a.a$a */
    public static class C10859a {

        /* renamed from: a */
        public ViewGroup f29117a;

        /* renamed from: b */
        public ImageView f29118b;

        /* renamed from: c */
        public SpaceEditText f29119c;

        /* renamed from: d */
        public ImageView f29120d;

        /* renamed from: e */
        public TextView f29121e;

        /* renamed from: f */
        public View f29122f;

        /* renamed from: g */
        public View f29123g;

        /* renamed from: h */
        public TextView f29124h;

        /* renamed from: i */
        public TextView f29125i;

        /* renamed from: j */
        public View f29126j;

        /* renamed from: k */
        public TextView f29127k;

        /* renamed from: l */
        public View f29128l;

        /* renamed from: m */
        public ImageView f29129m;

        /* renamed from: n */
        public TagFlowLayout f29130n;

        /* renamed from: o */
        public TextView f29131o;

        /* renamed from: p */
        public RecyclerView f29132p;

        /* renamed from: q */
        public View f29133q;

        /* renamed from: r */
        public TextView f29134r;

        /* renamed from: s */
        public TextView f29135s;

        /* renamed from: t */
        public RecyclerView f29136t;

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo40992b() {
            this.f29123g.setVisibility(8);
            this.f29133q.setVisibility(0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40990a() {
            this.f29123g.setVisibility(0);
            this.f29133q.setVisibility(8);
            this.f29136t.setVisibility(8);
        }

        C10859a(View view) {
            this.f29117a = (ViewGroup) view.findViewById(R.id.search_bar_layout);
            this.f29118b = (ImageView) view.findViewById(R.id.search_bar_back);
            this.f29119c = (SpaceEditText) view.findViewById(R.id.search_bar_item_search_bar);
            this.f29120d = (ImageView) view.findViewById(R.id.search_bar_item_clear_icon);
            this.f29121e = (TextView) view.findViewById(R.id.search_bar_item_cancel_button);
            this.f29122f = view.findViewById(R.id.search_home_content);
            this.f29123g = view.findViewById(R.id.search_home_layout);
            this.f29124h = (TextView) view.findViewById(R.id.search_my_content);
            this.f29125i = (TextView) view.findViewById(R.id.search_recently_modified);
            this.f29126j = view.findViewById(R.id.search_recently_open_divider);
            this.f29127k = (TextView) view.findViewById(R.id.search_recently_open);
            this.f29128l = view.findViewById(R.id.search_history);
            this.f29129m = (ImageView) view.findViewById(R.id.search_delete_history);
            this.f29130n = (TagFlowLayout) view.findViewById(R.id.search_history_flow_view);
            this.f29131o = (TextView) view.findViewById(R.id.search_by_type_txt);
            this.f29132p = (RecyclerView) view.findViewById(R.id.search_by_type_recycler);
            this.f29133q = view.findViewById(R.id.search_container_layout);
            this.f29134r = (TextView) view.findViewById(R.id.search_result_all_txt);
            this.f29135s = (TextView) view.findViewById(R.id.search_result_subtype);
            this.f29136t = (RecyclerView) view.findViewById(R.id.search_suggestion_list);
            this.f29128l.setVisibility(8);
            this.f29135s.setText(R.string.Doc_Search_MyContent);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40991a(Resources resources, boolean z) {
            int i;
            int color = resources.getColor(R.color.primary_pri_500);
            int color2 = resources.getColor(R.color.text_caption);
            TextView textView = this.f29134r;
            if (z) {
                i = color;
            } else {
                i = color2;
            }
            textView.setTextColor(i);
            TextView textView2 = this.f29135s;
            if (z) {
                color = color2;
            }
            textView2.setTextColor(color);
        }
    }

    /* renamed from: D */
    private void m45019D() {
        Disposable disposable = this.f29110y;
        if (disposable != null && !disposable.isDisposed()) {
            this.f29110y.dispose();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ void m45020E() throws Exception {
        if (this.f28876c != null) {
            this.f28876c.getSearchHistory(mo40838q());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.search.AbstractC10782a
    /* renamed from: j */
    public void mo40833j() {
        super.mo40833j();
        if (!this.f28879f) {
            this.f28887n.f29075o = 2;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        m45019D();
        C10839j.m44943a().mo40957b(this);
    }

    @Override // com.bytedance.ee.bear.search.C10839j.AbstractC10840a
    /* renamed from: z */
    public void mo40947z() {
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.search.AbstractC10782a
    /* renamed from: k */
    public void mo40834k() {
        if (TextUtils.isEmpty(this.f29107v)) {
            this.f29106u.mo40992b();
            this.f28876c.searchFromCache(this.f29107v);
            this.f28884k = SearchTypeEnv.CACHE;
            return;
        }
        this.f28878e.mo40844c();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.search.AbstractC10782a
    /* renamed from: l */
    public void mo40835l() {
        super.mo40835l();
        this.f28876c.getSearchHistory(mo40838q());
        if (TextUtils.isEmpty(this.f29107v)) {
            this.f29106u.mo40990a();
        } else {
            mo40943v();
        }
    }

    /* renamed from: B */
    private void m45017B() {
        String str;
        this.f28878e.mo40851j();
        if (this.f28883j) {
            this.f28878e.f28923o.setVisibility(8);
        }
        C10841k.C10844a aVar = this.f28887n;
        if (TextUtils.isEmpty(this.f28887n.f29061a)) {
            str = "";
        } else {
            str = this.f28887n.f29061a;
        }
        aVar.f29061a = str;
        this.f28876c.searchFromCache(this.f28887n.f29061a);
    }

    /* renamed from: C */
    private void m45018C() {
        this.f28876c.getHistoryData().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.search.lark.p540a.$$Lambda$a$3seNBwyZnwiMCtdOIyppMN2ZW8 */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C10852a.m269914lambda$3seNBwyZnwiMCtdOIyppMN2ZW8(C10852a.this, (SearchHistoryResponse) obj);
            }
        });
        this.f28876c.getSearchKeyword().mo5923a(getViewLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.search.lark.p540a.$$Lambda$a$G89TaHZDXA8fnsd_DkKWHbWoUEw */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C10852a.lambda$G89TaHZDXA8fnsd_DkKWHbWoUEw(C10852a.this, (String) obj);
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.search.AbstractC10782a
    public AbstractC10782a.C10786a G_() {
        return new AbstractC10782a.C10786a(this.f29108w, this.f29106u.f29117a, this.f29106u.f29118b, this.f29106u.f29119c, this.f29106u.f29120d, this.f29106u.f29121e, this.f29106u.f29122f);
    }

    @Override // com.bytedance.ee.bear.search.widget.SearchFilterView.AbstractC10892b
    /* renamed from: w */
    public void mo40944w() {
        this.f28887n.mo40976d();
        this.f28885l.getObj_types().clear();
        this.f28885l.getFile_types().clear();
        this.f28885l.getOwner().clear();
        this.f28885l.getGroup().clear();
        this.f28885l.getFolder().clear();
    }

    @Override // com.bytedance.ee.bear.search.C10839j.AbstractC10840a
    /* renamed from: y */
    public void mo40946y() {
        m45019D();
        this.f29110y = Observable.timer(500, TimeUnit.MILLISECONDS).subscribeOn(C11678b.m48480d()).observeOn(C11678b.m48481e()).doOnComplete(new AbstractC68309a() {
            /* class com.bytedance.ee.bear.search.lark.p540a.$$Lambda$a$TUyPFOpnnGhPgI9Ld6rkCD1WiQY */

            @Override // io.reactivex.functions.AbstractC68309a
            public final void run() {
                C10852a.lambda$TUyPFOpnnGhPgI9Ld6rkCD1WiQY(C10852a.this);
            }
        }).subscribe();
    }

    /* renamed from: A */
    private void mo40993A() {
        this.f29106u.f29124h.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.search.lark.p540a.C10852a.C108531 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C10852a.this.mo40988a(1, -1, null);
            }
        });
        this.f29106u.f29125i.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.search.lark.p540a.C10852a.C108542 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C10852a.this.mo40988a(2, -1, null);
            }
        });
        this.f29106u.f29127k.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.search.lark.p540a.C10852a.C108553 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C10852a.this.mo40988a(3, -1, null);
            }
        });
        this.f29106u.f29130n.setItemLickListener(new TagFlowLayout.AbstractC10895b() {
            /* class com.bytedance.ee.bear.search.lark.p540a.$$Lambda$a$nd0iLKJYv0EVKWLKq8AGbTLUl4I */

            @Override // com.bytedance.ee.bear.search.widget.TagFlowLayout.AbstractC10895b
            public final void onItemClick(SearchHistoryResponse.SearchHistory searchHistory) {
                C10852a.lambda$nd0iLKJYv0EVKWLKq8AGbTLUl4I(C10852a.this, searchHistory);
            }
        });
        this.f29106u.f29129m.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.search.lark.p540a.C10852a.C108564 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C10852a.this.f29106u.f29128l.setVisibility(8);
                C10852a.this.f28876c.deleteSearchHistory(C10852a.this.mo40839r());
                C10852a.this.f28888o.mo40930b(C10852a.this.f28886m);
            }
        });
        SearchByTypeAdapter searchByTypeAdapter = this.f29109x;
        if (searchByTypeAdapter != null) {
            searchByTypeAdapter.mo40889a(new SearchByTypeAdapter.AbstractC10800a() {
                /* class com.bytedance.ee.bear.search.lark.p540a.$$Lambda$a$lirr5HRQet48NQyo9Hz6u0jmu4Q */

                @Override // com.bytedance.ee.bear.search.adapter.SearchByTypeAdapter.AbstractC10800a
                public final void onTypeItemClick(SearchByTypeAdapter.TypeItem typeItem) {
                    C10852a.lambda$lirr5HRQet48NQyo9Hz6u0jmu4Q(C10852a.this, typeItem);
                }
            });
        }
        this.f29106u.f29134r.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.search.lark.p540a.C10852a.C108575 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (!C10852a.this.f28881h) {
                    C10852a.this.f28878e.mo40845d();
                    C10852a.this.f29106u.mo40991a(C10852a.this.getResources(), true);
                    C10852a.this.f28887n.f29067g.clear();
                    C10852a.this.mo40943v();
                    C10852a.this.f28881h = true;
                    C10852a.this.f28885l.setOwn_by_user(false);
                    C10852a.this.f28885l.getOwner().clear();
                    C10852a.this.f28889p = "all";
                }
            }
        });
        this.f29106u.f29135s.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.search.lark.p540a.C10852a.C108586 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C10852a.this.f28881h) {
                    C10852a.this.f28878e.mo40846e();
                    C10852a.this.f28878e.f28916h.mo41420m();
                    if (C10852a.this.f28877d == null) {
                        C13479a.m54758a("lark.searchSearchHomeFragment", "clicked mSubTxt, mAccount == null");
                        return;
                    }
                    C10852a.this.f28881h = false;
                    C10852a.this.f29106u.mo40991a(C10852a.this.getResources(), false);
                    C10852a.this.f28887n.f29067g.clear();
                    C10852a.this.f28887n.f29067g.add(C10852a.this.f28877d.f14584a);
                    C10852a.this.mo40943v();
                    C10852a.this.f28885l.setOwn_by_user(true);
                    C10852a.this.f28885l.getOwner().clear();
                    C10852a.this.f28885l.getOwner().add(SearchRecord.account2Owner(C10852a.this.f28877d));
                    C10852a.this.f28889p = "mycontent";
                }
            }
        });
        C10839j.m44943a().mo40955a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo40941t() {
        mo40942u();
        this.f28887n.f29076p = "search_lark_index";
        if (!TextUtils.isEmpty(this.f29107v)) {
            this.f28887n.f29061a = this.f29107v.trim();
            mo40943v();
            mo40836o();
        } else {
            mo40837p();
        }
        this.f29106u.mo40991a(getResources(), this.f28881h);
        if (!this.f28879f) {
            mo40943v();
        }
        this.f28888o.mo40926a(this.f28886m, true, "");
    }

    /* renamed from: v */
    public void mo40943v() {
        SearchTypeEnv searchTypeEnv;
        this.f29106u.mo40992b();
        this.f28887n.f29062b = 0;
        if (this.f28879f) {
            searchTypeEnv = SearchTypeEnv.NET;
        } else {
            searchTypeEnv = SearchTypeEnv.CACHE;
        }
        this.f28884k = searchTypeEnv;
        this.f28878e.mo40841a();
        if (this.f28879f) {
            if (!this.f28883j) {
                this.f28878e.mo40852k();
            }
            this.f28876c.search(this.f28886m, this.f28887n);
        } else if (mo40840s()) {
            m45017B();
        } else {
            this.f28878e.mo40844c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo40942u() {
        ArrayList arrayList = new ArrayList();
        int b = C8275a.f22373f.mo32555b();
        int b2 = C8275a.f22376i.mo32555b();
        int b3 = C8275a.f22375h.mo32555b();
        int b4 = C8275a.f22371d.mo32555b();
        int b5 = C8275a.f22374g.mo32555b();
        int b6 = C8275a.f22372e.mo32555b();
        int b7 = C8275a.f22370c.mo32555b();
        arrayList.add(new SearchByTypeAdapter.TypeItem(b4, R.drawable.ud_icon_file_link_word_outlined, R.string.Doc_Facade_Document));
        arrayList.add(new SearchByTypeAdapter.TypeItem(b6, R.drawable.ud_icon_file_link_sheet_outlined, R.string.Doc_Facade_CreateSheet));
        if (m45024a(b5, false)) {
            arrayList.add(new SearchByTypeAdapter.TypeItem(b5, R.drawable.ud_icon_file_link_mindnote_outlined, R.string.Doc_Facade_MindNote));
        }
        if (m45024a(b, false)) {
            arrayList.add(new SearchByTypeAdapter.TypeItem(b, R.drawable.ud_icon_file_link_bitable_outlined, R.string.Doc_Facade_Bitable));
        }
        if (m45024a(b2, false)) {
            arrayList.add(new SearchByTypeAdapter.TypeItem(b2, R.drawable.ud_icon_file_link_slide_outlined, R.string.Doc_Facade_Slide));
        }
        arrayList.add(new SearchByTypeAdapter.TypeItem(b3, R.drawable.ud_icon_paperbag_outlined, R.string.Doc_Facade_UploadFile));
        arrayList.add(new SearchByTypeAdapter.TypeItem(b7, R.drawable.ud_icon_folder_outlined, R.string.Doc_Facade_Folder));
        this.f29109x = new SearchByTypeAdapter(arrayList, R.layout.search_by_type_item);
        this.f29106u.f29132p.setLayoutManager(new GridLayoutManager(getContext(), 2));
        this.f29106u.f29132p.setAdapter(this.f29109x);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m45021a(SearchByTypeAdapter.TypeItem typeItem) {
        mo40988a(7, typeItem.typeId, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m45022a(SearchHistoryResponse.SearchHistory searchHistory) {
        mo40988a(6, -1, searchHistory);
        this.f28888o.mo40921a(this.f28886m);
    }

    @Override // com.bytedance.ee.bear.search.AbstractC10782a, com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f28881h = true;
        this.f28889p = "all";
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m45023a(SearchHistoryResponse searchHistoryResponse) {
        if (CollectionUtils.isEmpty(searchHistoryResponse.getData().getHistory())) {
            this.f29106u.f29128l.setVisibility(8);
            return;
        }
        this.f29106u.f29128l.setVisibility(0);
        this.f29106u.f29130n.setData(searchHistoryResponse.getData().getHistory());
    }

    /* access modifiers changed from: private */
    @Override // com.bytedance.ee.bear.search.AbstractC10782a
    /* renamed from: b */
    public void m45025b(String str) {
        String str2;
        C13479a.m54772d("lark.searchSearchHomeFragment", "textChangeSearch");
        this.f28885l.setMain_page_option(0);
        this.f29107v = str;
        if (TextUtils.isEmpty(str)) {
            C10820e.m44875a().mo40919c();
        }
        if (!this.f28891r) {
            if (TextUtils.isEmpty(this.f29107v)) {
                str2 = "none";
            } else {
                str2 = "search";
            }
            this.f28890q = str2;
        }
        this.f28891r = false;
        if (this.f28883j) {
            this.f28887n.f29061a = this.f29107v.trim();
            mo40943v();
        } else if (TextUtils.isEmpty(this.f29107v)) {
            if (this.f28879f) {
                this.f29106u.mo40990a();
            } else {
                this.f28887n.f29061a = "";
                mo40943v();
            }
            if (!this.f28881h) {
                this.f28878e.mo40845d();
            }
            if (this.f28878e.f28916h.mo41406c()) {
                mo40831h();
            }
            this.f29106u.mo40991a(getResources(), true);
            this.f28881h = true;
        } else {
            this.f28887n.f29061a = this.f29107v.trim();
            mo40943v();
            this.f28885l.setQuery(this.f28887n.f29061a);
        }
    }

    /* renamed from: a */
    public void mo40989a(String str) {
        this.f28876c.getSearchKeyword().mo5926a(str);
        this.f29106u.f29119c.setText(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.search.AbstractC10782a
    /* renamed from: a */
    public void mo40819a(boolean z) {
        super.mo40819a(z);
        this.f28883j = false;
        this.f28887n.f29067g.clear();
        this.f28887n.f29075o = 2;
        if (TextUtils.isEmpty(this.f29107v)) {
            if (this.f28879f) {
                this.f29106u.mo40990a();
            }
            this.f28878e.f28916h.mo41420m();
            mo40831h();
        } else if (z) {
            mo40943v();
        }
    }

    @Override // com.bytedance.ee.bear.search.AbstractC10782a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo40941t();
        mo40993A();
        mo40820b();
        m45018C();
    }

    @Override // com.bytedance.ee.bear.search.AbstractC10782a, com.bytedance.ee.bear.search.adapter.C10811c.AbstractC10812a
    /* renamed from: a */
    public void mo40817a(SearchResponse.Data.Candidates candidates, int i) {
        super.mo40817a(candidates, i);
        this.f28887n.mo40972a();
        this.f28887n.f29067g.add(candidates.getOwner_id());
        this.f28887n.f29075o = 0;
    }

    /* renamed from: a */
    private boolean m45024a(int i, boolean z) {
        boolean e = ((AbstractC7993f) KoinJavaComponent.m268610a(AbstractC7993f.class)).mo30993e();
        if (i == 8 && e) {
            return C4211a.m17514a().mo16536a("ccm.spacekit.bitable.enable", false);
        }
        if (i == 15) {
            return C4211a.m17514a().mo16536a("spacekit.mobile.slide_enabled", z);
        }
        if (i == 11) {
            return ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31523e();
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.search.AbstractC10782a, com.bytedance.ee.bear.search.adapter.C10804b.AbstractC10809b
    /* renamed from: a */
    public void mo40815a(Document document, int i) {
        String str;
        super.mo40815a(document, i);
        if (this.f28879f) {
            str = this.f28889p;
        } else {
            str = "offline";
        }
        this.f28889p = str;
        this.f28888o.mo40923a(this.f28886m, document, this.f28889p, i, this.f28876c.getRequestId(), this.f28890q, this.f28887n.f29076p);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_search_home_lark, viewGroup, false);
        this.f29108w = inflate;
        this.f29106u = new C10859a(inflate);
        this.f28876c.getSearchHistory(mo40838q());
        return this.f29108w;
    }

    /* renamed from: a */
    public void mo40988a(int i, int i2, SearchHistoryResponse.SearchHistory searchHistory) {
        C13479a.m54764b("lark.searchSearchHomeFragment", "goToSubPage()... mSearchType = " + this.f28886m);
        Intent intent = new Intent(getContext(), SearchSubActivity.class);
        intent.putExtra("KEY_SEARCH_SUB_PAGE_TYPE", i);
        intent.putExtra("KEY_SEARCH_KEYWORD", this.f28887n.f29061a);
        intent.putExtra("KEY_SEARCH_SOURCE", "EXTRA_FROM_LARK");
        intent.putExtra("KEY_FROM_LARK", true);
        intent.putExtra("KEY_SEARCH_OBJ_TYPE", i2);
        intent.putExtra("KEY_SEARCH_HISTORY", searchHistory);
        if (this.f28886m == 1) {
            intent.putExtra(ShareHitPoint.f121869d, "wiki");
        }
        startActivity(intent);
    }

    @Override // com.bytedance.ee.bear.search.widget.SearchFilterView.AbstractC10892b
    /* renamed from: a */
    public void mo40940a(int i, int i2, List<OwnerInfo> list, List<ChatInfo> list2, List<SearchResponse.Data.SpaceData> list3, SearchRecord.Folder folder) {
        this.f28888o.mo40936g(this.f28886m, this.f28889p);
        mo40944w();
        if (i != -1) {
            this.f28887n.f29064d.add(Integer.valueOf(i));
            this.f28885l.getObj_types().add(Integer.valueOf(i));
        }
        if (i2 != -1) {
            this.f28887n.f29064d.add(Integer.valueOf(C8275a.f22375h.mo32555b()));
            this.f28887n.f29065e.add(Integer.valueOf(i2));
            this.f28885l.getObj_types().add(Integer.valueOf(C8275a.f22375h.mo32555b()));
            this.f28885l.getFile_types().add(Integer.valueOf(i2));
        }
        if (!CollectionUtils.isEmpty(list)) {
            for (OwnerInfo ownerInfo : list) {
                this.f28887n.f29067g.add(ownerInfo.getOwnerId());
                this.f28885l.getOwner().add(SearchRecord.ownerInfo2Owner(ownerInfo));
            }
        }
        if (!CollectionUtils.isEmpty(list2)) {
            for (ChatInfo chatInfo : list2) {
                if (chatInfo.getChatType() == ChatInfo.ChatType.GROUP_CHAT.getValue()) {
                    this.f28887n.f29068h.add(chatInfo.getChatId());
                } else {
                    this.f28887n.f29069i.add(chatInfo.getChatId());
                }
                this.f28885l.getGroup().add(SearchRecord.chatInfo2Group(chatInfo));
            }
        }
        if (list3 != null && !list3.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (SearchResponse.Data.SpaceData spaceData : list3) {
                this.f28887n.mo40973a(spaceData.getSpace_id());
                SearchRecord.Space space = new SearchRecord.Space();
                space.space_id_str = spaceData.getSpace_id();
                space.space_name = spaceData.getSpace_name();
                arrayList.add(space);
            }
            this.f28885l.setSpace(arrayList);
        }
        if (folder != null) {
            this.f28887n.f29070j.add(folder.getToken());
            this.f28885l.getFolder().add(folder);
        }
        mo40943v();
    }
}
