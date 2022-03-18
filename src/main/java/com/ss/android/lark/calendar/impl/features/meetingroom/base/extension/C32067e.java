package com.ss.android.lark.calendar.impl.features.meetingroom.base.extension;

import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"getResourceRequisition", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceRequisition;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "calendar-impl_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.extension.e */
public final class C32067e {
    /* renamed from: a */
    public static final SchemaExtraData.ResourceRequisition m121957a(CalendarResource calendarResource) {
        List<SchemaExtraData.BizData> bizDataList;
        Intrinsics.checkParameterIsNotNull(calendarResource, "$this$getResourceRequisition");
        com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData schemaExtraData = calendarResource.getSchemaExtraData();
        if (!(schemaExtraData == null || (bizDataList = schemaExtraData.getBizDataList()) == null)) {
            for (T t : bizDataList) {
                if (t.getType() == SchemaExtraData.Type.RESOURCE_REQUISITION) {
                    return t.getResourceRequisition();
                }
            }
        }
        return null;
    }
}
