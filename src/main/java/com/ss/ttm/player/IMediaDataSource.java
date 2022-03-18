package com.ss.ttm.player;

import java.io.Closeable;
import java.io.IOException;

public interface IMediaDataSource extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    long getSize() throws IOException;

    int readAt(long j, byte[] bArr, int i, int i2) throws IOException;
}
