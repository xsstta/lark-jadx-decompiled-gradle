package com.larksuite.framework.ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;

public class StableGridLayoutManager extends GridLayoutManager {
    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return false;
    }

    public StableGridLayoutManager(Context context, int i) {
        super(context, i);
    }

    public StableGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
