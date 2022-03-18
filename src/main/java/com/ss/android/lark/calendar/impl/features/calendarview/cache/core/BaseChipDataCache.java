package com.ss.android.lark.calendar.impl.features.calendarview.cache.core;

import android.util.SparseArray;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.calendar.dependency.idependency.IPerfDependency;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.cache.core.DiskChipDataCache;
import com.ss.android.lark.calendar.impl.features.calendarview.cache.core.IPrepareChipData;
import com.ss.android.lark.calendar.impl.features.calendarview.cache.range.ICacheRangeMapper;
import com.ss.android.lark.calendar.impl.features.calendarview.cache.range.RangeInfo;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData;
import com.ss.android.lark.calendar.impl.features.local.C31927d;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.CalendarPerfMonitor;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.LaunchPerfMonitor;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.PerfHelper;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32583e;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0002\b&\u0018\u0000 P2\u00020\u0001:\u0001PB\u0005¢\u0006\u0002\u0010\u0002J0\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\u0016\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH\u0002J\u0010\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020\u0018H\u0002J;\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020\u00042\u0016\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0007j\b\u0012\u0004\u0012\u00020\u0004`\t2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040,H\u0002¢\u0006\u0002\u0010-J\u0010\u0010.\u001a\u00020/2\u0006\u0010$\u001a\u00020#H\u0016J\u0010\u00100\u001a\u00020/2\u0006\u0010\"\u001a\u00020#H\u0016J\b\u00101\u001a\u00020!H\u0002J\b\u00102\u001a\u00020!H\u0002J\b\u00103\u001a\u00020!H\u0017J\b\u00104\u001a\u00020!H\u0002J(\u00105\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\u0006\u00106\u001a\u00020#2\u0006\u00107\u001a\u00020#H\u0016J\b\u00108\u001a\u000209H\u0016J4\u0010:\u001a\u00020!2\u0006\u0010;\u001a\u00020\u00122\u0006\u0010<\u001a\u00020=2\u001a\u0010>\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\tH\u0002J\u0010\u0010?\u001a\u00020!2\u0006\u0010'\u001a\u00020\u0018H\u0002J\b\u0010@\u001a\u00020!H\u0002J \u0010A\u001a\u00020!2\u0006\u00106\u001a\u00020#2\u0006\u00107\u001a\u00020#2\u0006\u0010B\u001a\u00020CH\u0016J\b\u0010D\u001a\u00020!H\u0002J\u0010\u0010E\u001a\u00020!2\u0006\u0010'\u001a\u00020\u0018H\u0002J\u0010\u0010F\u001a\u00020!2\u0006\u0010G\u001a\u00020#H\u0016J\u0010\u0010H\u001a\u00020!2\u0006\u0010'\u001a\u00020\u0018H\u0004J\b\u0010I\u001a\u00020!H\u0016J\b\u0010J\u001a\u00020=H\u0016J\u0010\u0010K\u001a\u00020!2\u0006\u0010L\u001a\u00020#H\u0016J@\u0010M\u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\u000e\u0010N\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010O2\u0016\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R$\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0007j\b\u0012\u0004\u0012\u00020\u0018`\tX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8DX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d¨\u0006Q"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/BaseChipDataCache;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/IChipDataCache;", "()V", "mCachedRange", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/range/RangeInfo;", "mChipDataCache", "Landroid/util/SparseArray;", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/EventChipViewData;", "Lkotlin/collections/ArrayList;", "mDiskChipCache", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/DiskChipDataCache;", "getMDiskChipCache", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/DiskChipDataCache;", "mExecutorService", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "mIsAutoLoadMissing", "", "getMIsAutoLoadMissing", "()Z", "setMIsAutoLoadMissing", "(Z)V", "mLoadingSdkTask", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/QueryTask;", "mQueryPendingQueen", "mRangeMapper", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/range/ICacheRangeMapper;", "getMRangeMapper", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/range/ICacheRangeMapper;", "mRangeMapper$delegate", "Lkotlin/Lazy;", "addChipDataToCache", "", "startDay", "", "endDay", "chipDatas", "addToQueryQueen", "queryTask", "computeMissingRanges", "missingRange", "splitRange", "sortedPages", "", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/range/RangeInfo;Ljava/util/ArrayList;[Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/range/RangeInfo;)V", "correctQueryEndTime", "", "correctQueryStartTime", "deleteRedundantCache", "deleteRedundantQueryTask", "destroy", "forceLaunchLoadData", "getChipData", "queryStartDay", "queryEndDay", "getViewTimeZone", "Ljava/util/TimeZone;", "handleSdkBack", "isSuc", "taskContextId", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "hitCacheOrLoadSdk", "launchLoadData", "loadData", "preparedCallback", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/IPrepareChipData;", "loadMissingData", "loadSdkInstance", "preloadDisk", "currentDay", "prepareChipData", "reset", "toString", "updateAnchorDay", "selectDay", "updateCacheData", "prepareCallbacks", "", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.core.a */
public abstract class BaseChipDataCache implements IChipDataCache {

