package io.reactivex.internal.operators.p3462b;

import io.reactivex.AbstractC68273c;
import io.reactivex.AbstractC68293e;
import io.reactivex.AbstractC68990l;
import io.reactivex.AbstractC69009q;
import io.reactivex.AbstractC69015w;
import io.reactivex.exceptions.C68306a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.maybe.C68644f;
import io.reactivex.internal.operators.p3463c.au;
import io.reactivex.internal.p3459a.C68362b;
import java.util.concurrent.Callable;

/* renamed from: io.reactivex.internal.operators.b.h */
final class C68427h {
    /* renamed from: a */
    static <T> boolean m265273a(Object obj, Function<? super T, ? extends AbstractC68293e> function, AbstractC68273c cVar) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        AbstractC68293e eVar = null;
        try {
            Object obj2 = (Object) ((Callable) obj).call();
            if (obj2 != 0) {
                eVar = (AbstractC68293e) C68362b.m265229a(function.apply(obj2), "The mapper returned a null CompletableSource");
            }
            if (eVar == null) {
                EmptyDisposable.complete(cVar);
            } else {
                eVar.mo237885a(cVar);
            }
            return true;
        } catch (Throwable th) {
            C68306a.m265071b(th);
            EmptyDisposable.error(th, cVar);
            return true;
        }
    }

    /* renamed from: b */
    static <T, R> boolean m265275b(Object obj, Function<? super T, ? extends AbstractC69015w<? extends R>> function, AbstractC69009q<? super R> qVar) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        AbstractC69015w wVar = null;
        try {
            Object obj2 = (Object) ((Callable) obj).call();
            if (obj2 != 0) {
                wVar = (AbstractC69015w) C68362b.m265229a(function.apply(obj2), "The mapper returned a null SingleSource");
            }
            if (wVar == null) {
                EmptyDisposable.complete(qVar);
            } else {
                wVar.subscribe(au.m265282a(qVar));
            }
            return true;
        } catch (Throwable th) {
            C68306a.m265071b(th);
            EmptyDisposable.error(th, qVar);
            return true;
        }
    }

    /* renamed from: a */
    static <T, R> boolean m265274a(Object obj, Function<? super T, ? extends AbstractC68990l<? extends R>> function, AbstractC69009q<? super R> qVar) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        AbstractC68990l lVar = null;
        try {
            Object obj2 = (Object) ((Callable) obj).call();
            if (obj2 != 0) {
                lVar = (AbstractC68990l) C68362b.m265229a(function.apply(obj2), "The mapper returned a null MaybeSource");
            }
            if (lVar == null) {
                EmptyDisposable.complete(qVar);
            } else {
                lVar.mo238772a(C68644f.m265355a(qVar));
            }
            return true;
        } catch (Throwable th) {
            C68306a.m265071b(th);
            EmptyDisposable.error(th, qVar);
            return true;
        }
    }
}
