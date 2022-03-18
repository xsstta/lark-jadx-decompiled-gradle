package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.TypeCastException;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/ThreadPoolDispatcher;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcherBase;", "nThreads", "", "name", "", "(ILjava/lang/String;)V", "executor", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "threadNo", "Ljava/util/concurrent/atomic/AtomicInteger;", "close", "", "toString", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.cu */
public final class ThreadPoolDispatcher extends ExecutorCoroutineDispatcherBase {

    /* renamed from: a */
    public final AtomicInteger f173539a = new AtomicInteger();

    /* renamed from: e */
    public final int f173540e;

    /* renamed from: f */
    public final String f173541f;

    /* renamed from: g */
    private final Executor f173542g;

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    /* renamed from: a */
    public Executor mo242722a() {
        return this.f173542g;
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, kotlinx.coroutines.ExecutorCoroutineDispatcherBase, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor a = mo242722a();
        if (a != null) {
            ((ExecutorService) a).shutdown();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.util.concurrent.ExecutorService");
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcherBase, kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return "ThreadPoolDispatcher[" + this.f173540e + ", " + this.f173541f + ']';
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/PoolThread;", "target", "Ljava/lang/Runnable;", "kotlin.jvm.PlatformType", "newThread"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.cu$a */
    static final class ThreadFactoryC69386a implements ThreadFactory {

        /* renamed from: a */
        final /* synthetic */ ThreadPoolDispatcher f173543a;

        ThreadFactoryC69386a(ThreadPoolDispatcher cuVar) {
            this.f173543a = cuVar;
        }

        /* renamed from: a */
        public final PoolThread newThread(Runnable runnable) {
            String str;
            ThreadPoolDispatcher cuVar = this.f173543a;
            if (cuVar.f173540e == 1) {
                str = this.f173543a.f173541f;
            } else {
                str = this.f173543a.f173541f + "-" + this.f173543a.f173539a.incrementAndGet();
            }
            return new PoolThread(cuVar, runnable, str);
        }
    }

    public ThreadPoolDispatcher(int i, String str) {
        this.f173540e = i;
        this.f173541f = str;
        this.f173542g = Executors.newScheduledThreadPool(i, new ThreadFactoryC69386a(this));
        mo242725b();
    }
}
