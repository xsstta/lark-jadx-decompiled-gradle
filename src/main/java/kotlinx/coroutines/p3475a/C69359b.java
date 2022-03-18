package kotlinx.coroutines.p3475a;

import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.TypeCastException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69091e;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C69121n;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.ak;
import kotlinx.coroutines.cb;
import kotlinx.coroutines.internal.C69554aa;
import kotlinx.coroutines.internal.C69558af;
import kotlinx.coroutines.internal.ScopeCoroutine;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a9\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\u001a\u0010\u0005\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\b\u001a>\u0010\b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\t\u001aR\u0010\b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u0002*\u001e\b\u0001\u0012\u0004\u0012\u0002H\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b2\u0006\u0010\f\u001a\u0002H\n2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\r\u001a>\u0010\u000e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\t\u001aR\u0010\u000e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u0002*\u001e\b\u0001\u0012\u0004\u0012\u0002H\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b2\u0006\u0010\f\u001a\u0002H\n2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\r\u001aY\u0010\u000f\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u0002H\u00020\u00102\u0006\u0010\f\u001a\u0002H\n2'\u0010\u0005\u001a#\b\u0001\u0012\u0004\u0012\u0002H\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b¢\u0006\u0002\b\u0011H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001aY\u0010\u0013\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u0002H\u00020\u00102\u0006\u0010\f\u001a\u0002H\n2'\u0010\u0005\u001a#\b\u0001\u0012\u0004\u0012\u0002H\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b¢\u0006\u0002\b\u0011H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a?\u0010\u0014\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00062\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0019H\b\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"startDirect", "", "T", "completion", "Lkotlin/coroutines/Continuation;", "block", "Lkotlin/Function1;", "", "startCoroutineUndispatched", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "R", "Lkotlin/Function2;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "startCoroutineUnintercepted", "startUndispatchedOrReturn", "Lkotlinx/coroutines/internal/ScopeCoroutine;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/internal/ScopeCoroutine;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "startUndispatchedOrReturnIgnoreTimeout", "undispatchedResult", "shouldThrow", "", "", "startBlock", "Lkotlin/Function0;", "kotlinx-coroutines-core"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.a.b */
public final class C69359b {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static final <T> void m266244a(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> cVar) {
        Continuation a = C69091e.m265845a(cVar);
        try {
            CoroutineContext context = cVar.getContext();
            Object a2 = C69558af.m266979a(context, null);
            if (function1 != null) {
                try {
                    Object invoke = ((Function1) C69121n.m265985b(function1, 1)).invoke(a);
                    C69558af.m266980b(context, a2);
                    if (invoke != C69086a.m265828a()) {
                        Result.Companion aVar = Result.Companion;
                        a.resumeWith(Result.m271569constructorimpl(invoke));
                    }
                } catch (Throwable th) {
                    C69558af.m266980b(context, a2);
                    throw th;
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            }
        } catch (Throwable th2) {
            Result.Companion aVar2 = Result.Companion;
            a.resumeWith(Result.m271569constructorimpl(C69097g.m265890a(th2)));
        }
    }

    /* renamed from: a */
    public static final <R, T> void m266245a(Function2<? super R, ? super Continuation<? super T>, ? extends Object> kVar, R r, Continuation<? super T> cVar) {
        Continuation a = C69091e.m265845a(cVar);
        if (kVar != null) {
            try {
                Object invoke = ((Function2) C69121n.m265985b(kVar, 2)).invoke(r, a);
                if (invoke != C69086a.m265828a()) {
                    Result.Companion aVar = Result.Companion;
                    a.resumeWith(Result.m271569constructorimpl(invoke));
                }
            } catch (Throwable th) {
                Result.Companion aVar2 = Result.Companion;
                a.resumeWith(Result.m271569constructorimpl(C69097g.m265890a(th)));
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        }
    }

    /* renamed from: a */
    public static final <T, R> Object m266243a(ScopeCoroutine<? super T> xVar, R r, Function2<? super R, ? super Continuation<? super T>, ? extends Object> kVar) {
        Object obj;
        xVar.cF_();
        try {
            ScopeCoroutine<? super T> xVar2 = xVar;
            if (kVar != null) {
                obj = ((Function2) C69121n.m265985b(kVar, 2)).invoke(r, xVar2);
                if (obj == C69086a.m265828a()) {
                    return C69086a.m265828a();
                }
                Object f = xVar.mo242759f(obj);
                if (f == cb.f173477b) {
                    return C69086a.m265828a();
                }
                if (!(f instanceof CompletedExceptionally)) {
                    return cb.m266512b(f);
                }
                CompletedExceptionally vVar = (CompletedExceptionally) f;
                Throwable th = vVar.f173971a;
                Throwable th2 = vVar.f173971a;
                Continuation<T> cVar = xVar.f173864c;
                if (!ak.m266271c()) {
                    throw th2;
                } else if (!(cVar instanceof CoroutineStackFrame)) {
                    throw th2;
                } else {
                    throw C69554aa.m266956a(th2, (CoroutineStackFrame) cVar);
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            }
        } catch (Throwable th3) {
            obj = new CompletedExceptionally(th3, false, 2, null);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public static final <R, T> void m266246b(Function2<? super R, ? super Continuation<? super T>, ? extends Object> kVar, R r, Continuation<? super T> cVar) {
        Continuation a = C69091e.m265845a(cVar);
        try {
            CoroutineContext context = cVar.getContext();
            Object a2 = C69558af.m266979a(context, null);
            if (kVar != null) {
                try {
                    Object invoke = ((Function2) C69121n.m265985b(kVar, 2)).invoke(r, a);
                    C69558af.m266980b(context, a2);
                    if (invoke != C69086a.m265828a()) {
                        Result.Companion aVar = Result.Companion;
                        a.resumeWith(Result.m271569constructorimpl(invoke));
                    }
                } catch (Throwable th) {
                    C69558af.m266980b(context, a2);
                    throw th;
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            }
        } catch (Throwable th2) {
            Result.Companion aVar2 = Result.Companion;
            a.resumeWith(Result.m271569constructorimpl(C69097g.m265890a(th2)));
        }
    }
}
