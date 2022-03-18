package com.ss.android.lark.search.impl.func.chatinside.detail.p2613d;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.constant.SearchConstants;
import com.ss.android.lark.search.impl.entity.viewdata.filter.SearchFilterViewData;
import com.ss.android.lark.search.impl.func.chatinside.cache.ChatInsideFilterCacheBean;
import com.ss.android.lark.search.impl.func.chatinside.detail.base.BaseChatInsideSearchView;
import com.ss.android.lark.search.impl.func.chatinside.view.dialog.DialogC53534b;
import com.ss.android.lark.search.impl.func.chatinside.view.filter.AbstractC53542d;
import com.ss.android.lark.search.impl.func.chatinside.view.filter.C53537a;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.d.b */
public class C53478b extends BaseChatInsideSearchView implements AbstractC53485g {

    /* renamed from: d */
    private RecyclerView f132128d;

    /* renamed from: e */
    private TextView f132129e;

    /* renamed from: f */
    private DialogC53534b f132130f;

    /* renamed from: g */
    private Map<String, AbstractC53542d> f132131g = new HashMap();

    /* renamed from: h */
    private C53537a f132132h;

    /* renamed from: i */
    private AbstractC53479a f132133i;

    /* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.d.b$a */
    public interface AbstractC53479a extends BaseChatInsideSearchView.AbstractC53442a {
        /* renamed from: a */
        void mo182600a(Context context, String str);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.BaseChatInsideSearchView
    /* renamed from: a */
    public void mo182467a() {
        m207110l();
    }

    /* renamed from: l */
    private void m207110l() {
        m207111m();
        m207112n();
        m207113o();
    }

    /* renamed from: o */
    private void m207113o() {
        this.f132129e.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.p2613d.$$Lambda$b$fEDm7tCxuUakqRjdC82qni5P8r4 */

            public final void onClick(View view) {
                C53478b.this.m207105a((C53478b) view);
            }
        });
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.BaseChatInsideSearchView
    /* renamed from: d */
    public void mo182470d() {
        super.mo182470d();
        this.mDefaultIV.setImageResource(R.drawable.illustration_empty_neutral_no_cloud_document);
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.BaseChatInsideSearchView, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f132046c = null;
        this.f132133i = null;
    }

