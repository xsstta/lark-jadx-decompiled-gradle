package com.bytedance.apm.agent.instrumentation.io;

import com.bytedance.apm.agent.logging.AgentLog;
import com.bytedance.apm.agent.logging.AgentLogManager;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class CountingInputStream extends InputStream implements StreamCompleteListenerSource {
    private static final AgentLog log = AgentLogManager.getAgentLog();
    private final ByteBuffer buffer;
    private long count;
    private boolean enableBuffering = false;
    private final InputStream impl;
    private final StreamCompleteListenerManager listenerManager = new StreamCompleteListenerManager();

    public boolean markSupported() {
        return this.impl.markSupported();
    }

    private boolean bufferEmpty() {
        if (this.buffer.hasRemaining()) {
            return false;
        }
        return true;
    }

    private int readBuffer() {
        if (bufferEmpty()) {
            return -1;
        }
        return this.buffer.get();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        try {
            this.impl.close();
            notifyStreamComplete();
        } catch (IOException e) {
            notifyStreamError(e);
            throw e;
        }
    }

    private void notifyStreamComplete() {
        if (!this.listenerManager.isComplete()) {
            this.listenerManager.notifyStreamComplete(new StreamCompleteEvent(this, this.count));
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        int i;
        if (this.enableBuffering) {
            i = this.buffer.remaining();
        } else {
            i = 0;
        }
        try {
            return i + this.impl.available();
        } catch (IOException e) {
            notifyStreamError(e);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        if (markSupported()) {
            try {
                this.impl.reset();
            } catch (IOException e) {
                notifyStreamError(e);
                throw e;
            }
        }
    }

    public String getBufferAsString() {
        String str;
        ByteBuffer byteBuffer = this.buffer;
        if (byteBuffer == null) {
            return "";
        }
        synchronized (byteBuffer) {
            byte[] bArr = new byte[this.buffer.limit()];
            for (int i = 0; i < this.buffer.limit(); i++) {
                bArr[i] = this.buffer.get(i);
            }
            str = new String(bArr);
        }
        return str;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.enableBuffering) {
            synchronized (this.buffer) {
                if (bufferHasBytes(1)) {
                    int readBuffer = readBuffer();
                    if (readBuffer >= 0) {
                        this.count++;
                    }
                    return readBuffer;
                }
            }
        }
        try {
            int read = this.impl.read();
            if (read >= 0) {
                this.count++;
            } else {
                notifyStreamComplete();
            }
            return read;
        } catch (IOException e) {
            notifyStreamError(e);
            throw e;
        }
    }

    public void fillBuffer() {
        int i;
        ByteBuffer byteBuffer = this.buffer;
        if (byteBuffer != null && byteBuffer.hasArray()) {
            synchronized (this.buffer) {
                try {
                    i = this.impl.read(this.buffer.array(), 0, this.buffer.capacity());
                } catch (IOException e) {
                    log.error(e.toString());
                    i = 0;
                }
                if (i <= 0) {
                    this.buffer.limit(0);
                } else if (i < this.buffer.capacity()) {
                    this.buffer.limit(i);
                }
            }
        }
    }

    public void setBufferingEnabled(boolean z) {
        this.enableBuffering = z;
    }

    private int readBufferBytes(byte[] bArr) {
        return readBufferBytes(bArr, 0, bArr.length);
    }

    @Override // com.bytedance.apm.agent.instrumentation.io.StreamCompleteListenerSource
    public void addStreamCompleteListener(StreamCompleteListener streamCompleteListener) {
        this.listenerManager.addStreamCompleteListener(streamCompleteListener);
    }

    @Override // com.bytedance.apm.agent.instrumentation.io.StreamCompleteListenerSource
    public void removeStreamCompleteListener(StreamCompleteListener streamCompleteListener) {
        this.listenerManager.removeStreamCompleteListener(streamCompleteListener);
    }

    private boolean bufferHasBytes(long j) {
        if (((long) this.buffer.remaining()) >= j) {
            return true;
        }
        return false;
    }

    public void mark(int i) {
        if (markSupported()) {
            this.impl.mark(i);
        }
    }

    private void notifyStreamError(Exception exc) {
        if (!this.listenerManager.isComplete()) {
            this.listenerManager.notifyStreamError(new StreamCompleteEvent(this, this.count, exc));
        }
    }

    public CountingInputStream(InputStream inputStream) {
        this.impl = inputStream;
        if (0 != 0) {
            this.buffer = ByteBuffer.allocate(2048);
            fillBuffer();
            return;
        }
        this.buffer = null;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        if (this.enableBuffering) {
            synchronized (this.buffer) {
                if (bufferHasBytes(j)) {
                    this.buffer.position((int) j);
                    this.count += j;
                    return j;
                }
                j -= (long) this.buffer.remaining();
                if (j > 0) {
                    ByteBuffer byteBuffer = this.buffer;
                    byteBuffer.position(byteBuffer.remaining());
                } else {
                    throw new IOException("partial read from buffer (skip) failed");
                }
            }
        }
        try {
            long skip = this.impl.skip(j);
            this.count += skip;
            return skip;
        } catch (IOException e) {
            notifyStreamError(e);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i = 0;
        if (this.enableBuffering) {
            synchronized (this.buffer) {
                if (bufferHasBytes((long) length)) {
                    int readBufferBytes = readBufferBytes(bArr);
                    if (readBufferBytes >= 0) {
                        this.count += (long) readBufferBytes;
                        return readBufferBytes;
                    }
                    throw new IOException("readBufferBytes failed");
                }
                int remaining = this.buffer.remaining();
                if (remaining > 0) {
                    i = readBufferBytes(bArr, 0, remaining);
                    if (i >= 0) {
                        length -= i;
                        this.count += (long) i;
                    } else {
                        throw new IOException("partial read from buffer failed");
                    }
                }
            }
        }
        try {
            int read = this.impl.read(bArr, i, length);
            if (read >= 0) {
                this.count += (long) read;
                return read + i;
            } else if (i > 0) {
                return i;
            } else {
                notifyStreamComplete();
                return read;
            }
        } catch (IOException e) {
            log.error(e.toString());
            System.out.println("NOTIFY STREAM ERROR: " + e);
            e.printStackTrace();
            notifyStreamError(e);
            throw e;
        }
    }

    public CountingInputStream(InputStream inputStream, boolean z) {
        this.impl = inputStream;
        this.enableBuffering = z;
        if (z) {
            this.buffer = ByteBuffer.allocate(2048);
            fillBuffer();
            return;
        }
        this.buffer = null;
    }

    private int readBufferBytes(byte[] bArr, int i, int i2) {
        if (bufferEmpty()) {
            return -1;
        }
        int remaining = this.buffer.remaining();
        this.buffer.get(bArr, i, i2);
        return remaining - this.buffer.remaining();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        if (this.enableBuffering) {
            synchronized (this.buffer) {
                if (bufferHasBytes((long) i2)) {
                    int readBufferBytes = readBufferBytes(bArr, i, i2);
                    if (readBufferBytes >= 0) {
                        this.count += (long) readBufferBytes;
                        return readBufferBytes;
                    }
                    throw new IOException("readBufferBytes failed");
                }
                int remaining = this.buffer.remaining();
                if (remaining > 0) {
                    i3 = readBufferBytes(bArr, i, remaining);
                    if (i3 >= 0) {
                        i2 -= i3;
                        this.count += (long) i3;
                    } else {
                        throw new IOException("partial read from buffer failed");
                    }
                }
            }
        }
        try {
            int read = this.impl.read(bArr, i + i3, i2);
            if (read >= 0) {
                this.count += (long) read;
                return read + i3;
            } else if (i3 > 0) {
                return i3;
            } else {
                notifyStreamComplete();
                return read;
            }
        } catch (IOException e) {
            notifyStreamError(e);
            throw e;
        }
    }
}
