package com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1479c;

import android.graphics.Rect;
import android.widget.FrameLayout;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30756a;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30774e;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1478b.C30760d;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1479c.p1480a.AbstractC30767d;
import com.ss.android.lark.calendar.impl.features.common.dragger.AbstractC31134c;
import com.ss.android.lark.calendar.impl.features.common.dragger.C31133b;
import com.ss.android.lark.calendar.impl.features.common.dragger.C31138g;

/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.c.d */
public class C30771d<T extends C30760d> extends AbstractC30767d<T> {
    public C30771d(boolean z) {
        super(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo111251a(C30760d dVar, C31133b bVar) {
        if (dVar != null) {
            dVar.mo111224b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo111252a(C30760d dVar, C31138g gVar) {
        if (dVar != null) {
            dVar.mo111223a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo111276b(C31133b bVar, C30760d dVar) {
        AbstractC30756a aVar = (AbstractC30756a) mo111239a(AbstractC30756a.class);
        Rect a = aVar.mo111189a(bVar.mo112753e(), (float) (mo111261b().top + dVar.getDragCircleRadius()));
        int i = a.left;
        int i2 = a.top;
        int height = bVar.mo112759k().getHeight();
        int b = aVar.mo111190b();
        int c = aVar.mo111191c();
        int dragCircleRadius = dVar.getDragCircleRadius();
        int i3 = i2 - dragCircleRadius;
        if (i3 < b) {
            i3 = b - dragCircleRadius;
        } else if (i3 + height > c) {
            i3 = (c - height) + dragCircleRadius;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) dVar.getLayoutParams();
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i3;
        dVar.requestLayout();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.b.d */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo111253a(C31133b bVar, C30760d dVar) {
        mo111276b(bVar, dVar);
        m114696b(bVar, dVar, ((FrameLayout.LayoutParams) dVar.getLayoutParams()).topMargin);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo111255a(AbstractC31134c cVar, T t, int i) {
        m114696b(cVar, t, i);
    }

    /* renamed from: b */
    private <T extends C30760d> void m114696b(AbstractC31134c cVar, T t, int i) {
        AbstractC30774e eVar = (AbstractC30774e) mo111239a(AbstractC30774e.class);
        AbstractC30756a aVar = (AbstractC30756a) mo111239a(AbstractC30756a.class);
        if (eVar != null && aVar != null) {
            int a = aVar.mo111188a((int) cVar.mo112753e());
            int dragCircleRadius = i + t.getDragCircleRadius();
            eVar.mo111126a(a, dragCircleRadius, t.getChipViewLayoutParams().height + dragCircleRadius);
        }
    }
}
