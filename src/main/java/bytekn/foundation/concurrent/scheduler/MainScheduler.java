package bytekn.foundation.concurrent.scheduler;

import android.os.Handler;
import android.os.Looper;
import bytekn.foundation.concurrent.scheduler.Scheduler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lbytekn/foundation/concurrent/scheduler/MainScheduler;", "Lbytekn/foundation/concurrent/scheduler/Scheduler;", "()V", "destroy", "", "newExecutor", "Lbytekn/foundation/concurrent/scheduler/Scheduler$Executor;", "ExecutorImpl", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.b.d.h */
public final class MainScheduler implements Scheduler {
    @Override // bytekn.foundation.concurrent.scheduler.Scheduler
    /* renamed from: a */
    public Scheduler.Executor mo8648a() {
        return new ExecutorImpl();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J*\u0010\t\u001a\u0004\u0018\u0001H\n\"\u0004\b\u0000\u0010\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\n0\fH\b¢\u0006\u0002\u0010\rJ\u001e\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0012H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lbytekn/foundation/concurrent/scheduler/MainScheduler$ExecutorImpl;", "Lbytekn/foundation/concurrent/scheduler/Scheduler$Executor;", "()V", "handler", "Landroid/os/Handler;", "monitor", "", "cancel", "", "executeIfNotRecycled", "T", "block", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "submit", "delayMillis", "", "task", "Lkotlin/Function0;", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: bytekn.foundation.b.d.h$a */
    private static final class ExecutorImpl implements Scheduler.Executor {

        /* renamed from: a */
        public volatile Handler f5752a = new Handler(Looper.getMainLooper());

        /* renamed from: b */
        public final Object f5753b = new Object();

        @Override // bytekn.foundation.concurrent.scheduler.Scheduler.Executor
        /* renamed from: a */
        public void mo8649a(long j, Function0<Unit> function0) {
            Intrinsics.checkParameterIsNotNull(function0, "task");
            if (this.f5752a != null) {
                synchronized (this.f5753b) {
                    Handler handler = this.f5752a;
                    if (handler != null) {
                        Boolean.valueOf(handler.postDelayed(new RunnableC1694i(function0), j));
                    }
                }
            }
        }
    }
}
