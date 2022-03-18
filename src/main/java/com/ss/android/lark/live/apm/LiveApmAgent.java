package com.ss.android.lark.live.apm;

import com.ss.android.lark.calendar.impl.features.search.result.CalendarSearchResultRv;
import com.ss.android.lark.live.apm.cpu.LiveCpuCollector;
import com.ss.android.lark.live.apm.cpu.LiveCpuDataInfo;
import com.ss.android.lark.live.apm.memory.LiveMemoryCollector;
import com.ss.android.lark.live.apm.memory.LiveMemoryDataInfo;
import com.ss.android.lark.live.apm.p2138e.AbstractC41501a;
import com.ss.android.lark.live.apm.p2138e.C41502b;
import com.ss.android.lark.live.apm.power.LivePowerCollector;
import com.ss.android.lark.live.apm.power.LivePowerDataInfo;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45857i;
import com.ss.android.lark.mm.p2288b.C45859k;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001:\u00010B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0013H\u0007J\b\u0010'\u001a\u00020%H\u0002J\u0018\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*H\u0016J\u0010\u0010,\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0013H\u0007J\b\u0010-\u001a\u00020%H\u0007J\b\u0010.\u001a\u00020%H\u0007J\u000e\u0010/\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001e\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001f\u001a\u00020 8BX\u0002¢\u0006\f\n\u0004\b#\u0010\r\u001a\u0004\b!\u0010\"¨\u00061"}, d2 = {"Lcom/ss/android/lark/live/apm/LiveApmAgent;", "Lcom/ss/android/lark/mm/depend/IMmDepend$IContextDepend$IAppLifecycleObserver;", "()V", "DEFAULT_MONITOR_INTERVAL", "", "DEFAULT_POWER_MONITOR_INTERVAL", "LIVE_PERF_SETTING_KEY", "", "cpuCollector", "Lcom/ss/android/lark/live/apm/cpu/LiveCpuCollector;", "getCpuCollector", "()Lcom/ss/android/lark/live/apm/cpu/LiveCpuCollector;", "cpuCollector$delegate", "Lkotlin/Lazy;", "cpuMemoryInterval", "isStarted", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/ss/android/lark/live/apm/LiveApmAgent$ILiveApmDataListener;", "memoryCollector", "Lcom/ss/android/lark/live/apm/memory/LiveMemoryCollector;", "getMemoryCollector", "()Lcom/ss/android/lark/live/apm/memory/LiveMemoryCollector;", "memoryCollector$delegate", "powerCollector", "Lcom/ss/android/lark/live/apm/power/LivePowerCollector;", "getPowerCollector", "()Lcom/ss/android/lark/live/apm/power/LivePowerCollector;", "powerCollector$delegate", "powerInterval", "timerExecutor", "Lcom/ss/android/lark/live/apm/timer/LiveTimerExecutor;", "getTimerExecutor", "()Lcom/ss/android/lark/live/apm/timer/LiveTimerExecutor;", "timerExecutor$delegate", "addListener", "", "listener", "initPollingTask", "onAppLifecycleChanged", "oldState", "Lcom/ss/android/lark/mm/depend/IMmDepend$IContextDepend$AppStateInfo;", "newState", "removeListener", "start", "stop", "triggerCollectNow", "ILiveApmDataListener", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.live.apm.a */
public final class LiveApmAgent implements IMmDepend.AbstractC45871b.AbstractC45874c {

    /* renamed from: a */
    public static final LiveApmAgent f105471a;

    /* renamed from: b */
    private static int f105472b = 20000;

    /* renamed from: c */
    private static int f105473c = CalendarSearchResultRv.f82652c;

    /* renamed from: d */
    private static final CopyOnWriteArrayList<ILiveApmDataListener> f105474d = new CopyOnWriteArrayList<>();

    /* renamed from: e */
    private static final Lazy f105475e = LazyKt.lazy(C41491c.INSTANCE);

    /* renamed from: f */
    private static final Lazy f105476f = LazyKt.lazy(C41496f.INSTANCE);

    /* renamed from: g */
    private static final Lazy f105477g = LazyKt.lazy(C41497g.INSTANCE);

    /* renamed from: h */
    private static final Lazy f105478h = LazyKt.lazy(C41499i.INSTANCE);

