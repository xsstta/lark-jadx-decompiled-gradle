package com.ss.android.lark.calendar.impl.features.meetingroom.base.helper;

import com.bytedance.lark.pb.calendar.v1.GetUnusableMeetingRoomsResponse;
import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.ss.android.lark.calendar.impl.features.events.edit.helper.MeetingRoomStrategyHelper;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.MeetingRoomText;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.extension.C32060a;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001Bc\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u0003\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\u0010\u0010J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0004R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/base/helper/StrategyTipDialogData;", "", "unUsableMtRoom", "", "", "Lcom/bytedance/lark/pb/calendar/v1/GetUnusableMeetingRoomsResponse$UnusableReasons;", "mtRoomStrategyMap", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceStrategy;", "mtRoomRequisitionMap", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceRequisition;", "resourceApprovalInfo", "", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceApprovalInfo;", "meetingRoomContainerList", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)V", "getMeetingRoomContainerList", "()Ljava/util/List;", "getMtRoomRequisitionMap", "()Ljava/util/Map;", "getMtRoomStrategyMap", "getResourceApprovalInfo", "getUnUsableMtRoom", "getUnusableMtRoomList", "", "Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/MeetingRoomText;", "startTime", "", "timeZoneId", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.helper.e */
public final class StrategyTipDialogData {

    /* renamed from: a */
    private final Map<String, GetUnusableMeetingRoomsResponse.UnusableReasons> f81977a;

    /* renamed from: b */
    private final Map<String, SchemaExtraData.ResourceStrategy> f81978b;

    /* renamed from: c */
    private final Map<String, SchemaExtraData.ResourceRequisition> f81979c;

    /* renamed from: d */
    private final Map<String, SchemaExtraData.ResourceApprovalInfo> f81980d;

    /* renamed from: e */
    private final List<CalendarEventAttendee> f81981e;

    /* renamed from: a */
    public final List<MeetingRoomText> mo117033a(long j, String str) {
        String str2;
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "timeZoneId");
        ArrayList arrayList = new ArrayList();
        int size = this.f81981e.size();
        for (int i = 0; i < size; i++) {
            CalendarEventAttendee calendarEventAttendee = this.f81981e.get(i);
            GetUnusableMeetingRoomsResponse.UnusableReasons unusableReasons = this.f81977a.get(calendarEventAttendee.getAttendeeCalendarId());
            if (unusableReasons != null) {
                SchemaExtraData.ResourceStrategy resourceStrategy = this.f81978b.get(calendarEventAttendee.getAttendeeCalendarId());
                SchemaExtraData.ResourceRequisition resourceRequisition = this.f81979c.get(calendarEventAttendee.getAttendeeCalendarId());
                SchemaExtraData.ResourceApprovalInfo resourceApprovalInfo = this.f81980d.get(calendarEventAttendee.getAttendeeCalendarId());
                if (resourceStrategy != null || resourceRequisition != null || resourceApprovalInfo != null) {
                    String a = C32060a.m121939a(calendarEventAttendee);
                    List<GetUnusableMeetingRoomsResponse.UnusableReason> list = unusableReasons.unusable_reasons;
                    if (list != null) {
                        str2 = MeetingRoomStrategyHelper.f79934a.mo114621a(j, str, list, resourceStrategy, resourceRequisition, resourceApprovalInfo);
                    } else {
                        str2 = "";
                    }
                    String str3 = a;
                    boolean z2 = true;
                    if (str3 == null || str3.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        if (str2.length() != 0) {
                            z2 = false;
                        }
                        if (!z2) {
                            arrayList.add(new MeetingRoomText(a, str2));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee> */
    /* JADX WARN: Multi-variable type inference failed */
    public StrategyTipDialogData(Map<String, GetUnusableMeetingRoomsResponse.UnusableReasons> map, Map<String, SchemaExtraData.ResourceStrategy> map2, Map<String, SchemaExtraData.ResourceRequisition> map3, Map<String, SchemaExtraData.ResourceApprovalInfo> map4, List<? extends CalendarEventAttendee> list) {
        Intrinsics.checkParameterIsNotNull(map, "unUsableMtRoom");
        Intrinsics.checkParameterIsNotNull(map2, "mtRoomStrategyMap");
        Intrinsics.checkParameterIsNotNull(map3, "mtRoomRequisitionMap");
        Intrinsics.checkParameterIsNotNull(map4, "resourceApprovalInfo");
        Intrinsics.checkParameterIsNotNull(list, "meetingRoomContainerList");
        this.f81977a = map;
        this.f81978b = map2;
        this.f81979c = map3;
        this.f81980d = map4;
        this.f81981e = list;
    }
}
