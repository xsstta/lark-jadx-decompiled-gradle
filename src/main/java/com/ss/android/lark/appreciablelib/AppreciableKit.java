package com.ss.android.lark.appreciablelib;

import android.app.Application;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttm.player.MediaPlayer;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 <2\u00020\u0001:\u0002<=B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fJz\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016Jn\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016J&\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000f2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0016H\u0007J\u000e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cJ \u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\nJn\u0010\"\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016J&\u0010\"\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000f2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0016H\u0007Jn\u0010#\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016J&\u0010#\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000f2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0016H\u0007J\b\u0010$\u001a\u00020\u0012H\u0002J\u0016\u0010%\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u000fJ\u0016\u0010'\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u000fJ2\u0010(\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010/\u001a\u000200J\u0001\u0010(\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u00101\u001a\u0002022\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016J\u0001\u0010(\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010/\u001a\u0002002\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016J@\u0010(\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0016H\u0007J\u0010\u00103\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u000204H\u0002Jv\u00103\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u00105\u001a\u0002062\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016J\u0016\u00107\u001a\u00020\u00122\u0006\u00108\u001a\u0002002\u0006\u00109\u001a\u000206Jh\u0010:\u001a\u00020\u00122\u0006\u0010;\u001a\u00020\u00102\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/ss/android/lark/appreciablelib/AppreciableKit;", "", "()V", "mApplication", "Landroid/app/Application;", "mEnterForegroundTimeStamp", "Ljava/util/concurrent/atomic/AtomicLong;", "mIsInBackground", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mMonitorThreadPool", "Ljava/util/concurrent/ExecutorService;", "mNeedReportToTea", "mStartupTimestamp", "mTimeCostCaches", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/ss/android/lark/appreciablelib/TimeCostCache;", "end", "", "key", "page", "latencyDetail", "", "extra", "extraMetric", "extraCategory", "error", "params", "Lcom/ss/android/lark/appreciablelib/ErrorParams;", "init", "application", "config", "Lcom/ss/android/lark/appreciablelib/Configuration;", "threadPool", "pause", "resume", "scheduleClean", "spanEnd", "latencyDetailKey", "spanStart", "start", "biz", "Lcom/ss/android/lark/appreciablelib/Biz;", "scene", "Lcom/ss/android/lark/appreciablelib/Scene;", "event", "Lcom/ss/android/lark/appreciablelib/Event;", "needNet", "", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "", "timeCost", "Lcom/ss/android/lark/appreciablelib/TimeCostParams;", "latency", "", "updateAppForegroundState", "isFront", "timeStamp", "updateCacheExtra", "cache", "Companion", "SingletonHolder", "appreciablelib_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.appreciablelib.a */
public final class AppreciableKit {

    /* renamed from: g */
    public static final String f73093g = f73093g;

    /* renamed from: h */
    public static final Companion f73094h = new Companion(null);

    /* renamed from: a */
    public volatile Application f73095a;

    /* renamed from: b */
    public final AtomicLong f73096b = new AtomicLong(0);

    /* renamed from: c */
    public final AtomicLong f73097c = new AtomicLong(0);

    /* renamed from: d */
    public final AtomicBoolean f73098d = new AtomicBoolean(false);

    /* renamed from: e */
    public final AtomicBoolean f73099e = new AtomicBoolean(false);

    /* renamed from: f */
    public final ConcurrentHashMap<String, TimeCostCache> f73100f = new ConcurrentHashMap<>();

    /* renamed from: i */
    private ExecutorService f73101i;

