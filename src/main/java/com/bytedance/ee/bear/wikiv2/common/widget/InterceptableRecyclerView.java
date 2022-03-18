package com.bytedance.ee.bear.wikiv2.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.ee.bear.widgets.BaseRecyclerView;

public class InterceptableRecyclerView extends BaseRecyclerView {

    /* renamed from: a */
    private AbstractC12247a f32917a;

    /* renamed from: b */
    private int f32918b;

    /* renamed from: c */
    private int f32919c;

    /* renamed from: d */
    private int f32920d;

    /* renamed from: e */
    private int f32921e;

    /* renamed from: com.bytedance.ee.bear.wikiv2.common.widget.InterceptableRecyclerView$a */
    public interface AbstractC12247a {
        /* renamed from: a */
        boolean mo46789a(MotionEvent motionEvent, int i, int i2, int i3, int i4);
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
    }

    public InterceptableRecyclerView(Context context) {
        super(context);
    }

    public void setTouchInterceptor(AbstractC12247a aVar) {
        this.f32917a = aVar;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f32917a != null && motionEvent.getAction() == 0) {
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            this.f32918b = rawX;
            this.f32919c = rawY;
            this.f32920d = rawX;
            this.f32921e = rawY;
            if (this.f32917a.mo46789a(motionEvent, 0, 0, 0, 0)) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f32917a != null) {
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            int action = motionEvent.getAction();
            if (action == 1 || action == 2) {
                int i = this.f32920d - rawX;
                int i2 = this.f32921e - rawY;
                this.f32920d = rawX;
                this.f32921e = rawY;
                if (this.f32917a.mo46789a(motionEvent, this.f32918b - rawX, this.f32919c - rawY, i, i2)) {
                    return true;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public InterceptableRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InterceptableRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
