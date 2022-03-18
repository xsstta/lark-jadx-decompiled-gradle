package com.ss.android.lark.mm.apm;

import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.mm.apm.cpu.MmCpuCollector;
import com.ss.android.lark.mm.apm.cpu.MmCpuDataInfo;
import com.ss.android.lark.mm.apm.memory.MmMemoryCollector;
import com.ss.android.lark.mm.apm.memory.MmMemoryDataInfo;
import com.ss.android.lark.mm.apm.power.MmPowerCollector;
import com.ss.android.lark.mm.apm.power.MmPowerDataInfo;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.podcast.MmPodcastControl;
import com.ss.android.lark.mm.module.record.MmRecordManager;
import com.ss.android.lark.mm.p2288b.C45852d;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45857i;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.mm.utils.p2335a.AbstractC47095a;
import com.ss.android.lark.mm.utils.p2335a.C47096b;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u00012B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0013J\b\u0010'\u001a\u00020%H\u0002J\u0006\u0010(\u001a\u00020)J\u001c\u0010*\u001a\u00020%2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016J\u000e\u0010.\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0013J\u0006\u0010/\u001a\u00020%J\u0006\u00100\u001a\u00020%J\u000e\u00101\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001e\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001f\u001a\u00020 8BX\u0002¢\u0006\f\n\u0004\b#\u0010\r\u001a\u0004\b!\u0010\"¨\u00063"}, d2 = {"Lcom/ss/android/lark/mm/apm/MmApmAgent;", "Lcom/ss/android/lark/mm/depend/IMmDepend$IContextDepend$IAppLifecycleObserver;", "()V", "DEFAULT_MONITOR_INTERVAL", "", "DEFAULT_POWER_MONITOR_INTERVAL", "SETTING_KEY", "", "cpuCollector", "Lcom/ss/android/lark/mm/apm/cpu/MmCpuCollector;", "getCpuCollector", "()Lcom/ss/android/lark/mm/apm/cpu/MmCpuCollector;", "cpuCollector$delegate", "Lkotlin/Lazy;", "cpuMemoryInterval", "isStarted", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/ss/android/lark/mm/apm/MmApmAgent$IMmApmDataListener;", "memoryCollector", "Lcom/ss/android/lark/mm/apm/memory/MmMemoryCollector;", "getMemoryCollector", "()Lcom/ss/android/lark/mm/apm/memory/MmMemoryCollector;", "memoryCollector$delegate", "powerCollector", "Lcom/ss/android/lark/mm/apm/power/MmPowerCollector;", "getPowerCollector", "()Lcom/ss/android/lark/mm/apm/power/MmPowerCollector;", "powerCollector$delegate", "powerInterval", "timerExecutor", "Lcom/ss/android/lark/mm/utils/timer/MmTimerExecutor;", "getTimerExecutor", "()Lcom/ss/android/lark/mm/utils/timer/MmTimerExecutor;", "timerExecutor$delegate", "addListener", "", "listener", "initPollingTask", "isRecordingOrPodcastMode", "", "onAppLifecycleChanged", "oldState", "Lcom/ss/android/lark/mm/depend/IMmDepend$IContextDepend$AppStateInfo;", "newState", "removeListener", "start", "stop", "triggerCollectNow", "IMmApmDataListener", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.apm.a */
public final class MmApmAgent implements IMmDepend.AbstractC45871b.AbstractC45874c {

    /* renamed from: a */
    public static final MmApmAgent f115638a;

    /* renamed from: b */
    private static int f115639b = 2000;

    /* renamed from: c */
    private static int f115640c = HwBuildEx.VersionCodes.CUR_DEVELOPMENT;

    /* renamed from: d */
    private static final CopyOnWriteArrayList<IMmApmDataListener> f115641d = new CopyOnWriteArrayList<>();

    /* renamed from: e */
    private static final Lazy f115642e = LazyKt.lazy(C45838b.INSTANCE);

    /* renamed from: f */
    private static final Lazy f115643f = LazyKt.lazy(C45843e.INSTANCE);

    /* renamed from: g */
    private static final Lazy f115644g = LazyKt.lazy(C45844f.INSTANCE);

    /* renamed from: h */
    private static final Lazy f115645h = LazyKt.lazy(C45846h.INSTANCE);

    /* renamed from: i */
    private static final AtomicBoolean f115646i = new AtomicBoolean(false);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mm/apm/MmApmAgent$IMmApmDataListener;", "", "onOutputApmData", "", "apmData", "Lcom/ss/android/lark/mm/apm/MmApmDataInfo;", "onOutputPowerData", "powerData", "Lcom/ss/android/lark/mm/apm/power/MmPowerDataInfo;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.apm.a$a */
    public interface IMmApmDataListener {
        /* renamed from: a */
        void mo161111a(MmApmDataInfo bVar);

