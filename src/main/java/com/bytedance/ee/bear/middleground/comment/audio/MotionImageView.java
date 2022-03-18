package com.bytedance.ee.bear.middleground.comment.audio;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatImageView;

public class MotionImageView extends AppCompatImageView {

    /* renamed from: a */
    private AbstractC9037a f24336a;

    /* renamed from: a */
    public void mo34553a() {
        AbstractC9037a aVar = this.f24336a;
        if (aVar != null) {
            aVar.mo34581b();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC9037a aVar = this.f24336a;
        if (aVar != null) {
            aVar.mo34589a();
        }
    }

    public MotionImageView(Context context) {
        super(context);
    }

    public void setMotionCallbackListener(AbstractC9037a aVar) {
        this.f24336a = aVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f24336a != null && isEnabled()) {
            this.f24336a.mo34590a(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public MotionImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MotionImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
