package com.ss.android.lark.widget.searchfilter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.searchfilter.FilterView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\bJ\u0014\u0010\u0014\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J\u000e\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\bJ\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0013H\u0016J\u0014\u0010\"\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0016J\u000e\u0010#\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006%"}, d2 = {"Lcom/ss/android/lark/widget/searchfilter/FilterAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/widget/searchfilter/FilterAdapter$FilterViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "items", "", "Lcom/ss/android/lark/widget/searchfilter/FilterData;", "onFilterItemClick", "Lcom/ss/android/lark/widget/searchfilter/FilterView$IOnFilterItemClick;", "getOnFilterItemClick", "()Lcom/ss/android/lark/widget/searchfilter/FilterView$IOnFilterItemClick;", "setOnFilterItemClick", "(Lcom/ss/android/lark/widget/searchfilter/FilterView$IOnFilterItemClick;)V", "add", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "index", "", "addAll", "collection", "", "getItemCount", "getItemId", "", "position", "itemPosition", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "resetAll", "update", "FilterViewHolder", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.searchfilter.a */
public final class FilterAdapter extends RecyclerView.Adapter<FilterViewHolder> {

    /* renamed from: a */
    private final List<FilterData> f146614a = new ArrayList();

    /* renamed from: b */
    private FilterView.IOnFilterItemClick f146615b;

    /* renamed from: c */
    private final Context f146616c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0004¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/widget/searchfilter/FilterAdapter$FilterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "filterViewItem", "Lcom/ss/android/lark/widget/searchfilter/SearchFilterView;", "getFilterViewItem", "()Lcom/ss/android/lark/widget/searchfilter/SearchFilterView;", "setFilterViewItem", "(Lcom/ss/android/lark/widget/searchfilter/SearchFilterView;)V", "filterViewItemPlaceHolder", "getFilterViewItemPlaceHolder", "()Landroid/view/View;", "setFilterViewItemPlaceHolder", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.searchfilter.a$a */
    public static final class FilterViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private SearchFilterView f146617a;

        /* renamed from: b */
        private View f146618b;

        /* renamed from: a */
        public final SearchFilterView mo200841a() {
            return this.f146617a;
        }

        /* renamed from: b */
        public final View mo200842b() {
            return this.f146618b;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FilterViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            View findViewById = view.findViewById(R.id.filter_view_item);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.filter_view_item)");
            this.f146617a = (SearchFilterView) findViewById;
            View findViewById2 = view.findViewById(R.id.filter_view_item_placeholder);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.…er_view_item_placeholder)");
            this.f146618b = findViewById2;
        }
    }

    /* renamed from: a */
    public final FilterView.IOnFilterItemClick mo200833a() {
        return this.f146615b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f146614a.size();
    }

    /* renamed from: a */
    public final void mo200835a(FilterView.IOnFilterItemClick bVar) {
        this.f146615b = bVar;
    }

    /* renamed from: b */
    public final int mo200839b(FilterData bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return this.f146614a.indexOf(bVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return (long) this.f146614a.get(i).hashCode();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/widget/searchfilter/FilterAdapter$onBindViewHolder$1$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.searchfilter.a$b */
    public static final class C59116b extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ FilterData f146619a;

        /* renamed from: b */
        final /* synthetic */ FilterAdapter f146620b;

        /* renamed from: c */
        final /* synthetic */ FilterViewHolder f146621c;

        /* renamed from: d */
        final /* synthetic */ int f146622d;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            FilterView.IOnFilterItemClick a = this.f146620b.mo200833a();
            if (a != null) {
                a.mo41007a(this.f146619a);
            }
        }

        C59116b(FilterData bVar, FilterAdapter aVar, FilterViewHolder aVar2, int i) {
            this.f146619a = bVar;
            this.f146620b = aVar;
            this.f146621c = aVar2;
            this.f146622d = i;
        }
    }

    public FilterAdapter(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f146616c = context;
        setHasStableIds(true);
    }

    /* renamed from: b */
    public final void mo200840b(Collection<? extends FilterData> collection) {
        Intrinsics.checkParameterIsNotNull(collection, "collection");
        this.f146614a.clear();
        if (!collection.isEmpty()) {
            this.f146614a.addAll(collection);
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo200837a(FilterData bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        int indexOf = this.f146614a.indexOf(bVar);
        if (indexOf >= 0 && indexOf < this.f146614a.size()) {
            notifyItemChanged(indexOf);
        }
    }

    /* renamed from: a */
    public final void mo200838a(Collection<? extends FilterData> collection) {
        Intrinsics.checkParameterIsNotNull(collection, "collection");
        if (!collection.isEmpty()) {
            this.f146614a.addAll(collection);
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public FilterViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f146616c).inflate(R.layout.filter_view_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…view_item, parent, false)");
        return new FilterViewHolder(inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(FilterViewHolder aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        FilterData bVar = this.f146614a.get(i);
        if (bVar.mo200845e()) {
            aVar.mo200841a().mo200827a(bVar.mo200847f(), bVar.mo200848g());
        } else {
            aVar.mo200841a().setUnSelectedText(bVar.mo200847f());
        }
        aVar.itemView.setOnClickListener(new C59116b(bVar, this, aVar, i));
        if (i == getItemCount() - 1) {
            aVar.mo200842b().setVisibility(0);
        } else {
            aVar.mo200842b().setVisibility(8);
        }
    }
}
