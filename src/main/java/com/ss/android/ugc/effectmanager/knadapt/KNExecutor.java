package com.ss.android.ugc.effectmanager.knadapt;

import bytekn.foundation.concurrent.executor.ExecutorService;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/effectmanager/knadapt/KNExecutor;", "Lbytekn/foundation/concurrent/executor/ExecutorService;", "iExecutor", "Ljava/util/concurrent/Executor;", "(Ljava/util/concurrent/Executor;)V", "execute", "", "command", "Ljava/lang/Runnable;", "shutdown", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.e.c */
public final class KNExecutor implements ExecutorService {

    /* renamed from: a */
    private final Executor f151436a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.effectmanager.e.c$a */
    static final class RunnableC60552a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Runnable f151437a;

        RunnableC60552a(Runnable runnable) {
            this.f151437a = runnable;
        }

        public final void run() {
            Runnable runnable = this.f151437a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public KNExecutor(Executor executor) {
        Intrinsics.checkParameterIsNotNull(executor, "iExecutor");
        this.f151436a = executor;
    }

    public void execute(Runnable runnable) {
        this.f151436a.execute(new RunnableC60552a(runnable));
    }
}