    @JvmStatic
    /* renamed from: b */
    public static final AppreciableKit m107394b() {
        return f73094h.mo103524a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/appreciablelib/AppreciableKit$Companion;", "", "()V", "CACHE_CLEAN_INTERVAL", "", "SPAN_SUFFIX", "", "TAG", "getInstance", "Lcom/ss/android/lark/appreciablelib/AppreciableKit;", "appreciablelib_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.appreciablelib.a$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final AppreciableKit mo103524a() {
            return SingletonHolder.f73102a.mo103525a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/appreciablelib/AppreciableKit$SingletonHolder;", "", "()V", "instance", "Lcom/ss/android/lark/appreciablelib/AppreciableKit;", "getInstance", "()Lcom/ss/android/lark/appreciablelib/AppreciableKit;", "appreciablelib_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.appreciablelib.a$b */
    public static final class SingletonHolder {

        /* renamed from: a */
        public static final SingletonHolder f73102a = new SingletonHolder();

        /* renamed from: b */
        private static final AppreciableKit f73103b = new AppreciableKit();

        private SingletonHolder() {
        }

        /* renamed from: a */
        public final AppreciableKit mo103525a() {
            return f73103b;
        }
    }

    /* renamed from: a */
    public final void mo103513a(Application application, Configuration bVar, ExecutorService executorService) {
        Intrinsics.checkParameterIsNotNull(application, "application");
        Intrinsics.checkParameterIsNotNull(bVar, "config");
        this.f73095a = application;
        this.f73096b.set(bVar.mo103529a());
        this.f73097c.set(bVar.mo103529a());
        this.f73099e.set(bVar.mo103530b());
        this.f73101i = executorService;
        mo103512a();
    }

    /* renamed from: a */
    public final void mo103512a() {
        String str = f73093g;
        Log.m165389i(str, "schedule clean, time is: " + System.currentTimeMillis());
        CoreThreadPool.getBackgroundHandler().postDelayed(new RunnableC29206d(this), 120000);
    }

    /* renamed from: a */
    public final void mo103520a(boolean z, long j) {
        if (z) {
            this.f73097c.set(j);
        }
        this.f73098d.set(!z);
        for (Map.Entry<String, TimeCostCache> entry : this.f73100f.entrySet()) {
            TimeCostParams a = entry.getValue().mo103553a();
            if (z) {
                a.mo103568c(a.mo103576i() + (j - a.mo103574h()));
            } else {
                a.mo103566b(j);
            }
            a.mo103564a(!z);
            String str = f73093g;
            Log.m165379d(str, "updateAppForegroundState：" + entry.getKey() + "/" + a.mo103576i() + "/" + a.mo103577j());
        }
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "格式更新 https://bytedance.feishu.cn/docs/doccnxWkTEi4U8Yx6dZdSGFdKkd", replaceWith = @ReplaceWith(expression = "\"replace with start(Biz, Scene, String, String?, Map<String, String>?, Map<String, String>?, Map<String, String>?\"", imports = {}))
    /* renamed from: a */
    public final String mo103511a(Biz biz, Scene scene, String str, String str2, Map<String, String> map) {
        Intrinsics.checkParameterIsNotNull(biz, "biz");
        Intrinsics.checkParameterIsNotNull(scene, "scene");
        Intrinsics.checkParameterIsNotNull(str, "event");
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkExpressionValueIsNotNull(uuid, "UUID.randomUUID().toString()");
        TimeCostCache fVar = new TimeCostCache(new TimeCostParams(biz, scene, str, 0, str2, false, 0, 0, 0, false, null, null, null, null, 16320, null), System.currentTimeMillis(), CacheStatus.STARTED);
        m107392a(fVar, (Map<String, ? extends Object>) null, map, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null);
        this.f73100f.put(uuid, fVar);
        return uuid;
    }

    /* renamed from: a */
    public final String mo103508a(Biz biz, Scene scene, Event event, String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(biz, "biz");
        Intrinsics.checkParameterIsNotNull(scene, "scene");
        Intrinsics.checkParameterIsNotNull(event, "event");
        return mo103510a(biz, scene, event, str, z, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null);
    }

    /* renamed from: a */
    public final String mo103510a(Biz biz, Scene scene, Event event, String str, boolean z, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3, Map<String, ? extends Object> map4) {
        Intrinsics.checkParameterIsNotNull(biz, "biz");
        Intrinsics.checkParameterIsNotNull(scene, "scene");
        Intrinsics.checkParameterIsNotNull(event, "event");
        return mo103509a(biz, scene, event, str, z, 1, map, map2, map3, map4);
    }

    /* renamed from: a */
    public final String mo103509a(Biz biz, Scene scene, Event event, String str, boolean z, int i, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3, Map<String, ? extends Object> map4) {
        Intrinsics.checkParameterIsNotNull(biz, "biz");
        Intrinsics.checkParameterIsNotNull(scene, "scene");
        Intrinsics.checkParameterIsNotNull(event, "event");
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkExpressionValueIsNotNull(uuid, "UUID.randomUUID().toString()");
        TimeCostCache fVar = new TimeCostCache(new TimeCostParams(biz, scene, event.name(), 0, str, z, i, 0, 0, false, null, null, null, null, 16256, null), System.currentTimeMillis(), CacheStatus.STARTED);
        m107392a(fVar, map, map2, map3, map4);
        this.f73100f.put(uuid, fVar);
        return uuid;
    }

    /* renamed from: a */
    public final void mo103519a(String str, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3, Map<String, ? extends Object> map4) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        TimeCostCache fVar = this.f73100f.get(str);
        if (fVar != null) {
            Intrinsics.checkExpressionValueIsNotNull(fVar, "it");
            m107392a(fVar, map, map2, map3, map4);
            if (fVar.mo103557c() != CacheStatus.PAUSED) {
                TimeCostParams a = fVar.mo103553a();
                a.mo103562a(a.mo103569d() + (System.currentTimeMillis() - fVar.mo103556b()));
            }
            fVar.mo103555a(CacheStatus.PAUSED);
        }
    }

    /* renamed from: a */
    public final void mo103518a(String str, String str2, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3, Map<String, ? extends Object> map4) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        TimeCostCache fVar = this.f73100f.get(str);
        if (fVar != null) {
            Intrinsics.checkExpressionValueIsNotNull(fVar, "it");
            m107392a(fVar, map, map2, map3, map4);
            long currentTimeMillis = System.currentTimeMillis();
            if (fVar.mo103557c() != CacheStatus.PAUSED) {
                TimeCostParams a = fVar.mo103553a();
                a.mo103562a(a.mo103569d() + (currentTimeMillis - fVar.mo103556b()));
            }
            if (fVar.mo103553a().mo103577j() && (fVar.mo103553a().mo103574h() > 0)) {
                TimeCostParams a2 = fVar.mo103553a();
                a2.mo103568c(a2.mo103576i() + (currentTimeMillis - fVar.mo103553a().mo103574h()));
            }
            if (str2 != null) {
                fVar.mo103553a().mo103563a(str2);
            }
            m107393a(fVar.mo103553a());
            this.f73100f.remove(str);
            fVar.mo103555a(CacheStatus.END);
        }
    }

