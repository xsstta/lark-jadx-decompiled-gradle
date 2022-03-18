package com.ss.android.lark.calendar.impl.features.calendarview.cache;

import android.util.SparseArray;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.cache.converter.ListChipDataConverter;
import com.ss.android.lark.calendar.impl.features.calendarview.cache.core.BaseChipDataCache;
import com.ss.android.lark.calendar.impl.features.calendarview.cache.core.IPrepareChipData;
import com.ss.android.lark.calendar.impl.features.calendarview.cache.core.QueryTask;
import com.ss.android.lark.calendar.impl.features.calendarview.cache.range.ICacheRangeMapper;
import com.ss.android.lark.calendar.impl.features.calendarview.cache.range.ListRangeMapper;
import com.ss.android.lark.calendar.impl.features.calendarview.cache.range.RangeInfo;
import com.ss.android.lark.calendar.impl.features.calendarview.diskcache.ChipDiskData;
import com.ss.android.lark.calendar.impl.features.calendarview.diskcache.DayRange;
import com.ss.android.lark.calendar.impl.features.calendarview.diskcache.IDiskCacheRange;
import com.ss.android.lark.calendar.impl.features.calendarview.diskcache.ListChipDiskData;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.CalendarListViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.ListEventChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.list.p1482a.C30814b;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 02\u00020\u0001:\u0004/012B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J$\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00120\u00062\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0002J\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0012H\u0002J(\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\u001a\u0010!\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J \u0010\"\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0006\u0010#\u001a\u00020\nJ\u0006\u0010$\u001a\u00020\nJ\u001c\u0010%\u001a\u00020&2\u0012\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0002J\u0010\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020\nH\u0016J \u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020\n2\u0006\u0010-\u001a\u00020.H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/ListChipDataCache;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/BaseChipDataCache;", "()V", "mDiskCacheRange", "Lcom/ss/android/lark/calendar/impl/features/calendarview/diskcache/IDiskCacheRange;", "mStoreInstances", "Landroid/util/SparseArray;", "", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/ListEventChipViewData;", "mViewEndPosition", "", "mViewStartPosition", "mViewStoreData", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/CalendarListViewData;", "createRangeMapper", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/range/ICacheRangeMapper;", "generateColorData", "", "queryStartDay", "queryEndDay", "getEventColors", "listData", "getListData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/ListChipDataCache$ListQueryData;", "dataType", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/IPrepareChipData$DataType;", "diffQueryOption", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/ListChipDataCache$DiffQueryOption;", "colorQueryOption", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/ListChipDataCache$ColorQueryOption;", "isForceUpdate", "", "getListDiskData", "getListSdkData", "getViewEndPosition", "getViewStartPosition", "mergeDaysInstance", "", "instance", "preloadSDK", "currentDay", "saveChipDataToDisk", "startDay", "endDay", "listChipData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/converter/ListChipDataConverter$ListChipData;", "ColorQueryOption", "Companion", "DiffQueryOption", "ListQueryData", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.b */
public final class ListChipDataCache extends BaseChipDataCache {

    /* renamed from: a */
    public static final Companion f76860a = new Companion(null);

    /* renamed from: h */
    private int f76861h = -1;

    /* renamed from: i */
    private int f76862i = -1;

    /* renamed from: j */
    private ArrayList<CalendarListViewData> f76863j = new ArrayList<>();

    /* renamed from: k */
    private SparseArray<List<ListEventChipViewData>> f76864k = new SparseArray<>();

    /* renamed from: l */
    private final IDiskCacheRange f76865l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/ListChipDataCache$ColorQueryOption;", "", "colorStartDay", "", "colorEndDay", "isNeedColorData", "", "(IIZ)V", "getColorEndDay", "()I", "getColorStartDay", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.b$a */
    public static final class ColorQueryOption {

        /* renamed from: a */
        private final int f76866a;

        /* renamed from: b */
        private final int f76867b;

        /* renamed from: c */
        private final boolean f76868c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ColorQueryOption)) {
                return false;
            }
            ColorQueryOption aVar = (ColorQueryOption) obj;
            return this.f76866a == aVar.f76866a && this.f76867b == aVar.f76867b && this.f76868c == aVar.f76868c;
        }

        public int hashCode() {
            int i = ((this.f76866a * 31) + this.f76867b) * 31;
            boolean z = this.f76868c;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            return i + i2;
        }

        public String toString() {
            return "ColorQueryOption(colorStartDay=" + this.f76866a + ", colorEndDay=" + this.f76867b + ", isNeedColorData=" + this.f76868c + ")";
        }

        /* renamed from: a */
        public final int mo110770a() {
            return this.f76866a;
        }

        /* renamed from: b */
        public final int mo110771b() {
            return this.f76867b;
        }

        /* renamed from: c */
        public final boolean mo110772c() {
            return this.f76868c;
        }

        public ColorQueryOption(int i, int i2, boolean z) {
            this.f76866a = i;
            this.f76867b = i2;
            this.f76868c = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/ListChipDataCache$Companion;", "", "()V", "INITIAL_POSITION", "", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.b$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/ListChipDataCache$DiffQueryOption;", "", "diffStartDay", "", "diffEndDay", "isNeedDiffData", "", "(IIZ)V", "getDiffEndDay", "()I", "getDiffStartDay", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.b$c */
    public static final class DiffQueryOption {

        /* renamed from: a */
        private final int f76869a;

        /* renamed from: b */
        private final int f76870b;

        /* renamed from: c */
        private final boolean f76871c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DiffQueryOption)) {
                return false;
            }
            DiffQueryOption cVar = (DiffQueryOption) obj;
            return this.f76869a == cVar.f76869a && this.f76870b == cVar.f76870b && this.f76871c == cVar.f76871c;
        }

        public int hashCode() {
            int i = ((this.f76869a * 31) + this.f76870b) * 31;
            boolean z = this.f76871c;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            return i + i2;
        }

        public String toString() {
            return "DiffQueryOption(diffStartDay=" + this.f76869a + ", diffEndDay=" + this.f76870b + ", isNeedDiffData=" + this.f76871c + ")";
        }

        /* renamed from: a */
        public final int mo110776a() {
            return this.f76869a;
        }

        /* renamed from: b */
        public final int mo110777b() {
            return this.f76870b;
        }

        /* renamed from: c */
        public final boolean mo110778c() {
            return this.f76871c;
        }

        public DiffQueryOption(int i, int i2, boolean z) {
            this.f76869a = i;
            this.f76870b = i2;
            this.f76871c = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u0014\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0017\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/ListChipDataCache$ListQueryData;", "", "eventColors", "Landroid/util/SparseArray;", "", "", "diff", "Lcom/ss/android/lark/calendar/impl/features/calendarview/list/model/InstanceListDiffUnit;", "(Landroid/util/SparseArray;Lcom/ss/android/lark/calendar/impl/features/calendarview/list/model/InstanceListDiffUnit;)V", "getDiff", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/list/model/InstanceListDiffUnit;", "getEventColors", "()Landroid/util/SparseArray;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.b$d */
    public static final class ListQueryData {

        /* renamed from: a */
        private final SparseArray<List<Integer>> f76872a;

        /* renamed from: b */
        private final C30814b f76873b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListQueryData)) {
                return false;
            }
            ListQueryData dVar = (ListQueryData) obj;
            return Intrinsics.areEqual(this.f76872a, dVar.f76872a) && Intrinsics.areEqual(this.f76873b, dVar.f76873b);
        }

        public int hashCode() {
            SparseArray<List<Integer>> sparseArray = this.f76872a;
            int i = 0;
            int hashCode = (sparseArray != null ? sparseArray.hashCode() : 0) * 31;
            C30814b bVar = this.f76873b;
            if (bVar != null) {
                i = bVar.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "ListQueryData(eventColors=" + this.f76872a + ", diff=" + this.f76873b + ")";
        }

        /* renamed from: a */
        public final SparseArray<List<Integer>> mo110782a() {
            return this.f76872a;
        }

        /* renamed from: b */
        public final C30814b mo110783b() {
            return this.f76873b;
        }

        public ListQueryData(SparseArray<List<Integer>> sparseArray, C30814b bVar) {
            this.f76872a = sparseArray;
            this.f76873b = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/cache/ListChipDataCache$mDiskCacheRange$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/diskcache/IDiskCacheRange;", "getCacheRanges", "", "Lcom/ss/android/lark/calendar/impl/features/calendarview/diskcache/DayRange;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.b$e */
    public static final class C30678e implements IDiskCacheRange {
        C30678e() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.diskcache.IDiskCacheRange
        /* renamed from: a */
        public List<DayRange> mo110736a() {
            CalendarDate calendarDate = new CalendarDate();
            CalendarDate b = C32647d.m125279b(calendarDate);
            CalendarDate c = C32647d.m125281c(calendarDate);
            ArrayList arrayList = new ArrayList(1);
            Intrinsics.checkExpressionValueIsNotNull(b, "startDate");
            int julianDay = b.getJulianDay();
            Intrinsics.checkExpressionValueIsNotNull(c, "endDate");
            arrayList.add(new DayRange(julianDay, c.getJulianDay()));
            return arrayList;
        }
    }

    /* renamed from: c */
    public final int mo110768c() {
        return this.f76861h;
    }

    /* renamed from: d */
    public final int mo110769d() {
        return this.f76862i;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.cache.core.IChipDataCache
    /* renamed from: a */
    public ICacheRangeMapper mo110730a() {
        return new ListRangeMapper();
    }

    public ListChipDataCache() {
        mo110815a(false);
        this.f76865l = new C30678e();
    }

    /* renamed from: a */
    private final void m114081a(SparseArray<List<ListEventChipViewData>> sparseArray) {
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            this.f76864k.append(sparseArray.keyAt(i), sparseArray.valueAt(i));
        }
    }

    /* renamed from: a */
    private final List<Integer> m114079a(List<? extends ListEventChipViewData> list) {
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isNotEmpty(list)) {
            for (int i = 0; i < list.size() && arrayList.size() < 4; i++) {
                int eventCardColor = ((ListEventChipViewData) list.get(i)).getEventCardColor();
                if (!arrayList.contains(Integer.valueOf(eventCardColor))) {
                    arrayList.add(Integer.valueOf(eventCardColor));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo110767a(int i) {
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
    private final SparseArray<List<Integer>> m114076a(int i, int i2) {
        SparseArray sparseArray = new SparseArray();
        SparseArray<List<Integer>> sparseArray2 = new SparseArray<>();
        int i3 = i2 + 1;
        while (i < i3) {
            List<ListEventChipViewData> list = this.f76864k.get(i);
            if (list != null) {
                sparseArray.put(i, list);
                sparseArray2.put(i, m114079a(list));
            }
            i++;
        }
        return sparseArray2;
    }

    /* renamed from: a */
    private final ListQueryData m114077a(DiffQueryOption cVar, ColorQueryOption aVar) {
        int a = cVar.mo110776a();
        int b = cVar.mo110777b();
        Log.m165389i("ListChipDataCache", C32673y.m125378d("getDiskChipData [" + a + ", " + b + ']'));
        ChipDiskData a2 = mo110822f().mo110847a(a, b);
        if (!(a2 instanceof ListChipDiskData)) {
            a2 = null;
        }
        ListChipDiskData listChipDiskData = (ListChipDiskData) a2;
        if (listChipDiskData != null) {
            this.f76864k.clear();
            for (Map.Entry<Integer, ArrayList<ListEventChipViewData>> entry : listChipDiskData.getDayListChipViewData().entrySet()) {
                this.f76864k.put(entry.getKey().intValue(), entry.getValue());
            }
            ArrayList<CalendarListViewData> calendarListViewData = listChipDiskData.getCalendarListViewData();
            C30814b bVar = new C30814b();
            bVar.mo111682e(2);
            bVar.mo111678c(listChipDiskData.getStartDay());
            bVar.mo111680d(listChipDiskData.getEndDay());
            bVar.mo111674a(calendarListViewData);
            SparseArray<List<Integer>> sparseArray = null;
            if (aVar.mo110772c()) {
                sparseArray = m114076a(aVar.mo110770a(), aVar.mo110771b());
            }
            return new ListQueryData(sparseArray, bVar);
        }
        Log.m165383e("ListChipDataCache", C32673y.m125378d("getListDiskData err [" + a + ", " + b + ']'));
        return null;
    }

    /* renamed from: a */
    private final ListQueryData m114078a(DiffQueryOption cVar, ColorQueryOption aVar, boolean z) {
        Log.m165389i("ListChipDataCache", C32673y.m125378d("getListSdkData [" + cVar.mo110776a() + ", " + cVar.mo110777b() + ']'));
        int a = cVar.mo110776a();
        int b = cVar.mo110777b();
        if (!cVar.mo110778c()) {
            return new ListQueryData(m114076a(aVar.mo110770a(), aVar.mo110771b()), null);
        }
        ListChipDataConverter.ListChipData a2 = new ListChipDataConverter(a, b, mo110818c(a, b)).mo110753a();
        C30814b bVar = new C30814b();
        if (z) {
            this.f76861h = a;
            this.f76862i = b;
            this.f76864k = a2.mo110754a();
            this.f76863j = a2.mo110755b();
            bVar.mo111682e(2);
        } else {
            int i = this.f76861h;
            if (a >= i || b != i - 1) {
                int i2 = this.f76862i;
                if (b <= i2 || a != i2 + 1) {
                    this.f76861h = a;
                    this.f76862i = b;
                    this.f76864k = a2.mo110754a();
                    this.f76863j = a2.mo110755b();
                    bVar.mo111682e(0);
                } else {
                    this.f76862i = b;
                    m114081a(a2.mo110754a());
                    bVar.mo111673a(this.f76863j.size());
                    bVar.mo111676b(a2.mo110755b().size());
                    bVar.mo111682e(1);
                    this.f76863j.addAll(a2.mo110755b());
                }
            } else {
                this.f76861h = a;
                m114081a(a2.mo110754a());
                this.f76863j.addAll(0, a2.mo110755b());
                bVar.mo111673a(0);
                bVar.mo111676b(a2.mo110755b().size());
                bVar.mo111682e(1);
            }
        }
        bVar.mo111678c(this.f76861h);
        bVar.mo111680d(this.f76862i);
        bVar.mo111674a(this.f76863j);
        SparseArray<List<Integer>> sparseArray = null;
        if (aVar.mo110772c()) {
            sparseArray = m114076a(aVar.mo110770a(), aVar.mo110771b());
        }
        m114080a(a, b, a2);
        return new ListQueryData(sparseArray, bVar);
    }

    /* renamed from: a */
    private final void m114080a(int i, int i2, ListChipDataConverter.ListChipData aVar) {
        SparseArray<List<ListEventChipViewData>> a = aVar.mo110754a();
        ArrayList<CalendarListViewData> b = aVar.mo110755b();
        HashMap hashMap = new HashMap();
        int size = a.size();
        for (int i3 = 0; i3 < size; i3++) {
            hashMap.put(Integer.valueOf(a.keyAt(i3)), new ArrayList(a.valueAt(i3)));
        }
        mo110822f().mo110851a(new ListChipDiskData(i, i2, hashMap, new ArrayList(b)), this.f76865l);
    }

    /* renamed from: a */
    public final ListQueryData mo110766a(IPrepareChipData.DataType dataType, DiffQueryOption cVar, ColorQueryOption aVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(dataType, "dataType");
        Intrinsics.checkParameterIsNotNull(cVar, "diffQueryOption");
        Intrinsics.checkParameterIsNotNull(aVar, "colorQueryOption");
        if (dataType == IPrepareChipData.DataType.DISK) {
            return m114077a(cVar, aVar);
        }
        return m114078a(cVar, aVar, z);
    }
}
