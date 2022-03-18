package com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.larksuite.framework.ui.dragger.AbstractC26202c;
import com.larksuite.framework.ui.dragger.C26201b;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.EventChipView;

/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.i */
public class C30131i extends C30159x<EventChipView> {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo108635a(EventChipView eventChipView) {
        if (eventChipView != null) {
            eventChipView.mo112563d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo108640b(EventChipView eventChipView) {
        if (eventChipView != null) {
            eventChipView.mo112561c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo108641b(C26201b bVar, EventChipView eventChipView) {
        AbstractC30152q qVar = (AbstractC30152q) mo108603a(AbstractC30152q.class);
        if (!qVar.mo108687a()) {
            m111576c(bVar, eventChipView);
            ViewGroup viewGroup = (ViewGroup) eventChipView.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(eventChipView);
            }
            if (qVar != null) {
                qVar.mo108686a(bVar, eventChipView);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo108624a(C26201b bVar, EventChipView eventChipView) {
        m111576c(bVar, eventChipView);
        AbstractC30155t tVar = (AbstractC30155t) mo108603a(AbstractC30155t.class);
        if (tVar != null) {
            tVar.mo108685a((ViewGroup) eventChipView.getParent(), eventChipView);
        }
        AbstractC30153r rVar = (AbstractC30153r) mo108603a(AbstractC30153r.class);
        if (rVar != null) {
            rVar.mo108704a(eventChipView, eventChipView.getLayoutParams());
        }
        CalendarDaysContract.AbstractC30656b bVar2 = (CalendarDaysContract.AbstractC30656b) mo108603a(CalendarDaysContract.AbstractC30656b.class);
        if (bVar2 != null) {
            bVar2.mo108688a();
        }
    }

    /* renamed from: c */
    private void m111576c(C26201b bVar, EventChipView eventChipView) {
        float d = bVar.mo93197d() - ((float) bVar.mo93201h());
        AbstractC30150o oVar = (AbstractC30150o) mo108603a(AbstractC30150o.class);
        Rect a = oVar.mo108692a(bVar.mo93196c(), d);
        int i = a.left;
        int i2 = a.top;
        int height = eventChipView.getHeight();
        int a2 = oVar.mo108690a();
        int b = oVar.mo108693b();
        if (i2 < a2) {
            i2 = a2;
        } else if (i2 + height > b) {
            i2 = b - height;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) eventChipView.getLayoutParams();
        if (oVar.mo108692a((float) layoutParams.leftMargin, (float) layoutParams.topMargin).left != i) {
            layoutParams.leftMargin = i;
        }
        layoutParams.topMargin = i2;
        eventChipView.requestLayout();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo108637a(AbstractC26202c cVar, EventChipView eventChipView, int i) {
        CalendarDaysContract.AbstractC30656b bVar = (CalendarDaysContract.AbstractC30656b) mo108603a(CalendarDaysContract.AbstractC30656b.class);
        AbstractC30150o oVar = (AbstractC30150o) mo108603a(AbstractC30150o.class);
        if (bVar != null && oVar != null) {
            bVar.mo108689a(oVar.mo108691a((int) cVar.mo93196c()), i, -1);
        }
    }
}