    /* renamed from: a */
    public final void mo103516a(String str, long j, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3, Map<String, ? extends Object> map4) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        TimeCostCache fVar = this.f73100f.get(str);
        if (fVar != null) {
            Intrinsics.checkExpressionValueIsNotNull(fVar, "it");
            m107392a(fVar, map, map2, map3, map4);
            long currentTimeMillis = System.currentTimeMillis();
            if (fVar.mo103553a().mo103577j() && (fVar.mo103553a().mo103574h() > 0)) {
                TimeCostParams a = fVar.mo103553a();
                a.mo103568c(a.mo103576i() + (currentTimeMillis - fVar.mo103553a().mo103574h()));
            }
            fVar.mo103553a().mo103562a(j);
            m107393a(fVar.mo103553a());
            this.f73100f.remove(str);
            fVar.mo103555a(CacheStatus.END);
        }
    }

    /* renamed from: a */
    public final void mo103517a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(str2, "latencyDetailKey");
        TimeCostCache fVar = this.f73100f.get(str);
        if (fVar != null) {
            Intrinsics.checkExpressionValueIsNotNull(fVar, "it");
            m107392a(fVar, MapsKt.mutableMapOf(TuplesKt.to(str2 + "#span_suffix#", Long.valueOf(System.currentTimeMillis()))), (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null);
        }
    }

    /* renamed from: a */
    public final void mo103514a(ErrorParams cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "params");
        RunnableC29205c cVar2 = new RunnableC29205c(this, cVar);
        ExecutorService executorService = this.f73101i;
        if (executorService == null) {
            cVar2.run();
        } else if (executorService != null) {
            executorService.execute(cVar2);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.appreciablelib.a$c */
    public static final class RunnableC29205c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AppreciableKit f73104a;

        /* renamed from: b */
        final /* synthetic */ ErrorParams f73105b;

        RunnableC29205c(AppreciableKit aVar, ErrorParams cVar) {
            this.f73104a = aVar;
            this.f73105b = cVar;
        }

        public final void run() {
            MonitorEvent.f73125a.mo103551a(this.f73104a.f73095a, this.f73105b, this.f73104a.f73096b.get(), this.f73104a.f73097c.get(), this.f73104a.f73098d.get(), this.f73104a.f73099e.get());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.appreciablelib.a$e */
    public static final class RunnableC29207e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AppreciableKit f73107a;

        /* renamed from: b */
        final /* synthetic */ TimeCostParams f73108b;

        RunnableC29207e(AppreciableKit aVar, TimeCostParams gVar) {
            this.f73107a = aVar;
            this.f73108b = gVar;
        }

        public final void run() {
            MonitorEvent.f73125a.mo103552a(this.f73107a.f73095a, this.f73108b, this.f73107a.f73096b.get(), this.f73107a.f73097c.get(), this.f73107a.f73099e.get());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.appreciablelib.a$d */
    public static final class RunnableC29206d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AppreciableKit f73106a;

        RunnableC29206d(AppreciableKit aVar) {
            this.f73106a = aVar;
        }

        public final void run() {
            long currentTimeMillis = System.currentTimeMillis();
            String str = AppreciableKit.f73093g;
            Log.m165389i(str, "start clean, time is: " + currentTimeMillis);
            long j = currentTimeMillis - 120000;
            Iterator<Map.Entry<String, TimeCostCache>> it = this.f73106a.f73100f.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, TimeCostCache> next = it.next();
                if (next.getValue().mo103556b() < j) {
                    it.remove();
                    String str2 = AppreciableKit.f73093g;
                    Log.m165389i(str2, "cache is out of date, key is: " + next.getKey());
                }
            }
            this.f73106a.mo103512a();
        }
    }

    /* renamed from: a */
    public final void mo103515a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        mo103523c(str, null, null, null, null);
    }

    /* renamed from: a */
    private final void m107393a(TimeCostParams gVar) {
        RunnableC29207e eVar = new RunnableC29207e(this, gVar);
        ExecutorService executorService = this.f73101i;
        if (executorService == null) {
            eVar.run();
        } else if (executorService != null) {
            executorService.execute(eVar);
        }
    }

    /* renamed from: b */
    public final void mo103521b(String str, String str2) {
        long j;
        long j2;
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(str2, "latencyDetailKey");
        TimeCostCache fVar = this.f73100f.get(str);
        if (fVar != null) {
            ConcurrentHashMap<String, Object> k = fVar.mo103553a().mo103578k();
            Object obj = k.get(str2 + "#span_suffix#");
            ConcurrentHashMap<String, Object> k2 = fVar.mo103553a().mo103578k();
            if (obj instanceof Long) {
                j2 = System.currentTimeMillis();
                j = ((Number) obj).longValue();
            } else {
                j2 = System.currentTimeMillis();
                j = fVar.mo103556b();
            }
            k2.put(str2, Long.valueOf(j2 - j));
            ConcurrentHashMap<String, Object> k3 = fVar.mo103553a().mo103578k();
            k3.remove(str2 + "#span_suffix#");
        }
    }

    /* renamed from: c */
    public final void mo103523c(String str, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3, Map<String, ? extends Object> map4) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        mo103518a(str, (String) null, map, map2, map3, map4);
    }

    /* renamed from: b */
    public final void mo103522b(String str, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3, Map<String, ? extends Object> map4) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        TimeCostCache fVar = this.f73100f.get(str);
        if (fVar != null) {
            Intrinsics.checkExpressionValueIsNotNull(fVar, "it");
            m107392a(fVar, map, map2, map3, map4);
            if (fVar.mo103557c() == CacheStatus.PAUSED) {
                fVar.mo103554a(System.currentTimeMillis());
            }
            fVar.mo103555a(CacheStatus.RESUMED);
        }
    }

    /* renamed from: a */
    private final void m107392a(TimeCostCache fVar, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3, Map<String, ? extends Object> map4) {
        if (map != null) {
            try {
                fVar.mo103553a().mo103578k().putAll(map);
            } catch (Exception e) {
                String str = f73093g;
                Log.m165385e(str, fVar.mo103553a().mo103567c() + " error!", e, false);
                return;
            }
        }
        if (map2 != null) {
            fVar.mo103553a().mo103579l().putAll(map2);
        }
        if (map3 != null) {
            fVar.mo103553a().mo103580m().putAll(map3);
        }
        if (map4 != null) {
            fVar.mo103553a().mo103581n().putAll(map4);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ String m107386a(AppreciableKit aVar, Biz biz, Scene scene, Event event, String str, boolean z, int i, Object obj) {
        boolean z2;
        if ((i & 16) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        return aVar.mo103508a(biz, scene, event, str, z2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.ss.android.lark.appreciablelib.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static /* synthetic */ void m107395b(AppreciableKit aVar, String str, Map map, Map map2, Map map3, Map map4, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        if ((i & 4) != 0) {
            map2 = null;
        }
        if ((i & 8) != 0) {
            map3 = null;
        }
        if ((i & 16) != 0) {
            map4 = null;
        }
        aVar.mo103522b(str, map, map2, map3, map4);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.ss.android.lark.appreciablelib.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static /* synthetic */ void m107396c(AppreciableKit aVar, String str, Map map, Map map2, Map map3, Map map4, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        if ((i & 4) != 0) {
            map2 = null;
        }
        if ((i & 8) != 0) {
            map3 = null;
        }
        if ((i & 16) != 0) {
            map4 = null;
        }
        aVar.mo103523c(str, map, map2, map3, map4);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.ss.android.lark.appreciablelib.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ void m107391a(AppreciableKit aVar, String str, Map map, Map map2, Map map3, Map map4, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        if ((i & 4) != 0) {
            map2 = null;
        }
        if ((i & 8) != 0) {
            map3 = null;
        }
        if ((i & 16) != 0) {
            map4 = null;
        }
        aVar.mo103519a(str, map, map2, map3, map4);
    }

    /* renamed from: a */
    public static /* synthetic */ void m107389a(AppreciableKit aVar, String str, long j, Map map, Map map2, Map map3, Map map4, int i, Object obj) {
        Map map5;
        Map map6;
        Map map7;
        Map map8;
        if ((i & 4) != 0) {
            map5 = null;
        } else {
            map5 = map;
        }
        if ((i & 8) != 0) {
            map6 = null;
        } else {
            map6 = map2;
        }
        if ((i & 16) != 0) {
            map7 = null;
        } else {
            map7 = map3;
        }
        if ((i & 32) != 0) {
            map8 = null;
        } else {
            map8 = map4;
        }
        aVar.mo103516a(str, j, map5, map6, map7, map8);
    }

    /* renamed from: a */
    public static /* synthetic */ void m107390a(AppreciableKit aVar, String str, String str2, Map map, Map map2, Map map3, Map map4, int i, Object obj) {
        String str3;
        Map map5;
        Map map6;
        Map map7;
        Map map8;
        if ((i & 2) != 0) {
            str3 = null;
        } else {
            str3 = str2;
        }
        if ((i & 4) != 0) {
            map5 = null;
        } else {
            map5 = map;
        }
        if ((i & 8) != 0) {
            map6 = null;
        } else {
            map6 = map2;
        }
        if ((i & 16) != 0) {
            map7 = null;
        } else {
            map7 = map3;
        }
        if ((i & 32) != 0) {
            map8 = null;
        } else {
            map8 = map4;
        }
        aVar.mo103518a(str, str3, map5, map6, map7, map8);
    }

    /* renamed from: a */
    public static /* synthetic */ String m107388a(AppreciableKit aVar, Biz biz, Scene scene, Event event, String str, boolean z, Map map, Map map2, Map map3, Map map4, int i, Object obj) {
        boolean z2;
        Map map5;
        Map map6;
        Map map7;
        Map map8;
        if ((i & 16) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i & 32) != 0) {
            map5 = null;
        } else {
            map5 = map;
        }
        if ((i & 64) != 0) {
            map6 = null;
        } else {
            map6 = map2;
        }
        if ((i & SmActions.ACTION_ONTHECALL_EXIT) != 0) {
            map7 = null;
        } else {
            map7 = map3;
        }
        if ((i & DynamicModule.f58006b) != 0) {
            map8 = null;
        } else {
            map8 = map4;
        }
        return aVar.mo103510a(biz, scene, event, str, z2, map5, map6, map7, map8);
    }

    /* renamed from: a */
    public static /* synthetic */ String m107387a(AppreciableKit aVar, Biz biz, Scene scene, Event event, String str, boolean z, int i, Map map, Map map2, Map map3, Map map4, int i2, Object obj) {
        boolean z2;
        int i3;
        Map map5;
        Map map6;
        Map map7;
        Map map8;
        if ((i2 & 16) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i2 & 32) != 0) {
            i3 = 1;
        } else {
            i3 = i;
        }
        if ((i2 & 64) != 0) {
            map5 = null;
        } else {
            map5 = map;
        }
        if ((i2 & SmActions.ACTION_ONTHECALL_EXIT) != 0) {
            map6 = null;
        } else {
            map6 = map2;
        }
        if ((i2 & DynamicModule.f58006b) != 0) {
            map7 = null;
        } else {
            map7 = map3;
        }
        if ((i2 & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) != 0) {
            map8 = null;
        } else {
            map8 = map4;
        }
        return aVar.mo103509a(biz, scene, event, str, z2, i3, map5, map6, map7, map8);
    }
}
