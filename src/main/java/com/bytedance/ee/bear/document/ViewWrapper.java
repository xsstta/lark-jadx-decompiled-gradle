package com.bytedance.ee.bear.document;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/document/ViewWrapper;", "", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "getView", "()Landroid/view/View;", "getHeight", "", "getWidth", "setHeight", "", "height", "setWidth", "width", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ViewWrapper {
    private final View view;

    public final View getView() {
        return this.view;
    }

    public final int getHeight() {
        return this.view.getLayoutParams().height;
    }

    public final int getWidth() {
        return this.view.getLayoutParams().width;
    }

    public ViewWrapper(View view2) {
        Intrinsics.checkParameterIsNotNull(view2, "view");
        this.view = view2;
    }

    public final void setHeight(int i) {
        this.view.getLayoutParams().height = i;
        this.view.requestLayout();
    }

    public final void setWidth(int i) {
        this.view.getLayoutParams().width = i;
        this.view.requestLayout();
    }
}
