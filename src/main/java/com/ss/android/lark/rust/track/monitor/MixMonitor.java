package com.ss.android.lark.rust.track.monitor;

import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 !2\u00020\u0001:\u0002!\"B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u0019J\u0006\u0010 \u001a\u00020\u0019R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR*\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fj\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011`\u0012X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/ss/android/lark/rust/track/monitor/MixMonitor;", "", "()V", "cpuMonitor", "Lcom/ss/android/lark/rust/track/monitor/CPUMonitor;", "getCpuMonitor", "()Lcom/ss/android/lark/rust/track/monitor/CPUMonitor;", "cpuMonitor$delegate", "Lkotlin/Lazy;", "dropFrameMonitor", "Lcom/ss/android/lark/rust/track/monitor/DropFrameMonitor;", "getDropFrameMonitor", "()Lcom/ss/android/lark/rust/track/monitor/DropFrameMonitor;", "dropFrameMonitor$delegate", "levelMap", "Ljava/util/HashMap;", "Lcom/ss/android/lark/rust/track/monitor/MixMonitor$MonitorType;", "", "Lkotlin/collections/HashMap;", "memoryMonitor", "Lcom/ss/android/lark/rust/track/monitor/MemoryMonitor;", "getMemoryMonitor", "()Lcom/ss/android/lark/rust/track/monitor/MemoryMonitor;", "memoryMonitor$delegate", "calculateLevel", "", "callback", "Lcom/ss/android/lark/rust/track/monitor/IBlockLevelCallback;", "setCPUInit", "cpuInit", "", "start", "stop", "Companion", "MonitorType", "features_rust-track_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class MixMonitor {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f131492a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(MixMonitor.class), "cpuMonitor", "getCpuMonitor()Lcom/ss/android/lark/rust/track/monitor/CPUMonitor;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(MixMonitor.class), "dropFrameMonitor", "getDropFrameMonitor()Lcom/ss/android/lark/rust/track/monitor/DropFrameMonitor;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(MixMonitor.class), "memoryMonitor", "getMemoryMonitor()Lcom/ss/android/lark/rust/track/monitor/MemoryMonitor;"))};

    /* renamed from: c */
    public static final Companion f131493c = new Companion(null);

    /* renamed from: b */
    public final HashMap<MonitorType, Integer> f131494b = new HashMap<>();

    /* renamed from: d */
    private final Lazy f131495d = LazyKt.lazy(C53185c.INSTANCE);

    /* renamed from: e */
    private final Lazy f131496e = LazyKt.lazy(C53186d.INSTANCE);

    /* renamed from: f */
    private final Lazy f131497f = LazyKt.lazy(C53187e.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/rust/track/monitor/MixMonitor$MonitorType;", "", "(Ljava/lang/String;I)V", "CPU", "MEMORY", "FRAME", "features_rust-track_release"}, mo238835k = 1, mv = {1, 1, 15})
    public enum MonitorType {
        CPU,
        MEMORY,
        FRAME
    }

    /* renamed from: a */
    public final CPUMonitor mo181605a() {
        Lazy lazy = this.f131495d;
        KProperty kProperty = f131492a[0];
        return (CPUMonitor) lazy.getValue();
    }

    /* renamed from: b */
    public final DropFrameMonitor mo181608b() {
        Lazy lazy = this.f131496e;
        KProperty kProperty = f131492a[1];
        return (DropFrameMonitor) lazy.getValue();
    }

    /* renamed from: c */
    public final MemoryMonitor mo181609c() {
        Lazy lazy = this.f131497f;
        KProperty kProperty = f131492a[2];
        return (MemoryMonitor) lazy.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/rust/track/monitor/MixMonitor$Companion;", "", "()V", "TAG", "", "features_rust-track_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.rust.track.monitor.MixMonitor$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/rust/track/monitor/CPUMonitor;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.rust.track.monitor.MixMonitor$c */
    static final class C53185c extends Lambda implements Function0<CPUMonitor> {
        public static final C53185c INSTANCE = new C53185c();

        C53185c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CPUMonitor invoke() {
            return new CPUMonitor();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/rust/track/monitor/DropFrameMonitor;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.rust.track.monitor.MixMonitor$d */
    static final class C53186d extends Lambda implements Function0<DropFrameMonitor> {
        public static final C53186d INSTANCE = new C53186d();

        C53186d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final DropFrameMonitor invoke() {
            return new DropFrameMonitor();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/rust/track/monitor/MemoryMonitor;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.rust.track.monitor.MixMonitor$e */
    static final class C53187e extends Lambda implements Function0<MemoryMonitor> {
        public static final C53187e INSTANCE = new C53187e();

        C53187e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MemoryMonitor invoke() {
            return new MemoryMonitor();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.rust.track.monitor.MixMonitor$f */
    public static final class RunnableC53188f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MixMonitor f131501a;

        RunnableC53188f(MixMonitor mixMonitor) {
            this.f131501a = mixMonitor;
        }

        public final void run() {
            this.f131501a.mo181608b().mo181652b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.rust.track.monitor.MixMonitor$g */
    public static final class RunnableC53189g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MixMonitor f131502a;

        RunnableC53189g(MixMonitor mixMonitor) {
            this.f131502a = mixMonitor;
        }

        public final void run() {
            this.f131502a.mo181608b().mo181653c();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.rust.track.monitor.MixMonitor$b */
    public static final class RunnableC53183b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MixMonitor f131498a;

        /* renamed from: b */
        final /* synthetic */ IBlockLevelCallback f131499b;

        RunnableC53183b(MixMonitor mixMonitor, IBlockLevelCallback cVar) {
            this.f131498a = mixMonitor;
            this.f131499b = cVar;
        }

        public final void run() {
            this.f131498a.mo181608b().mo181651a(new IBlockLevelCallback(this) {
                /* class com.ss.android.lark.rust.track.monitor.MixMonitor.RunnableC53183b.C531841 */

                /* renamed from: a */
                final /* synthetic */ RunnableC53183b f131500a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f131500a = r1;
                }

                @Override // com.ss.android.lark.rust.track.monitor.IBlockLevelCallback
                /* renamed from: a */
                public void mo181593a(int i) {
                    this.f131500a.f131498a.f131494b.put(MonitorType.FRAME, Integer.valueOf(i));
                    if (i < 2) {
                        this.f131500a.f131499b.mo181593a(i);
                        Log.m165389i("PushMonitor", "lag level detail —— frame: " + i);
                        return;
                    }
                    this.f131500a.f131498a.f131494b.put(MonitorType.CPU, Integer.valueOf(this.f131500a.f131498a.mo181605a().mo181648d()));
                    this.f131500a.f131498a.f131494b.put(MonitorType.MEMORY, Integer.valueOf(this.f131500a.f131498a.mo181609c().mo181661a()));
                    Integer num = this.f131500a.f131498a.f131494b.get(MonitorType.CPU);
                    if (num == null) {
                        num = 0;
                    }
                    Intrinsics.checkExpressionValueIsNotNull(num, "levelMap[CPU] ?: LagLevel.NONE");
                    int intValue = num.intValue();
                    Integer num2 = this.f131500a.f131498a.f131494b.get(MonitorType.MEMORY);
                    if (num2 == null) {
                        num2 = 0;
                    }
                    Intrinsics.checkExpressionValueIsNotNull(num2, "levelMap[MEMORY] ?: LagLevel.NONE");
                    int intValue2 = num2.intValue();
                    this.f131500a.f131499b.mo181593a(((i + intValue) + intValue2) / 3);
                    Log.m165389i("PushMonitor", "lag level detail —— frame: " + i + ", cpu: " + intValue + ", memory : " + intValue2);
                }
            });
        }
    }

    /* renamed from: d */
    public final void mo181610d() {
        UICallbackExecutor.execute(new RunnableC53188f(this));
        mo181609c().mo181662b();
        mo181605a().mo181646b();
    }

    /* renamed from: e */
    public final void mo181611e() {
        UICallbackExecutor.execute(new RunnableC53189g(this));
        mo181609c().mo181663c();
        mo181605a().mo181647c();
    }

    /* renamed from: a */
    public final void mo181606a(IBlockLevelCallback cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "callback");
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getFixedThreadPool().submit(new RunnableC53183b(this, cVar));
    }

    /* renamed from: a */
    public final void mo181607a(boolean z) {
        mo181605a().mo181645a().set(z);
    }
}
