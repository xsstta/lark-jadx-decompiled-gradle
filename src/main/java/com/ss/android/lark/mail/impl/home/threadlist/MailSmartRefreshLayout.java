package com.ss.android.lark.mail.impl.home.threadlist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.ss.android.lark.log.Log;

public class MailSmartRefreshLayout extends SmartRefreshLayout {
    private boolean aS = true;

    public MailSmartRefreshLayout(Context context) {
        super(context);
    }

    @Override // com.scwang.smart.refresh.layout.SmartRefreshLayout
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.aS) {
            try {
                return super.dispatchTouchEvent(motionEvent);
            } catch (NullPointerException e) {
                Log.m165385e("MailSmartRefreshLayout", "NullPointerException", e, true);
            }
        }
        return true;
    }

    public MailSmartRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
