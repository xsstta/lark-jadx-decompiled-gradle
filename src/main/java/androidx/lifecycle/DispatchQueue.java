package androidx.lifecycle;

import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u0004H\u0003J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tH\u0003J\b\u0010\u000f\u001a\u00020\fH\u0007J\b\u0010\u0010\u001a\u00020\fH\u0007J\b\u0010\u0011\u001a\u00020\fH\u0007J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/lifecycle/DispatchQueue;", "", "()V", "finished", "", "isDraining", "paused", "queue", "Ljava/util/Queue;", "Ljava/lang/Runnable;", "canRun", "drainQueue", "", "enqueue", "runnable", "finish", "pause", "resume", "runOrEnqueue", "lifecycle-runtime-ktx_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: androidx.lifecycle.f */
public final class DispatchQueue {

    /* renamed from: a */
    private boolean f4283a = true;

    /* renamed from: b */
    private boolean f4284b;

    /* renamed from: c */
    private boolean f4285c;

    /* renamed from: d */
    private final Queue<Runnable> f4286d = new ArrayDeque();

    /* renamed from: a */
    public final void mo6024a() {
        this.f4283a = true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "androidx/lifecycle/DispatchQueue$runOrEnqueue$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: androidx.lifecycle.f$a */
    static final class RunnableC1158a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DispatchQueue f4287a;

        /* renamed from: b */
        final /* synthetic */ Runnable f4288b;

        RunnableC1158a(DispatchQueue fVar, Runnable runnable) {
            this.f4287a = fVar;
            this.f4288b = runnable;
        }

        public final void run() {
            this.f4287a.mo6027b(this.f4288b);
        }
    }

    /* renamed from: c */
    public final void mo6028c() {
        this.f4284b = true;
        mo6029d();
    }

    /* renamed from: e */
    private final boolean m5386e() {
        if (this.f4284b || !this.f4283a) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo6026b() {
        if (this.f4283a) {
            if (!this.f4284b) {
                this.f4283a = false;
                mo6029d();
                return;
            }
            throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
        }
    }

    /* renamed from: d */
    public final void mo6029d() {
        if (!this.f4285c) {
            boolean z = false;
            z = true;
            try {
                while (true) {
                    if (!(this.f4286d.isEmpty() ^ z)) {
                        break;
                    } else if (!m5386e()) {
                        break;
                    } else {
                        Runnable poll = this.f4286d.poll();
                        if (poll != null) {
                            poll.run();
                        }
                    }
                }
                this.f4285c = z;
            } finally {
                this.f4285c = z;
            }
        }
    }

    /* renamed from: a */
    public final void mo6025a(Runnable runnable) {
        Intrinsics.checkParameterIsNotNull(runnable, "runnable");
        MainCoroutineDispatcher a = Dispatchers.m266324b().mo242660a();
        if (a.mo242639a(EmptyCoroutineContext.INSTANCE)) {
            a.mo6045a(EmptyCoroutineContext.INSTANCE, new RunnableC1158a(this, runnable));
        } else {
            mo6027b(runnable);
        }
    }

    /* renamed from: b */
    public final void mo6027b(Runnable runnable) {
        if (this.f4286d.offer(runnable)) {
            mo6029d();
            return;
        }
        throw new IllegalStateException("cannot enqueue any more runnables".toString());
    }
}
