package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import com.bytedance.lark.pb.calendar.v1.CalendarEventUniqueField;
import com.bytedance.lark.pb.calendar.v1.ChangedEventCollections;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bJ\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bJ\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bR\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/EventChangeCollection;", "", "sdkChangedCollections", "Lcom/bytedance/lark/pb/calendar/v1/ChangedEventCollections;", "(Lcom/bytedance/lark/pb/calendar/v1/ChangedEventCollections;)V", "addedEvents", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventUniqueField;", "Lkotlin/collections/ArrayList;", "deletedEvents", "updatedEvents", "getAddedEvents", "getDeletedEvents", "getUpdatedEvents", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.rustadapter.doentity.h */
public final class EventChangeCollection {

    /* renamed from: a */
    private final ArrayList<CalendarEventUniqueField> f83606a = new ArrayList<>();

    /* renamed from: b */
    private final ArrayList<CalendarEventUniqueField> f83607b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<CalendarEventUniqueField> f83608c = new ArrayList<>();

    /* renamed from: a */
    public final ArrayList<CalendarEventUniqueField> mo120089a() {
        return this.f83607b;
    }

    public EventChangeCollection(ChangedEventCollections changedEventCollections) {
        Intrinsics.checkParameterIsNotNull(changedEventCollections, "sdkChangedCollections");
        List<CalendarEventUniqueField> list = changedEventCollections.added_event_unique_fields;
        if (list != null) {
            for (T t : list) {
                this.f83606a.add(new CalendarEventUniqueField(t.calendar_id, t.key, t.original_time));
            }
        }
        List<CalendarEventUniqueField> list2 = changedEventCollections.updated_event_unique_fields;
        if (list2 != null) {
            for (T t2 : list2) {
                this.f83607b.add(new CalendarEventUniqueField(t2.calendar_id, t2.key, t2.original_time));
            }
        }
        List<CalendarEventUniqueField> list3 = changedEventCollections.deleted_event_unique_fields;
        if (list3 != null) {
            for (T t3 : list3) {
                this.f83608c.add(new CalendarEventUniqueField(t3.calendar_id, t3.key, t3.original_time));
            }
        }
    }
}
