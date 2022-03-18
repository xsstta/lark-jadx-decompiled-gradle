package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u000b\u0010\u0011\u001a\u00028\u0000¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8TX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\f¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/BlockingCoroutine;", "T", "Lkotlinx/coroutines/AbstractCoroutine;", "parentContext", "Lkotlin/coroutines/CoroutineContext;", "blockedThread", "Ljava/lang/Thread;", "eventLoop", "Lkotlinx/coroutines/EventLoop;", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Thread;Lkotlinx/coroutines/EventLoop;)V", "isScopedCoroutine", "", "()Z", "afterCompletion", "", "state", "", "joinBlocking", "()Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.c */
public final class BlockingCoroutine<T> extends AbstractCoroutine<T> {

    /* renamed from: c */
    private final Thread f173464c;

    /* renamed from: d */
    private final EventLoop f173465d;

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.JobSupport
    public boolean cJ_() {
        return true;
    }

    /* renamed from: h */
    public final T mo242679h() {
        long j;
        TimeSource a = cx.m266817a();
        if (a != null) {
            a.mo242870d();
        }
        try {
            EventLoop bcVar = this.f173465d;
            CompletedExceptionally vVar = null;
            if (bcVar != null) {
                EventLoop.m266330a(bcVar, false, 1, vVar);
            }
            while (!Thread.interrupted()) {
                try {
                    EventLoop bcVar2 = this.f173465d;
                    if (bcVar2 != null) {
                        j = bcVar2.mo242696b();
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (mo242763n()) {
                        T t = (T) cb.m266512b(mo242762m());
                        if (t instanceof CompletedExceptionally) {
                            vVar = t;
                        }
                        CompletedExceptionally vVar2 = vVar;
                        if (vVar2 == null) {
                            return t;
                        }
                        throw vVar2.f173971a;
                    }
                    TimeSource a2 = cx.m266817a();
                    if (a2 != null) {
                        a2.mo242866a(this, j);
                    } else {
                        LockSupport.parkNanos(this, j);
                    }
                } finally {
                    EventLoop bcVar3 = this.f173465d;
                    if (bcVar3 != null) {
                        EventLoop.m266331b(bcVar3, false, 1, vVar);
                    }
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            mo242755d((Throwable) interruptedException);
            throw interruptedException;
        } finally {
            TimeSource a3 = cx.m266817a();
            if (a3 != null) {
                a3.mo242871e();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: d */
    public void mo242678d(Object obj) {
        if (!Intrinsics.areEqual(Thread.currentThread(), this.f173464c)) {
            LockSupport.unpark(this.f173464c);
        }
    }

    public BlockingCoroutine(CoroutineContext fVar, Thread thread, EventLoop bcVar) {
        super(fVar, true);
        this.f173464c = thread;
        this.f173465d = bcVar;
    }
}
