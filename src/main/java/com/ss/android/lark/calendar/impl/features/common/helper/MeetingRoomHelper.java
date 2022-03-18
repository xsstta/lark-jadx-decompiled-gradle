package com.ss.android.lark.calendar.impl.features.common.helper;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J)\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/helper/MeetingRoomHelper;", "", "()V", "isInstanceInRequisitionTime", "", "instanceStartTime", "", "instanceEndTime", "resourceRequisition", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceRequisition;", "isMeetingRoomRequisitioned", "startTime", "endTime", "meetingRoom", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "(Ljava/lang/Long;Ljava/lang/Long;Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;)Z", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.common.c.f */
public final class MeetingRoomHelper {

    /* renamed from: a */
    public static final MeetingRoomHelper f78618a = new MeetingRoomHelper();

    private MeetingRoomHelper() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004f A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m116190a(long r11, long r13, com.bytedance.lark.pb.calendar.v1.SchemaExtraData.ResourceRequisition r15) {
        /*
            r10 = this;
            r0 = 0
            if (r15 == 0) goto L_0x0050
            java.lang.Long r1 = r15.start_time
            if (r1 == 0) goto L_0x0050
            r2 = r1
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            r4 = 0
            r6 = 1
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x0017
            r2 = 1
            goto L_0x0018
        L_0x0017:
            r2 = 0
        L_0x0018:
            r3 = 0
            if (r2 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r1 = r3
        L_0x001d:
            if (r1 == 0) goto L_0x0050
            long r1 = r1.longValue()
            java.lang.Long r15 = r15.end_time
            if (r15 == 0) goto L_0x003f
            r7 = r15
            java.lang.Number r7 = (java.lang.Number) r7
            long r7 = r7.longValue()
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 <= 0) goto L_0x0034
            r4 = 1
            goto L_0x0035
        L_0x0034:
            r4 = 0
        L_0x0035:
            if (r4 == 0) goto L_0x0038
            r3 = r15
        L_0x0038:
            if (r3 == 0) goto L_0x003f
            long r3 = r3.longValue()
            goto L_0x0043
        L_0x003f:
            r15 = 2147483647(0x7fffffff, float:NaN)
            long r3 = (long) r15
        L_0x0043:
            long r11 = java.lang.Math.max(r11, r1)
            long r13 = java.lang.Math.min(r13, r3)
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 >= 0) goto L_0x0050
            r0 = 1
        L_0x0050:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.common.helper.MeetingRoomHelper.m116190a(long, long, com.bytedance.lark.pb.calendar.v1.SchemaExtraData$ResourceRequisition):boolean");
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m116191a(Long l, Long l2, CalendarEventAttendee calendarEventAttendee) {
        SchemaExtraData schemaExtraData;
        List<SchemaExtraData.BizData> bizDataList;
        Intrinsics.checkParameterIsNotNull(calendarEventAttendee, "meetingRoom");
        if (!(l == null || l2 == null || (schemaExtraData = calendarEventAttendee.getSchemaExtraData()) == null || (bizDataList = schemaExtraData.getBizDataList()) == null)) {
            for (T t : bizDataList) {
                if (t.getType() == SchemaExtraData.Type.RESOURCE_REQUISITION && f78618a.m116190a(l.longValue(), l2.longValue(), t.getResourceRequisition())) {
                    return true;
                }
            }
        }
        return false;
    }
}
