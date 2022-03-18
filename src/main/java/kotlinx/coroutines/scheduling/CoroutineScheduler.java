package kotlinx.coroutines.scheduling;

import com.ss.android.ttvecamera.p3038g.C60375c;
import com.ss.android.vc.statistics.p3180a.C63690d;
import com.ss.android.vesdk.p3188b.C63954b;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.TimeSource;
import kotlinx.coroutines.ak;
import kotlinx.coroutines.al;
import kotlinx.coroutines.cx;
import kotlinx.coroutines.internal.Symbol;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0000\u0018\u0000 \\2\u00020`2\u00020a:\u0003\\]^B+\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0004H\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0004H\b¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001f\u001a\u00020\n2\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0004H\b¢\u0006\u0004\b \u0010\u0011J\u0015\u0010\"\u001a\b\u0018\u00010!R\u00020\u0000H\u0002¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0013H\b¢\u0006\u0004\b$\u0010\u0015J\u0010\u0010%\u001a\u00020\u0001H\b¢\u0006\u0004\b%\u0010\u0017J-\u0010'\u001a\u00020\u00132\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010&\u001a\u00020\f¢\u0006\u0004\b'\u0010(J\u001b\u0010*\u001a\u00020\u00132\n\u0010)\u001a\u00060\u0018j\u0002`\u0019H\u0016¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0004H\b¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0001H\b¢\u0006\u0004\b.\u0010\u0017J\u001b\u00100\u001a\u00020\u00012\n\u0010/\u001a\u00060!R\u00020\u0000H\u0002¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\b\u0018\u00010!R\u00020\u0000H\u0002¢\u0006\u0004\b2\u0010#J\u001b\u00105\u001a\u00020\f2\n\u0010/\u001a\u00060!R\u00020\u0000H\u0000¢\u0006\u0004\b3\u00104J+\u0010:\u001a\u00020\u00132\n\u0010/\u001a\u00060!R\u00020\u00002\u0006\u00106\u001a\u00020\u00012\u0006\u00107\u001a\u00020\u0001H\u0000¢\u0006\u0004\b8\u00109J\u0010\u0010;\u001a\u00020\u0004H\b¢\u0006\u0004\b;\u0010-J\u0015\u0010<\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b<\u0010=J\u0015\u0010?\u001a\u00020\u00132\u0006\u0010>\u001a\u00020\u0004¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020\u00132\u0006\u0010A\u001a\u00020\fH\u0002¢\u0006\u0004\bB\u0010CJ\u000f\u0010E\u001a\u00020\u0013H\u0000¢\u0006\u0004\bD\u0010\u0015J\u000f\u0010F\u001a\u00020\u0006H\u0016¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\fH\b¢\u0006\u0004\bH\u0010IJ\u0019\u0010J\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\fH\u0002¢\u0006\u0004\bL\u0010IJ+\u0010M\u001a\u0004\u0018\u00010\n*\b\u0018\u00010!R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010&\u001a\u00020\fH\u0002¢\u0006\u0004\bM\u0010NR\u0017\u0010\u0010\u001a\u00020\u00018Â\u0002@\u0002X\u0004¢\u0006\u0006\u001a\u0004\bO\u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u00018\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010PR\u0017\u0010 \u001a\u00020\u00018Â\u0002@\u0002X\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010\u0017R\u0016\u0010S\u001a\u00020R8\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010U\u001a\u00020R8\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bU\u0010TR\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010VR\u0013\u0010W\u001a\u00020\f8F@\u0006¢\u0006\u0006\u001a\u0004\bW\u0010IR\u0016\u0010\u0003\u001a\u00020\u00018\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010PR\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010XR\"\u0010Z\u001a\u000e\u0012\n\u0012\b\u0018\u00010!R\u00020\u00000Y8\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bZ\u0010[¨\u0006_"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "", "corePoolSize", "maxPoolSize", "", "idleWorkerKeepAliveNs", "", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "Lkotlinx/coroutines/scheduling/Task;", "task", "", "addToGlobalQueue", "(Lkotlinx/coroutines/scheduling/Task;)Z", "state", "availableCpuPermits", "(J)I", "blockingTasks", "", "close", "()V", "createNewWorker", "()I", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlinx/coroutines/scheduling/TaskContext;", "taskContext", "createTask$kotlinx_coroutines_core", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/TaskContext;)Lkotlinx/coroutines/scheduling/Task;", "createTask", "createdWorkers", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "currentWorker", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "decrementBlockingTasks", "decrementCreatedWorkers", "tailDispatch", "dispatch", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/TaskContext;Z)V", "command", "execute", "(Ljava/lang/Runnable;)V", "incrementBlockingTasks", "()J", "incrementCreatedWorkers", "worker", "parkedWorkersStackNextIndex", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;)I", "parkedWorkersStackPop", "parkedWorkersStackPush$kotlinx_coroutines_core", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;)Z", "parkedWorkersStackPush", "oldIndex", "newIndex", "parkedWorkersStackTopUpdate$kotlinx_coroutines_core", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;II)V", "parkedWorkersStackTopUpdate", "releaseCpuPermit", "runSafely", "(Lkotlinx/coroutines/scheduling/Task;)V", "timeout", "shutdown", "(J)V", "skipUnpark", "signalBlockingWork", "(Z)V", "signalCpuWork$kotlinx_coroutines_core", "signalCpuWork", "toString", "()Ljava/lang/String;", "tryAcquireCpuPermit", "()Z", "tryCreateWorker", "(J)Z", "tryUnpark", "submitToLocalQueue", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;Lkotlinx/coroutines/scheduling/Task;Z)Lkotlinx/coroutines/scheduling/Task;", "getAvailableCpuPermits", "I", "getCreatedWorkers", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "globalBlockingQueue", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "globalCpuQueue", "J", "isTerminated", "Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "workers", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Companion", "Worker", "WorkerState", "kotlinx-coroutines-core", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;"}, mo238835k = 1, mv = {1, 1, 16})
public final class CoroutineScheduler implements Closeable, Executor {

