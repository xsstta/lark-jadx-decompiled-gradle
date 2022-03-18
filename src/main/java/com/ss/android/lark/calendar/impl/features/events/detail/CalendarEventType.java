package com.ss.android.lark.calendar.impl.features.events.detail;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/CalendarEventType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "NORMAL_EVENT", "THIRD_PARTY_EVENT", "LOCAL_EVENT", "NOT_JOIN_EVENT", "LIMITED_EVENT", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum CalendarEventType {
    NORMAL_EVENT(0),
    THIRD_PARTY_EVENT(1),
    LOCAL_EVENT(2),
    NOT_JOIN_EVENT(3),
    LIMITED_EVENT(4);
    
    public static final Companion Companion = new Companion(null);
    public static final Map<Integer, CalendarEventType> valueSourceMap;
    private final int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/CalendarEventType$Companion;", "", "()V", "valueSourceMap", "", "", "Lcom/ss/android/lark/calendar/impl/features/events/detail/CalendarEventType;", "fromValue", "value", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.CalendarEventType$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getValue() {
        return this.value;
    }

    static {
        CalendarEventType[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(values.length), 16));
        for (CalendarEventType calendarEventType : values) {
            linkedHashMap.put(Integer.valueOf(calendarEventType.value), calendarEventType);
        }
        valueSourceMap = linkedHashMap;
    }

    private CalendarEventType(int i) {
        this.value = i;
    }
}
