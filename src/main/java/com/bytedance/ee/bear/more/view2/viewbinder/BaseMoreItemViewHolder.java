package com.bytedance.ee.bear.more.view2.viewbinder;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J1\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00000\n2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\rH&¢\u0006\u0002\u0010\u000eJ*\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00000\n2\u0006\u0010\f\u001a\u00020\r¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/more/view2/viewbinder/BaseMoreItemViewHolder;", "T", "Lcom/bytedance/ee/bear/more/moreprotocol/IBaseMoreItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "onBindViewHolder", "", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "moreItem", "position", "", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Lcom/bytedance/ee/bear/more/moreprotocol/IBaseMoreItem;I)V", "onViewSelectorPrepared", "", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.more.view2.b.a */
public abstract class BaseMoreItemViewHolder<T extends IBaseMoreItem> extends RecyclerView.ViewHolder {
    /* renamed from: a */
    public abstract void mo39217a(RecyclerView.Adapter<BaseMoreItemViewHolder<IBaseMoreItem>> adapter, T t, int i);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseMoreItemViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
    }

    /* renamed from: a */
    public final boolean mo39218a(View view, RecyclerView.Adapter<BaseMoreItemViewHolder<IBaseMoreItem>> adapter, int i) {
        boolean z;
        boolean z2;
        int i2;
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(adapter, "adapter");
        boolean z3 = false;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == adapter.getItemCount() - 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            z3 = true;
        }
        if (z3) {
            i2 = R.drawable.facade_round_around_l;
        } else if (z) {
            i2 = R.drawable.facade_round_top_l;
        } else if (z2) {
            i2 = R.drawable.facade_round_bottom_l;
        } else {
            i2 = R.drawable.facade_rectangle;
        }
        view.setBackgroundResource(i2);
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
        view.setBackgroundTintList(context.getResources().getColorStateList(R.color.facade_selector_item_float));
        return z2;
    }
}
