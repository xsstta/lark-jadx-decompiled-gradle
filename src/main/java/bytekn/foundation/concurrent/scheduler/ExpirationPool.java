package bytekn.foundation.concurrent.scheduler;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0001\u0013B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\r\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\u0005J\u001b\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lbytekn/foundation/concurrent/scheduler/ExpirationPool;", "T", "", "onItemExpired", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "daemon", "Lbytekn/foundation/concurrent/scheduler/ExpirationPool$Daemon;", "queue", "Lbytekn/foundation/concurrent/scheduler/EnhancedDelayQueue;", "acquire", "()Ljava/lang/Object;", "destroy", "release", "item", "timeoutMillis", "", "(Ljava/lang/Object;J)V", "Daemon", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.b.d.g */
public final class ExpirationPool<T> {

    /* renamed from: a */
    private final EnhancedDelayQueue<T> f5748a;

    /* renamed from: b */
    private final Daemon<T> f5749b;

    /* renamed from: a */
    public final T mo8652a() {
        return this.f5748a.mo8642a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\u00020\u0003B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\bH\u0016R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lbytekn/foundation/concurrent/scheduler/ExpirationPool$Daemon;", "T", "", "Ljava/lang/Thread;", "queue", "Lbytekn/foundation/concurrent/scheduler/EnhancedDelayQueue;", "onItemExpired", "Lkotlin/Function1;", "", "(Lbytekn/foundation/concurrent/scheduler/EnhancedDelayQueue;Lkotlin/jvm/functions/Function1;)V", "run", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: bytekn.foundation.b.d.g$a */
    private static final class Daemon<T> extends Thread {

        /* renamed from: a */
        private final EnhancedDelayQueue<T> f5750a;

        /* renamed from: b */
        private final Function1<T, Unit> f5751b;

        public void run() {
            super.run();
            while (!isInterrupted()) {
                try {
                    this.f5751b.invoke(this.f5750a.mo8643b());
                } catch (InterruptedException unused) {
                    interrupt();
                    return;
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super T, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Daemon(EnhancedDelayQueue<T> dVar, Function1<? super T, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(dVar, "queue");
            Intrinsics.checkParameterIsNotNull(function1, "onItemExpired");
            this.f5750a = dVar;
            this.f5751b = function1;
            setDaemon(true);
        }
    }

    public ExpirationPool(Function1<? super T, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "onItemExpired");
        EnhancedDelayQueue<T> dVar = new EnhancedDelayQueue<>();
        this.f5748a = dVar;
        Daemon<T> aVar = new Daemon<>(dVar, function1);
        this.f5749b = aVar;
        aVar.start();
    }
}
