package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.m */
public class C22262m extends LinearLayoutManager {
    C22262m(Context context, int i, boolean z) {
        super(context, i, z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        C222631 r2 = new LinearSmoothScroller(recyclerView.getContext()) {
            /* class com.google.android.material.datepicker.C22262m.C222631 */

            /* access modifiers changed from: protected */
            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return 100.0f / ((float) displayMetrics.densityDpi);
            }
        };
        r2.setTargetPosition(i);
        startSmoothScroll(r2);
    }
}
