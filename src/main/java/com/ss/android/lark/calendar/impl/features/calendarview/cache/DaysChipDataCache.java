package com.ss.android.lark.calendar.impl.features.calendarview.cache;

import android.util.SparseArray;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.cache.converter.DaysChipDataConverter;
import com.ss.android.lark.calendar.impl.features.calendarview.cache.core.BaseChipDataCache;
import com.ss.android.lark.calendar.impl.features.calendarview.cache.core.IPrepareChipData;
import com.ss.android.lark.calendar.impl.features.calendarview.cache.core.QueryTask;
import com.ss.android.lark.calendar.impl.features.calendarview.cache.range.ICacheRangeMapper;
import com.ss.android.lark.calendar.impl.features.calendarview.cache.range.OneDayRangeMapper;
import com.ss.android.lark.calendar.impl.features.calendarview.cache.range.RangeInfo;
import com.ss.android.lark.calendar.impl.features.calendarview.cache.range.WeekRangeMapper;
import com.ss.android.lark.calendar.impl.features.calendarview.diskcache.ChipDiskData;
import com.ss.android.lark.calendar.impl.features.calendarview.diskcache.DayRange;
import com.ss.android.lark.calendar.impl.features.calendarview.diskcache.DaysChipDiskData;
import com.ss.android.lark.calendar.impl.features.calendarview.diskcache.IDiskCacheRange;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.AllDayEventChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.DayEventChipViewData;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 #2\u00020\u0001:\u0002#$B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\rH\u0016J,\u0010\u000e\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u00120\u000f2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003J \u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002J,\u0010\u0019\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001a0\u0010j\b\u0012\u0004\u0012\u00020\u001a`\u00120\u000f2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0003H\u0016JX\u0010 \u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u001e\u0010!\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012\u0018\u00010\u000f2\u001e\u0010\"\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001a0\u0010j\b\u0012\u0004\u0012\u00020\u001a`\u0012\u0018\u00010\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/DaysChipDataCache;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/BaseChipDataCache;", "mDayNumOnePage", "", "(I)V", "mDiskCacheRange", "Lcom/ss/android/lark/calendar/impl/features/calendarview/diskcache/IDiskCacheRange;", "correctQueryEndTime", "", "endDay", "correctQueryStartTime", "startDay", "createRangeMapper", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/range/ICacheRangeMapper;", "getAllDayChipData", "Landroid/util/SparseArray;", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/AllDayEventChipViewData;", "Lkotlin/collections/ArrayList;", "getDaysChipData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/DaysChipDataCache$DaysChipData;", "dataType", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/IPrepareChipData$DataType;", "getDaysChipSdkData", "getDaysDiskChipData", "getNormalChipData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/DayEventChipViewData;", "getViewTimeZone", "Ljava/util/TimeZone;", "preloadSDK", "", "currentDay", "saveChipDataToDisk", "allDayInstances", "normalInstances", "Companion", "DaysChipData", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.a */
public final class DaysChipDataCache extends BaseChipDataCache {

    /* renamed from: a */
    public static final Companion f76834a = new Companion(null);

    /* renamed from: h */
    private final IDiskCacheRange f76835h;

    /* renamed from: i */
    private final int f76836i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/DaysChipDataCache$Companion;", "", "()V", "ONE_DAY_ONE_PAGE", "", "TAG", "", "THREE_DAY_ONE_PAGE", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BA\u0012\u001c\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00060\u0003\u0012\u001c\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0004j\b\u0012\u0004\u0012\u00020\b`\u00060\u0003¢\u0006\u0002\u0010\tJ\u001f\u0010\r\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00060\u0003HÆ\u0003J\u001f\u0010\u000e\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0004j\b\u0012\u0004\u0012\u00020\b`\u00060\u0003HÆ\u0003JI\u0010\u000f\u001a\u00020\u00002\u001e\b\u0002\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00060\u00032\u001e\b\u0002\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0004j\b\u0012\u0004\u0012\u00020\b`\u00060\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R'\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR'\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0004j\b\u0012\u0004\u0012\u00020\b`\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/DaysChipDataCache$DaysChipData;", "", "allDayChipViewData", "Landroid/util/SparseArray;", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/AllDayEventChipViewData;", "Lkotlin/collections/ArrayList;", "dayChipViewData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/DayEventChipViewData;", "(Landroid/util/SparseArray;Landroid/util/SparseArray;)V", "getAllDayChipViewData", "()Landroid/util/SparseArray;", "getDayChipViewData", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.a$b */
    public static final class DaysChipData {

        /* renamed from: a */
        private final SparseArray<ArrayList<AllDayEventChipViewData>> f76837a;

