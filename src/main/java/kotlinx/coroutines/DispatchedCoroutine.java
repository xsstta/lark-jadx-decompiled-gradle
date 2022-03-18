package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C69086a;
import kotlinx.coroutines.internal.ScopeCoroutine;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0015B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/DispatchedCoroutine;", "T", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/coroutines/Continuation;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "", "state", "", "afterCompletion", "(Ljava/lang/Object;)V", "afterResume", "getResult", "()Ljava/lang/Object;", "", "tryResume", "()Z", "trySuspend", "kotlinx-coroutines-core", "Lkotlinx/coroutines/internal/ScopeCoroutine;"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.au */
public final class DispatchedCoroutine<T> extends ScopeCoroutine<T> {

    /* renamed from: d */
    private static final AtomicIntegerFieldUpdater f173427d = AtomicIntegerFieldUpdater.newUpdater(DispatchedCoroutine.class, "_decision");
    private volatile int _decision;

    /* renamed from: h */
    public final Object mo242679h() {
        if (m266307r()) {
            return C69086a.m265828a();
        }
        Object b = cb.m266512b(mo242762m());
        if (!(b instanceof CompletedExceptionally)) {
            return b;
        }
        throw ((CompletedExceptionally) b).f173971a;
    }

    /* renamed from: r */
    private final boolean m266307r() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f173427d.compareAndSet(this, 0, 1));
        return true;
    }

    /* renamed from: s */
    private final boolean m266308s() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f173427d.compareAndSet(this, 0, 2));
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.internal.ScopeCoroutine
    /* renamed from: d */
    public void mo242678d(Object obj) {
        mo242633c(obj);
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.AbstractCoroutine
    /* renamed from: c */
    public void mo242633c(Object obj) {
        if (!m266308s()) {
            C69369at.m266305a(C69086a.m265825a(this.f173864c), C69584w.m267323a(obj, this.f173864c));
        }
    }

    public DispatchedCoroutine(CoroutineContext fVar, Continuation<? super T> cVar) {
        super(fVar, cVar);
    }
}
