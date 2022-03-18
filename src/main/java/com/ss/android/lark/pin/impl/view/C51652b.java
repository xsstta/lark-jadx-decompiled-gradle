package com.ss.android.lark.pin.impl.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.ss.android.lark.pin.impl.view.b */
public class C51652b extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    private final Rect f128529a = new Rect();

    /* renamed from: b */
    private Drawable f128530b;

    /* renamed from: c */
    private boolean f128531c = true;

    public C51652b(Context context, int i, boolean z) {
        this.f128530b = ContextCompat.getDrawable(context, i);
        this.f128531c = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i = recyclerView.getPaddingLeft();
            i2 = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i, recyclerView.getPaddingTop(), i2, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            i2 = recyclerView.getWidth();
            i = 0;
        }
        int childCount = recyclerView.getChildCount();
        if (!this.f128531c) {
            childCount--;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            recyclerView.getDecoratedBoundsWithMargins(childAt, this.f128529a);
            int round = this.f128529a.bottom + Math.round(childAt.getTranslationY());
            this.f128530b.setBounds(i, round - this.f128530b.getIntrinsicHeight(), i2, round);
            this.f128530b.draw(canvas);
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        if (this.f128530b == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f128531c || recyclerView.getChildAdapterPosition(view) != recyclerView.getAdapter().getItemCount() - 1) {
            rect.set(0, 0, 0, this.f128530b.getIntrinsicHeight());
        }
    }
}
