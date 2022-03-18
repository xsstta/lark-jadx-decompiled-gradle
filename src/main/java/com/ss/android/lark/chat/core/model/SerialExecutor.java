package com.ss.android.lark.chat.core.model;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/chat/core/model/SerialExecutor;", "Lcom/ss/android/lark/chat/core/model/ISerialExecutor;", "delegate", "Ljava/util/concurrent/ExecutorService;", "(Ljava/util/concurrent/ExecutorService;)V", "currentThread", "Ljava/lang/Thread;", "isRunning", "Ljava/util/concurrent/atomic/AtomicBoolean;", "execute", "", "command", "Ljava/lang/Runnable;", "makesureSerial", "shutdown", "im_chat_chat-core_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.core.model.j */
public final class SerialExecutor implements AbstractExecutorC33962g {

    /* renamed from: a */
    public final AtomicBoolean f87555a = new AtomicBoolean(false);

    /* renamed from: b */
    public volatile Thread f87556b;

    /* renamed from: c */
    private final ExecutorService f87557c;

    @Override // com.ss.android.lark.chat.core.model.AbstractExecutorC33962g
    /* renamed from: c */
    public void mo124077c() {
        this.f87557c.shutdown();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.core.model.j$a */
    static final class RunnableC33966a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SerialExecutor f87558a;

        /* renamed from: b */
        final /* synthetic */ Runnable f87559b;

        RunnableC33966a(SerialExecutor jVar, Runnable runnable) {
            this.f87558a = jVar;
            this.f87559b = runnable;
        }

        public final void run() {
            if (this.f87558a.f87555a.compareAndSet(false, true)) {
                this.f87558a.f87556b = Thread.currentThread();
                this.f87559b.run();
                this.f87558a.f87555a.set(false);
                return;
            }
            throw new IllegalStateException("serial thread check failed");
        }
    }

    @Override // com.ss.android.lark.chat.core.model.AbstractExecutorC33962g
    /* renamed from: d */
    public void mo124078d() {
        if (this.f87555a.get() && (!Intrinsics.areEqual(Thread.currentThread(), this.f87556b))) {
            throw new IllegalStateException("serial thread check failed");
        }
    }

    public SerialExecutor(ExecutorService executorService) {
        Intrinsics.checkParameterIsNotNull(executorService, "delegate");
        this.f87557c = executorService;
    }

    public void execute(Runnable runnable) {
        Intrinsics.checkParameterIsNotNull(runnable, "command");
        if (!this.f87557c.isShutdown()) {
            this.f87557c.execute(new RunnableC33966a(this, runnable));
        }
    }
}
