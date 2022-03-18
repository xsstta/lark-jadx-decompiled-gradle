package com.ss.android.vc.common.widget;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.vc.common.p3083e.C60775q;

public class VcFloatInterceptedFrameLayout extends FrameLayout {

    /* renamed from: a */
    private AbstractC60825a f152166a;

    /* renamed from: com.ss.android.vc.common.widget.VcFloatInterceptedFrameLayout$a */
    public interface AbstractC60825a {
        boolean onTouchEvent(MotionEvent motionEvent);
    }

    public VcFloatInterceptedFrameLayout(Context context) {
        super(context);
    }

    public void setDispatchTouchEventListener(AbstractC60825a aVar) {
        this.f152166a = aVar;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AbstractC60825a aVar = this.f152166a;
        if (aVar != null && aVar.onTouchEvent(motionEvent)) {
            motionEvent = MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getChildCount() != 1) {
            if (getChildCount() > 1 && C60775q.m236138a()) {
                C60775q.m236136a("[onTouchEvent]This group can only contains one child");
            }
            return false;
        } else if (!getChildAt(0).isShown() || !super.onTouchEvent(motionEvent)) {
            return false;
        } else {
            return true;
        }
    }

    public VcFloatInterceptedFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VcFloatInterceptedFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
