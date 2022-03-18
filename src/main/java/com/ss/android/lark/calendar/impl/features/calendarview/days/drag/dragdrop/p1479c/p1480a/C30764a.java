package com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1479c.p1480a;

import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.AbstractC30773d;
import com.ss.android.lark.calendar.impl.features.common.dragger.C31133b;
import com.ss.android.lark.calendar.impl.features.common.dragger.C31136e;
import com.ss.android.lark.calendar.impl.features.common.dragger.C31138g;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.c.a.a */
public class C30764a<T> implements AbstractC30766c<T> {

    /* renamed from: a */
    private Map<Class<?>, Object> f77276a = new HashMap();

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1479c.p1480a.AbstractC30766c
    /* renamed from: a */
    public void mo111238a(C31136e eVar, T t) {
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1479c.p1480a.AbstractC30766c
    /* renamed from: b */
    public void mo111243b(C31133b bVar, T t) {
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1479c.p1480a.AbstractC30766c
    /* renamed from: b */
    public void mo111244b(C31136e eVar, T t) {
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1479c.p1480a.AbstractC30766c
    /* renamed from: a */
    public void mo111240a() {
        this.f77276a.clear();
    }

    /* renamed from: a */
    public <R> R mo111239a(Class<? extends R> cls) {
        return (R) this.f77276a.get(cls);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1479c.p1480a.AbstractC30766c
    /* renamed from: a */
    public void mo111235a(C31133b bVar, T t) {
        AbstractC30773d dVar = (AbstractC30773d) mo111239a(AbstractC30773d.class);
        if (dVar != null) {
            dVar.mo111122b();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1479c.p1480a.AbstractC30766c
    /* renamed from: a */
    public void mo111241a(C31138g gVar, T t) {
        AbstractC30773d dVar = (AbstractC30773d) mo111239a(AbstractC30773d.class);
        if (dVar != null) {
            dVar.mo111120a();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1479c.p1480a.AbstractC30766c
    /* renamed from: a */
    public void mo111242a(Class<?> cls, Object obj) {
        this.f77276a.put(cls, obj);
    }
}
