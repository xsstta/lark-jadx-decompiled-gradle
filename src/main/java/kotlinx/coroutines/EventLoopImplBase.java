package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.internal.ThreadSafeHeap;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b \u0018\u00002\u0002092\u00020::\u00044567B\u0007¢\u0006\u0004\b\u0001\u0010\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0002J\u0017\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\n\u0010\u000b\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u00032\n\u0010\u000e\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u00112\n\u0010\u000e\u001a\u00060\u0005j\u0002`\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0017\u0010\u0002J\u000f\u0010\u0018\u001a\u00020\u0003H\u0004¢\u0006\u0004\b\u0018\u0010\u0002J\u001d\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u00142\n\u0010\u000b\u001a\u00060\u0005j\u0002`\u0006H\u0004¢\u0006\u0004\b#\u0010$J%\u0010'\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00142\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u001aH\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0003H\u0014¢\u0006\u0004\b+\u0010\u0002R$\u0010-\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00118B@BX\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00118T@\u0014X\u0004¢\u0006\u0006\u001a\u0004\b1\u0010.R\u0016\u00103\u001a\u00020\u00148T@\u0014X\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0016¨\u00068"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase;", "<init>", "()V", "", "closeQueue", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dequeue", "()Ljava/lang/Runnable;", "Lkotlin/coroutines/CoroutineContext;", "context", "block", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "task", "enqueue", "(Ljava/lang/Runnable;)V", "", "enqueueImpl", "(Ljava/lang/Runnable;)Z", "", "processNextEvent", "()J", "rescheduleAllDelayed", "resetAll", "now", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "delayedTask", "schedule", "(JLkotlinx/coroutines/EventLoopImplBase$DelayedTask;)V", "", "scheduleImpl", "(JLkotlinx/coroutines/EventLoopImplBase$DelayedTask;)I", "timeMillis", "Lkotlinx/coroutines/DisposableHandle;", "scheduleInvokeOnTimeout", "(JLjava/lang/Runnable;)Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "scheduleResumeAfterDelay", "(JLkotlinx/coroutines/CancellableContinuation;)V", "shouldUnpark", "(Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;)Z", "shutdown", "value", "isCompleted", "()Z", "setCompleted", "(Z)V", "isEmpty", "getNextTime", "nextTime", "DelayedResumeTask", "DelayedRunnableTask", "DelayedTask", "DelayedTaskQueue", "kotlinx-coroutines-core", "Lkotlinx/coroutines/EventLoopImplPlatform;", "Lkotlinx/coroutines/Delay;"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.bd */
public abstract class EventLoopImplBase extends EventLoopImplPlatform implements Delay {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f173440a = AtomicReferenceFieldUpdater.newUpdater(EventLoopImplBase.class, Object.class, "_queue");

    /* renamed from: d */
    private static final AtomicReferenceFieldUpdater f173441d = AtomicReferenceFieldUpdater.newUpdater(EventLoopImplBase.class, Object.class, "_delayed");
    private volatile Object _delayed;
    private volatile int _isCompleted;
    private volatile Object _queue;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0000H\u0002J\u0006\u0010\u001a\u001a\u00020\u001bJ\u001e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u0007J\b\u0010$\u001a\u00020%H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R0\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f2\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f8V@VX\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "nanoTime", "", "(J)V", "_heap", "", "value", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "heap", "getHeap", "()Lkotlinx/coroutines/internal/ThreadSafeHeap;", "setHeap", "(Lkotlinx/coroutines/internal/ThreadSafeHeap;)V", "index", "", "getIndex", "()I", "setIndex", "(I)V", "compareTo", "other", "dispose", "", "scheduleTask", "now", "delayed", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "eventLoop", "Lkotlinx/coroutines/EventLoopImplBase;", "timeToExecute", "", "toString", "", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.bd$b */
    public static abstract class DelayedTask implements Comparable<DelayedTask>, Runnable, DisposableHandle, ThreadSafeHeapNode {

        /* renamed from: a */
        private Object f173444a;

        /* renamed from: b */
        public long f173445b;