    /* renamed from: g */
    public static final Companion f76887g = new Companion(null);

    /* renamed from: a */
    private boolean f76888a = true;

    /* renamed from: b */
    public QueryTask f76889b;

    /* renamed from: c */
    public ArrayList<QueryTask> f76890c = new ArrayList<>();

    /* renamed from: d */
    public RangeInfo f76891d = new RangeInfo(0, 0, 3, null);

    /* renamed from: e */
    public SparseArray<ArrayList<EventChipViewData>> f76892e = new SparseArray<>();

    /* renamed from: f */
    public final ExecutorService f76893f = CoreThreadPool.getDefault().newSerialCpuDensityThreadPool("BaseChipDataCache");

    /* renamed from: h */
    private final Lazy f76894h = LazyKt.lazy(new C30683e(this));

    /* renamed from: i */
    private final DiskChipDataCache f76895i = new DiskChipDataCache();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final ICacheRangeMapper mo110820e() {
        return (ICacheRangeMapper) this.f76894h.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/BaseChipDataCache$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.core.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final DiskChipDataCache mo110822f() {
        return this.f76895i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/range/ICacheRangeMapper;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.core.a$e */
    static final class C30683e extends Lambda implements Function0<ICacheRangeMapper> {
        final /* synthetic */ BaseChipDataCache this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30683e(BaseChipDataCache aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ICacheRangeMapper invoke() {
            return this.this$0.mo110730a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/cache/core/BaseChipDataCache$preloadDisk$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/DiskChipDataCache$DiskLoadListener;", "onLoaded", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.core.a$f */
    public static final class C30684f implements DiskChipDataCache.DiskLoadListener {

        /* renamed from: a */
        final /* synthetic */ BaseChipDataCache f76908a;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.cache.core.DiskChipDataCache.DiskLoadListener
        /* renamed from: a */
        public void mo110835a() {
            this.f76908a.f76893f.execute(new RunnableC30685a(this));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.core.a$f$a */
        static final class RunnableC30685a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C30684f f76909a;

            RunnableC30685a(C30684f fVar) {
                this.f76909a = fVar;
            }

            public final void run() {
                QueryTask fVar = this.f76909a.f76908a.f76889b;
                if (fVar != null) {
                    this.f76909a.f76908a.mo110822f().mo110850a(fVar);
                }
                Iterator<T> it = this.f76909a.f76908a.f76890c.iterator();
                while (it.hasNext()) {
                    this.f76909a.f76908a.mo110822f().mo110850a((QueryTask) it.next());
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30684f(BaseChipDataCache aVar) {
            this.f76908a = aVar;
        }
    }

    /* renamed from: b */
    public TimeZone mo110734b() {
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        return timeZone;
    }

    /* renamed from: l */
    public void mo110828l() {
        this.f76893f.execute(new RunnableC30687h(this));
    }

    /* renamed from: m */
    public void mo110829m() {
        this.f76893f.execute(new RunnableC30680b(this));
        this.f76893f.shutdown();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.core.a$b */
    static final class RunnableC30680b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BaseChipDataCache f76896a;

        RunnableC30680b(BaseChipDataCache aVar) {
            this.f76896a = aVar;
        }

        public final void run() {
            this.f76896a.f76889b = null;
            this.f76896a.mo110822f().mo110853c();
            this.f76896a.f76890c.clear();
            this.f76896a.f76891d.mo110790a();
            this.f76896a.f76892e.clear();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.core.a$g */
    public static final class RunnableC30686g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BaseChipDataCache f76910a;

        /* renamed from: b */
        final /* synthetic */ QueryTask f76911b;

        RunnableC30686g(BaseChipDataCache aVar, QueryTask fVar) {
            this.f76910a = aVar;
            this.f76911b = fVar;
        }

        public final void run() {
            Log.m165389i("BaseChipDataCache", C32673y.m125378d("prepareChipData: queryTask = " + this.f76911b));
            this.f76910a.mo110822f().mo110850a(this.f76911b);
            this.f76910a.mo110817b(this.f76911b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.core.a$h */
    static final class RunnableC30687h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BaseChipDataCache f76912a;

        RunnableC30687h(BaseChipDataCache aVar) {
            this.f76912a = aVar;
        }

        public final void run() {
            Log.m165389i("BaseChipDataCache", C32673y.m125378d("reset"));
            this.f76912a.f76889b = null;
            this.f76912a.f76891d.mo110790a();
            this.f76912a.f76892e.clear();
            this.f76912a.f76890c.clear();
        }
    }

    /* renamed from: g */
    public final void mo110823g() {
        if (this.f76890c.isEmpty()) {
            Log.m165389i("BaseChipDataCache", C32673y.m125378d("mQueryPendingQueenIsEmpty: this = " + this));
        } else if (this.f76889b == null) {
            QueryTask remove = this.f76890c.remove(0);
            Intrinsics.checkExpressionValueIsNotNull(remove, "mQueryPendingQueen.removeAt(0)");
            m114135d(remove);
        }
    }

    /* renamed from: i */
    public final void mo110825i() {
        RangeInfo b = mo110820e().mo110789b();
        QueryTask fVar = this.f76889b;
        if (fVar != null && !b.mo110795b(fVar.mo110858b())) {
            Log.m165389i("BaseChipDataCache", C32673y.m125378d("forceLaunchLoadData: needCacheRange = " + b + ", loadingSdkTask = " + fVar));
            this.f76889b = null;
        }
        mo110823g();
    }

    /* renamed from: k */
    public final void mo110827k() {
        RangeInfo b = mo110820e().mo110789b();
        for (int size = this.f76890c.size() - 1; size >= 0; size--) {
            QueryTask fVar = this.f76890c.get(size);
            Intrinsics.checkExpressionValueIsNotNull(fVar, "mQueryPendingQueen[i]");
            QueryTask fVar2 = fVar;
            if (fVar2.mo110858b().mo110796c() > b.mo110797d() || fVar2.mo110858b().mo110797d() < b.mo110796c()) {
                this.f76890c.remove(size);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("mCachedRange: " + this.f76891d);
        sb.append("\tmLoadingSdkTask: " + this.f76889b);
        sb.append("\tmChipDataCache: " + this.f76892e.size());
        sb.append("\tmQueryPendingQueen: ");
        Iterator<QueryTask> it = this.f76890c.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            sb.append("; ");
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "logSb.toString()");
        return sb2;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.core.a$c */
    public static final class RunnableC30681c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BaseChipDataCache f76897a;

        /* renamed from: b */
        final /* synthetic */ String f76898b;

        /* renamed from: c */
        final /* synthetic */ boolean f76899c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f76900d;

        RunnableC30681c(BaseChipDataCache aVar, String str, boolean z, ArrayList arrayList) {
            this.f76897a = aVar;
            this.f76898b = str;
            this.f76899c = z;
            this.f76900d = arrayList;
        }

        public final void run() {
            String str;
            QueryTask fVar = this.f76897a.f76889b;
            String str2 = this.f76898b;
            String str3 = null;
            if (fVar != null) {
                str = fVar.mo110855a();
            } else {
                str = null;
            }
            if (!Intrinsics.areEqual(str2, str)) {
                StringBuilder sb = new StringBuilder();
                sb.append("loading task reset taskContextId = ");
                sb.append(this.f76898b);
                sb.append(", loadingTaskId = ");
                if (fVar != null) {
                    str3 = fVar.mo110855a();
                }
                sb.append(str3);
                Log.m165389i("BaseChipDataCache", C32673y.m125378d(sb.toString()));
                return;
            }
            this.f76897a.f76889b = null;
            this.f76897a.mo110823g();
            ArrayList<IPrepareChipData> c = fVar.mo110860c();
            int c2 = fVar.mo110858b().mo110796c();
            int d = fVar.mo110858b().mo110797d();
            if (this.f76899c) {
                ArrayList<EventChipViewData> arrayList = this.f76900d;
                if (arrayList != null) {
                    this.f76897a.mo110813a(c2, d, c, arrayList);
                }
            } else if (c != null) {
                Iterator<T> it = c.iterator();
                while (it.hasNext()) {
                    it.next().mo110811a("sdk err");
                }
            }
            this.f76897a.mo110822f().mo110848a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.core.a$i */
    static final class RunnableC30688i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BaseChipDataCache f76913a;

        /* renamed from: b */
        final /* synthetic */ int f76914b;

        RunnableC30688i(BaseChipDataCache aVar, int i) {
            this.f76913a = aVar;
            this.f76914b = i;
        }

        public final void run() {
            Log.m165389i("BaseChipDataCache", C32673y.m125378d("updateAnchorDay " + this.f76914b));
            this.f76913a.mo110820e().mo110787a(this.f76914b);
            this.f76913a.mo110824h();
            Log.m165389i("BaseChipDataCache", C32673y.m125378d("deleteRedundantCache: this = " + this.f76913a));
            this.f76913a.mo110827k();
            Log.m165389i("BaseChipDataCache", C32673y.m125378d("deleteRedundantQueryTask: this = " + this.f76913a));
            this.f76913a.mo110826j();
            Log.m165389i("BaseChipDataCache", C32673y.m125378d("loadMissingData: this = " + this.f76913a));
            this.f76913a.mo110825i();
        }
    }

    /* renamed from: h */
    public final void mo110824h() {
        if (this.f76891d.mo110794b()) {
            this.f76892e.clear();
            return;
        }
        RangeInfo b = mo110820e().mo110789b();
        int c = b.mo110796c();
        for (int c2 = this.f76891d.mo110796c(); c2 < c; c2++) {
            this.f76892e.delete(c2);
        }
        RangeInfo eVar = this.f76891d;
        eVar.mo110791a(Math.max(eVar.mo110796c(), b.mo110796c()));
        int d = b.mo110797d() + 1;
        int d2 = this.f76891d.mo110797d();
        if (d <= d2) {
            while (true) {
                this.f76892e.delete(d);
                if (d == d2) {
                    break;
                }
                d++;
            }
        }
        RangeInfo eVar2 = this.f76891d;
        eVar2.mo110793b(Math.min(eVar2.mo110797d(), b.mo110797d()));
        if (this.f76891d.mo110794b()) {
            this.f76891d.mo110790a();
            this.f76892e.clear();
            return;
        }
        for (int size = this.f76892e.size() - 1; size >= 0; size--) {
            int keyAt = this.f76892e.keyAt(size);
            if (keyAt < this.f76891d.mo110796c() || keyAt > this.f76891d.mo110797d()) {
                this.f76892e.delete(keyAt);
            }
        }
    }

    /* renamed from: j */
    public final void mo110826j() {
        if (this.f76888a) {
            RangeInfo b = mo110820e().mo110789b();
            RangeInfo[] a = mo110820e().mo110788a();
            if (this.f76891d.mo110794b() || !this.f76891d.mo110795b(b)) {
                this.f76892e.clear();
                for (RangeInfo eVar : a) {
                    m114134c(new QueryTask(eVar, null, 2, null));
                }
                return;
            }
            RangeInfo eVar2 = new RangeInfo(Math.max(this.f76891d.mo110797d() + 1, b.mo110796c()), b.mo110797d());
            Log.m165389i("BaseChipDataCache", C32673y.m125378d("rightMissingRange = " + eVar2));
            ArrayList<RangeInfo> arrayList = new ArrayList<>();
            m114133a(eVar2, arrayList, a);
            for (T t : arrayList) {
                m114134c(new QueryTask(t, null, 2, null));
                Log.m165389i("BaseChipDataCache", C32673y.m125378d("right range = " + ((Object) t)));
            }
            RangeInfo eVar3 = new RangeInfo(b.mo110796c(), Math.min(this.f76891d.mo110796c() - 1, b.mo110797d()));
            Log.m165389i("BaseChipDataCache", C32673y.m125378d("leftMissingRange = " + eVar3));
            ArrayList<RangeInfo> arrayList2 = new ArrayList<>();
            m114133a(eVar3, arrayList2, a);
            for (T t2 : arrayList2) {
                m114134c(new QueryTask(t2, null, 2, null));
                Log.m165389i("BaseChipDataCache", C32673y.m125378d("left range = " + ((Object) t2)));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo110815a(boolean z) {
        this.f76888a = z;
    }

    /* renamed from: b */
    public long mo110732b(int i) {
        CalendarDate calendarDate = new CalendarDate();
        calendarDate.setJulianDay(i);
        CalendarDate moveToDayStart = calendarDate.moveToDayStart();
        Intrinsics.checkExpressionValueIsNotNull(moveToDayStart, "startDate.moveToDayStart()");
        return moveToDayStart.getTimeInSeconds();
    }

    /* renamed from: c */
    public long mo110735c(int i) {
        CalendarDate calendarDate = new CalendarDate();
        calendarDate.setJulianDay(i);
        CalendarDate moveToDayEnd = calendarDate.moveToDayEnd();
        Intrinsics.checkExpressionValueIsNotNull(moveToDayEnd, "endDate.moveToDayEnd()");
        return moveToDayEnd.getTimeInSeconds();
    }

    /* renamed from: d */
    public void mo110819d(int i) {
        LaunchPerfMonitor.m124423a("instance_source", "launch_sdk_or_disk");
        this.f76895i.mo110849a(new C30684f(this));
        this.f76895i.mo110852b();
    }

    /* renamed from: e */
    public void mo110821e(int i) {
        this.f76893f.execute(new RunnableC30688i(this, i));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/cache/core/BaseChipDataCache$loadSdkInstance$chipDataCallBack$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/IGetChipDataCallBack;", "onError", "", ApiHandler.API_CALLBACK_ERRMSG, "", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/EventChipViewData;", "Lkotlin/collections/ArrayList;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.core.a$d */
    public static final class C30682d implements IGetChipDataCallBack {

        /* renamed from: a */
        final /* synthetic */ BaseChipDataCache f76901a;

        /* renamed from: b */
        final /* synthetic */ String f76902b;

        /* renamed from: c */
        final /* synthetic */ String f76903c;

        /* renamed from: d */
        final /* synthetic */ long f76904d;

        /* renamed from: e */
        final /* synthetic */ long f76905e;

        /* renamed from: f */
        final /* synthetic */ long f76906f;

        /* renamed from: g */
        final /* synthetic */ String f76907g;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.cache.core.IGetChipDataCallBack
        /* renamed from: a */
        public void mo110833a(String str) {
            Intrinsics.checkParameterIsNotNull(str, ApiHandler.API_CALLBACK_ERRMSG);
            Log.m165383e("BaseChipDataCache", C32673y.m125371a(this.f76902b, this.f76903c, str));
            this.f76901a.mo110816a(false, this.f76907g, (ArrayList<EventChipViewData>) null);
            IPerfDependency.C30057b.m111175a(C30022a.f74882a.perfDependency(), "CalendarInstanceError", null, null, null, 14, null);
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.cache.core.IGetChipDataCallBack
        /* renamed from: a */
        public void mo110834a(ArrayList<EventChipViewData> arrayList) {
            Intrinsics.checkParameterIsNotNull(arrayList, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Log.m165389i("BaseChipDataCache", C32673y.m125373a(this.f76902b, this.f76903c, "instances_size", String.valueOf(arrayList.size())));
            CalendarPerfMonitor.m124414a("perf_cal_cache_get_ins", this.f76904d, "view_type", PerfHelper.m124435a(), "query_span", String.valueOf(this.f76905e - this.f76906f), "scene_type", "get_instance", "data_length", String.valueOf(arrayList.size()));
            this.f76901a.mo110816a(true, this.f76907g, arrayList);
        }

        C30682d(BaseChipDataCache aVar, String str, String str2, long j, long j2, long j3, String str3) {
            this.f76901a = aVar;
            this.f76902b = str;
            this.f76903c = str2;
            this.f76904d = j;
            this.f76905e = j2;
            this.f76906f = j3;
            this.f76907g = str3;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo110814a(QueryTask fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "queryTask");
        this.f76893f.execute(new RunnableC30686g(this, fVar));
    }

    /* renamed from: b */
    public final void mo110817b(QueryTask fVar) {
        Log.m165389i("BaseChipDataCache", C32673y.m125378d("hitCacheOrLoadSdk: queryTask = " + fVar + "; this = $" + this));
        int c = fVar.mo110858b().mo110796c();
        int d = fVar.mo110858b().mo110797d();
        if (c < this.f76891d.mo110796c() || d > this.f76891d.mo110797d()) {
            Log.m165389i("BaseChipDataCache", C32673y.m125378d("notHitCache&loadSDK"));
            m114134c(fVar);
            mo110823g();
            return;
        }
        Log.m165389i("BaseChipDataCache", C32673y.m125378d("hitCache"));
        ArrayList<IPrepareChipData> c2 = fVar.mo110860c();
        if (c2 != null) {
            Iterator<T> it = c2.iterator();
            while (it.hasNext()) {
                it.next().mo110810a(IPrepareChipData.DataType.SDK);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0047  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m114134c(com.ss.android.lark.calendar.impl.features.calendarview.cache.core.QueryTask r7) {
        /*
        // Method dump skipped, instructions count: 189
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendarview.cache.core.BaseChipDataCache.m114134c(com.ss.android.lark.calendar.impl.features.calendarview.cache.core.f):void");
    }

    /* renamed from: d */
    private final void m114135d(QueryTask fVar) {
        this.f76889b = fVar;
        long b = mo110732b(fVar.mo110858b().mo110796c());
        long c = mo110735c(fVar.mo110858b().mo110797d());
        TimeZone b2 = mo110734b();
        long a = CalendarPerfMonitor.m124412a();
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("BaseChipDataCache", C32673y.m125376b(valueOf, "loadSdkInstance", "queryTask", fVar.toString()));
        ChipDataCallbackAdapter bVar = new ChipDataCallbackAdapter(new C30682d(this, valueOf, "loadSdkInstance", a, c, b, fVar.mo110855a()));
        C32583e.m124816a().mo119032a(b, c, b2.getID(), bVar);
        long j = (long) 1000;
        C31927d.m121461a(b * j, c * j, b2, bVar);
    }

    /* renamed from: c */
    public ArrayList<EventChipViewData> mo110818c(int i, int i2) {
        HashSet hashSet = new HashSet();
        if (i <= i2) {
            int i3 = i;
            while (true) {
                ArrayList<EventChipViewData> arrayList = this.f76892e.get(i3);
                if (arrayList != null) {
                    hashSet.addAll(arrayList);
                }
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        Log.m165389i("BaseChipDataCache", C32673y.m125378d("getChipData: queryStartDay = " + i + ", queryEndDay = " + i2 + "; this = " + this));
        return new ArrayList<>(hashSet);
    }

    /* renamed from: a */
    public final void mo110816a(boolean z, String str, ArrayList<EventChipViewData> arrayList) {
        this.f76893f.execute(new RunnableC30681c(this, str, z, arrayList));
    }

    /* renamed from: a */
    public void mo110812a(int i, int i2, IPrepareChipData iPrepareChipData) {
        Intrinsics.checkParameterIsNotNull(iPrepareChipData, "preparedCallback");
        QueryTask fVar = new QueryTask(new RangeInfo(i, i2), null, 2, null);
        fVar.mo110856a(iPrepareChipData);
        mo110814a(fVar);
    }

    /* renamed from: a */
    private final void m114133a(RangeInfo eVar, ArrayList<RangeInfo> arrayList, RangeInfo[] eVarArr) {
        if (!eVar.mo110794b()) {
            boolean z = false;
            for (RangeInfo eVar2 : eVarArr) {
                if (eVar.mo110792a(eVar2)) {
                    arrayList.add(eVar2);
                    RangeInfo eVar3 = new RangeInfo(eVar.mo110796c(), eVar2.mo110796c() - 1);
                    if (!eVar3.mo110794b()) {
                        m114133a(eVar3, arrayList, eVarArr);
                    }
                    RangeInfo eVar4 = new RangeInfo(eVar2.mo110797d() + 1, eVar.mo110797d());
                    if (!eVar4.mo110794b()) {
                        m114133a(eVar4, arrayList, eVarArr);
                    }
                    z = true;
                }
            }
            if (!z) {
                arrayList.add(eVar);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: android.util.SparseArray<java.util.ArrayList<com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private final void m114132a(int i, int i2, ArrayList<EventChipViewData> arrayList) {
        SparseArray sparseArray = new SparseArray();
        Iterator<EventChipViewData> it = arrayList.iterator();
        while (it.hasNext()) {
            EventChipViewData next = it.next();
            Intrinsics.checkExpressionValueIsNotNull(next, "chip");
            int max = Math.max(next.getStartDay(), i);
            int min = Math.min(next.getEndDay(), i2);
            if (max <= min) {
                while (true) {
                    ArrayList arrayList2 = (ArrayList) sparseArray.get(max);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(next);
                    sparseArray.put(max, arrayList2);
                    if (max == min) {
                        break;
                    }
                    max++;
                }
            }
        }
        int size = sparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            int keyAt = sparseArray.keyAt(i3);
            this.f76892e.put(keyAt, sparseArray.get(keyAt));
        }
        RangeInfo b = mo110820e().mo110789b();
        if (i <= b.mo110797d() && i2 >= b.mo110796c()) {
            if (this.f76891d.mo110794b()) {
                this.f76891d.mo110791a(i);
                this.f76891d.mo110793b(i2);
            } else if (i <= this.f76891d.mo110797d() + 1 && i2 >= this.f76891d.mo110796c() - 1) {
                RangeInfo eVar = this.f76891d;
                eVar.mo110791a(Math.max(Math.min(i, eVar.mo110796c()), b.mo110796c()));
                RangeInfo eVar2 = this.f76891d;
                eVar2.mo110793b(Math.min(Math.max(i2, eVar2.mo110797d()), b.mo110797d()));
            }
        }
    }

    /* renamed from: a */
    public final void mo110813a(int i, int i2, List<? extends IPrepareChipData> list, ArrayList<EventChipViewData> arrayList) {
        Integer num;
        m114132a(i, i2, arrayList);
        StringBuilder sb = new StringBuilder();
        sb.append("addChipDataToCache: ");
        sb.append(i);
        sb.append(" - ");
        sb.append(i2);
        sb.append("; prepareCallbacks = ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        sb.append(num);
        sb.append("; this = ");
        sb.append(this);
        Log.m165389i("BaseChipDataCache", C32673y.m125378d(sb.toString()));
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo110810a(IPrepareChipData.DataType.SDK);
            }
        }
        mo110824h();
        Log.m165389i("BaseChipDataCache", C32673y.m125378d("deleteRedundantCache: " + i + " - " + i2 + "; this = " + this));
    }
}
