package com.ss.android.lark.calendar.impl.features.calendarview.cache.converter;

import android.util.SparseArray;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.AllDayEventChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.DayEventChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.DayInstancesLayout;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.DayInstancesSlotMetric;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.InstanceLayout;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.InstanceSlotMetric;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\b\u0018\u0000 .2\u00020\u0001:\u0004./01B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0002JE\u0010\u0012\u001a\u0004\u0018\u0001H\u0013\"\u0004\b\u0000\u0010\u0014\"\u0004\b\u0001\u0010\u00132\u0006\u0010\u0015\u001a\u0002H\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00130\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u00130\u0019H\u0002¢\u0006\u0002\u0010\u001aJ\u001c\u0010\u001b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f0\u0006j\b\u0012\u0004\u0012\u00020\f`\b0\u000bJ\u001c\u0010\u001c\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\u0006j\b\u0012\u0004\u0012\u00020\u000e`\b0\u000bJF\u0010\u001d\u001a\u00020\u001e2\u001c\u0010\u001f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f0\u0006j\b\u0012\u0004\u0012\u00020\f`\b0\u000b2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0003H\u0002J>\u0010#\u001a\u00020\u001e2\u001c\u0010$\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\u0006j\b\u0012\u0004\u0012\u00020\u000e`\b0\u000b2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003H\u0002J<\u0010&\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\u0006j\b\u0012\u0004\u0012\u00020\u000e`\b0\u000b2\u001c\u0010'\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\u0006j\b\u0012\u0004\u0012\u00020\u000e`\b0\u000bH\u0002J\u0016\u0010(\u001a\u00020\u001e2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0*H\u0002J&\u0010+\u001a\u00020\u001e2\u001c\u0010\u001f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f0\u0006j\b\u0012\u0004\u0012\u00020\f`\b0\u000bH\u0002J\b\u0010,\u001a\u00020\u001eH\u0002J\\\u0010,\u001a\u00020\u001e2\u0016\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\u001c\u0010$\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\u0006j\b\u0012\u0004\u0012\u00020\u000e`\b0\u000b2\u001c\u0010\u001f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f0\u0006j\b\u0012\u0004\u0012\u00020\f`\b0\u000bH\u0002R$\u0010\n\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f0\u0006j\b\u0012\u0004\u0012\u00020\f`\b0\u000bX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0004¢\u0006\u0002\n\u0000R$\u0010\r\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\u0006j\b\u0012\u0004\u0012\u00020\u000e`\b0\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/converter/DaysChipDataConverter;", "", "mQueryStartDay", "", "mQueryEndDay", "mChipViewData", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/EventChipViewData;", "Lkotlin/collections/ArrayList;", "(IILjava/util/ArrayList;)V", "mAllDayChipData", "Landroid/util/SparseArray;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/AllDayEventChipViewData;", "mDayChipData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/DayEventChipViewData;", "mNumDays", "containedInWhichBaseDay", "startDay", "find", "T", "K", "key", "target", "", "consumer", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/converter/DaysChipDataConverter$Consumer;", "(Ljava/lang/Object;Ljava/lang/Iterable;Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/converter/DaysChipDataConverter$Consumer;)Ljava/lang/Object;", "getAllDayChipData", "getDayChipData", "handleAllDayEvent", "", "allDaysInstances", "chipViewData", "endDay", "baseDay", "handleNormalEvent", "normalInstances", "deltaDay", "layoutNormalDayInstances", "normalEventChipViewData", "sortAllDayEventInstances", "allDayEventChipViewData", "", "sortAllDayEvents", "splitEventInstances", "eventChipViewData", "Companion", "Consumer", "ICalculateEventChipLayout", "SdkCalculateEventChipLayoutImpl", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.a.a */
public final class DaysChipDataConverter {

    /* renamed from: a */
    public static final Companion f76839a = new Companion(null);

    /* renamed from: b */
    private final int f76840b;

    /* renamed from: c */
    private final SparseArray<ArrayList<DayEventChipViewData>> f76841c = new SparseArray<>();

    /* renamed from: d */
    private final SparseArray<ArrayList<AllDayEventChipViewData>> f76842d = new SparseArray<>();

