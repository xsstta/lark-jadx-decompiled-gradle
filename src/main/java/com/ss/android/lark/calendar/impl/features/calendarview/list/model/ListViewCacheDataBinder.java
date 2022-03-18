package com.ss.android.lark.calendar.impl.features.calendarview.list.model;

import android.util.SparseArray;
import com.huawei.hms.actions.SearchIntents;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.SafeUITaskManager;
import com.ss.android.lark.calendar.impl.features.calendarview.cache.ListChipDataCache;
import com.ss.android.lark.calendar.impl.features.calendarview.cache.core.IPrepareChipData;
import com.ss.android.lark.calendar.impl.features.calendarview.list.view.C30850a;
import com.ss.android.lark.calendar.impl.features.calendarview.list.view.ListCalendarView;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.C31181c;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.week.C31189a;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \"2\u00020\u0001:\u0002\"#B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0006\u0010\u0010\u001a\u00020\bJ0\u0010\u0011\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u000fJ\u000e\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001aJL\u0010\u001b\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010!\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/list/model/ListViewCacheDataBinder;", "", "()V", "mListChipDataCache", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/ListChipDataCache;", "safeUITaskManager", "Lcom/ss/android/lark/calendar/impl/features/calendarview/SafeUITaskManager;", "destroy", "", "getRevisionDateRange", "Lcom/ss/android/lark/calendar/impl/features/calendarview/list/model/ListViewCacheDataBinder$QueryDateRange;", "startJulianDay", "", "endJulianDay", "isForceUpdate", "", "loadDiskData", "loadMoreData", "listCalendarView", "Lcom/ss/android/lark/calendar/impl/features/calendarview/list/view/ListCalendarView;", "startDay", "endDay", "selectJulianDay", "isScrollingDown", "preLoadInstance", "selectDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", SearchIntents.EXTRA_QUERY, "weekViewAdapter", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/week/WeekAdapter;", "monthViewAdapter", "Lcom/ss/android/lark/calendar/impl/features/common/widget/calendar/month/MonthAdapter;", "isLoadWeekData", "reset", "Companion", "QueryDateRange", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.list.a.c */
public final class ListViewCacheDataBinder {

    /* renamed from: c */
    public static final Companion f77546c = new Companion(null);

    /* renamed from: a */
    public SafeUITaskManager f77547a = new SafeUITaskManager();

    /* renamed from: b */
    public ListChipDataCache f77548b = new ListChipDataCache();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/list/model/ListViewCacheDataBinder$Companion;", "", "()V", "ILLEGAL_POSITION", "", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.list.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/list/model/ListViewCacheDataBinder$QueryDateRange;", "", "startJulianDay", "", "endJulianDay", "(II)V", "getEndJulianDay", "()I", "getStartJulianDay", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.list.a.c$b */
    public static final class QueryDateRange {

        /* renamed from: a */
        private final int f77549a;

