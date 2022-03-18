package com.ss.android.vc.meeting.module.tab.history.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.p3077b.C60700b;

public class VideoChatMainTabRelativeLayout extends LinearLayout {

    /* renamed from: a */
    private boolean f159706a;

    /* renamed from: b */
    private boolean f159707b;

    /* renamed from: a */
    private void m247972a() {
        C60700b.m235851b("VideoChatMainTabRelativeLayout", "[init]", "initView");
    }

    public VideoChatMainTabRelativeLayout(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (!this.f159706a) {
            this.f159706a = true;
            VideoChatModule.getDependency().getMainDependency().notifyBootMileStoneFirstFrameDraw("videochat");
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (!this.f159707b) {
            this.f159707b = true;
            VideoChatModule.getDependency().getMainDependency().notifyBootMileStoneFirstContentDraw("videochat");
        }
    }

    public VideoChatMainTabRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        m247972a();
    }

    public VideoChatMainTabRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m247972a();
    }
}
