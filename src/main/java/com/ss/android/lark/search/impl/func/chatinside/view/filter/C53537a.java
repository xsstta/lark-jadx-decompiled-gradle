package com.ss.android.lark.search.impl.func.chatinside.view.filter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.search.impl.entity.viewdata.filter.SearchFilterViewData;
import com.ss.android.lark.search.impl.func.chatinside.view.filter.viewholder.C53544b;
import com.ss.android.lark.search.impl.func.chatinside.view.filter.viewholder.SearchFilterViewHolder;
import com.ss.android.lark.widget.listener.OnSingleClickListener;

/* renamed from: com.ss.android.lark.search.impl.func.chatinside.view.filter.a */
public class C53537a extends LarkRecyclerViewBaseAdapter<SearchFilterViewHolder, SearchFilterViewData> {

    /* renamed from: a */
    public AbstractC53539a f132259a;

    /* renamed from: b */
    private C53544b f132260b;

    /* renamed from: com.ss.android.lark.search.impl.func.chatinside.view.filter.a$a */
    public interface AbstractC53539a {
        void onItemClick(String str);
    }

    public C53537a() {
        m207330a();
    }

    /* renamed from: a */
    private void m207330a() {
        this.f132260b = new C53544b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter
    public int getItemCount() {
        return super.getItemCount();
    }

    /* renamed from: a */
    public void mo182771a(AbstractC53539a aVar) {
        this.f132259a = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter
    public long getItemId(int i) {
        return (long) ((SearchFilterViewData) getItem(i)).mo182354d().hashCode();
    }

    /* renamed from: a */
    private void m207331a(SearchFilterViewData searchFilterViewData, SearchFilterViewHolder searchFilterViewHolder) {
        this.f132260b.mo182774a(searchFilterViewData, searchFilterViewHolder);
    }

    /* renamed from: a */
    public SearchFilterViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new SearchFilterViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_search_filter, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(SearchFilterViewHolder searchFilterViewHolder, int i) {
        final SearchFilterViewData searchFilterViewData = (SearchFilterViewData) getItem(i);
        searchFilterViewHolder.mSearchFilterHeaderHolder.setVisibility(8);
        searchFilterViewHolder.mSearchFilterFooterHolder.setVisibility(8);
        m207331a(searchFilterViewData, searchFilterViewHolder);
        searchFilterViewHolder.mSearchFilterView.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.search.impl.func.chatinside.view.filter.C53537a.C535381 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (C53537a.this.f132259a != null) {
                    C53537a.this.f132259a.onItemClick(searchFilterViewData.mo182354d());
                }
            }
        });
    }
}