        /* renamed from: b */
        private final SparseArray<ArrayList<DayEventChipViewData>> f76838b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DaysChipData)) {
                return false;
            }
            DaysChipData bVar = (DaysChipData) obj;
            return Intrinsics.areEqual(this.f76837a, bVar.f76837a) && Intrinsics.areEqual(this.f76838b, bVar.f76838b);
        }

        public int hashCode() {
            SparseArray<ArrayList<AllDayEventChipViewData>> sparseArray = this.f76837a;
            int i = 0;
            int hashCode = (sparseArray != null ? sparseArray.hashCode() : 0) * 31;
            SparseArray<ArrayList<DayEventChipViewData>> sparseArray2 = this.f76838b;
            if (sparseArray2 != null) {
                i = sparseArray2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "DaysChipData(allDayChipViewData=" + this.f76837a + ", dayChipViewData=" + this.f76838b + ")";
        }

        /* renamed from: a */
        public final SparseArray<ArrayList<AllDayEventChipViewData>> mo110737a() {
            return this.f76837a;
        }

        /* renamed from: b */
        public final SparseArray<ArrayList<DayEventChipViewData>> mo110738b() {
            return this.f76838b;
        }

        public DaysChipData(SparseArray<ArrayList<AllDayEventChipViewData>> sparseArray, SparseArray<ArrayList<DayEventChipViewData>> sparseArray2) {
            Intrinsics.checkParameterIsNotNull(sparseArray, "allDayChipViewData");
            Intrinsics.checkParameterIsNotNull(sparseArray2, "dayChipViewData");
            this.f76837a = sparseArray;
            this.f76838b = sparseArray2;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.cache.core.BaseChipDataCache
    /* renamed from: b */
    public TimeZone mo110734b() {
        TimeZone safeMobileNormalViewTimezone = C30022a.f74884c.mo108456c().getSafeMobileNormalViewTimezone();
        Intrinsics.checkExpressionValueIsNotNull(safeMobileNormalViewTimezone, "CalendarDependencyHolder…eMobileNormalViewTimezone");
        return safeMobileNormalViewTimezone;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.cache.core.IChipDataCache
    /* renamed from: a */
    public ICacheRangeMapper mo110730a() {
        int i = this.f76836i;
        if (i == 1) {
            return new OneDayRangeMapper();
        }
        if (i != 3) {
            return new WeekRangeMapper();
        }
        return new WeekRangeMapper();
    }

    public DaysChipDataCache(int i) {
        C306702 r2;
        this.f76836i = i;
        mo110815a(true);
        if (i == 1) {
            r2 = new IDiskCacheRange() {
                /* class com.ss.android.lark.calendar.impl.features.calendarview.cache.DaysChipDataCache.C306691 */

                @Override // com.ss.android.lark.calendar.impl.features.calendarview.diskcache.IDiskCacheRange
                /* renamed from: a */
                public List<DayRange> mo110736a() {
                    int julianDay = new CalendarDate().getJulianDay();
                    ArrayList arrayList = new ArrayList(5);
                    for (int i = 0; i <= 4; i++) {
                        int i2 = julianDay + i;
                        arrayList.add(new DayRange(i2, i2));
                    }
                    return arrayList;
                }
            };
        } else {
            r2 = new IDiskCacheRange() {
                /* class com.ss.android.lark.calendar.impl.features.calendarview.cache.DaysChipDataCache.C306702 */

                @Override // com.ss.android.lark.calendar.impl.features.calendarview.diskcache.IDiskCacheRange
                /* renamed from: a */
                public List<DayRange> mo110736a() {
                    CalendarDate firstDayOfTheWeek = new CalendarDate().getFirstDayOfTheWeek();
                    Intrinsics.checkExpressionValueIsNotNull(firstDayOfTheWeek, "CalendarDate().firstDayOfTheWeek");
                    int julianDay = firstDayOfTheWeek.getJulianDay();
                    ArrayList arrayList = new ArrayList(2);
                    for (int i = 0; i <= 1; i++) {
                        int i2 = (i * 7) + julianDay;
                        arrayList.add(new DayRange(i2, i2 + 6));
                    }
                    return arrayList;
                }
            };
        }
        this.f76835h = r2;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.cache.core.BaseChipDataCache
    /* renamed from: b */
    public long mo110732b(int i) {
        CalendarDate calendarDate = new CalendarDate();
        calendarDate.setJulianDay(i);
        CalendarDate moveThisDateToDayStart = new CalendarDate(calendarDate, C30022a.f74884c.mo108456c().getSafeMobileNormalViewTimezone()).moveThisDateToDayStart();
        Intrinsics.checkExpressionValueIsNotNull(moveThisDateToDayStart, "startWithTz.moveThisDateToDayStart()");
        return moveThisDateToDayStart.getTimeInSeconds();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.cache.core.BaseChipDataCache
    /* renamed from: c */
    public long mo110735c(int i) {
        CalendarDate calendarDate = new CalendarDate();
        calendarDate.setJulianDay(i);
        CalendarDate moveThisDateToDayEnd = new CalendarDate(calendarDate, C30022a.f74884c.mo108456c().getSafeMobileNormalViewTimezone()).moveThisDateToDayEnd();
        Intrinsics.checkExpressionValueIsNotNull(moveThisDateToDayEnd, "startWithTz.moveThisDateToDayEnd()");
        return moveThisDateToDayEnd.getTimeInSeconds();
    }

    /* renamed from: a */
    public void mo110731a(int i) {
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
        if (this.f76836i == 3 && a.length > 1) {
            mo110814a(new QueryTask(a[1], null, 2, null));
        }
    }

    /* renamed from: a */
    public final SparseArray<ArrayList<DayEventChipViewData>> mo110728a(int i, int i2) {
        Log.m165389i("DaysChipDataCache", C32673y.m125378d("getNormalChipData [" + i + ", " + i2 + ']'));
        return new DaysChipDataConverter(i, i2, mo110818c(i, i2)).mo110744b();
    }

    /* renamed from: d */
    private final DaysChipData m114028d(int i, int i2) {
        Log.m165389i("DaysChipDataCache", C32673y.m125378d("getDaysChipData [" + i + ", " + i2 + ']'));
        DaysChipDataConverter aVar = new DaysChipDataConverter(i, i2, mo110818c(i, i2));
        SparseArray<ArrayList<AllDayEventChipViewData>> a = aVar.mo110742a();
        SparseArray<ArrayList<DayEventChipViewData>> b = aVar.mo110744b();
        m114027a(i, i2, a, b);
        return new DaysChipData(a, b);
    }

    /* renamed from: b */
    public final SparseArray<ArrayList<AllDayEventChipViewData>> mo110733b(int i, int i2) {
        Log.m165389i("DaysChipDataCache", C32673y.m125378d("getAllDayChipData [" + i + ", " + i2 + ']'));
        return new DaysChipDataConverter(i, i2, mo110818c(i, i2)).mo110742a();
    }

    /* renamed from: e */
    private final DaysChipData m114029e(int i, int i2) {
        Log.m165389i("DaysChipDataCache", C32673y.m125378d("getDiskChipData [" + i + ", " + i2 + ']'));
        ChipDiskData a = mo110822f().mo110847a(i, i2);
        if (!(a instanceof DaysChipDiskData)) {
            a = null;
        }
        DaysChipDiskData daysChipDiskData = (DaysChipDiskData) a;
        if (daysChipDiskData != null) {
            int startDay = daysChipDiskData.getStartDay();
            SparseArray sparseArray = new SparseArray();
            HashMap<Integer, ArrayList<DayEventChipViewData>> hashMap = daysChipDiskData.getNormalChipData().get(Integer.valueOf(startDay));
            if (hashMap != null) {
                for (Map.Entry<Integer, ArrayList<DayEventChipViewData>> entry : hashMap.entrySet()) {
                    sparseArray.put(entry.getKey().intValue(), entry.getValue());
                }
            }
            SparseArray sparseArray2 = new SparseArray();
            HashMap<Integer, ArrayList<AllDayEventChipViewData>> hashMap2 = daysChipDiskData.getAllDayChipData().get(Integer.valueOf(startDay));
            if (hashMap2 != null) {
                for (Map.Entry<Integer, ArrayList<AllDayEventChipViewData>> entry2 : hashMap2.entrySet()) {
                    sparseArray2.put(entry2.getKey().intValue(), entry2.getValue());
                }
            }
            return new DaysChipData(sparseArray2, sparseArray);
        }
        Log.m165383e("DaysChipDataCache", C32673y.m125378d("getDiskChipData err [" + i + ", " + i2 + ']'));
        return null;
    }

    /* renamed from: a */
    public final DaysChipData mo110729a(IPrepareChipData.DataType dataType, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(dataType, "dataType");
        if (dataType == IPrepareChipData.DataType.DISK) {
            return m114029e(i, i2);
        }
        return m114028d(i, i2);
    }

    /* renamed from: a */
    private final void m114027a(int i, int i2, SparseArray<ArrayList<AllDayEventChipViewData>> sparseArray, SparseArray<ArrayList<DayEventChipViewData>> sparseArray2) {
        if (!(sparseArray2 == null || sparseArray == null)) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            int size = sparseArray2.size();
            for (int i3 = 0; i3 < size; i3++) {
                hashMap2.put(Integer.valueOf(sparseArray2.keyAt(i3)), new ArrayList(sparseArray2.valueAt(i3)));
            }
            hashMap.put(Integer.valueOf(i), hashMap2);
            HashMap hashMap3 = new HashMap();
            HashMap hashMap4 = new HashMap();
            int size2 = sparseArray.size();
            for (int i4 = 0; i4 < size2; i4++) {
                hashMap4.put(Integer.valueOf(sparseArray.keyAt(i4)), new ArrayList(sparseArray.valueAt(i4)));
            }
            hashMap3.put(Integer.valueOf(i), hashMap4);
            mo110822f().mo110851a(new DaysChipDiskData(i, i2, hashMap, hashMap3), this.f76835h);
        }
    }
}
