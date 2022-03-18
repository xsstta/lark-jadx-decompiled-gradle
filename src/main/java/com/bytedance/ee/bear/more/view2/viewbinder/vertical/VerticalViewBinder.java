package com.bytedance.ee.bear.more.view2.viewbinder.vertical;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.LinearLayoutManagerWrapper;
import com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem;
import com.bytedance.ee.bear.more.view2.viewbinder.BaseMoreItemViewHolder;
import com.larksuite.suite.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u000bB\u001d\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0005j\b\u0012\u0004\u0012\u00020\u0002`\u0006¢\u0006\u0002\u0010\u0007J\u0014\u0010\b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\t\u001a\u00020\nH\u0016R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0005j\b\u0012\u0004\u0012\u00020\u0002`\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/more/view2/viewbinder/vertical/VerticalViewBinder;", "Lcom/bytedance/ee/bear/more/view2/viewbinder/IMoreViewBinder;", "Lcom/bytedance/ee/bear/more/moreprotocol/IBaseMoreItem;", "Lcom/bytedance/ee/bear/more/view2/viewbinder/vertical/VerticalViewBinder$VerticalMoreItemViewHolder;", "moreItemList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "VerticalMoreItemViewHolder", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.more.view2.b.f.b */
public final class VerticalViewBinder {

    /* renamed from: a */
    public final ArrayList<IBaseMoreItem> f27727a;

    public VerticalViewBinder(ArrayList<IBaseMoreItem> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "moreItemList");
        this.f27727a = arrayList;
    }

    /* renamed from: a */
    public VerticalMoreItemViewHolder mo39241a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.more_item_vertical, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new VerticalMoreItemViewHolder(this, inflate);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J,\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/more/view2/viewbinder/vertical/VerticalViewBinder$VerticalMoreItemViewHolder;", "Lcom/bytedance/ee/bear/more/view2/viewbinder/BaseMoreItemViewHolder;", "Lcom/bytedance/ee/bear/more/moreprotocol/IBaseMoreItem;", "itemView", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/more/view2/viewbinder/vertical/VerticalViewBinder;Landroid/view/View;)V", "onBindViewHolder", "", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "moreItem", "posInGroup", "", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.view2.b.f.b$a */
    public final class VerticalMoreItemViewHolder extends BaseMoreItemViewHolder<IBaseMoreItem> {

        /* renamed from: a */
        final /* synthetic */ VerticalViewBinder f27728a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public VerticalMoreItemViewHolder(VerticalViewBinder bVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f27728a = bVar;
        }

        @Override // com.bytedance.ee.bear.more.view2.viewbinder.BaseMoreItemViewHolder
        /* renamed from: a */
        public void mo39217a(RecyclerView.Adapter<BaseMoreItemViewHolder<IBaseMoreItem>> adapter, IBaseMoreItem iBaseMoreItem, int i) {
            Intrinsics.checkParameterIsNotNull(adapter, "adapter");
            Intrinsics.checkParameterIsNotNull(iBaseMoreItem, "moreItem");
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.verticalRecycler);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "itemView.verticalRecycler");
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            recyclerView.setLayoutManager(new LinearLayoutManagerWrapper(view2.getContext()));
            View view3 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            RecyclerView recyclerView2 = (RecyclerView) view3.findViewById(R.id.verticalRecycler);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "itemView.verticalRecycler");
            recyclerView2.setNestedScrollingEnabled(false);
            VerticalItemAdapter aVar = new VerticalItemAdapter();
            aVar.mo39240a(this.f27728a.f27727a);
            View view4 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
            RecyclerView recyclerView3 = (RecyclerView) view4.findViewById(R.id.verticalRecycler);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "itemView.verticalRecycler");
            recyclerView3.setAdapter(aVar);
        }
    }
}
