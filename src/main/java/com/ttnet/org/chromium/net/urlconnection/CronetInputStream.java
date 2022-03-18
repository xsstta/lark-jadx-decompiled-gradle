package com.ttnet.org.chromium.net.urlconnection;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* access modifiers changed from: package-private */
public class CronetInputStream extends InputStream {
    private ByteBuffer mBuffer;
    private IOException mException;
    private final CronetHttpURLConnection mHttpURLConnection;
    private boolean mResponseDataCompleted;

    private boolean hasUnreadData() {
        ByteBuffer byteBuffer = this.mBuffer;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            return false;
        }
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        CronetHttpURLConnection cronetHttpURLConnection = this.mHttpURLConnection;
        if (cronetHttpURLConnection != null) {
            cronetHttpURLConnection.disconnect();
        }
        super.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        getMoreDataIfNeeded();
        if (hasUnreadData()) {
            return this.mBuffer.get() & 255;
        }
        return -1;
    }

    private void getMoreDataIfNeeded() throws IOException {
        if (this.mResponseDataCompleted) {
            IOException iOException = this.mException;
            if (iOException != null) {
                throw iOException;
            }
        } else if (!hasUnreadData()) {
            if (this.mBuffer == null) {
                int i = 32768;
                if (this.mHttpURLConnection.getInputStreamBufferSize() > 32768) {
                    i = this.mHttpURLConnection.getInputStreamBufferSize();
                }
                this.mBuffer = ByteBuffer.allocateDirect(i);
            }
            this.mBuffer.clear();
            this.mHttpURLConnection.getMoreData(this.mBuffer);
            IOException iOException2 = this.mException;
            if (iOException2 == null) {
                ByteBuffer byteBuffer = this.mBuffer;
                if (byteBuffer != null) {
                    byteBuffer.flip();
                    return;
                }
                return;
            }
            throw iOException2;
        }
    }

    public CronetInputStream(CronetHttpURLConnection cronetHttpURLConnection) {
        this.mHttpURLConnection = cronetHttpURLConnection;
    }

    /* access modifiers changed from: package-private */
    public void setResponseDataCompleted(IOException iOException) {
        this.mException = iOException;
        this.mResponseDataCompleted = true;
        this.mBuffer = null;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        } else if (i2 == 0) {
            return 0;
        } else {
            getMoreDataIfNeeded();
            if (!hasUnreadData()) {
                return -1;
            }
            int min = Math.min(this.mBuffer.limit() - this.mBuffer.position(), i2);
            this.mBuffer.get(bArr, i, min);
            return min;
        }
    }
}
