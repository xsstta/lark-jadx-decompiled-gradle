package com.bytedance.ee.bear.quoto;

import android.app.Application;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002J(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/quoto/SingleFileExceedQuotaItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "()V", "itemWidth", "", "screenWidth", "sidePaddingWidth", "getDimension", "id", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "quoto_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.quoto.r */
public final class SingleFileExceedQuotaItemDecoration extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    private final int f28380a = C13749l.m55736a();

    /* renamed from: b */
    private final int f28381b = m43833a(R.dimen.space_kit_len_16);

    /* renamed from: c */
    private final int f28382c = m43833a(R.dimen.space_suite_type_item_width);

    /* renamed from: a */
    private final int m43833a(int i) {
        Application application = C13615c.f35773a;
        Intrinsics.checkExpressionValueIsNotNull(application, "ContextUtils.baseApplication");
        return application.getResources().getDimensionPixelSize(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        boolean z;
        int i;
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
            int i2 = this.f28380a;
            int i3 = this.f28381b;
            int i4 = ((i2 - (i3 * 2)) - (this.f28382c * 3)) / 4;
            if (z) {
                i = i3;
            } else {
                i = i4;
            }
            if (!z2) {
                i3 = i4;
            }
            rect.set(i, 0, i3, 0);
        }
    }
}
