package com.ss.android.lark.chat.preview.components.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

public class BaseRecyclerView extends RecyclerView {
    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public BaseRecyclerView(Context context) {
        super(context);
    }

    public BaseRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BaseRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
