package com.ss.android.lark.calendar.impl.features.calendarview.days.drag.p1474a;

import android.content.Context;
import android.content.Intent;
import android.widget.FrameLayout;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.PiecesDragger;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30773d;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30774e;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.IOnAppendTimeSelected;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.p1474a.C30748b;
import com.ss.android.lark.calendar.impl.features.calendarview.days.layers.DayChipsLayer;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import java.util.List;

/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.drag.a.a */
public class C30745a extends FrameLayout {

    /* renamed from: a */
    private C30748b f77198a;

    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.drag.a.a$a */
    public interface AbstractC30746a {
        /* renamed from: a */
        void mo111124a(Intent intent);
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.drag.a.a$b */
    public interface AbstractC30747b {
        /* renamed from: a */
        void mo111123a(CalendarEventInstance calendarEventInstance, long j, long j2);
    }

    /* renamed from: a */
    public void mo111147a() {
        this.f77198a.mo111180d();
    }

    /* renamed from: b */
    public void mo111150b() {
        this.f77198a.mo111178c();
    }

    public void setAppendOnSelected(IOnAppendTimeSelected bVar) {
        this.f77198a.mo111170a(bVar);
    }

    public void setChipsLayerList(List<DayChipsLayer> list) {
        this.f77198a.mo111175a(list);
    }

    public void setClickAppendViewListener(AbstractC30746a aVar) {
        this.f77198a.mo111166a(aVar);
    }

    public void setDate(int i) {
        this.f77198a.mo111179c(i);
    }

    public void setDefaultEventDuration(int i) {
        this.f77198a.mo111177b(i);
    }

    public void setDragger(PiecesDragger bVar) {
        this.f77198a.mo111169a(bVar);
    }

    public void setEventDrag(AbstractC30773d dVar) {
        this.f77198a.mo111171a(dVar);
    }

    public void setEventOnSelected(AbstractC30774e eVar) {
        this.f77198a.mo111172a(eVar);
    }

    public void setLayoutComputer(C30748b.AbstractC30754a aVar) {
        this.f77198a.mo111168a(aVar);
    }

    public void setOnSaveEventInstance(AbstractC30747b bVar) {
        this.f77198a.mo111167a(bVar);
    }

    public void setSupportMultiTimeZone(boolean z) {
        this.f77198a.f77210i = z;
    }

    /* renamed from: a */
    public void mo111148a(int i) {
        this.f77198a.mo111165a(i);
    }

    public C30745a(Context context) {
        super(context);
        C30748b bVar = new C30748b(context, this);
        this.f77198a = bVar;
        setOnTouchListener(bVar.mo111181e());
    }

    /* renamed from: a */
    public void mo111149a(boolean z) {
        this.f77198a.f77209h = z;
    }
}
