package com.ttnet.org.chromium.net.urlconnection;

import com.ttnet.org.chromium.net.UploadDataProvider;
import com.ttnet.org.chromium.net.UploadDataSink;
import java.io.IOException;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* access modifiers changed from: package-private */
public final class CronetBufferedOutputStream extends CronetOutputStream {
    public ByteBuffer mBuffer;
    public boolean mConnected;
    private final CronetHttpURLConnection mConnection;
    public final int mInitialContentLength;
    private final UploadDataProvider mUploadDataProvider = new UploadDataProviderImpl();

    /* access modifiers changed from: package-private */
    @Override // com.ttnet.org.chromium.net.urlconnection.CronetOutputStream
    public void checkReceivedEnoughContent() throws IOException {
    }

    /* access modifiers changed from: package-private */
    @Override // com.ttnet.org.chromium.net.urlconnection.CronetOutputStream
    public UploadDataProvider getUploadDataProvider() {
        return this.mUploadDataProvider;
    }

    /* access modifiers changed from: package-private */
    @Override // com.ttnet.org.chromium.net.urlconnection.CronetOutputStream
    public void setConnected() throws IOException {
        this.mConnected = true;
        if (this.mBuffer.position() >= this.mInitialContentLength) {
            this.mBuffer.flip();
            return;
        }
        throw new ProtocolException("Content received is less than Content-Length");
    }

    private class UploadDataProviderImpl extends UploadDataProvider {
        @Override // com.ttnet.org.chromium.net.UploadDataProvider
        public long getLength() {
            int i;
            if (CronetBufferedOutputStream.this.mInitialContentLength != -1) {
                return (long) CronetBufferedOutputStream.this.mInitialContentLength;
            }
            if (CronetBufferedOutputStream.this.mConnected) {
                i = CronetBufferedOutputStream.this.mBuffer.limit();
            } else {
                i = CronetBufferedOutputStream.this.mBuffer.position();
            }
            return (long) i;
        }

        private UploadDataProviderImpl() {
        }

        @Override // com.ttnet.org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) {
            CronetBufferedOutputStream.this.mBuffer.position(0);
            uploadDataSink.onRewindSucceeded();
        }

        @Override // com.ttnet.org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (remaining < CronetBufferedOutputStream.this.mBuffer.remaining()) {
                byteBuffer.put(CronetBufferedOutputStream.this.mBuffer.array(), CronetBufferedOutputStream.this.mBuffer.position(), remaining);
                CronetBufferedOutputStream.this.mBuffer.position(CronetBufferedOutputStream.this.mBuffer.position() + remaining);
            } else {
                byteBuffer.put(CronetBufferedOutputStream.this.mBuffer);
            }
            uploadDataSink.onReadSucceeded(false);
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        checkNotClosed();
        ensureCanWrite(1);
        this.mBuffer.put((byte) i);
    }

    CronetBufferedOutputStream(CronetHttpURLConnection cronetHttpURLConnection) {
        Objects.requireNonNull(cronetHttpURLConnection);
        this.mConnection = cronetHttpURLConnection;
        this.mInitialContentLength = -1;
        this.mBuffer = ByteBuffer.allocate(16384);
    }

    private void ensureCanWrite(int i) throws IOException {
        if (this.mInitialContentLength != -1 && this.mBuffer.position() + i > this.mInitialContentLength) {
            throw new ProtocolException("exceeded content-length limit of " + this.mInitialContentLength + " bytes");
        } else if (this.mConnected) {
            throw new IllegalStateException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for writing after connect");
        } else if (this.mInitialContentLength == -1 && this.mBuffer.limit() - this.mBuffer.position() <= i) {
            ByteBuffer allocate = ByteBuffer.allocate(Math.max(this.mBuffer.capacity() * 2, this.mBuffer.capacity() + i));
            this.mBuffer.flip();
            allocate.put(this.mBuffer);
            this.mBuffer = allocate;
        }
    }

    CronetBufferedOutputStream(CronetHttpURLConnection cronetHttpURLConnection, long j) {
        Objects.requireNonNull(cronetHttpURLConnection, "Argument connection cannot be null.");
        if (j > 2147483647L) {
            throw new IllegalArgumentException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2GB.");
        } else if (j >= 0) {
            this.mConnection = cronetHttpURLConnection;
            int i = (int) j;
            this.mInitialContentLength = i;
            this.mBuffer = ByteBuffer.allocate(i);
        } else {
            throw new IllegalArgumentException("Content length < 0.");
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        checkNotClosed();
        ensureCanWrite(i2);
        this.mBuffer.put(bArr, i, i2);
    }
}
