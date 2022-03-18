package kotlinx.coroutines.scheduling;

import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.ak;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\b\u0000\u0018\u00002\u00020*B\u0007¢\u0006\u0004\b\u0001\u0010\u0002J!\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\r*\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u001e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030 8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020#8@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020#8@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b'\u0010%¨\u0006)"}, d2 = {"Lkotlinx/coroutines/scheduling/WorkQueue;", "<init>", "()V", "Lkotlinx/coroutines/scheduling/Task;", "task", "", "fair", "add", "(Lkotlinx/coroutines/scheduling/Task;Z)Lkotlinx/coroutines/scheduling/Task;", "addLast", "(Lkotlinx/coroutines/scheduling/Task;)Lkotlinx/coroutines/scheduling/Task;", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "globalQueue", "", "offloadAllWorkTo", "(Lkotlinx/coroutines/scheduling/GlobalQueue;)V", "poll", "()Lkotlinx/coroutines/scheduling/Task;", "pollBuffer", "queue", "pollTo", "(Lkotlinx/coroutines/scheduling/GlobalQueue;)Z", "victim", "", "tryStealBlockingFrom", "(Lkotlinx/coroutines/scheduling/WorkQueue;)J", "tryStealFrom", "blockingOnly", "tryStealLastScheduled", "(Lkotlinx/coroutines/scheduling/WorkQueue;Z)J", "decrementIfBlocking", "(Lkotlinx/coroutines/scheduling/Task;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "buffer", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "", "getBufferSize$kotlinx_coroutines_core", "()I", "bufferSize", "getSize$kotlinx_coroutines_core", "size", "kotlinx-coroutines-core", ""}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.scheduling.m */
public final class WorkQueue {

    /* renamed from: b */
    private static final AtomicReferenceFieldUpdater f173921b = AtomicReferenceFieldUpdater.newUpdater(WorkQueue.class, Object.class, "lastScheduledTask");

    /* renamed from: c */
    private static final AtomicIntegerFieldUpdater f173922c = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "producerIndex");

    /* renamed from: d */
    private static final AtomicIntegerFieldUpdater f173923d = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "consumerIndex");

    /* renamed from: e */
    private static final AtomicIntegerFieldUpdater f173924e = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "blockingTasksInBuffer");

    /* renamed from: a */
    private final AtomicReferenceArray<Task> f173925a = new AtomicReferenceArray<>((int) SmActions.ACTION_ONTHECALL_EXIT);
    private volatile int blockingTasksInBuffer = 0;
    private volatile int consumerIndex = 0;
    private volatile Object lastScheduledTask = null;
    private volatile int producerIndex = 0;

    /* renamed from: a */
    public final int mo243106a() {
        return this.producerIndex - this.consumerIndex;
    }

    /* renamed from: b */
    public final int mo243110b() {
        if (this.lastScheduledTask != null) {
            return mo243106a() + 1;
        }
        return mo243106a();
    }

    /* renamed from: c */
    public final Task mo243112c() {
        Task hVar = (Task) f173921b.getAndSet(this, null);
        if (hVar != null) {
            return hVar;
        }
        return m267250d();
    }

    /* renamed from: d */
    private final Task m267250d() {
        Task andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & SmActions.ACTION_ONTHECALL_ENTRY;
            if (f173923d.compareAndSet(this, i, i + 1) && (andSet = this.f173925a.getAndSet(i2, null)) != null) {
                m267248b(andSet);
                return andSet;
            }
        }
    }

    /* renamed from: b */
    private final boolean m267249b(GlobalQueue dVar) {
        Task d = m267250d();
        if (d == null) {
            return false;
        }
        dVar.mo243034a(d);
        return true;
    }

    /* renamed from: b */
    private final void m267248b(Task hVar) {
        boolean z;
        if (hVar != null) {
            boolean z2 = false;
            if (hVar.f173913g.mo243101c() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int decrementAndGet = f173924e.decrementAndGet(this);
                if (ak.m266269a()) {
                    if (decrementAndGet >= 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        throw new AssertionError();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final Task m267246a(Task hVar) {
        boolean z = true;
        if (hVar.f173913g.mo243101c() != 1) {
            z = false;
        }
        if (z) {
            f173924e.incrementAndGet(this);
        }
        if (mo243106a() == 127) {
            return hVar;
        }
        int i = this.producerIndex & SmActions.ACTION_ONTHECALL_ENTRY;
        while (this.f173925a.get(i) != null) {
            Thread.yield();
        }
        this.f173925a.lazySet(i, hVar);
        f173922c.incrementAndGet(this);
        return null;
    }

    /* renamed from: b */
    public final long mo243111b(WorkQueue mVar) {
        boolean z;
        boolean z2;
        if (ak.m266269a()) {
            if (mo243106a() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                throw new AssertionError();
            }
        }
        int i = mVar.producerIndex;
        AtomicReferenceArray<Task> atomicReferenceArray = mVar.f173925a;
        for (int i2 = mVar.consumerIndex; i2 != i; i2++) {
            int i3 = i2 & SmActions.ACTION_ONTHECALL_ENTRY;
            if (mVar.blockingTasksInBuffer == 0) {
                break;
            }
            Task hVar = atomicReferenceArray.get(i3);
            if (hVar != null) {
                if (hVar.f173913g.mo243101c() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && atomicReferenceArray.compareAndSet(i3, hVar, null)) {
                    f173924e.decrementAndGet(mVar);
                    m267247a(this, hVar, false, 2, null);
                    return -1;
                }
            }
        }
        return m267245a(mVar, true);
    }

    /* renamed from: a */
    public final long mo243107a(WorkQueue mVar) {
        boolean z;
        boolean z2 = true;
        if (ak.m266269a()) {
            if (mo243106a() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new AssertionError();
            }
        }
        Task d = mVar.m267250d();
        if (d == null) {
            return m267245a(mVar, false);
        }
        Task a = m267247a(this, d, false, 2, null);
        if (!ak.m266269a()) {
            return -1;
        }
        if (a != null) {
            z2 = false;
        }
        if (z2) {
            return -1;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public final void mo243109a(GlobalQueue dVar) {
        Task hVar = (Task) f173921b.getAndSet(this, null);
        if (hVar != null) {
            dVar.mo243034a(hVar);
        }
        do {
        } while (m267249b(dVar));
    }

    /* renamed from: a */
    public final Task mo243108a(Task hVar, boolean z) {
        if (z) {
            return m267246a(hVar);
        }
        Task hVar2 = (Task) f173921b.getAndSet(this, hVar);
        if (hVar2 != null) {
            return m267246a(hVar2);
        }
        return null;
    }

    /* renamed from: a */
    private final long m267245a(WorkQueue mVar, boolean z) {
        Task hVar;
        do {
            hVar = (Task) mVar.lastScheduledTask;
            if (hVar == null) {
                return -2;
            }
            if (z) {
                boolean z2 = true;
                if (hVar.f173913g.mo243101c() != 1) {
                    z2 = false;
                }
                if (!z2) {
                    return -2;
                }
            }
            long a = C69577k.f173920f.mo243103a() - hVar.f173912f;
            if (a < C69577k.f173915a) {
                return C69577k.f173915a - a;
            }
        } while (!f173921b.compareAndSet(mVar, hVar, null));
        m267247a(this, hVar, false, 2, null);
        return -1;
    }

    /* renamed from: a */
    public static /* synthetic */ Task m267247a(WorkQueue mVar, Task hVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return mVar.mo243108a(hVar, z);
    }
}
