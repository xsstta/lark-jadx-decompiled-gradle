package com.tt.miniapp.component.nativeview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.bytedance.ee.larkwebview.monitor.webview.BizType;
import com.tt.miniapp.util.C67043j;

public class LarkTouchWebView extends LarkWebView {

    /* renamed from: a */
    private int[] f165929a;

    /* renamed from: b */
    private float f165930b;

    /* renamed from: c */
    private IAppContext f165931c;

    public float getScreenTouchY() {
        if (this.f165930b > ((float) C67043j.m261267a(this.f165931c.getApplicationContext()))) {
            return (float) C67043j.m261267a(this.f165931c.getApplicationContext());
        }
        return this.f165930b;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f165930b = motionEvent.getY() + ((float) this.f165929a[1]);
        return super.onTouchEvent(motionEvent);
    }

    public LarkTouchWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f165929a = new int[2];
        this.f165930b = -1.0f;
    }

    public LarkTouchWebView(Context context, IAppContext iAppContext) {
        super(context, BizType.f35444h.mo49862c());
        this.f165929a = new int[2];
        this.f165930b = -1.0f;
        this.f165931c = iAppContext;
    }

    public LarkTouchWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f165929a = new int[2];
        this.f165930b = -1.0f;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getLocationOnScreen(this.f165929a);
    }
}
