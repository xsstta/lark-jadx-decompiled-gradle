package com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop;

import com.larksuite.framework.ui.dragger.C26201b;
import com.larksuite.framework.ui.dragger.C26203d;
import com.larksuite.framework.ui.dragger.C26204e;
import com.larksuite.framework.ui.dragger.C26205f;
import com.larksuite.framework.ui.dragger.C26206g;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.a */
public class C30123a<T> implements AbstractC30149n<T> {

    /* renamed from: a */
    private Map<Class<?>, Object> f75128a = new HashMap();

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.AbstractC30149n
    /* renamed from: a */
    public void mo108606a(C26203d dVar, T t) {
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.AbstractC30149n
    /* renamed from: a */
    public void mo108607a(C26204e eVar) {
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.AbstractC30149n
    /* renamed from: a */
    public void mo108608a(C26204e eVar, T t) {
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.AbstractC30149n
    /* renamed from: a */
    public void mo108609a(C26205f fVar, T t) {
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.AbstractC30149n
    /* renamed from: b */
    public void mo108612b() {
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.AbstractC30149n
    /* renamed from: b */
    public void mo108613b(C26201b bVar, T t) {
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.AbstractC30149n
    /* renamed from: b */
    public void mo108614b(C26204e eVar, T t) {
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.AbstractC30149n
    /* renamed from: a */
    public void mo108604a() {
        this.f75128a.clear();
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.AbstractC30149n
    /* renamed from: a */
    public <R> R mo108603a(Class<? extends R> cls) {
        return (R) this.f75128a.get(cls);
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.AbstractC30149n
    /* renamed from: a */
    public void mo108605a(C26201b bVar, T t) {
        CalendarDaysContract.AbstractC30655a aVar = (CalendarDaysContract.AbstractC30655a) mo108603a(CalendarDaysContract.AbstractC30655a.class);
        if (aVar != null) {
            aVar.mo108703b();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.AbstractC30149n
    /* renamed from: a */
    public void mo108610a(C26206g gVar, T t) {
        CalendarDaysContract.AbstractC30655a aVar = (CalendarDaysContract.AbstractC30655a) mo108603a(CalendarDaysContract.AbstractC30655a.class);
        if (aVar != null) {
            aVar.mo108701a();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.AbstractC30149n
    /* renamed from: a */
    public void mo108611a(Class<?> cls, Object obj) {
        this.f75128a.put(cls, obj);
    }
}