        /* renamed from: a */
        void mo161112a(MmPowerDataInfo bVar);
    }

    /* renamed from: g */
    private final C47096b m181593g() {
        return (C47096b) f115645h.getValue();
    }

    /* renamed from: a */
    public final MmCpuCollector mo161101a() {
        return (MmCpuCollector) f115642e.getValue();
    }

    /* renamed from: b */
    public final MmMemoryCollector mo161103b() {
        return (MmMemoryCollector) f115643f.getValue();
    }

    /* renamed from: c */
    public final MmPowerCollector mo161105c() {
        return (MmPowerCollector) f115644g.getValue();
    }

    private MmApmAgent() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mm/apm/cpu/MmCpuCollector;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.apm.a$b */
    static final class C45838b extends Lambda implements Function0<MmCpuCollector> {
        public static final C45838b INSTANCE = new C45838b();

        C45838b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MmCpuCollector invoke() {
            return new MmCpuCollector();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mm/apm/memory/MmMemoryCollector;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.apm.a$e */
    static final class C45843e extends Lambda implements Function0<MmMemoryCollector> {
        public static final C45843e INSTANCE = new C45843e();

        C45843e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MmMemoryCollector invoke() {
            return new MmMemoryCollector();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mm/apm/power/MmPowerCollector;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.apm.a$f */
    static final class C45844f extends Lambda implements Function0<MmPowerCollector> {
        public static final C45844f INSTANCE = new C45844f();

        C45844f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MmPowerCollector invoke() {
            return new MmPowerCollector();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mm/utils/timer/MmTimerExecutor;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.apm.a$h */
    static final class C45846h extends Lambda implements Function0<C47096b> {
        public static final C45846h INSTANCE = new C45846h();

        C45846h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C47096b invoke() {
            return new C47096b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.apm.a$g */
    public static final class RunnableC45845g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ IMmApmDataListener f115653a;

        RunnableC45845g(IMmApmDataListener aVar) {
            this.f115653a = aVar;
        }

        public final void run() {
            MmApmAgent aVar = MmApmAgent.f115638a;
            MmApmAgent.f115641d.remove(this.f115653a);
            MmApmAgent aVar2 = MmApmAgent.f115638a;
            if (MmApmAgent.f115641d.isEmpty()) {
                MmApmAgent.f115638a.mo161108e();
            }
        }
    }

    /* renamed from: d */
    public final void mo161107d() {
        if (f115646i.compareAndSet(false, true)) {
            C45855f.m181664c("MmApmAgent", "start");
            m181594h();
        }
    }

    /* renamed from: e */
    public final void mo161108e() {
        if (f115646i.compareAndSet(true, false)) {
            C45855f.m181664c("MmApmAgent", "stop");
            f115641d.clear();
            m181593g().mo165470a();
            IMmDepend a = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
            a.getContextDepend().mo144564b(this);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.apm.a$i */
    public static final class RunnableC45847i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ IMmApmDataListener f115654a;

        RunnableC45847i(IMmApmDataListener aVar) {
            this.f115654a = aVar;
        }

        public final void run() {
            C45855f.m181664c("MmApmAgent", "triggerCollectNow");
            final MmCpuDataInfo a = MmApmAgent.f115638a.mo161101a().mo161119a();
            final MmMemoryDataInfo a2 = MmApmAgent.f115638a.mo161103b().mo161129a();
            final MmPowerDataInfo b = MmApmAgent.f115638a.mo161105c().mo161137b();
            C45855f.m181663b("MmApmAgent", "cpuDataInfo: " + a + ", memoryDataInfo: " + a2 + ", powerDataInfo: " + b);
            C45859k.m181685a(new Runnable(this) {
                /* class com.ss.android.lark.mm.apm.MmApmAgent.RunnableC45847i.RunnableC458481 */

                /* renamed from: a */
                final /* synthetic */ RunnableC45847i f115655a;

                {
                    this.f115655a = r1;
                }

                public final void run() {
                    this.f115655a.f115654a.mo161111a(new MmApmDataInfo(a, a2));
                    this.f115655a.f115654a.mo161112a(b);
                }
            });
        }
    }

    static {
        MmApmAgent aVar = new MmApmAgent();
        f115638a = aVar;
        C45857i.m181676a(RunnableC458371.f115647a);
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        a.getContextDepend().mo144560a(aVar);
    }

    /* renamed from: h */
    private final void m181594h() {
        C45855f.m181664c("MmApmAgent", "initPollingTask, cpuMemoryInterval: " + f115639b + ", powerInterval: " + f115640c);
        C47096b g = m181593g();
        int i = f115639b;
        g.mo165467a("Mm-CpuCollector", i, i, C45839c.f115648a);
        m181593g().mo165477c("Mm-CpuCollector");
        mo161105c().mo161136a();
        C47096b g2 = m181593g();
        int i2 = f115640c;
        g2.mo165467a("Mm-PowerCollector", i2, i2, C45841d.f115651a);
        m181593g().mo165477c("Mm-PowerCollector");
    }

    /* renamed from: f */
    public final boolean mo161109f() {
        boolean z;
        boolean z2;
        C45852d a = C45852d.m181651a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmControl.of()");
        if (a.mo161151b().mo164273c() == MmPodcastControl.DisplayMode.FLOAT_WINDOW) {
            z = true;
        } else {
            z = false;
        }
        String b = MmRecordManager.f117918g.mo164550b();
        if (b == null || !C45852d.m181651a().mo161150a(b).mo164532k()) {
            z2 = false;
        } else {
            z2 = true;
        }
        C45855f.m181664c("MmApmAgent", "[shouldStartMonitorPerformance] isPodcastFloatWindowMode: " + z + ", " + "isRecordingFloatWindowMode: " + z2 + ' ');
        if (z || z2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final synchronized void mo161102a(IMmApmDataListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        CopyOnWriteArrayList<IMmApmDataListener> copyOnWriteArrayList = f115641d;
        if (!copyOnWriteArrayList.contains(aVar)) {
            copyOnWriteArrayList.add(aVar);
            mo161107d();
        }
    }

    /* renamed from: b */
    public final synchronized void mo161104b(IMmApmDataListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        C45859k.m181686a(new RunnableC45845g(aVar), 200);
    }

    /* renamed from: c */
    public final synchronized void mo161106c(IMmApmDataListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        C45857i.m181676a(new RunnableC45847i(aVar));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onTimer"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.apm.a$c */
    public static final class C45839c implements AbstractC47095a {

        /* renamed from: a */
        public static final C45839c f115648a = new C45839c();

        C45839c() {
        }

        @Override // com.ss.android.lark.mm.utils.p2335a.AbstractC47095a
        /* renamed from: a */
        public final void mo161113a(String str, int i) {
            final MmCpuDataInfo a = MmApmAgent.f115638a.mo161101a().mo161119a();
            final MmMemoryDataInfo a2 = MmApmAgent.f115638a.mo161103b().mo161129a();
            C45855f.m181663b("MmApmAgent", "cpuDataInfo: " + a + ", memoryDataInfo: " + a2);
            C45859k.m181685a(new Runnable() {
                /* class com.ss.android.lark.mm.apm.MmApmAgent.C45839c.RunnableC458401 */

                public final void run() {
                    MmApmAgent aVar = MmApmAgent.f115638a;
                    for (IMmApmDataListener aVar2 : MmApmAgent.f115641d) {
                        aVar2.mo161111a(new MmApmDataInfo(a, a2));
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onTimer"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.apm.a$d */
    public static final class C45841d implements AbstractC47095a {

        /* renamed from: a */
        public static final C45841d f115651a = new C45841d();

        C45841d() {
        }

        @Override // com.ss.android.lark.mm.utils.p2335a.AbstractC47095a
        /* renamed from: a */
        public final void mo161113a(String str, int i) {
            final MmPowerDataInfo b = MmApmAgent.f115638a.mo161105c().mo161137b();
            C45855f.m181663b("MmApmAgent", "powerDataInfo: " + b);
            C45859k.m181685a(new Runnable() {
                /* class com.ss.android.lark.mm.apm.MmApmAgent.C45841d.RunnableC458421 */

                public final void run() {
                    MmApmAgent aVar = MmApmAgent.f115638a;
                    for (IMmApmDataListener aVar2 : MmApmAgent.f115641d) {
                        aVar2.mo161112a(b);
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
        boolean z3;
        boolean z4 = false;
        if (aVar == null || !aVar.f115713c || aVar2 == null || aVar2.f115713c) {
            z = false;
        } else {
            z = true;
        }
        if (aVar == null || aVar.f115713c || aVar2 == null || !aVar2.f115713c) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean a = MmRecordManager.f117918g.mo164549a();
        C45852d a2 = C45852d.m181651a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "MmControl.of()");
        boolean h = a2.mo161151b().mo164278h();
        if (!z || (!a && !h)) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z2 || z3) {
            z4 = true;
        }
        if (z4) {
            C45855f.m181663b("MmApmAgent", "switch to  isChangeToFront: " + z2 + ',' + " isChangeToBackGround: " + z + ", " + "isRecording: " + a + ", " + "isPodcastMode: " + h);
            m181593g().mo165479d("Mm-CpuCollector");
            m181593g().mo165479d("Mm-PowerCollector");
        }
    }
}
