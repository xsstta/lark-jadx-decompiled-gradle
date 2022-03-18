package com.bytedance.ee.bear.search;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
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
import com.bytedance.ee.bear.search.C10839j;
import com.bytedance.ee.bear.search.C10841k;
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
import com.bytedance.ee.util.p712o.p713a.C13716b;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.search.h */
public class C10825h extends AbstractC10782a implements C10839j.AbstractC10840a {

    /* renamed from: A */
    private SearchByTypeAdapter f29006A;

    /* renamed from: B */
    private Disposable f29007B;

    /* renamed from: C */
    private Disposable f29008C;

    /* renamed from: D */
    private boolean f29009D;

    /* renamed from: u */
    protected String f29010u;

    /* renamed from: v */
    protected C10835a f29011v;

    /* renamed from: w */
    public boolean f29012w;

    /* renamed from: x */
    protected String f29013x = "";

    /* renamed from: y */
    private String f29014y;

    /* renamed from: z */
    private View f29015z;

    /* renamed from: B */
    public boolean mo40938B() {
        return this.f29012w;
    }

    @Override // com.bytedance.ee.bear.search.AbstractC10782a, com.bytedance.ee.bear.search.adapter.C10804b.AbstractC10809b
    /* renamed from: a */
    public void mo40815a(Document document, int i) {
        super.mo40815a(document, i);
        this.f28889p = this.f28879f ? this.f28889p : "offline";
        this.f28888o.mo40923a(this.f28886m, document, this.f28889p, i, this.f28876c.getRequestId(), this.f28890q, this.f28887n.f29076p);
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

    @Override // com.bytedance.ee.bear.search.AbstractC10782a, com.bytedance.ee.bear.search.adapter.C10811c.AbstractC10812a
    /* renamed from: a */
    public void mo40817a(SearchResponse.Data.Candidates candidates, int i) {
        super.mo40817a(candidates, i);
        this.f29011v.f29029e.setVisibility(8);
        this.f28887n.mo40972a();
        this.f28887n.f29067g.add(candidates.getOwner_id());
        this.f28887n.f29075o = 0;
        this.f29011v.f29027c.setText("");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.search.AbstractC10782a
    /* renamed from: a */
    public void mo40819a(boolean z) {
        super.mo40819a(z);
        this.f28883j = false;
        this.f28887n.f29067g.clear();
        this.f28887n.f29075o = 2;
        if (TextUtils.isEmpty(this.f29011v.f29027c.getText().toString())) {
            if (this.f28879f) {
                this.f29011v.mo40948a();
            }
            this.f28878e.f28916h.mo41420m();
            mo40831h();
        } else if (z) {
            mo40943v();
        }
    }

    @Override // com.bytedance.ee.bear.search.widget.SearchFilterView.AbstractC10892b
    /* renamed from: x */
    public void mo40945x() {
        C13479a.m54764b("SearchHomeFragment", "onSelectWikiSpaceClick()...");
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.bytedance.ee.bear.search.h$a */
    public static class C10835a {

        /* renamed from: a */
        public ViewGroup f29025a;

        /* renamed from: b */
        public ImageView f29026b;

        /* renamed from: c */
        public SpaceEditText f29027c;

        /* renamed from: d */
        public ImageView f29028d;

        /* renamed from: e */
        public ImageView f29029e;

        /* renamed from: f */
        public TextView f29030f;

        /* renamed from: g */
        public View f29031g;

        /* renamed from: h */
        public View f29032h;

        /* renamed from: i */
        public TextView f29033i;

        /* renamed from: j */
        public TextView f29034j;

        /* renamed from: k */
        public View f29035k;

        /* renamed from: l */
        public TextView f29036l;

        /* renamed from: m */
        public View f29037m;

        /* renamed from: n */
        public ImageView f29038n;

        /* renamed from: o */
        public TagFlowLayout f29039o;

        /* renamed from: p */
        public TextView f29040p;

        /* renamed from: q */
        public RecyclerView f29041q;

        /* renamed from: r */
        public View f29042r;

        /* renamed from: s */
        public TextView f29043s;

        /* renamed from: t */
        public TextView f29044t;

        /* renamed from: u */
        public RecyclerView f29045u;

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo40951b() {
            this.f29032h.setVisibility(8);
            this.f29042r.setVisibility(0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40948a() {
            this.f29032h.setVisibility(0);
            this.f29042r.setVisibility(8);
            this.f29045u.setVisibility(8);
        }

        /* renamed from: a */
        public void mo40949a(int i) {
            this.f29028d.setImageResource(i);
        }

        /* renamed from: b */
        public void mo40952b(int i) {
            this.f29027c.setHint(i);
        }

        C10835a(View view) {
            this.f29025a = (ViewGroup) view.findViewById(R.id.search_bar_layout);
            this.f29026b = (ImageView) view.findViewById(R.id.search_bar_back);
            this.f29027c = (SpaceEditText) view.findViewById(R.id.search_bar_item_search_bar);
            this.f29028d = (ImageView) view.findViewById(R.id.search_bar_item_icon_hint);
            this.f29029e = (ImageView) view.findViewById(R.id.search_bar_item_clear_icon);
            this.f29030f = (TextView) view.findViewById(R.id.search_bar_item_cancel_button);
            this.f29031g = view.findViewById(R.id.search_home_content);
            this.f29032h = view.findViewById(R.id.search_home_layout);
            this.f29033i = (TextView) view.findViewById(R.id.search_my_content);
            this.f29034j = (TextView) view.findViewById(R.id.search_recently_modified);
            this.f29035k = view.findViewById(R.id.search_recently_open_divider);
            this.f29036l = (TextView) view.findViewById(R.id.search_recently_open);
            this.f29037m = view.findViewById(R.id.search_history);
            this.f29038n = (ImageView) view.findViewById(R.id.search_delete_history);
            this.f29039o = (TagFlowLayout) view.findViewById(R.id.search_history_flow_view);
            this.f29040p = (TextView) view.findViewById(R.id.search_by_type_txt);
            this.f29041q = (RecyclerView) view.findViewById(R.id.search_by_type_recycler);
            this.f29042r = view.findViewById(R.id.search_container_layout);
            this.f29043s = (TextView) view.findViewById(R.id.search_result_all_txt);
            this.f29044t = (TextView) view.findViewById(R.id.search_result_subtype);
            this.f29045u = (RecyclerView) view.findViewById(R.id.search_suggestion_list);
            this.f29037m.setVisibility(8);
            this.f29044t.setText(R.string.Doc_Search_MyContent);
            this.f29027c.requestFocus();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40950a(Resources resources, boolean z) {
            int i;
            int color = resources.getColor(R.color.space_kit_b500);
            int color2 = resources.getColor(R.color.space_kit_n600);
            TextView textView = this.f29043s;
            if (z) {
                i = color;
            } else {
                i = color2;
            }
            textView.setTextColor(i);
            TextView textView2 = this.f29044t;
            if (z) {
                color = color2;
            }
            textView2.setTextColor(color);
        }
    }

    /* renamed from: E */
    private void m44899E() {
        this.f28876c.getHistoryData().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.search.$$Lambda$h$Wuw6ckXtSNfYu5DivmLzQ3WCa6w */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C10825h.this.m44905a((C10825h) ((SearchHistoryResponse) obj));
            }
        });
    }

    /* renamed from: F */
    private void m44900F() {
        Disposable disposable = this.f29007B;
        if (disposable != null && !disposable.isDisposed()) {
            this.f29007B.dispose();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ void m44901G() throws Exception {
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
        Disposable disposable = this.f29008C;
        if (disposable != null) {
            disposable.dispose();
        }
        m44900F();
        C10839j.m44943a().mo40957b(this);
    }

    @Override // com.bytedance.ee.bear.search.C10839j.AbstractC10840a
    /* renamed from: z */
    public void mo40947z() {
        this.f29012w = true;
        this.f29011v.f29026b.setVisibility(8);
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    /* renamed from: D */
    private void m44898D() {
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

    /* renamed from: A */
    public void mo40937A() {
        if (!this.f29009D) {
            this.f29011v.f29027c.setText("");
        }
        this.f29011v.f29027c.clearFocus();
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.search.AbstractC10782a
    public AbstractC10782a.C10786a G_() {
        return new AbstractC10782a.C10786a(this.f29015z, this.f29011v.f29025a, this.f29011v.f29026b, this.f29011v.f29027c, this.f29011v.f29029e, this.f29011v.f29030f, this.f29011v.f29031g);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.search.AbstractC10782a
    /* renamed from: k */
    public void mo40834k() {
        String obj = this.f29011v.f29027c.getText().toString();
        if (TextUtils.isEmpty(obj)) {
            this.f29011v.mo40951b();
            this.f28876c.searchFromCache(obj);
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
        if (TextUtils.isEmpty(this.f29011v.f29027c.getText().toString())) {
            this.f29011v.mo40948a();
        } else {
            mo40943v();
        }
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
        m44900F();
        this.f29007B = Observable.timer(500, TimeUnit.MILLISECONDS).subscribeOn(C11678b.m48480d()).observeOn(C11678b.m48481e()).doOnComplete(new AbstractC68309a() {
            /* class com.bytedance.ee.bear.search.$$Lambda$h$eZ1tfgF6YIOY8G0BdW10RoPNVOo */

            @Override // io.reactivex.functions.AbstractC68309a
            public final void run() {
                C10825h.this.m44901G();
            }
        }).subscribe();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo40943v() {
        SearchTypeEnv searchTypeEnv;
        this.f29011v.mo40951b();
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
            m44898D();
        } else {
            this.f28878e.mo40844c();
        }
    }

    /* renamed from: C */
    private void mo41437C() {
        this.f29011v.f29026b.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.search.C10825h.C108261 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C10825h.this.mo40937A();
            }
        });
        this.f29011v.f29030f.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.search.C10825h.C108272 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C10825h.this.f29012w = true;
                C10825h.this.f29011v.f29027c.setText("");
                C10825h.this.f29011v.f29027c.clearFocus();
                C10825h.this.f29011v.f29026b.setVisibility(8);
                if (C10825h.this.getActivity() != null) {
                    C10825h.this.mo40836o();
                    C10825h.this.getActivity().finish();
                }
            }
        });
        this.f29011v.f29029e.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.search.C10825h.C108283 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C10825h.this.f29011v.f29027c.setText("");
                C10825h.this.f29011v.f29029e.setVisibility(8);
                C10825h.this.f28885l.setQuery("");
            }
        });
        this.f29008C = C13716b.m55614a(this.f29011v.f29027c).debounce(300, TimeUnit.MILLISECONDS, C11678b.m48480d()).observeOn(C11678b.m48481e()).subscribe(new Consumer() {
            /* class com.bytedance.ee.bear.search.$$Lambda$h$Od3D0pBx9QCElpBWQRWEFEMrU9k */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C10825h.this.m44906a((C10825h) ((CharSequence) obj));
            }
        }, $$Lambda$h$VNutWm4iiJlAiQQqSeBb0I7eiWw.INSTANCE);
        this.f29011v.f29027c.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            /* class com.bytedance.ee.bear.search.$$Lambda$h$qBmfzM5m8ZewBLdGs0OIY2ONA_k */

            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return C10825h.this.m44910a(textView, i, keyEvent);
            }
        });
        this.f29011v.f29033i.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.search.C10825h.C108294 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C10825h.this.mo40939a(1, -1, (SearchHistoryResponse.SearchHistory) null);
            }
        });
        this.f29011v.f29034j.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.search.C10825h.C108305 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C10825h.this.mo40939a(2, -1, (SearchHistoryResponse.SearchHistory) null);
            }
        });
        this.f29011v.f29036l.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.search.C10825h.C108316 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C10825h.this.mo40939a(3, -1, (SearchHistoryResponse.SearchHistory) null);
            }
        });
        this.f29011v.f29039o.setItemLickListener(new TagFlowLayout.AbstractC10895b() {
            /* class com.bytedance.ee.bear.search.$$Lambda$h$_w5q37Gkp4YLflziL3OSUjqfY */

            @Override // com.bytedance.ee.bear.search.widget.TagFlowLayout.AbstractC10895b
            public final void onItemClick(SearchHistoryResponse.SearchHistory searchHistory) {
                C10825h.this.m44904a((C10825h) searchHistory);
            }
        });
        this.f29011v.f29038n.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.search.C10825h.C108327 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C10825h.this.f29011v.f29037m.setVisibility(8);
                C10825h.this.f28876c.deleteSearchHistory(C10825h.this.mo40839r());
                C10825h.this.f28888o.mo40930b(C10825h.this.f28886m);
            }
        });
        SearchByTypeAdapter searchByTypeAdapter = this.f29006A;
        if (searchByTypeAdapter != null) {
            searchByTypeAdapter.mo40889a(new SearchByTypeAdapter.AbstractC10800a() {
                /* class com.bytedance.ee.bear.search.$$Lambda$h$xU8tfOSYpy6722PLg4uQNie0EqA */

                @Override // com.bytedance.ee.bear.search.adapter.SearchByTypeAdapter.AbstractC10800a
                public final void onTypeItemClick(SearchByTypeAdapter.TypeItem typeItem) {
                    C10825h.this.m44903a((C10825h) typeItem);
                }
            });
        }
        this.f29011v.f29043s.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.search.C10825h.C108338 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (!C10825h.this.f28881h) {
                    C10825h.this.f28878e.mo40845d();
                    C10825h.this.f29011v.mo40950a(C10825h.this.getResources(), true);
                    C10825h.this.f28887n.f29067g.clear();
                    C10825h.this.mo40943v();
                    C10825h.this.f28881h = true;
                    C10825h.this.f28885l.setOwn_by_user(false);
                    C10825h.this.f28885l.getOwner().clear();
                    C10825h.this.f28889p = "all";
                }
            }
        });
        this.f29011v.f29044t.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.search.C10825h.C108349 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C10825h.this.f28881h) {
                    C10825h.this.f28878e.mo40846e();
                    C10825h.this.f28878e.f28916h.mo41420m();
                    if (C10825h.this.f28877d == null) {
                        C13479a.m54758a("SearchHomeFragment", "clicked mSubTxt, mAccount == null");
                        return;
                    }
                    C10825h.this.f28881h = false;
                    C10825h.this.f29011v.mo40950a(C10825h.this.getResources(), false);
                    C10825h.this.f28887n.f29067g.clear();
                    C10825h.this.f28887n.f29067g.add(C10825h.this.f28877d.f14584a);
                    C10825h.this.mo40943v();
                    C10825h.this.f28885l.setOwn_by_user(true);
                    C10825h.this.f28885l.getOwner().clear();
                    C10825h.this.f28885l.getOwner().add(SearchRecord.account2Owner(C10825h.this.f28877d));
                    C10825h.this.f28889p = "mycontent";
                }
            }
        });
        C10839j.m44943a().mo40955a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo40941t() {
        int i;
        String str;
        mo40942u();
        this.f29009D = TextUtils.equals(this.f29014y, "EXTRA_FROM_LARK");
        ImageView imageView = this.f29011v.f29026b;
        if (this.f29009D) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        C10841k.C10844a aVar = this.f28887n;
        if (this.f29009D) {
            str = "search_lark_index";
        } else {
            str = "search_docs_pri";
        }
        aVar.f29076p = str;
        if (!TextUtils.isEmpty(this.f29010u)) {
            this.f29011v.f29027c.setText(this.f29010u);
            this.f29011v.f29029e.setVisibility(0);
            this.f29011v.f29027c.setSelection(this.f29010u.length());
            this.f28887n.f29061a = this.f29010u.trim();
            mo40943v();
            mo40836o();
        } else {
            mo40837p();
        }
        this.f29011v.mo40950a(getResources(), this.f28881h);
        if (!this.f28879f) {
            mo40943v();
        }
        this.f28888o.mo40926a(this.f28886m, this.f29009D, "");
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
        if (m44909a(b5, false)) {
            arrayList.add(new SearchByTypeAdapter.TypeItem(b5, R.drawable.ud_icon_file_link_mindnote_outlined, R.string.Doc_Facade_MindNote));
        }
        if (m44909a(b, false)) {
            arrayList.add(new SearchByTypeAdapter.TypeItem(b, R.drawable.ud_icon_file_link_bitable_outlined, R.string.Doc_Facade_Bitable));
        }
        if (m44909a(b2, false)) {
            arrayList.add(new SearchByTypeAdapter.TypeItem(b2, R.drawable.ud_icon_file_link_slide_outlined, R.string.Doc_Facade_Slide));
        }
        arrayList.add(new SearchByTypeAdapter.TypeItem(b3, R.drawable.ud_icon_paperbag_outlined, R.string.Doc_Facade_UploadFile));
        arrayList.add(new SearchByTypeAdapter.TypeItem(b7, R.drawable.ud_icon_folder_outlined, R.string.Doc_Facade_Folder));
        this.f29006A = new SearchByTypeAdapter(arrayList, R.layout.search_by_type_item);
        this.f29011v.f29041q.setLayoutManager(new GridLayoutManager(getContext(), 2));
        this.f29011v.f29041q.setAdapter(this.f29006A);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m44903a(SearchByTypeAdapter.TypeItem typeItem) {
        mo40939a(7, typeItem.typeId, (SearchHistoryResponse.SearchHistory) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m44904a(SearchHistoryResponse.SearchHistory searchHistory) {
        mo40939a(6, -1, searchHistory);
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
    public /* synthetic */ void m44905a(SearchHistoryResponse searchHistoryResponse) {
        if (CollectionUtils.isEmpty(searchHistoryResponse.getData().getHistory())) {
            this.f29011v.f29037m.setVisibility(8);
            return;
        }
        this.f29011v.f29037m.setVisibility(0);
        this.f29011v.f29039o.setData(searchHistoryResponse.getData().getHistory());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m44906a(CharSequence charSequence) throws Exception {
        m44907a(charSequence.toString());
    }

    /* renamed from: a */
    private void m44907a(String str) {
        String str2;
        C13479a.m54772d("SearchHomeFragment", "textChangeSearch");
        int i = 0;
        this.f28885l.setMain_page_option(0);
        this.f29013x = this.f29010u;
        this.f29010u = str;
        if (TextUtils.isEmpty(str)) {
            C10820e.m44875a().mo40919c();
        }
        if (!this.f28891r) {
            if (TextUtils.isEmpty(this.f29010u)) {
                str2 = "none";
            } else {
                str2 = "search";
            }
            this.f28890q = str2;
        }
        this.f28891r = false;
        if (this.f28883j) {
            this.f28887n.f29061a = this.f29010u.trim();
            ImageView imageView = this.f29011v.f29029e;
            if (TextUtils.isEmpty(this.f29010u)) {
                i = 8;
            }
            imageView.setVisibility(i);
            mo40943v();
        } else if (TextUtils.isEmpty(this.f29010u)) {
            if (this.f28879f) {
                this.f29011v.mo40948a();
            } else {
                this.f28887n.f29061a = "";
                mo40943v();
            }
            this.f29011v.f29029e.setVisibility(8);
            if (!this.f28881h) {
                this.f28878e.mo40845d();
            }
            if (this.f28878e.f28916h.mo41406c()) {
                mo40831h();
            }
            this.f29011v.mo40950a(getResources(), true);
            this.f28881h = true;
        } else {
            this.f28887n.f29061a = this.f29010u.trim();
            this.f29011v.f29029e.setVisibility(0);
            mo40943v();
            this.f28885l.setQuery(this.f28887n.f29061a);
        }
    }

    @Override // com.bytedance.ee.bear.search.AbstractC10782a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo40941t();
        mo41437C();
        mo40820b();
        m44899E();
    }

    /* renamed from: a */
    public static C10825h m44902a(String str, String str2) {
        C10825h hVar = new C10825h();
        Bundle bundle = new Bundle();
        bundle.putString("KEY_SEARCH_KEYWORD", str);
        bundle.putString("KEY_SEARCH_SOURCE", str2);
        hVar.setArguments(bundle);
        return hVar;
    }

    /* renamed from: a */
    private boolean m44909a(int i, boolean z) {
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

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_search_home, viewGroup, false);
        this.f29015z = inflate;
        this.f29011v = new C10835a(inflate);
        Bundle arguments = getArguments();
        if (arguments == null) {
            return this.f29015z;
        }
        this.f29010u = arguments.getString("KEY_SEARCH_KEYWORD");
        this.f29014y = arguments.getString("KEY_SEARCH_SOURCE");
        this.f28876c.getSearchHistory(mo40838q());
        return this.f29015z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m44910a(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return true;
        }
        this.f28885l.setMain_page_option(0);
        this.f28887n.f29061a = this.f29011v.f29027c.getText().toString().trim();
        mo40943v();
        mo40831h();
        mo40836o();
        return true;
    }

    /* renamed from: a */
    public void mo40939a(int i, int i2, SearchHistoryResponse.SearchHistory searchHistory) {
        C13479a.m54764b("SearchHomeFragment", "goToSubPage()... mSearchType = " + this.f28886m);
        Intent intent = new Intent(getContext(), SearchSubActivity.class);
        intent.putExtra("KEY_SEARCH_SUB_PAGE_TYPE", i);
        intent.putExtra("KEY_SEARCH_KEYWORD", this.f28887n.f29061a);
        intent.putExtra("KEY_SEARCH_SOURCE", this.f29014y);
        intent.putExtra("KEY_FROM_LARK", this.f29009D);
        intent.putExtra("KEY_SEARCH_OBJ_TYPE", i2);
        intent.putExtra("KEY_SEARCH_HISTORY", searchHistory);
        if (this.f28886m == 1) {
            intent.putExtra(ShareHitPoint.f121869d, "wiki");
        }
        startActivity(intent);
    }
}
