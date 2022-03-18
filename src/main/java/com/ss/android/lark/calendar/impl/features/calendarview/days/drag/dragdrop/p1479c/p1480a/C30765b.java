package com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1479c.p1480a;

import android.widget.FrameLayout;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30756a;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30774e;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1478b.AbstractC30757a;
import com.ss.android.lark.calendar.impl.features.common.dragger.C31133b;
import com.ss.android.lark.calendar.impl.features.common.dragger.C31136e;
import com.ss.android.lark.calendar.impl.features.common.dragger.C31138g;
import com.ss.android.lark.calendar.impl.utils.ao;

/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.c.a.b */
public class C30765b<T extends AbstractC30757a> extends C30764a<T> {
    /* renamed from: a */
    public void mo111238a(C31136e eVar, T t) {
    }

    /* renamed from: b */
    private int m114644b() {
        AbstractC30756a aVar = (AbstractC30756a) mo111239a(AbstractC30756a.class);
        if (aVar != null) {
            return aVar.mo111187a();
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo111245a(FrameLayout.LayoutParams layoutParams) {
        AbstractC30756a aVar = (AbstractC30756a) mo111239a(AbstractC30756a.class);
        if (aVar != null) {
            int a = aVar.mo111188a(layoutParams.leftMargin);
            int i = layoutParams.topMargin;
            int i2 = layoutParams.height + i;
            AbstractC30774e eVar = (AbstractC30774e) mo111239a(AbstractC30774e.class);
            if (eVar != null) {
                eVar.mo111126a(a, i, i2);
            }
        }
    }

    /* renamed from: a */
    public void mo111235a(C31133b bVar, T t) {
        super.mo111235a(bVar, (Object) t);
        if (t != null) {
            t.mo111213c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo111248b(int i, int i2) {
        int b = m114644b();
        if (b != -1) {
            int a = ao.m125215a();
            int i3 = b + (i2 * 2);
            if (i < i3 - a || i > a + i3) {
                return i;
            }
            return i3;
        }
        return i;
    }

    /* renamed from: a */
    public void mo111241a(C31138g gVar, T t) {
        super.mo111241a(gVar, (Object) t);
        if (t != null) {
            t.mo111212b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo111247a(int i, int i2) {
        int b = m114644b();
        if (b == -1 || i > b + (i2 * 2)) {
            return false;
        }
        return true;
    }
}
