package com.bytedance.ee.bear.slide.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ee.log.C13479a;

public class SlideWebViewContainer extends FrameLayout {

    /* renamed from: a */
    private View.OnTouchListener f30740a;

    /* renamed from: b */
    private AbstractC11431a f30741b;

    /* renamed from: com.bytedance.ee.bear.slide.common.widget.SlideWebViewContainer$a */
    public interface AbstractC11431a {
        void onSizeChanged(int i, int i2);
    }

    public SlideWebViewContainer(Context context) {
        super(context);
    }

    public void setOnSizeChangedCallBack(AbstractC11431a aVar) {
        this.f30741b = aVar;
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f30740a = onTouchListener;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.f30740a;
        if (onTouchListener == null || !onTouchListener.onTouch(this, motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public SlideWebViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SlideWebViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(0, 0, 0, 0);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C13479a.m54764b("SlideWebViewContainer", "onSizeChange:w=" + i + " h=" + i2 + " oldw=" + i3 + " oldh" + i4);
        AbstractC11431a aVar = this.f30741b;
        if (aVar != null) {
            aVar.onSizeChanged(i, i2);
        }
    }
}
