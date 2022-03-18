package com.bytedance.ee.bear.middleground.comment.audio;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public class MotionFrameLayout extends FrameLayout {

    /* renamed from: a */
    private AbstractC9037a f24335a;

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC9037a aVar = this.f24335a;
        if (aVar != null) {
            aVar.mo34589a();
        }
    }

    public MotionFrameLayout(Context context) {
        super(context);
    }

    public void setMotionCallbackListener(AbstractC9037a aVar) {
        this.f24335a = aVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f24335a == null || !isEnabled()) {
            return true;
        }
        this.f24335a.mo34590a(motionEvent);
        return true;
    }

    public MotionFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MotionFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
