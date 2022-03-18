package com.ss.android.lark.calendar.impl.features.calendarview.cache.core;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.calendar.impl.features.calendarview.cache.core.IPrepareChipData;
import com.ss.android.lark.calendar.impl.features.calendarview.cache.range.RangeInfo;
import com.ss.android.lark.calendar.impl.features.calendarview.diskcache.ChipDiskData;
import com.ss.android.lark.calendar.impl.features.calendarview.diskcache.DiskCacheManager;
import com.ss.android.lark.calendar.impl.features.calendarview.diskcache.IDiskCacheRange;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.CalendarPerfMonitor;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.LaunchPerfMonitor;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.PerfHelper;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\u000eJ\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u000eJ\u001a\u0010\u0019\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u000e\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\nR\"\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/DiskChipDataCache;", "", "()V", "mDiskCache", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/diskcache/ChipDiskData;", "Lkotlin/collections/ArrayList;", "mDiskCacheManager", "Lcom/ss/android/lark/calendar/impl/features/calendarview/diskcache/DiskCacheManager;", "mDiskLoadListener", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/DiskChipDataCache$DiskLoadListener;", "mIsGotSdkData", "", "clear", "", "getChipDiskData", "startDay", "", "endDay", "gotSdkData", "hasDiskData", "hitDiskData", "queryTask", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/QueryTask;", "loadDisk", "saveChipDiskData", "chipData", "diskCacheRange", "Lcom/ss/android/lark/calendar/impl/features/calendarview/diskcache/IDiskCacheRange;", "setDiskLoadListener", "diskLoadListener", "Companion", "DiskLoadListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.core.c */
public final class DiskChipDataCache {

    /* renamed from: e */
    public static final Companion f76927e = new Companion(null);

    /* renamed from: a */
    public DiskLoadListener f76928a;

    /* renamed from: b */
    public volatile boolean f76929b;

    /* renamed from: c */
    public final DiskCacheManager f76930c = new DiskCacheManager();

    /* renamed from: d */
    public ArrayList<ChipDiskData> f76931d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/DiskChipDataCache$DiskLoadListener;", "", "onLoaded", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.core.c$b */
    public interface DiskLoadListener {
        /* renamed from: a */
        void mo110835a();
    }

    /* renamed from: a */
    public final void mo110848a() {
        this.f76929b = true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/DiskChipDataCache$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.core.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    public final void mo110853c() {
        this.f76931d = null;
    }

    /* renamed from: b */
    public final void mo110852b() {
        LaunchPerfMonitor.m124423a("cache_source", "view_cache");
        C30022a.f74882a.perfDependency().mo108288a("CalendarColdMainFragment", false, "load_disk", null, null);
        long a = CalendarPerfMonitor.m124412a();
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("DiskChipDataCache", C32673y.m125376b(valueOf, "loadDiskData", new String[0]));
        this.f76930c.mo111478a(new C30691c(this, valueOf, "loadDiskData", a));
    }

    /* renamed from: a */
    public final void mo110849a(DiskLoadListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "diskLoadListener");
        this.f76928a = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/cache/core/DiskChipDataCache$loadDisk$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "success", "(Ljava/lang/Boolean;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.core.c$c */
    public static final class C30691c implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DiskChipDataCache f76932a;

        /* renamed from: b */
        final /* synthetic */ String f76933b;

        /* renamed from: c */
        final /* synthetic */ String f76934c;

        /* renamed from: d */
        final /* synthetic */ long f76935d;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            C30022a.f74882a.perfDependency().mo108289b("CalendarColdMainFragment", false, "load_disk", null, null);
            Log.m165383e("DiskChipDataCache", C32673y.m125370a(this.f76933b, this.f76934c, errorResult));
        }

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            String str;
            C30022a.f74882a.perfDependency().mo108289b("CalendarColdMainFragment", false, "load_disk", null, null);
            if (this.f76932a.f76929b) {
                Log.m165389i("DiskChipDataCache", C32673y.m125378d("got sdk data"));
                return;
            }
            DiskChipDataCache cVar = this.f76932a;
            cVar.f76931d = cVar.f76930c.mo111482b();
            String str2 = this.f76933b;
            String str3 = this.f76934c;
            String[] strArr = new String[2];
            strArr[0] = "disk_size";
            ArrayList<ChipDiskData> arrayList = this.f76932a.f76931d;
            if (arrayList != null) {
                str = String.valueOf(arrayList.size());
            } else {
                str = null;
            }
            strArr[1] = str;
            Log.m165389i("DiskChipDataCache", C32673y.m125373a(str2, str3, strArr));
            CalendarPerfMonitor.m124414a("perf_cal_cache_get_ins", this.f76935d, "view_type", PerfHelper.m124435a(), "scene_type", "load_disk");
            DiskLoadListener bVar = this.f76932a.f76928a;
            if (bVar != null) {
                bVar.mo110835a();
            }
        }

        C30691c(DiskChipDataCache cVar, String str, String str2, long j) {
            this.f76932a = cVar;
            this.f76933b = str;
            this.f76934c = str2;
            this.f76935d = j;
        }
    }

    /* renamed from: a */
    public final void mo110850a(QueryTask fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "queryTask");
        RangeInfo b = fVar.mo110858b();
        if (m114173b(b.mo110796c(), b.mo110797d())) {
            Log.m165389i("DiskChipDataCache", C32673y.m125378d("hit disk " + fVar));
            ArrayList<IPrepareChipData> c = fVar.mo110860c();
            if (c != null) {
                Iterator<T> it = c.iterator();
                while (it.hasNext()) {
                    it.next().mo110810a(IPrepareChipData.DataType.DISK);
                }
                return;
            }
            return;
        }
        Log.m165389i("DiskChipDataCache", C32673y.m125378d("not hit disk " + fVar));
    }

    /* renamed from: a */
    public final void mo110851a(ChipDiskData chipDiskData, IDiskCacheRange cVar) {
        this.f76930c.mo111479a(chipDiskData, cVar);
    }

    /* renamed from: b */
    private final boolean m114173b(int i, int i2) {
        ArrayList<ChipDiskData> arrayList = this.f76931d;
        if (arrayList == null) {
            return false;
        }
        for (T t : arrayList) {
            if (i == t.startDay() && i2 == t.endDay()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final ChipDiskData mo110847a(int i, int i2) {
        ArrayList<ChipDiskData> arrayList = this.f76931d;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ChipDiskData chipDiskData = arrayList.get(size);
                Intrinsics.checkExpressionValueIsNotNull(chipDiskData, "diskCache[i]");
                ChipDiskData chipDiskData2 = chipDiskData;
                if (i == chipDiskData2.startDay() && i2 == chipDiskData2.endDay()) {
                    LaunchPerfMonitor.m124423a("instance_source", "launch_hit_disk");
                    arrayList.remove(size);
                    return chipDiskData2;
                }
            }
            if (arrayList.size() == 0) {
                this.f76931d = null;
            }
        }
        return null;
    }
}
