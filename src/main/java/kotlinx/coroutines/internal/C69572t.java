package kotlinx.coroutines.internal;

import java.util.List;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* renamed from: kotlinx.coroutines.internal.t */
public final class C69572t {

    /* renamed from: a */
    private static final boolean f173860a;

    /* renamed from: a */
    public static final Void m267105a() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    /* renamed from: a */
    public static final MainCoroutineDispatcher m267106a(MainDispatcherFactory mainDispatcherFactory, List<? extends MainDispatcherFactory> list) {
        try {
            return mainDispatcherFactory.createDispatcher(list);
        } catch (Throwable th) {
            return m267107a(th, mainDispatcherFactory.hintOnError());
        }
    }

    /* renamed from: a */
    private static final MissingMainCoroutineDispatcher m267107a(Throwable th, String str) {
        if (f173860a) {
            return new MissingMainCoroutineDispatcher(th, str);
        }
        if (th != null) {
            throw th;
        }
        m267105a();
        throw null;
    }

    /* renamed from: a */
    static /* synthetic */ MissingMainCoroutineDispatcher m267108a(Throwable th, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return m267107a(th, str);
    }
}
