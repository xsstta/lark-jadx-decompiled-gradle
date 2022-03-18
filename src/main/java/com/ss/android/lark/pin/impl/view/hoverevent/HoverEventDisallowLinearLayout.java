package com.ss.android.lark.pin.impl.view.hoverevent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class HoverEventDisallowLinearLayout extends LinearLayout {

    /* renamed from: a */
    private AbstractC51653a f128532a;

    /* renamed from: com.ss.android.lark.pin.impl.view.hoverevent.HoverEventDisallowLinearLayout$a */
    public interface AbstractC51653a {
        /* renamed from: a */
        void mo177701a(boolean z);
    }

    public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        return true;
    }

    public HoverEventDisallowLinearLayout(Context context) {
        super(context);
    }

    public void setHoverChangeListener(AbstractC51653a aVar) {
        this.f128532a = aVar;
    }

    public void setHovered(boolean z) {
        super.setHovered(z);
        AbstractC51653a aVar = this.f128532a;
        if (aVar != null) {
            aVar.mo177701a(z);
        }
    }

    public HoverEventDisallowLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HoverEventDisallowLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
