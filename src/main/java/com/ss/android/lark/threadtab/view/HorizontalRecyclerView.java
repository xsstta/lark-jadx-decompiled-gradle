package com.ss.android.lark.threadtab.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;

public class HorizontalRecyclerView extends RecyclerView {

    /* renamed from: a */
    private boolean f138340a;

    /* renamed from: b */
    private boolean f138341b;

    /* renamed from: c */
    private int f138342c;

    /* renamed from: d */
    private int f138343d;

    /* renamed from: e */
    private int f138344e;

    /* renamed from: f */
    private int f138345f;

    public void setIsInterceptEvent(boolean z) {
        this.f138341b = z;
    }

    public HorizontalRecyclerView(Context context) {
        this(context, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r2 != 3) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        /*
        // Method dump skipped, instructions count: 140
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.threadtab.view.HorizontalRecyclerView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public HorizontalRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorizontalRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f138341b = true;
    }
}
