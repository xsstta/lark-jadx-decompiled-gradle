package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.C69558af;
import kotlinx.coroutines.internal.ScopeCoroutine;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/UndispatchedCoroutine;", "T", "Lkotlinx/coroutines/internal/ScopeCoroutine;", "context", "Lkotlin/coroutines/CoroutineContext;", "uCont", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "afterResume", "", "state", "", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.cz */
public final class UndispatchedCoroutine<T> extends ScopeCoroutine<T> {
    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.AbstractCoroutine
    /* renamed from: c */
    public void mo242633c(Object obj) {
        Object a = C69584w.m267323a(obj, this.f173864c);
        CoroutineContext context = this.f173864c.getContext();
        Object a2 = C69558af.m266979a(context, null);
        try {
            this.f173864c.resumeWith(a);
            Unit unit = Unit.INSTANCE;
        } finally {
            C69558af.m266980b(context, a2);
        }
    }

    public UndispatchedCoroutine(CoroutineContext fVar, Continuation<? super T> cVar) {
        super(fVar, cVar);
    }
}