    /* renamed from: i */
    private static final AtomicBoolean f105479i = new AtomicBoolean(false);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/live/apm/LiveApmAgent$ILiveApmDataListener;", "", "onOutputApmData", "", "apmData", "Lcom/ss/android/lark/live/apm/LiveApmDataInfo;", "onOutputPowerData", "powerData", "Lcom/ss/android/lark/live/apm/power/LivePowerDataInfo;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.live.apm.a$a */
    public interface ILiveApmDataListener {
        /* renamed from: a */
        void mo149257a(LiveApmDataInfo bVar);

        /* renamed from: a */
        void mo149258a(LivePowerDataInfo bVar);
    }

    /* renamed from: f */
    private final C41502b m164653f() {
        return (C41502b) f105478h.getValue();
    }

    /* renamed from: a */
    public final LiveCpuCollector mo149330a() {
        return (LiveCpuCollector) f105475e.getValue();
    }

    /* renamed from: b */
    public final LiveMemoryCollector mo149332b() {
        return (LiveMemoryCollector) f105476f.getValue();
    }

    /* renamed from: c */
    public final LivePowerCollector mo149333c() {
        return (LivePowerCollector) f105477g.getValue();
    }

    private LiveApmAgent() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/live/apm/cpu/LiveCpuCollector;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.live.apm.a$c */
    static final class C41491c extends Lambda implements Function0<LiveCpuCollector> {
        public static final C41491c INSTANCE = new C41491c();

