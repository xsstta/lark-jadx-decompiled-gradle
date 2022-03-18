package com.ss.android.lark.calendar.impl.features.common.helper;

import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import com.ss.android.lark.calendar.impl.utils.CalendarWorkHourUtil;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0016\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/helper/ReminderHelper;", "", "()V", "getAllDayReminderShowTexts", "", "", "getAllDayReminderString", "minutes", "", "getNormalReminderShowTexts", "getNormalReminderString", "getReminderString", "isAllDay", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.common.c.g */
public final class ReminderHelper {

    /* renamed from: a */
    public static final ReminderHelper f78619a = new ReminderHelper();

    private ReminderHelper() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final List<String> m116193a() {
        ArrayList<Number> arrayListOf = CollectionsKt.arrayListOf(-1, 0, 5, 15, 30, 60, Integer.valueOf((int) SmEvents.EVENT_NW), Integer.valueOf((int) CalendarWorkHourUtil.f83805a), 2880, 10080);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListOf, 10));
        for (Number number : arrayListOf) {
            arrayList.add(f78619a.m116194b(number.intValue()));
        }
        return arrayList;
    }

    @JvmStatic
    /* renamed from: b */
    public static final List<String> m116195b() {
        ArrayList<Number> arrayListOf = CollectionsKt.arrayListOf(-480, -540, -600, 960, 900, 840);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListOf, 10));
        for (Number number : arrayListOf) {
            arrayList.add(f78619a.m116192a(number.intValue()));
        }
        ArrayList arrayList2 = arrayList;
        arrayList2.add(0, C32634ae.m125182b(R.string.Calendar_Common_NoAlerts));
        return arrayList2;
    }

    /* renamed from: a */
    private final String m116192a(int i) {
        String str;
        if (i <= 0) {
            String a = C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_AlertTime_OnThatDay, "timeString", C32646c.m125245a(-i, TimeZone.getDefault(), false));
            Intrinsics.checkExpressionValueIsNotNull(a, "CalendarDependencyHolder…                  false))");
            return a;
        }
        boolean z = true;
        int i2 = (i / CalendarWorkHourUtil.f83805a) + 1;
        int i3 = (i2 * CalendarWorkHourUtil.f83805a) - i;
        int i4 = i2 / 7;
        if (i2 % 7 != 0) {
            z = false;
        }
        if (!z || i4 <= 0) {
            str = C32634ae.m125180a(R.plurals.Calendar_Plural_ReminderDay, i2);
            Intrinsics.checkExpressionValueIsNotNull(str, "ResUtil.getPluralString(…Plural_ReminderDay, days)");
        } else {
            str = C32634ae.m125180a(R.plurals.Calendar_Plural_ReminderWeek, i4);
            Intrinsics.checkExpressionValueIsNotNull(str, "ResUtil.getPluralString(…ural_ReminderWeek, weeks)");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("aheadOfDays", str);
        String a2 = C32646c.m125245a(i3, TimeZone.getDefault(), false);
        Intrinsics.checkExpressionValueIsNotNull(a2, "CalendarDateTimeShowUtil…Zone.getDefault(), false)");
        hashMap.put("timeString", a2);
        String a3 = C30022a.f74882a.utilsDependency().mo108196a(R.string.Calendar_AlertTime_BeforeThatDay, hashMap);
        Intrinsics.checkExpressionValueIsNotNull(a3, "CalendarDependencyHolder…BeforeThatDay, formatMap)");
        return a3;
    }

    /* renamed from: b */
    private final String m116194b(int i) {
        String str;
        if (i == 0) {
            String b = C32634ae.m125182b(R.string.Calendar_AlertTime_AtTimeOfEvent);
            Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…_AlertTime_AtTimeOfEvent)");
            return b;
        } else if (i < 0) {
            String b2 = C32634ae.m125182b(R.string.Calendar_Common_NoAlerts);
            Intrinsics.checkExpressionValueIsNotNull(b2, "ResUtil.getString(R.stri…Calendar_Common_NoAlerts)");
            return b2;
        } else {
            int i2 = i / 10080;
            int i3 = i % 10080;
            int i4 = i / CalendarWorkHourUtil.f83805a;
            int i5 = i % CalendarWorkHourUtil.f83805a;
            int i6 = i / 60;
            int i7 = i % 60;
            if (i2 <= 0 || i3 != 0) {
                if (i4 > 0 && i5 == 0) {
                    str = C32634ae.m125180a(R.plurals.Calendar_Plural_ReminderDay, i4);
                } else if (i6 <= 0 || i7 != 0) {
                    str = C32634ae.m125180a(R.plurals.Calendar_Plural_ReminderMinute, i);
                } else {
                    str = C32634ae.m125180a(R.plurals.Calendar_Plural_ReminderHour, i6);
                }
                Intrinsics.checkExpressionValueIsNotNull(str, "if (days > 0 && remainde…inute, minutes)\n        }");
                return str;
            }
            String a = C32634ae.m125180a(R.plurals.Calendar_Plural_ReminderWeek, i2);
            Intrinsics.checkExpressionValueIsNotNull(a, "ResUtil.getPluralString(…ural_ReminderWeek, weeks)");
            return a;
        }
    }

    /* renamed from: a */
    public final String mo112733a(int i, boolean z) {
        if (z) {
            return m116192a(i);
        }
        return m116194b(i);
    }
}
