package com.ss.android.lark.calendar.impl.features.meetingroom.base.helper;

import com.bytedance.lark.pb.calendar.v1.GetUnusableMeetingRoomsResponse;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.calendar.impl.features.events.edit.helper.MeetingRoomStrategyHelper;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ \u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006J6\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/base/helper/ResourceStrategyDataHelper;", "", "()V", "getUnusableMeetingRoomDialogData", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/base/helper/StrategyTipDialogData;", "startTime", "", "endTime", "rRule", "", "originalTime", "meetingRoomContainerList", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "interceptDragSaveEvent", "event", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "viewStartTime", "viewEndTime", "interceptEditTime", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.helper.d */
public final class ResourceStrategyDataHelper {

    /* renamed from: a */
    public static final ResourceStrategyDataHelper f81976a = new ResourceStrategyDataHelper();

    private ResourceStrategyDataHelper() {
    }

    /* renamed from: a */
    public final StrategyTipDialogData mo117031a(long j, long j2, String str, long j3, List<? extends CalendarEventAttendee> list) {
        Intrinsics.checkParameterIsNotNull(str, "rRule");
        Intrinsics.checkParameterIsNotNull(list, "meetingRoomContainerList");
        return mo117032b(j, j2, str, j3, list);
    }

    /* renamed from: b */
    public final StrategyTipDialogData mo117032b(long j, long j2, String str, long j3, List<? extends CalendarEventAttendee> list) {
        List<? extends CalendarEventAttendee> list2;
        Intrinsics.checkParameterIsNotNull(str, "rRule");
        Intrinsics.checkParameterIsNotNull(list, "meetingRoomContainerList");
        if (!list.isEmpty()) {
            list2 = list;
        } else {
            list2 = null;
        }
        if (list2 == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        MeetingRoomStrategyHelper.f79934a.mo114630a(list, linkedHashMap, linkedHashMap2, linkedHashMap3);
        if (linkedHashMap.isEmpty() && linkedHashMap2.isEmpty() && linkedHashMap3.isEmpty()) {
            return null;
        }
        C32533b a = C32533b.m124620a();
        Intrinsics.checkExpressionValueIsNotNull(a, "CalendarEventService.getInstance()");
        Map<String, GetUnusableMeetingRoomsResponse.UnusableReasons> a2 = a.mo118850a(linkedHashMap, linkedHashMap2, linkedHashMap3, String.valueOf(j), String.valueOf(j2), str, j3);
        if (CollectionUtils.isEmpty(a2)) {
            return null;
        }
        Intrinsics.checkExpressionValueIsNotNull(a2, "unUsableMtRoom");
        return new StrategyTipDialogData(a2, linkedHashMap, linkedHashMap2, linkedHashMap3, list);
    }
}
