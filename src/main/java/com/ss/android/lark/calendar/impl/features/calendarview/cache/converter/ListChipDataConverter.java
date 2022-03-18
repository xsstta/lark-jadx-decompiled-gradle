package com.ss.android.lark.calendar.impl.features.calendarview.cache.converter;

import android.util.SparseArray;
import com.bytedance.article.common.monitor.stack.C3474b;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.CalendarListViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.ListEventChipViewData;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0016B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u0006\u0010\t\u001a\u00020\nJ4\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0002J4\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00062\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0014\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\fH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/converter/ListChipDataConverter;", "", "mQueryStartDay", "", "mQueryEndDay", "mChipData", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/EventChipViewData;", "(IILjava/util/ArrayList;)V", "converterToListData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/converter/ListChipDataConverter$ListChipData;", "genListChipView", "Landroid/util/SparseArray;", "", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/ListEventChipViewData;", "eventChipViewData", "", "startDay", "endDay", "genListViewData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/CalendarListViewData;", "daysData", "ListChipData", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.a.b */
public final class ListChipDataConverter {

    /* renamed from: a */
    private final int f76849a;

    /* renamed from: b */
    private final int f76850b;

    /* renamed from: c */
    private final ArrayList<EventChipViewData> f76851c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B'\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u0015\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J/\u0010\u0010\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/converter/ListChipDataConverter$ListChipData;", "", "daysInstance", "Landroid/util/SparseArray;", "", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/ListEventChipViewData;", "listData", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/CalendarListViewData;", "(Landroid/util/SparseArray;Ljava/util/ArrayList;)V", "getDaysInstance", "()Landroid/util/SparseArray;", "getListData", "()Ljava/util/ArrayList;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.a.b$a */
    public static final class ListChipData {

        /* renamed from: a */
        private final SparseArray<List<ListEventChipViewData>> f76852a;

