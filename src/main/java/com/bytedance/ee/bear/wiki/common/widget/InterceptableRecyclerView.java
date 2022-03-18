package com.bytedance.ee.bear.wiki.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.ee.bear.widgets.BaseRecyclerView;

public class InterceptableRecyclerView extends BaseRecyclerView {

    /* renamed from: a */
    private AbstractC11939a f32287a;

    /* renamed from: b */
    private int f32288b;

    /* renamed from: c */
    private int f32289c;

    /* renamed from: d */
    private int f32290d;

    /* renamed from: e */
    private int f32291e;

    /* renamed from: com.bytedance.ee.bear.wiki.common.widget.InterceptableRecyclerView$a */
    public interface AbstractC11939a {
        /* renamed from: a */
        boolean mo45860a(MotionEvent motionEvent, int i, int i2, int i3, int i4);
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
    }

    public InterceptableRecyclerView(Context context) {
        super(context);
    }

    public void setTouchInterceptor(AbstractC11939a aVar) {
        this.f32287a = aVar;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f32287a != null && motionEvent.getAction() == 0) {
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            this.f32288b = rawX;
            this.f32289c = rawY;
            this.f32290d = rawX;
            this.f32291e = rawY;
            if (this.f32287a.mo45860a(motionEvent, 0, 0, 0, 0)) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f32287a != null) {
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            int action = motionEvent.getAction();
            if (action == 1 || action == 2) {
                int i = this.f32290d - rawX;
                int i2 = this.f32291e - rawY;
                this.f32290d = rawX;
                this.f32291e = rawY;
                if (this.f32287a.mo45860a(motionEvent, this.f32288b - rawX, this.f32289c - rawY, i, i2)) {
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
