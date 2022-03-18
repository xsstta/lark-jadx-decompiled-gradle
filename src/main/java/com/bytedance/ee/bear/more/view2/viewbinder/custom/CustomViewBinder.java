package com.bytedance.ee.bear.more.view2.viewbinder.custom;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.ICustomMoreItem;
import com.bytedance.ee.bear.more.view2.viewbinder.BaseMoreItemViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\tB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0002\u0010\u0005J\u0014\u0010\u0006\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/more/view2/viewbinder/custom/CustomViewBinder;", "Lcom/bytedance/ee/bear/more/view2/viewbinder/IMoreViewBinder;", "Lcom/bytedance/ee/bear/more/moreprotocol/ICustomMoreItem;", "Lcom/bytedance/ee/bear/more/view2/viewbinder/custom/CustomViewBinder$CustomViewHolder;", "moreItem", "(Lcom/bytedance/ee/bear/more/moreprotocol/ICustomMoreItem;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "CustomViewHolder", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.more.view2.b.a.a */
public final class CustomViewBinder {

    /* renamed from: a */
    private final ICustomMoreItem f27694a;

    public CustomViewBinder(ICustomMoreItem iCustomMoreItem) {
        Intrinsics.checkParameterIsNotNull(iCustomMoreItem, "moreItem");
        this.f27694a = iCustomMoreItem;
    }

    /* renamed from: a */
    public CustomViewHolder mo39219a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return new CustomViewHolder(this, this.f27694a.getItemView(viewGroup));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J,\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00010\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/more/view2/viewbinder/custom/CustomViewBinder$CustomViewHolder;", "Lcom/bytedance/ee/bear/more/view2/viewbinder/BaseMoreItemViewHolder;", "Lcom/bytedance/ee/bear/more/moreprotocol/ICustomMoreItem;", "itemView", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/more/view2/viewbinder/custom/CustomViewBinder;Landroid/view/View;)V", "onBindViewHolder", "", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bytedance/ee/bear/more/moreprotocol/IBaseMoreItem;", "moreItem", "position", "", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.view2.b.a.a$a */
    public final class CustomViewHolder extends BaseMoreItemViewHolder<ICustomMoreItem> {

        /* renamed from: a */
        final /* synthetic */ CustomViewBinder f27695a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CustomViewHolder(CustomViewBinder aVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f27695a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$Adapter, com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem, int] */
        @Override // com.bytedance.ee.bear.more.view2.viewbinder.BaseMoreItemViewHolder
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo39217a(RecyclerView.Adapter adapter, ICustomMoreItem iCustomMoreItem, int i) {
            mo39220a((RecyclerView.Adapter<BaseMoreItemViewHolder<IBaseMoreItem>>) adapter, iCustomMoreItem, i);
        }

        /* renamed from: a */
        public void mo39220a(RecyclerView.Adapter<BaseMoreItemViewHolder<IBaseMoreItem>> adapter, ICustomMoreItem iCustomMoreItem, int i) {
            Intrinsics.checkParameterIsNotNull(adapter, "adapter");
            Intrinsics.checkParameterIsNotNull(iCustomMoreItem, "moreItem");
            iCustomMoreItem.onBindViewHolder(this, i);
        }
    }
}
