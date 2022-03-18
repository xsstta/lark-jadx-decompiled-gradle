package com.ss.android.lark.moments.impl.publish.grid;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.moments.impl.common.utils.VibratorUtils;
import com.ss.android.ttvecamera.p3038g.C60375c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J0\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0016J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0016J\b\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\u0018H\u0016J@\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u0018H\u0016J \u0010!\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\bH\u0016J\u001a\u0010#\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001f\u001a\u00020\rH\u0016J\u0018\u0010$\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010%\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006&"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/grid/ImageItemTouchCallback;", "Landroidx/recyclerview/widget/ItemTouchHelper$Callback;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "chooseDropTarget", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "selected", "dropTargets", "", "selectLeft", "", "selectTop", "clearView", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewHolder", "getMovementFlags", "getPublishGridAdapter", "Lcom/ss/android/lark/moments/impl/publish/grid/MomentsPublishGridAdapter;", "isLongPressDragEnabled", "", "onChildDraw", C60375c.f150914a, "Landroid/graphics/Canvas;", "dX", "", "dY", "actionState", "isCurrentlyActive", "onMove", "target", "onSelectedChanged", "onSwiped", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.publish.grid.e */
public abstract class ImageItemTouchCallback extends ItemTouchHelper.AbstractC1303a {

    /* renamed from: a */
    private final Context f120770a;

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: a */
    public void mo6575a(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "viewHolder");
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: a */
    public boolean mo6577a() {
        return false;
    }

    /* renamed from: d */
    public abstract MomentsPublishGridAdapter mo168062d();

    public ImageItemTouchCallback(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f120770a = context;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: b */
    public void mo6584b(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder != null) {
            if (i != 0) {
                VibratorUtils.f119257a.mo166220a(this.f120770a, 30);
            }
            super.mo6584b(viewHolder, i);
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: e */
    public void mo6591e(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        Intrinsics.checkParameterIsNotNull(viewHolder, "viewHolder");
        super.mo6591e(recyclerView, viewHolder);
        mo168062d().mo168086i();
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: a */
    public int mo6570a(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        Intrinsics.checkParameterIsNotNull(viewHolder, "viewHolder");
        if (viewHolder.getItemViewType() != MediaType.TYPE_IMAGE.ordinal()) {
            return ItemTouchHelper.AbstractC1303a.m5979b(0, 0);
        }
        return ItemTouchHelper.AbstractC1303a.m5979b(15, 0);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: b */
    public boolean mo6586b(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        Intrinsics.checkParameterIsNotNull(viewHolder, "viewHolder");
        Intrinsics.checkParameterIsNotNull(viewHolder2, "target");
        if (!mo168062d().mo168075a(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition())) {
            return false;
        }
        VibratorUtils.f119257a.mo166220a(this.f120770a, 30);
        return true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: a */
    public RecyclerView.ViewHolder mo6572a(RecyclerView.ViewHolder viewHolder, List<RecyclerView.ViewHolder> list, int i, int i2) {
        boolean z;
        int i3;
        int i4;
        Intrinsics.checkParameterIsNotNull(viewHolder, "selected");
        Intrinsics.checkParameterIsNotNull(list, "dropTargets");
        View view = viewHolder.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "selected.itemView");
        int width = view.getWidth() + i;
        View view2 = viewHolder.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "selected.itemView");
        int height = view2.getHeight() + i2;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView.ViewHolder viewHolder2 = list.get(i5);
            View view3 = viewHolder2.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view3, "target.itemView");
            int left = view3.getLeft();
            View view4 = viewHolder2.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view4, "target.itemView");
            int right = view4.getRight();
            View view5 = viewHolder2.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view5, "target.itemView");
            int top = view5.getTop();
            View view6 = viewHolder2.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view6, "target.itemView");
            int bottom = view6.getBottom();
            if (width <= left || i >= right || i2 >= bottom || height <= top) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (i < left) {
                    i3 = width - left;
                } else {
                    i3 = right - i;
                }
                if (i2 < top) {
                    i4 = height - top;
                } else {
                    i4 = bottom - i2;
                }
                int i6 = i3 * i4;
                View view7 = viewHolder2.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view7, "target.itemView");
                int width2 = view7.getWidth();
                View view8 = viewHolder2.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view8, "target.itemView");
                if (i6 > ((width2 * view8.getHeight()) * 2) / 3) {
                    return viewHolder2;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: a */
    public void mo6573a(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
        Intrinsics.checkParameterIsNotNull(canvas, C60375c.f150914a);
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        Intrinsics.checkParameterIsNotNull(viewHolder, "viewHolder");
        super.mo6573a(canvas, recyclerView, viewHolder, f, f2, i, z);
        float abs = Math.abs(f) + Math.abs(f2);
        if (z) {
            View view = viewHolder.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "viewHolder.itemView");
            view.setAlpha(0.8f);
            View view2 = viewHolder.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "viewHolder.itemView");
            view2.setScaleX(1.1f);
            View view3 = viewHolder.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view3, "viewHolder.itemView");
            view3.setScaleY(1.1f);
            return;
        }
        float f3 = (float) LocationRequest.PRIORITY_HD_ACCURACY;
        if (abs < f3) {
            View view4 = viewHolder.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view4, "viewHolder.itemView");
            view4.setAlpha((((f3 - abs) / f3) * 0.2f) + 0.8f);
            View view5 = viewHolder.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view5, "viewHolder.itemView");
            float f4 = ((abs / f3) * 0.1f) + 1.0f;
            view5.setScaleX(f4);
            View view6 = viewHolder.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view6, "viewHolder.itemView");
            view6.setScaleY(f4);
        }
    }
}
