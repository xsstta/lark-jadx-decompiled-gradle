package com.ss.android.vc.meeting.module.tab.history.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.p3077b.C60700b;

public class VideoChatMainTabRelativeLayout2 extends RelativeLayout {

    /* renamed from: a */
    private boolean f159708a;

    /* renamed from: b */
    private boolean f159709b;

    /* renamed from: a */
    private void m247973a() {
        C60700b.m235851b("VideoChatMainTabRelativeLayout2", "[init]", "initView");
    }

    public VideoChatMainTabRelativeLayout2(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (!this.f159708a) {
            this.f159708a = true;
            VideoChatModule.getDependency().getMainDependency().notifyBootMileStoneFirstFrameDraw("videochat");
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (!this.f159709b) {
            this.f159709b = true;
            VideoChatModule.getDependency().getMainDependency().notifyBootMileStoneFirstContentDraw("videochat");
        }
    }

    public VideoChatMainTabRelativeLayout2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        m247973a();
    }

    public VideoChatMainTabRelativeLayout2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m247973a();
    }
}
