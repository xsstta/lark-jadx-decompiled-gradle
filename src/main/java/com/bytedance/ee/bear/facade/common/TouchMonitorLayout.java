package com.bytedance.ee.bear.facade.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;

public class TouchMonitorLayout extends FrameLayout implements AbstractC7719m {

    /* renamed from: a */
    private List<AbstractC7720n> f20779a;

    public TouchMonitorLayout(Context context) {
        super(context);
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7719m
    /* renamed from: b */
    public void mo30101b(AbstractC7720n nVar) {
        List<AbstractC7720n> list = this.f20779a;
        if (list != null) {
            list.remove(nVar);
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7719m
    /* renamed from: a */
    public void mo30100a(AbstractC7720n nVar) {
        if (this.f20779a == null) {
            this.f20779a = new ArrayList();
        }
        if (!this.f20779a.contains(nVar)) {
            this.f20779a.add(nVar);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f20779a != null && motionEvent.getAction() == 0) {
            for (AbstractC7720n nVar : this.f20779a) {
                if (nVar.onTouchStartIntercept(motionEvent)) {
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public TouchMonitorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TouchMonitorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
