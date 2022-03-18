package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.h */
public class C1382h extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    private static final int[] f4879a = {16843284};

    /* renamed from: b */
    private Drawable f4880b;

    /* renamed from: c */
    private int f4881c;

    /* renamed from: d */
    private final Rect f4882d = new Rect();

    /* renamed from: a */
    public void mo7418a(Drawable drawable) {
        if (drawable != null) {
            this.f4880b = drawable;
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }

    /* renamed from: a */
    public void mo7417a(int i) {
        if (i == 0 || i == 1) {
            this.f4881c = i;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
    }

    public C1382h(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f4879a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f4880b = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        mo7417a(i);
    }

    /* renamed from: a */
    private void m6316a(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingLeft();
            i = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i2, recyclerView.getPaddingTop(), i, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            i = recyclerView.getWidth();
            i2 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            recyclerView.getDecoratedBoundsWithMargins(childAt, this.f4882d);
            int round = this.f4882d.bottom + Math.round(childAt.getTranslationY());
            this.f4880b.setBounds(i2, round - this.f4880b.getIntrinsicHeight(), i, round);
            this.f4880b.draw(canvas);
        }
        canvas.restore();
    }

    /* renamed from: b */
    private void m6317b(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingTop();
            i = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i2, recyclerView.getWidth() - recyclerView.getPaddingRight(), i);
        } else {
            i = recyclerView.getHeight();
            i2 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.f4882d);
            int round = this.f4882d.right + Math.round(childAt.getTranslationX());
            this.f4880b.setBounds(round - this.f4880b.getIntrinsicWidth(), i2, round, i);
            this.f4880b.draw(canvas);
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if (recyclerView.getLayoutManager() != null && this.f4880b != null) {
            if (this.f4881c == 1) {
                m6316a(canvas, recyclerView);
            } else {
                m6317b(canvas, recyclerView);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Drawable drawable = this.f4880b;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f4881c == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }
}
