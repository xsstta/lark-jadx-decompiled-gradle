package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: kotlinx.coroutines.bt */
public interface Job extends CoroutineContext.Element {

    /* renamed from: b */
    public static final Key f173460b = Key.f173461a;

    /* renamed from: a */
    DisposableHandle mo242732a(boolean z, boolean z2, Function1<? super Throwable, Unit> function1);

    /* renamed from: a */
    ChildHandle mo242733a(ChildJob sVar);

    /* renamed from: a */
    void mo242734a(CancellationException cancellationException);

    /* renamed from: a */
    boolean mo242631a();

    /* renamed from: b */
    Object mo242735b(Continuation<? super Unit> cVar);

    /* renamed from: i */
    boolean mo242736i();

    /* renamed from: j */
    CancellationException mo242737j();

    /* renamed from: k */
    boolean mo242738k();

    /* renamed from: kotlinx.coroutines.bt$b */
    public static final class Key implements CoroutineContext.Key<Job> {

        /* renamed from: a */
        static final /* synthetic */ Key f173461a = new Key();

        private Key() {
        }

        static {
            CoroutineExceptionHandler.Key aVar = CoroutineExceptionHandler.f173393a;
        }
    }

    /* renamed from: kotlinx.coroutines.bt$a */
    public static final class C69372a {
        /* renamed from: a */
        public static <R> R m266396a(Job btVar, R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> kVar) {
            return (R) CoroutineContext.Element.C69085a.m265820a(btVar, r, kVar);
        }

        /* renamed from: a */
        public static <E extends CoroutineContext.Element> E m266397a(Job btVar, CoroutineContext.Key<E> cVar) {
            return (E) CoroutineContext.Element.C69085a.m265821a(btVar, cVar);
        }

        /* renamed from: a */
        public static CoroutineContext m266398a(Job btVar, CoroutineContext fVar) {
            return CoroutineContext.Element.C69085a.m265822a(btVar, fVar);
        }

        /* renamed from: b */
        public static CoroutineContext m266401b(Job btVar, CoroutineContext.Key<?> cVar) {
            return CoroutineContext.Element.C69085a.m265823b(btVar, cVar);
        }

        /* renamed from: a */
        public static /* synthetic */ void m266400a(Job btVar, CancellationException cancellationException, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    cancellationException = null;
                }
                btVar.mo242734a(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        /* renamed from: a */
        public static /* synthetic */ DisposableHandle m266399a(Job btVar, boolean z, boolean z2, Function1 function1, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                if ((i & 2) != 0) {
                    z2 = true;
                }
                return btVar.mo242732a(z, z2, function1);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }
    }
}
