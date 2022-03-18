package com.ss.android.lark.calendar.impl.features.events.detail.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.core.view.C0917s;
import androidx.core.widget.NestedScrollView;

public class ObservedScrollView extends NestedScrollView {

    /* renamed from: a */
    private Float f79759a;

    /* renamed from: b */
    private AbstractC31470a f79760b;

    /* renamed from: c */
    private final int[] f79761c;

    /* renamed from: d */
    private final int[] f79762d;

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.ObservedScrollView$a */
    public interface AbstractC31470a {
        /* renamed from: a */
        void mo114199a(int i, int i2, int i3, int i4);
    }

    public void setOnScrollListener(AbstractC31470a aVar) {
        this.f79760b = aVar;
    }

    public ObservedScrollView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public boolean dispatchGenericPointerEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() != 8) {
            return super.dispatchGenericPointerEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.core.widget.NestedScrollView
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() != 8) {
            return super.onGenericMotionEvent(motionEvent);
        }
        int floatValue = (int) ((-motionEvent.getAxisValue(9)) * this.f79759a.floatValue());
        int scrollY = getScrollY();
        startNestedScroll(2, 0);
        if (dispatchNestedPreScroll(0, floatValue, this.f79762d, this.f79761c, 0)) {
            floatValue -= this.f79762d[1];
        }
        scrollTo(0, scrollY + floatValue);
        return true;
    }

    public ObservedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ObservedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f79761c = new int[2];
        this.f79762d = new int[2];
        this.f79759a = Float.valueOf(C0917s.m4407b(ViewConfiguration.get(context), context));
    }

    /* access modifiers changed from: protected */
    @Override // androidx.core.widget.NestedScrollView
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        AbstractC31470a aVar = this.f79760b;
        if (aVar != null) {
            aVar.mo114199a(i, i2, i3, i4);
        }
    }
}
