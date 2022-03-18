package com.ss.android.lark.calendar.impl.features.meetingroom.base.extension;

import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0003\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0004¨\u0006\u0005"}, d2 = {"getResourceStrategy", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceStrategy;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/SchemaExtraData;", "calendar-impl_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.extension.f */
public final class C32068f {
    /* renamed from: a */
    public static final SchemaExtraData.ResourceStrategy m121958a(CalendarEventAttendee calendarEventAttendee) {
        Intrinsics.checkParameterIsNotNull(calendarEventAttendee, "$this$getResourceStrategy");
        com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData schemaExtraData = calendarEventAttendee.getSchemaExtraData();
        if (schemaExtraData != null) {
            return m121960a(schemaExtraData);
        }
        return null;
    }

    /* renamed from: a */
    public static final SchemaExtraData.ResourceStrategy m121959a(CalendarResource calendarResource) {
        Intrinsics.checkParameterIsNotNull(calendarResource, "$this$getResourceStrategy");
        com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData schemaExtraData = calendarResource.getSchemaExtraData();
        if (schemaExtraData != null) {
            return m121960a(schemaExtraData);
        }
        return null;
    }

    /* renamed from: a */
    public static final SchemaExtraData.ResourceStrategy m121960a(com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData schemaExtraData) {
        Intrinsics.checkParameterIsNotNull(schemaExtraData, "$this$getResourceStrategy");
        for (T t : schemaExtraData.getBizDataList()) {
            if (t.getType() == SchemaExtraData.Type.RESOURCE_STRATEGY && t.getResourceStrategy() != null) {
                return t.getResourceStrategy();
            }
        }
        return null;
    }
}
