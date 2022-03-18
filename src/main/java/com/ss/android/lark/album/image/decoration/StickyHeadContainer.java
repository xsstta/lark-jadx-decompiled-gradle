package com.ss.android.lark.album.image.decoration;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.ss.android.lark.log.Log;

public class StickyHeadContainer extends ViewGroup {

    /* renamed from: a */
    private int f72171a;

    /* renamed from: b */
    private int f72172b;

    /* renamed from: c */
    private int f72173c;

    /* renamed from: d */
    private int f72174d;

    /* renamed from: e */
    private int f72175e;

    /* renamed from: f */
    private int f72176f;

    /* renamed from: g */
    private int f72177g;

    /* renamed from: h */
    private AbstractC28685a f72178h;

    /* renamed from: com.ss.android.lark.album.image.decoration.StickyHeadContainer$a */
    public interface AbstractC28685a {
        /* renamed from: a */
        void mo101986a(int i);
    }

    /* renamed from: a */
    public void mo102042a() {
        this.f72173c = Integer.MIN_VALUE;
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

    public void setDataCallback(AbstractC28685a aVar) {
        this.f72178h = aVar;
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
    public void mo102044b(int i) {
        AbstractC28685a aVar = this.f72178h;
        if (!(aVar == null || this.f72173c == i)) {
            aVar.mo101986a(i);
        }
        this.f72173c = i;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    /* renamed from: a */
    public void mo102043a(int i) {
        if (this.f72172b != i) {
            this.f72171a = i;
            ViewCompat.m4087i(getChildAt(0), this.f72171a - this.f72172b);
        }
        this.f72172b = this.f72171a;
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
            int max = Math.max(paddingLeft, getSuggestedMinimumWidth());
            int max2 = Math.max(paddingTop, getSuggestedMinimumHeight());
            Log.m165379d("StickyHeadContainer", "desireWidth : " + max + ";desireHeight : " + max2);
            setMeasuredDimension(resolveSize(max, i), resolveSize(max2, i2));
            return;
        }
        throw new IllegalArgumentException("Only allow add one child view");
    }

    public StickyHeadContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f72172b = Integer.MIN_VALUE;
        this.f72173c = Integer.MIN_VALUE;
        setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.album.image.decoration.StickyHeadContainer.View$OnClickListenerC286841 */

            public void onClick(View view) {
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.f72174d = paddingLeft + marginLayoutParams.leftMargin;
        this.f72175e = childAt.getMeasuredWidth() + this.f72174d;
        this.f72176f = paddingTop + marginLayoutParams.topMargin + this.f72171a;
        int measuredHeight = childAt.getMeasuredHeight();
        int i5 = this.f72176f;
        int i6 = measuredHeight + i5;
        this.f72177g = i6;
        childAt.layout(this.f72174d, i5, this.f72175e, i6);
    }
}
