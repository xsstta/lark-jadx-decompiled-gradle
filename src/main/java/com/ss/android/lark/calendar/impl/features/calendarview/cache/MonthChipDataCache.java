package com.ss.android.lark.calendar.impl.features.calendarview.cache;

import android.util.SparseArray;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.cache.converter.MonthChipDataConverter;
import com.ss.android.lark.calendar.impl.features.calendarview.cache.core.BaseChipDataCache;
import com.ss.android.lark.calendar.impl.features.calendarview.cache.core.IPrepareChipData;
import com.ss.android.lark.calendar.impl.features.calendarview.cache.core.QueryTask;
import com.ss.android.lark.calendar.impl.features.calendarview.cache.range.ICacheRangeMapper;
import com.ss.android.lark.calendar.impl.features.calendarview.cache.range.MonthRangeMapper;
import com.ss.android.lark.calendar.impl.features.calendarview.cache.range.RangeInfo;
import com.ss.android.lark.calendar.impl.features.calendarview.diskcache.ChipDiskData;
import com.ss.android.lark.calendar.impl.features.calendarview.diskcache.DayRange;
import com.ss.android.lark.calendar.impl.features.calendarview.diskcache.IDiskCacheRange;
import com.ss.android.lark.calendar.impl.features.calendarview.diskcache.MonthChipDiskData;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.MonthEventChipViewData;
import com.ss.android.lark.calendar.impl.utils.C32647d;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u0016B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\fH\u0016J \u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/MonthChipDataCache;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/BaseChipDataCache;", "()V", "mDiskCacheRange", "Lcom/ss/android/lark/calendar/impl/features/calendarview/diskcache/IDiskCacheRange;", "createRangeMapper", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/range/ICacheRangeMapper;", "getMonthData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/MonthChipDataCache$MonthChipData;", "dataType", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/IPrepareChipData$DataType;", "startDay", "", "endDay", "getMonthDiskData", "getMonthSdkData", "preloadSDK", "", "currentDay", "saveChipDataToDisk", "monthChipData", "Companion", "MonthChipData", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.c */
public final class MonthChipDataCache extends BaseChipDataCache {

    /* renamed from: a */
    public static final Companion f76882a = new Companion(null);

    /* renamed from: h */
    private final IDiskCacheRange f76883h = new C30679c();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/MonthChipDataCache$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BK\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u0003\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\u0002\u0010\u000bJ\u0015\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\u001f\u0010\u0011\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u0003HÆ\u0003J\u0015\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003JU\u0010\u0013\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u001e\b\u0002\u0010\u0006\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u00032\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\bHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR'\u0010\u0006\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/MonthChipDataCache$MonthChipData;", "", "weeklyInstance", "Landroid/util/SparseArray;", "", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/MonthEventChipViewData;", "weeklyMaxRow", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "dailyInstance", "(Landroid/util/SparseArray;Landroid/util/SparseArray;Landroid/util/SparseArray;)V", "getDailyInstance", "()Landroid/util/SparseArray;", "getWeeklyInstance", "getWeeklyMaxRow", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.c$b */
    public static final class MonthChipData {

        /* renamed from: a */
        private final SparseArray<List<MonthEventChipViewData>> f76884a;

        /* renamed from: b */
        private final SparseArray<ArrayList<Integer>> f76885b;

