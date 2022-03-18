package okhttp3.internal.ws;

import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.IOException;
import java.util.Objects;
import java.util.Random;
import okio.AbstractC69698d;
import okio.AbstractC69722t;
import okio.ByteString;
import okio.C69694c;
import okio.C69724v;

/* access modifiers changed from: package-private */
public final class WebSocketWriter {
    boolean activeWriter;
    final C69694c buffer = new C69694c();
    final FrameSink frameSink = new FrameSink();
    final boolean isClient;
    private final C69694c.C69697a maskCursor;
    private final byte[] maskKey;
    final Random random;
    final AbstractC69698d sink;
    final C69694c sinkBuffer;
    boolean writerClosed;

    /* access modifiers changed from: package-private */
    public final class FrameSink implements AbstractC69722t {
        boolean closed;
        long contentLength;
        int formatOpcode;
        boolean isFirstFrame;

        @Override // okio.AbstractC69722t
        public C69724v timeout() {
            return WebSocketWriter.this.sink.timeout();
        }

        @Override // okio.AbstractC69722t, java.io.Flushable
        public void flush() throws IOException {
            if (!this.closed) {
                WebSocketWriter webSocketWriter = WebSocketWriter.this;
                webSocketWriter.writeMessageFrame(this.formatOpcode, webSocketWriter.buffer.mo244510a(), this.isFirstFrame, false);
                this.isFirstFrame = false;
                return;
            }
            throw new IOException("closed");
        }

        @Override // okio.AbstractC69722t, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.closed) {
                WebSocketWriter webSocketWriter = WebSocketWriter.this;
                webSocketWriter.writeMessageFrame(this.formatOpcode, webSocketWriter.buffer.mo244510a(), this.isFirstFrame, true);
                this.closed = true;
                WebSocketWriter.this.activeWriter = false;
                return;
            }
            throw new IOException("closed");
        }

        FrameSink() {
        }

        @Override // okio.AbstractC69722t
        public void write(C69694c cVar, long j) throws IOException {
            boolean z;
            if (!this.closed) {
                WebSocketWriter.this.buffer.write(cVar, j);
                if (!this.isFirstFrame || this.contentLength == -1 || WebSocketWriter.this.buffer.mo244510a() <= this.contentLength - 8192) {
                    z = false;
                } else {
                    z = true;
                }
                long e = WebSocketWriter.this.buffer.mo244542e();
                if (e > 0 && !z) {
                    WebSocketWriter.this.writeMessageFrame(this.formatOpcode, e, this.isFirstFrame, false);
                    this.isFirstFrame = false;
                    return;
                }
                return;
            }
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: package-private */
    public void writePing(ByteString byteString) throws IOException {
        writeControlFrame(9, byteString);
    }

    /* access modifiers changed from: package-private */
    public void writePong(ByteString byteString) throws IOException {
        writeControlFrame(10, byteString);
    }

    /* access modifiers changed from: package-private */
    public AbstractC69722t newMessageSink(int i, long j) {
        if (!this.activeWriter) {
            this.activeWriter = true;
            this.frameSink.formatOpcode = i;
            this.frameSink.contentLength = j;
            this.frameSink.isFirstFrame = true;
            this.frameSink.closed = false;
            return this.frameSink;
        }
        throw new IllegalStateException("Another message writer is active. Did you call close()?");
    }

    /* access modifiers changed from: package-private */
    public void writeClose(int i, ByteString byteString) throws IOException {
        ByteString byteString2 = ByteString.EMPTY;
        if (!(i == 0 && byteString == null)) {
            if (i != 0) {
                WebSocketProtocol.validateCloseCode(i);
            }
            C69694c cVar = new C69694c();
            cVar.mo244561j(i);
            if (byteString != null) {
                cVar.mo244532b(byteString);
            }
            byteString2 = cVar.readByteString();
        }
        try {
            writeControlFrame(8, byteString2);
        } finally {
            this.writerClosed = true;
        }
    }

    private void writeControlFrame(int i, ByteString byteString) throws IOException {
        if (!this.writerClosed) {
            int size = byteString.size();
            if (((long) size) <= 125) {
                this.sinkBuffer.mo244562k(i | SmActions.ACTION_ONTHECALL_EXIT);
                if (this.isClient) {
                    this.sinkBuffer.mo244562k(size | SmActions.ACTION_ONTHECALL_EXIT);
                    this.random.nextBytes(this.maskKey);
                    this.sinkBuffer.mo244533b(this.maskKey);
                    if (size > 0) {
                        long a = this.sinkBuffer.mo244510a();
                        this.sinkBuffer.mo244532b(byteString);
                        this.sinkBuffer.mo244515a(this.maskCursor);
                        this.maskCursor.mo244577a(a);
                        WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                        this.maskCursor.close();
                    }
                } else {
                    this.sinkBuffer.mo244562k(size);
                    this.sinkBuffer.mo244532b(byteString);
                }
                this.sink.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        throw new IOException("closed");
    }

    WebSocketWriter(boolean z, AbstractC69698d dVar, Random random2) {
        byte[] bArr;
        Objects.requireNonNull(dVar, "sink == null");
        Objects.requireNonNull(random2, "random == null");
        this.isClient = z;
        this.sink = dVar;
        this.sinkBuffer = dVar.buffer();
        this.random = random2;
        C69694c.C69697a aVar = null;
        if (z) {
            bArr = new byte[4];
        } else {
            bArr = null;
        }
        this.maskKey = bArr;
        this.maskCursor = z ? new C69694c.C69697a() : aVar;
    }

    /* access modifiers changed from: package-private */
    public void writeMessageFrame(int i, long j, boolean z, boolean z2) throws IOException {
        if (!this.writerClosed) {
            int i2 = 0;
            if (!z) {
                i = 0;
            }
            if (z2) {
                i |= SmActions.ACTION_ONTHECALL_EXIT;
            }
            this.sinkBuffer.mo244562k(i);
            if (this.isClient) {
                i2 = SmActions.ACTION_ONTHECALL_EXIT;
            }
            if (j <= 125) {
                this.sinkBuffer.mo244562k(((int) j) | i2);
            } else if (j <= 65535) {
                this.sinkBuffer.mo244562k(i2 | SmActions.ACTION_RINGING_EXIT);
                this.sinkBuffer.mo244561j((int) j);
            } else {
                this.sinkBuffer.mo244562k(i2 | SmActions.ACTION_ONTHECALL_ENTRY);
                this.sinkBuffer.mo244537c(j);
            }
            if (this.isClient) {
                this.random.nextBytes(this.maskKey);
                this.sinkBuffer.mo244533b(this.maskKey);
                if (j > 0) {
                    long a = this.sinkBuffer.mo244510a();
                    this.sinkBuffer.write(this.buffer, j);
                    this.sinkBuffer.mo244515a(this.maskCursor);
                    this.maskCursor.mo244577a(a);
                    WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            } else {
                this.sinkBuffer.write(this.buffer, j);
            }
            this.sink.mo244541d();
            return;
        }
        throw new IOException("closed");
    }
}
