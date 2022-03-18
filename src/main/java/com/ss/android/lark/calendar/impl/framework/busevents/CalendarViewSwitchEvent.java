package com.ss.android.lark.calendar.impl.framework.busevents;

import com.ss.android.eventbus.BaseEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/busevents/CalendarViewSwitchEvent;", "Lcom/ss/android/eventbus/BaseEvent;", "viewIndex", "", "(I)V", "getViewIndex", "()I", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.framework.a.f */
public final class CalendarViewSwitchEvent extends BaseEvent {

    /* renamed from: a */
    private final int f83297a;

    public CalendarViewSwitchEvent() {
        this(0, 1, null);
    }

    /* renamed from: a */
    public final int mo118646a() {
        return this.f83297a;
    }

    public CalendarViewSwitchEvent(int i) {
        this.f83297a = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CalendarViewSwitchEvent(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 3 : i);
    }
}
