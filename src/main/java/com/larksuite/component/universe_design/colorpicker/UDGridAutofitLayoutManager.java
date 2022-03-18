package com.larksuite.component.universe_design.colorpicker;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007B)\b\u0016\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0016\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0012\u001a\u00020\u0005J \u0010\u0013\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0018\u00010\u0015R\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u000e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/larksuite/component/universe_design/colorpicker/UDGridAutofitLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "context", "Landroid/content/Context;", "columnWidth", "", "minItemWidthSpace", "(Landroid/content/Context;II)V", "orientation", "reverseLayout", "", "(Landroid/content/Context;IIZ)V", "isColumnWidthChanged", "lastHeight", "lastWidth", "checkColumnWidth", "checkItemSpace", "", "getColumnWidth", "onLayoutChildren", "recycler", "Landroidx/recyclerview/widget/RecyclerView$Recycler;", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "setColumnWidth", "newColumnWidth", "universe-ui-colorpicker_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UDGridAutofitLayoutManager extends GridLayoutManager {

    /* renamed from: i */
    private int f63153i;

    /* renamed from: j */
    private boolean f63154j = true;

    /* renamed from: k */
    private int f63155k;

    /* renamed from: l */
    private int f63156l;

    /* renamed from: m */
    private int f63157m;

    /* renamed from: c */
    public final int mo90403c() {
        return this.f63153i;
    }

    /* renamed from: b */
    public final void mo90402b(int i) {
        if (i > 0 && i != this.f63153i) {
            this.f63153i = i;
            this.f63154j = true;
        }
    }

    /* renamed from: a */
    public final void mo90400a(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (i <= 0) {
            this.f63157m = UDDimenUtils.m93313d(context, R.dimen.ud_color_picker_item_default_min_width_space);
        } else {
            this.f63157m = i;
        }
    }

    /* renamed from: b */
    public final int mo90401b(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (i <= 0) {
            this.f63153i = UDDimenUtils.m93313d(context, R.dimen.ud_color_picker_item_outer_width_height);
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i;
        int i2;
        int width = getWidth();
        int height = getHeight();
        if (this.f63153i > 0 && width > 0 && height > 0 && !(!this.f63154j && this.f63155k == width && this.f63156l == height)) {
            if (getOrientation() == 1) {
                i2 = width - getPaddingRight();
                i = getPaddingLeft();
            } else {
                i2 = height - getPaddingTop();
                i = getPaddingBottom();
            }
            int i3 = i2 - i;
            int i4 = this.f63157m;
            mo6500a(Math.max(1, (i3 + i4) / (this.f63153i + i4)));
            this.f63154j = false;
        }
        this.f63155k = width;
        this.f63156l = height;
        super.onLayoutChildren(recycler, state);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDGridAutofitLayoutManager(Context context, int i, int i2) {
        super(context, 1);
        Intrinsics.checkParameterIsNotNull(context, "context");
        mo90400a(context, i2);
        mo90402b(mo90401b(context, i));
    }
}
