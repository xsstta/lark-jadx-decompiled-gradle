package com.bytedance.ee.bear.sheet.inputbar.toolbar;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;

public class ScrollLinearLayoutManager extends LinearLayoutManager {
    public ScrollLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        C112431 r2 = new LinearSmoothScroller(recyclerView.getContext()) {
            /* class com.bytedance.ee.bear.sheet.inputbar.toolbar.ScrollLinearLayoutManager.C112431 */

            /* access modifiers changed from: protected */
            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return 200.0f / ((float) displayMetrics.densityDpi);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
            public PointF computeScrollVectorForPosition(int i) {
                return super.computeScrollVectorForPosition(i);
            }
        };
        r2.setTargetPosition(i);
        startSmoothScroll(r2);
    }
}
