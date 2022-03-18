package kotlin.coroutines.experimental.jvm.internal;

import com.google.firebase.messaging.Constants;
import com.tt.frontendapiinterface.ApiHandler;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.coroutines.experimental.Continuation;
import kotlin.coroutines.experimental.CoroutineContext;
import kotlin.coroutines.experimental.p3468a.C69079a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\b&\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016J\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016J\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H$J\u0012\u0010\u0019\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00038\u0004@\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u00058\u0004@\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lkotlin/coroutines/experimental/jvm/internal/CoroutineImpl;", "Lkotlin/jvm/internal/Lambda;", "", "Lkotlin/coroutines/experimental/Continuation;", "arity", "", "completion", "(ILkotlin/coroutines/experimental/Continuation;)V", "_context", "Lkotlin/coroutines/experimental/CoroutineContext;", "_facade", "context", "getContext", "()Lkotlin/coroutines/experimental/CoroutineContext;", "facade", "getFacade", "()Lkotlin/coroutines/experimental/Continuation;", "label", "create", "", "value", "doResume", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, ApiHandler.API_CALLBACK_EXCEPTION, "", "resume", "resumeWithException", "kotlin-stdlib-coroutines"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class CoroutineImpl extends Lambda<Object> implements Continuation<Object> {
    private final CoroutineContext _context;
    private Continuation<Object> _facade;
    protected Continuation<Object> completion;
    protected int label;

    /* access modifiers changed from: protected */
    public abstract Object doResume(Object obj, Throwable th);

    @Override // kotlin.coroutines.experimental.Continuation
    public CoroutineContext getContext() {
        CoroutineContext cVar = this._context;
        if (cVar == null) {
            Intrinsics.throwNpe();
        }
        return cVar;
    }

    public final Continuation<Object> getFacade() {
        if (this._facade == null) {
            CoroutineContext cVar = this._context;
            if (cVar == null) {
                Intrinsics.throwNpe();
            }
            this._facade = C69082a.m265818a(cVar, this);
        }
        Continuation<Object> aVar = this._facade;
        if (aVar == null) {
            Intrinsics.throwNpe();
        }
        return aVar;
    }

    public Continuation<Unit> create(Continuation<?> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "completion");
        throw new IllegalStateException("create(Continuation) has not been overridden");
    }

    @Override // kotlin.coroutines.experimental.Continuation
    public void resume(Object obj) {
        Continuation<Object> aVar = this.completion;
        if (aVar == null) {
            Intrinsics.throwNpe();
        }
        try {
            Object doResume = doResume(obj, null);
            if (doResume == C69079a.m265815a()) {
                return;
            }
            if (aVar != null) {
                aVar.resume(doResume);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.experimental.Continuation<kotlin.Any?>");
        } catch (Throwable th) {
            aVar.resumeWithException(th);
        }
    }

    @Override // kotlin.coroutines.experimental.Continuation
    public void resumeWithException(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, ApiHandler.API_CALLBACK_EXCEPTION);
        Continuation<Object> aVar = this.completion;
        if (aVar == null) {
            Intrinsics.throwNpe();
        }
        try {
            Object doResume = doResume(null, th);
            if (doResume == C69079a.m265815a()) {
                return;
            }
            if (aVar != null) {
                aVar.resume(doResume);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.experimental.Continuation<kotlin.Any?>");
        } catch (Throwable th2) {
            aVar.resumeWithException(th2);
        }
    }

    public Continuation<Unit> create(Object obj, Continuation<?> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "completion");
        throw new IllegalStateException("create(Any?;Continuation) has not been overridden");
    }

    public CoroutineImpl(int i, Continuation<Object> aVar) {
        super(i);
        int i2;
        CoroutineContext cVar;
        this.completion = aVar;
        if (aVar != null) {
            i2 = 0;
        } else {
            i2 = -1;
        }
        this.label = i2;
        if (aVar != null) {
            cVar = aVar.getContext();
        } else {
            cVar = null;
        }
        this._context = cVar;
    }
}
