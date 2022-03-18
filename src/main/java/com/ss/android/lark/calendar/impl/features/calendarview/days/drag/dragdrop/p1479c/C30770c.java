package com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1479c;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30756a;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30762c;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30774e;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30775f;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1479c.p1480a.AbstractC30767d;
import com.ss.android.lark.calendar.impl.features.common.dragger.AbstractC31134c;
import com.ss.android.lark.calendar.impl.features.common.dragger.C31133b;

/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.c.c */
public class C30770c extends AbstractC30767d<View> {
    public C30770c(boolean z) {
        super(z);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1479c.p1480a.AbstractC30767d
    /* renamed from: a */
    public void mo111253a(C31133b bVar, View view) {
        m114692e(bVar, view);
        AbstractC30775f fVar = (AbstractC30775f) mo111239a(AbstractC30775f.class);
        if (fVar != null) {
            fVar.mo111184a(bVar, view.getLayoutParams());
        }
        AbstractC30774e eVar = (AbstractC30774e) mo111239a(AbstractC30774e.class);
        if (eVar != null) {
            eVar.mo111125a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1479c.p1480a.AbstractC30767d
    /* renamed from: b */
    public void mo111262b(C31133b bVar, View view) {
        AbstractC30762c cVar = (AbstractC30762c) mo111239a(AbstractC30762c.class);
        if (cVar != null && !cVar.mo111186a()) {
            m114692e(bVar, view);
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            cVar.mo111185a(bVar, view);
        }
    }

    /* renamed from: e */
    private void m114692e(C31133b bVar, View view) {
        float f = bVar.mo112754f() - ((float) bVar.mo112758j());
        AbstractC30756a aVar = (AbstractC30756a) mo111239a(AbstractC30756a.class);
        Rect a = aVar.mo111189a(bVar.mo112753e(), f);
        int i = a.left;
        int i2 = a.top;
        int height = view.getHeight();
        int b = aVar.mo111190b();
        int c = aVar.mo111191c();
        if (i2 < b) {
            i2 = b;
        } else if (i2 + height > c) {
            i2 = c - height;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (aVar.mo111189a((float) layoutParams.leftMargin, (float) layoutParams.topMargin).left != i) {
            layoutParams.leftMargin = i;
        }
        layoutParams.topMargin = i2;
        view.requestLayout();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1479c.p1480a.AbstractC30767d
    /* renamed from: a */
    public void mo111255a(AbstractC31134c cVar, View view, int i) {
        AbstractC30774e eVar = (AbstractC30774e) mo111239a(AbstractC30774e.class);
        AbstractC30756a aVar = (AbstractC30756a) mo111239a(AbstractC30756a.class);
        if (eVar != null && aVar != null) {
            eVar.mo111126a(aVar.mo111188a((int) cVar.mo112753e()), i, -1);
        }
    }
}
