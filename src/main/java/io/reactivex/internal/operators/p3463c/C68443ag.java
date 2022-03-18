package io.reactivex.internal.operators.p3463c;

import io.reactivex.AbstractC69015w;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import org.p3511d.AbstractC70020b;

/* renamed from: io.reactivex.internal.operators.c.ag */
public final class C68443ag {
    /* renamed from: a */
    public static <T> Callable<NoSuchElementException> m265278a() {
        return EnumC68444a.INSTANCE;
    }

    /* renamed from: b */
    public static <T> Function<AbstractC69015w<? extends T>, AbstractC70020b<? extends T>> m265279b() {
        return EnumC68445b.INSTANCE;
    }

    /* renamed from: c */
    public static <T> Function<AbstractC69015w<? extends T>, Observable<? extends T>> m265280c() {
        return EnumC68446c.INSTANCE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.c.ag$a */
    public enum EnumC68444a implements Callable<NoSuchElementException> {
        INSTANCE;

        @Override // java.util.concurrent.Callable
        public NoSuchElementException call() throws Exception {
            return new NoSuchElementException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.c.ag$c */
    public enum EnumC68446c implements Function<AbstractC69015w, Observable> {
        INSTANCE;

        public Observable apply(AbstractC69015w wVar) {
            return new au(wVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.c.ag$b */
    public enum EnumC68445b implements Function<AbstractC69015w, AbstractC70020b> {
        INSTANCE;

        public AbstractC70020b apply(AbstractC69015w wVar) {
            return new C68459at(wVar);
        }
    }
}
