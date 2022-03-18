package com.bytedance.ee.bear.more.view2.viewbinder.grid;

import android.app.Application;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002J(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/more/view2/viewbinder/grid/MoreItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "()V", "itemMinWidth", "", "itemPaddingWidth", "screenWidth", "sidePaddingWidth", "getDimension", "id", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.more.view2.b.c.c */
public final class MoreItemDecoration extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    private final int f27710a = C13749l.m55736a();

    /* renamed from: b */
    private final int f27711b = m42797a(R.dimen.more_item_width);

    /* renamed from: c */
    private final int f27712c = C13749l.m55738a(18);

    /* renamed from: d */
    private final int f27713d = C13749l.m55738a(4);

    /* renamed from: a */
    private final int m42797a(int i) {
        Application application = C13615c.f35773a;
        Intrinsics.checkExpressionValueIsNotNull(application, "ContextUtils.baseApplication");
        return application.getResources().getDimensionPixelSize(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        boolean z;
        int i;
        int i2;
        Intrinsics.checkParameterIsNotNull(rect, "outRect");
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(recyclerView, "parent");
        Intrinsics.checkParameterIsNotNull(state, "state");
        if (recyclerView.getAdapter() != null) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(adapter, "parent.adapter!!");
            int itemCount = adapter.getItemCount();
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            boolean z2 = true;
            if (childAdapterPosition == 0) {
                z = true;
            } else {
                z = false;
            }
            if (childAdapterPosition != itemCount - 1) {
                z2 = false;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i3 = this.f27710a - (this.f27712c * 2);
            if (itemCount <= 3) {
                layoutParams.width = (i3 - (this.f27713d * 4)) / 3;
                view.setLayoutParams(layoutParams);
            } else if (itemCount == 4) {
                layoutParams.width = (i3 - (this.f27713d * 6)) / 4;
                view.setLayoutParams(layoutParams);
            } else {
                layoutParams.width = this.f27711b;
                view.setLayoutParams(layoutParams);
            }
            if (z) {
                i = this.f27712c;
            } else {
                i = this.f27713d;
            }
            if (z2) {
                i2 = this.f27712c;
            } else {
                i2 = this.f27713d;
            }
            rect.set(i, 0, i2, 0);
        }
    }
}
