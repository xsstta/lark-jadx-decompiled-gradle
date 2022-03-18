package com.ttnet.org.chromium.net.urlconnection;

import com.ttnet.org.chromium.net.UploadDataProvider;
import com.ttnet.org.chromium.net.UploadDataSink;
import java.io.IOException;
import java.net.HttpRetryException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* access modifiers changed from: package-private */
public final class CronetFixedModeOutputStream extends CronetOutputStream {
    private static int sDefaultBufferLength = 16384;
    public final ByteBuffer mBuffer;
    private long mBytesWritten;
    private final CronetHttpURLConnection mConnection;
    public final long mContentLength;
    public boolean mIsRewinding;
    public final MessageLoop mMessageLoop;
    public boolean mSupportRewind;
    private final UploadDataProvider mUploadDataProvider = new UploadDataProviderImpl();

    /* access modifiers changed from: package-private */
    @Override // com.ttnet.org.chromium.net.urlconnection.CronetOutputStream
    public void setConnected() throws IOException {
    }

    /* access modifiers changed from: package-private */
    @Override // com.ttnet.org.chromium.net.urlconnection.CronetOutputStream
    public UploadDataProvider getUploadDataProvider() {
        return this.mUploadDataProvider;
    }

    private class UploadDataProviderImpl extends UploadDataProvider {
        @Override // com.ttnet.org.chromium.net.UploadDataProvider
        public long getLength() {
            return CronetFixedModeOutputStream.this.mContentLength;
        }

        private UploadDataProviderImpl() {
        }

        @Override // com.ttnet.org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) {
            if (CronetFixedModeOutputStream.this.mSupportRewind) {
                CronetFixedModeOutputStream.this.mIsRewinding = true;
                CronetFixedModeOutputStream.this.mBuffer.rewind();
                uploadDataSink.onRewindSucceeded();
                return;
            }
            uploadDataSink.onRewindError(new HttpRetryException("Cannot retry streamed Http body", -1));
        }

        @Override // com.ttnet.org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            if (byteBuffer.remaining() >= CronetFixedModeOutputStream.this.mBuffer.remaining()) {
                byteBuffer.put(CronetFixedModeOutputStream.this.mBuffer);
                CronetFixedModeOutputStream.this.mBuffer.clear();
                uploadDataSink.onReadSucceeded(false);
                if (!CronetFixedModeOutputStream.this.mIsRewinding) {
                    CronetFixedModeOutputStream.this.mMessageLoop.quit();
                    return;
                }
                return;
            }
            int limit = CronetFixedModeOutputStream.this.mBuffer.limit();
            CronetFixedModeOutputStream.this.mBuffer.limit(CronetFixedModeOutputStream.this.mBuffer.position() + byteBuffer.remaining());
            byteBuffer.put(CronetFixedModeOutputStream.this.mBuffer);
            CronetFixedModeOutputStream.this.mBuffer.limit(limit);
            uploadDataSink.onReadSucceeded(false);
        }
    }

    private void ensureBufferHasRemaining() throws IOException {
        if (!this.mBuffer.hasRemaining()) {
            this.mSupportRewind = false;
            uploadBufferInternal();
        }
    }

    private void uploadIfComplete() throws IOException {
        if (this.mBytesWritten == this.mContentLength) {
            uploadBufferInternal();
        }
    }

    private void uploadBufferInternal() throws IOException {
        checkNotClosed();
        this.mBuffer.flip();
        cronet_loop(this.mConnection.getReadTimeout());
        checkNoException();
    }

    /* access modifiers changed from: package-private */
    @Override // com.ttnet.org.chromium.net.urlconnection.CronetOutputStream
    public void checkReceivedEnoughContent() throws IOException {
        if (this.mBytesWritten < this.mContentLength) {
            throw new ProtocolException("Content received is less than Content-Length.");
        }
    }

    static void setDefaultBufferLengthForTesting(int i) {
        sDefaultBufferLength = i;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        checkNotClosed();
        checkNotExceedContentLength(1);
        ensureBufferHasRemaining();
        this.mBuffer.put((byte) i);
        this.mBytesWritten++;
        uploadIfComplete();
    }

    private void checkNotExceedContentLength(int i) throws ProtocolException {
        if (this.mBytesWritten + ((long) i) > this.mContentLength) {
            throw new ProtocolException("expected " + (this.mContentLength - this.mBytesWritten) + " bytes but received " + i);
        }
    }

    private void cronet_loop(int i) throws IOException {
        try {
            this.mMessageLoop.loop(i);
        } catch (SocketTimeoutException unused) {
            CronetHttpURLConnection cronetHttpURLConnection = this.mConnection;
            if (cronetHttpURLConnection != null) {
                cronetHttpURLConnection.onUploadTimeout();
                this.mMessageLoop.reset();
                this.mMessageLoop.loop(i / 2);
            }
        } catch (Exception e) {
            CronetHttpURLConnection cronetHttpURLConnection2 = this.mConnection;
            if (cronetHttpURLConnection2 != null) {
                cronetHttpURLConnection2.setException(new IOException("Unexpected request usage, caught in CronetFixedModeOutputStream, caused by " + e));
                this.mMessageLoop.reset();
                this.mMessageLoop.loop(i / 2);
            }
        }
    }

    CronetFixedModeOutputStream(CronetHttpURLConnection cronetHttpURLConnection, long j, MessageLoop messageLoop) {
        Objects.requireNonNull(cronetHttpURLConnection);
        if (j >= 0) {
            this.mContentLength = j;
            this.mBuffer = ByteBuffer.allocate((int) Math.min(j, (long) sDefaultBufferLength));
            this.mConnection = cronetHttpURLConnection;
            this.mMessageLoop = messageLoop;
            this.mBytesWritten = 0;
            this.mSupportRewind = true;
            this.mIsRewinding = false;
            return;
        }
        throw new IllegalArgumentException("Content length must be larger than 0 for non-chunked upload.");
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        checkNotClosed();
        if (bArr.length - i < i2 || i < 0 || i2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        checkNotExceedContentLength(i2);
        int i3 = i2;
        while (i3 > 0) {
            ensureBufferHasRemaining();
            int min = Math.min(i3, this.mBuffer.remaining());
            this.mBuffer.put(bArr, (i + i2) - i3, min);
            i3 -= min;
        }
        this.mBytesWritten += (long) i2;
        uploadIfComplete();
    }
}