    /* renamed from: d */
    static final AtomicLongFieldUpdater f173876d = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState");

    /* renamed from: i */
    public static final Symbol f173877i = new Symbol("NOT_IN_STACK");

    /* renamed from: j */
    public static final Companion f173878j = new Companion(null);

    /* renamed from: k */
    private static final AtomicLongFieldUpdater f173879k = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack");

    /* renamed from: l */
    private static final AtomicIntegerFieldUpdater f173880l = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated");
    private volatile int _isTerminated;

    /* renamed from: a */
    public final GlobalQueue f173881a;

    /* renamed from: b */
    public final GlobalQueue f173882b;

    /* renamed from: c */
    public final AtomicReferenceArray<Worker> f173883c;
    volatile long controlState;

    /* renamed from: e */
    public final int f173884e;

    /* renamed from: f */
    public final int f173885f;

    /* renamed from: g */
    public final long f173886g;

    /* renamed from: h */
    public final String f173887h;
    private volatile long parkedWorkersStack;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "", "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    public enum WorkerState {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000e8\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Companion;", "", "()V", "BLOCKING_MASK", "", "BLOCKING_SHIFT", "", "CLAIMED", "CPU_PERMITS_MASK", "CPU_PERMITS_SHIFT", "CREATED_MASK", "MAX_SUPPORTED_POOL_SIZE", "MIN_SUPPORTED_POOL_SIZE", "NOT_IN_STACK", "Lkotlinx/coroutines/internal/Symbol;", "PARKED", "PARKED_INDEX_MASK", "PARKED_VERSION_INC", "PARKED_VERSION_MASK", "TERMINATED", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.scheduling.CoroutineScheduler$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0004\u0018\u00002\u00020IB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\tJ\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010\u001dJ\u000f\u0010!\u001a\u00020\u0007H\u0002¢\u0006\u0004\b!\u0010\u001dJ\u000f\u0010\"\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\"\u0010\u0017J\u000f\u0010#\u001a\u00020\u0007H\u0002¢\u0006\u0004\b#\u0010\u001dJ\u0017\u0010(\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u0004\u0018\u00010\u000b2\u0006\u0010)\u001a\u00020\u000fH\u0002¢\u0006\u0004\b*\u0010\u0012J\u000f\u0010+\u001a\u00020\u0007H\u0002¢\u0006\u0004\b+\u0010\u001dR*\u0010,\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00018\u0006@FX\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u0010\tR\u0016\u00102\u001a\u0002018\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u00108R$\u0010:\u001a\u0004\u0018\u0001098\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b@\u0010-R\u0014\u0010D\u001a\u00020A8Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0016\u0010E\u001a\u00020$8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u0002068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bG\u00108¨\u0006H"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "", "index", "<init>", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;I)V", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)V", "taskMode", "", "afterTask", "(I)V", "beforeTask", "Lkotlinx/coroutines/scheduling/Task;", "task", "executeTask", "(Lkotlinx/coroutines/scheduling/Task;)V", "", "scanLocalQueue", "findAnyTask", "(Z)Lkotlinx/coroutines/scheduling/Task;", "findTask", "mode", "idleReset", "inStack", "()Z", "upperBound", "nextInt$kotlinx_coroutines_core", "(I)I", "nextInt", "park", "()V", "pollGlobalQueues", "()Lkotlinx/coroutines/scheduling/Task;", "run", "runWorker", "tryAcquireCpuPermit", "tryPark", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "newState", "tryReleaseCpu$kotlinx_coroutines_core", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;)Z", "tryReleaseCpu", "blockingOnly", "trySteal", "tryTerminateWorker", "indexInArray", "I", "getIndexInArray", "()I", "setIndexInArray", "Lkotlinx/coroutines/scheduling/WorkQueue;", "localQueue", "Lkotlinx/coroutines/scheduling/WorkQueue;", "mayHaveLocalTasks", "Z", "", "minDelayUntilStealableTaskNs", "J", "", "nextParkedWorker", "Ljava/lang/Object;", "getNextParkedWorker", "()Ljava/lang/Object;", "setNextParkedWorker", "(Ljava/lang/Object;)V", "rngState", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "getScheduler", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "scheduler", "state", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "terminationDeadline", "kotlinx-coroutines-core", "Ljava/lang/Thread;"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.scheduling.CoroutineScheduler$b */
    public final class Worker extends Thread {

        /* renamed from: c */
        static final AtomicIntegerFieldUpdater f173888c = AtomicIntegerFieldUpdater.newUpdater(Worker.class, "workerCtl");

        /* renamed from: a */
        public final WorkQueue f173889a;

        /* renamed from: b */
        public WorkerState f173890b;

        /* renamed from: d */
        public boolean f173891d;

        /* renamed from: f */
        private long f173893f;

        /* renamed from: g */
        private long f173894g;

        /* renamed from: h */
        private int f173895h;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        volatile int workerCtl;

        /* renamed from: a */
        public final int mo243089a() {
            return this.indexInArray;
        }

        /* renamed from: b */
        public final Object mo243095b() {
            return this.nextParkedWorker;
        }

        public void run() {
            m267211d();
        }

        /* renamed from: f */
        private final boolean m267215f() {
            if (this.nextParkedWorker != CoroutineScheduler.f173877i) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        private final boolean m267210c() {
            boolean z;
            if (this.f173890b != WorkerState.CPU_ACQUIRED) {
                CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
                while (true) {
                    long j = coroutineScheduler.controlState;
                    if (((int) ((9223367638808264704L & j) >> 42)) != 0) {
                        if (CoroutineScheduler.f173876d.compareAndSet(coroutineScheduler, j, j - 4398046511104L)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    return false;
                }
                this.f173890b = WorkerState.CPU_ACQUIRED;
            }
            return true;
        }

        /* renamed from: g */
        private final void m267216g() {
            if (this.f173893f == 0) {
                this.f173893f = System.nanoTime() + CoroutineScheduler.this.f173886g;
            }
            LockSupport.parkNanos(CoroutineScheduler.this.f173886g);
            if (System.nanoTime() - this.f173893f >= 0) {
                this.f173893f = 0;
                m267217h();
            }
        }

        /* renamed from: i */
        private final Task m267218i() {
            if (mo243094b(2) == 0) {
                Task hVar = (Task) CoroutineScheduler.this.f173881a.mo243036c();
                if (hVar != null) {
                    return hVar;
                }
                return (Task) CoroutineScheduler.this.f173882b.mo243036c();
            }
            Task hVar2 = (Task) CoroutineScheduler.this.f173882b.mo243036c();
            if (hVar2 != null) {
                return hVar2;
            }
            return (Task) CoroutineScheduler.this.f173881a.mo243036c();
        }

        /* renamed from: d */
        private final void m267211d() {
            loop0:
            while (true) {
                boolean z = false;
                while (!CoroutineScheduler.this.mo243084b() && this.f173890b != WorkerState.TERMINATED) {
                    Task a = mo243090a(this.f173891d);
                    if (a != null) {
                        this.f173894g = 0;
                        m267206a(a);
                    } else {
                        this.f173891d = false;
                        if (this.f173894g == 0) {
                            m267213e();
                        } else if (!z) {
                            z = true;
                        } else {
                            mo243093a(WorkerState.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f173894g);
                            this.f173894g = 0;
                        }
                    }
                }
            }
            mo243093a(WorkerState.TERMINATED);
        }

        /* renamed from: e */
        private final void m267213e() {
            boolean z;
            if (!m267215f()) {
                CoroutineScheduler.this.mo243083a(this);
                return;
            }
            if (ak.m266269a()) {
                if (this.f173889a.mo243110b() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    throw new AssertionError();
                }
            }
            this.workerCtl = -1;
            while (m267215f() && !CoroutineScheduler.this.mo243084b() && this.f173890b != WorkerState.TERMINATED) {
                mo243093a(WorkerState.PARKING);
                Thread.interrupted();
                m267216g();
            }
        }

        /* renamed from: h */
        private final void m267217h() {
            synchronized (CoroutineScheduler.this.f173883c) {
                if (!CoroutineScheduler.this.mo243084b()) {
                    if (CoroutineScheduler.this.mo243077a() > CoroutineScheduler.this.f173884e) {
                        if (f173888c.compareAndSet(this, -1, 1)) {
                            int i = this.indexInArray;
                            mo243091a(0);
                            CoroutineScheduler.this.mo243081a(this, i, 0);
                            int andDecrement = (int) (CoroutineScheduler.f173876d.getAndDecrement(CoroutineScheduler.this) & 2097151);
                            if (andDecrement != i) {
                                Worker bVar = CoroutineScheduler.this.f173883c.get(andDecrement);
                                if (bVar == null) {
                                    Intrinsics.throwNpe();
                                }
                                Worker bVar2 = bVar;
                                CoroutineScheduler.this.f173883c.set(i, bVar2);
                                bVar2.mo243091a(i);
                                CoroutineScheduler.this.mo243081a(bVar2, andDecrement, i);
                            }
                            CoroutineScheduler.this.f173883c.set(andDecrement, null);
                            Unit unit = Unit.INSTANCE;
                            this.f173890b = WorkerState.TERMINATED;
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo243092a(Object obj) {
            this.nextParkedWorker = obj;
        }

        /* renamed from: a */
        private final void m267206a(Task hVar) {
            int c = hVar.f173913g.mo243101c();
            m267214e(c);
            m267209c(c);
            CoroutineScheduler.this.mo243082a(hVar);
            m267212d(c);
        }

        /* renamed from: c */
        private final void m267209c(int i) {
            if (i != 0 && mo243093a(WorkerState.BLOCKING)) {
                CoroutineScheduler.this.mo243085c();
            }
        }

        /* renamed from: b */
        public final int mo243094b(int i) {
            int i2 = this.f173895h;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.f173895h = i5;
            int i6 = i - 1;
            if ((i6 & i) == 0) {
                return i5 & i6;
            }
            return (i5 & Integer.MAX_VALUE) % i;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        private Worker() {
            setDaemon(true);
            this.f173889a = new WorkQueue();
            this.f173890b = WorkerState.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = CoroutineScheduler.f173877i;
            this.f173895h = Random.f173148c.mo239191b();
        }

        /* renamed from: b */
        private final Task m267207b(boolean z) {
            boolean z2;
            Task i;
            Task i2;
            if (z) {
                if (mo243094b(CoroutineScheduler.this.f173884e * 2) == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && (i2 = m267218i()) != null) {
                    return i2;
                }
                Task c = this.f173889a.mo243112c();
                if (c != null) {
                    return c;
                }
                if (!z2 && (i = m267218i()) != null) {
                    return i;
                }
            } else {
                Task i3 = m267218i();
                if (i3 != null) {
                    return i3;
                }
            }
            return m267208c(false);
        }

        /* renamed from: d */
        private final void m267212d(int i) {
            boolean z;
            if (i != 0) {
                CoroutineScheduler.f173876d.addAndGet(CoroutineScheduler.this, -2097152);
                WorkerState workerState = this.f173890b;
                if (workerState != WorkerState.TERMINATED) {
                    if (ak.m266269a()) {
                        if (workerState == WorkerState.BLOCKING) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            throw new AssertionError();
                        }
                    }
                    this.f173890b = WorkerState.DORMANT;
                }
            }
        }

        /* renamed from: e */
        private final void m267214e(int i) {
            this.f173893f = 0;
            if (this.f173890b == WorkerState.PARKING) {
                if (ak.m266269a()) {
                    boolean z = true;
                    if (i != 1) {
                        z = false;
                    }
                    if (!z) {
                        throw new AssertionError();
                    }
                }
                this.f173890b = WorkerState.BLOCKING;
            }
        }

        /* renamed from: a */
        public final Task mo243090a(boolean z) {
            Task hVar;
            if (m267210c()) {
                return m267207b(z);
            }
            if (z) {
                hVar = this.f173889a.mo243112c();
                if (hVar == null) {
                    hVar = (Task) CoroutineScheduler.this.f173882b.mo243036c();
                }
            } else {
                hVar = (Task) CoroutineScheduler.this.f173882b.mo243036c();
            }
            if (hVar != null) {
                return hVar;
            }
            return m267208c(true);
        }

        /* renamed from: a */
        public final void mo243091a(int i) {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(CoroutineScheduler.this.f173887h);
            sb.append("-worker-");
            if (i == 0) {
                str = "TERMINATED";
            } else {
                str = String.valueOf(i);
            }
            sb.append(str);
            setName(sb.toString());
            this.indexInArray = i;
        }

        /* renamed from: c */
        private final Task m267208c(boolean z) {
            long j;
            boolean z2;
            boolean z3;
            if (ak.m266269a()) {
                if (this.f173889a.mo243110b() == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    throw new AssertionError();
                }
            }
            int a = CoroutineScheduler.this.mo243077a();
            if (a < 2) {
                return null;
            }
            int b = mo243094b(a);
            long j2 = Long.MAX_VALUE;
            for (int i = 0; i < a; i++) {
                b++;
                if (b > a) {
                    b = 1;
                }
                Worker bVar = CoroutineScheduler.this.f173883c.get(b);
                if (!(bVar == null || bVar == this)) {
                    if (ak.m266269a()) {
                        if (this.f173889a.mo243110b() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            throw new AssertionError();
                        }
                    }
                    if (z) {
                        j = this.f173889a.mo243111b(bVar.f173889a);
                    } else {
                        j = this.f173889a.mo243107a(bVar.f173889a);
                    }
                    if (j == -1) {
                        return this.f173889a.mo243112c();
                    }
                    if (j > 0) {
                        j2 = Math.min(j2, j);
                    }
                }
            }
            if (j2 == Long.MAX_VALUE) {
                j2 = 0;
            }
            this.f173894g = j2;
            return null;
        }

        /* renamed from: a */
        public final boolean mo243093a(WorkerState workerState) {
            boolean z;
            WorkerState workerState2 = this.f173890b;
            if (workerState2 == WorkerState.CPU_ACQUIRED) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                CoroutineScheduler.f173876d.addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.f173890b = workerState;
            }
            return z;
        }

        public Worker(CoroutineScheduler coroutineScheduler, int i) {
            this();
            mo243091a(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo243084b() {
        /*
            r1 = this;
            int r0 = r1._isTerminated
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.mo243084b():boolean");
    }

    /* renamed from: a */
    public final boolean mo243083a(Worker bVar) {
        long j;
        long j2;
        int a;
        if (bVar.mo243095b() != f173877i) {
            return false;
        }
        do {
            j = this.parkedWorkersStack;
            int i = (int) (2097151 & j);
            j2 = (2097152 + j) & -2097152;
            a = bVar.mo243089a();
            if (ak.m266269a()) {
                if (!(a != 0)) {
                    throw new AssertionError();
                }
            }
            bVar.mo243092a(this.f173883c.get(i));
        } while (!f173879k.compareAndSet(this, j, ((long) a) | j2));
        return true;
    }

    /* renamed from: a */
    public final void mo243082a(Task hVar) {
        TimeSource a;
        try {
            hVar.run();
            a = cx.m266817a();
            if (a == null) {
                return;
            }
        } catch (Throwable th) {
            TimeSource a2 = cx.m266817a();
            if (a2 != null) {
                a2.mo242869c();
            }
            throw th;
        }
        a.mo242869c();
    }

    /* renamed from: a */
    public final int mo243077a() {
        return (int) (this.controlState & 2097151);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        mo243079a(10000);
    }

    /* renamed from: e */
    private final boolean m267194e() {
        Worker d;
        do {
            d = m267193d();
            if (d == null) {
                return false;
            }
        } while (!Worker.f173888c.compareAndSet(d, -1, 0));
        LockSupport.unpark(d);
        return true;
    }

    /* renamed from: g */
    private final Worker m267196g() {
        Thread currentThread = Thread.currentThread();
        if (!(currentThread instanceof Worker)) {
            currentThread = null;
        }
        Worker bVar = (Worker) currentThread;
        if (bVar == null || !Intrinsics.areEqual(CoroutineScheduler.this, this)) {
            return null;
        }
        return bVar;
    }

    /* renamed from: c */
    public final void mo243085c() {
        if (!m267194e() && !m267189a(this, 0, 1, null)) {
            m267194e();
        }
    }

    /* renamed from: d */
    private final Worker m267193d() {
        while (true) {
            long j = this.parkedWorkersStack;
            Worker bVar = this.f173883c.get((int) (2097151 & j));
            if (bVar == null) {
                return null;
            }
            long j2 = (2097152 + j) & -2097152;
            int b = m267190b(bVar);
            if (b >= 0 && f173879k.compareAndSet(this, j, ((long) b) | j2)) {
                bVar.mo243092a(f173877i);
                return bVar;
            }
        }
    }

    /* renamed from: f */
    private final int m267195f() {
        boolean z;
        synchronized (this.f173883c) {
            if (mo243084b()) {
                return -1;
            }
            long j = this.controlState;
            int i = (int) (j & 2097151);
            boolean z2 = false;
            int coerceAtLeast = RangesKt.coerceAtLeast(i - ((int) ((j & 4398044413952L) >> 21)), 0);
            if (coerceAtLeast >= this.f173884e) {
                return 0;
            }
            if (i >= this.f173885f) {
                return 0;
            }
            int i2 = ((int) (this.controlState & 2097151)) + 1;
            if (i2 <= 0 || this.f173883c.get(i2) != null) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                Worker bVar = new Worker(this, i2);
                this.f173883c.set(i2, bVar);
                if (i2 == ((int) (2097151 & f173876d.incrementAndGet(this)))) {
                    z2 = true;
                }
                if (z2) {
                    bVar.start();
                    return coerceAtLeast + 1;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int length = this.f173883c.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < length; i6++) {
            Worker bVar = this.f173883c.get(i6);
            if (bVar != null) {
                int b = bVar.f173889a.mo243110b();
                int i7 = C69576a.f173896a[bVar.f173890b.ordinal()];
                if (i7 == 1) {
                    i3++;
                } else if (i7 == 2) {
                    i2++;
                    arrayList.add(String.valueOf(b) + C63954b.f161494a);
                } else if (i7 == 3) {
                    i++;
                    arrayList.add(String.valueOf(b) + C60375c.f150914a);
                } else if (i7 == 4) {
                    i4++;
                    if (b > 0) {
                        arrayList.add(String.valueOf(b) + C63690d.f160779a);
                    }
                } else if (i7 == 5) {
                    i5++;
                }
            }
        }
        long j = this.controlState;
        return this.f173887h + '@' + al.m266273a(this) + '[' + "Pool Size {" + "core = " + this.f173884e + ", " + "max = " + this.f173885f + "}, " + "Worker States {" + "CPU = " + i + ", " + "blocking = " + i2 + ", " + "parked = " + i3 + ", " + "dormant = " + i4 + ", " + "terminated = " + i5 + "}, " + "running workers queues = " + arrayList + ", " + "global CPU queue size = " + this.f173881a.mo243033a() + ", " + "global blocking queue size = " + this.f173882b.mo243033a() + ", " + "Control State {" + "created workers= " + ((int) (2097151 & j)) + ", " + "blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", " + "CPUs acquired = " + (this.f173884e - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }

    public void execute(Runnable runnable) {
        m267187a(this, runnable, null, false, 6, null);
    }

    /* renamed from: b */
    private final int m267190b(Worker bVar) {
        Object b = bVar.mo243095b();
        while (b != f173877i) {
            if (b == null) {
                return 0;
            }
            Worker bVar2 = (Worker) b;
            int a = bVar2.mo243089a();
            if (a != 0) {
                return a;
            }
            b = bVar2.mo243095b();
        }
        return -1;
    }

    /* renamed from: b */
    private final boolean m267191b(long j) {
        if (RangesKt.coerceAtLeast(((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)), 0) < this.f173884e) {
            int f = m267195f();
            if (f == 1 && this.f173884e > 1) {
                m267195f();
            }
            if (f > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private final void m267188a(boolean z) {
        long addAndGet = f173876d.addAndGet(this, 2097152);
        if (!z && !m267194e() && !m267191b(addAndGet)) {
            m267194e();
        }
    }

    /* renamed from: b */
    private final boolean m267192b(Task hVar) {
        boolean z = true;
        if (hVar.f173913g.mo243101c() != 1) {
            z = false;
        }
        if (z) {
            return this.f173882b.mo243034a(hVar);
        }
        return this.f173881a.mo243034a(hVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0072, code lost:
        if (r9 != null) goto L_0x007d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo243079a(long r9) {
        /*
        // Method dump skipped, instructions count: 193
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.mo243079a(long):void");
    }

    /* renamed from: a */
    public final Task mo243078a(Runnable runnable, TaskContext iVar) {
        long a = C69577k.f173920f.mo243103a();
        if (!(runnable instanceof Task)) {
            return new TaskImpl(runnable, a, iVar);
        }
        Task hVar = (Task) runnable;
        hVar.f173912f = a;
        hVar.f173913g = iVar;
        return hVar;
    }

    /* renamed from: a */
    private final Task m267186a(Worker bVar, Task hVar, boolean z) {
        if (bVar == null || bVar.f173890b == WorkerState.TERMINATED) {
            return hVar;
        }
        if (hVar.f173913g.mo243101c() == 0 && bVar.f173890b == WorkerState.BLOCKING) {
            return hVar;
        }
        bVar.f173891d = true;
        return bVar.f173889a.mo243108a(hVar, z);
    }

    /* renamed from: a */
    public final void mo243080a(Runnable runnable, TaskContext iVar, boolean z) {
        boolean z2;
        TimeSource a = cx.m266817a();
        if (a != null) {
            a.mo242868b();
        }
        Task a2 = mo243078a(runnable, iVar);
        Worker g = m267196g();
        Task a3 = m267186a(g, a2, z);
        if (a3 == null || m267192b(a3)) {
            if (!z || g == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (a2.f173913g.mo243101c() != 0) {
                m267188a(z2);
            } else if (!z2) {
                mo243085c();
            }
        } else {
            throw new RejectedExecutionException(this.f173887h + " was terminated");
        }
    }

    /* renamed from: a */
    public final void mo243081a(Worker bVar, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & -2097152;
            if (i3 == i) {
                if (i2 == 0) {
                    i3 = m267190b(bVar);
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0 && f173879k.compareAndSet(this, j, j2 | ((long) i3))) {
                return;
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ boolean m267189a(CoroutineScheduler coroutineScheduler, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = coroutineScheduler.controlState;
        }
        return coroutineScheduler.m267191b(j);
    }

    public CoroutineScheduler(int i, int i2, long j, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        this.f173884e = i;
        this.f173885f = i2;
        this.f173886g = j;
        this.f173887h = str;
        if (i >= 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 <= 2097150) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (j > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        this.f173881a = new GlobalQueue();
                        this.f173882b = new GlobalQueue();
                        this.parkedWorkersStack = 0;
                        this.f173883c = new AtomicReferenceArray<>(i2 + 1);
                        this.controlState = ((long) i) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
    }

    /* renamed from: a */
    public static /* synthetic */ void m267187a(CoroutineScheduler coroutineScheduler, Runnable runnable, TaskContext iVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            iVar = NonBlockingContext.f173910a;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        coroutineScheduler.mo243080a(runnable, iVar, z);
    }
}
