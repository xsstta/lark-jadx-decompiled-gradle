package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\b\u0003\u001a\u0011\u0010\u0000\u001a\u00020\u0004*\u00020\u0005H\u0007¢\u0006\u0002\b\u0003\u001a\n\u0010\u0006\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0007"}, d2 = {"asCoroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/util/concurrent/Executor;", "from", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Ljava/util/concurrent/ExecutorService;", "asExecutor", "kotlinx-coroutines-core"}, mo238835k = 2, mv = {1, 1, 16})
public final class bl {
    /* renamed from: a */
    public static final ExecutorCoroutineDispatcher m266382a(ExecutorService executorService) {
        return new ExecutorCoroutineDispatcherImpl(executorService);
    }

    /* renamed from: a */
    public static final CoroutineDispatcher m266381a(Executor executor) {
        Executor executor2;
        CoroutineDispatcher acVar;
        if (!(executor instanceof DispatcherExecutor)) {
            executor2 = null;
        } else {
            executor2 = executor;
        }
        DispatcherExecutor axVar = (DispatcherExecutor) executor2;
        if (axVar == null || (acVar = axVar.f173429a) == null) {
            return new ExecutorCoroutineDispatcherImpl(executor);
        }
        return acVar;
    }
}
