package com.bytedance.ee.bear.drive.view.preview.puretext;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

public class PureTextRecyclerView extends RecyclerView {
    @Override // androidx.recyclerview.widget.RecyclerView
    public void requestChildFocus(View view, View view2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void smoothScrollBy(int i, int i2, Interpolator interpolator) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void smoothScrollToPosition(int i) {
    }

    public PureTextRecyclerView(Context context) {
        super(context);
    }

    public PureTextRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PureTextRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
