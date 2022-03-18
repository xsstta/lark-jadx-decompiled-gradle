package com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.larksuite.framework.ui.dragger.AbstractC26202c;
import com.larksuite.framework.ui.dragger.C26201b;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.C30132j;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract;

/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.m */
public class C30148m<T extends C30132j> extends C30159x<T> {
    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.C30123a, com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.AbstractC30149n
    /* renamed from: b */
    public void mo108612b() {
        CalendarDaysContract.AbstractC30656b bVar = (CalendarDaysContract.AbstractC30656b) mo108603a(CalendarDaysContract.AbstractC30656b.class);
        if (bVar != null) {
            bVar.mo108688a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo108635a(C30132j jVar) {
        if (jVar != null) {
            jVar.getEventChipView().mo112563d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo108640b(C30132j jVar) {
        if (jVar != null) {
            jVar.getEventChipView().mo112561c();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.j */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo108624a(C26201b bVar, C30132j jVar) {
        mo108712b(bVar, jVar);
        m111664b(bVar, jVar, ((FrameLayout.LayoutParams) jVar.getLayoutParams()).topMargin);
        AbstractC30156u uVar = (AbstractC30156u) mo108603a(AbstractC30156u.class);
        if (uVar != null) {
            uVar.mo108684a((ViewGroup) jVar.getParent(), jVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo108712b(C26201b bVar, C30132j jVar) {
        AbstractC30150o oVar = (AbstractC30150o) mo108603a(AbstractC30150o.class);
        Rect a = oVar.mo108692a(bVar.mo93196c(), (float) (mo108722c().top + jVar.getDragCircleRadius()));
        int i = a.left;
        int i2 = a.top;
        int height = bVar.mo93202i().getHeight();
        int a2 = oVar.mo108690a();
        int b = oVar.mo108693b();
        int dragCircleRadius = jVar.getDragCircleRadius();
        int i3 = i2 - dragCircleRadius;
        if (i3 < a2) {
            i3 = a2 - dragCircleRadius;
        } else if (i3 + height > b) {
            i3 = (b - height) + dragCircleRadius;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) jVar.getLayoutParams();
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i3;
        jVar.requestLayout();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo108637a(AbstractC26202c cVar, T t, int i) {
        m111664b(cVar, t, i);
    }

    /* renamed from: b */
    private <T extends C30132j> void m111664b(AbstractC26202c cVar, T t, int i) {
        CalendarDaysContract.AbstractC30656b bVar = (CalendarDaysContract.AbstractC30656b) mo108603a(CalendarDaysContract.AbstractC30656b.class);
        AbstractC30150o oVar = (AbstractC30150o) mo108603a(AbstractC30150o.class);
        if (bVar != null && oVar != null) {
            int a = oVar.mo108691a((int) cVar.mo93196c());
            int dragCircleRadius = i + t.getDragCircleRadius();
            bVar.mo108689a(a, dragCircleRadius, t.getChipViewLayoutParams().height + dragCircleRadius);
        }
    }
}
