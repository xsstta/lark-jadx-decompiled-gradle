package com.ss.android.vc.meeting.module.tab3.list.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.p3077b.C60700b;

public class BootRelativeLayout extends LinearLayout {

    /* renamed from: a */
    private boolean f160069a;

    /* renamed from: b */
    private boolean f160070b;

    /* renamed from: a */
    private void m248412a() {
        C60700b.m235851b("VideoChatMainTabRelativeLayout", "[initView]", "start");
    }

    public BootRelativeLayout(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (!this.f160069a) {
            this.f160069a = true;
            VideoChatModule.getDependency().getMainDependency().notifyBootMileStoneFirstFrameDraw("videochat");
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (!this.f160070b) {
            this.f160070b = true;
            VideoChatModule.getDependency().getMainDependency().notifyBootMileStoneFirstContentDraw("videochat");
        }
    }

    public BootRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        m248412a();
    }

    public BootRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m248412a();
    }
}