    /* renamed from: e */
    private final int f76843e;

    /* renamed from: f */
    private final int f76844f;

    /* renamed from: g */
    private final ArrayList<EventChipViewData> f76845g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b`\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H&¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/converter/DaysChipDataConverter$Consumer;", "K", "T", "", "accept", "", "key", "item", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.a.a$b */
    public interface Consumer<K, T> {
        /* renamed from: a */
        boolean mo110745a(K k, T t);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J<\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00060\u00032\u001c\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00060\u0003H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/converter/DaysChipDataConverter$ICalculateEventChipLayout;", "", "calculateLayoutInfo", "Landroid/util/SparseArray;", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/DayEventChipViewData;", "Lkotlin/collections/ArrayList;", "dayChipViewData", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.a.a$c */
    public interface ICalculateEventChipLayout {
        /* renamed from: a */
        SparseArray<ArrayList<DayEventChipViewData>> mo110746a(SparseArray<ArrayList<DayEventChipViewData>> sparseArray);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u00042\u001c\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u0004H\u0016JT\u0010\t\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u00042\u001c\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u00042\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0005j\b\u0012\u0004\u0012\u00020\u000b`\u0007H\u0002J6\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0005j\b\u0012\u0004\u0012\u00020\u000b`\u00072\u001c\u0010\r\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u0004H\u0002¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/converter/DaysChipDataConverter$SdkCalculateEventChipLayoutImpl;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/converter/DaysChipDataConverter$ICalculateEventChipLayout;", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/converter/DaysChipDataConverter;)V", "calculateLayoutInfo", "Landroid/util/SparseArray;", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/DayEventChipViewData;", "Lkotlin/collections/ArrayList;", "dayChipViewData", "sortAndLayoutEventInstances", "dayInstancesLayouts", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DayInstancesLayout;", "syncGetInstanceLayout", "normalInstances", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.a.a$d */
    public final class SdkCalculateEventChipLayoutImpl implements ICalculateEventChipLayout {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/cache/converter/DaysChipDataConverter$SdkCalculateEventChipLayoutImpl$sortAndLayoutEventInstances$findDayEventChipViewDataConsumer$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/converter/DaysChipDataConverter$Consumer;", "", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/DayEventChipViewData;", "accept", "", "key", "item", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.a.a$d$a */
        public static final class C30671a implements Consumer<String, DayEventChipViewData> {
            C30671a() {
            }

            /* renamed from: a */
            public boolean mo110745a(String str, DayEventChipViewData dayEventChipViewData) {
                Intrinsics.checkParameterIsNotNull(str, "key");
                Intrinsics.checkParameterIsNotNull(dayEventChipViewData, "item");
                return Intrinsics.areEqual(str, dayEventChipViewData.getId());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/cache/converter/DaysChipDataConverter$SdkCalculateEventChipLayoutImpl$sortAndLayoutEventInstances$findDayInstancesLayoutConsumer$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/converter/DaysChipDataConverter$Consumer;", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DayInstancesLayout;", "accept", "", "key", "item", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.a.a$d$b */
        public static final class C30672b implements Consumer<Integer, DayInstancesLayout> {
            C30672b() {
            }

            /* renamed from: a */
            public boolean mo110748a(int i, DayInstancesLayout dayInstancesLayout) {
                Intrinsics.checkParameterIsNotNull(dayInstancesLayout, "item");
                if (i == dayInstancesLayout.getLayoutDay()) {
                    return true;
                }
                return false;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // com.ss.android.lark.calendar.impl.features.calendarview.cache.converter.DaysChipDataConverter.Consumer
            /* renamed from: a */
            public /* synthetic */ boolean mo110745a(Integer num, DayInstancesLayout dayInstancesLayout) {
                return mo110748a(num.intValue(), dayInstancesLayout);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public SdkCalculateEventChipLayoutImpl() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.cache.converter.DaysChipDataConverter.ICalculateEventChipLayout
        /* renamed from: a */
        public SparseArray<ArrayList<DayEventChipViewData>> mo110746a(SparseArray<ArrayList<DayEventChipViewData>> sparseArray) {
            Intrinsics.checkParameterIsNotNull(sparseArray, "dayChipViewData");
            return m114055a(sparseArray, m114056b(sparseArray));
        }

        /* renamed from: b */
        private final ArrayList<DayInstancesLayout> m114056b(SparseArray<ArrayList<DayEventChipViewData>> sparseArray) {
            String str;
            ArrayList arrayList = new ArrayList();
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                ArrayList arrayList2 = new ArrayList();
                DayInstancesSlotMetric dayInstancesSlotMetric = new DayInstancesSlotMetric();
                int keyAt = sparseArray.keyAt(i);
                Iterator<DayEventChipViewData> it = sparseArray.get(keyAt).iterator();
                while (it.hasNext()) {
                    DayEventChipViewData next = it.next();
                    InstanceSlotMetric instanceSlotMetric = new InstanceSlotMetric();
                    Intrinsics.checkExpressionValueIsNotNull(next, "item");
                    arrayList2.add(instanceSlotMetric.setId(next.getId()).setStartDay(next.getStartDay()).setEndDay(next.getEndDay()).setStartMinute(next.getStartMinute()).setEndMinute(next.getEndMinute()).setStartTime(next.getStartTime()).setEndTime(next.getEndTime()));
                }
                DayInstancesSlotMetric layoutDay = dayInstancesSlotMetric.setLayoutDay(keyAt);
                Intrinsics.checkExpressionValueIsNotNull(layoutDay, "dayInstancesSlotMetric.s…               julianDay)");
                layoutDay.setInstanceSlotMetrics(arrayList2);
                arrayList.add(dayInstancesSlotMetric);
            }
            String valueOf = String.valueOf(new Date().getTime());
            Log.m165389i("DaysChipEventCallbackAdapter", C32673y.m125376b(valueOf, "syncGetInstancesLayout", "days_instance_slot_metrics_size", String.valueOf(arrayList.size())));
            ArrayList<DayInstancesLayout> a = C32533b.m124620a().mo118849a(arrayList);
            String[] strArr = new String[2];
            strArr[0] = "days_instance_layout_size";
            if (a == null || (str = String.valueOf(a.size())) == null) {
                str = "null";
            }
            strArr[1] = str;
            Log.m165389i("DaysChipEventCallbackAdapter", C32673y.m125373a(valueOf, "syncGetInstancesLayout", strArr));
            Intrinsics.checkExpressionValueIsNotNull(a, "instancesLayouts");
            return a;
        }

        /* renamed from: a */
        private final SparseArray<ArrayList<DayEventChipViewData>> m114055a(SparseArray<ArrayList<DayEventChipViewData>> sparseArray, ArrayList<DayInstancesLayout> arrayList) {
            C30672b bVar = new C30672b();
            C30671a aVar = new C30671a();
            SparseArray<ArrayList<DayEventChipViewData>> sparseArray2 = new SparseArray<>();
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                ArrayList<DayEventChipViewData> arrayList2 = sparseArray.get(keyAt);
                DayInstancesLayout dayInstancesLayout = (DayInstancesLayout) DaysChipDataConverter.this.mo110743a(Integer.valueOf(keyAt), arrayList, bVar);
                if (dayInstancesLayout != null) {
                    ArrayList<DayEventChipViewData> arrayList3 = new ArrayList<>();
                    sparseArray2.put(keyAt, arrayList3);
                    for (InstanceLayout instanceLayout : dayInstancesLayout.getInstanceLayouts()) {
                        DaysChipDataConverter aVar2 = DaysChipDataConverter.this;
                        Intrinsics.checkExpressionValueIsNotNull(instanceLayout, "instanceLayout");
                        String id = instanceLayout.getId();
                        Intrinsics.checkExpressionValueIsNotNull(id, "instanceLayout.id");
                        Intrinsics.checkExpressionValueIsNotNull(arrayList2, "chipViewData");
                        DayEventChipViewData dayEventChipViewData = (DayEventChipViewData) aVar2.mo110743a(id, arrayList2, aVar);
                        if (dayEventChipViewData != null) {
                            dayEventChipViewData.setLayout(instanceLayout);
                            arrayList3.add(dayEventChipViewData);
                        }
                    }
                }
            }
            return sparseArray2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/converter/DaysChipDataConverter$Companion;", "", "()V", "INVALID_BASE_DAY", "", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final SparseArray<ArrayList<AllDayEventChipViewData>> mo110742a() {
        m114048b(this.f76842d);
        return this.f76842d;
    }

    /* renamed from: b */
    public final SparseArray<ArrayList<DayEventChipViewData>> mo110744b() {
        return m114043a(this.f76841c);
    }

    /* renamed from: c */
    private final void m114049c() {
        CollectionsKt.sort(this.f76845g);
        this.f76842d.put(this.f76843e, new ArrayList<>());
        int i = this.f76843e;
        int i2 = this.f76844f;
        if (i <= i2) {
            while (true) {
                this.f76841c.put(i, new ArrayList<>());
                if (i == i2) {
                    break;
                }
                i++;
            }
        }
        m114046a(this.f76845g, this.f76841c, this.f76842d);
    }

    /* renamed from: a */
    private final int m114042a(int i) {
        int i2 = this.f76843e;
        if (i < i2 || i > (this.f76840b + i2) - 1) {
            return -1;
        }
        return i2;
    }

    /* renamed from: a */
    private final SparseArray<ArrayList<DayEventChipViewData>> m114043a(SparseArray<ArrayList<DayEventChipViewData>> sparseArray) {
        return new SdkCalculateEventChipLayoutImpl().mo110746a(sparseArray);
    }

    /* renamed from: b */
    private final void m114048b(SparseArray<ArrayList<AllDayEventChipViewData>> sparseArray) {
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ArrayList<AllDayEventChipViewData> valueAt = sparseArray.valueAt(i);
            Intrinsics.checkExpressionValueIsNotNull(valueAt, "totalInstances");
            m114047a(valueAt);
        }
    }

    /* renamed from: a */
    private final void m114047a(List<? extends AllDayEventChipViewData> list) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(list, C30673e.f76847a);
        CollectionsKt.sortWith(arrayList, C30674f.f76848a);
        PriorityQueue priorityQueue = new PriorityQueue();
        int i2 = 0;
        int i3 = 0;
        for (AllDayEventChipViewData allDayEventChipViewData : list) {
            while (i2 < arrayList.size()) {
                int col = allDayEventChipViewData.getCol();
                Object obj = arrayList.get(i2);
                Intrinsics.checkExpressionValueIsNotNull(obj, "sortByEnd[endIndex]");
                int col2 = ((AllDayEventChipViewData) obj).getCol();
                Object obj2 = arrayList.get(i2);
                Intrinsics.checkExpressionValueIsNotNull(obj2, "sortByEnd[endIndex]");
                if (col < col2 + ((AllDayEventChipViewData) obj2).getSpan()) {
                    break;
                }
                int i4 = i2 + 1;
                Object obj3 = arrayList.get(i2);
                Intrinsics.checkExpressionValueIsNotNull(obj3, "sortByEnd[endIndex++]");
                priorityQueue.offer(Integer.valueOf(((AllDayEventChipViewData) obj3).getRow()));
                i2 = i4;
            }
            if (!priorityQueue.isEmpty()) {
                Object poll = priorityQueue.poll();
                Intrinsics.checkExpressionValueIsNotNull(poll, "vacantRows.poll()");
                int intValue = ((Number) poll).intValue();
                i = i3;
                i3 = intValue;
            } else {
                i = i3 + 1;
            }
            allDayEventChipViewData.setRow(i3);
            i3 = i;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/AllDayEventChipViewData;", "kotlin.jvm.PlatformType", "o2", "compare"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.a.a$e */
    public static final class C30673e<T> implements Comparator<T> {

        /* renamed from: a */
        public static final C30673e f76847a = new C30673e();

        C30673e() {
        }

        /* renamed from: a */
        public final int compare(AllDayEventChipViewData allDayEventChipViewData, AllDayEventChipViewData allDayEventChipViewData2) {
            Intrinsics.checkExpressionValueIsNotNull(allDayEventChipViewData, "o1");
            int col = allDayEventChipViewData.getCol();
            Intrinsics.checkExpressionValueIsNotNull(allDayEventChipViewData2, "o2");
            return col - allDayEventChipViewData2.getCol();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/AllDayEventChipViewData;", "kotlin.jvm.PlatformType", "o2", "compare"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.a.a$f */
    public static final class C30674f<T> implements Comparator<AllDayEventChipViewData> {

        /* renamed from: a */
        public static final C30674f f76848a = new C30674f();

        C30674f() {
        }

        /* renamed from: a */
        public final int compare(AllDayEventChipViewData allDayEventChipViewData, AllDayEventChipViewData allDayEventChipViewData2) {
            Intrinsics.checkExpressionValueIsNotNull(allDayEventChipViewData, "o1");
            Intrinsics.checkExpressionValueIsNotNull(allDayEventChipViewData2, "o2");
            return ((allDayEventChipViewData.getCol() + allDayEventChipViewData.getSpan()) - allDayEventChipViewData2.getCol()) - allDayEventChipViewData2.getSpan();
        }
    }

    public DaysChipDataConverter(int i, int i2, ArrayList<EventChipViewData> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "mChipViewData");
        this.f76843e = i;
        this.f76844f = i2;
        this.f76845g = arrayList;
        int i3 = (i2 - i) + 1;
        this.f76840b = i3 != 0 ? i3 : 1;
        m114049c();
    }

    /* renamed from: a */
    private final void m114046a(ArrayList<EventChipViewData> arrayList, SparseArray<ArrayList<DayEventChipViewData>> sparseArray, SparseArray<ArrayList<AllDayEventChipViewData>> sparseArray2) {
        Iterator<EventChipViewData> it = arrayList.iterator();
        while (it.hasNext()) {
            EventChipViewData next = it.next();
            int i = this.f76843e;
            Intrinsics.checkExpressionValueIsNotNull(next, "chipViewData");
            int max = Math.max(i, next.getStartDay());
            int min = Math.min(this.f76844f, next.getEndDay());
            int i2 = min - max;
            if (max <= this.f76844f && min >= this.f76843e) {
                int max2 = Math.max(m114042a(max), this.f76843e);
                if (next.isDuration24Hour() || next.isShowInAllDay()) {
                    m114045a(sparseArray2, next, max, min, max2);
                } else {
                    m114044a(sparseArray, next, max, i2);
                }
            }
        }
    }

    /* renamed from: a */
    public final <K, T> T mo110743a(K k, Iterable<? extends T> iterable, Consumer<K, T> bVar) {
        for (T t : iterable) {
            if (bVar.mo110745a(k, t)) {
                return t;
            }
        }
        return null;
    }

    /* renamed from: a */
    private final void m114044a(SparseArray<ArrayList<DayEventChipViewData>> sparseArray, EventChipViewData eventChipViewData, int i, int i2) {
        int i3 = i2 + 1;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i + i4;
            DayEventChipViewData dayEventChipViewData = new DayEventChipViewData(eventChipViewData);
            dayEventChipViewData.setIsSupportDrag(!eventChipViewData.isCrossDay());
            if (sparseArray.get(i5) == null) {
                sparseArray.put(i5, new ArrayList<>());
            }
            ArrayList<DayEventChipViewData> arrayList = sparseArray.get(i5);
            if (arrayList != null) {
                arrayList.add(dayEventChipViewData);
            }
        }
    }

    /* renamed from: a */
    private final void m114045a(SparseArray<ArrayList<AllDayEventChipViewData>> sparseArray, EventChipViewData eventChipViewData, int i, int i2, int i3) {
        AllDayEventChipViewData allDayEventChipViewData = new AllDayEventChipViewData(eventChipViewData);
        int i4 = i - i3;
        int min = Math.min((i2 - i) + 1, this.f76840b - i4);
        allDayEventChipViewData.setCol(i4);
        allDayEventChipViewData.setSpan(min);
        ArrayList<AllDayEventChipViewData> arrayList = sparseArray.get(i3);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            sparseArray.put(i3, arrayList);
        }
        arrayList.add(allDayEventChipViewData);
    }
}