        /* renamed from: c */
        private int f173446c = -1;

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        /* renamed from: c */
        public int mo242718c() {
            return this.f173446c;
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        /* renamed from: b */
        public ThreadSafeHeap<?> mo242717b() {
            Object obj = this.f173444a;
            if (!(obj instanceof ThreadSafeHeap)) {
                obj = null;
            }
            return (ThreadSafeHeap) obj;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f173445b + ']';
        }

        @Override // kotlinx.coroutines.DisposableHandle
        /* renamed from: a */
        public final synchronized void mo242687a() {
            Object obj = this.f173444a;
            if (obj != C69370bg.f173448a) {
                if (!(obj instanceof DelayedTaskQueue)) {
                    obj = null;
                }
                DelayedTaskQueue cVar = (DelayedTaskQueue) obj;
                if (cVar != null) {
                    cVar.mo242969a(this);
                }
                this.f173444a = C69370bg.f173448a;
            }
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        /* renamed from: a */
        public void mo242714a(int i) {
            this.f173446c = i;
        }

        public DelayedTask(long j) {
            this.f173445b = j;
        }

        /* renamed from: a */
        public final boolean mo242716a(long j) {
            if (j - this.f173445b >= 0) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public int compareTo(DelayedTask bVar) {
            int i = ((this.f173445b - bVar.f173445b) > 0 ? 1 : ((this.f173445b - bVar.f173445b) == 0 ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            if (i < 0) {
                return -1;
            }
            return 0;
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        /* renamed from: a */
        public void mo242715a(ThreadSafeHeap<?> agVar) {
            boolean z;
            if (this.f173444a != C69370bg.f173448a) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f173444a = agVar;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: a */
        public final synchronized int mo242712a(long j, DelayedTaskQueue cVar, EventLoopImplBase bdVar) {
            if (this.f173444a == C69370bg.f173448a) {
                return 2;
            }
            DelayedTaskQueue cVar2 = cVar;
            DelayedTask bVar = this;
            synchronized (cVar2) {
                DelayedTask bVar2 = (DelayedTask) cVar2.mo242974e();
                if (bdVar.mo242708j()) {
                    return 1;
                }
                if (bVar2 == null) {
                    cVar.f173447a = j;
                } else {
                    long j2 = bVar2.f173445b;
                    if (j2 - j < 0) {
                        j = j2;
                    }
                    if (j - cVar.f173447a > 0) {
                        cVar.f173447a = j;
                    }
                }
                if (this.f173445b - cVar.f173447a < 0) {
                    this.f173445b = cVar.f173447a;
                }
                cVar2.mo242970b(bVar);
                return 0;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo242708j() {
        /*
            r1 = this;
            int r0 = r1._isCompleted
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.EventLoopImplBase.mo242708j():boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo242709k() {
        this._queue = null;
        this._delayed = null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedResumeTask;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "nanoTime", "", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlinx/coroutines/EventLoopImplBase;JLkotlinx/coroutines/CancellableContinuation;)V", "run", "toString", "", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.bd$a */
    private final class DelayedResumeTask extends DelayedTask {

        /* renamed from: c */
        private final CancellableContinuation<Unit> f173443c;

        public void run() {
            this.f173443c.mo243065a(EventLoopImplBase.this, Unit.INSTANCE);
        }

        @Override // kotlinx.coroutines.EventLoopImplBase.DelayedTask
        public String toString() {
            return super.toString() + this.f173443c.toString();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlinx.coroutines.k<? super kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public DelayedResumeTask(long j, CancellableContinuation<? super Unit> kVar) {
            super(j);
            this.f173443c = kVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.EventLoop
    /* renamed from: i */
    public void mo242704i() {
        ThreadLocalEventLoop.f173537a.mo242861c();
        mo242707c(true);
        m266348n();
        do {
        } while (mo242696b() <= 0);
        m266349o();
    }

    /* renamed from: o */
    private final void m266349o() {
        long j;
        DelayedTask bVar;
        TimeSource a = cx.m266817a();
        if (a != null) {
            j = a.mo242864a();
        } else {
            j = System.nanoTime();
        }
        while (true) {
            DelayedTaskQueue cVar = (DelayedTaskQueue) this._delayed;
            if (cVar != null && (bVar = (DelayedTask) cVar.mo242973d()) != null) {
                mo242720b(j, bVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: m */
    private final Runnable m266347m() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof LockFreeTaskQueueCore) {
                if (obj != null) {
                    LockFreeTaskQueueCore rVar = (LockFreeTaskQueueCore) obj;
                    Object d = rVar.mo243041d();
                    if (d != LockFreeTaskQueueCore.f173848a) {
                        return (Runnable) d;
                    }
                    f173440a.compareAndSet(this, obj, rVar.mo243042e());
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Queue<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> /* = kotlinx.coroutines.internal.LockFreeTaskQueueCore<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> */");
                }
            } else if (obj == C69370bg.f173449b) {
                return null;
            } else {
                if (f173440a.compareAndSet(this, obj, null)) {
                    if (obj != null) {
                        return (Runnable) obj;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                }
            }
        }
    }

    /* renamed from: n */
    private final void m266348n() {
        if (!ak.m266269a() || mo242708j()) {
            while (true) {
                Object obj = this._queue;
                if (obj == null) {
                    if (f173440a.compareAndSet(this, null, C69370bg.f173449b)) {
                        return;
                    }
                } else if (obj instanceof LockFreeTaskQueueCore) {
                    ((LockFreeTaskQueueCore) obj).mo243040c();
                    return;
                } else if (obj != C69370bg.f173449b) {
                    LockFreeTaskQueueCore rVar = new LockFreeTaskQueueCore(8, true);
                    if (obj != null) {
                        rVar.mo243037a((Runnable) obj);
                        if (f173440a.compareAndSet(this, obj, rVar)) {
                            return;
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.EventLoop
    /* renamed from: c */
    public boolean mo242698c() {
        if (!mo242703h()) {
            return false;
        }
        DelayedTaskQueue cVar = (DelayedTaskQueue) this._delayed;
        if (cVar != null && !cVar.mo242971b()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof LockFreeTaskQueueCore) {
                return ((LockFreeTaskQueueCore) obj).mo243038a();
            }
            if (obj == C69370bg.f173449b) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.EventLoop
    /* renamed from: d */
    public long mo242699d() {
        DelayedTask bVar;
        long j;
        if (super.mo242699d() == 0) {
            return 0;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof LockFreeTaskQueueCore) {
                if (!((LockFreeTaskQueueCore) obj).mo243038a()) {
                    return 0;
                }
            } else if (obj == C69370bg.f173449b) {
                return Long.MAX_VALUE;
            } else {
                return 0;
            }
        }
        DelayedTaskQueue cVar = (DelayedTaskQueue) this._delayed;
        if (cVar == null || (bVar = (DelayedTask) cVar.mo242972c()) == null) {
            return Long.MAX_VALUE;
        }
        long j2 = bVar.f173445b;
        TimeSource a = cx.m266817a();
        if (a != null) {
            j = a.mo242864a();
        } else {
            j = System.nanoTime();
        }
        return RangesKt.coerceAtLeast(j2 - j, 0L);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005c  */
    @Override // kotlinx.coroutines.EventLoop
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo242696b() {
        /*
            r10 = this;
            boolean r0 = r10.mo242700e()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.lang.Object r0 = r10._delayed
            kotlinx.coroutines.bd$c r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r0
            if (r0 == 0) goto L_0x0052
            boolean r3 = r0.mo242971b()
            if (r3 != 0) goto L_0x0052
            kotlinx.coroutines.cw r3 = kotlinx.coroutines.cx.m266817a()
            if (r3 == 0) goto L_0x0020
            long r3 = r3.mo242864a()
            goto L_0x0024
        L_0x0020:
            long r3 = java.lang.System.nanoTime()
        L_0x0024:
            r5 = r0
            kotlinx.coroutines.internal.ag r5 = (kotlinx.coroutines.internal.ThreadSafeHeap) r5
            monitor-enter(r5)
            kotlinx.coroutines.internal.ah r6 = r5.mo242974e()     // Catch:{ all -> 0x004f }
            r7 = 0
            if (r6 == 0) goto L_0x0049
            kotlinx.coroutines.bd$b r6 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r6     // Catch:{ all -> 0x004f }
            boolean r8 = r6.mo242716a(r3)     // Catch:{ all -> 0x004f }
            r9 = 0
            if (r8 == 0) goto L_0x003f
            java.lang.Runnable r6 = (java.lang.Runnable) r6     // Catch:{ all -> 0x004f }
            boolean r6 = r10.m266345b(r6)     // Catch:{ all -> 0x004f }
            goto L_0x0040
        L_0x003f:
            r6 = 0
        L_0x0040:
            if (r6 == 0) goto L_0x0047
            kotlinx.coroutines.internal.ah r6 = r5.mo242968a(r9)     // Catch:{ all -> 0x004f }
            r7 = r6
        L_0x0047:
            monitor-exit(r5)
            goto L_0x004a
        L_0x0049:
            monitor-exit(r5)
        L_0x004a:
            kotlinx.coroutines.bd$b r7 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r7
            if (r7 == 0) goto L_0x0052
            goto L_0x0024
        L_0x004f:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0052:
            java.lang.Runnable r0 = r10.m266347m()
            if (r0 == 0) goto L_0x005c
            r0.run()
            return r1
        L_0x005c:
            long r0 = r10.mo242699d()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.EventLoopImplBase.mo242696b():long");
    }

    /* renamed from: c */
    public final void mo242707c(boolean z) {
        this._isCompleted = z ? 1 : 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "timeNow", "", "(J)V", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.bd$c */
    public static final class DelayedTaskQueue extends ThreadSafeHeap<DelayedTask> {

        /* renamed from: a */
        public long f173447a;

        public DelayedTaskQueue(long j) {
            this.f173447a = j;
        }
    }

    /* renamed from: a */
    public final void mo242706a(Runnable runnable) {
        if (m266345b(runnable)) {
            mo242721l();
        } else {
            DefaultExecutor.f173409a.mo242706a(runnable);
        }
    }

    /* renamed from: a */
    private final boolean m266344a(DelayedTask bVar) {
        DelayedTask bVar2;
        DelayedTaskQueue cVar = (DelayedTaskQueue) this._delayed;
        if (cVar != null) {
            bVar2 = (DelayedTask) cVar.mo242972c();
        } else {
            bVar2 = null;
        }
        if (bVar2 == bVar) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final boolean m266345b(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (mo242708j()) {
                return false;
            }
            if (obj == null) {
                if (f173440a.compareAndSet(this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof LockFreeTaskQueueCore) {
                if (obj != null) {
                    LockFreeTaskQueueCore rVar = (LockFreeTaskQueueCore) obj;
                    int a = rVar.mo243037a(runnable);
                    if (a == 0) {
                        return true;
                    }
                    if (a == 1) {
                        f173440a.compareAndSet(this, obj, rVar.mo243042e());
                    } else if (a == 2) {
                        return false;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Queue<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> /* = kotlinx.coroutines.internal.LockFreeTaskQueueCore<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> */");
                }
            } else if (obj == C69370bg.f173449b) {
                return false;
            } else {
                LockFreeTaskQueueCore rVar2 = new LockFreeTaskQueueCore(8, true);
                if (obj != null) {
                    rVar2.mo243037a((Runnable) obj);
                    rVar2.mo243037a(runnable);
                    if (f173440a.compareAndSet(this, obj, rVar2)) {
                        return true;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                }
            }
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: a */
    public final void mo6045a(CoroutineContext fVar, Runnable runnable) {
        mo242706a(runnable);
    }

    /* renamed from: c */
    private final int m266346c(long j, DelayedTask bVar) {
        if (mo242708j()) {
            return 1;
        }
        DelayedTaskQueue cVar = (DelayedTaskQueue) this._delayed;
        if (cVar == null) {
            EventLoopImplBase bdVar = this;
            f173441d.compareAndSet(bdVar, null, new DelayedTaskQueue(j));
            Object obj = bdVar._delayed;
            if (obj == null) {
                Intrinsics.throwNpe();
            }
            cVar = (DelayedTaskQueue) obj;
        }
        return bVar.mo242712a(j, cVar, this);
    }

    /* renamed from: a */
    public final void mo242705a(long j, DelayedTask bVar) {
        int c = m266346c(j, bVar);
        if (c != 0) {
            if (c == 1) {
                mo242720b(j, bVar);
            } else if (c != 2) {
                throw new IllegalStateException("unexpected result".toString());
            }
        } else if (m266344a(bVar)) {
            mo242721l();
        }
    }

    @Override // kotlinx.coroutines.Delay
    /* renamed from: a */
    public void mo242661a(long j, CancellableContinuation<? super Unit> kVar) {
        long j2;
        long a = C69370bg.m266373a(j);
        if (a < 4611686018427387903L) {
            TimeSource a2 = cx.m266817a();
            if (a2 != null) {
                j2 = a2.mo242864a();
            } else {
                j2 = System.nanoTime();
            }
            DelayedResumeTask aVar = new DelayedResumeTask(a + j2, kVar);
            C69575n.m267178a(kVar, aVar);
            mo242705a(j2, aVar);
        }
    }
}
