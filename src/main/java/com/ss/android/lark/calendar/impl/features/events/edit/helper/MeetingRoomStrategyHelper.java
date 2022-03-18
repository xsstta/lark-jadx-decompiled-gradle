package com.ss.android.lark.calendar.impl.features.events.edit.helper;

import android.content.Context;
import com.bytedance.lark.pb.calendar.v1.GetUnusableMeetingRoomsResponse;
import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.entity.DailySecondTime;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30037ag;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30039ah;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.DatePreciseness;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.LengthType;
import com.ss.android.lark.time.format.entity.TimePreciseness;
import com.ss.ttm.player.MediaPlayer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004J,\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tJ\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0004J \u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u000fJ*\u0010\u0017\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\tJP\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0#2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060#2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020&0#JL\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020)\u0018\u00010(2\u0006\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00152\u0016\u0010.\u001a\u0012\u0012\u0004\u0012\u00020!0/j\b\u0012\u0004\u0012\u00020!`0J\u0010\u00101\u001a\u0002022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\u001a\u00103\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J$\u00104\u001a\u0004\u0018\u00010\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001c\u001a\u00020\tJ\u0010\u00105\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\tH\u0002JB\u00106\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00042\f\u00107\u001a\b\u0012\u0004\u0012\u0002080 2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u00109\u001a\u0004\u0018\u00010&J\u0012\u0010:\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 *\u00020;¨\u0006<"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/helper/MeetingRoomStrategyHelper;", "", "()V", "getDuringRequisitionString", "", "mtRoomRequisition", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceRequisition;", "timeZoneId", "foreverStringId", "", "normalStringId", "getMaxDurationText", "mtRoomStrategy", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceStrategy;", "isShowRule", "", "getMaxUntilTimeString", "untilMaxDuration", "eventTimeZoneId", "getMtRoomRequisitionDateStr", "time", "", "isShowTimeZone", "getRepeatEndLimitStr", "repeatEndLimitDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "repeatEndLimitMtRoomName", "isRepeatEndBeforeStart", "meetingRoomSize", "getResourceStrategies", "", "chosenMeetingRoomList", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "resourceStrategyMap", "", "resourceRequisitionMap", "resourceApprovalInfo", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceApprovalInfo;", "getResourceUnusableReason", "", "Lcom/bytedance/lark/pb/calendar/v1/GetUnusableMeetingRoomsResponse$UnusableReasons;", "startTime", "endTime", "rRule", "originalTime", "meetingRoomContainerList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getTimeZone", "Ljava/util/TimeZone;", "getTimeZoneStr", "getUnEditableEventDialogMtRoomTip", "getUntilMaxDurationTimeInMilliSeconds", "getUnusableReasonText", "unusableReasons", "Lcom/bytedance/lark/pb/calendar/v1/GetUnusableMeetingRoomsResponse$UnusableReason;", "mtRoomApprovalInfo", "getResourceList", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.a.f */
public final class MeetingRoomStrategyHelper {

    /* renamed from: a */
    public static final MeetingRoomStrategyHelper f79934a = new MeetingRoomStrategyHelper();

    private MeetingRoomStrategyHelper() {
    }

    /* renamed from: a */
    public final Map<String, GetUnusableMeetingRoomsResponse.UnusableReasons> mo114628a(long j, long j2, String str, long j3, ArrayList<CalendarEventAttendee> arrayList) {
        Intrinsics.checkParameterIsNotNull(str, "rRule");
        Intrinsics.checkParameterIsNotNull(arrayList, "meetingRoomContainerList");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        mo114630a(arrayList, linkedHashMap, linkedHashMap2, linkedHashMap3);
        if (linkedHashMap.isEmpty() && linkedHashMap2.isEmpty() && linkedHashMap3.isEmpty()) {
            return null;
        }
        C32533b a = C32533b.m124620a();
        Intrinsics.checkExpressionValueIsNotNull(a, "CalendarEventService.getInstance()");
        return a.mo118850a(linkedHashMap, linkedHashMap2, linkedHashMap3, String.valueOf(j), String.valueOf(j2), str, j3);
    }

