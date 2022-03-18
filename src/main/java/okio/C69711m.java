package okio;

import java.io.IOException;
import javax.annotation.Nullable;

/* renamed from: okio.m */
public final class C69711m {

    /* renamed from: a */
    final long f174144a;

    /* renamed from: b */
    final C69694c f174145b = new C69694c();

    /* renamed from: c */
    boolean f174146c;

    /* renamed from: d */
    boolean f174147d;
    @Nullable

    /* renamed from: e */
    public AbstractC69722t f174148e;

    /* renamed from: f */
    private final AbstractC69722t f174149f = new C69712a();

    /* renamed from: g */
    private final AbstractC69723u f174150g = new C69713b();

    /* renamed from: okio.m$a */
    final class C69712a implements AbstractC69722t {

        /* renamed from: a */
        final C69714n f174151a = new C69714n();

        @Override // okio.AbstractC69722t
        public C69724v timeout() {
            return this.f174151a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
            if (r1 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
            r6.f174151a.mo244602a(r1.timeout());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
            r6.f174151a.mo244601a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x005d, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        @Override // okio.AbstractC69722t, java.io.Closeable, java.lang.AutoCloseable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() throws java.io.IOException {
            /*
                r6 = this;
                okio.m r0 = okio.C69711m.this
                okio.c r0 = r0.f174145b
                monitor-enter(r0)
                okio.m r1 = okio.C69711m.this     // Catch:{ all -> 0x005f }
                boolean r1 = r1.f174146c     // Catch:{ all -> 0x005f }
                if (r1 == 0) goto L_0x000d
                monitor-exit(r0)     // Catch:{ all -> 0x005f }
                return
            L_0x000d:
                okio.m r1 = okio.C69711m.this     // Catch:{ all -> 0x005f }
                okio.t r1 = r1.f174148e     // Catch:{ all -> 0x005f }
                if (r1 == 0) goto L_0x0018
                okio.m r1 = okio.C69711m.this     // Catch:{ all -> 0x005f }
                okio.t r1 = r1.f174148e     // Catch:{ all -> 0x005f }
                goto L_0x0042
            L_0x0018:
                okio.m r1 = okio.C69711m.this     // Catch:{ all -> 0x005f }
                boolean r1 = r1.f174147d     // Catch:{ all -> 0x005f }
                if (r1 == 0) goto L_0x0035
                okio.m r1 = okio.C69711m.this     // Catch:{ all -> 0x005f }
                okio.c r1 = r1.f174145b     // Catch:{ all -> 0x005f }
                long r1 = r1.mo244510a()     // Catch:{ all -> 0x005f }
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 > 0) goto L_0x002d
                goto L_0x0035
            L_0x002d:
                java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x005f }
                java.lang.String r2 = "source is closed"
                r1.<init>(r2)     // Catch:{ all -> 0x005f }
                throw r1     // Catch:{ all -> 0x005f }
            L_0x0035:
                okio.m r1 = okio.C69711m.this     // Catch:{ all -> 0x005f }
                r2 = 1
                r1.f174146c = r2     // Catch:{ all -> 0x005f }
                okio.m r1 = okio.C69711m.this     // Catch:{ all -> 0x005f }
                okio.c r1 = r1.f174145b     // Catch:{ all -> 0x005f }
                r1.notifyAll()     // Catch:{ all -> 0x005f }
                r1 = 0
            L_0x0042:
                monitor-exit(r0)     // Catch:{ all -> 0x005f }
                if (r1 == 0) goto L_0x005e
                okio.n r0 = r6.f174151a
                okio.v r2 = r1.timeout()
                r0.mo244602a(r2)
                r1.close()     // Catch:{ all -> 0x0057 }
                okio.n r0 = r6.f174151a
                r0.mo244601a()
                goto L_0x005e
            L_0x0057:
                r0 = move-exception
                okio.n r1 = r6.f174151a
                r1.mo244601a()
                throw r0
            L_0x005e:
                return
            L_0x005f:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.C69711m.C69712a.close():void");
        }

        @Override // okio.AbstractC69722t, java.io.Flushable
        public void flush() throws IOException {
            AbstractC69722t tVar;
            synchronized (C69711m.this.f174145b) {
                if (C69711m.this.f174146c) {
                    throw new IllegalStateException("closed");
                } else if (C69711m.this.f174148e != null) {
                    tVar = C69711m.this.f174148e;
                } else {
                    if (C69711m.this.f174147d) {
                        if (C69711m.this.f174145b.mo244510a() > 0) {
                            throw new IOException("source is closed");
                        }
                    }
                    tVar = null;
                }
            }
            if (tVar != null) {
                this.f174151a.mo244602a(tVar.timeout());
                try {
                    tVar.flush();
                } finally {
                    this.f174151a.mo244601a();
                }
            }
        }

        C69712a() {
        }

        @Override // okio.AbstractC69722t
        public void write(C69694c cVar, long j) throws IOException {
            AbstractC69722t tVar;
            synchronized (C69711m.this.f174145b) {
                if (!C69711m.this.f174146c) {
                    while (true) {
                        if (j <= 0) {
                            tVar = null;
                            break;
                        } else if (C69711m.this.f174148e != null) {
                            tVar = C69711m.this.f174148e;
                            break;
                        } else if (!C69711m.this.f174147d) {
                            long a = C69711m.this.f174144a - C69711m.this.f174145b.mo244510a();
                            if (a == 0) {
                                this.f174151a.waitUntilNotified(C69711m.this.f174145b);
                            } else {
                                long min = Math.min(a, j);
                                C69711m.this.f174145b.write(cVar, min);
                                j -= min;
                                C69711m.this.f174145b.notifyAll();
                            }
                        } else {
                            throw new IOException("source is closed");
                        }
                    }
                } else {
                    throw new IllegalStateException("closed");
                }
            }
            if (tVar != null) {
                this.f174151a.mo244602a(tVar.timeout());
                try {
                    tVar.write(cVar, j);
                } finally {
                    this.f174151a.mo244601a();
                }
            }
        }
    }

    /* renamed from: okio.m$b */
    final class C69713b implements AbstractC69723u {

        /* renamed from: a */
        final C69724v f174153a = new C69724v();

        @Override // okio.AbstractC69723u
        public C69724v timeout() {
            return this.f174153a;
        }

        @Override // okio.AbstractC69723u, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (C69711m.this.f174145b) {
                C69711m.this.f174147d = true;
                C69711m.this.f174145b.notifyAll();
            }
        }

        C69713b() {
        }

        @Override // okio.AbstractC69723u
        public long read(C69694c cVar, long j) throws IOException {
            synchronized (C69711m.this.f174145b) {
                if (!C69711m.this.f174147d) {
                    while (C69711m.this.f174145b.mo244510a() == 0) {
                        if (C69711m.this.f174146c) {
                            return -1;
                        }
                        this.f174153a.waitUntilNotified(C69711m.this.f174145b);
                    }
                    long read = C69711m.this.f174145b.read(cVar, j);
                    C69711m.this.f174145b.notifyAll();
                    return read;
                }
                throw new IllegalStateException("closed");
            }
        }
    }

    /* renamed from: a */
    public final AbstractC69723u mo244599a() {
        return this.f174150g;
    }

    /* renamed from: b */
    public final AbstractC69722t mo244600b() {
        return this.f174149f;
    }

    public C69711m(long j) {
        if (j >= 1) {
            this.f174144a = j;
            return;
        }
        throw new IllegalArgumentException("maxBufferSize < 1: " + j);
    }
}
