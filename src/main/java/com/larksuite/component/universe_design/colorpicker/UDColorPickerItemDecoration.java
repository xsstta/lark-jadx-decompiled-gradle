package com.larksuite.component.universe_design.colorpicker;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005J(\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0002R\u000e\u0010\u0007\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/larksuite/component/universe_design/colorpicker/UDColorPickerItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "layoutManager", "Lcom/larksuite/component/universe_design/colorpicker/UDGridAutofitLayoutManager;", "itemHeightSpace", "", "(Lcom/larksuite/component/universe_design/colorpicker/UDGridAutofitLayoutManager;I)V", "columns", "offsetWidthSpace", "fixItemPosition", "", "outRect", "Landroid/graphics/Rect;", "position", "getItemOffsets", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "getTranslation", "", "itemSize", "itemCount", "totalSize", "universe-ui-colorpicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.colorpicker.f */
public final class UDColorPickerItemDecoration extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    private int f63173a;

    /* renamed from: b */
    private int f63174b;

    /* renamed from: c */
    private final UDGridAutofitLayoutManager f63175c;

    /* renamed from: a */
    private final float m92573a(int i, int i2, int i3) {
        float f = ((((float) i3) * 1.0f) - ((float) (i * i2))) / ((float) i2);
        if (i2 == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return f / (i2 != 1 ? (float) (i2 - 1) : (float) 2);
    }

    public UDColorPickerItemDecoration(UDGridAutofitLayoutManager uDGridAutofitLayoutManager, int i) {
        Intrinsics.checkParameterIsNotNull(uDGridAutofitLayoutManager, "layoutManager");
        this.f63175c = uDGridAutofitLayoutManager;
        if (i > 0) {
            this.f63173a = i;
        }
    }

    /* renamed from: a */
    public final void mo90419a(Rect rect, int i) {
        int i2;
        boolean z;
        Intrinsics.checkParameterIsNotNull(rect, "outRect");
        if (this.f63175c.getOrientation() == 0) {
            int b = this.f63175c.mo6502b();
            int itemCount = this.f63175c.getItemCount() / b;
            int itemCount2 = this.f63175c.getItemCount() % b;
            int i3 = 0;
            if (itemCount2 > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (z) {
                    i3 = 1;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            i2 = itemCount + i3;
        } else {
            i2 = this.f63175c.mo6502b();
        }
        float a = m92573a(this.f63175c.mo90403c(), i2, (this.f63175c.getWidth() - this.f63175c.getPaddingLeft()) - this.f63175c.getPaddingRight());
        int i4 = i % i2;
        if (!(i2 == 0 || i2 == 1)) {
            a *= (float) i4;
        }
        rect.left = (int) a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Intrinsics.checkParameterIsNotNull(rect, "outRect");
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(recyclerView, "parent");
        Intrinsics.checkParameterIsNotNull(state, "state");
        if (this.f63173a > 0) {
            if (this.f63174b <= 0) {
                this.f63174b = this.f63175c.mo6502b();
            }
            if (this.f63174b > 0) {
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                if (childAdapterPosition >= this.f63174b) {
                    rect.top = this.f63173a;
                }
                mo90419a(rect, childAdapterPosition);
            }
        }
    }
}
