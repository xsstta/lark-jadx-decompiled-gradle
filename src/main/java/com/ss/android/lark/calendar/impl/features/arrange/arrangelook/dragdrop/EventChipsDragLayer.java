package com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.larksuite.framework.ui.dragger.C26213k;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.C30167c;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.EventChipsViewLayer;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.p1442a.C30103a;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract;

public class EventChipsDragLayer extends FrameLayout {

    /* renamed from: a */
    private C30103a f75126a = new C30103a();

    /* renamed from: b */
    private C30133k f75127b;

    public C30133k getDragDelegate() {
        return this.f75127b;
    }

    /* renamed from: a */
    public void mo108588a() {
        this.f75127b.mo108677c();
    }

    /* renamed from: b */
    public void mo108590b() {
        this.f75127b.mo108676b();
    }

    /* renamed from: c */
    public void mo108591c() {
        this.f75127b.mo108678d();
    }

    /* renamed from: d */
    public void mo108592d() {
        setOnTouchListener(null);
    }

    public void setAppendDragType(int i) {
        this.f75127b.mo108656a(i);
    }

    public void setDate(CalendarDate calendarDate) {
        this.f75127b.mo108669a(calendarDate);
    }

    public void setDragger(C26213k kVar) {
        this.f75127b.mo108663a(kVar);
    }

    public void setEventChipsGridLine(C30167c cVar) {
        this.f75127b.mo108668a(cVar);
    }

    public void setEventChipsLayer(EventChipsViewLayer eventChipsViewLayer) {
        this.f75127b.mo108667a(eventChipsViewLayer);
    }

    public void setEventDrag(CalendarDaysContract.AbstractC30655a aVar) {
        this.f75127b.mo108670a(aVar);
    }

    public void setEventOnSelected(CalendarDaysContract.AbstractC30656b bVar) {
        this.f75127b.mo108671a(bVar);
    }

    public void setOnSaveEventInstance(CalendarDaysContract.AbstractC30657c cVar) {
        this.f75127b.mo108672a(cVar);
    }

    public void setViewDependency(CalendarDaysContract.AbstractC30658d dVar) {
        this.f75127b.mo108673a(dVar);
    }

    public EventChipsDragLayer(Context context) {
        super(context);
        m111528a(context);
    }

    /* renamed from: a */
    private void m111528a(Context context) {
        C30133k kVar = new C30133k(context, this);
        this.f75127b = kVar;
        setOnTouchListener(kVar.mo108679e());
    }

    /* renamed from: a */
    public void mo108589a(EventChipsDragLayer eventChipsDragLayer) {
        this.f75127b.mo108664a(eventChipsDragLayer);
    }

    public EventChipsDragLayer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m111528a(context);
    }
}
