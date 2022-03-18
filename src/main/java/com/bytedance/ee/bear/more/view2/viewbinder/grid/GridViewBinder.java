package com.bytedance.ee.bear.more.view2.viewbinder.grid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.LinearLayoutManagerWrapper;
import com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem;
import com.bytedance.ee.bear.more.view2.viewbinder.BaseMoreItemViewHolder;
import com.larksuite.suite.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\fB\u001d\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/more/view2/viewbinder/grid/GridViewBinder;", "Lcom/bytedance/ee/bear/more/view2/viewbinder/IMoreViewBinder;", "Lcom/bytedance/ee/bear/more/moreprotocol/IGridMoreItem;", "Lcom/bytedance/ee/bear/more/view2/viewbinder/grid/GridViewBinder$GridMoreItemViewHolder;", "moreItemList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/more/moreprotocol/IBaseMoreItem;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "GridMoreItemViewHolder", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.more.view2.b.c.b */
public final class GridViewBinder {

    /* renamed from: a */
    public final ArrayList<IBaseMoreItem> f27708a;

    public GridViewBinder(ArrayList<IBaseMoreItem> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "moreItemList");
        this.f27708a = arrayList;
    }

    /* renamed from: a */
    public GridMoreItemViewHolder mo39230a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.more_item_grid, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new GridMoreItemViewHolder(this, inflate);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J,\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00010\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/more/view2/viewbinder/grid/GridViewBinder$GridMoreItemViewHolder;", "Lcom/bytedance/ee/bear/more/view2/viewbinder/BaseMoreItemViewHolder;", "Lcom/bytedance/ee/bear/more/moreprotocol/IGridMoreItem;", "itemView", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/more/view2/viewbinder/grid/GridViewBinder;Landroid/view/View;)V", "onBindViewHolder", "", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bytedance/ee/bear/more/moreprotocol/IBaseMoreItem;", "moreItem", "posInGroup", "", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.view2.b.c.b$a */
    public final class GridMoreItemViewHolder extends BaseMoreItemViewHolder<IGridMoreItem> {

        /* renamed from: a */
        final /* synthetic */ GridViewBinder f27709a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GridMoreItemViewHolder(GridViewBinder bVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f27709a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$Adapter, com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem, int] */
        @Override // com.bytedance.ee.bear.more.view2.viewbinder.BaseMoreItemViewHolder
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo39217a(RecyclerView.Adapter adapter, IGridMoreItem iGridMoreItem, int i) {
            mo39231a((RecyclerView.Adapter<BaseMoreItemViewHolder<IBaseMoreItem>>) adapter, iGridMoreItem, i);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v11, resolved type: com.bytedance.ee.bear.more.view2.b.c.a */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public void mo39231a(RecyclerView.Adapter<BaseMoreItemViewHolder<IBaseMoreItem>> adapter, IGridMoreItem iGridMoreItem, int i) {
            Intrinsics.checkParameterIsNotNull(adapter, "adapter");
            Intrinsics.checkParameterIsNotNull(iGridMoreItem, "moreItem");
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.gridRecycler);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "itemView.gridRecycler");
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            recyclerView.setLayoutManager(new LinearLayoutManagerWrapper(view2.getContext(), 0, false));
            View view3 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            ((RecyclerView) view3.findViewById(R.id.gridRecycler)).addItemDecoration(new MoreItemDecoration());
            View view4 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
            RecyclerView recyclerView2 = (RecyclerView) view4.findViewById(R.id.gridRecycler);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "itemView.gridRecycler");
            recyclerView2.setNestedScrollingEnabled(false);
            GridItemAdapter aVar = new GridItemAdapter();
            ArrayList<IBaseMoreItem> arrayList = this.f27709a.f27708a;
            if (arrayList != null) {
                aVar.mo39227a(arrayList);
                View view5 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
                RecyclerView recyclerView3 = (RecyclerView) view5.findViewById(R.id.gridRecycler);
                Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "itemView.gridRecycler");
                recyclerView3.setAdapter(aVar);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem> /* = java.util.ArrayList<com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem> */");
        }
    }
}
