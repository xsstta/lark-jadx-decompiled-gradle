package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012\"\u0004\b\u0001\u0010\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0017\u001a\u00020\u00038F@\u0006¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000eR\u0013\u0010\u001b\u001a\u00020\u00188F@\u0006¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "", "E", "", "singleConsumer", "<init>", "(Z)V", "element", "addLast", "(Ljava/lang/Object;)Z", "", "close", "()V", "isClosed", "()Z", "R", "Lkotlin/Function1;", "transform", "", "map", "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "removeFirstOrNull", "()Ljava/lang/Object;", "isEmpty", "", "getSize", "()I", "size", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.internal.q */
public class LockFreeTaskQueue<E> {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f173847a = AtomicReferenceFieldUpdater.newUpdater(LockFreeTaskQueue.class, Object.class, "_cur");
    private volatile Object _cur;

    /* renamed from: a */
    public final int mo243033a() {
        return ((LockFreeTaskQueueCore) this._cur).mo243039b();
    }

    /* renamed from: b */
    public final void mo243035b() {
        while (true) {
            LockFreeTaskQueueCore rVar = (LockFreeTaskQueueCore) this._cur;
            if (!rVar.mo243040c()) {
                f173847a.compareAndSet(this, rVar, rVar.mo243042e());
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final E mo243036c() {
        while (true) {
            LockFreeTaskQueueCore rVar = (LockFreeTaskQueueCore) this._cur;
            E e = (E) rVar.mo243041d();
            if (e != LockFreeTaskQueueCore.f173848a) {
                return e;
            }
            f173847a.compareAndSet(this, rVar, rVar.mo243042e());
        }
    }

    public LockFreeTaskQueue(boolean z) {
        this._cur = new LockFreeTaskQueueCore(8, z);
    }

    /* renamed from: a */
    public final boolean mo243034a(E e) {
        while (true) {
            LockFreeTaskQueueCore rVar = (LockFreeTaskQueueCore) this._cur;
            int a = rVar.mo243037a(e);
            if (a == 0) {
                return true;
            }
            if (a == 1) {
                f173847a.compareAndSet(this, rVar, rVar.mo243042e());
            } else if (a == 2) {
                return false;
            }
        }
    }
}