        /* renamed from: b */
        private final int f77550b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QueryDateRange)) {
                return false;
            }
            QueryDateRange bVar = (QueryDateRange) obj;
            return this.f77549a == bVar.f77549a && this.f77550b == bVar.f77550b;
        }

        public int hashCode() {
            return (this.f77549a * 31) + this.f77550b;
        }

        public String toString() {
            return "QueryDateRange(startJulianDay=" + this.f77549a + ", endJulianDay=" + this.f77550b + ")";
        }

        /* renamed from: a */
        public final int mo111691a() {
            return this.f77549a;
        }

        /* renamed from: b */
        public final int mo111692b() {
            return this.f77550b;
        }

        public QueryDateRange(int i, int i2) {
            this.f77549a = i;
            this.f77550b = i2;
        }
    }

    /* renamed from: c */
    public final void mo111690c() {
        this.f77548b.mo110828l();
    }

    /* renamed from: a */
    public final void mo111685a() {
        this.f77548b.mo110819d(new CalendarDate().getJulianDay());
    }

    /* renamed from: b */
    public final void mo111689b() {
        this.f77547a.mo111646a();
        this.f77548b.mo110829m();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/list/model/ListViewCacheDataBinder$loadMoreData$loadMoreCallback$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/IPrepareChipData;", "onError", "", ApiHandler.API_CALLBACK_ERRMSG, "", "onPrepared", "dataType", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/IPrepareChipData$DataType;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.list.a.c$c */
    public static final class C30815c implements IPrepareChipData {

        /* renamed from: a */
        final /* synthetic */ ListViewCacheDataBinder f77551a;

        /* renamed from: b */
        final /* synthetic */ int f77552b;

        /* renamed from: c */
        final /* synthetic */ int f77553c;

        /* renamed from: d */
        final /* synthetic */ ListCalendarView f77554d;

        /* renamed from: e */
        final /* synthetic */ String f77555e;

        /* renamed from: f */
        final /* synthetic */ String f77556f;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.list.a.c$c$a */
        static final class RunnableC30816a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C30815c f77557a;

            /* renamed from: b */
            final /* synthetic */ ListChipDataCache.ListQueryData f77558b;

            RunnableC30816a(C30815c cVar, ListChipDataCache.ListQueryData dVar) {
                this.f77557a = cVar;
                this.f77558b = dVar;
            }

            public final void run() {
                C30850a aVar;
                C30814b b = this.f77558b.mo110783b();
                ListCalendarView listCalendarView = this.f77557a.f77554d;
                if (listCalendarView != null && (aVar = listCalendarView.getmCalendarRecyclerView()) != null) {
                    aVar.mo111781a(b);
                }
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.cache.core.IPrepareChipData
        /* renamed from: a */
        public void mo110811a(String str) {
            Intrinsics.checkParameterIsNotNull(str, ApiHandler.API_CALLBACK_ERRMSG);
            Log.m165383e("ListViewCacheDataBinder", C32673y.m125371a(this.f77555e, this.f77556f, str));
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.cache.core.IPrepareChipData
        /* renamed from: a */
        public void mo110810a(IPrepareChipData.DataType dataType) {
            ListChipDataCache.ListQueryData a;
            Intrinsics.checkParameterIsNotNull(dataType, "dataType");
            QueryDateRange a2 = this.f77551a.mo111684a(this.f77552b, this.f77553c, false);
            if ((a2.mo111691a() >= 0 || a2.mo111692b() >= 0) && (a = this.f77551a.f77548b.mo110766a(dataType, new ListChipDataCache.DiffQueryOption(a2.mo111691a(), a2.mo111692b(), true), new ListChipDataCache.ColorQueryOption(this.f77552b, this.f77553c, false), false)) != null) {
                this.f77551a.f77547a.mo111648a(new RunnableC30816a(this, a));
            }
        }

        C30815c(ListViewCacheDataBinder cVar, int i, int i2, ListCalendarView listCalendarView, String str, String str2) {
            this.f77551a = cVar;
            this.f77552b = i;
            this.f77553c = i2;
            this.f77554d = listCalendarView;
            this.f77555e = str;
            this.f77556f = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J \u0010\u0011\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\rH\u0002¨\u0006\u0012"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/list/model/ListViewCacheDataBinder$query$queryDataCallback$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/IPrepareChipData;", "onError", "", ApiHandler.API_CALLBACK_ERRMSG, "", "onPrepared", "dataType", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/IPrepareChipData$DataType;", "updateColorView", "listQueryData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/ListChipDataCache$ListQueryData;", "colorQueryOption", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/ListChipDataCache$ColorQueryOption;", "updateListDiff", "diffQueryOption", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/ListChipDataCache$DiffQueryOption;", "updateUI", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.list.a.c$d */
    public static final class C30817d implements IPrepareChipData {

        /* renamed from: a */
        final /* synthetic */ ListViewCacheDataBinder f77559a;

        /* renamed from: b */
        final /* synthetic */ int f77560b;

        /* renamed from: c */
        final /* synthetic */ int f77561c;

        /* renamed from: d */
        final /* synthetic */ boolean f77562d;

        /* renamed from: e */
        final /* synthetic */ ListCalendarView f77563e;

        /* renamed from: f */
        final /* synthetic */ C31189a f77564f;

        /* renamed from: g */
        final /* synthetic */ boolean f77565g;

        /* renamed from: h */
        final /* synthetic */ C31181c f77566h;

        /* renamed from: i */
        final /* synthetic */ String f77567i;

        /* renamed from: j */
        final /* synthetic */ String f77568j;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.list.a.c$d$a */
        public static final class RunnableC30818a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C30817d f77569a;

            /* renamed from: b */
            final /* synthetic */ ListChipDataCache.ListQueryData f77570b;

            /* renamed from: c */
            final /* synthetic */ ListChipDataCache.DiffQueryOption f77571c;

            /* renamed from: d */
            final /* synthetic */ ListChipDataCache.ColorQueryOption f77572d;

            RunnableC30818a(C30817d dVar, ListChipDataCache.ListQueryData dVar2, ListChipDataCache.DiffQueryOption cVar, ListChipDataCache.ColorQueryOption aVar) {
                this.f77569a = dVar;
                this.f77570b = dVar2;
                this.f77571c = cVar;
                this.f77572d = aVar;
            }

            public final void run() {
                this.f77569a.mo111698a(this.f77570b, this.f77571c);
                this.f77569a.mo111697a(this.f77570b, this.f77572d);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.cache.core.IPrepareChipData
        /* renamed from: a */
        public void mo110810a(IPrepareChipData.DataType dataType) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(dataType, "dataType");
            QueryDateRange a = this.f77559a.mo111684a(this.f77560b, this.f77561c, this.f77562d);
            int a2 = a.mo111691a();
            int b = a.mo111692b();
            if (a.mo111691a() >= 0 || a.mo111692b() >= 0) {
                z = true;
            } else {
                z = false;
            }
            ListChipDataCache.DiffQueryOption cVar = new ListChipDataCache.DiffQueryOption(a2, b, z);
            ListChipDataCache.ColorQueryOption aVar = new ListChipDataCache.ColorQueryOption(this.f77560b, this.f77561c, true);
            ListChipDataCache.ListQueryData a3 = this.f77559a.f77548b.mo110766a(dataType, cVar, aVar, this.f77562d);
            if (a3 != null) {
                m115004a(a3, cVar, aVar);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.cache.core.IPrepareChipData
        /* renamed from: a */
        public void mo110811a(String str) {
            Intrinsics.checkParameterIsNotNull(str, ApiHandler.API_CALLBACK_ERRMSG);
            Log.m165383e("ListViewCacheDataBinder", C32673y.m125371a(this.f77567i, this.f77568j, str));
        }

        /* renamed from: a */
        public final void mo111698a(ListChipDataCache.ListQueryData dVar, ListChipDataCache.DiffQueryOption cVar) {
            ListCalendarView listCalendarView;
            C30850a aVar;
            if (cVar.mo110778c() && dVar.mo110783b() != null && (listCalendarView = this.f77563e) != null && (aVar = listCalendarView.getmCalendarRecyclerView()) != null) {
                aVar.mo111781a(dVar.mo110783b());
            }
        }

        /* renamed from: a */
        public final void mo111697a(ListChipDataCache.ListQueryData dVar, ListChipDataCache.ColorQueryOption aVar) {
            SparseArray<List<Integer>> a;
            C31181c cVar;
            if (aVar.mo110772c() && (a = dVar.mo110782a()) != null) {
                C31189a aVar2 = this.f77564f;
                if (aVar2 != null) {
                    aVar2.mo113006a(a, aVar.mo110770a(), aVar.mo110771b());
                }
                if (!this.f77565g && (cVar = this.f77566h) != null) {
                    cVar.mo112958a(a, this.f77560b, this.f77561c);
                }
            }
        }

        /* renamed from: a */
        private final void m115004a(ListChipDataCache.ListQueryData dVar, ListChipDataCache.DiffQueryOption cVar, ListChipDataCache.ColorQueryOption aVar) {
            this.f77559a.f77547a.mo111648a(new RunnableC30818a(this, dVar, cVar, aVar));
        }

        C30817d(ListViewCacheDataBinder cVar, int i, int i2, boolean z, ListCalendarView listCalendarView, C31189a aVar, boolean z2, C31181c cVar2, String str, String str2) {
            this.f77559a = cVar;
            this.f77560b = i;
            this.f77561c = i2;
            this.f77562d = z;
            this.f77563e = listCalendarView;
            this.f77564f = aVar;
            this.f77565g = z2;
            this.f77566h = cVar2;
            this.f77567i = str;
            this.f77568j = str2;
        }
    }

    /* renamed from: a */
    public final void mo111686a(CalendarDate calendarDate) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "selectDate");
        this.f77548b.mo110767a(calendarDate.getJulianDay());
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.lark.calendar.impl.features.calendarview.list.model.ListViewCacheDataBinder.QueryDateRange mo111684a(int r4, int r5, boolean r6) {
        /*
            r3 = this;
            com.ss.android.lark.calendar.impl.features.calendarview.cache.b r0 = r3.f77548b
            int r0 = r0.mo110768c()
            com.ss.android.lark.calendar.impl.features.calendarview.cache.b r1 = r3.f77548b
            int r1 = r1.mo110769d()
            r2 = -1
            if (r0 < 0) goto L_0x0029
            if (r1 >= 0) goto L_0x0012
            goto L_0x0029
        L_0x0012:
            if (r5 >= r0) goto L_0x0015
            goto L_0x0029
        L_0x0015:
            if (r5 > r1) goto L_0x001e
            if (r4 >= r0) goto L_0x0027
            int r2 = r0 + -1
            r0 = r2
            r2 = r4
            goto L_0x002b
        L_0x001e:
            if (r5 <= r1) goto L_0x0027
            if (r4 <= r1) goto L_0x0023
            goto L_0x0029
        L_0x0023:
            int r1 = r1 + 1
            r2 = r1
            goto L_0x002a
        L_0x0027:
            r0 = -1
            goto L_0x002b
        L_0x0029:
            r2 = r4
        L_0x002a:
            r0 = r5
        L_0x002b:
            if (r6 == 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r5 = r0
            r4 = r2
        L_0x0030:
            com.ss.android.lark.calendar.impl.features.calendarview.list.a.c$b r6 = new com.ss.android.lark.calendar.impl.features.calendarview.list.a.c$b
            r6.<init>(r4, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendarview.list.model.ListViewCacheDataBinder.mo111684a(int, int, boolean):com.ss.android.lark.calendar.impl.features.calendarview.list.a.c$b");
    }

    /* renamed from: a */
    public final void mo111687a(ListCalendarView listCalendarView, int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        this.f77548b.mo110821e(i3);
        if (i <= 0 || i2 <= 0) {
            i5 = i3 - 14;
            i4 = i3 + 14;
        } else if (z) {
            i5 = i2 + 1;
            i4 = i2 + 15;
        } else {
            i5 = i - 15;
            i4 = i2 - 1;
        }
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("ListViewCacheDataBinder", C32673y.m125376b(valueOf, "loadMoreData", "start", String.valueOf(i5), "end", String.valueOf(i4)));
        this.f77548b.mo110812a(i5, i4, new C30815c(this, i5, i4, listCalendarView, valueOf, "loadMoreData"));
    }

    /* renamed from: a */
    public final void mo111688a(C31189a aVar, C31181c cVar, ListCalendarView listCalendarView, int i, int i2, int i3, boolean z, boolean z2) {
        this.f77548b.mo110821e(i3);
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("ListViewCacheDataBinder", C32673y.m125376b(valueOf, "queryData", "start", String.valueOf(i), "end", String.valueOf(i2)));
        this.f77548b.mo110812a(i, i2, new C30817d(this, i, i2, z2, listCalendarView, aVar, z, cVar, valueOf, "queryData"));
    }
}
