package com.tt.miniapp.view.webcore;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapphost.host.HostDependManager;

/* renamed from: com.tt.miniapp.view.webcore.h */
public class C67279h extends ScrollView {

    /* renamed from: a */
    protected RenderViewManager.IRender f169826a;

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return false;
    }

    public C67279h(Context context) {
        super(context);
    }

    public void setRender(RenderViewManager.IRender iRender) {
        this.f169826a = iRender;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (!HostDependManager.getInst().isDesktop() || motionEvent.getAction() != 8) {
            return super.onGenericMotionEvent(motionEvent);
        }
        return false;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getChildAt(0) instanceof C67231a) {
            C67231a aVar = (C67231a) getChildAt(0);
            if (aVar.getInterceptViews() != null) {
                for (View view : aVar.getInterceptViews()) {
                    int[] iArr = new int[2];
                    view.getLocationInWindow(iArr);
                    int i = iArr[0];
                    int titleBarHeight = iArr[1] - this.f169826a.getTitleBarHeight();
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    if (motionEvent.getX() > ((float) i) && motionEvent.getX() < ((float) (i + measuredWidth)) && motionEvent.getY() > ((float) titleBarHeight) && motionEvent.getY() < ((float) (titleBarHeight + measuredHeight))) {
                        return view.dispatchTouchEvent(motionEvent);
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void requestChildFocus(View view, View view2) {
        if (getParent() != null) {
            getParent().requestChildFocus(view, view2);
        }
    }
}
