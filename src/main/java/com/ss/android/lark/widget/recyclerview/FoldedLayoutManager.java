package com.ss.android.lark.widget.recyclerview;

import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.log.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class FoldedLayoutManager extends RecyclerView.LayoutManager {

    /* renamed from: a */
    public int f146090a;

    /* renamed from: b */
    private int f146091b;

    /* renamed from: c */
    private boolean f146092c;

    /* renamed from: d */
    private int f146093d;

    /* renamed from: e */
    private SparseArray<Rect> f146094e;

    /* renamed from: f */
    private SparseBooleanArray f146095f;

    /* renamed from: g */
    private RecyclerView.Recycler f146096g;

    /* renamed from: h */
    private int f146097h;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Status {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return super.canScrollVertically();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    /* renamed from: a */
    private int m228858a() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: b */
    private void m228861b(RecyclerView.Recycler recycler) {
        for (int i = 0; i < getItemCount(); i++) {
            View viewForPosition = recycler.getViewForPosition(i);
            measureChildWithMargins(viewForPosition, 0, 0);
            addView(viewForPosition);
            viewForPosition.setVisibility(0);
            Rect rect = this.f146094e.get(i);
            layoutDecoratedWithMargins(viewForPosition, rect.left - this.f146093d, rect.top, rect.right - this.f146093d, rect.bottom);
            this.f146095f.put(i, true);
        }
    }

    /* renamed from: a */
    private void m228859a(RecyclerView.Recycler recycler) {
        this.f146090a = 0;
        for (int i = 0; i < getItemCount(); i++) {
            View viewForPosition = recycler.getViewForPosition(i);
            viewForPosition.setVisibility(4);
            measureChildWithMargins(viewForPosition, 0, 0);
            int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewForPosition);
            int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewForPosition);
            calculateItemDecorationsForChild(viewForPosition, new Rect());
            Rect rect = this.f146094e.get(i);
            if (rect == null) {
                rect = new Rect();
            }
            int i2 = this.f146091b;
            if (i2 == 1) {
                int i3 = this.f146090a;
                rect.set(i3, 0, i3 + decoratedMeasuredWidth, decoratedMeasuredHeight);
                this.f146090a += decoratedMeasuredWidth;
            } else if (i2 == 0) {
                if (i <= this.f146097h) {
                    int i4 = this.f146090a;
                    rect.set(i4, 0, i4 + decoratedMeasuredWidth, decoratedMeasuredHeight);
                    this.f146090a += decoratedMeasuredWidth;
                } else {
                    int i5 = this.f146090a;
                    rect.set(i5, 0, decoratedMeasuredWidth + i5, decoratedMeasuredHeight);
                }
            }
            this.f146094e.put(i, rect);
            this.f146095f.put(i, false);
        }
    }

    /* renamed from: a */
    private void m228860a(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getItemCount() > 0 && !state.isPreLayout()) {
            m228861b(recycler);
            Log.m165383e("TenantLayoutManager", "itemCount = " + getChildCount());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        super.onLayoutChildren(recycler, state);
        this.f146096g = recycler;
        if (getItemCount() == 0) {
            detachAndScrapAttachedViews(recycler);
        } else if (getChildCount() != 0 || !state.isPreLayout()) {
            detachAndScrapAttachedViews(recycler);
            m228859a(recycler);
            m228860a(recycler, state);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return super.scrollVerticallyBy(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f146092c) {
            return i;
        }
        int a = m228858a();
        int i2 = this.f146090a;
        if (a < i2) {
            i2 = m228858a();
        }
        int i3 = this.f146093d;
        int i4 = this.f146090a;
        if (i3 <= i4 - i2) {
            this.f146093d = i3 + i;
        }
        int i5 = this.f146093d;
        if (i5 > i4 - i2) {
            this.f146093d = i4 - i2;
        } else if (i5 >= 0) {
            return i;
        } else {
            this.f146093d = 0;
        }
        return 0;
    }
}
