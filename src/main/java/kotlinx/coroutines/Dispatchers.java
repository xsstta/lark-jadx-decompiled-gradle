package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\f8FX\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u00020\u00048\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/Dispatchers;", "", "()V", "Default", "Lkotlinx/coroutines/CoroutineDispatcher;", "Default$annotations", "getDefault", "()Lkotlinx/coroutines/CoroutineDispatcher;", "IO", "IO$annotations", "getIO", "Main", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "Main$annotations", "getMain", "()Lkotlinx/coroutines/MainCoroutineDispatcher;", "Unconfined", "Unconfined$annotations", "getUnconfined", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.ay */
public final class Dispatchers {

    /* renamed from: a */
    public static final Dispatchers f173430a = new Dispatchers();

    /* renamed from: b */
    private static final CoroutineDispatcher f173431b = C69360ab.m266249a();

    /* renamed from: c */
    private static final CoroutineDispatcher f173432c = Unconfined.f173545a;

    /* renamed from: d */
    private static final CoroutineDispatcher f173433d = DefaultScheduler.f173897a.mo243097b();

    private Dispatchers() {
    }

    /* renamed from: a */
    public static final CoroutineDispatcher m266323a() {
        return f173431b;
    }

    /* renamed from: b */
    public static final MainCoroutineDispatcher m266324b() {
        return MainDispatcherLoader.f173857a;
    }

    /* renamed from: c */
    public static final CoroutineDispatcher m266325c() {
        return f173432c;
    }

    /* renamed from: d */
    public static final CoroutineDispatcher m266326d() {
        return f173433d;
    }
}
