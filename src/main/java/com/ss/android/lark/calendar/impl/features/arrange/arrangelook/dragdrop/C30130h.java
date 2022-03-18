package com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop;

import android.view.View;
import com.larksuite.framework.ui.dragger.AbstractC26202c;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.EventChipView;

/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.h */
public class C30130h {
    /* renamed from: a */
    public static AbstractC30149n<View> m111575a(AbstractC26202c cVar) {
        View i = cVar.mo93202i();
        if (i instanceof EventChipView) {
            return new C30131i();
        }
        if (i instanceof C30125c) {
            return new C30126d();
        }
        if (i instanceof C30158w) {
            return new C30157v();
        }
        if (i instanceof C30128f) {
            return new C30127e();
        }
        return new C30148m();
    }
}
