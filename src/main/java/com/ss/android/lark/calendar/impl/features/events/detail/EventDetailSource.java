package com.ss.android.lark.calendar.impl.features.events.detail;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\b\u0001\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/EventDetailSource;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "FROM_CALENDAR_VIEW", "FROM_BOT", "FROM_APPEND", "FROM_REMINDER", "FROM_SHARE_EVENT", "FROM_MEETING_CHAT_CARD", "FROM_CALENDAR_VIEW_LOCAL", "FROM_CALENDAR_GENERAL_BOT", "FROM_PREEMPT_MEETING_ROOM", "FROM_VCHAT_CARD", "FROM_RSVP_COMMENT_BOT", "FROM_CALENDAR_SEARCH", "FROM_EMAIL", "FROM_VCHAT_NOTIFICATION", "FROM_OFFLINE_PUSH", "FROM_SHARE_APP_LINK", "FROM_CALENDAR_NOTIFICATION", "FROM_ROOM_VIEW_NOT_ACCESSIBLE", "FROM_AUTHORIZED_APP_LINK", "FROM_ROOM_VIEW_ACCESSIBLE", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum EventDetailSource {
    FROM_CALENDAR_VIEW(0),
    FROM_BOT(1),
    FROM_APPEND(2),
    FROM_REMINDER(3),
    FROM_SHARE_EVENT(4),
    FROM_MEETING_CHAT_CARD(5),
    FROM_CALENDAR_VIEW_LOCAL(6),
    FROM_CALENDAR_GENERAL_BOT(7),
    FROM_PREEMPT_MEETING_ROOM(8),
    FROM_VCHAT_CARD(9),
    FROM_RSVP_COMMENT_BOT(10),
    FROM_CALENDAR_SEARCH(11),
    FROM_EMAIL(12),
    FROM_VCHAT_NOTIFICATION(13),
    FROM_OFFLINE_PUSH(14),
    FROM_SHARE_APP_LINK(15),
    FROM_CALENDAR_NOTIFICATION(16),
    FROM_ROOM_VIEW_NOT_ACCESSIBLE(17),
    FROM_AUTHORIZED_APP_LINK(18),
    FROM_ROOM_VIEW_ACCESSIBLE(19);
    
    public static final Companion Companion = new Companion(null);
    public static final Map<Integer, EventDetailSource> valueSourceMap;
    private final int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/EventDetailSource$Companion;", "", "()V", "valueSourceMap", "", "", "Lcom/ss/android/lark/calendar/impl/features/events/detail/EventDetailSource;", "fromValue", "value", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.EventDetailSource$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final EventDetailSource mo113373a(int i) {
            return EventDetailSource.valueSourceMap.get(Integer.valueOf(i));
        }
    }

    public final int getValue() {
        return this.value;
    }

    static {
        EventDetailSource[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(values.length), 16));
        for (EventDetailSource eventDetailSource : values) {
            linkedHashMap.put(Integer.valueOf(eventDetailSource.value), eventDetailSource);
        }
        valueSourceMap = linkedHashMap;
    }

    private EventDetailSource(int i) {
        this.value = i;
    }
}