        C41491c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LiveCpuCollector invoke() {
            return new LiveCpuCollector();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/live/apm/memory/LiveMemoryCollector;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.live.apm.a$f */
    static final class C41496f extends Lambda implements Function0<LiveMemoryCollector> {
        public static final C41496f INSTANCE = new C41496f();

        C41496f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LiveMemoryCollector invoke() {
            return new LiveMemoryCollector();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/live/apm/power/LivePowerCollector;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.live.apm.a$g */
    static final class C41497g extends Lambda implements Function0<LivePowerCollector> {
        public static final C41497g INSTANCE = new C41497g();

        C41497g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LivePowerCollector invoke() {
            return new LivePowerCollector();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/live/apm/timer/LiveTimerExecutor;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.live.apm.a$i */
    static final class C41499i extends Lambda implements Function0<C41502b> {
        public static final C41499i INSTANCE = new C41499i();

        C41499i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C41502b invoke() {
            return new C41502b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.live.apm.a$b */
    static final class RunnableC41490b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ILiveApmDataListener f105481a;

        RunnableC41490b(ILiveApmDataListener aVar) {
            this.f105481a = aVar;
        }

        public final void run() {
            LiveApmAgent aVar = LiveApmAgent.f105471a;
            if (!LiveApmAgent.f105474d.contains(this.f105481a)) {
                LiveApmAgent aVar2 = LiveApmAgent.f105471a;
                LiveApmAgent.f105474d.add(this.f105481a);
                LiveApmAgent.m164651d();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.live.apm.a$h */
    static final class RunnableC41498h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ILiveApmDataListener f105487a;

        RunnableC41498h(ILiveApmDataListener aVar) {
            this.f105487a = aVar;
        }

        public final void run() {
            LiveApmAgent aVar = LiveApmAgent.f105471a;
            LiveApmAgent.f105474d.remove(this.f105487a);
            LiveApmAgent aVar2 = LiveApmAgent.f105471a;
            if (LiveApmAgent.f105474d.isEmpty()) {
                LiveApmAgent.m164652e();
            }
        }
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m164651d() {
        if (f105479i.compareAndSet(false, true)) {
            C45855f.m181664c("LiveApmAgent", "[start] start");
            f105471a.m164654g();
        }
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m164652e() {
        if (f105479i.compareAndSet(true, false)) {
            C45855f.m181664c("LiveApmAgent", "[stop] stop");
            f105474d.clear();
            LiveApmAgent aVar = f105471a;
            aVar.m164653f().mo149369a();
            IMmDepend a = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
            a.getContextDepend().mo144564b(aVar);
        }
    }

    static {
        LiveApmAgent aVar = new LiveApmAgent();
        f105471a = aVar;
        C45857i.m181676a(RunnableC414891.f105480a);
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        a.getContextDepend().mo144560a(aVar);
    }

    /* renamed from: g */
    private final void m164654g() {
        C45855f.m181664c("LiveApmAgent", "[initPollingTask] cpuMemoryInterval: " + f105472b + ", powerInterval: " + f105473c);
        C41502b f = m164653f();
        int i = f105472b;
        f.mo149367a("Live-CpuCollector", i, i, C41492d.f105482a);
        m164653f().mo149372b("Live-CpuCollector");
        mo149333c().mo149357a();
        C41502b f2 = m164653f();
        int i2 = f105473c;
        f2.mo149367a("Live-PowerCollector", i2, i2, C41494e.f105485a);
        m164653f().mo149372b("Live-PowerCollector");
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m164645a(ILiveApmDataListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        C45859k.m181685a(new RunnableC41490b(aVar));
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m164648b(ILiveApmDataListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        C45859k.m181686a(new RunnableC41498h(aVar), 200);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onTimer"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.live.apm.a$d */
    public static final class C41492d implements AbstractC41501a {

        /* renamed from: a */
        public static final C41492d f105482a = new C41492d();

        C41492d() {
        }

        @Override // com.ss.android.lark.live.apm.p2138e.AbstractC41501a
        /* renamed from: a */
        public final void mo149336a(String str, int i) {
            final LiveCpuDataInfo a = LiveApmAgent.f105471a.mo149330a().mo149340a();
            final LiveMemoryDataInfo a2 = LiveApmAgent.f105471a.mo149332b().mo149350a();
            C45855f.m181664c("LiveApmAgent", "[collector] cpuDataInfo: " + a + ", memoryDataInfo: " + a2);
            C45859k.m181685a(new Runnable() {
                /* class com.ss.android.lark.live.apm.LiveApmAgent.C41492d.RunnableC414931 */

                public final void run() {
                    LiveApmAgent aVar = LiveApmAgent.f105471a;
                    for (ILiveApmDataListener aVar2 : LiveApmAgent.f105474d) {
                        aVar2.mo149257a(new LiveApmDataInfo(a, a2));
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onTimer"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.live.apm.a$e */
    public static final class C41494e implements AbstractC41501a {

        /* renamed from: a */
        public static final C41494e f105485a = new C41494e();

        C41494e() {
        }

        @Override // com.ss.android.lark.live.apm.p2138e.AbstractC41501a
        /* renamed from: a */
        public final void mo149336a(String str, int i) {
            final LivePowerDataInfo b = LiveApmAgent.f105471a.mo149333c().mo149358b();
            C45855f.m181663b("LiveApmAgent", "[collector] powerDataInfo: " + b);
            C45859k.m181685a(new Runnable() {
                /* class com.ss.android.lark.live.apm.LiveApmAgent.C41494e.RunnableC414951 */

                public final void run() {
                    LiveApmAgent aVar = LiveApmAgent.f105471a;
                    for (ILiveApmDataListener aVar2 : LiveApmAgent.f105474d) {
                        aVar2.mo149258a(b);
                    }
                }
            });
        }
    }

    @Override // com.ss.android.lark.mm.depend.IMmDepend.AbstractC45871b.AbstractC45874c
    /* renamed from: a */
    public void mo149331a(IMmDepend.AbstractC45871b.C45872a aVar, IMmDepend.AbstractC45871b.C45872a aVar2) {
        boolean z;
        boolean z2;
        Intrinsics.checkParameterIsNotNull(aVar, "oldState");
        Intrinsics.checkParameterIsNotNull(aVar2, "newState");
        boolean z3 = true;
        if (aVar.f115713c || !aVar2.f115713c) {
            z = false;
        } else {
            z = true;
        }
        if (!aVar.f115713c || aVar2.f115713c) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z && !z2) {
            z3 = false;
        }
        if (z3) {
            C45855f.m181663b("LiveApmAgent", "[onAppLifecycleChanged] switch to  isChangeToFront: " + z + ", isChangeToBackGround: " + z2 + ", ");
            m164653f().mo149373c("Live-CpuCollector");
            m164653f().mo149373c("Live-PowerCollector");
        }
    }
}
