package com.bytedance.android.monitor.lynx;

import com.bytedance.android.monitor.C2637b;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.entity.PvData;
import com.bytedance.android.monitor.executor.MonitorExecutor;
import com.bytedance.android.monitor.lynx.config.LynxConfigHandler;
import com.bytedance.android.monitor.lynx.config.LynxMonitorConfig;
import com.bytedance.android.monitor.lynx.data.entity.LynxCommonData;
import com.bytedance.android.monitor.lynx.data.entity.LynxLifecycleData;
import com.bytedance.android.monitor.lynx.data.entity.LynxMonitorReportData;
import com.bytedance.android.monitor.lynx.data.entity.LynxNativeErrorData;
import com.bytedance.android.monitor.lynx.data.entity.LynxPerfData;
import com.bytedance.android.monitor.lynx.data.handler.LynxCommonDataHandler;
import com.bytedance.android.monitor.lynx.data.handler.LynxLifeCycleDataHandler;
import com.bytedance.android.monitor.lynx.p114b.p116b.C2667e;
import com.bytedance.android.monitor.p104a.AbstractC2630b;
import com.bytedance.android.monitor.p106c.C2641a;
import com.bytedance.android.monitor.p109f.AbstractC2647a;
import com.bytedance.android.monitor.p111h.AbstractC2650b;
import com.bytedance.android.monitor.p111h.C2651c;
import com.bytedance.android.monitor.p112i.C2657e;
import com.bytedance.android.monitor.webview.AbstractC2677a;
import com.huawei.hms.site.ActivityC23764o;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.lynx.tasm.LynxView;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00012\u00020\u0001:\u0004\u0001\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u0001J\u0016\u0010:\u001a\u00020!2\u0006\u00105\u001a\u0002062\u0006\u0010;\u001a\u000208J\b\u0010<\u001a\u00020\u0012H\u0002J\b\u0010=\u001a\u00020>H\u0002J\u000e\u0010?\u001a\u00020!2\u0006\u00105\u001a\u000206J\u0018\u0010@\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u0010A\u001a\u00020BH\u0002J\u0018\u0010C\u001a\u0002042\u0006\u0010D\u001a\u00020E2\u0006\u0010A\u001a\u00020BH\u0002J\u0016\u0010F\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u0010A\u001a\u00020BJ \u0010G\u001a\u0002042\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010A\u001a\u00020BH\u0002J\u0018\u0010L\u001a\u0002042\u0006\u00105\u001a\u0002062\b\u0010M\u001a\u0004\u0018\u00010NJ0\u0010O\u001a\u0002042\u0006\u0010A\u001a\u00020B2\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020Q2\u0006\u0010S\u001a\u00020Q2\u0006\u0010T\u001a\u00020!H\u0007JV\u0010O\u001a\u0002042\b\u00105\u001a\u0004\u0018\u0001062\b\u0010;\u001a\u0004\u0018\u0001082\b\u0010U\u001a\u0004\u0018\u0001082\b\u0010P\u001a\u0004\u0018\u00010Q2\b\u0010R\u001a\u0004\u0018\u00010Q2\b\u0010S\u001a\u0004\u0018\u00010Q2\n\b\u0002\u0010V\u001a\u0004\u0018\u00010Q2\u0006\u0010W\u001a\u00020!J\u0016\u0010X\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u0010Y\u001a\u00020ZJ \u0010[\u001a\u0002042\u0006\u0010\\\u001a\u00020I2\u0006\u0010]\u001a\u00020Z2\u0006\u0010A\u001a\u00020BH\u0002J\u001a\u0010^\u001a\u0002042\b\u00105\u001a\u0004\u0018\u0001062\b\u0010_\u001a\u0004\u0018\u00010`J:\u0010a\u001a\u0002042\b\u00105\u001a\u0004\u0018\u0001062\b\u0010b\u001a\u0004\u0018\u0001082\b\u0010c\u001a\u0004\u0018\u0001082\b\u0010d\u001a\u0004\u0018\u0001082\n\b\u0002\u0010e\u001a\u0004\u0018\u000108J\u0016\u0010f\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u0010]\u001a\u00020gJ \u0010h\u001a\u0002042\u0006\u0010\\\u001a\u00020I2\u0006\u0010]\u001a\u00020g2\u0006\u0010A\u001a\u00020BH\u0002J\u0016\u0010i\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u0010]\u001a\u00020jJ \u0010k\u001a\u0002042\u0006\u0010\\\u001a\u00020I2\u0006\u0010]\u001a\u00020j2\u0006\u0010A\u001a\u00020BH\u0002J\u0016\u0010l\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u0010m\u001a\u00020nJ\u0016\u0010o\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u0010p\u001a\u00020qJ\u0018\u0010r\u001a\u0002042\u0006\u00105\u001a\u0002062\b\u0010M\u001a\u0004\u0018\u00010NJ*\u0010s\u001a\u0002042\u0006\u0010\\\u001a\u00020I2\u0006\u0010t\u001a\u00020N2\b\u0010u\u001a\u0004\u0018\u00010v2\u0006\u0010A\u001a\u00020BH\u0002J\"\u0010w\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u0010x\u001a\u0002082\n\b\u0002\u0010y\u001a\u0004\u0018\u000108J \u0010z\u001a\u0002042\b\u0010{\u001a\u0004\u0018\u00010|2\f\u0010}\u001a\b\u0012\u0004\u0012\u0002040~H\u0002J\u0016\u0010\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u0010;\u001a\u000208R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u00020\u001c8\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0002\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u00020.X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u0006\u0001"}, d2 = {"Lcom/bytedance/android/monitor/lynx/LynxMonitor;", "", "()V", "commonDataHandler", "Lcom/bytedance/android/monitor/lynx/data/handler/LynxCommonDataHandler;", "getCommonDataHandler$lynx_release", "()Lcom/bytedance/android/monitor/lynx/data/handler/LynxCommonDataHandler;", "setCommonDataHandler$lynx_release", "(Lcom/bytedance/android/monitor/lynx/data/handler/LynxCommonDataHandler;)V", "configHandler", "Lcom/bytedance/android/monitor/lynx/config/LynxConfigHandler;", "getConfigHandler$lynx_release", "()Lcom/bytedance/android/monitor/lynx/config/LynxConfigHandler;", "setConfigHandler$lynx_release", "(Lcom/bytedance/android/monitor/lynx/config/LynxConfigHandler;)V", "corePoolSize", "", "defaultExecutor", "Ljava/util/concurrent/Executor;", "keepAliveTime", "", "lifeCycleDataHandler", "Lcom/bytedance/android/monitor/lynx/data/handler/LynxLifeCycleDataHandler;", "getLifeCycleDataHandler$lynx_release", "()Lcom/bytedance/android/monitor/lynx/data/handler/LynxLifeCycleDataHandler;", "setLifeCycleDataHandler$lynx_release", "(Lcom/bytedance/android/monitor/lynx/data/handler/LynxLifeCycleDataHandler;)V", "lifeCycleDelegate", "Lcom/bytedance/android/monitor/lynx/ILynxViewLifeCycleDelegate;", "lifeCycleDelegate$annotations", "getLifeCycleDelegate", "()Lcom/bytedance/android/monitor/lynx/ILynxViewLifeCycleDelegate;", "logEnable", "", "getLogEnable", "()Z", "setLogEnable", "(Z)V", "logger", "Lcom/bytedance/android/monitor/logger/ILogger;", "getLogger", "()Lcom/bytedance/android/monitor/logger/ILogger;", "setLogger", "(Lcom/bytedance/android/monitor/logger/ILogger;)V", "maximumPoolSize", "reportCheckHandler", "Lcom/bytedance/android/monitor/lynx/data/handler/ReportCheckHandler;", "getReportCheckHandler$lynx_release", "()Lcom/bytedance/android/monitor/lynx/data/handler/ReportCheckHandler;", "setReportCheckHandler$lynx_release", "(Lcom/bytedance/android/monitor/lynx/data/handler/ReportCheckHandler;)V", "addContext", "", "view", "Lcom/lynx/tasm/LynxView;", "key", "", ActivityC23764o.f58839a, "checkHasReport", "eventType", "getDefaultExecutor", "getLynxSettingConfig", "Lcom/bytedance/android/monitor/setting/LynxSettingConfig;", "isEnableMonitor", "putConfig", "config", "Lcom/bytedance/android/monitor/lynx/config/LynxMonitorConfig;", "realReport", "monitorData", "Lcom/bytedance/android/monitor/lynx/data/entity/LynxMonitorReportData;", "registerLynxViewMonitor", "report", "lynxCommonData", "Lcom/bytedance/android/monitor/lynx/data/entity/LynxCommonData;", "baseMonitorData", "Lcom/bytedance/android/monitor/base/BaseNativeInfo;", "reportABTest", "lynxPerfData", "Lcom/bytedance/android/monitor/lynx/data/entity/LynxPerfData;", "reportCustom", "category", "Lorg/json/JSONObject;", "metric", "extra", "isSample", "url", "common", "canSample", "reportError", "lynxNativeErrorData", "Lcom/bytedance/android/monitor/lynx/data/entity/LynxNativeErrorData;", "reportErrorInner", "commonData", "errorData", "reportFallbackPage", "fallBackInfo", "Lcom/bytedance/android/monitor/entity/FallBackInfo;", "reportGeckoInfo", "resStatus", "resType", "resUrl", "resVersion", "reportJsbError", "Lcom/bytedance/android/monitor/entity/JsbErrorData;", "reportJsbErrorInner", "reportJsbFetchError", "Lcom/bytedance/android/monitor/lynx/data/entity/LynxJsbFetchErrorData;", "reportJsbFetchErrorInner", "reportJsbInfo", "infoData", "Lcom/bytedance/android/monitor/entity/JsbInfoData;", "reportPV", "pvData", "Lcom/bytedance/android/monitor/entity/PvData;", "reportPerf", "reportPerfInner", "perfData", "lifecycleData", "Lcom/bytedance/android/monitor/lynx/data/entity/LynxLifecycleData;", "reportTemplateInfo", "from", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "runReport", "executor", "Ljava/util/concurrent/ExecutorService;", "block", "Lkotlin/Function0;", "setHasReport", "Companion", "SingletonHolder", "lynx_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.android.monitor.lynx.b */
public final class LynxMonitor {

    /* renamed from: a */
    public static final LynxMonitor f8454a = SingletonHolder.f8467a.mo11509a();

    /* renamed from: b */
    public static final Companion f8455b = new Companion(null);

    /* renamed from: c */
    private LynxConfigHandler f8456c;

    /* renamed from: d */
    private LynxCommonDataHandler f8457d;

    /* renamed from: e */
    private LynxLifeCycleDataHandler f8458e;

    /* renamed from: f */
    private C2667e f8459f;

    /* renamed from: g */
    private int f8460g;

    /* renamed from: h */
    private int f8461h;

    /* renamed from: i */
    private long f8462i;

    /* renamed from: j */
    private boolean f8463j;

    /* renamed from: k */
    private AbstractC2647a f8464k;

    /* renamed from: l */
    private final ILynxViewLifeCycleDelegate f8465l;

    /* renamed from: m */
    private Executor f8466m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/android/monitor/lynx/LynxMonitor$Companion;", "", "()V", "INSTANCE", "Lcom/bytedance/android/monitor/lynx/LynxMonitor;", "getINSTANCE", "()Lcom/bytedance/android/monitor/lynx/LynxMonitor;", "TAG", "", "lynx_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.android.monitor.lynx.b$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final LynxMonitor mo11508a() {
            return LynxMonitor.f8454a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/android/monitor/lynx/LynxMonitor$SingletonHolder;", "", "()V", "holder", "Lcom/bytedance/android/monitor/lynx/LynxMonitor;", "getHolder", "()Lcom/bytedance/android/monitor/lynx/LynxMonitor;", "lynx_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.android.monitor.lynx.b$b */
    private static final class SingletonHolder {

        /* renamed from: a */
        public static final SingletonHolder f8467a = new SingletonHolder();

        /* renamed from: b */
        private static final LynxMonitor f8468b = new LynxMonitor(null);

        private SingletonHolder() {
        }

        /* renamed from: a */
        public final LynxMonitor mo11509a() {
            return f8468b;
        }
    }

    /* renamed from: a */
    public final LynxConfigHandler mo11492a() {
        return this.f8456c;
    }

    /* renamed from: b */
    public final LynxCommonDataHandler mo11504b() {
        return this.f8457d;
    }

    /* renamed from: c */
    public final LynxLifeCycleDataHandler mo11507c() {
        return this.f8458e;
    }

    /* renamed from: a */
    public final boolean mo11502a(LynxView lynxView) {
        Intrinsics.checkParameterIsNotNull(lynxView, "view");
        LynxMonitorConfig a = this.f8456c.mo11479a(lynxView);
        if (a == null || !a.mo11484b() || !m11216d().f8431a) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo11500a(LynxView lynxView, String str, Object obj) {
        Intrinsics.checkParameterIsNotNull(lynxView, "view");
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(obj, ActivityC23764o.f58839a);
        if (mo11502a(lynxView)) {
            LynxCommonData d = this.f8457d.mo11535b(lynxView);
            if (d == null) {
                d = this.f8457d.mo11534a(lynxView);
            }
            d.mo11448a(str, obj);
        }
    }

    /* renamed from: a */
    public final boolean mo11503a(LynxView lynxView, String str) {
        Intrinsics.checkParameterIsNotNull(lynxView, "view");
        Intrinsics.checkParameterIsNotNull(str, "eventType");
        return this.f8459f.mo11542b(lynxView, str);
    }

    /* renamed from: a */
    public final void mo11501a(LynxView lynxView, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, boolean z) {
        MonitorExecutor.f8417a.mo11453a(new C2662c(this, jSONObject4, lynxView, str2, str, jSONObject, jSONObject2, jSONObject3, z));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.android.monitor.lynx.b$g */
    public static final class RunnableC2666g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Function0 f8469a;

        RunnableC2666g(Function0 function0) {
            this.f8469a = function0;
        }

        public final void run() {
            this.f8469a.invoke();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.android.monitor.lynx.b$d */
    static final class C2663d extends Lambda implements Function0<Unit> {
        final /* synthetic */ LynxCommonData $commonData;
        final /* synthetic */ LynxMonitorConfig $config;
        final /* synthetic */ LynxNativeErrorData $lynxNativeErrorData;
        final /* synthetic */ LynxMonitor this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2663d(LynxMonitor bVar, LynxCommonData aVar, LynxNativeErrorData dVar, LynxMonitorConfig bVar2) {
            super(0);
            this.this$0 = bVar;
            this.$commonData = aVar;
            this.$lynxNativeErrorData = dVar;
            this.$config = bVar2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.mo11494a(this.$commonData, this.$lynxNativeErrorData, this.$config);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.android.monitor.lynx.b$e */
    static final class C2664e extends Lambda implements Function0<Unit> {
        final /* synthetic */ LynxCommonData $commonData;
        final /* synthetic */ LynxMonitorConfig $config;
        final /* synthetic */ PvData $pvData;
        final /* synthetic */ LynxMonitor this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2664e(LynxMonitor bVar, LynxCommonData aVar, PvData dVar, LynxMonitorConfig bVar2) {
            super(0);
            this.this$0 = bVar;
            this.$commonData = aVar;
            this.$pvData = dVar;
            this.$config = bVar2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.mo11493a(this.$commonData, this.$pvData, this.$config);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.android.monitor.lynx.b$f */
    static final class C2665f extends Lambda implements Function0<Unit> {
        final /* synthetic */ LynxCommonData $commonData;
        final /* synthetic */ LynxMonitorConfig $config;
        final /* synthetic */ LynxLifecycleData $lifecycleData;
        final /* synthetic */ LynxPerfData $lynxPerfData;
        final /* synthetic */ LynxMonitor this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2665f(LynxMonitor bVar, LynxCommonData aVar, LynxPerfData eVar, LynxLifecycleData bVar2, LynxMonitorConfig bVar3) {
            super(0);
            this.this$0 = bVar;
            this.$commonData = aVar;
            this.$lynxPerfData = eVar;
            this.$lifecycleData = bVar2;
            this.$config = bVar3;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            LynxMonitor bVar = this.this$0;
            LynxCommonData aVar = this.$commonData;
            LynxPerfData eVar = this.$lynxPerfData;
            if (eVar == null) {
                eVar = new LynxPerfData();
            }
            bVar.mo11495a(aVar, eVar, this.$lifecycleData, this.$config);
        }
    }

    /* renamed from: d */
    private final C2651c m11216d() {
        HybridMonitor instance = HybridMonitor.getInstance();
        Intrinsics.checkExpressionValueIsNotNull(instance, "HybridMonitor.getInstance()");
        AbstractC2650b settingManager = instance.getSettingManager();
        Intrinsics.checkExpressionValueIsNotNull(settingManager, "HybridMonitor.getInstance().settingManager");
        C2651c c = settingManager.mo11467c();
        Intrinsics.checkExpressionValueIsNotNull(c, "HybridMonitor.getInstanc…settingManager.lynxConfig");
        return c;
    }

    private LynxMonitor() {
        this.f8456c = new LynxConfigHandler();
        this.f8457d = new LynxCommonDataHandler();
        this.f8458e = new LynxLifeCycleDataHandler();
        this.f8459f = new C2667e();
        this.f8460g = 4;
        this.f8461h = 8;
        this.f8462i = 15;
        this.f8465l = new LynxViewLifeCycleDelegate();
    }

    /* renamed from: e */
    private final Executor m11217e() {
        if (this.f8466m == null) {
            this.f8466m = new ThreadPoolExecutor(this.f8460g, this.f8461h, this.f8462i, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadPoolExecutor.DiscardPolicy());
        }
        Executor executor = this.f8466m;
        if (executor == null) {
            Intrinsics.throwNpe();
        }
        return executor;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.android.monitor.lynx.b$c */
    public static final class C2662c extends Lambda implements Function0<Unit> {
        final /* synthetic */ boolean $canSample;
        final /* synthetic */ JSONObject $category;
        final /* synthetic */ JSONObject $common;
        final /* synthetic */ String $eventType;
        final /* synthetic */ JSONObject $extra;
        final /* synthetic */ JSONObject $metric;
        final /* synthetic */ String $url;
        final /* synthetic */ LynxView $view;
        final /* synthetic */ LynxMonitor this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2662c(LynxMonitor bVar, JSONObject jSONObject, LynxView lynxView, String str, String str2, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, boolean z) {
            super(0);
            this.this$0 = bVar;
            this.$common = jSONObject;
            this.$view = lynxView;
            this.$url = str;
            this.$eventType = str2;
            this.$category = jSONObject2;
            this.$metric = jSONObject3;
            this.$extra = jSONObject4;
            this.$canSample = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            boolean z;
            String a;
            JSONObject jSONObject = this.$common;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            String str = null;
            AbstractC2677a aVar = null;
            String str2 = "";
            if (this.$view != null) {
                LynxCommonData d = this.this$0.mo11504b().mo11535b(this.$view);
                if (d == null) {
                    d = this.this$0.mo11504b().mo11534a(this.$view);
                }
                if (d != null) {
                    C2657e.m11174a(jSONObject, "virtual_aid", d.f8411f);
                }
                LynxMonitorConfig a2 = this.this$0.mo11492a().mo11479a(this.$view);
                if (!(a2 == null || (a = a2.mo11481a()) == null)) {
                    str2 = a;
                }
                LynxMonitorConfig a3 = this.this$0.mo11492a().mo11479a(this.$view);
                if (a3 != null) {
                    aVar = a3.mo11488f();
                } else {
                    aVar = null;
                }
            }
            String str3 = this.$url;
            String str4 = str3;
            if (str4 == null || str4.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                LynxView lynxView = this.$view;
                if (lynxView != null) {
                    str = lynxView.getTemplateUrl();
                }
                str3 = str;
            }
            HybridMonitor.getInstance().customReport(new C2641a.C2643a(this.$eventType).mo11441b(str2).mo11437a(str3).mo11438a(this.$category).mo11442b(this.$metric).mo11444c(this.$extra).mo11446e(jSONObject).mo11439a(this.$canSample).mo11436a(aVar).mo11440a());
        }
    }

    public /* synthetic */ LynxMonitor(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: b */
    private final void m11215b(LynxView lynxView, LynxMonitorConfig bVar) {
        this.f8456c.mo11480a(lynxView, bVar);
    }

    /* renamed from: a */
    private final void m11214a(ExecutorService executorService, Function0<Unit> function0) {
        ExecutorService executorService2;
        if (executorService != null) {
            executorService2 = executorService;
        } else {
            executorService2 = m11217e();
        }
        try {
            executorService2.execute(new RunnableC2666g(function0));
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public final void mo11506b(LynxView lynxView, String str) {
        Intrinsics.checkParameterIsNotNull(lynxView, "view");
        Intrinsics.checkParameterIsNotNull(str, "eventType");
        this.f8459f.mo11541a(lynxView, str);
    }

    /* renamed from: a */
    private final void m11213a(LynxMonitorReportData cVar, LynxMonitorConfig bVar) {
        AbstractC2647a aVar;
        if (bVar.mo11484b()) {
            cVar.mo11515a(bVar.mo11481a());
            AbstractC2677a f = bVar.mo11488f();
            if (f != null) {
                C2637b.m11075a(cVar, f);
                if (this.f8463j && (aVar = this.f8464k) != null) {
                    aVar.mo11455a("LynxMonitor", cVar.toString());
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo11505b(LynxView lynxView, LynxPerfData eVar) {
        LynxCommonData d;
        String str;
        Intrinsics.checkParameterIsNotNull(lynxView, "view");
        LynxMonitorConfig a = this.f8456c.mo11479a(lynxView);
        if (a != null && a.mo11490h() && (d = this.f8457d.mo11535b(lynxView)) != null && eVar != null) {
            JSONObject jSONObject = new JSONObject();
            C2657e.m11174a(jSONObject, "prefEnable", String.valueOf(a.mo11485c()));
            if (d != null) {
                str = d.f8406a;
            } else {
                str = null;
            }
            C2657e.m11174a(jSONObject, "url", str);
            C2657e.m11174a(jSONObject, "container_type", "lynx");
            JSONObject jSONObject2 = new JSONObject();
            C2657e.m11173a(jSONObject2, "tti", Double.valueOf(eVar.mo11523b()));
            if (a.mo11488f() != null) {
                mo11501a(lynxView, "performance_test", lynxView.getTemplateUrl(), jSONObject, jSONObject2, null, null, true);
            }
        }
    }

    /* renamed from: a */
    public final void mo11496a(LynxView lynxView, PvData dVar) {
        LynxCommonData d;
        Intrinsics.checkParameterIsNotNull(lynxView, "view");
        Intrinsics.checkParameterIsNotNull(dVar, "pvData");
        LynxMonitorConfig a = this.f8456c.mo11479a(lynxView);
        if (a != null && (d = this.f8457d.mo11535b(lynxView)) != null) {
            m11214a(a.mo11489g(), new C2664e(this, d, dVar, a));
        }
    }

    /* renamed from: a */
    public final void mo11497a(LynxView lynxView, LynxMonitorConfig bVar) {
        Intrinsics.checkParameterIsNotNull(lynxView, "view");
        Intrinsics.checkParameterIsNotNull(bVar, "config");
        m11215b(lynxView, bVar);
    }

    /* renamed from: a */
    public final void mo11498a(LynxView lynxView, LynxNativeErrorData dVar) {
        LynxCommonData d;
        Intrinsics.checkParameterIsNotNull(lynxView, "view");
        Intrinsics.checkParameterIsNotNull(dVar, "lynxNativeErrorData");
        LynxMonitorConfig a = this.f8456c.mo11479a(lynxView);
        if (a != null && (d = this.f8457d.mo11535b(lynxView)) != null) {
            m11214a(a.mo11489g(), new C2663d(this, d, dVar, a));
        }
    }

    /* renamed from: a */
    public final void mo11499a(LynxView lynxView, LynxPerfData eVar) {
        Intrinsics.checkParameterIsNotNull(lynxView, "view");
        LynxMonitorConfig a = this.f8456c.mo11479a(lynxView);
        if (a != null && a.mo11485c() && !mo11503a(lynxView, "perf")) {
            mo11506b(lynxView, "perf");
            LynxCommonData d = this.f8457d.mo11535b(lynxView);
            if (d != null) {
                m11214a(a.mo11489g(), new C2665f(this, d, eVar, (LynxLifecycleData) this.f8458e.mo11535b(lynxView), a));
            }
        }
    }

    /* renamed from: a */
    public final void mo11494a(LynxCommonData aVar, LynxNativeErrorData dVar, LynxMonitorConfig bVar) {
        mo11493a(aVar, (AbstractC2630b) dVar, bVar);
    }

    /* renamed from: a */
    public final void mo11493a(LynxCommonData aVar, AbstractC2630b bVar, LynxMonitorConfig bVar2) {
        m11213a(new LynxMonitorReportData(aVar, bVar), bVar2);
    }

    /* renamed from: a */
    public final void mo11495a(LynxCommonData aVar, LynxPerfData eVar, LynxLifecycleData bVar, LynxMonitorConfig bVar2) {
        eVar.mo11522a(bVar);
        mo11493a(aVar, eVar, bVar2);
    }
}
