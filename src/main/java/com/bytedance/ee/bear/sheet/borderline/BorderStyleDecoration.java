package com.bytedance.ee.bear.sheet.borderline;

import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002J \u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0002J(\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0002¨\u0006\u0018"}, d2 = {"Lcom/bytedance/ee/bear/sheet/borderline/BorderStyleDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "()V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "getSpanCount", "", "isFirstColumn", "", "position", "span", "isFirstRow", "isLastColumn", "isLastRow", "childCount", "setItemViewBackground", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.sheet.borderline.d */
public final class BorderStyleDecoration extends RecyclerView.AbstractC1335d {
    /* renamed from: a */
    private final int m46021a(RecyclerView recyclerView) {
        GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
        if (gridLayoutManager != null) {
            return gridLayoutManager.mo6502b();
        }
        return 4;
    }

    /* renamed from: a */
    private final boolean m46023a(int i, int i2) {
        if (i % i2 == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final boolean m46025b(int i, int i2) {
        if ((i + 1) % i2 == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final boolean m46026c(int i, int i2) {
        if (i / i2 == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m46024a(int i, int i2, int i3) {
        int i4 = i3 % i2;
        int i5 = i3 / i2;
        if (i4 != 0) {
            i5++;
        }
        if ((i / i2) + 1 == i5) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final void m46022a(View view, int i, int i2, int i3) {
        float f;
        float f2;
        float f3;
        float dimensionPixelSize = (float) view.getResources().getDimensionPixelSize(R.dimen.space_radius_m);
        if (!m46026c(i, i2) || !m46023a(i, i2)) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f = dimensionPixelSize;
        }
        if (!m46026c(i, i2) || !m46025b(i, i2)) {
            f2 = BitmapDescriptorFactory.HUE_RED;
        } else {
            f2 = dimensionPixelSize;
        }
        if (!m46024a(i, i2, i3) || !m46023a(i, i2)) {
            f3 = BitmapDescriptorFactory.HUE_RED;
        } else {
            f3 = dimensionPixelSize;
        }
        if (!m46024a(i, i2, i3) || !m46025b(i, i2)) {
            dimensionPixelSize = BitmapDescriptorFactory.HUE_RED;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadii(new float[]{f, f, f2, f2, dimensionPixelSize, dimensionPixelSize, f3, f3});
        view.setBackground(gradientDrawable);
        view.setBackgroundTintList(view.getResources().getColorStateList(R.color.sheet_attr_item_bg_tint_selector));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int i;
        Intrinsics.checkParameterIsNotNull(rect, "outRect");
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(recyclerView, "parent");
        Intrinsics.checkParameterIsNotNull(state, "state");
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.space_kit_len_1);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int a = m46021a(recyclerView);
        int i2 = 0;
        if (m46025b(childAdapterPosition, a)) {
            i = 0;
        } else {
            i = dimensionPixelSize;
        }
        rect.right = i;
        if (!m46026c(childAdapterPosition, a)) {
            dimensionPixelSize = 0;
        }
        rect.bottom = dimensionPixelSize;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            i2 = adapter.getItemCount();
        }
        m46022a(view, childAdapterPosition, a, i2);
    }
}
