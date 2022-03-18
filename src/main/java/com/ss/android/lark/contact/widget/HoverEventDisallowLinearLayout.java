package com.ss.android.lark.contact.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class HoverEventDisallowLinearLayout extends LinearLayout {

    /* renamed from: a */
    private AbstractC36080a f93259a;

    /* renamed from: com.ss.android.lark.contact.widget.HoverEventDisallowLinearLayout$a */
    public interface AbstractC36080a {
        /* renamed from: a */
        void mo132668a(boolean z);
    }

    public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        return true;
    }

    public HoverEventDisallowLinearLayout(Context context) {
        super(context);
    }

    public void setHoverChangeListener(AbstractC36080a aVar) {
        this.f93259a = aVar;
    }

    public void setHovered(boolean z) {
        super.setHovered(z);
        AbstractC36080a aVar = this.f93259a;
        if (aVar != null) {
            aVar.mo132668a(z);
        }
    }

    public HoverEventDisallowLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HoverEventDisallowLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
