package com.ss.android.vc.meeting.module.calendar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.widget.NestedScrollView;

public class CalendarScrollView extends NestedScrollView {

    /* renamed from: a */
    private boolean f154400a = true;

    /* renamed from: b */
    private boolean f154401b;

    /* renamed from: a */
    public boolean mo114050a() {
        return this.f154400a;
    }

    /* renamed from: b */
    public boolean mo114057b() {
        return this.f154401b;
    }

    public void setReachBottom(boolean z) {
        this.f154401b = z;
    }

    public void setReachTop(boolean z) {
        this.f154400a = z;
    }

    public CalendarScrollView(Context context) {
        super(context);
    }

    public CalendarScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CalendarScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.core.widget.NestedScrollView
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        boolean z;
        super.onScrollChanged(i, i2, i3, i4);
        if (getScrollY() <= 0) {
            z = true;
        } else {
            z = false;
        }
        this.f154400a = z;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getMeasuredHeight() > getScrollY() + getHeight()) {
            this.f154401b = false;
        } else {
            this.f154401b = true;
        }
    }
}
