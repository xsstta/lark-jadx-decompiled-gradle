package com.ss.android.lark.multitask.tasklist;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.ui.p2892a.C57582a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/multitask/tasklist/MultitaskListItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "dividerHeight", "", "typeDividerHeight", "(II)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.multitask.tasklist.c */
public final class MultitaskListItemDecoration extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    private final int f121861a;

    /* renamed from: b */
    private final int f121862b;

    public MultitaskListItemDecoration(int i, int i2) {
        this.f121861a = i;
        this.f121862b = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Intrinsics.checkParameterIsNotNull(rect, "outRect");
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(recyclerView, "parent");
        Intrinsics.checkParameterIsNotNull(state, "state");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition != -1) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter == null) {
                Intrinsics.throwNpe();
            }
            int itemViewType = adapter.getItemViewType(childAdapterPosition);
            if (itemViewType == 1) {
                RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
                if (adapter2 == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(adapter2, "parent.adapter!!");
                if (childAdapterPosition == adapter2.getItemCount() - 1) {
                    rect.set(0, this.f121861a, 0, C57582a.m223601a(recyclerView.getContext(), 56.0f));
                } else {
                    int i = this.f121861a;
                    rect.set(0, i, 0, i);
                }
            }
            if (itemViewType == 0) {
                rect.set(0, this.f121862b, 0, 0);
            }
        }
    }
}