        /* renamed from: c */
        private final SparseArray<List<MonthEventChipViewData>> f76886c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MonthChipData)) {
                return false;
            }
            MonthChipData bVar = (MonthChipData) obj;
            return Intrinsics.areEqual(this.f76884a, bVar.f76884a) && Intrinsics.areEqual(this.f76885b, bVar.f76885b) && Intrinsics.areEqual(this.f76886c, bVar.f76886c);
        }

        public int hashCode() {
            SparseArray<List<MonthEventChipViewData>> sparseArray = this.f76884a;
            int i = 0;
            int hashCode = (sparseArray != null ? sparseArray.hashCode() : 0) * 31;
            SparseArray<ArrayList<Integer>> sparseArray2 = this.f76885b;
            int hashCode2 = (hashCode + (sparseArray2 != null ? sparseArray2.hashCode() : 0)) * 31;
            SparseArray<List<MonthEventChipViewData>> sparseArray3 = this.f76886c;
            if (sparseArray3 != null) {
                i = sparseArray3.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            return "MonthChipData(weeklyInstance=" + this.f76884a + ", weeklyMaxRow=" + this.f76885b + ", dailyInstance=" + this.f76886c + ")";
        }

        /* renamed from: a */
        public final SparseArray<List<MonthEventChipViewData>> mo110804a() {
            return this.f76884a;
        }

        /* renamed from: b */
        public final SparseArray<ArrayList<Integer>> mo110805b() {
            return this.f76885b;
        }

        /* renamed from: c */
        public final SparseArray<List<MonthEventChipViewData>> mo110806c() {
            return this.f76886c;
        }

        public MonthChipData(SparseArray<List<MonthEventChipViewData>> sparseArray, SparseArray<ArrayList<Integer>> sparseArray2, SparseArray<List<MonthEventChipViewData>> sparseArray3) {
            Intrinsics.checkParameterIsNotNull(sparseArray, "weeklyInstance");
            Intrinsics.checkParameterIsNotNull(sparseArray2, "weeklyMaxRow");
            Intrinsics.checkParameterIsNotNull(sparseArray3, "dailyInstance");
            this.f76884a = sparseArray;
            this.f76885b = sparseArray2;
            this.f76886c = sparseArray3;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/cache/MonthChipDataCache$mDiskCacheRange$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/diskcache/IDiskCacheRange;", "getCacheRanges", "", "Lcom/ss/android/lark/calendar/impl/features/calendarview/diskcache/DayRange;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.c$c */
    public static final class C30679c implements IDiskCacheRange {
        C30679c() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.diskcache.IDiskCacheRange
        /* renamed from: a */
        public List<DayRange> mo110736a() {
            CalendarDate calendarDate = new CalendarDate();
            CalendarDate a = C32647d.m125275a(calendarDate, 0);
            CalendarDate a2 = C32647d.m125276a(calendarDate, a, 0);
            ArrayList arrayList = new ArrayList(1);
            Intrinsics.checkExpressionValueIsNotNull(a, "startDate");
            int julianDay = a.getJulianDay();
            Intrinsics.checkExpressionValueIsNotNull(a2, "endDate");
            arrayList.add(new DayRange(julianDay, a2.getJulianDay()));
            return arrayList;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.cache.core.IChipDataCache
    /* renamed from: a */
    public ICacheRangeMapper mo110730a() {
        return new MonthRangeMapper();
    }

    public MonthChipDataCache() {
        mo110815a(false);
    }

    /* renamed from: a */
    public void mo110803a(int i) {
        boolean z;
        mo110820e().mo110787a(i);
        RangeInfo[] a = mo110820e().mo110788a();
        if (a.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            mo110814a(new QueryTask(a[0], null, 2, null));
        }
    }

    /* renamed from: a */
    private final MonthChipData m114120a(int i, int i2) {
        Log.m165389i("MonthChipDataCache", C32673y.m125378d("getMonthData [" + i + ", " + i2 + ']'));
        MonthChipData a = new MonthChipDataConverter(i, i2, mo110818c(i, i2)).mo110761a();
        m114121a(i, i2, a);
        return a;
    }

    /* renamed from: b */
    private final MonthChipData m114122b(int i, int i2) {
        Log.m165389i("MonthChipDataCache", C32673y.m125378d("getDiskChipData [" + i + ", " + i2 + ']'));
        ChipDiskData a = mo110822f().mo110847a(i, i2);
        if (!(a instanceof MonthChipDiskData)) {
            a = null;
        }
        MonthChipDiskData monthChipDiskData = (MonthChipDiskData) a;
        if (monthChipDiskData != null) {
            SparseArray sparseArray = new SparseArray();
            for (Map.Entry<Integer, ArrayList<MonthEventChipViewData>> entry : monthChipDiskData.getWeeklyChipData().entrySet()) {
                Integer key = entry.getKey();
                Intrinsics.checkExpressionValueIsNotNull(key, "key");
                sparseArray.put(key.intValue(), entry.getValue());
            }
            SparseArray sparseArray2 = new SparseArray();
            for (Map.Entry<Integer, ArrayList<MonthEventChipViewData>> entry2 : monthChipDiskData.getDailyChipData().entrySet()) {
                Integer key2 = entry2.getKey();
                Intrinsics.checkExpressionValueIsNotNull(key2, "key");
                sparseArray2.put(key2.intValue(), entry2.getValue());
            }
            SparseArray sparseArray3 = new SparseArray();
            for (Map.Entry<Integer, ArrayList<Integer>> entry3 : monthChipDiskData.getWeeklyMaxRow().entrySet()) {
                Integer key3 = entry3.getKey();
                Intrinsics.checkExpressionValueIsNotNull(key3, "key");
                sparseArray3.put(key3.intValue(), entry3.getValue());
            }
            return new MonthChipData(sparseArray, sparseArray3, sparseArray2);
        }
        Log.m165383e("MonthChipDataCache", C32673y.m125378d("getDiskChipData err = [" + i + ", " + i2 + ']'));
        return null;
    }

    /* renamed from: a */
    public final MonthChipData mo110802a(IPrepareChipData.DataType dataType, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(dataType, "dataType");
        if (dataType == IPrepareChipData.DataType.DISK) {
            return m114122b(i, i2);
        }
        return m114120a(i, i2);
    }

    /* renamed from: a */
    private final void m114121a(int i, int i2, MonthChipData bVar) {
        SparseArray<List<MonthEventChipViewData>> a = bVar.mo110804a();
        SparseArray<List<MonthEventChipViewData>> c = bVar.mo110806c();
        SparseArray<ArrayList<Integer>> b = bVar.mo110805b();
        HashMap hashMap = new HashMap();
        int size = a.size();
        for (int i3 = 0; i3 < size; i3++) {
            hashMap.put(Integer.valueOf(a.keyAt(i3)), new ArrayList(a.valueAt(i3)));
        }
        HashMap hashMap2 = new HashMap();
        int size2 = c.size();
        for (int i4 = 0; i4 < size2; i4++) {
            hashMap2.put(Integer.valueOf(c.keyAt(i4)), new ArrayList(c.valueAt(i4)));
        }
        HashMap hashMap3 = new HashMap();
        int size3 = b.size();
        for (int i5 = 0; i5 < size3; i5++) {
            Integer valueOf = Integer.valueOf(b.keyAt(i5));
            ArrayList<Integer> valueAt = b.valueAt(i5);
            Intrinsics.checkExpressionValueIsNotNull(valueAt, "weeklyMaxRow.valueAt(i)");
            hashMap3.put(valueOf, valueAt);
        }
        mo110822f().mo110851a(new MonthChipDiskData(i, i2, hashMap, hashMap2, hashMap3), this.f76883h);
    }
}
