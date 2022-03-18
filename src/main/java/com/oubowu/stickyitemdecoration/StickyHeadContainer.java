package com.oubowu.stickyitemdecoration;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;

public class StickyHeadContainer extends ViewGroup {

    /* renamed from: a */
    private int f66926a;

    /* renamed from: b */
    private int f66927b;

    /* renamed from: c */
    private int f66928c;

    /* renamed from: d */
    private int f66929d;

    /* renamed from: e */
    private int f66930e;

    /* renamed from: f */
    private int f66931f;

    /* renamed from: g */
    private int f66932g;

    /* renamed from: h */
    private AbstractC26970a f66933h;

    /* renamed from: com.oubowu.stickyitemdecoration.StickyHeadContainer$a */
    public interface AbstractC26970a {
        void onDataChange(int i);
    }

    public int getLastStickyHeadPosition() {
        return this.f66928c;
    }

    /* renamed from: a */
    public void mo95873a() {
        this.f66928c = Integer.MIN_VALUE;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return super.generateDefaultLayoutParams();
    }

    /* access modifiers changed from: protected */
    public int getChildHeight() {
        return getChildAt(0).getHeight();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    public void setDataCallback(AbstractC26970a aVar) {
        this.f66933h = aVar;
    }

    public StickyHeadContainer(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo95875b(int i) {
        AbstractC26970a aVar = this.f66933h;
        if (!(aVar == null || this.f66928c == i)) {
            aVar.onDataChange(i);
        }
        this.f66928c = i;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    /* renamed from: a */
    public void mo95874a(int i) {
        if (this.f66927b != i) {
            this.f66926a = i;
            ViewCompat.m4087i(getChildAt(0), this.f66926a - this.f66927b);
        }
        this.f66927b = this.f66926a;
    }

    public StickyHeadContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            measureChildWithMargins(childAt, i, 0, i2, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
            int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
            setMeasuredDimension(resolveSize(Math.max(paddingLeft, getSuggestedMinimumWidth()), i), resolveSize(Math.max(paddingTop, getSuggestedMinimumHeight()), i2));
            return;
        }
        throw new IllegalArgumentException("只允许容器添加1个子View！");
    }

    public StickyHeadContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f66928c = Integer.MIN_VALUE;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.f66929d = paddingLeft + marginLayoutParams.leftMargin;
        this.f66930e = childAt.getMeasuredWidth() + this.f66929d;
        this.f66931f = paddingTop + marginLayoutParams.topMargin + this.f66926a;
        int measuredHeight = childAt.getMeasuredHeight();
        int i5 = this.f66931f;
        int i6 = measuredHeight + i5;
        this.f66932g = i6;
        childAt.layout(this.f66929d, i5, this.f66930e, i6);
    }
}
