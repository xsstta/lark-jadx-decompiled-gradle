package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.sequences.C69294l;
import kotlinx.coroutines.MainCoroutineDispatcher;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/internal/MainDispatcherLoader;", "", "()V", "FAST_SERVICE_LOADER_ENABLED", "", "dispatcher", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "loadMainDispatcher", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.internal.s */
public final class MainDispatcherLoader {

    /* renamed from: a */
    public static final MainCoroutineDispatcher f173857a;

    /* renamed from: b */
    public static final MainDispatcherLoader f173858b;

    /* renamed from: c */
    private static final boolean f173859c = C69555ac.m266970a("kotlinx.coroutines.fast.service.loader", true);

    private MainDispatcherLoader() {
    }

    static {
        MainDispatcherLoader sVar = new MainDispatcherLoader();
        f173858b = sVar;
        f173857a = sVar.m267104a();
    }

    /* renamed from: a */
    private final MainCoroutineDispatcher m267104a() {
        List<MainDispatcherFactory> list;
        Object obj;
        MainCoroutineDispatcher a;
        try {
            if (f173859c) {
                list = FastServiceLoader.f173830a.mo243001a();
            } else {
                list = C69294l.m266144h(C69294l.m266116a(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator()));
            }
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                obj = null;
            } else {
                obj = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((MainDispatcherFactory) obj).getLoadPriority();
                    do {
                        Object next = it.next();
                        int loadPriority2 = ((MainDispatcherFactory) next).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            obj = next;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) obj;
            if (mainDispatcherFactory == null || (a = C69572t.m267106a(mainDispatcherFactory, list)) == null) {
                return C69572t.m267108a(null, null, 3, null);
            }
            return a;
        } catch (Throwable th) {
            return C69572t.m267108a(th, null, 2, null);
        }
    }
}
