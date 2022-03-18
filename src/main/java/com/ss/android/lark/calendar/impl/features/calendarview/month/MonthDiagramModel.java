package com.ss.android.lark.calendar.impl.features.calendarview.month;

import androidx.lifecycle.C1177w;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.IDateLogicData;
import com.ss.android.lark.calendar.impl.features.calendarview.cache.MonthChipDataCache;
import com.ss.android.lark.calendar.impl.features.calendarview.cache.core.IPrepareChipData;
import com.ss.android.lark.calendar.impl.features.calendarview.cache.range.RangeInfo;
import com.ss.android.lark.calendar.impl.features.calendarview.month.IMonthDiagramContract;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.BaseModelCalendar;
import com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.utils.C32647d;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.Date;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000501234B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0002J\u0006\u0010\u0016\u001a\u00020\u0006J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0006H\u0016J\u0006\u0010\"\u001a\u00020\u0006J\f\u0010#\u001a\u00060$R\u00020\u0000H\u0016J\b\u0010%\u001a\u00020&H\u0002J\u0018\u0010'\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010(\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010)\u001a\u00020\u0013H\u0016J\b\u0010*\u001a\u00020\u0013H\u0016J\b\u0010+\u001a\u00020\u0013H\u0016J\u0010\u0010,\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\bH\u0016J\b\u0010.\u001a\u00020\u0013H\u0016J\b\u0010/\u001a\u00020\u0013H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\fX\u000e¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/month/MonthDiagramModel;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/BaseModelCalendar;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/IMonthDiagramContract$IMonthDiagramViewData;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/IMonthDiagramContract$IMonthDiagramModelApi;", "()V", "mCenterPageFirstDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "mDateLogicData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/IDateLogicData;", "mMonthChipDataCache", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/MonthChipDataCache;", "mMonthPageLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/MonthDiagramModel$MonthChipLiveData;", "mSelectCurrentStateLiveData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/MonthDiagramModel$SelectCurrentState;", "mSettingItemsLiveData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/MonthDiagramModel$SettingItemsData;", "calculateSelectCurrentState", "", "destroy", "generateCenterPageFirstDate", "getCurrentDateFromLogic", "getMonthPageFirstDate", "position", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/IMonthDiagramContract$PagePosition;", "getMonthPageRange", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/range/RangeInfo;", "getPageQueryRange", "operationType", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/IMonthDiagramContract$OperationType;", "getSelectCurrentDiff", "", "getSelectDateAfterModifyToCurrent", "getSelectDateFromLogic", "getViewData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/MonthDiagramModel$MonthDiagramViewData;", "isInCurrentPage", "", "loadPageData", "modifyCenterPageFirstDate", "preloadDiskData", "preloadInstance", "resetDataCache", "setDateLogicData", "dateLogicData", "updateCacheAnchorDay", "updateSettingItems", "Companion", "MonthChipLiveData", "MonthDiagramViewData", "SelectCurrentState", "SettingItemsData", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MonthDiagramModel extends BaseModelCalendar<IMonthDiagramContract.IMonthDiagramViewData> implements IMonthDiagramContract.IMonthDiagramModelApi {

    /* renamed from: e */
    public static final Companion f77936e = new Companion(null);

    /* renamed from: a */
    public MonthChipDataCache f77937a = new MonthChipDataCache();

    /* renamed from: b */
    public C1177w<MonthChipLiveData> f77938b = new C1177w<>();

    /* renamed from: c */
    public C1177w<SelectCurrentState> f77939c = new C1177w<>();

    /* renamed from: d */
    public C1177w<SettingItemsData> f77940d = new C1177w<>();

    /* renamed from: f */
    private IDateLogicData f77941f;

    /* renamed from: g */
    private CalendarDate f77942g = new CalendarDate();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/month/MonthDiagramModel$SelectCurrentState;", "", "number", "", "(Ljava/lang/String;II)V", "getNumber", "()I", "SELECT_CURRENT_EQUAL", "SELECT_CURRENT_SAME_PAGE", "SELECT_CURRENT_LEFT_PAGE", "SELECT_CURRENT_RIGHT_PAGE", "SELECT_CURRENT_LEFT_NOT_ADJACENT", "SELECT_CURRENT_RIGHT_NOT_ADJACENT", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum SelectCurrentState {
        SELECT_CURRENT_EQUAL(0),
        SELECT_CURRENT_SAME_PAGE(1),
        SELECT_CURRENT_LEFT_PAGE(2),
        SELECT_CURRENT_RIGHT_PAGE(3),
        SELECT_CURRENT_LEFT_NOT_ADJACENT(4),
        SELECT_CURRENT_RIGHT_NOT_ADJACENT(5);
        
        private final int number;

        public final int getNumber() {
            return this.number;
        }

        private SelectCurrentState(int i) {
            this.number = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/month/MonthDiagramModel$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.month.MonthDiagramModel$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/month/MonthDiagramModel$MonthChipLiveData;", "", "startJulianDay", "", "monthChipData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/MonthChipDataCache$MonthChipData;", "(ILcom/ss/android/lark/calendar/impl/features/calendarview/cache/MonthChipDataCache$MonthChipData;)V", "getMonthChipData", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/MonthChipDataCache$MonthChipData;", "getStartJulianDay", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.month.MonthDiagramModel$b */
    public static final class MonthChipLiveData {

        /* renamed from: a */
        private final int f77943a;

        /* renamed from: b */
        private final MonthChipDataCache.MonthChipData f77944b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MonthChipLiveData)) {
                return false;
            }
            MonthChipLiveData bVar = (MonthChipLiveData) obj;
            return this.f77943a == bVar.f77943a && Intrinsics.areEqual(this.f77944b, bVar.f77944b);
        }

        public int hashCode() {
            int i = this.f77943a * 31;
            MonthChipDataCache.MonthChipData bVar = this.f77944b;
            return i + (bVar != null ? bVar.hashCode() : 0);
        }

        public String toString() {
            return "MonthChipLiveData(startJulianDay=" + this.f77943a + ", monthChipData=" + this.f77944b + ")";
        }

        /* renamed from: a */
        public final int mo112038a() {
            return this.f77943a;
        }

        /* renamed from: b */
        public final MonthChipDataCache.MonthChipData mo112039b() {
            return this.f77944b;
        }

        public MonthChipLiveData(int i, MonthChipDataCache.MonthChipData bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "monthChipData");
            this.f77943a = i;
            this.f77944b = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/month/MonthDiagramModel$SettingItemsData;", "", "dayOfWeek", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting$DayOfWeek;", "isShowAlternateCalendar", "", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting$DayOfWeek;Z)V", "getDayOfWeek", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting$DayOfWeek;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.month.MonthDiagramModel$d */
    public static final class SettingItemsData {

        /* renamed from: a */
        private final CalendarSetting.DayOfWeek f77946a;

        /* renamed from: b */
        private final boolean f77947b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingItemsData)) {
                return false;
            }
            SettingItemsData dVar = (SettingItemsData) obj;
            return Intrinsics.areEqual(this.f77946a, dVar.f77946a) && this.f77947b == dVar.f77947b;
        }

        public int hashCode() {
            CalendarSetting.DayOfWeek dayOfWeek = this.f77946a;
            int hashCode = (dayOfWeek != null ? dayOfWeek.hashCode() : 0) * 31;
            boolean z = this.f77947b;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            return hashCode + i;
        }

        public String toString() {
            return "SettingItemsData(dayOfWeek=" + this.f77946a + ", isShowAlternateCalendar=" + this.f77947b + ")";
        }

        /* renamed from: a */
        public final CalendarSetting.DayOfWeek mo112043a() {
            return this.f77946a;
        }

        /* renamed from: b */
        public final boolean mo112044b() {
            return this.f77947b;
        }

        public SettingItemsData(CalendarSetting.DayOfWeek dayOfWeek, boolean z) {
            Intrinsics.checkParameterIsNotNull(dayOfWeek, "dayOfWeek");
            this.f77946a = dayOfWeek;
            this.f77947b = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006H\u0016¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/month/MonthDiagramModel$MonthDiagramViewData;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/IMonthDiagramContract$IMonthDiagramViewData;", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/month/MonthDiagramModel;)V", "getCurrentDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "getMonthPageLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/MonthDiagramModel$MonthChipLiveData;", "getSelectCurrentStateLiveData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/MonthDiagramModel$SelectCurrentState;", "getSelectDate", "getSettingItemsData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/MonthDiagramModel$SettingItemsData;", "getSettingItemsLiveData", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.month.MonthDiagramModel$c */
    public final class MonthDiagramViewData implements IMonthDiagramContract.IMonthDiagramViewData {
        @Override // com.ss.android.lark.calendar.impl.features.calendarview.month.IMonthDiagramContract.IMonthDiagramViewData
        /* renamed from: a */
        public C1177w<MonthChipLiveData> mo112028a() {
            return MonthDiagramModel.this.f77938b;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.month.IMonthDiagramContract.IMonthDiagramViewData
        /* renamed from: b */
        public C1177w<SelectCurrentState> mo112029b() {
            return MonthDiagramModel.this.f77939c;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.month.IMonthDiagramContract.IMonthDiagramViewData
        /* renamed from: c */
        public C1177w<SettingItemsData> mo112030c() {
            return MonthDiagramModel.this.f77940d;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.month.IMonthDiagramContract.IMonthDiagramViewData
        /* renamed from: d */
        public CalendarDate mo112031d() {
            return MonthDiagramModel.this.mo112034j();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.month.IMonthDiagramContract.IMonthDiagramViewData
        /* renamed from: e */
        public CalendarDate mo112032e() {
            return MonthDiagramModel.this.mo112035k();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.month.IMonthDiagramContract.IMonthDiagramViewData
        /* renamed from: f */
        public SettingItemsData mo112033f() {
            boolean z;
            CalendarSetting c = C30022a.f74884c.mo108456c();
            if (c.getAlternateCalendar() == CalendarSetting.AlternateCalendar.CHINESE_LUNAR_CALENDAR) {
                z = true;
            } else {
                z = false;
            }
            SettingItemsData b = MonthDiagramModel.this.f77940d.mo5927b();
            if (b != null) {
                return b;
            }
            CalendarSetting.DayOfWeek weekStartDay = c.getWeekStartDay();
            Intrinsics.checkExpressionValueIsNotNull(weekStartDay, "setting.weekStartDay");
            return new SettingItemsData(weekStartDay, z);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public MonthDiagramViewData() {
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.month.IMonthDiagramContract.IMonthDiagramModelApi
    /* renamed from: c */
    public void mo112010c() {
        this.f77937a.mo110828l();
    }

    /* renamed from: l */
    public MonthDiagramViewData mo109793f() {
        return new MonthDiagramViewData();
    }

    /* renamed from: m */
    private final void m115456m() {
        CalendarDate calendarDate = new CalendarDate(mo112035k());
        this.f77942g = calendarDate;
        calendarDate.setMonthDay(1);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.month.IMonthDiagramContract.IMonthDiagramModelApi
    /* renamed from: a */
    public void mo112006a() {
        this.f77937a.mo110819d(mo112035k().getJulianDay());
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.month.IMonthDiagramContract.IMonthDiagramModelApi
    /* renamed from: b */
    public void mo112009b() {
        this.f77937a.mo110803a(mo112035k().getJulianDay());
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.month.IMonthDiagramContract.IMonthDiagramModelApi
    /* renamed from: d */
    public void mo112011d() {
        this.f77937a.mo110821e(mo112035k().getJulianDay());
    }

    @Override // com.ss.android.lark.calendar.impl.framework.calendarmvp.BaseModelCalendar, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f77937a.mo110829m();
        super.destroy();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.month.IMonthDiagramContract.IMonthDiagramModelApi
    /* renamed from: e */
    public void mo112012e() {
        C30022a.f74884c.mo108450a(new C30945f(this));
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.month.IMonthDiagramContract.IMonthDiagramModelApi
    /* renamed from: i */
    public float mo112015i() {
        return (float) mo112035k().dayDiff(mo112034j());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/month/MonthDiagramModel$loadPageData$callback$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/IPrepareChipData;", "onError", "", ApiHandler.API_CALLBACK_ERRMSG, "", "onPrepared", "dataType", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/IPrepareChipData$DataType;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.month.MonthDiagramModel$e */
    public static final class C30943e implements IPrepareChipData {

        /* renamed from: a */
        final /* synthetic */ MonthDiagramModel f77948a;

        /* renamed from: b */
        final /* synthetic */ RangeInfo f77949b;

        /* renamed from: c */
        final /* synthetic */ String f77950c;

        /* renamed from: d */
        final /* synthetic */ String f77951d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.month.MonthDiagramModel$e$a */
        static final class RunnableC30944a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C30943e f77952a;

            /* renamed from: b */
            final /* synthetic */ MonthChipDataCache.MonthChipData f77953b;

            RunnableC30944a(C30943e eVar, MonthChipDataCache.MonthChipData bVar) {
                this.f77952a = eVar;
                this.f77953b = bVar;
            }

            public final void run() {
                this.f77952a.f77948a.f77938b.mo5929b(new MonthChipLiveData(this.f77952a.f77949b.mo110796c(), this.f77953b));
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.cache.core.IPrepareChipData
        /* renamed from: a */
        public void mo110811a(String str) {
            Intrinsics.checkParameterIsNotNull(str, ApiHandler.API_CALLBACK_ERRMSG);
            Log.m165383e("MonthDiagramModel", C32673y.m125371a(this.f77950c, this.f77951d, str));
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.cache.core.IPrepareChipData
        /* renamed from: a */
        public void mo110810a(IPrepareChipData.DataType dataType) {
            Intrinsics.checkParameterIsNotNull(dataType, "dataType");
            MonthChipDataCache.MonthChipData a = this.f77948a.f77937a.mo110802a(dataType, this.f77949b.mo110796c(), this.f77949b.mo110797d());
            if (a != null) {
                int a2 = C32673y.m125368a(a.mo110804a(), a.mo110806c());
                Log.m165389i("MonthDiagramModel", C32673y.m125373a(this.f77950c, this.f77951d, "instances_size", String.valueOf(a2)));
                UICallbackExecutor.execute(new RunnableC30944a(this, a));
            }
        }

        C30943e(MonthDiagramModel monthDiagramModel, RangeInfo eVar, String str, String str2) {
            this.f77948a = monthDiagramModel;
            this.f77949b = eVar;
            this.f77950c = str;
            this.f77951d = str2;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.month.IMonthDiagramContract.IMonthDiagramModelApi
    /* renamed from: h */
    public CalendarDate mo112014h() {
        CalendarDate calendarDate = new CalendarDate(mo112034j());
        this.f77937a.mo110821e(calendarDate.getJulianDay());
        return calendarDate;
    }

    /* renamed from: j */
    public final CalendarDate mo112034j() {
        CalendarDate d;
        IDateLogicData hVar = this.f77941f;
        if (hVar == null || (d = hVar.mo111630d()) == null) {
            return new CalendarDate();
        }
        return d;
    }

    /* renamed from: k */
    public final CalendarDate mo112035k() {
        CalendarDate c;
        IDateLogicData hVar = this.f77941f;
        if (hVar == null || (c = hVar.mo111629c()) == null) {
            return new CalendarDate();
        }
        return c;
    }

    /* renamed from: n */
    private final boolean m115457n() {
        CalendarDate j = mo112034j();
        RangeInfo b = m115453b(IMonthDiagramContract.PagePosition.CENTER);
        if (j.getJulianDay() < b.mo110796c() || j.getJulianDay() > b.mo110797d()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.month.IMonthDiagramContract.IMonthDiagramModelApi
    /* renamed from: g */
    public void mo112013g() {
        SelectCurrentState selectCurrentState;
        CalendarDate j = mo112034j();
        CalendarDate k = mo112035k();
        if (j.sameDay(k)) {
            this.f77939c.mo5929b(SelectCurrentState.SELECT_CURRENT_EQUAL);
        } else if (m115457n()) {
            this.f77939c.mo5929b(SelectCurrentState.SELECT_CURRENT_SAME_PAGE);
        } else {
            CalendarDate c = m115455c(IMonthDiagramContract.PagePosition.LEFT);
            CalendarDate c2 = m115455c(IMonthDiagramContract.PagePosition.RIGHT);
            C1177w<SelectCurrentState> wVar = this.f77939c;
            if (j.getYear() == c.getYear() && j.getMonth() == c.getMonth()) {
                selectCurrentState = SelectCurrentState.SELECT_CURRENT_RIGHT_PAGE;
            } else if (j.getYear() == c2.getYear() && j.getMonth() == c2.getMonth()) {
                selectCurrentState = SelectCurrentState.SELECT_CURRENT_LEFT_PAGE;
            } else if (j.getJulianDay() > k.getJulianDay()) {
                mo112008a(IMonthDiagramContract.PagePosition.RIGHT, IMonthDiagramContract.OperationType.MOVE_TODAY);
                selectCurrentState = SelectCurrentState.SELECT_CURRENT_LEFT_NOT_ADJACENT;
            } else {
                mo112008a(IMonthDiagramContract.PagePosition.LEFT, IMonthDiagramContract.OperationType.MOVE_TODAY);
                selectCurrentState = SelectCurrentState.SELECT_CURRENT_RIGHT_NOT_ADJACENT;
            }
            wVar.mo5929b(selectCurrentState);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.month.IMonthDiagramContract.IMonthDiagramModelApi
    /* renamed from: a */
    public void mo112007a(IDateLogicData hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "dateLogicData");
        this.f77941f = hVar;
        m115456m();
    }

    /* renamed from: a */
    private final void m115452a(IMonthDiagramContract.PagePosition pagePosition) {
        int i = C30946a.f77956b[pagePosition.ordinal()];
        if (i == 1) {
            CalendarDate modifyMonth = this.f77942g.modifyMonth(-1);
            Intrinsics.checkExpressionValueIsNotNull(modifyMonth, "mCenterPageFirstDate.modifyMonth(-1)");
            this.f77942g = modifyMonth;
        } else if (i == 2) {
            CalendarDate modifyMonth2 = this.f77942g.modifyMonth(1);
            Intrinsics.checkExpressionValueIsNotNull(modifyMonth2, "mCenterPageFirstDate.modifyMonth(1)");
            this.f77942g = modifyMonth2;
        }
        this.f77942g.setMonthDay(1);
    }

    /* renamed from: c */
    private final CalendarDate m115455c(IMonthDiagramContract.PagePosition pagePosition) {
        CalendarDate calendarDate = new CalendarDate(this.f77942g);
        int i = C30946a.f77958d[pagePosition.ordinal()];
        if (i == 1) {
            CalendarDate modifyMonth = calendarDate.modifyMonth(-1);
            Intrinsics.checkExpressionValueIsNotNull(modifyMonth, "firstDate.modifyMonth(-1)");
            return modifyMonth;
        } else if (i == 2) {
            return calendarDate;
        } else {
            CalendarDate modifyMonth2 = calendarDate.modifyMonth(1);
            Intrinsics.checkExpressionValueIsNotNull(modifyMonth2, "firstDate.modifyMonth(1)");
            return modifyMonth2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "calendarSetting", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting;", "onGetSucceed"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.month.MonthDiagramModel$f */
    static final class C30945f implements C30086b.AbstractC30090a {

        /* renamed from: a */
        final /* synthetic */ MonthDiagramModel f77954a;

        C30945f(MonthDiagramModel monthDiagramModel) {
            this.f77954a = monthDiagramModel;
        }

        @Override // com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.AbstractC30090a
        public final void onGetSucceed(CalendarSetting calendarSetting) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(calendarSetting, "calendarSetting");
            SettingItemsData b = this.f77954a.f77940d.mo5927b();
            if (calendarSetting.getAlternateCalendar() == CalendarSetting.AlternateCalendar.CHINESE_LUNAR_CALENDAR) {
                z = true;
            } else {
                z = false;
            }
            if (b == null || b.mo112043a() != calendarSetting.getWeekStartDay() || b.mo112044b() != z) {
                C1177w<SettingItemsData> wVar = this.f77954a.f77940d;
                CalendarSetting.DayOfWeek weekStartDay = calendarSetting.getWeekStartDay();
                Intrinsics.checkExpressionValueIsNotNull(weekStartDay, "calendarSetting.weekStartDay");
                wVar.mo5926a(new SettingItemsData(weekStartDay, z));
            }
        }
    }

    /* renamed from: b */
    private final RangeInfo m115453b(IMonthDiagramContract.PagePosition pagePosition) {
        int i = C30946a.f77957c[pagePosition.ordinal()];
        if (i == 1) {
            CalendarDate a = C32647d.m125275a(this.f77942g, -1);
            CalendarDate a2 = C32647d.m125276a(this.f77942g, a, -1);
            Intrinsics.checkExpressionValueIsNotNull(a, "lastPageStartDate");
            int julianDay = a.getJulianDay();
            Intrinsics.checkExpressionValueIsNotNull(a2, "lastPageEndDate");
            return new RangeInfo(julianDay, a2.getJulianDay());
        } else if (i != 2) {
            CalendarDate a3 = C32647d.m125275a(this.f77942g, 1);
            CalendarDate a4 = C32647d.m125276a(this.f77942g, a3, 1);
            Intrinsics.checkExpressionValueIsNotNull(a3, "nextPageStartDate");
            int julianDay2 = a3.getJulianDay();
            Intrinsics.checkExpressionValueIsNotNull(a4, "nextPageEndDate");
            return new RangeInfo(julianDay2, a4.getJulianDay());
        } else {
            CalendarDate a5 = C32647d.m125275a(this.f77942g, 0);
            CalendarDate a6 = C32647d.m125276a(this.f77942g, a5, 0);
            Intrinsics.checkExpressionValueIsNotNull(a5, "anchorStartDate");
            int julianDay3 = a5.getJulianDay();
            Intrinsics.checkExpressionValueIsNotNull(a6, "anchorEndDate");
            return new RangeInfo(julianDay3, a6.getJulianDay());
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.month.IMonthDiagramContract.IMonthDiagramModelApi
    /* renamed from: a */
    public void mo112008a(IMonthDiagramContract.PagePosition pagePosition, IMonthDiagramContract.OperationType operationType) {
        Intrinsics.checkParameterIsNotNull(pagePosition, "position");
        Intrinsics.checkParameterIsNotNull(operationType, "operationType");
        RangeInfo b = m115454b(pagePosition, operationType);
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("MonthDiagramModel", C32673y.m125376b(valueOf, "queryMonthEventChipData", "start", String.valueOf(b.mo110796c()), "end", String.valueOf(b.mo110797d())));
        this.f77937a.mo110812a(b.mo110796c(), b.mo110797d(), new C30943e(this, b, valueOf, "queryMonthEventChipData"));
    }

    /* renamed from: b */
    private final RangeInfo m115454b(IMonthDiagramContract.PagePosition pagePosition, IMonthDiagramContract.OperationType operationType) {
        int i = C30946a.f77955a[operationType.ordinal()];
        if (i == 1) {
            m115452a(pagePosition);
            return m115453b(pagePosition);
        } else if (i == 2) {
            this.f77942g = new CalendarDate(mo112035k());
            return m115453b(pagePosition);
        } else if (i == 3) {
            CalendarDate calendarDate = new CalendarDate(mo112034j());
            this.f77942g = calendarDate;
            calendarDate.setMonthDay(1);
            return m115453b(IMonthDiagramContract.PagePosition.CENTER);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
