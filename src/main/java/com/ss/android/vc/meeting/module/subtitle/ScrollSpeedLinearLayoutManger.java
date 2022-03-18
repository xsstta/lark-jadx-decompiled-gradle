package com.ss.android.vc.meeting.module.subtitle;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;

public class ScrollSpeedLinearLayoutManger extends LinearLayoutManager {

    /* renamed from: a */
    public float f159032a = 0.03f;

    /* renamed from: b */
    private Context f159033b;

    /* renamed from: a */
    public void mo218505a() {
        this.f159032a = this.f159033b.getResources().getDisplayMetrics().density * 1.6f;
    }

    public ScrollSpeedLinearLayoutManger(Context context) {
        super(context);
        this.f159033b = context;
        mo218505a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        C631171 r2 = new LinearSmoothScroller(recyclerView.getContext()) {
            /* class com.ss.android.vc.meeting.module.subtitle.ScrollSpeedLinearLayoutManger.C631171 */

            /* access modifiers changed from: protected */
            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return ScrollSpeedLinearLayoutManger.this.f159032a / displayMetrics.density;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
            public PointF computeScrollVectorForPosition(int i) {
                return ScrollSpeedLinearLayoutManger.this.computeScrollVectorForPosition(i);
            }
        };
        r2.setTargetPosition(i);
        try {
            startSmoothScroll(r2);
        } catch (Exception unused) {
        }
    }
}
