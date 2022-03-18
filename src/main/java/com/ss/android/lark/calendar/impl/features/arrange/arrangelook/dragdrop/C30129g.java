package com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop;

import android.widget.FrameLayout;
import com.larksuite.framework.ui.dragger.C26201b;
import com.larksuite.framework.ui.dragger.C26204e;
import com.larksuite.framework.ui.dragger.C26206g;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.AbstractC30124b;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract;
import com.ss.android.lark.calendar.impl.utils.ao;

/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.g */
public class C30129g<T extends AbstractC30124b> extends C30123a<T> {
    /* renamed from: a */
    public void mo108608a(C26204e eVar, T t) {
    }

    /* renamed from: c */
    private int m111565c() {
        AbstractC30150o oVar = (AbstractC30150o) mo108603a(AbstractC30150o.class);
        if (oVar != null) {
            return oVar.mo108694c();
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo108631a(FrameLayout.LayoutParams layoutParams) {
        AbstractC30150o oVar = (AbstractC30150o) mo108603a(AbstractC30150o.class);
        if (oVar != null) {
            int a = oVar.mo108691a(layoutParams.leftMargin);
            int i = layoutParams.topMargin;
            int i2 = layoutParams.height + i;
            CalendarDaysContract.AbstractC30656b bVar = (CalendarDaysContract.AbstractC30656b) mo108603a(CalendarDaysContract.AbstractC30656b.class);
            if (bVar != null) {
                bVar.mo108689a(a, i, i2);
            }
        }
    }

    /* renamed from: a */
    public void mo108605a(C26201b bVar, T t) {
        super.mo108605a(bVar, (Object) t);
        if (t != null) {
            t.mo108617c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo108634b(int i, int i2) {
        int c = m111565c();
        if (c != -1) {
            int a = ao.m125215a();
            int i3 = c + (i2 * 2);
            if (i < i3 - a || i > a + i3) {
                return i;
            }
            return i3;
        }
        return i;
    }

    /* renamed from: a */
    public void mo108610a(C26206g gVar, T t) {
        super.mo108610a(gVar, (Object) t);
        if (t != null) {
            t.mo108616b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo108633a(int i, int i2) {
        int c = m111565c();
        if (c == -1 || i > c + (i2 * 2)) {
            return false;
        }
        return true;
    }
}
