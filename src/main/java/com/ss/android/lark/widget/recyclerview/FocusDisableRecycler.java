package com.ss.android.lark.widget.recyclerview;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001c\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J$\u0010\u0016\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\fH\u0016R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/widget/recyclerview/FocusDisableRecycler;", "Lcom/ss/android/lark/widget/recyclerview/PointRecoderRecyclerView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attributes", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "disableFocus", "", "getDisableFocus", "()Z", "setDisableFocus", "(Z)V", "requestChildFocus", "", "child", "Landroid/view/View;", "focused", "requestChildRectangleOnScreen", "rect", "Landroid/graphics/Rect;", "immediate", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
public final class FocusDisableRecycler extends PointRecoderRecyclerView {

    /* renamed from: a */
    private boolean f146089a;

    public final boolean getDisableFocus() {
        return this.f146089a;
    }

    public FocusDisableRecycler(Context context) {
        super(context);
    }

    public final void setDisableFocus(boolean z) {
        this.f146089a = z;
    }

    public FocusDisableRecycler(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void requestChildFocus(View view, View view2) {
        if (!this.f146089a) {
            super.requestChildFocus(view, view2);
        }
    }

    public FocusDisableRecycler(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        if (this.f146089a) {
            return false;
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }
}
