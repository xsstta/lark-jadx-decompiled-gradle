package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* renamed from: okio.a */
public class C69689a extends C69724v {
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    @Nullable
    static C69689a head;
    private boolean inQueue;
    @Nullable
    private C69689a next;
    private long timeoutAt;

    /* access modifiers changed from: protected */
    public void timedOut() {
    }

    /* access modifiers changed from: private */
    /* renamed from: okio.a$a */
    public static final class C69692a extends Thread {
        C69692a() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0015, code lost:
            r1.timedOut();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<okio.a> r0 = okio.C69689a.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                okio.a r1 = okio.C69689a.awaitTimeout()     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                goto L_0x0000
            L_0x000b:
                okio.a r2 = okio.C69689a.head     // Catch:{ all -> 0x0019 }
                if (r1 != r2) goto L_0x0014
                r1 = 0
                okio.C69689a.head = r1     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                return
            L_0x0014:
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                r1.timedOut()
                goto L_0x0000
            L_0x0019:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.C69689a.C69692a.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void enter() {
        if (!this.inQueue) {
            long timeoutNanos = timeoutNanos();
            boolean hasDeadline = hasDeadline();
            if (timeoutNanos != 0 || hasDeadline) {
                this.inQueue = true;
                scheduleTimeout(this, timeoutNanos, hasDeadline);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    public final boolean exit() {
        if (!this.inQueue) {
            return false;
        }
        this.inQueue = false;
        return cancelScheduledTimeout(this);
    }

    @Nullable
    static C69689a awaitTimeout() throws InterruptedException {
        C69689a aVar = head.next;
        if (aVar == null) {
            long nanoTime = System.nanoTime();
            C69689a.class.wait(IDLE_TIMEOUT_MILLIS);
            if (head.next != null || System.nanoTime() - nanoTime < IDLE_TIMEOUT_NANOS) {
                return null;
            }
            return head;
        }
        long remainingNanos = aVar.remainingNanos(System.nanoTime());
        if (remainingNanos > 0) {
            long j = remainingNanos / 1000000;
            C69689a.class.wait(j, (int) (remainingNanos - (1000000 * j)));
            return null;
        }
        head.next = aVar.next;
        aVar.next = null;
        return aVar;
    }

    private long remainingNanos(long j) {
        return this.timeoutAt - j;
    }

    public final AbstractC69722t sink(final AbstractC69722t tVar) {
        return new AbstractC69722t() {
            /* class okio.C69689a.C696901 */

            @Override // okio.AbstractC69722t
            public C69724v timeout() {
                return C69689a.this;
            }

            public String toString() {
                return "AsyncTimeout.sink(" + tVar + ")";
            }

            @Override // okio.AbstractC69722t, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                C69689a.this.enter();
                try {
                    tVar.close();
                    C69689a.this.exit(true);
                } catch (IOException e) {
                    throw C69689a.this.exit(e);
                } catch (Throwable th) {
                    C69689a.this.exit(false);
                    throw th;
                }
            }

            @Override // okio.AbstractC69722t, java.io.Flushable
            public void flush() throws IOException {
                C69689a.this.enter();
                try {
                    tVar.flush();
                    C69689a.this.exit(true);
                } catch (IOException e) {
                    throw C69689a.this.exit(e);
                } catch (Throwable th) {
                    C69689a.this.exit(false);
                    throw th;
                }
            }

            @Override // okio.AbstractC69722t
            public void write(C69694c cVar, long j) throws IOException {
                C69727x.m267647a(cVar.f174116b, 0, j);
                while (true) {
                    long j2 = 0;
                    if (j > 0) {
                        C69719q qVar = cVar.f174115a;
                        while (true) {
                            if (j2 >= 65536) {
                                break;
                            }
                            j2 += (long) (qVar.f174169c - qVar.f174168b);
                            if (j2 >= j) {
                                j2 = j;
                                break;
                            }
                            qVar = qVar.f174172f;
                        }
                        C69689a.this.enter();
                        try {
                            tVar.write(cVar, j2);
                            j -= j2;
                            C69689a.this.exit(true);
                        } catch (IOException e) {
                            throw C69689a.this.exit(e);
                        } catch (Throwable th) {
                            C69689a.this.exit(false);
                            throw th;
                        }
                    } else {
                        return;
                    }
                }
            }
        };
    }

    public final AbstractC69723u source(final AbstractC69723u uVar) {
        return new AbstractC69723u() {
            /* class okio.C69689a.C696912 */

            @Override // okio.AbstractC69723u
            public C69724v timeout() {
                return C69689a.this;
            }

            public String toString() {
                return "AsyncTimeout.source(" + uVar + ")";
            }

            @Override // okio.AbstractC69723u, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                C69689a.this.enter();
                try {
                    uVar.close();
                    C69689a.this.exit(true);
                } catch (IOException e) {
                    throw C69689a.this.exit(e);
                } catch (Throwable th) {
                    C69689a.this.exit(false);
                    throw th;
                }
            }

            @Override // okio.AbstractC69723u
            public long read(C69694c cVar, long j) throws IOException {
                C69689a.this.enter();
                try {
                    long read = uVar.read(cVar, j);
                    C69689a.this.exit(true);
                    return read;
                } catch (IOException e) {
                    throw C69689a.this.exit(e);
                } catch (Throwable th) {
                    C69689a.this.exit(false);
                    throw th;
                }
            }
        };
    }

    /* access modifiers changed from: package-private */
    public final IOException exit(IOException iOException) throws IOException {
        if (!exit()) {
            return iOException;
        }
        return newTimeoutException(iOException);
    }

    /* access modifiers changed from: protected */
    public IOException newTimeoutException(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    private static synchronized boolean cancelScheduledTimeout(C69689a aVar) {
        synchronized (C69689a.class) {
            C69689a aVar2 = head;
            while (aVar2 != null) {
                C69689a aVar3 = aVar2.next;
                if (aVar3 == aVar) {
                    aVar2.next = aVar.next;
                    aVar.next = null;
                    return false;
                }
                aVar2 = aVar3;
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void exit(boolean z) throws IOException {
        if (exit() && z) {
            throw newTimeoutException(null);
        }
    }

    private static synchronized void scheduleTimeout(C69689a aVar, long j, boolean z) {
        synchronized (C69689a.class) {
            if (head == null) {
                head = new C69689a();
                new C69692a().start();
            }
            long nanoTime = System.nanoTime();
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i != 0 && z) {
                aVar.timeoutAt = Math.min(j, aVar.deadlineNanoTime() - nanoTime) + nanoTime;
            } else if (i != 0) {
                aVar.timeoutAt = j + nanoTime;
            } else if (z) {
                aVar.timeoutAt = aVar.deadlineNanoTime();
            } else {
                throw new AssertionError();
            }
            long remainingNanos = aVar.remainingNanos(nanoTime);
            C69689a aVar2 = head;
            while (true) {
                C69689a aVar3 = aVar2.next;
                if (aVar3 == null) {
                    break;
                } else if (remainingNanos < aVar3.remainingNanos(nanoTime)) {
                    break;
                } else {
                    aVar2 = aVar2.next;
                }
            }
            aVar.next = aVar2.next;
            aVar2.next = aVar;
            if (aVar2 == head) {
                C69689a.class.notify();
            }
        }
    }
}
