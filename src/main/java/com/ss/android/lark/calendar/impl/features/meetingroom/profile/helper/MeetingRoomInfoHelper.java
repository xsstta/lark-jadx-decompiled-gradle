package com.ss.android.lark.calendar.impl.features.meetingroom.profile.helper;

import com.bytedance.lark.pb.calendar.v1.MeetingRoomUnusableReasons;
import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.entity.DailySecondTime;
import com.ss.android.lark.calendar.impl.features.events.edit.helper.DailyUsableTimeHelper;
import com.ss.android.lark.calendar.impl.features.events.edit.helper.MeetingRoomStrategyHelper;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30039ah;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J(\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u000eJ \u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000eJL\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J \u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0010\u0010!\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000eH\u0002JD\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$J\u001a\u0010&\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u000bH\u0002J\u0010\u0010'\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/helper/MeetingRoomInfoHelper;", "", "()V", "ONE_HOUR_SECOND", "", "appendSpaceIfNeed", "", "stringBuilder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "appendText", "", "getApprovalText", "isApproval", "", "approvalTrigger", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ApprovalTrigger;", "getInUsableTimeText", "eventStartTime", "", "eventTimeZoneId", "mtRoomStrategy", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceStrategy;", "isShowRule", "getMaxUntilText", "getResourceRuleText", "isShouldShowSummary", "mtRoomRequisition", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceRequisition;", "isCustomized", "getResourceStrategyText", "startTime", "timeZoneId", "getShouldShowSummary", "getUnusableReasonText", "unusableReasons", "", "Lcom/bytedance/lark/pb/calendar/v1/MeetingRoomUnusableReasons$UnusableReason;", "getUnusableRequisitionString", "isPastRequisition", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.profile.c.a */
public final class MeetingRoomInfoHelper {

    /* renamed from: a */
    public static final MeetingRoomInfoHelper f82177a = new MeetingRoomInfoHelper();

    private MeetingRoomInfoHelper() {
    }

    /* renamed from: a */
    public final String mo117317a(long j, String str, boolean z, boolean z2, SchemaExtraData.ResourceStrategy resourceStrategy, SchemaExtraData.ResourceRequisition resourceRequisition, boolean z3, SchemaExtraData.ApprovalTrigger approvalTrigger) {
        Intrinsics.checkParameterIsNotNull(str, "eventTimeZoneId");
        StringBuilder sb = new StringBuilder("");
        mo117319a(sb, m122310a(z, approvalTrigger));
        mo117319a(sb, z3 ? C32634ae.m125182b(R.string.Calendar_MeetingRoom_CustomizedSeriveDescription) : null);
        mo117319a(sb, m122309a(z2));
        mo117319a(sb, mo117314a(j, str, resourceStrategy));
        if (resourceRequisition != null && !m122311a(resourceRequisition)) {
            mo117319a(sb, MeetingRoomStrategyHelper.f79934a.mo114624a(resourceRequisition, str, R.string.Calendar_MeetingView_MeetingRoomInactiveForever, R.string.Calendar_MeetingView_MeetingRoomInactive));
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "resourceRuleStringBuilder.toString()");
        return sb2;
    }

    /* renamed from: a */
    public final String mo117318a(SchemaExtraData.ResourceStrategy resourceStrategy, String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(resourceStrategy, "mtRoomStrategy");
        Intrinsics.checkParameterIsNotNull(str, "eventTimeZoneId");
        int i = z ? R.string.Calendar_MeetingView_MeetingRoomReserveDueDate : R.string.Calendar_Edit_MeetingRoomReserveDueDate;
        AbstractC30039ah utilsDependency = C30022a.f74882a.utilsDependency();
        MeetingRoomStrategyHelper fVar = MeetingRoomStrategyHelper.f79934a;
        Integer num = resourceStrategy.until_max_duration;
        Intrinsics.checkExpressionValueIsNotNull(num, "mtRoomStrategy.until_max_duration");
        String a = utilsDependency.mo108195a(i, "DueDate", fVar.mo114620a(num.intValue(), str));
        Intrinsics.checkExpressionValueIsNotNull(a, "CalendarDependencyHolder…        eventTimeZoneId))");
        return a;
    }

    /* renamed from: a */
    public final void mo117319a(StringBuilder sb, String str) {
        Intrinsics.checkParameterIsNotNull(sb, "stringBuilder");
        String str2 = str;
        boolean z = false;
        if (!(str2 == null || str2.length() == 0)) {
            if (sb.length() > 0) {
                z = true;
            }
            if (z) {
                sb.append("\n");
            }
            sb.append(str);
        }
    }

    /* renamed from: a */
    private final String m122309a(boolean z) {
        if (!z) {
            return "";
        }
        String b = C32634ae.m125182b(R.string.Calendar_Rooms_PublicTopics);
        Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…endar_Rooms_PublicTopics)");
        return b;
    }

    /* renamed from: a */
    private final boolean m122311a(SchemaExtraData.ResourceRequisition resourceRequisition) {
        long timeInSeconds = new CalendarDate().getTimeInSeconds();
        Long l = resourceRequisition.end_time;
        if (l != null && l.longValue() == 0) {
            return false;
        }
        Long l2 = resourceRequisition.end_time;
        Intrinsics.checkExpressionValueIsNotNull(l2, "mtRoomRequisition.end_time");
        if (timeInSeconds >= l2.longValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final String m122306a(SchemaExtraData.ResourceRequisition resourceRequisition, String str) {
        Long l = resourceRequisition.end_time;
        if (l != null && l.longValue() == 0) {
            MeetingRoomStrategyHelper fVar = MeetingRoomStrategyHelper.f79934a;
            Long l2 = resourceRequisition.start_time;
            Intrinsics.checkExpressionValueIsNotNull(l2, "mtRoomRequisition.start_time");
            return C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_MeetingView_MeetingRoomInactiveForeverCantReserve, "StartTime", MeetingRoomStrategyHelper.m118860a(fVar, l2.longValue(), str, false, 4, (Object) null));
        }
        MeetingRoomStrategyHelper fVar2 = MeetingRoomStrategyHelper.f79934a;
        Long l3 = resourceRequisition.start_time;
        Intrinsics.checkExpressionValueIsNotNull(l3, "mtRoomRequisition.start_time");
        String a = MeetingRoomStrategyHelper.m118860a(fVar2, l3.longValue(), str, false, 4, (Object) null);
        MeetingRoomStrategyHelper fVar3 = MeetingRoomStrategyHelper.f79934a;
        Long l4 = resourceRequisition.end_time;
        Intrinsics.checkExpressionValueIsNotNull(l4, "mtRoomRequisition.end_time");
        String a2 = MeetingRoomStrategyHelper.m118860a(fVar3, l4.longValue(), str, false, 4, (Object) null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("StartTime", a);
        linkedHashMap.put("EndTime", a2);
        return C30022a.f74882a.utilsDependency().mo108196a(R.string.Calendar_MeetingView_MeetingRoomInactiveCantReserve, linkedHashMap);
    }

    /* renamed from: a */
    private final String m122310a(boolean z, SchemaExtraData.ApprovalTrigger approvalTrigger) {
        Long l;
        if (z) {
            String b = C32634ae.m125182b(R.string.Calendar_MeetingView_ReservationRequireApproval);
            Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…servationRequireApproval)");
            return b;
        }
        if (approvalTrigger != null) {
            l = approvalTrigger.duration_trigger;
        } else {
            l = null;
        }
        if (l == null) {
            return "";
        }
        String a = C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_Rooms_OverReserveTimeApprove, "num", String.valueOf((int) (approvalTrigger.duration_trigger.longValue() / ((long) 3600))));
        Intrinsics.checkExpressionValueIsNotNull(a, "CalendarDependencyHolder…COND).toInt().toString())");
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo117314a(long r15, java.lang.String r17, com.bytedance.lark.pb.calendar.v1.SchemaExtraData.ResourceStrategy r18) {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.meetingroom.profile.helper.MeetingRoomInfoHelper.mo117314a(long, java.lang.String, com.bytedance.lark.pb.calendar.v1.SchemaExtraData$ResourceStrategy):java.lang.String");
    }

    /* renamed from: a */
    public final String mo117316a(long j, String str, SchemaExtraData.ResourceStrategy resourceStrategy, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "eventTimeZoneId");
        Intrinsics.checkParameterIsNotNull(resourceStrategy, "mtRoomStrategy");
        TimeZone a = MeetingRoomStrategyHelper.f79934a.mo114629a(str);
        DailyUsableTimeHelper bVar = DailyUsableTimeHelper.f79927a;
        String str2 = resourceStrategy.timezone;
        Integer num = resourceStrategy.daily_start_time;
        Intrinsics.checkExpressionValueIsNotNull(num, "mtRoomStrategy.daily_start_time");
        int intValue = num.intValue();
        Integer num2 = resourceStrategy.daily_end_time;
        Intrinsics.checkExpressionValueIsNotNull(num2, "mtRoomStrategy.daily_end_time");
        return bVar.mo114599a(j, a, str2, new DailySecondTime(intValue, num2.intValue()), z);
    }

    /* renamed from: a */
    public static /* synthetic */ String m122308a(MeetingRoomInfoHelper aVar, SchemaExtraData.ResourceStrategy resourceStrategy, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return aVar.mo117318a(resourceStrategy, str, z);
    }

    /* renamed from: a */
    public final String mo117315a(long j, String str, SchemaExtraData.ResourceStrategy resourceStrategy, SchemaExtraData.ResourceRequisition resourceRequisition, SchemaExtraData.ApprovalTrigger approvalTrigger, List<? extends MeetingRoomUnusableReasons.UnusableReason> list) {
        boolean z;
        boolean z2;
        boolean z3;
        Intrinsics.checkParameterIsNotNull(str, "eventTimeZoneId");
        List<? extends MeetingRoomUnusableReasons.UnusableReason> list2 = list;
        boolean z4 = true;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (T t : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            T t2 = t;
            String str2 = null;
            if (MeetingRoomUnusableReasons.UnusableReason.OVER_MAX_DURATION == t2 && resourceStrategy != null) {
                str2 = MeetingRoomStrategyHelper.f79934a.mo114625a(resourceStrategy, false);
            } else if (MeetingRoomUnusableReasons.UnusableReason.NOT_IN_USABLE_TIME == t2 && resourceStrategy != null) {
                str2 = f82177a.mo117316a(j, str, resourceStrategy, false);
            } else if (MeetingRoomUnusableReasons.UnusableReason.OVER_MAX_UNTIL_TIME == t2 && resourceStrategy != null) {
                str2 = f82177a.mo117318a(resourceStrategy, str, false);
            } else if (MeetingRoomUnusableReasons.UnusableReason.DURING_REQUISITION == t2 && resourceRequisition != null) {
                str2 = null;
                MeetingRoomInfoHelper aVar = f82177a;
                if (!aVar.m122311a(resourceRequisition)) {
                    str2 = aVar.m122306a(resourceRequisition, str);
                }
            } else if (MeetingRoomUnusableReasons.UnusableReason.PAST_TIME == t2) {
                str2 = C32634ae.m125182b(R.string.Calendar_Edit_MeetingRoomCantReserveForPastEvent);
            } else if (MeetingRoomUnusableReasons.UnusableReason.CANT_RESERVE_OVER_TIME == t2) {
                if ((approvalTrigger != null ? approvalTrigger.duration_trigger : null) != null) {
                    str2 = C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_Rooms_CantReserveOverTime, "num", String.valueOf(approvalTrigger.duration_trigger.longValue() / ((long) 3600)));
                }
            }
            String str3 = str2;
            if (str3 == null || str3.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (sb.length() > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    sb.append("\n");
                }
                sb.append(str2);
            }
            i = i2;
        }
        if (sb.length() != 0) {
            z4 = false;
        }
        if (z4) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C32634ae.m125182b(R.string.Calendar_MeetingView_ReservationFailTo) + "\n");
        sb2.append(sb.toString());
        String sb3 = sb2.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb3, "StringBuilder().append(\n…)\n            .toString()");
        return sb3;
    }

    /* renamed from: a */
    public static /* synthetic */ String m122307a(MeetingRoomInfoHelper aVar, long j, String str, SchemaExtraData.ResourceStrategy resourceStrategy, boolean z, int i, Object obj) {
        boolean z2;
        if ((i & 8) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        return aVar.mo117316a(j, str, resourceStrategy, z2);
    }
}
