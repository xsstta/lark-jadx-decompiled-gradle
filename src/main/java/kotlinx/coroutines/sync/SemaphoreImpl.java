package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69091e;
import kotlinx.coroutines.C69575n;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\b\u0002\u0018\u00002\u00020\u0019B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00018V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0017\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/sync/SemaphoreImpl;", "", "permits", "acquiredPermits", "<init>", "(II)V", "", "acquire", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "acquireSlowPath", "Lkotlinx/coroutines/CancellableContinuation;", "cont", "", "addAcquireToQueue", "(Lkotlinx/coroutines/CancellableContinuation;)Z", "release", "()V", "tryAcquire", "()Z", "tryResumeNextFromQueue", "getAvailablePermits", "()I", "availablePermits", "I", "kotlinx-coroutines-core", "Lkotlinx/coroutines/sync/Semaphore;"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.sync.f */
public final class SemaphoreImpl implements Semaphore {

    /* renamed from: a */
    static final AtomicIntegerFieldUpdater f173952a = AtomicIntegerFieldUpdater.newUpdater(SemaphoreImpl.class, "_availablePermits");

    /* renamed from: b */
    private static final AtomicReferenceFieldUpdater f173953b = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, "head");

    /* renamed from: c */
    private static final AtomicLongFieldUpdater f173954c = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "deqIdx");

    /* renamed from: d */
    private static final AtomicReferenceFieldUpdater f173955d = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, "tail");

    /* renamed from: e */
    private static final AtomicLongFieldUpdater f173956e = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "enqIdx");
    volatile int _availablePermits;
    private volatile long deqIdx;
    private volatile long enqIdx;

    /* renamed from: f */
    private final int f173957f;
    private volatile Object head;
    private volatile Object tail;

    @Override // kotlinx.coroutines.sync.Semaphore
    /* renamed from: a */
    public void mo243130a() {
        boolean z;
        while (true) {
            int i = this._availablePermits;
            if (i < this.f173957f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (f173952a.compareAndSet(this, i, i + 1) && (i >= 0 || m267300b())) {
                    return;
                }
            } else {
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f173957f).toString());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x006f, code lost:
        continue;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m267300b() {
        /*
        // Method dump skipped, instructions count: 243
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.SemaphoreImpl.m267300b():boolean");
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    /* renamed from: a */
    public Object mo243129a(Continuation<? super Unit> cVar) {
        if (f173952a.getAndDecrement(this) > 0) {
            return Unit.INSTANCE;
        }
        Object b = mo243132b(cVar);
        if (b == C69086a.m265828a()) {
            return b;
        }
        return Unit.INSTANCE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ Object mo243132b(Continuation<? super Unit> cVar) {
        CancellableContinuationImpl a = C69575n.m267177a(C69086a.m265825a(cVar));
        CancellableContinuationImpl lVar = a;
        while (true) {
            if (!mo243131a((CancellableContinuation<? super Unit>) lVar)) {
                if (f173952a.getAndDecrement(this) > 0) {
                    Unit unit = Unit.INSTANCE;
                    Result.Companion aVar = Result.Companion;
                    lVar.resumeWith(Result.m271569constructorimpl(unit));
                    break;
                }
            } else {
                break;
            }
        }
        Object g = a.mo243073g();
        if (g == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        return g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0073, code lost:
        continue;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo243131a(kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> r18) {
        /*
        // Method dump skipped, instructions count: 261
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.SemaphoreImpl.mo243131a(kotlinx.coroutines.k):boolean");
    }

    public SemaphoreImpl(int i, int i2) {
        boolean z;
        this.f173957f = i;
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if ((i2 < 0 || i < i2) ? false : z2) {
                SemaphoreSegment hVar = new SemaphoreSegment(0, null, 2);
                this.head = hVar;
                this.tail = hVar;
                this._availablePermits = i - i2;
                return;
            }
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i).toString());
        }
        throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i).toString());
    }
}
