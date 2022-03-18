package com.bytedance.ee.bear.wiki.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;

public class WikiPanelTitleView extends TextView {

    /* renamed from: a */
    private boolean f32292a;

    /* renamed from: a */
    public boolean mo45861a() {
        return this.f32292a;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        this.f32292a = false;
        super.onAttachedToWindow();
    }

    public WikiPanelTitleView(Context context) {
        super(context);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f32292a = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    public WikiPanelTitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WikiPanelTitleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
