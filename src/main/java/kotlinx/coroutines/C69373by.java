package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;

/* renamed from: kotlinx.coroutines.by */
public final /* synthetic */ class C69373by {
    /* renamed from: a */
    public static final CompletableJob m266415a(Job btVar) {
        return new JobImpl(btVar);
    }

    /* renamed from: b */
    public static final void m266422b(Job btVar) {
        if (!btVar.mo242631a()) {
            throw btVar.mo242737j();
        }
    }

    /* renamed from: a */
    public static final void m266417a(CoroutineContext fVar) {
        Job btVar = (Job) fVar.get(Job.f173460b);
        if (btVar != null) {
            bw.m266413b(btVar);
            return;
        }
        throw new IllegalStateException(("Context cannot be checked for liveness because it does not have a job: " + fVar).toString());
    }

    /* renamed from: a */
    public static final void m266418a(CoroutineContext fVar, CancellationException cancellationException) {
        Job btVar = (Job) fVar.get(Job.f173460b);
        if (btVar != null) {
            btVar.mo242734a(cancellationException);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ CompletableJob m266416a(Job btVar, int i, Object obj) {
        if ((i & 1) != 0) {
            btVar = null;
        }
        return bw.m266405a(btVar);
    }

    /* renamed from: a */
    public static final void m266420a(Job btVar, String str, Throwable th) {
        btVar.mo242734a(bh.m266374a(str, th));
    }

    /* renamed from: a */
    public static /* synthetic */ void m266419a(CoroutineContext fVar, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        bw.m266408a(fVar, cancellationException);
    }

    /* renamed from: a */
    public static /* synthetic */ void m266421a(Job btVar, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        bw.m266410a(btVar, str, th);
    }
}
