package com.ss.android.lark.calendar.impl.features.calendars.detail.p1448b;

import com.bytedance.lark.pb.calendar.v1.CalendarResource;
import com.bytedance.lark.pb.calendar.v1.EventInfoInstances;
import com.bytedance.lark.pb.calendar.v1.InstanceSpan;
import com.ss.android.lark.calendar.impl.features.calendars.p1446a.C30237a;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, d2 = {"buildInstanceCard", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/InstanceCardInfo;", "calServerId", "", "instanceDay", "", "instance", "Lcom/bytedance/lark/pb/calendar/v1/EventInfoInstances;", "span", "Lcom/bytedance/lark/pb/calendar/v1/InstanceSpan;", "calendarResource", "Lcom/bytedance/lark/pb/calendar/v1/CalendarResource;", "calendar-impl_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.b.i */
public final class C30251i {
    /* renamed from: a */
    public static final InstanceCardInfo m112378a(String str, int i, EventInfoInstances eventInfoInstances, InstanceSpan instanceSpan, CalendarResource calendarResource) {
        long j;
        int i2;
        Intrinsics.checkParameterIsNotNull(str, "calServerId");
        Intrinsics.checkParameterIsNotNull(eventInfoInstances, "instance");
        Intrinsics.checkParameterIsNotNull(instanceSpan, "span");
        String str2 = eventInfoInstances.key;
        if (str2 == null) {
            str2 = "";
        }
        Long l = eventInfoInstances.original_time;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        Long l2 = instanceSpan.start_time;
        Intrinsics.checkExpressionValueIsNotNull(l2, "span.start_time");
        long longValue = l2.longValue();
        Long l3 = instanceSpan.end_time;
        Intrinsics.checkExpressionValueIsNotNull(l3, "span.end_time");
        long longValue2 = l3.longValue();
        CalendarDate a = C30237a.m112286a(instanceSpan, i);
        String a2 = C30237a.m112291a(eventInfoInstances, instanceSpan, i);
        String a3 = C30237a.m112292a(eventInfoInstances, instanceSpan, i, calendarResource);
        Integer num = eventInfoInstances.color;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        return new InstanceCardInfo(str, str2, j, longValue, longValue2, a, a2, a3, i2, Intrinsics.areEqual((Object) eventInfoInstances.is_all_day, (Object) true));
    }
}
