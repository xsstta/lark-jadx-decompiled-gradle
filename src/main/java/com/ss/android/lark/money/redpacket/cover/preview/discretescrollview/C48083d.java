package com.ss.android.lark.money.redpacket.cover.preview.discretescrollview;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.d */
public class C48083d {

    /* renamed from: a */
    private RecyclerView.LayoutManager f121056a;

    /* renamed from: a */
    public int mo168373a() {
        return this.f121056a.getChildCount();
    }

    /* renamed from: b */
    public int mo168381b() {
        return this.f121056a.getItemCount();
    }

    /* renamed from: c */
    public int mo168386c() {
        return this.f121056a.getWidth();
    }

    /* renamed from: d */
    public int mo168389d() {
        return this.f121056a.getHeight();
    }

    /* renamed from: e */
    public void mo168392e() {
        this.f121056a.requestLayout();
    }

    /* renamed from: f */
    public void mo168393f() {
        this.f121056a.removeAllViews();
    }

    public C48083d(RecyclerView.LayoutManager layoutManager) {
        this.f121056a = layoutManager;
    }

    /* renamed from: a */
    public View mo168374a(int i) {
        return this.f121056a.getChildAt(i);
    }

    /* renamed from: b */
    public void mo168382b(int i) {
        this.f121056a.offsetChildrenHorizontal(i);
    }

    /* renamed from: c */
    public int mo168387c(View view) {
        return this.f121056a.getPosition(view);
    }

    /* renamed from: b */
    public void mo168383b(View view) {
        this.f121056a.detachView(view);
    }

    /* renamed from: c */
    public void mo168388c(int i) {
        this.f121056a.offsetChildrenVertical(i);
    }

    /* renamed from: d */
    public int mo168390d(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return this.f121056a.getDecoratedMeasuredWidth(view) + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    /* renamed from: e */
    public int mo168391e(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return this.f121056a.getDecoratedMeasuredHeight(view) + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: a */
    public void mo168376a(View view) {
        this.f121056a.attachView(view);
    }

    /* renamed from: b */
    public void mo168385b(RecyclerView.Recycler recycler) {
        this.f121056a.removeAndRecycleAllViews(recycler);
    }

    /* renamed from: a */
    public void mo168379a(RecyclerView.Recycler recycler) {
        this.f121056a.detachAndScrapAttachedViews(recycler);
    }

    /* renamed from: a */
    public void mo168380a(RecyclerView.SmoothScroller smoothScroller) {
        this.f121056a.startSmoothScroll(smoothScroller);
    }

    /* renamed from: b */
    public void mo168384b(View view, RecyclerView.Recycler recycler) {
        recycler.recycleView(view);
    }

    /* renamed from: a */
    public View mo168375a(int i, RecyclerView.Recycler recycler) {
        View viewForPosition = recycler.getViewForPosition(i);
        this.f121056a.addView(viewForPosition);
        this.f121056a.measureChildWithMargins(viewForPosition, 0, 0);
        return viewForPosition;
    }

    /* renamed from: a */
    public void mo168378a(View view, RecyclerView.Recycler recycler) {
        this.f121056a.detachAndScrapView(view, recycler);
    }

    /* renamed from: a */
    public void mo168377a(View view, int i, int i2, int i3, int i4) {
        this.f121056a.layoutDecoratedWithMargins(view, i, i2, i3, i4);
    }
}
