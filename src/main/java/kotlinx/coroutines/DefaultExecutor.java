package kotlinx.coroutines;

import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0010H\u0002J\r\u0010\u001e\u001a\u00020\u001cH\u0000¢\u0006\u0002\b\u001fJ\u001c\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\b2\n\u0010#\u001a\u00060\u0002j\u0002`\u0003H\u0016J\b\u0010$\u001a\u00020\u0014H\u0002J\b\u0010%\u001a\u00020\u001cH\u0016J\u000e\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eXT¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0004R\u000e\u0010\u0012\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148BX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00148@X\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00108TX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, d2 = {"Lkotlinx/coroutines/DefaultExecutor;", "Lkotlinx/coroutines/EventLoopImplBase;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "()V", "ACTIVE", "", "DEFAULT_KEEP_ALIVE", "", "FRESH", "KEEP_ALIVE_NANOS", "SHUTDOWN_ACK", "SHUTDOWN_REQ", "THREAD_NAME", "", "_thread", "Ljava/lang/Thread;", "_thread$annotations", "debugStatus", "isShutdownRequested", "", "()Z", "isThreadPresent", "isThreadPresent$kotlinx_coroutines_core", "thread", "getThread", "()Ljava/lang/Thread;", "acknowledgeShutdownIfNeeded", "", "createThreadSync", "ensureStarted", "ensureStarted$kotlinx_coroutines_core", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "block", "notifyStartup", "run", "shutdown", "timeout", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.am */
public final class DefaultExecutor extends EventLoopImplBase implements Runnable {
    private static volatile Thread _thread;

    /* renamed from: a */
    public static final DefaultExecutor f173409a;

    /* renamed from: d */
    private static final long f173410d;
    private static volatile int debugStatus;

    /* renamed from: a */
    public static Thread m266276a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    private DefaultExecutor() {
    }

    /* renamed from: m */
    private final boolean m266277m() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.EventLoopImplPlatform
    /* renamed from: a */
    public Thread mo242655a() {
        Thread thread = _thread;
        if (thread != null) {
            return thread;
        }
        return m266278n();
    }

    /* renamed from: o */
    private final synchronized boolean m266279o() {
        if (m266277m()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    /* renamed from: p */
    private final synchronized void m266280p() {
        if (m266277m()) {
            debugStatus = 3;
            mo242709k();
            notifyAll();
        }
    }

    static {
        Long l;
        DefaultExecutor amVar = new DefaultExecutor();
        f173409a = amVar;
        EventLoop.m266330a(amVar, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f173410d = timeUnit.toNanos(l.longValue());
    }

    /* renamed from: n */
    private final synchronized Thread m266278n() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = m266276a(new Thread(this, "kotlinx.coroutines.DefaultExecutor"));
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    public void run() {
        long j;
        ThreadLocalEventLoop.f173537a.mo242859a(this);
        TimeSource a = cx.m266817a();
        if (a != null) {
            a.mo242870d();
        }
        try {
            if (m266279o()) {
                long j2 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long b = mo242696b();
                    if (b == Long.MAX_VALUE) {
                        TimeSource a2 = cx.m266817a();
                        if (a2 != null) {
                            j = a2.mo242864a();
                        } else {
                            j = System.nanoTime();
                        }
                        if (j2 == Long.MAX_VALUE) {
                            j2 = f173410d + j;
                        }
                        long j3 = j2 - j;
                        if (j3 <= 0) {
                            _thread = null;
                            m266280p();
                            TimeSource a3 = cx.m266817a();
                            if (a3 != null) {
                                a3.mo242871e();
                            }
                            if (!mo242698c()) {
                                mo242655a();
                                return;
                            }
                            return;
                        }
                        b = RangesKt.coerceAtMost(b, j3);
                    } else {
                        j2 = Long.MAX_VALUE;
                    }
                    if (b > 0) {
                        if (m266277m()) {
                            _thread = null;
                            m266280p();
                            TimeSource a4 = cx.m266817a();
                            if (a4 != null) {
                                a4.mo242871e();
                            }
                            if (!mo242698c()) {
                                mo242655a();
                                return;
                            }
                            return;
                        }
                        TimeSource a5 = cx.m266817a();
                        if (a5 != null) {
                            a5.mo242866a(this, b);
                        } else {
                            LockSupport.parkNanos(this, b);
                        }
                    }
                }
            }
        } finally {
            _thread = null;
            m266280p();
            TimeSource a6 = cx.m266817a();
            if (a6 != null) {
                a6.mo242871e();
            }
            if (!mo242698c()) {
                mo242655a();
            }
        }
    }
}
