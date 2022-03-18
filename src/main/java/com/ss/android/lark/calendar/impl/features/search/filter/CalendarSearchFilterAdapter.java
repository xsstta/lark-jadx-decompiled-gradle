package com.ss.android.lark.calendar.impl.features.search.filter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u001e\u0010\u0012\u001a\u00020\u000b2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/filter/CalendarSearchFilterAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/calendar/impl/features/search/filter/SearchFilterViewHolder;", "()V", "mData", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/search/filter/SearchFilterData;", "Lkotlin/collections/ArrayList;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "list", "Companion", "OnItemClickListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.search.filter.a */
public final class CalendarSearchFilterAdapter extends RecyclerView.Adapter<SearchFilterViewHolder> {

    /* renamed from: a */
    public static final Companion f82887a = new Companion(null);

    /* renamed from: b */
    private final ArrayList<SearchFilterData> f82888b = new ArrayList<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/filter/CalendarSearchFilterAdapter$Companion;", "", "()V", "SHOW_BITMAP_MAX_COUNT", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.filter.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f82888b.size();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.filter.a$b */
    public static final class View$OnClickListenerC32356b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchFilterData f82889a;

        View$OnClickListenerC32356b(SearchFilterData bVar) {
            this.f82889a = bVar;
        }

        public final void onClick(View view) {
            this.f82889a.mo118207e().invoke();
        }
    }

    /* renamed from: a */
    public final void mo118198a(ArrayList<SearchFilterData> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "list");
        this.f82888b.clear();
        this.f82888b.addAll(arrayList);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public SearchFilterViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return new SearchFilterViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.calendar_item_search_filter, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(SearchFilterViewHolder searchFilterViewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(searchFilterViewHolder, "holder");
        SearchFilterData bVar = this.f82888b.get(i);
        Intrinsics.checkExpressionValueIsNotNull(bVar, "mData[position]");
        SearchFilterData bVar2 = bVar;
        searchFilterViewHolder.mSearchFilterView.setOnClickListener(new View$OnClickListenerC32356b(bVar2));
        String a = bVar2.mo118200a();
        if (bVar2.mo118205c() != -1) {
            a = a + '(' + bVar2.mo118205c() + ')';
        }
        if (bVar2.mo118204b()) {
            searchFilterViewHolder.mSearchFilterView.setDisplayIconLimit(3);
            searchFilterViewHolder.mSearchFilterView.mo118189a(a, bVar2.mo118206d());
        } else {
            searchFilterViewHolder.mSearchFilterView.setUnSelectedText(a);
        }
        if (i == 0) {
            View view = searchFilterViewHolder.mSearchFilterHeaderHolder;
            Intrinsics.checkExpressionValueIsNotNull(view, "holder.mSearchFilterHeaderHolder");
            view.setVisibility(0);
            View view2 = searchFilterViewHolder.mSearchFilterFooterHolder;
            Intrinsics.checkExpressionValueIsNotNull(view2, "holder.mSearchFilterFooterHolder");
            view2.setVisibility(8);
        } else if (i == getItemCount() - 1) {
            View view3 = searchFilterViewHolder.mSearchFilterHeaderHolder;
            Intrinsics.checkExpressionValueIsNotNull(view3, "holder.mSearchFilterHeaderHolder");
            view3.setVisibility(8);
            View view4 = searchFilterViewHolder.mSearchFilterFooterHolder;
            Intrinsics.checkExpressionValueIsNotNull(view4, "holder.mSearchFilterFooterHolder");
            view4.setVisibility(0);
        } else {
            View view5 = searchFilterViewHolder.mSearchFilterHeaderHolder;
            Intrinsics.checkExpressionValueIsNotNull(view5, "holder.mSearchFilterHeaderHolder");
            view5.setVisibility(8);
            View view6 = searchFilterViewHolder.mSearchFilterFooterHolder;
            Intrinsics.checkExpressionValueIsNotNull(view6, "holder.mSearchFilterFooterHolder");
            view6.setVisibility(8);
        }
    }
}
