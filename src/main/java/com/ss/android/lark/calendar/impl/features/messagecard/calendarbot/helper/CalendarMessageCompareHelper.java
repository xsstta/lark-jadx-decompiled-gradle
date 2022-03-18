package com.ss.android.lark.calendar.impl.features.messagecard.calendarbot.helper;

import com.ss.android.lark.calendar.impl.features.messagecard.entity.CalendarEventCardDiff;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalContent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J(\u0010\f\u001a\u00020\u00042\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0002J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/messagecard/calendarbot/helper/CalendarMessageCompareHelper;", "", "()V", "isDescriptionHasDiff", "", "diffInfo", "Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/CalendarEventCardDiff;", "calendarInternalContent", "Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/content/CalendarInternalContent;", "isLocationHasDiff", "isMeetingRoomHasDiff", "isRRuleHasDiff", "isSameList", "newList", "", "", "originList", "isTimeHasDiff", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.calendarbot.a.d */
public final class CalendarMessageCompareHelper {

    /* renamed from: a */
    public static final CalendarMessageCompareHelper f82310a = new CalendarMessageCompareHelper();

    private CalendarMessageCompareHelper() {
    }

    @JvmStatic
    /* renamed from: b */
    public static final boolean m122711b(CalendarEventCardDiff calendarEventCardDiff, CalendarInternalContent calendarInternalContent) {
        Intrinsics.checkParameterIsNotNull(calendarEventCardDiff, "diffInfo");
        Intrinsics.checkParameterIsNotNull(calendarInternalContent, "calendarInternalContent");
        return !Intrinsics.areEqual(calendarEventCardDiff.getRrule(), calendarInternalContent.getrRule());
    }

    @JvmStatic
    /* renamed from: c */
    public static final boolean m122712c(CalendarEventCardDiff calendarEventCardDiff, CalendarInternalContent calendarInternalContent) {
        Intrinsics.checkParameterIsNotNull(calendarEventCardDiff, "diffInfo");
        Intrinsics.checkParameterIsNotNull(calendarInternalContent, "calendarInternalContent");
        return !Intrinsics.areEqual(calendarEventCardDiff.getLocation(), calendarInternalContent.getLocation());
    }

    @JvmStatic
    /* renamed from: d */
    public static final boolean m122713d(CalendarEventCardDiff calendarEventCardDiff, CalendarInternalContent calendarInternalContent) {
        Intrinsics.checkParameterIsNotNull(calendarEventCardDiff, "diffInfo");
        Intrinsics.checkParameterIsNotNull(calendarInternalContent, "calendarInternalContent");
        return !f82310a.m122710a(calendarEventCardDiff.getMeetingRooms(), calendarInternalContent.getMeetingRoomList());
    }

    @JvmStatic
    /* renamed from: e */
    public static final boolean m122714e(CalendarEventCardDiff calendarEventCardDiff, CalendarInternalContent calendarInternalContent) {
        Intrinsics.checkParameterIsNotNull(calendarEventCardDiff, "diffInfo");
        Intrinsics.checkParameterIsNotNull(calendarInternalContent, "calendarInternalContent");
        return !Intrinsics.areEqual(calendarEventCardDiff.getDescription(), calendarInternalContent.getDescription());
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m122709a(CalendarEventCardDiff calendarEventCardDiff, CalendarInternalContent calendarInternalContent) {
        Intrinsics.checkParameterIsNotNull(calendarEventCardDiff, "diffInfo");
        Intrinsics.checkParameterIsNotNull(calendarInternalContent, "calendarInternalContent");
        long j = (long) 1000;
        if (calendarEventCardDiff.getStartTime() * j == calendarInternalContent.getStartTime() && calendarEventCardDiff.getEndTime() * j == calendarInternalContent.getEndTime() && calendarEventCardDiff.isAllDay() == calendarInternalContent.isAllDay()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final boolean m122710a(List<String> list, List<String> list2) {
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        for (String str : list) {
            if (!list2.contains(str)) {
                return false;
            }
        }
        return true;
    }
}
