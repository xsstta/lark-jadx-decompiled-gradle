package com.ss.android.lark.ug.banner.ui.template;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/ug/banner/ui/template/SpaceItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "start", "", "space", "end", "(III)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "ug-banner-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.banner.ui.template.c */
public final class SpaceItemDecoration extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    private final int f141316a;

    /* renamed from: b */
    private final int f141317b;

    /* renamed from: c */
    private final int f141318c;

    public SpaceItemDecoration(int i, int i2, int i3) {
        this.f141316a = i;
        this.f141317b = i2;
        this.f141318c = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int i;
        int i2;
        int i3;
        Intrinsics.checkParameterIsNotNull(rect, "outRect");
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(recyclerView, "parent");
        Intrinsics.checkParameterIsNotNull(state, "state");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            i = adapter.getItemCount();
        } else {
            i = 0;
        }
        if (childAdapterPosition < i) {
            rect.top = 0;
            if (childAdapterPosition == 1) {
                i2 = this.f141316a;
            } else {
                i2 = this.f141317b;
            }
            rect.left = i2;
            if (childAdapterPosition == i - 1) {
                i3 = this.f141318c;
            } else {
                i3 = 0;
            }
            rect.right = i3;
            rect.bottom = 0;
            return;
        }
        super.getItemOffsets(rect, view, recyclerView, state);
    }
}
