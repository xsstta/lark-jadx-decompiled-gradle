package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private int tempLeftRightOffset;
    private int tempTopBottomOffset;
    private C22139a viewOffsetHelper;

    public ViewOffsetBehavior() {
    }

    public int getLeftAndRightOffset() {
        C22139a aVar = this.viewOffsetHelper;
        if (aVar != null) {
            return aVar.mo76482d();
        }
        return 0;
    }

    public int getTopAndBottomOffset() {
        C22139a aVar = this.viewOffsetHelper;
        if (aVar != null) {
            return aVar.mo76481c();
        }
        return 0;
    }

    public boolean isHorizontalOffsetEnabled() {
        C22139a aVar = this.viewOffsetHelper;
        if (aVar == null || !aVar.mo76485g()) {
            return false;
        }
        return true;
    }

    public boolean isVerticalOffsetEnabled() {
        C22139a aVar = this.viewOffsetHelper;
        if (aVar == null || !aVar.mo76484f()) {
            return false;
        }
        return true;
    }

    public void setHorizontalOffsetEnabled(boolean z) {
        C22139a aVar = this.viewOffsetHelper;
        if (aVar != null) {
            aVar.mo76479b(z);
        }
    }

    public void setVerticalOffsetEnabled(boolean z) {
        C22139a aVar = this.viewOffsetHelper;
        if (aVar != null) {
            aVar.mo76476a(z);
        }
    }

    public boolean setLeftAndRightOffset(int i) {
        C22139a aVar = this.viewOffsetHelper;
        if (aVar != null) {
            return aVar.mo76480b(i);
        }
        this.tempLeftRightOffset = i;
        return false;
    }

    public boolean setTopAndBottomOffset(int i) {
        C22139a aVar = this.viewOffsetHelper;
        if (aVar != null) {
            return aVar.mo76477a(i);
        }
        this.tempTopBottomOffset = i;
        return false;
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void layoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.mo3939a(v, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        layoutChild(coordinatorLayout, v, i);
        if (this.viewOffsetHelper == null) {
            this.viewOffsetHelper = new C22139a(v);
        }
        this.viewOffsetHelper.mo76475a();
        this.viewOffsetHelper.mo76478b();
        int i2 = this.tempTopBottomOffset;
        if (i2 != 0) {
            this.viewOffsetHelper.mo76477a(i2);
            this.tempTopBottomOffset = 0;
        }
        int i3 = this.tempLeftRightOffset;
        if (i3 == 0) {
            return true;
        }
        this.viewOffsetHelper.mo76480b(i3);
        this.tempLeftRightOffset = 0;
        return true;
    }
}
