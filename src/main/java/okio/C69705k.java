package okio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* renamed from: okio.k */
public final class C69705k {

    /* renamed from: a */
    static final Logger f174136a = Logger.getLogger(C69705k.class.getName());

    private C69705k() {
    }

    /* renamed from: a */
    static boolean m267598a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* renamed from: a */
    public static AbstractC69722t m267591a() {
        return new AbstractC69722t() {
            /* class okio.C69705k.C697083 */

            @Override // okio.AbstractC69722t, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
            }

            @Override // okio.AbstractC69722t, java.io.Flushable
            public void flush() throws IOException {
            }

            @Override // okio.AbstractC69722t
            public C69724v timeout() {
                return C69724v.NONE;
            }

            @Override // okio.AbstractC69722t
            public void write(C69694c cVar, long j) throws IOException {
                cVar.skip(j);
            }
        };
    }

    /* renamed from: a */
    public static AbstractC69698d m267589a(AbstractC69722t tVar) {
        return new C69715o(tVar);
    }

    /* renamed from: c */
    private static C69689a m267601c(final Socket socket) {
        return new C69689a() {
            /* class okio.C69705k.C697094 */

            /* access modifiers changed from: protected */
            @Override // okio.C69689a
            public void timedOut() {
                try {
                    socket.close();
                } catch (Exception e) {
                    Logger logger = C69705k.f174136a;
                    Level level = Level.WARNING;
                    logger.log(level, "Failed to close timed out socket " + socket, (Throwable) e);
                } catch (AssertionError e2) {
                    if (C69705k.m267598a(e2)) {
                        Logger logger2 = C69705k.f174136a;
                        Level level2 = Level.WARNING;
                        logger2.log(level2, "Failed to close timed out socket " + socket, (Throwable) e2);
                        return;
                    }
                    throw e2;
                }
            }

            /* access modifiers changed from: protected */
            @Override // okio.C69689a
            public IOException newTimeoutException(@Nullable IOException iOException) {
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            }
        };
    }

    /* renamed from: a */
    public static AbstractC69699e m267590a(AbstractC69723u uVar) {
        return new C69717p(uVar);
    }

    /* renamed from: b */
    public static AbstractC69722t m267599b(File file) throws FileNotFoundException {
        if (file != null) {
            return m267592a(new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: c */
    public static AbstractC69722t m267602c(File file) throws FileNotFoundException {
        if (file != null) {
            return m267592a(new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: a */
    public static AbstractC69722t m267592a(OutputStream outputStream) {
        return m267593a(outputStream, new C69724v());
    }

    /* renamed from: b */
    public static AbstractC69723u m267600b(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() != null) {
            C69689a c = m267601c(socket);
            return c.source(m267597a(socket.getInputStream(), c));
        } else {
            throw new IOException("socket's input stream == null");
        }
    }

    /* renamed from: a */
    public static AbstractC69722t m267594a(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() != null) {
            C69689a c = m267601c(socket);
            return c.sink(m267593a(socket.getOutputStream(), c));
        } else {
            throw new IOException("socket's output stream == null");
        }
    }

    /* renamed from: a */
    public static AbstractC69723u m267595a(File file) throws FileNotFoundException {
        if (file != null) {
            return m267596a(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: a */
    public static AbstractC69723u m267596a(InputStream inputStream) {
        return m267597a(inputStream, new C69724v());
    }

    /* renamed from: a */
    private static AbstractC69722t m267593a(final OutputStream outputStream, final C69724v vVar) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        } else if (vVar != null) {
            return new AbstractC69722t() {
                /* class okio.C69705k.C697061 */

                @Override // okio.AbstractC69722t
                public C69724v timeout() {
                    return C69724v.this;
                }

                @Override // okio.AbstractC69722t, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    outputStream.close();
                }

                @Override // okio.AbstractC69722t, java.io.Flushable
                public void flush() throws IOException {
                    outputStream.flush();
                }

                public String toString() {
                    return "sink(" + outputStream + ")";
                }

                @Override // okio.AbstractC69722t
                public void write(C69694c cVar, long j) throws IOException {
                    C69727x.m267647a(cVar.f174116b, 0, j);
                    while (j > 0) {
                        C69724v.this.throwIfReached();
                        C69719q qVar = cVar.f174115a;
                        int min = (int) Math.min(j, (long) (qVar.f174169c - qVar.f174168b));
                        outputStream.write(qVar.f174167a, qVar.f174168b, min);
                        qVar.f174168b += min;
                        long j2 = (long) min;
                        j -= j2;
                        cVar.f174116b -= j2;
                        if (qVar.f174168b == qVar.f174169c) {
                            cVar.f174115a = qVar.mo244628c();
                            C69720r.m267639a(qVar);
                        }
                    }
                }
            };
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    /* renamed from: a */
    private static AbstractC69723u m267597a(final InputStream inputStream, final C69724v vVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (vVar != null) {
            return new AbstractC69723u() {
                /* class okio.C69705k.C697072 */

                @Override // okio.AbstractC69723u
                public C69724v timeout() {
                    return C69724v.this;
                }

                @Override // okio.AbstractC69723u, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    inputStream.close();
                }

                public String toString() {
                    return "source(" + inputStream + ")";
                }

                @Override // okio.AbstractC69723u
                public long read(C69694c cVar, long j) throws IOException {
                    int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                    if (i < 0) {
                        throw new IllegalArgumentException("byteCount < 0: " + j);
                    } else if (i == 0) {
                        return 0;
                    } else {
                        try {
                            C69724v.this.throwIfReached();
                            C69719q f = cVar.mo244548f(1);
                            int read = inputStream.read(f.f174167a, f.f174169c, (int) Math.min(j, (long) (8192 - f.f174169c)));
                            if (read == -1) {
                                return -1;
                            }
                            f.f174169c += read;
                            long j2 = (long) read;
                            cVar.f174116b += j2;
                            return j2;
                        } catch (AssertionError e) {
                            if (C69705k.m267598a(e)) {
                                throw new IOException(e);
                            }
                            throw e;
                        }
                    }
                }
            };
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }
}
