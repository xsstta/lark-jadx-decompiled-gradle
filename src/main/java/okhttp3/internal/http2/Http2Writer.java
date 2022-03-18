package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import okio.AbstractC69698d;
import okio.C69694c;

/* access modifiers changed from: package-private */
public final class Http2Writer implements Closeable {
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final C69694c hpackBuffer;
    final Hpack.Writer hpackWriter;
    private int maxFrameSize = 16384;
    private final AbstractC69698d sink;

    public int maxDataLength() {
        return this.maxFrameSize;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.closed = true;
        this.sink.close();
    }

    public synchronized void flush() throws IOException {
        if (!this.closed) {
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void connectionPreface() throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        } else if (this.client) {
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine(Util.format(">> CONNECTION %s", Http2.CONNECTION_PREFACE.hex()));
            }
            this.sink.mo244533b(Http2.CONNECTION_PREFACE.toByteArray());
            this.sink.flush();
        }
    }

    public synchronized void applyAndAckSettings(Settings settings) throws IOException {
        if (!this.closed) {
            this.maxFrameSize = settings.getMaxFrameSize(this.maxFrameSize);
            if (settings.getHeaderTableSize() != -1) {
                this.hpackWriter.setHeaderTableSizeSetting(settings.getHeaderTableSize());
            }
            frameHeader(0, 0, (byte) 4, (byte) 1);
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void settings(Settings settings) throws IOException {
        int i;
        if (!this.closed) {
            frameHeader(0, settings.size() * 6, (byte) 4, (byte) 0);
            for (int i2 = 0; i2 < 10; i2++) {
                if (settings.isSet(i2)) {
                    if (i2 == 4) {
                        i = 3;
                    } else if (i2 == 7) {
                        i = 4;
                    } else {
                        i = i2;
                    }
                    this.sink.mo244561j(i);
                    this.sink.mo244557i(settings.get(i2));
                }
            }
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    Http2Writer(AbstractC69698d dVar, boolean z) {
        this.sink = dVar;
        this.client = z;
        C69694c cVar = new C69694c();
        this.hpackBuffer = cVar;
        this.hpackWriter = new Hpack.Writer(cVar);
    }

    private static void writeMedium(AbstractC69698d dVar, int i) throws IOException {
        dVar.mo244562k((i >>> 16) & 255);
        dVar.mo244562k((i >>> 8) & 255);
        dVar.mo244562k(i & 255);
    }

    public synchronized void headers(int i, List<Header> list) throws IOException {
        if (!this.closed) {
            headers(false, i, list);
        } else {
            throw new IOException("closed");
        }
    }

    private void writeContinuationFrames(int i, long j) throws IOException {
        byte b;
        while (j > 0) {
            int min = (int) Math.min((long) this.maxFrameSize, j);
            long j2 = (long) min;
            j -= j2;
            if (j == 0) {
                b = 4;
            } else {
                b = 0;
            }
            frameHeader(i, min, (byte) 9, b);
            this.sink.write(this.hpackBuffer, j2);
        }
    }

    public synchronized void rstStream(int i, ErrorCode errorCode) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        } else if (errorCode.httpCode != -1) {
            frameHeader(i, 4, (byte) 3, (byte) 0);
            this.sink.mo244557i(errorCode.httpCode);
            this.sink.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public synchronized void windowUpdate(int i, long j) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        } else if (j == 0 || j > 2147483647L) {
            throw Http2.illegalArgument("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        } else {
            frameHeader(i, 4, (byte) 8, (byte) 0);
            this.sink.mo244557i((int) j);
            this.sink.flush();
        }
    }

    public synchronized void synReply(boolean z, int i, List<Header> list) throws IOException {
        if (!this.closed) {
            headers(z, i, list);
        } else {
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: package-private */
    public void headers(boolean z, int i, List<Header> list) throws IOException {
        byte b;
        if (!this.closed) {
            this.hpackWriter.writeHeaders(list);
            long a = this.hpackBuffer.mo244510a();
            int min = (int) Math.min((long) this.maxFrameSize, a);
            long j = (long) min;
            int i2 = (a > j ? 1 : (a == j ? 0 : -1));
            if (i2 == 0) {
                b = 4;
            } else {
                b = 0;
            }
            if (z) {
                b = (byte) (b | 1);
            }
            frameHeader(i, min, (byte) 1, b);
            this.sink.write(this.hpackBuffer, j);
            if (i2 > 0) {
                writeContinuationFrames(i, a - j);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    public synchronized void ping(boolean z, int i, int i2) throws IOException {
        byte b;
        if (!this.closed) {
            if (z) {
                b = 1;
            } else {
                b = 0;
            }
            frameHeader(0, 8, (byte) 6, b);
            this.sink.mo244557i(i);
            this.sink.mo244557i(i2);
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void goAway(int i, ErrorCode errorCode, byte[] bArr) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        } else if (errorCode.httpCode != -1) {
            frameHeader(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.sink.mo244557i(i);
            this.sink.mo244557i(errorCode.httpCode);
            if (bArr.length > 0) {
                this.sink.mo244533b(bArr);
            }
            this.sink.flush();
        } else {
            throw Http2.illegalArgument("errorCode.httpCode == -1", new Object[0]);
        }
    }

    public synchronized void pushPromise(int i, int i2, List<Header> list) throws IOException {
        byte b;
        if (!this.closed) {
            this.hpackWriter.writeHeaders(list);
            long a = this.hpackBuffer.mo244510a();
            int min = (int) Math.min((long) (this.maxFrameSize - 4), a);
            long j = (long) min;
            int i3 = (a > j ? 1 : (a == j ? 0 : -1));
            if (i3 == 0) {
                b = 4;
            } else {
                b = 0;
            }
            frameHeader(i, min + 4, (byte) 5, b);
            this.sink.mo244557i(i2 & Integer.MAX_VALUE);
            this.sink.write(this.hpackBuffer, j);
            if (i3 > 0) {
                writeContinuationFrames(i, a - j);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: package-private */
    public void dataFrame(int i, byte b, C69694c cVar, int i2) throws IOException {
        frameHeader(i, i2, (byte) 0, b);
        if (i2 > 0) {
            this.sink.write(cVar, (long) i2);
        }
    }

    public synchronized void data(boolean z, int i, C69694c cVar, int i2) throws IOException {
        if (!this.closed) {
            byte b = 0;
            if (z) {
                b = (byte) 1;
            }
            dataFrame(i, b, cVar, i2);
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void synStream(boolean z, int i, int i2, List<Header> list) throws IOException {
        if (!this.closed) {
            headers(z, i, list);
        } else {
            throw new IOException("closed");
        }
    }

    public void frameHeader(int i, int i2, byte b, byte b2) throws IOException {
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Http2.frameLog(false, i, i2, b, b2));
        }
        int i3 = this.maxFrameSize;
        if (i2 > i3) {
            throw Http2.illegalArgument("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        } else if ((Integer.MIN_VALUE & i) == 0) {
            writeMedium(this.sink, i2);
            this.sink.mo244562k(b & 255);
            this.sink.mo244562k(b2 & 255);
            this.sink.mo244557i(i & Integer.MAX_VALUE);
        } else {
            throw Http2.illegalArgument("reserved bit set: %s", Integer.valueOf(i));
        }
    }
}