    /* renamed from: a */
    public final TimeZone mo114629a(String str) {
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            TimeZone timeZone = TimeZone.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
            return timeZone;
        }
        TimeZone timeZone2 = TimeZone.getTimeZone(str);
        Intrinsics.checkExpressionValueIsNotNull(timeZone2, "TimeZone.getTimeZone(timeZoneId)");
        return timeZone2;
    }

    /* renamed from: a */
    public final void mo114630a(List<? extends CalendarEventAttendee> list, Map<String, SchemaExtraData.ResourceStrategy> map, Map<String, SchemaExtraData.ResourceRequisition> map2, Map<String, SchemaExtraData.ResourceApprovalInfo> map3) {
        List<SchemaExtraData.BizData> bizDataList;
        SchemaExtraData.ResourceApprovalInfo approvalInfo;
        Intrinsics.checkParameterIsNotNull(list, "chosenMeetingRoomList");
        Intrinsics.checkParameterIsNotNull(map, "resourceStrategyMap");
        Intrinsics.checkParameterIsNotNull(map2, "resourceRequisitionMap");
        Intrinsics.checkParameterIsNotNull(map3, "resourceApprovalInfo");
        for (CalendarEventAttendee calendarEventAttendee : list) {
            com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData schemaExtraData = calendarEventAttendee.getSchemaExtraData();
            if (!(schemaExtraData == null || (bizDataList = schemaExtraData.getBizDataList()) == null)) {
                for (T t : bizDataList) {
                    int i = C31537g.f79935a[t.getType().ordinal()];
                    if (i == 1) {
                        SchemaExtraData.ResourceStrategy resourceStrategy = t.getResourceStrategy();
                        if (resourceStrategy != null) {
                            String attendeeCalendarId = calendarEventAttendee.getAttendeeCalendarId();
                            Intrinsics.checkExpressionValueIsNotNull(attendeeCalendarId, "eventMeetingRoomData.attendeeCalendarId");
                            map.put(attendeeCalendarId, resourceStrategy);
                        }
                    } else if (i == 2) {
                        SchemaExtraData.ResourceRequisition resourceRequisition = t.getResourceRequisition();
                        if (resourceRequisition != null) {
                            String attendeeCalendarId2 = calendarEventAttendee.getAttendeeCalendarId();
                            Intrinsics.checkExpressionValueIsNotNull(attendeeCalendarId2, "eventMeetingRoomData.attendeeCalendarId");
                            map2.put(attendeeCalendarId2, resourceRequisition);
                        }
                    } else if (i == 3 && (approvalInfo = t.getApprovalInfo()) != null) {
                        String attendeeCalendarId3 = calendarEventAttendee.getAttendeeCalendarId();
                        Intrinsics.checkExpressionValueIsNotNull(attendeeCalendarId3, "eventMeetingRoomData.attendeeCalendarId");
                        map3.put(attendeeCalendarId3, approvalInfo);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final String mo114627a(CalendarDate calendarDate, String str, boolean z, int i) {
        if (calendarDate == null) {
            String b = C32634ae.m125182b(R.string.Calendar_Edit_Within730Day);
            Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…lendar_Edit_Within730Day)");
            return b;
        }
        boolean z2 = true;
        String a = C32646c.m125258a(calendarDate, TimeZone.getDefault(), true);
        if (a == null) {
            a = "";
        }
        if (i >= 2) {
            String str2 = str;
            if (!(str2 == null || str2.length() == 0)) {
                z2 = false;
            }
        }
        if (z && z2) {
            HashMap hashMap = new HashMap();
            hashMap.put("DueDate", a);
            String a2 = C30022a.f74882a.utilsDependency().mo108196a(R.string.Calendar_Edit_MeetingRoomCantReserveBeyond, hashMap);
            Intrinsics.checkExpressionValueIsNotNull(a2, "CalendarDependencyHolder…ReserveBeyond, formatMap)");
            return a2;
        } else if (z) {
            HashMap hashMap2 = new HashMap();
            if (str == null) {
                str = "";
            }
            hashMap2.put("MeetingRoom", str);
            hashMap2.put("DueDate", a);
            String a3 = C30022a.f74882a.utilsDependency().mo108196a(R.string.Calendar_Edit_MeetingRoomCantReserveBeyondMulti, hashMap2);
            Intrinsics.checkExpressionValueIsNotNull(a3, "CalendarDependencyHolder…veBeyondMulti, formatMap)");
            return a3;
        } else if (z2) {
            String a4 = C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_Edit_SpecificMeetingRoomAndReserveDueDate, "DueDate", a);
            Intrinsics.checkExpressionValueIsNotNull(a4, "CalendarDependencyHolder…      \"DueDate\", dateStr)");
            return a4;
        } else {
            HashMap hashMap3 = new HashMap();
            if (str == null) {
                str = "";
            }
            hashMap3.put("MeetingRoom", str);
            hashMap3.put("DueDate", a);
            String a5 = C30022a.f74882a.utilsDependency().mo108196a(R.string.Calendar_Edit_SpecificMeetingRoomAndReserveDueDateMulti, hashMap3);
            Intrinsics.checkExpressionValueIsNotNull(a5, "CalendarDependencyHolder…eDueDateMulti, formatMap)");
            return a5;
        }
    }

    /* renamed from: a */
    public final String mo114626a(CalendarDate calendarDate, String str, int i) {
        if (calendarDate == null) {
            return null;
        }
        boolean z = true;
        String a = C32646c.m125258a(calendarDate, TimeZone.getDefault(), true);
        if (a == null) {
            a = "";
        }
        if (i >= 2) {
            String str2 = str;
            if (!(str2 == null || str2.length() == 0)) {
                z = false;
            }
            if (!z) {
                HashMap hashMap = new HashMap();
                hashMap.put("MeetingRoom", str);
                hashMap.put("DueDate", a);
                return C30022a.f74882a.utilsDependency().mo108196a(R.string.Calendar_Meeting_ReserveLimtTIpMulti, hashMap);
            }
        }
        return C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_Meeting_ReserveLimtTIp, "DueDate", a);
    }

    /* renamed from: a */
    private final long m118858a(int i) {
        CalendarDate calendarDate = new CalendarDate();
        calendarDate.setTimeInSeconds(((calendarDate.getTimeInSeconds() / 86400) * 86400) + ((long) i));
        calendarDate.moveThisDateToDayEnd();
        return calendarDate.getTimeInMilliSeconds();
    }

    /* renamed from: a */
    private final String m118859a(long j, String str) {
        boolean z;
        TimeZone timeZone;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            timeZone = TimeZone.getDefault();
        } else {
            timeZone = TimeZone.getTimeZone(str);
        }
        return C32646c.m125265a(timeZone, j);
    }

    /* renamed from: a */
    public final String mo114623a(SchemaExtraData.ResourceRequisition resourceRequisition, String str) {
        Intrinsics.checkParameterIsNotNull(resourceRequisition, "mtRoomRequisition");
        Intrinsics.checkParameterIsNotNull(str, "timeZoneId");
        return mo114624a(resourceRequisition, str, R.string.Calendar_Edit_MeetingRoomInactiveForever, R.string.Calendar_Edit_MeetingRoomInactive);
    }

    /* renamed from: a */
    public final String mo114620a(int i, String str) {
        Intrinsics.checkParameterIsNotNull(str, "eventTimeZoneId");
        long a = m118858a(i);
        Options aVar = new Options(null, null, null, null, null, false, false, false, false, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME, null);
        aVar.mo191591a(DatePreciseness.DAY);
        aVar.mo191593a(LengthType.LONG);
        aVar.mo191592a(DisplayPattern.ABSOLUTE);
        aVar.mo191595a(str);
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        if (!Intrinsics.areEqual(str, timeZone.getID())) {
            aVar.mo191594a(TimePreciseness.MINUTE);
            AbstractC30037ag timeFormatDependency = C30022a.f74882a.timeFormatDependency();
            Intrinsics.checkExpressionValueIsNotNull(timeFormatDependency, "CalendarDependencyHolder…cy.timeFormatDependency()");
            aVar.mo191599b(!timeFormatDependency.mo108189a());
            Context a2 = C32634ae.m125179a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "ResUtil.getAppContext()");
            return TimeFormatUtils.m219292g(a2, new Date(a), aVar);
        }
        Context a3 = C32634ae.m125179a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "ResUtil.getAppContext()");
        return TimeFormatUtils.m219289e(a3, new Date(a), aVar);
    }

    /* renamed from: a */
    public final String mo114625a(SchemaExtraData.ResourceStrategy resourceStrategy, boolean z) {
        String str;
        Intrinsics.checkParameterIsNotNull(resourceStrategy, "mtRoomStrategy");
        int intValue = resourceStrategy.single_max_duration.intValue() / 60;
        if (intValue % 60 == 0) {
            str = C32634ae.m125180a(R.plurals.Calendar_Plural_CommonHrs, intValue / 60);
        } else {
            str = C32634ae.m125180a(R.plurals.Calendar_Plural_CommonMins, intValue);
        }
        if (z) {
            String a = C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_MeetingView_MeetingRoomReserveMaxDuration, "TimeLimit", str);
            Intrinsics.checkExpressionValueIsNotNull(a, "CalendarDependencyHolder…\"TimeLimit\", durationStr)");
            return a;
        }
        String a2 = C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_Edit_MeetingRoomReserveMaxDuration, "TimeLimit", str);
        Intrinsics.checkExpressionValueIsNotNull(a2, "CalendarDependencyHolder…\"TimeLimit\", durationStr)");
        return a2;
    }

    /* renamed from: a */
    public final String mo114622a(long j, String str, boolean z) {
        String a;
        Intrinsics.checkParameterIsNotNull(str, "eventTimeZoneId");
        Options aVar = new Options(null, null, null, null, null, false, false, false, false, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME, null);
        aVar.mo191591a(DatePreciseness.DAY);
        aVar.mo191593a(LengthType.LONG);
        aVar.mo191592a(DisplayPattern.ABSOLUTE);
        aVar.mo191595a(str);
        aVar.mo191594a(TimePreciseness.MINUTE);
        aVar.mo191597a(z);
        AbstractC30037ag timeFormatDependency = C30022a.f74882a.timeFormatDependency();
        Intrinsics.checkExpressionValueIsNotNull(timeFormatDependency, "CalendarDependencyHolder…cy.timeFormatDependency()");
        boolean z2 = true;
        aVar.mo191599b(!timeFormatDependency.mo108189a());
        Context a2 = C32634ae.m125179a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "ResUtil.getAppContext()");
        String g = TimeFormatUtils.m219292g(a2, new Date(((long) 1000) * j), aVar);
        if (!z || (a = m118859a(j, str)) == null) {
            return g;
        }
        if (a.length() <= 0) {
            z2 = false;
        }
        if (!z2) {
            a = null;
        }
        if (a == null) {
            return g;
        }
        return g + '(' + a + ')';
    }

    /* renamed from: a */
    public final String mo114624a(SchemaExtraData.ResourceRequisition resourceRequisition, String str, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(resourceRequisition, "mtRoomRequisition");
        Intrinsics.checkParameterIsNotNull(str, "timeZoneId");
        Long l = resourceRequisition.end_time;
        if (l != null && l.longValue() == 0) {
            Long l2 = resourceRequisition.start_time;
            Intrinsics.checkExpressionValueIsNotNull(l2, "mtRoomRequisition.start_time");
            return C30022a.f74882a.utilsDependency().mo108195a(i, "StartTime", m118860a(this, l2.longValue(), str, false, 4, (Object) null));
        }
        Long l3 = resourceRequisition.start_time;
        Intrinsics.checkExpressionValueIsNotNull(l3, "mtRoomRequisition.start_time");
        String a = m118860a(this, l3.longValue(), str, false, 4, (Object) null);
        Long l4 = resourceRequisition.end_time;
        Intrinsics.checkExpressionValueIsNotNull(l4, "mtRoomRequisition.end_time");
        String a2 = m118860a(this, l4.longValue(), str, false, 4, (Object) null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("StartTime", a);
        linkedHashMap.put("EndTime", a2);
        return C30022a.f74882a.utilsDependency().mo108196a(i2, linkedHashMap);
    }

    /* renamed from: a */
    public static /* synthetic */ String m118860a(MeetingRoomStrategyHelper fVar, long j, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return fVar.mo114622a(j, str, z);
    }

    /* renamed from: a */
    public final String mo114621a(long j, String str, List<? extends GetUnusableMeetingRoomsResponse.UnusableReason> list, SchemaExtraData.ResourceStrategy resourceStrategy, SchemaExtraData.ResourceRequisition resourceRequisition, SchemaExtraData.ResourceApprovalInfo resourceApprovalInfo) {
        String str2;
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "timeZoneId");
        Intrinsics.checkParameterIsNotNull(list, "unusableReasons");
        StringBuilder sb = new StringBuilder();
        TimeZone a = mo114629a(str);
        int i = 0;
        for (T t : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            T t2 = t;
            if (GetUnusableMeetingRoomsResponse.UnusableReason.OVER_MAX_DURATION == t2 && resourceStrategy != null) {
                str2 = f79934a.mo114625a(resourceStrategy, false);
            } else if (GetUnusableMeetingRoomsResponse.UnusableReason.NOT_IN_USABLE_TIME == t2 && resourceStrategy != null) {
                DailyUsableTimeHelper bVar = DailyUsableTimeHelper.f79927a;
                String str3 = resourceStrategy.timezone;
                Integer num = resourceStrategy.daily_start_time;
                Intrinsics.checkExpressionValueIsNotNull(num, "mtRoomStrategy.daily_start_time");
                int intValue = num.intValue();
                Integer num2 = resourceStrategy.daily_end_time;
                Intrinsics.checkExpressionValueIsNotNull(num2, "mtRoomStrategy.daily_end_time");
                str2 = bVar.mo114599a(j, a, str3, new DailySecondTime(intValue, num2.intValue()), false);
            } else if (GetUnusableMeetingRoomsResponse.UnusableReason.OVER_MAX_UNTIL_TIME == t2 && resourceStrategy != null) {
                AbstractC30039ah utilsDependency = C30022a.f74882a.utilsDependency();
                MeetingRoomStrategyHelper fVar = f79934a;
                Integer num3 = resourceStrategy.until_max_duration;
                Intrinsics.checkExpressionValueIsNotNull(num3, "mtRoomStrategy.until_max_duration");
                str2 = utilsDependency.mo108195a(R.string.Calendar_Edit_MeetingRoomReserveDueDate, "DueDate", fVar.mo114620a(num3.intValue(), str));
            } else if (GetUnusableMeetingRoomsResponse.UnusableReason.DURING_REQUISITION == t2 && resourceRequisition != null) {
                str2 = f79934a.mo114623a(resourceRequisition, str);
            } else if (GetUnusableMeetingRoomsResponse.UnusableReason.RECURRENT_EVENT_DURATION_TRIGGERS_APPROVAL != t2 || resourceApprovalInfo == null) {
                str2 = null;
            } else {
                str2 = C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_Rooms_ShortTimeToReserve, "num", MeetingRoomApprovalHelper.f79933a.mo114617a(resourceApprovalInfo.trigger));
            }
            String str4 = str2;
            boolean z2 = true;
            if (str4 == null || str4.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (sb.length() <= 0) {
                    z2 = false;
                }
                if (z2) {
                    sb.append("\n");
                }
                sb.append(str2);
            }
            i = i2;
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "unusableReasonStringBuilder.toString()");
        return sb2;
    }
}