    /* renamed from: k */
    private void m207109k() {
        this.f132131g.put("chat_inside_search_space/filter/owner", new AbstractC53542d() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.p2613d.$$Lambda$b$vr2veTWAYOWe1e3Gocq0xXXiomk */

            @Override // com.ss.android.lark.search.impl.func.chatinside.view.filter.AbstractC53542d
            public final void onFilterClick() {
                C53478b.this.m207116r();
            }
        });
        this.f132131g.put("chat_inside_search_space/filter/type", new AbstractC53542d() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.p2613d.$$Lambda$b$1bK19LDXO7TyPfwB4EWoWPJ87o */

            @Override // com.ss.android.lark.search.impl.func.chatinside.view.filter.AbstractC53542d
            public final void onFilterClick() {
                C53478b.this.m207115q();
            }
        });
    }

    /* renamed from: p */
    private List<SearchFilterViewData> m207114p() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m207107b("chat_inside_search_space/filter/owner"));
        arrayList.add(m207107b("chat_inside_search_space/filter/type"));
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: q */
    private void m207115q() {
        if (this.f132130f == null) {
            DialogC53534b bVar = new DialogC53534b(this.f132044a);
            this.f132130f = bVar;
            bVar.mo182766a(new DialogC53534b.AbstractC53535a() {
                /* class com.ss.android.lark.search.impl.func.chatinside.detail.p2613d.$$Lambda$b$AYPsnsdx0FEoP5U0deAcQX5yDSM */

                @Override // com.ss.android.lark.search.impl.func.chatinside.view.dialog.DialogC53534b.AbstractC53535a
                public final void onPick(SearchConstants.SpaceType spaceType) {
                    C53478b.this.m207106a((C53478b) spaceType);
                }
            });
        }
        this.f132130f.show();
    }

    /* renamed from: j */
    public void mo182572j() {
        this.f132132h.resetAll(m207114p());
        this.f132129e.setVisibility(8);
    }

    /* renamed from: m */
    private void m207111m() {
        View inflate = LayoutInflater.from(this.f132044a).inflate(R.layout.view_chat_inside_filter_space, (ViewGroup) this.mFilterFL, false);
        this.f132128d = (RecyclerView) inflate.findViewById(R.id.filter_space_rv);
        this.f132129e = (TextView) inflate.findViewById(R.id.filter_space_reset_tv);
        this.mFilterFL.addView(inflate);
        this.mFilterFL.setVisibility(0);
    }

    /* renamed from: n */
    private void m207112n() {
        this.f132128d.setLayoutManager(new LinearLayoutManager(this.f132044a, 0, false));
        C53537a aVar = new C53537a();
        this.f132132h = aVar;
        aVar.mo182771a(new C53537a.AbstractC53539a() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.p2613d.$$Lambda$b$kEXdL6qeTMG4fOXG6OxTNY70fTk */

            @Override // com.ss.android.lark.search.impl.func.chatinside.view.filter.C53537a.AbstractC53539a
            public final void onItemClick(String str) {
                C53478b.this.m207108c(str);
            }
        });
        this.f132128d.setAdapter(this.f132132h);
        this.f132132h.addAll(m207114p());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: r */
    private /* synthetic */ void m207116r() {
        BaseFragment baseFragment;
        if (this.f132046c instanceof C53480c) {
            if (this.f132045b.getParentFragment() instanceof BaseFragment) {
                baseFragment = (BaseFragment) this.f132045b.getParentFragment();
            } else {
                baseFragment = this.f132045b;
            }
            ((C53480c) this.f132046c).mo182601a(baseFragment, 162);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m207105a(View view) {
        if (this.f132046c instanceof C53480c) {
            ((C53480c) this.f132046c).mo182603i();
        }
    }

    /* renamed from: b */
    private SearchFilterViewData m207107b(String str) {
        SearchFilterViewData searchFilterViewData = new SearchFilterViewData();
        searchFilterViewData.mo182350a(str);
        return searchFilterViewData;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m207108c(String str) {
        AbstractC53542d dVar = this.f132131g.get(str);
        if (dVar == null) {
            Log.m165383e("LarkSearch.Search.ChatSearchSpace", "filter type is unknown");
        } else {
            dVar.onFilterClick();
        }
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.view.filter.AbstractC53541c
    /* renamed from: b */
    public void mo182571b(List<Bitmap> list) {
        SearchFilterViewData searchFilterViewData = (SearchFilterViewData) this.f132132h.getItem(0);
        searchFilterViewData.mo182351a(list);
        searchFilterViewData.mo182353c();
        this.f132132h.notifyItemChanged(searchFilterViewData);
        this.f132129e.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m207106a(SearchConstants.SpaceType spaceType) {
        SearchFilterViewData searchFilterViewData = (SearchFilterViewData) this.f132132h.getItem(1);
        searchFilterViewData.mo182349a(spaceType);
        this.f132132h.notifyItemChanged(searchFilterViewData);
        this.f132129e.setVisibility(0);
        if (this.f132046c instanceof C53480c) {
            ((C53480c) this.f132046c).mo182602a(spaceType);
        }
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.view.filter.AbstractC53541c
    /* renamed from: a */
    public void mo182568a(int i) {
        if (i == 3) {
            SearchFilterViewData searchFilterViewData = (SearchFilterViewData) this.f132132h.getItem(0);
            searchFilterViewData.mo182352b();
            this.f132132h.notifyItemChanged(searchFilterViewData);
        } else if (i == 4) {
            SearchFilterViewData b = m207107b("chat_inside_search_space/filter/type");
            b.mo182348a((Pair<Date, Date>) null);
            this.f132132h.notifyItemChanged(b);
        }
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.view.filter.AbstractC53541c
    /* renamed from: a */
    public void mo182569a(ChatInsideFilterCacheBean aVar) {
        C53537a aVar2 = this.f132132h;
        if (aVar2 != null) {
            SearchFilterViewData searchFilterViewData = (SearchFilterViewData) aVar2.getItem(1);
            if (aVar.mo182427c() != null) {
                searchFilterViewData.mo182349a(aVar.mo182427c());
                this.f132132h.notifyItemChanged(searchFilterViewData);
                this.f132129e.setVisibility(0);
            }
        }
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.view.filter.AbstractC53541c
    /* renamed from: a */
    public void mo182570a(boolean z) {
        if (z) {
            this.f132129e.setVisibility(8);
            return;
        }
        this.f132129e.setEnabled(true);
        this.f132129e.setVisibility(0);
        this.f132129e.setTextColor(UIUtils.getColor(this.f132044a, R.color.lkui_B500));
    }

    /* renamed from: a */
    public void mo182599a(Context context, String str) {
        AbstractC53479a aVar = this.f132133i;
        if (aVar != null) {
            aVar.mo182600a(context, str);
        }
    }

    public C53478b(BaseFragment baseFragment, AbstractC53479a aVar) {
        super(baseFragment, aVar);
        m207109k();
        this.f132133i = aVar;
    }
}
