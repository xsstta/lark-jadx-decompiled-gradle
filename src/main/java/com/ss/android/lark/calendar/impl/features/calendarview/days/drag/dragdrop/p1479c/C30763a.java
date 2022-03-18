package com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1479c;

import android.widget.FrameLayout;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30756a;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1478b.AbstractC30757a;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1478b.C30759c;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1478b.C30760d;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1479c.p1480a.C30765b;
import com.ss.android.lark.calendar.impl.features.common.dragger.C31133b;
import com.ss.android.lark.calendar.impl.features.common.dragger.C31136e;

/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.c.a */
public class C30763a extends C30765b<C30759c> {
    /* renamed from: a */
    public void mo111238a(C31136e eVar, C30759c cVar) {
        C30760d dVar = (C30760d) eVar.mo112760l();
        if (dVar != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) dVar.getLayoutParams();
            int f = (layoutParams.height + ((int) eVar.mo112754f())) - (layoutParams.topMargin + layoutParams.height);
            int dragCircleRadius = dVar.getDragCircleRadius();
            if (!mo111247a(f, dragCircleRadius)) {
                layoutParams.height = mo111248b(f, dragCircleRadius);
                dVar.requestLayout();
                mo111245a(dVar.getChipViewLayoutParams());
            }
        }
    }

    /* renamed from: a */
    public void mo111235a(C31133b bVar, C30759c cVar) {
        super.mo111235a(bVar, (AbstractC30757a) cVar);
        C30760d dVar = (C30760d) bVar.mo112760l();
        if (dVar != null) {
            FrameLayout.LayoutParams chipViewLayoutParams = dVar.getChipViewLayoutParams();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) dVar.getLayoutParams();
            int i = layoutParams.leftMargin;
            int i2 = layoutParams.topMargin;
            layoutParams.height = (((AbstractC30756a) mo111239a(AbstractC30756a.class)).mo111189a((float) i, (float) (chipViewLayoutParams.topMargin + chipViewLayoutParams.height)).top - i2) + dVar.getDragCircleRadius();
            dVar.requestLayout();
            mo111245a(dVar.getChipViewLayoutParams());
        }
    }
}
