package com.larksuite.component.universe_design.breadcrumb;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J(\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/larksuite/component/universe_design/breadcrumb/UDBreadcrumbItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "context", "Landroid/content/Context;", "decorationIconRes", "", "(Landroid/content/Context;I)V", "mDecorationIcon", "Landroid/graphics/drawable/Drawable;", "mIconSize", "mRect", "Landroid/graphics/Rect;", "getItemOffsets", "", "outRect", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "onDrawOver", "canvas", "Landroid/graphics/Canvas;", "universe-ui-breadcrumb_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.breadcrumb.c */
public final class UDBreadcrumbItemDecoration extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    private final int f63094a;

    /* renamed from: b */
    private final Rect f63095b;

    /* renamed from: c */
    private final Drawable f63096c;

    public UDBreadcrumbItemDecoration(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        int d = UDDimenUtils.m93313d(context, R.dimen.ud_breadcrumb_decoration_size);
        this.f63094a = d;
        Rect rect = new Rect(0, 0, d, d);
        this.f63095b = rect;
        Drawable iconDrawable = UDIconUtils.getIconDrawable(context, i);
        iconDrawable.setBounds(rect);
        iconDrawable.setTint(UDColorUtils.getColor(context, R.color.icon_n3));
        this.f63096c = iconDrawable;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Intrinsics.checkParameterIsNotNull(recyclerView, "parent");
        Intrinsics.checkParameterIsNotNull(state, "state");
        int childCount = recyclerView.getChildCount();
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            Intrinsics.checkExpressionValueIsNotNull(adapter, "parent.adapter?: return");
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                if (childAdapterPosition != -1 && childAdapterPosition > 0 && childAdapterPosition < adapter.getItemCount()) {
                    Intrinsics.checkExpressionValueIsNotNull(childAt, "child");
                    canvas.save();
                    int height = childAt.getHeight();
                    float left = ((float) childAt.getLeft()) + ((float) ((int) childAt.getTranslationX()));
                    int i2 = this.f63094a;
                    canvas.translate(left - ((float) i2), ((float) (height - i2)) / 2.0f);
                    this.f63096c.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Intrinsics.checkParameterIsNotNull(rect, "outRect");
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(recyclerView, "parent");
        Intrinsics.checkParameterIsNotNull(state, "state");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            Intrinsics.checkExpressionValueIsNotNull(adapter, "parent.adapter?: return");
            if (childAdapterPosition == -1 || childAdapterPosition <= 0 || childAdapterPosition >= adapter.getItemCount()) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(this.f63094a, 0, 0, 0);
            }
        }
    }
}
