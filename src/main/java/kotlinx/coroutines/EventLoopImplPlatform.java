package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlinx.coroutines.EventLoopImplBase;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0004J\b\u0010\r\u001a\u00020\bH\u0004R\u0012\u0010\u0003\u001a\u00020\u0004X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/EventLoopImplPlatform;", "Lkotlinx/coroutines/EventLoop;", "()V", "thread", "Ljava/lang/Thread;", "getThread", "()Ljava/lang/Thread;", "reschedule", "", "now", "", "delayedTask", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "unpark", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.be */
public abstract class EventLoopImplPlatform extends EventLoop {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Thread mo242655a();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo242721l() {
        Thread a = mo242655a();
        if (Thread.currentThread() != a) {
            TimeSource a2 = cx.m266817a();
            if (a2 != null) {
                a2.mo242867a(a);
            } else {
                LockSupport.unpark(a);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo242720b(long j, EventLoopImplBase.DelayedTask bVar) {
        boolean z;
        if (ak.m266269a()) {
            if (this != DefaultExecutor.f173409a) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new AssertionError();
            }
        }
        DefaultExecutor.f173409a.mo242705a(j, bVar);
    }
}
