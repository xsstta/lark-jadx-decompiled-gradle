package com.ss.android.lark.calendar.impl.features.events.edit.utils;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J>\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\"\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b`\fJ\u0016\u0010\r\u001a\u0004\u0018\u00010\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/utils/EventCalendarUtils;", "", "()V", "arrangeCalendarList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "calendarList", "", "googleMap", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "setRecommendCalendarId", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.d.b */
public final class EventCalendarUtils {

    /* renamed from: a */
    public static final EventCalendarUtils f80184a = new EventCalendarUtils();

    private EventCalendarUtils() {
    }

    /* renamed from: a */
    public final String mo114856a(ArrayList<Calendar> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "calendarList");
        if (arrayList.size() == 0) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<Calendar> it = arrayList.iterator();
        while (it.hasNext()) {
            Calendar next = it.next();
            Intrinsics.checkExpressionValueIsNotNull(next, "calendar");
            if (next.isVisible()) {
                arrayList2.add(next);
            }
        }
        int size = arrayList2.size();
        if (size == 0) {
            return null;
        }
        if (size != 1) {
            CollectionsKt.sortWith(arrayList2, C31618b.f80186a);
            Object obj = arrayList2.get(0);
            Intrinsics.checkExpressionValueIsNotNull(obj, "selectedList[0]");
            return ((Calendar) obj).getServerId();
        }
        Object obj2 = arrayList2.get(0);
        Intrinsics.checkExpressionValueIsNotNull(obj2, "selectedList[0]");
        return ((Calendar) obj2).getServerId();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "kotlin.jvm.PlatformType", "o2", "compare"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.d.b$b */
    public static final class C31618b<T> implements Comparator<Calendar> {

        /* renamed from: a */
        public static final C31618b f80186a = new C31618b();

        C31618b() {
        }

        /* renamed from: a */
        public final int compare(Calendar calendar, Calendar calendar2) {
            Intrinsics.checkExpressionValueIsNotNull(calendar2, "o2");
            int weight = calendar2.getWeight();
            Intrinsics.checkExpressionValueIsNotNull(calendar, "o1");
            return weight - calendar.getWeight();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "kotlin.jvm.PlatformType", "o2", "compare"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.d.b$a */
    public static final class C31617a<T> implements Comparator<Calendar> {

        /* renamed from: a */
        public static final C31617a f80185a = new C31617a();

        C31617a() {
        }

        /* renamed from: a */
        public final int compare(Calendar calendar, Calendar calendar2) {
            Intrinsics.checkExpressionValueIsNotNull(calendar, "o1");
            Calendar.Type type = calendar.getType();
            Intrinsics.checkExpressionValueIsNotNull(type, "o1.type");
            int number = type.getNumber();
            Intrinsics.checkExpressionValueIsNotNull(calendar2, "o2");
            Calendar.Type type2 = calendar2.getType();
            Intrinsics.checkExpressionValueIsNotNull(type2, "o2.type");
            return number - type2.getNumber();
        }
    }

    /* renamed from: a */
    public final ArrayList<Calendar> mo114857a(List<? extends Calendar> list, HashMap<String, Boolean> hashMap) {
        Intrinsics.checkParameterIsNotNull(list, "calendarList");
        Intrinsics.checkParameterIsNotNull(hashMap, "googleMap");
        ArrayList<Calendar> arrayList = new ArrayList<>();
        Calendar calendar = null;
        for (Calendar calendar2 : list) {
            if (calendar2.getSelfAccessRole() == Calendar.AccessRole.WRITER || calendar2.getSelfAccessRole() == Calendar.AccessRole.OWNER) {
                if (calendar2.isPrimary() && calendar2.getType() != Calendar.Type.GOOGLE && calendar2.getType() != Calendar.Type.EXCHANGE) {
                    calendar = calendar2;
                } else if (calendar2.getType() == Calendar.Type.GOOGLE) {
                    Boolean bool = hashMap.get(calendar2.getExternalAccount());
                    if (bool == null) {
                        bool = true;
                    }
                    Intrinsics.checkExpressionValueIsNotNull(bool, "googleMap[calendar.externalAccount] ?: true");
                    if (bool.booleanValue()) {
                        arrayList.add(calendar2);
                    }
                } else if (calendar2.getType() == Calendar.Type.EXCHANGE) {
                    arrayList.add(calendar2);
                } else if (!calendar2.isPrimary()) {
                    arrayList.add(calendar2);
                }
            }
        }
        CollectionsKt.sortWith(arrayList, C31617a.f80185a);
        if (calendar != null) {
            arrayList.add(0, calendar);
        }
        return arrayList;
    }
}
