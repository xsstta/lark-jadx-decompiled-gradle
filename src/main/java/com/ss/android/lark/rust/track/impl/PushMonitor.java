package com.ss.android.lark.rust.track.impl;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.rust.track.C53165b;
import com.ss.android.lark.rust.track.IRustTrackModuleDependency;
import com.ss.android.lark.rust.track.monitor.IBlockLevelCallback;
import com.ss.android.lark.rust.track.monitor.MixMonitor;
import com.ss.android.lark.rust.track.monitor.MonitorConfigParser;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000G\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0004\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0006\u0010\u0018\u001a\u00020\u0015J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u000e\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001bJ\b\u0010\u001e\u001a\u00020\u0015H\u0002J\u000e\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001bJ\u0006\u0010\u0013\u001a\u00020\u0015J\u0006\u0010!\u001a\u00020\u0015J\u0010\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\u0015H\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/ss/android/lark/rust/track/impl/PushMonitor;", "", "()V", "appStateListener", "com/ss/android/lark/rust/track/impl/PushMonitor$appStateListener$1", "Lcom/ss/android/lark/rust/track/impl/PushMonitor$appStateListener$1;", "enableCheck", "Ljava/util/concurrent/atomic/AtomicBoolean;", "executor", "Ljava/util/concurrent/ScheduledExecutorService;", "forceCheck", "isAppFront", "isTaskRunning", "mixMonitor", "Lcom/ss/android/lark/rust/track/monitor/MixMonitor;", "getMixMonitor", "()Lcom/ss/android/lark/rust/track/monitor/MixMonitor;", "mixMonitor$delegate", "Lkotlin/Lazy;", "startDetect", "getLagStatus", "", "callback", "Lcom/ss/android/lark/rust/track/monitor/IBlockLevelCallback;", "init", "onAppFrontChanged", "front", "", "onDetectStart", "start", "reset", "setCPUMonitorInit", "cpuInit", "unInit", "uploadLagStatus", "level", "", "uploadMonitorPushStatus", "Companion", "features_rust-track_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.rust.track.impl.b */
public final class PushMonitor {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f131462a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(PushMonitor.class), "mixMonitor", "getMixMonitor()Lcom/ss/android/lark/rust/track/monitor/MixMonitor;"))};

    /* renamed from: g */
    public static final Lazy f131463g = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C53167b.INSTANCE);

    /* renamed from: h */
    public static final Companion f131464h = new Companion(null);

    /* renamed from: b */
    public final AtomicBoolean f131465b;

    /* renamed from: c */
    public final AtomicBoolean f131466c;

    /* renamed from: d */
    public final AtomicBoolean f131467d;

    /* renamed from: e */
    public final AtomicBoolean f131468e;

    /* renamed from: f */
    public ScheduledExecutorService f131469f;

    /* renamed from: i */
    private final AtomicBoolean f131470i;

    /* renamed from: j */
    private final Lazy f131471j;

    /* renamed from: k */
    private final C53168c f131472k;

    /* renamed from: a */
    public final MixMonitor mo181579a() {
        Lazy lazy = this.f131471j;
        KProperty kProperty = f131462a[0];
        return (MixMonitor) lazy.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/rust/track/impl/PushMonitor$Companion;", "", "()V", "TAG", "", "TIME_INTERVAL", "", "instance", "Lcom/ss/android/lark/rust/track/impl/PushMonitor;", "getInstance", "()Lcom/ss/android/lark/rust/track/impl/PushMonitor;", "instance$delegate", "Lkotlin/Lazy;", "features_rust-track_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.rust.track.impl.b$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ KProperty[] f131473a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "instance", "getInstance()Lcom/ss/android/lark/rust/track/impl/PushMonitor;"))};

        /* renamed from: a */
        public final PushMonitor mo181589a() {
            Lazy lazy = PushMonitor.f131463g;
            Companion aVar = PushMonitor.f131464h;
            KProperty kProperty = f131473a[0];
            return (PushMonitor) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/rust/track/impl/PushMonitor;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.rust.track.impl.b$b */
    static final class C53167b extends Lambda implements Function0<PushMonitor> {
        public static final C53167b INSTANCE = new C53167b();

        C53167b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final PushMonitor invoke() {
            return new PushMonitor(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/rust/track/monitor/MixMonitor;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.rust.track.impl.b$d */
    static final class C53169d extends Lambda implements Function0<MixMonitor> {
        public static final C53169d INSTANCE = new C53169d();

        C53169d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MixMonitor invoke() {
            return new MixMonitor();
        }
    }

    /* renamed from: b */
    public final void mo181583b() {
        MonitorConfigParser.initConfig();
        C53165b.m205769a().mo178122a(this.f131472k);
    }

    /* renamed from: f */
    private final void m205777f() {
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getFixedThreadPool().execute(new RunnableC53171f(this));
    }

    /* renamed from: c */
    public final void mo181585c() {
        C53165b.m205769a().mo178126b(this.f131472k);
        mo181579a().mo181611e();
        this.f131470i.set(false);
    }

    /* renamed from: d */
    public final void mo181587d() {
        this.f131470i.set(true);
        mo181582a(C53165b.m205769a().mo178127c());
    }

    /* renamed from: e */
    public final void mo181588e() {
        ScheduledExecutorService scheduledExecutorService = this.f131469f;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
        this.f131469f = null;
        this.f131467d.set(false);
        this.f131465b.set(false);
        this.f131466c.set(false);
    }

    private PushMonitor() {
        this.f131465b = new AtomicBoolean(false);
        this.f131466c = new AtomicBoolean(false);
        this.f131467d = new AtomicBoolean(false);
        this.f131468e = new AtomicBoolean(false);
        this.f131470i = new AtomicBoolean(false);
        this.f131471j = LazyKt.lazy(C53169d.INSTANCE);
        this.f131472k = new C53168c(this);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.rust.track.impl.b$f */
    public static final class RunnableC53171f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PushMonitor f131476a;

        RunnableC53171f(PushMonitor bVar) {
            this.f131476a = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
            if (r0.isShutdown() != false) goto L_0x0034;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 114
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.rust.track.impl.PushMonitor.RunnableC53171f.run():void");
        }
    }

    public /* synthetic */ PushMonitor(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/rust/track/impl/PushMonitor$appStateListener$1", "Lcom/ss/android/lark/rust/track/IRustTrackModuleDependency$AppStateChangeListener;", "onAppStateChange", "", "front", "", "features_rust-track_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.rust.track.impl.b$c */
    public static final class C53168c implements IRustTrackModuleDependency.AppStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ PushMonitor f131474a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53168c(PushMonitor bVar) {
            this.f131474a = bVar;
        }

        @Override // com.ss.android.lark.rust.track.IRustTrackModuleDependency.AppStateChangeListener
        /* renamed from: a */
        public void mo181561a(boolean z) {
            this.f131474a.mo181582a(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/rust/track/impl/PushMonitor$uploadLagStatus$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "features_rust-track_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.rust.track.impl.b$e */
    public static final class C53170e implements IGetDataCallback<Integer> {

        /* renamed from: a */
        final /* synthetic */ PushMonitor f131475a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53170e(PushMonitor bVar) {
            this.f131475a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public /* synthetic */ void onSuccess(Integer num) {
            mo181590a(num.intValue());
        }

        /* renamed from: a */
        public void mo181590a(int i) {
            if (i == 1) {
                Log.m165389i("PushMonitor", "recover push to normal status");
                if (this.f131475a.f131468e.get()) {
                    this.f131475a.f131468e.set(false);
                } else {
                    this.f131475a.mo181588e();
                }
            } else if (i == 2) {
                Log.m165389i("PushMonitor", "continue push downgrade status");
                this.f131475a.f131467d.set(true);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("PushMonitor", "upload lag status error: " + errorResult.getDisplayMsg());
            this.f131475a.mo181588e();
        }
    }

    /* renamed from: a */
    public final void mo181581a(IBlockLevelCallback cVar) {
        mo181579a().mo181606a(cVar);
    }

    /* renamed from: c */
    public final void mo181586c(boolean z) {
        mo181579a().mo181607a(z);
    }

    /* renamed from: a */
    public final void mo181580a(int i) {
        PushMonitorService.f131480b.mo181597a().mo181595a(i, new C53170e(this));
    }

    /* renamed from: a */
    public final void mo181582a(boolean z) {
        Log.m165389i("PushMonitor", "monitor push status —— enable check " + this.f131470i.get() + ",  " + "app is front " + z + ",  start detect " + this.f131465b.get() + ", " + "is task running " + this.f131467d.get());
        synchronized (PushMonitor.class) {
            this.f131466c.set(z);
            if (this.f131466c.get()) {
                if (!this.f131470i.get() && !RustMonitorFeatureGating.f131484a.mo181599a()) {
                    Log.m165389i("PushMonitor", "push lag monitor is disabled");
                    return;
                } else if (!this.f131467d.get()) {
                    m205777f();
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: b */
    public final void mo181584b(boolean z) {
        if (this.f131470i.get() || RustMonitorFeatureGating.f131484a.mo181599a()) {
            Log.m165389i("PushMonitor", "monitor push status —— —— enable check " + this.f131470i.get() + ", " + "start detect " + z + ", app is front " + this.f131466c.get() + ',' + " is task running " + this.f131467d.get());
            synchronized (PushMonitor.class) {
                this.f131465b.set(z);
                if (this.f131467d.get()) {
                    this.f131468e.set(true);
                } else {
                    m205777f();
                }
                Unit unit = Unit.INSTANCE;
            }
            return;
        }
        Log.m165389i("PushMonitor", "push lag monitor is disabled");
    }
}
