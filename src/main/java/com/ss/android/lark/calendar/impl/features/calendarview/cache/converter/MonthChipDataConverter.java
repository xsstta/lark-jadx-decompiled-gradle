package com.ss.android.lark.calendar.impl.features.calendarview.cache.converter;

import android.util.SparseArray;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.cache.MonthChipDataCache;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.MonthEventChipViewData;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\u0002\u0010\tJ\u0006\u0010\n\u001a\u00020\u000bJ&\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0006j\b\u0012\u0004\u0012\u00020\u0003`\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u001e\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013H\u0002J\u001c\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00180\u0017H\u0002R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/converter/MonthChipDataConverter;", "", "mQueryStartDay", "", "mQueryEndDay", "mChipData", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/EventChipViewData;", "Lkotlin/collections/ArrayList;", "(IILjava/util/ArrayList;)V", "converterToMonthData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/MonthChipDataCache$MonthChipData;", "genWeekEventInstanceRow", "weekEventChipViewData", "", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/MonthEventChipViewData;", "getMaxTakenNumber", "max", "queue", "Ljava/util/PriorityQueue;", "sortMonthData", "", "monthData", "Landroid/util/SparseArray;", "", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.a.c */
public final class MonthChipDataConverter {

    /* renamed from: a */
    public static final Companion f76855a = new Companion(null);

    /* renamed from: b */
    private final int f76856b;

    /* renamed from: c */
    private final int f76857c;

    /* renamed from: d */
    private final ArrayList<EventChipViewData> f76858d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/converter/MonthChipDataConverter$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/cache/converter/MonthChipDataConverter$sortMonthData$1", "Ljava/util/Comparator;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/MonthEventChipViewData;", "compare", "", "o1", "o2", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.a.c$c */
    public static final class C30677c implements Comparator<MonthEventChipViewData> {
        C30677c() {
        }

        /* renamed from: a */
        public int compare(MonthEventChipViewData monthEventChipViewData, MonthEventChipViewData monthEventChipViewData2) {
            if (monthEventChipViewData == monthEventChipViewData2 || monthEventChipViewData == null || monthEventChipViewData2 == null) {
                return 0;
            }
            if (monthEventChipViewData.getStartDay() != monthEventChipViewData2.getStartDay()) {
                if (monthEventChipViewData.getStartDay() - monthEventChipViewData2.getStartDay() < 0) {
                    return -1;
                }
                return 1;
            } else if (monthEventChipViewData.isAllDay() && !monthEventChipViewData2.isAllDay()) {
                return -1;
            } else {
                if (monthEventChipViewData2.isAllDay() && !monthEventChipViewData.isAllDay()) {
                    return 1;
                }
                if (monthEventChipViewData.getStartTime() != monthEventChipViewData2.getStartTime()) {
                    if (monthEventChipViewData.getStartTime() - monthEventChipViewData2.getStartTime() < 0) {
                        return -1;
                    }
                    return 1;
                } else if (monthEventChipViewData2.getEndTime() == monthEventChipViewData.getEndTime()) {
                    try {
                        CalendarEventInstance calendarEventInstance = monthEventChipViewData.getCalendarEventInstance();
                        Intrinsics.checkExpressionValueIsNotNull(calendarEventInstance, "o1.calendarEventInstance");
                        String eventServerId = calendarEventInstance.getEventServerId();
                        CalendarEventInstance calendarEventInstance2 = monthEventChipViewData2.getCalendarEventInstance();
                        Intrinsics.checkExpressionValueIsNotNull(calendarEventInstance2, "o2.calendarEventInstance");
                        String eventServerId2 = calendarEventInstance2.getEventServerId();
                        Intrinsics.checkExpressionValueIsNotNull(eventServerId2, "o2.calendarEventInstance.eventServerId");
                        return eventServerId.compareTo(eventServerId2);
                    } catch (Exception unused) {
                        return 0;
                    }
                } else if (monthEventChipViewData.getEndTime() - monthEventChipViewData2.getEndTime() < 0) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }
    }

    /* renamed from: a */
    public final MonthChipDataCache.MonthChipData mo110761a() {
        int i;
        int i2;
        Log.m165389i("MonthChipDataConverter", C32673y.m125378d("mChipData.size = " + this.f76858d.size()));
        CalendarDate calendarDate = new CalendarDate();
        calendarDate.setJulianDay(this.f76856b);
        CalendarDate calendarDate2 = new CalendarDate();
        calendarDate2.setJulianDay(this.f76857c);
        SparseArray<List<MonthEventChipViewData>> sparseArray = new SparseArray<>();
        SparseArray sparseArray2 = new SparseArray();
        SparseArray<List<MonthEventChipViewData>> sparseArray3 = new SparseArray<>();
        int julianDay = calendarDate.getJulianDay();
        int julianDay2 = calendarDate2.getJulianDay();
        if (julianDay <= julianDay2) {
            while (true) {
                sparseArray3.put(julianDay, new ArrayList());
                CalendarDate julianDay3 = new CalendarDate().setJulianDay(julianDay);
                Intrinsics.checkExpressionValueIsNotNull(julianDay3, "CalendarDate().setJulianDay(i)");
                int yearWeek = julianDay3.getYearWeek();
                sparseArray.put(yearWeek, new ArrayList());
                sparseArray2.put(yearWeek, new ArrayList());
                if (julianDay == julianDay2) {
                    break;
                }
                julianDay++;
            }
        }
        Iterator<EventChipViewData> it = this.f76858d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            EventChipViewData next = it.next();
            Intrinsics.checkExpressionValueIsNotNull(next, "chipViewData");
            int startDay = next.getStartDay();
            int endDay = next.getEndDay();
            if (startDay <= endDay) {
                while (true) {
                    if (startDay >= this.f76856b && startDay <= this.f76857c) {
                        ArrayList arrayList = sparseArray3.get(startDay);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            sparseArray3.put(startDay, arrayList);
                        }
                        MonthEventChipViewData monthEventChipViewData = new MonthEventChipViewData(next);
                        monthEventChipViewData.setEventTotalDays((next.getEndDay() - next.getStartDay()) + 1);
                        monthEventChipViewData.setCurrentDay((startDay - next.getStartDay()) + 1);
                        monthEventChipViewData.setAttachedDay(startDay);
                        arrayList.add(monthEventChipViewData);
                    }
                    if (startDay == endDay) {
                        break;
                    }
                    startDay++;
                }
            }
            int startDay2 = next.getStartDay();
            int endDay2 = next.getEndDay();
            CalendarDate julianDay4 = new CalendarDate().setJulianDay(startDay2);
            Intrinsics.checkExpressionValueIsNotNull(julianDay4, "CalendarDate().setJulianDay(dataStart)");
            for (int weeklyDayIndex = startDay2 - julianDay4.getWeeklyDayIndex(); weeklyDayIndex <= endDay2; weeklyDayIndex += 7) {
                if (weeklyDayIndex >= this.f76856b && weeklyDayIndex <= this.f76857c) {
                    CalendarDate julianDay5 = new CalendarDate().setJulianDay(weeklyDayIndex);
                    Intrinsics.checkExpressionValueIsNotNull(julianDay5, "CalendarDate().setJulianDay(weekStartDay)");
                    int yearWeek2 = julianDay5.getYearWeek();
                    ArrayList arrayList2 = sparseArray.get(yearWeek2);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        sparseArray.put(yearWeek2, arrayList2);
                    }
                    MonthEventChipViewData monthEventChipViewData2 = new MonthEventChipViewData(next);
                    monthEventChipViewData2.setSpan((Math.min(weeklyDayIndex + 6, endDay2) - Math.max(startDay2, weeklyDayIndex)) + 1);
                    if (weeklyDayIndex > startDay2) {
                        i2 = 0;
                    } else {
                        i2 = startDay2 - weeklyDayIndex;
                    }
                    monthEventChipViewData2.setColum(i2);
                    arrayList2.add(monthEventChipViewData2);
                }
            }
        }
        m114072a(sparseArray);
        m114072a(sparseArray3);
        int size = sparseArray.size();
        for (i = 0; i < size; i++) {
            List<MonthEventChipViewData> valueAt = sparseArray.valueAt(i);
            if (valueAt != null) {
                sparseArray2.put(sparseArray.keyAt(i), m114071a(valueAt));
            }
        }
        return new MonthChipDataCache.MonthChipData(sparseArray, sparseArray2, sparseArray3);
    }

    /* renamed from: a */
    private final void m114072a(SparseArray<List<MonthEventChipViewData>> sparseArray) {
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            List<MonthEventChipViewData> valueAt = sparseArray.valueAt(i);
            if (valueAt != null) {
                Collections.sort(valueAt, new C30677c());
            }
        }
    }

    /* renamed from: a */
    private final ArrayList<Integer> m114071a(List<? extends MonthEventChipViewData> list) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, C30676b.f76859a);
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>(7);
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (MonthEventChipViewData monthEventChipViewData : list) {
            while (i2 < monthEventChipViewData.getColum()) {
                while (i2 >= ((MonthEventChipViewData) arrayList.get(i3)).getColum() + ((MonthEventChipViewData) arrayList.get(i3)).getSpan()) {
                    priorityQueue.offer(Integer.valueOf(((MonthEventChipViewData) arrayList.get(i3)).getRow()));
                    i3++;
                }
                arrayList2.add(i2, Integer.valueOf(m114070a(i4, priorityQueue)));
                i2++;
            }
            while (monthEventChipViewData.getColum() >= ((MonthEventChipViewData) arrayList.get(i3)).getColum() + ((MonthEventChipViewData) arrayList.get(i3)).getSpan()) {
                priorityQueue.offer(Integer.valueOf(((MonthEventChipViewData) arrayList.get(i3)).getRow()));
                i3++;
            }
            if (!priorityQueue.isEmpty()) {
                Integer poll = priorityQueue.poll();
                Intrinsics.checkExpressionValueIsNotNull(poll, "vacantRows.poll()");
                int intValue = poll.intValue();
                i = i4;
                i4 = intValue;
            } else {
                i = i4 + 1;
            }
            monthEventChipViewData.setRow(i4);
            i4 = i;
        }
        while (i2 < 7) {
            while (i3 < arrayList.size() && i2 >= ((MonthEventChipViewData) arrayList.get(i3)).getColum() + ((MonthEventChipViewData) arrayList.get(i3)).getSpan()) {
                priorityQueue.offer(Integer.valueOf(((MonthEventChipViewData) arrayList.get(i3)).getRow()));
                i3++;
            }
            arrayList2.add(i2, Integer.valueOf(m114070a(i4, priorityQueue)));
            i2++;
        }
        return arrayList2;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/MonthEventChipViewData;", "kotlin.jvm.PlatformType", "o2", "compare"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.a.c$b */
    public static final class C30676b<T> implements Comparator<T> {

        /* renamed from: a */
        public static final C30676b f76859a = new C30676b();

        C30676b() {
        }

        /* renamed from: a */
        public final int compare(MonthEventChipViewData monthEventChipViewData, MonthEventChipViewData monthEventChipViewData2) {
            if (monthEventChipViewData == null || monthEventChipViewData2 == null) {
                return 0;
            }
            return ((monthEventChipViewData.getColum() + monthEventChipViewData.getSpan()) - monthEventChipViewData2.getColum()) - monthEventChipViewData2.getSpan();
        }
    }

    /* renamed from: a */
    private final int m114070a(int i, PriorityQueue<Integer> priorityQueue) {
        PriorityQueue priorityQueue2 = new PriorityQueue((PriorityQueue) priorityQueue);
        int i2 = -1;
        int i3 = -1;
        for (Integer num = (Integer) priorityQueue2.poll(); num != null; num = (Integer) priorityQueue2.poll()) {
            if (i2 < num.intValue() - 1) {
                i3 = num.intValue() - 1;
            }
            i2 = num.intValue();
        }
        int i4 = i - 1;
        return i2 < i4 ? i4 : i3;
    }

    public MonthChipDataConverter(int i, int i2, ArrayList<EventChipViewData> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "mChipData");
        this.f76856b = i;
        this.f76857c = i2;
        this.f76858d = arrayList;
    }
}
