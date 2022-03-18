package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.ArrayQueue;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0004J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J\u0012\u0010\u0016\u001a\u00020\u00132\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0010J\u0010\u0010\u0018\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0004J\b\u0010\u0019\u001a\u00020\nH\u0016J\u0006\u0010\u001a\u001a\u00020\u0004J\b\u0010\u001b\u001a\u00020\u0004H\u0016J\b\u0010\u001c\u001a\u00020\u0013H\u0014R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00048TX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0011\u0010\b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\n8TX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/EventLoop;", "Lkotlinx/coroutines/CoroutineDispatcher;", "()V", "isActive", "", "()Z", "isEmpty", "isUnconfinedLoopActive", "isUnconfinedQueueEmpty", "nextTime", "", "getNextTime", "()J", "shared", "unconfinedQueue", "Lkotlinx/coroutines/internal/ArrayQueue;", "Lkotlinx/coroutines/DispatchedTask;", "useCount", "decrementUseCount", "", "unconfined", "delta", "dispatchUnconfined", "task", "incrementUseCount", "processNextEvent", "processUnconfinedEvent", "shouldBeProcessedFromContext", "shutdown", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.bc */
public abstract class EventLoop extends CoroutineDispatcher {

    /* renamed from: a */
    private long f173437a;

    /* renamed from: d */
    private boolean f173438d;

    /* renamed from: e */
    private ArrayQueue<DispatchedTask<?>> f173439e;

    /* renamed from: c */
    private final long mo242707c(boolean z) {
        return z ? 4294967296L : 1;
    }

    /* renamed from: f */
    public boolean mo242701f() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo242704i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo242698c() {
        return mo242703h();
    }

    /* renamed from: b */
    public long mo242696b() {
        if (!mo242700e()) {
            return Long.MAX_VALUE;
        }
        return 0;
    }

    /* renamed from: g */
    public final boolean mo242702g() {
        if (this.f173437a >= mo242707c(true)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo242703h() {
        ArrayQueue<DispatchedTask<?>> aVar = this.f173439e;
        if (aVar != null) {
            return aVar.mo242960a();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public long mo242699d() {
        ArrayQueue<DispatchedTask<?>> aVar = this.f173439e;
        if (aVar == null || aVar.mo242960a()) {
            return Long.MAX_VALUE;
        }
        return 0;
    }

    /* renamed from: e */
    public final boolean mo242700e() {
        DispatchedTask<?> b;
        ArrayQueue<DispatchedTask<?>> aVar = this.f173439e;
        if (aVar == null || (b = aVar.mo242961b()) == null) {
            return false;
        }
        b.run();
        return true;
    }

    /* renamed from: a */
    public final void mo242694a(DispatchedTask<?> avVar) {
        ArrayQueue<DispatchedTask<?>> aVar = this.f173439e;
        if (aVar == null) {
            aVar = new ArrayQueue<>();
            this.f173439e = aVar;
        }
        aVar.mo242959a(avVar);
    }

    /* renamed from: a */
    public final void mo242695a(boolean z) {
        this.f173437a += mo242707c(z);
        if (!z) {
            this.f173438d = true;
        }
    }

    /* renamed from: b */
    public final void mo242697b(boolean z) {
        boolean z2;
        long c = this.f173437a - mo242707c(z);
        this.f173437a = c;
        if (c <= 0) {
            if (ak.m266269a()) {
                if (this.f173437a == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    throw new AssertionError();
                }
            }
            if (this.f173438d) {
                mo242704i();
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m266330a(EventLoop bcVar, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            bcVar.mo242695a(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    /* renamed from: b */
    public static /* synthetic */ void m266331b(EventLoop bcVar, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            bcVar.mo242697b(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
    }
}
