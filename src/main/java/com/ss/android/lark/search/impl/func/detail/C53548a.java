package com.ss.android.lark.search.impl.func.detail;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.impl.binder.C53355c;
import com.ss.android.lark.search.impl.entity.viewdata.SearchBaseViewData;
import com.ss.android.lark.search.impl.hitpoint.onscreen.OnScreenItem;
import com.ss.android.lark.search.impl.hitpoint.onscreen.OnScreenReporter;
import com.ss.android.lark.search.impl.p2592b.p2594b.AbstractC53343b;
import com.ss.android.lark.searchcommon.utils.SearchCommonUtils;
import com.ss.android.lark.utils.C57859q;

/* renamed from: com.ss.android.lark.search.impl.func.detail.a */
public class C53548a extends LarkRecyclerViewBaseAdapter<RecyclerView.ViewHolder, SearchBaseViewData> {

    /* renamed from: a */
    public AbstractC53550a f132267a;

    /* renamed from: b */
    private C53355c f132268b;

    /* renamed from: c */
    private int f132269c;

    /* renamed from: d */
    private AbstractC53343b<SearchBaseViewData> f132270d = new AbstractC53343b<SearchBaseViewData>() {
        /* class com.ss.android.lark.search.impl.func.detail.C53548a.C535491 */

        @Override // com.ss.android.lark.search.impl.p2592b.p2594b.AbstractC53343b
        /* renamed from: a */
        public /* synthetic */ void mo181982a(SearchBaseViewData searchBaseViewData, boolean z) {
            AbstractC53343b.CC.$default$a(this, searchBaseViewData, z);
        }

        @Override // com.ss.android.lark.search.impl.p2592b.p2594b.AbstractC53343b
        /* renamed from: a */
        public void mo181980a(SearchBaseViewData searchBaseViewData, int i) {
            if (C53548a.this.f132267a != null) {
                C53548a.this.f132267a.mo182785a(searchBaseViewData, i);
            }
        }

        @Override // com.ss.android.lark.search.impl.p2592b.p2594b.AbstractC53343b
        /* renamed from: a */
        public void mo181981a(SearchBaseViewData searchBaseViewData, int i, String str) {
            if (C53548a.this.f132267a != null) {
                C53548a.this.f132267a.mo182786a(searchBaseViewData, i, str);
            }
        }
    };

    /* renamed from: e */
    private OnScreenReporter f132271e;

    /* renamed from: com.ss.android.lark.search.impl.func.detail.a$a */
    public interface AbstractC53550a {
        /* renamed from: a */
        void mo182785a(SearchBaseViewData searchBaseViewData, int i);

        /* renamed from: a */
        void mo182786a(SearchBaseViewData searchBaseViewData, int i, String str);
    }

    /* renamed from: a */
    public void mo182782a(OnScreenReporter bVar) {
        this.f132271e = bVar;
    }

    /* renamed from: a */
    public void mo182783a(AbstractC53550a aVar) {
        this.f132267a = aVar;
    }

    /* renamed from: a */
    public void mo182784a(boolean z) {
        this.f132268b.mo181998a(z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return ((SearchBaseViewData) super.getItem(i)).getSearchResultType();
    }

    public C53548a(Context context) {
        this.f132268b = new C53355c(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.f132268b.mo181995a(i, viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int searchResultType;
        SearchBaseViewData searchBaseViewData = (SearchBaseViewData) getItem(i);
        if (this.f132269c == 0) {
            this.f132269c = searchBaseViewData.getSearchResultType();
        }
        this.f132268b.mo181997a(viewHolder, searchBaseViewData, this.f132270d, i);
        if (this.f132271e != null && (searchResultType = searchBaseViewData.getSearchResultType()) != 10000002 && searchResultType != 10000003 && searchResultType != 10000005) {
            Log.m165379d("LarkSearch.Search.SearchDetailAdapter", "add onScreen report data.");
            String id = searchBaseViewData.getId();
            if (searchResultType == 1 || searchResultType == 15 || searchResultType == 6) {
                id = C57859q.m224565a(id);
            }
            int i2 = i + 1;
            this.f132271e.mo182046a(new OnScreenItem(searchBaseViewData.getScene(), searchBaseViewData.getImprId(), searchBaseViewData.getSession(), searchBaseViewData.getRequestId(), id, SearchCommonUtils.m209226a(searchResultType), Integer.valueOf(i2), Integer.valueOf(i2), ""));
        }
    }
}
