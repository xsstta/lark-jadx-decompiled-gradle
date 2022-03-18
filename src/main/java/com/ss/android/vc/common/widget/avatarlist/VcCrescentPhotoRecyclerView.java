package com.ss.android.vc.common.widget.avatarlist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.ss.android.lark.widget.recyclerview.FpsRecyclerView;

public class VcCrescentPhotoRecyclerView extends FpsRecyclerView {
    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public VcCrescentPhotoRecyclerView(Context context) {
        super(context);
    }

    public VcCrescentPhotoRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VcCrescentPhotoRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
