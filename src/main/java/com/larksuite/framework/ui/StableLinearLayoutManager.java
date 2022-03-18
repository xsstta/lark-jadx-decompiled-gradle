package com.larksuite.framework.ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class StableLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    private boolean f64648a;

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return false;
    }

    public StableLinearLayoutManager(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        try {
            super.onLayoutChildren(recycler, state);
        } catch (IndexOutOfBoundsException unused) {
            Log.e("StableLayoutManager", "onLayoutChildren failed: throw IndexOutOfBoundsException");
        }
    }

    public StableLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        try {
            super.scrollHorizontallyBy(i, recycler, state);
            return 0;
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        try {
            return super.scrollVerticallyBy(i, recycler, state);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public StableLinearLayoutManager(Context context, int i, boolean z, boolean z2) {
        super(context, i, z);
        this.f64648a = z2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z) {
        if (this.f64648a) {
            return super.requestChildRectangleOnScreen(recyclerView, view, rect, z);
        }
        return false;
    }

    public StableLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        if (this.f64648a) {
            return super.requestChildRectangleOnScreen(recyclerView, view, rect, z, z2);
        }
        return false;
    }
}