        /* renamed from: b */
        private final ArrayList<CalendarListViewData> f76853b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListChipData)) {
                return false;
            }
            ListChipData aVar = (ListChipData) obj;
            return Intrinsics.areEqual(this.f76852a, aVar.f76852a) && Intrinsics.areEqual(this.f76853b, aVar.f76853b);
        }

        public int hashCode() {
            SparseArray<List<ListEventChipViewData>> sparseArray = this.f76852a;
            int i = 0;
            int hashCode = (sparseArray != null ? sparseArray.hashCode() : 0) * 31;
            ArrayList<CalendarListViewData> arrayList = this.f76853b;
            if (arrayList != null) {
                i = arrayList.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "ListChipData(daysInstance=" + this.f76852a + ", listData=" + this.f76853b + ")";
        }

        /* renamed from: a */
        public final SparseArray<List<ListEventChipViewData>> mo110754a() {
            return this.f76852a;
        }

        /* renamed from: b */
        public final ArrayList<CalendarListViewData> mo110755b() {
            return this.f76853b;
        }

        public ListChipData(SparseArray<List<ListEventChipViewData>> sparseArray, ArrayList<CalendarListViewData> arrayList) {
            Intrinsics.checkParameterIsNotNull(sparseArray, "daysInstance");
            Intrinsics.checkParameterIsNotNull(arrayList, "listData");
            this.f76852a = sparseArray;
            this.f76853b = arrayList;
        }
    }

    /* renamed from: a */
    public final ListChipData mo110753a() {
        SparseArray<List<ListEventChipViewData>> a = m114064a(this.f76851c, this.f76849a, this.f76850b);
        return new ListChipData(a, m114065a(this.f76849a, this.f76850b, a));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/ListEventChipViewData;", "kotlin.jvm.PlatformType", "o2", "compare"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.a.b$b */
    public static final class C30675b<T> implements Comparator<ListEventChipViewData> {

        /* renamed from: a */
        public static final C30675b f76854a = new C30675b();

        C30675b() {
        }

        /* renamed from: a */
        public final int compare(ListEventChipViewData listEventChipViewData, ListEventChipViewData listEventChipViewData2) {
            if (listEventChipViewData == listEventChipViewData2 || listEventChipViewData == null || listEventChipViewData2 == null) {
                return 0;
            }
            if (listEventChipViewData.isAllDay() && !listEventChipViewData2.isAllDay()) {
                return -1;
            }
            if (listEventChipViewData2.isAllDay() && !listEventChipViewData.isAllDay()) {
                return 1;
            }
            if (listEventChipViewData.getStartTime() != listEventChipViewData2.getStartTime()) {
                if (listEventChipViewData.getStartTime() - listEventChipViewData2.getStartTime() < 0) {
                    return -1;
                }
                return 1;
            } else if (listEventChipViewData2.getEndTime() == listEventChipViewData.getEndTime()) {
                try {
                    CalendarEventInstance calendarEventInstance = listEventChipViewData.getCalendarEventInstance();
                    Intrinsics.checkExpressionValueIsNotNull(calendarEventInstance, "o1.calendarEventInstance");
                    String eventServerId = calendarEventInstance.getEventServerId();
                    CalendarEventInstance calendarEventInstance2 = listEventChipViewData2.getCalendarEventInstance();
                    Intrinsics.checkExpressionValueIsNotNull(calendarEventInstance2, "o2.calendarEventInstance");
                    String eventServerId2 = calendarEventInstance2.getEventServerId();
                    Intrinsics.checkExpressionValueIsNotNull(eventServerId2, "o2.calendarEventInstance.eventServerId");
                    return eventServerId.compareTo(eventServerId2);
                } catch (Exception e) {
                    C3474b.m14692a(e);
                    return 0;
                }
            } else if (listEventChipViewData.getEndTime() - listEventChipViewData2.getEndTime() < 0) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    public ListChipDataConverter(int i, int i2, ArrayList<EventChipViewData> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "mChipData");
        this.f76849a = i;
        this.f76850b = i2;
        this.f76851c = arrayList;
    }

    /* renamed from: a */
    private final SparseArray<List<ListEventChipViewData>> m114064a(List<? extends EventChipViewData> list, int i, int i2) {
        int startDay;
        int endDay;
        SparseArray<List<ListEventChipViewData>> sparseArray = new SparseArray<>();
        if (list == null) {
            return sparseArray;
        }
        for (EventChipViewData eventChipViewData : list) {
            if (eventChipViewData != null && (startDay = eventChipViewData.getStartDay()) <= (endDay = eventChipViewData.getEndDay())) {
                while (true) {
                    if (startDay >= i && startDay <= i2) {
                        ArrayList arrayList = sparseArray.get(startDay);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            sparseArray.put(startDay, arrayList);
                        }
                        ListEventChipViewData listEventChipViewData = new ListEventChipViewData(eventChipViewData);
                        listEventChipViewData.setEventTotalDays((eventChipViewData.getEndDay() - eventChipViewData.getStartDay()) + 1);
                        listEventChipViewData.setCurrentDay((startDay - eventChipViewData.getStartDay()) + 1);
                        listEventChipViewData.setAttachedDay(startDay);
                        arrayList.add(listEventChipViewData);
                    }
                    if (startDay == endDay) {
                        break;
                    }
                    startDay++;
                }
            }
        }
        int size = sparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            Collections.sort(sparseArray.valueAt(i3), C30675b.f76854a);
        }
        return sparseArray;
    }

    /* renamed from: a */
    private final ArrayList<CalendarListViewData> m114065a(int i, int i2, SparseArray<List<ListEventChipViewData>> sparseArray) {
        ArrayList<CalendarListViewData> arrayList = new ArrayList<>();
        if (sparseArray == null) {
            return arrayList;
        }
        CalendarDate calendarDate = new CalendarDate();
        if (i <= i2) {
            while (true) {
                CalendarDate calendarDate2 = new CalendarDate();
                calendarDate2.setJulianDay(i);
                if (calendarDate2.getMonthDay() == 1) {
                    arrayList.add(new CalendarListViewData(calendarDate2, 1, calendarDate));
                }
                if (calendarDate2.getWeeklyDayIndex() == 0) {
                    arrayList.add(new CalendarListViewData(calendarDate2, 2, calendarDate));
                }
                List<ListEventChipViewData> list = sparseArray.get(i);
                if (list != null && list.size() > 0) {
                    boolean z = true;
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        CalendarListViewData calendarListViewData = new CalendarListViewData(calendarDate2, list.get(i3), calendarDate);
                        if (z) {
                            calendarListViewData.setIsDayFirstInstance(true);
                            z = false;
                        }
                        if (i3 == list.size() - 1) {
                            calendarListViewData.setIsDayLastInstance(true);
                        }
                        arrayList.add(calendarListViewData);
                    }
                } else if (i == calendarDate.getJulianDay()) {
                    CalendarListViewData calendarListViewData2 = new CalendarListViewData(calendarDate2, 3, calendarDate);
                    calendarListViewData2.setIsDayFirstInstance(true);
                    calendarListViewData2.setIsDayLastInstance(true);
                    arrayList.add(calendarListViewData2);
                }
                if (i == i2) {
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }
}
