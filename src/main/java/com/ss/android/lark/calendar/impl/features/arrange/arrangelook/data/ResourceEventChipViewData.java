package com.ss.android.lark.calendar.impl.features.arrange.arrangelook.data;

import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.DayEventChipViewData;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/data/ResourceEventChipViewData;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/DayEventChipViewData;", "chipViewData", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/DayEventChipViewData;)V", "getEventTitle", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ResourceEventChipViewData extends DayEventChipViewData {
    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData
    public String getEventTitle() {
        boolean z;
        CalendarEventInstance calendarEventInstance = getCalendarEventInstance();
        Intrinsics.checkExpressionValueIsNotNull(calendarEventInstance, "calendarEventInstance");
        if (calendarEventInstance.getDisplayType() == CalendarEvent.DisplayType.LIMITED) {
            CalendarEvent.Category category = CalendarEvent.Category.RESOURCE_REQUISITION;
            CalendarEventInstance calendarEventInstance2 = getCalendarEventInstance();
            Intrinsics.checkExpressionValueIsNotNull(calendarEventInstance2, "calendarEventInstance");
            if (category == calendarEventInstance2.getCategory()) {
                String b = C32634ae.m125182b(R.string.Calendar_Edit_MeetingRoomInactiveCantReserve);
                Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(string…gRoomInactiveCantReserve)");
                return b;
            }
            CalendarEvent.Category category2 = CalendarEvent.Category.RESOURCE_STRATEGY;
            CalendarEventInstance calendarEventInstance3 = getCalendarEventInstance();
            Intrinsics.checkExpressionValueIsNotNull(calendarEventInstance3, "calendarEventInstance");
            if (category2 == calendarEventInstance3.getCategory()) {
                String b2 = C32634ae.m125182b(R.string.Calendar_MeetingView_MeetingRoomCantReservePeriod);
                Intrinsics.checkExpressionValueIsNotNull(b2, "ResUtil.getString(string…ingRoomCantReservePeriod)");
                return b2;
            }
            String b3 = C32634ae.m125182b(R.string.Calendar_View_Reserved);
            Intrinsics.checkExpressionValueIsNotNull(b3, "ResUtil.getString(string.Calendar_View_Reserved)");
            return b3;
        }
        CalendarEventInstance calendarEventInstance4 = getCalendarEventInstance();
        Intrinsics.checkExpressionValueIsNotNull(calendarEventInstance4, "calendarEventInstance");
        String summary = calendarEventInstance4.getSummary();
        String str = summary;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return summary;
        }
        String b4 = C32634ae.m125182b(R.string.Calendar_Common_NoTitle);
        Intrinsics.checkExpressionValueIsNotNull(b4, "ResUtil.getString(string.Calendar_Common_NoTitle)");
        return b4;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ResourceEventChipViewData(DayEventChipViewData dayEventChipViewData) {
        super(dayEventChipViewData);
        Intrinsics.checkParameterIsNotNull(dayEventChipViewData, "chipViewData");
        setLayout(dayEventChipViewData.getLayout());
        setIsSupportDrag(dayEventChipViewData.isSupportDrag());
    }
}
