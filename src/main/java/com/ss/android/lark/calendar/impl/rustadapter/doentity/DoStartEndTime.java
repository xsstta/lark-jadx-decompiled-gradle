package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import com.bytedance.lark.pb.calendar.v1.CalendarEventInstanceTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\n \t*\u0004\u0018\u00010\b0\b¢\u0006\u0002\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DoStartEndTime;", "", "startEndTime", "Lcom/bytedance/lark/pb/calendar/v1/CalendarEventInstanceTime;", "(Lcom/bytedance/lark/pb/calendar/v1/CalendarEventInstanceTime;)V", "getStartEndTime", "()Lcom/bytedance/lark/pb/calendar/v1/CalendarEventInstanceTime;", "getEndTime", "", "kotlin.jvm.PlatformType", "()Ljava/lang/Long;", "getStartTime", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.rustadapter.doentity.f */
public final class DoStartEndTime {

    /* renamed from: a */
    private final CalendarEventInstanceTime f83603a;

    /* renamed from: a */
    public final Long mo120085a() {
        return this.f83603a.start_time;
    }

    /* renamed from: b */
    public final Long mo120086b() {
        return this.f83603a.end_time;
    }

    public DoStartEndTime(CalendarEventInstanceTime calendarEventInstanceTime) {
        Intrinsics.checkParameterIsNotNull(calendarEventInstanceTime, "startEndTime");
        this.f83603a = calendarEventInstanceTime;
    }
}
