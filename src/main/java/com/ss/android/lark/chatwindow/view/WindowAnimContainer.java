package com.ss.android.lark.chatwindow.view;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.log.Log;

public class WindowAnimContainer extends FrameLayout {

    /* renamed from: a */
    PopupWindow f91027a;

    /* renamed from: b */
    C35251a f91028b;

    /* renamed from: c */
    private long f91029c;

    /* renamed from: d */
    private boolean f91030d = true;

    /* renamed from: e */
    private boolean f91031e;

    /* renamed from: f */
    private boolean f91032f;

    /* renamed from: b */
    private void m137641b() {
        m137642c();
    }

    /* renamed from: a */
    public void mo129724a() {
        if (this.f91027a.isShowing()) {
            this.f91030d = false;
            this.f91027a.dismiss();
        }
    }

    /* renamed from: c */
    private void m137642c() {
        C35251a aVar = new C35251a(getContext());
        this.f91028b = aVar;
        aVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        PopupWindow popupWindow = new PopupWindow(this.f91028b, -1, -1);
        this.f91027a = popupWindow;
        popupWindow.setAnimationStyle(R.style.animTranslate);
        if (Build.VERSION.SDK_INT < 21) {
            this.f91027a.setClippingEnabled(false);
        }
    }

    /* renamed from: com.ss.android.lark.chatwindow.view.WindowAnimContainer$a */
    public class C35251a extends View {
        /* access modifiers changed from: protected */
        public void onDraw(Canvas canvas) {
            WindowAnimContainer.this.draw(canvas);
        }

        public C35251a(Context context) {
            super(context);
        }
    }

    public WindowAnimContainer(Context context) {
        super(context);
        m137641b();
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f91030d) {
            this.f91028b.postInvalidate();
        }
        if (!this.f91032f) {
            C29990c.m110930b().mo134577e().mo120975f();
            this.f91032f = true;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            if (motionEvent.getAction() == 0 && this.f91030d && this.f91029c + 500 < System.currentTimeMillis()) {
                mo129724a();
            }
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception e) {
            Log.m165386e("WindowAnimContainer", e);
            e.printStackTrace();
            return false;
        }
    }

    public WindowAnimContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m137641b();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (!this.f91031e) {
            C29990c.m110930b().mo134577e().mo120974e();
            this.f91031e = true;
        }
        super.onMeasure(i, i2);
    }

    public WindowAnimContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m137641b();
    }
}
