package com.bytedance.ee.bear.facade.common.widget.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13616d;

public class LinearLayoutManagerWrapper extends LinearLayoutManager {
    public LinearLayoutManagerWrapper(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        try {
            super.onLayoutChildren(recycler, state);
        } catch (Exception e) {
            if (!C13616d.m55261a()) {
                C13479a.m54761a("LinearLayoutManagerWrapper", e);
                return;
            }
            throw e;
        }
    }

    public LinearLayoutManagerWrapper(Context context, int i, boolean z) {
        super(context, i, z);
    }

    public LinearLayoutManagerWrapper(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
