package com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1479c;

import android.widget.FrameLayout;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30756a;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1478b.AbstractC30757a;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1478b.C30760d;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1478b.C30761e;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1479c.p1480a.C30765b;
import com.ss.android.lark.calendar.impl.features.common.dragger.C31133b;
import com.ss.android.lark.calendar.impl.features.common.dragger.C31136e;

/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.c.e */
public class C30772e extends C30765b<C30761e> {
    /* renamed from: a */
    public void mo111235a(C31133b bVar, C30761e eVar) {
        super.mo111235a(bVar, (AbstractC30757a) eVar);
        C30760d dVar = (C30760d) bVar.mo112760l();
        if (dVar != null) {
            FrameLayout.LayoutParams chipViewLayoutParams = dVar.getChipViewLayoutParams();
            int i = chipViewLayoutParams.leftMargin;
            int i2 = chipViewLayoutParams.topMargin;
            int i3 = ((AbstractC30756a) mo111239a(AbstractC30756a.class)).mo111189a((float) i, (float) i2).top - i2;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) dVar.getLayoutParams();
            layoutParams.topMargin += i3;
            layoutParams.height -= i3;
            dVar.requestLayout();
            mo111245a(dVar.getChipViewLayoutParams());
        }
    }

    /* renamed from: a */
    public void mo111238a(C31136e eVar, C30761e eVar2) {
        C30760d dVar = (C30760d) eVar.mo112760l();
        if (dVar != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) dVar.getLayoutParams();
            int f = (int) eVar.mo112754f();
            int i = (layoutParams.topMargin + layoutParams.height) - f;
            int dragCircleRadius = eVar2.getDragCircleRadius();
            if (!mo111247a(i, dragCircleRadius)) {
                int b = mo111248b(i, dragCircleRadius);
                layoutParams.topMargin = f + (i - b);
                layoutParams.height = b;
                dVar.requestLayout();
                mo111245a(dVar.getChipViewLayoutParams());
            }
        }
    }
}
