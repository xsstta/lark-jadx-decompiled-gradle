package com.ss.android.vc.meeting.module.chat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;

public class VcChatLayout extends ConstraintLayout {

    /* renamed from: a */
    private AbstractC61565a f154452a;

    /* renamed from: com.ss.android.vc.meeting.module.chat.VcChatLayout$a */
    public interface AbstractC61565a {
        /* renamed from: a */
        boolean mo213361a(MotionEvent motionEvent);
    }

    public VcChatLayout(Context context) {
        super(context);
    }

    public void setDispatchTouchEventListener(AbstractC61565a aVar) {
        this.f154452a = aVar;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AbstractC61565a aVar = this.f154452a;
        if (aVar != null) {
            aVar.mo213361a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public VcChatLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VcChatLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
