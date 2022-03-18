package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b!\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0017\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\u0002\u0010\u0006J$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\"\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0013H$ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\rH\u0014J\u001e\u0010\u0016\u001a\u00020\r2\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0013ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001b\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Ljava/io/Serializable;", "completion", "(Lkotlin/coroutines/Continuation;)V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "getCompletion", "()Lkotlin/coroutines/Continuation;", "create", "", "value", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "invokeSuspend", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "resumeWith", "(Ljava/lang/Object;)V", "toString", "", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class BaseContinuationImpl implements Serializable, Continuation<Object>, CoroutineStackFrame {
    private final Continuation<Object> completion;

    /* access modifiers changed from: protected */
    public abstract Object invokeSuspend(Object obj);

    /* access modifiers changed from: protected */
    public void releaseIntercepted() {
    }

    public final Continuation<Object> getCompletion() {
        return this.completion;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public StackTraceElement getStackTraceElement() {
        return C69090d.m265841a(this);
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation<Object> cVar = this.completion;
        if (!(cVar instanceof CoroutineStackFrame)) {
            cVar = null;
        }
        return (CoroutineStackFrame) cVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Serializable stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public BaseContinuationImpl(Continuation<Object> cVar) {
        this.completion = cVar;
    }

    public Continuation<Unit> create(Continuation<?> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v2. Raw type applied. Possible types: kotlin.coroutines.c<java.lang.Object>, kotlin.coroutines.c */
    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Continuation cVar = this;
        while (true) {
            BaseContinuationImpl baseContinuationImpl = (BaseContinuationImpl) cVar;
            C69091e.m265846b(baseContinuationImpl);
            Continuation cVar2 = baseContinuationImpl.completion;
            if (cVar2 == null) {
                Intrinsics.throwNpe();
            }
            try {
                Object invokeSuspend = baseContinuationImpl.invokeSuspend(obj);
                if (invokeSuspend != C69086a.m265828a()) {
                    Result.Companion aVar = Result.Companion;
                    obj = Result.m271569constructorimpl(invokeSuspend);
                    baseContinuationImpl.releaseIntercepted();
                    if (cVar2 instanceof BaseContinuationImpl) {
                        cVar = cVar2;
                    } else {
                        cVar2.resumeWith(obj);
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th) {
                Result.Companion aVar2 = Result.Companion;
                obj = Result.m271569constructorimpl(C69097g.m265890a(th));
            }
        }
    }

    public Continuation<Unit> create(Object obj, Continuation<?> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
