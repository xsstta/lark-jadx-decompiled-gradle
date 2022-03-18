package com.ss.android.lark.calendar.impl.features.events.edit.utils;

import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.UserAttendeeBaseInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\rJF\u0010\u000e\u001a*\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u000fj\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004`\u00112\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u001c\u0010\u0012\u001a\u00020\u00132\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u001c\u0010\u0014\u001a\u00020\u00132\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bJL\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00042.\u0010\u0016\u001a*\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u000fj\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004`\u00112\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/utils/EventTimeZoneUtils;", "", "()V", "getSortAttendees", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/UserAttendeeBaseInfo;", "attendeeList", "date", "", "getTimeZoneDisplayName", "", "timeZone", "Ljava/util/TimeZone;", "Ljava/util/Date;", "groupAttendeesByTimeZoneId", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "isAttendeesInDifferentTimeZone", "", "isExitTimeDifferenceWithDevice", "sortAttendees", "attendeeMap", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.d.d */
public final class EventTimeZoneUtils {

    /* renamed from: a */
    public static final EventTimeZoneUtils f80188a = new EventTimeZoneUtils();

    private EventTimeZoneUtils() {
    }

    /* renamed from: c */
    public final List<List<UserAttendeeBaseInfo>> mo114874c(List<UserAttendeeBaseInfo> list, long j) {
        Intrinsics.checkParameterIsNotNull(list, "attendeeList");
        if (CollectionUtils.isEmpty(list)) {
            return new ArrayList();
        }
        return m119204a(m119205d(list, j), j);
    }

    /* renamed from: a */
    public final String mo114871a(TimeZone timeZone, Date date) {
        Intrinsics.checkParameterIsNotNull(timeZone, "timeZone");
        Intrinsics.checkParameterIsNotNull(date, "date");
        if (timeZone.inDaylightTime(date)) {
            String displayName = timeZone.getDisplayName(true, 1);
            Intrinsics.checkExpressionValueIsNotNull(displayName, "timeZone.getDisplayName(true, TimeZone.LONG)");
            return displayName;
        }
        String displayName2 = timeZone.getDisplayName();
        Intrinsics.checkExpressionValueIsNotNull(displayName2, "timeZone.displayName");
        return displayName2;
    }

    /* renamed from: a */
    private final List<List<UserAttendeeBaseInfo>> m119204a(HashMap<Integer, List<UserAttendeeBaseInfo>> hashMap, long j) {
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(hashMap)) {
            return arrayList;
        }
        int offset = TimeZone.getDefault().getOffset(j);
        ArrayList arrayList2 = hashMap.get(Integer.valueOf(offset));
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        arrayList.add(arrayList2);
        hashMap.remove(Integer.valueOf(offset));
        Set<Integer> keySet = hashMap.keySet();
        Intrinsics.checkExpressionValueIsNotNull(keySet, "attendeeMap.keys");
        List mutableList = CollectionsKt.toMutableList((Collection) keySet);
        CollectionsKt.sort(mutableList);
        int size = mutableList.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList3 = hashMap.get(mutableList.get(i));
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
            }
            arrayList.add(arrayList3);
        }
        return arrayList;
    }

    /* renamed from: b */
    public final boolean mo114873b(List<UserAttendeeBaseInfo> list, long j) {
        Intrinsics.checkParameterIsNotNull(list, "attendeeList");
        if (CollectionUtils.isEmpty(list)) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (UserAttendeeBaseInfo userAttendeeBaseInfo : list) {
            String timeZoneId = userAttendeeBaseInfo.getTimeZoneId();
            if (!TextUtils.isEmpty(timeZoneId)) {
                TimeZone timeZone = TimeZone.getTimeZone(timeZoneId);
                Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getTimeZone(timeZoneId)");
                arrayList.add(Integer.valueOf(timeZone.getOffset(j)));
            }
        }
        if (arrayList.size() <= 1) {
            return false;
        }
        CollectionsKt.sort(arrayList);
        if (!Intrinsics.areEqual((Integer) arrayList.get(0), (Integer) arrayList.get(arrayList.size() - 1))) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private final HashMap<Integer, List<UserAttendeeBaseInfo>> m119205d(List<UserAttendeeBaseInfo> list, long j) {
        HashMap<Integer, List<UserAttendeeBaseInfo>> hashMap = new HashMap<>();
        TimeZone timeZone = TimeZone.getDefault();
        if (CollectionUtils.isEmpty(list)) {
            return hashMap;
        }
        HashMap<Integer, List<UserAttendeeBaseInfo>> hashMap2 = hashMap;
        hashMap2.put(Integer.valueOf(timeZone.getOffset(j)), new ArrayList());
        for (UserAttendeeBaseInfo userAttendeeBaseInfo : list) {
            String timeZoneId = userAttendeeBaseInfo.getTimeZoneId();
            if (!TextUtils.isEmpty(timeZoneId)) {
                TimeZone timeZone2 = TimeZone.getTimeZone(timeZoneId);
                Intrinsics.checkExpressionValueIsNotNull(timeZone2, "TimeZone.getTimeZone(timeZoneId)");
                int offset = timeZone2.getOffset(j);
                if (!hashMap.containsKey(Integer.valueOf(offset))) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(userAttendeeBaseInfo);
                    hashMap2.put(Integer.valueOf(offset), arrayList);
                } else {
                    if (hashMap.get(Integer.valueOf(offset)) == null) {
                        hashMap2.put(Integer.valueOf(offset), new ArrayList());
                    }
                    List<UserAttendeeBaseInfo> list2 = hashMap.get(Integer.valueOf(offset));
                    if (list2 != null) {
                        list2.add(userAttendeeBaseInfo);
                    }
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public final boolean mo114872a(List<UserAttendeeBaseInfo> list, long j) {
        Intrinsics.checkParameterIsNotNull(list, "attendeeList");
        if (CollectionUtils.isEmpty(list)) {
            return false;
        }
        TimeZone timeZone = TimeZone.getDefault();
        for (UserAttendeeBaseInfo userAttendeeBaseInfo : list) {
            String timeZoneId = userAttendeeBaseInfo.getTimeZoneId();
            if (!TextUtils.isEmpty(timeZoneId)) {
                TimeZone timeZone2 = TimeZone.getTimeZone(timeZoneId);
                Intrinsics.checkExpressionValueIsNotNull(timeZone2, "TimeZone.getTimeZone(timeZoneId)");
                if (timeZone.getOffset(j) != timeZone2.getOffset(j)) {
                    return true;
                }
            }
        }
        return false;
    }
}
