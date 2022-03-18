package com.ss.ugc.effectplatform.task;

import bytekn.foundation.collections.SharedMutableMap;
import bytekn.foundation.concurrent.executor.AsyncExecutor;
import bytekn.foundation.concurrent.executor.ExecutorService;
import bytekn.foundation.task.BaseInterceptor;
import bytekn.foundation.task.ITask;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\b\u0003\u0018\u0000 )2\u00020\u0001:\u0002()B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0010JC\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00182%\u0010\u0019\u001a!\u0012\u0017\u0012\u00150\u001bj\u0002`\u001c¢\u0006\f\b\u001d\u0012\b\b\u0013\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00120\u001aJ\u0006\u0010\u001f\u001a\u00020\u0012J\u000e\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\tJ\u000e\u0010\"\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\nJ\u0006\u0010#\u001a\u00020\u0012J\u0016\u0010$\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u0003J\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100'R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/ss/ugc/effectplatform/task/TaskManager;", "", "needShutDown", "", "executor", "Lbytekn/foundation/concurrent/executor/ExecutorService;", "(ZLbytekn/foundation/concurrent/executor/ExecutorService;)V", "executingTask", "Lbytekn/foundation/collections/SharedMutableMap;", "", "Lbytekn/foundation/task/ITask;", "getExecutor", "()Lbytekn/foundation/concurrent/executor/ExecutorService;", "setExecutor", "(Lbytekn/foundation/concurrent/executor/ExecutorService;)V", "interceptions", "Lbytekn/foundation/task/BaseInterceptor;", "addInterception", "", "name", "interceptor", "callInExecutor", "task", "onFinish", "Lkotlin/Function0;", "onException", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lkotlin/ParameterName;", ApiHandler.API_CALLBACK_EXCEPTION, "cancelAllTask", "cancelTask", "taskId", "commit", "destroy", "enableInterception", "isEnable", "getInterceptions", "", "Builder", "Companion", "effect_base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.task.o */
public final class TaskManager {

    /* renamed from: b */
    public static final Companion f165083b = new Companion(null);

    /* renamed from: a */
    public final SharedMutableMap<String, ITask> f165084a;

    /* renamed from: c */
    private final SharedMutableMap<String, BaseInterceptor> f165085c;

    /* renamed from: d */
    private boolean f165086d;

    /* renamed from: e */
    private ExecutorService f165087e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/ugc/effectplatform/task/TaskManager$Companion;", "", "()V", "getDefault", "Lcom/ss/ugc/effectplatform/task/TaskManager;", "effect_base_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.task.o$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/ss/ugc/effectplatform/task/TaskManager$Builder;", "", "()V", "executor", "Lbytekn/foundation/concurrent/executor/ExecutorService;", "getExecutor", "()Lbytekn/foundation/concurrent/executor/ExecutorService;", "setExecutor", "(Lbytekn/foundation/concurrent/executor/ExecutorService;)V", "needShutDown", "", "getNeedShutDown", "()Z", "setNeedShutDown", "(Z)V", "build", "Lcom/ss/ugc/effectplatform/task/TaskManager;", "effect_base_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.task.o$a */
    public static final class Builder {

        /* renamed from: a */
        private boolean f165088a;

        /* renamed from: b */
        private ExecutorService f165089b = new AsyncExecutor();

        /* renamed from: a */
        public final TaskManager mo228294a() {
            return new TaskManager(this.f165088a, this.f165089b, null);
        }

        /* renamed from: a */
        public final Builder mo228293a(ExecutorService bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "executor");
            Builder aVar = this;
            aVar.f165089b = bVar;
            return aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00060\u0001j\u0002`\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/ss/ugc/effectplatform/task/TaskManager$commit$2", "Ljava/lang/Runnable;", "Lbytekn/foundation/concurrent/Runnable;", "run", "", "effect_base_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.task.o$c */
    public static final class RunnableC65546c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TaskManager f165090a;

        /* renamed from: b */
        final /* synthetic */ ITask f165091b;

        public void run() {
            this.f165090a.f165084a.put(this.f165091b.mo8666a(), this.f165091b);
            this.f165091b.mo8667b();
            this.f165090a.f165084a.remove(this.f165091b.mo8666a());
        }

        RunnableC65546c(TaskManager oVar, ITask cVar) {
            this.f165090a = oVar;
            this.f165091b = cVar;
        }
    }

    /* renamed from: a */
    public final void mo228292a(ITask cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "task");
        Iterator<T> it = this.f165085c.values().iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (it.next().mo8665a(cVar)) {
                z = true;
            }
        }
        if (cVar instanceof BaseTask) {
            ((BaseTask) cVar).mo228261h();
        }
        if (!z) {
            this.f165087e.execute(new RunnableC65546c(this, cVar));
        }
    }

    private TaskManager(boolean z, ExecutorService bVar) {
        this.f165086d = z;
        this.f165087e = bVar;
        this.f165085c = new SharedMutableMap<>(false, 1, null);
        this.f165084a = new SharedMutableMap<>(true);
    }

    public /* synthetic */ TaskManager(boolean z, ExecutorService bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, bVar);
    }
}
