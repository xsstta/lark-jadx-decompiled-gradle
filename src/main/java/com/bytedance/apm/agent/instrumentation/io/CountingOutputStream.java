package com.bytedance.apm.agent.instrumentation.io;

import java.io.IOException;
import java.io.OutputStream;

public final class CountingOutputStream extends OutputStream implements StreamCompleteListenerSource {
    private long count;
    private final OutputStream impl;
    private final StreamCompleteListenerManager listenerManager = new StreamCompleteListenerManager();

    public long getCount() {
        return this.count;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            this.impl.close();
            notifyStreamComplete();
        } catch (IOException e) {
            notifyStreamError(e);
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        try {
            this.impl.flush();
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

    @Override // com.bytedance.apm.agent.instrumentation.io.StreamCompleteListenerSource
    public void addStreamCompleteListener(StreamCompleteListener streamCompleteListener) {
        this.listenerManager.addStreamCompleteListener(streamCompleteListener);
    }

    @Override // com.bytedance.apm.agent.instrumentation.io.StreamCompleteListenerSource
    public void removeStreamCompleteListener(StreamCompleteListener streamCompleteListener) {
        this.listenerManager.removeStreamCompleteListener(streamCompleteListener);
    }

    public CountingOutputStream(OutputStream outputStream) {
        this.impl = outputStream;
    }

    private void notifyStreamError(Exception exc) {
        if (!this.listenerManager.isComplete()) {
            this.listenerManager.notifyStreamError(new StreamCompleteEvent(this, this.count, exc));
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        try {
            this.impl.write(i);
            this.count++;
        } catch (IOException e) {
            notifyStreamError(e);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        try {
            this.impl.write(bArr);
            this.count += (long) bArr.length;
        } catch (IOException e) {
            notifyStreamError(e);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.impl.write(bArr, i, i2);
            this.count += (long) i2;
        } catch (IOException e) {
            notifyStreamError(e);
            throw e;
        }
    }
}
