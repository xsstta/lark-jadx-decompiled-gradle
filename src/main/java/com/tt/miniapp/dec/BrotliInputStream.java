package com.tt.miniapp.dec;

import com.huawei.hms.feature.dynamic.DynamicModule;
import java.io.IOException;
import java.io.InputStream;

public class BrotliInputStream extends InputStream {
    private byte[] buffer;
    private int bufferOffset;
    private int remainingBufferBytes;
    private final State state;

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        Decode.close(this.state);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.bufferOffset >= this.remainingBufferBytes) {
            byte[] bArr = this.buffer;
            int read = read(bArr, 0, bArr.length);
            this.remainingBufferBytes = read;
            this.bufferOffset = 0;
            if (read == -1) {
                return -1;
            }
        }
        byte[] bArr2 = this.buffer;
        int i = this.bufferOffset;
        this.bufferOffset = i + 1;
        return bArr2[i] & 255;
    }

    public BrotliInputStream(InputStream inputStream) throws IOException {
        this(inputStream, DynamicModule.f58006b);
    }

    public void setEager(boolean z) {
        this.state.isEager = z ? 1 : 0;
    }

    public BrotliInputStream(InputStream inputStream, int i) throws IOException {
        State state2 = new State();
        this.state = state2;
        if (i <= 0) {
            throw new IllegalArgumentException("Bad buffer size:" + i);
        } else if (inputStream != null) {
            this.buffer = new byte[i];
            this.remainingBufferBytes = 0;
            this.bufferOffset = 0;
            try {
                Decode.initState(state2, inputStream);
            } catch (BrotliRuntimeException e) {
                throw new IOException("Brotli decoder initialization failed", e);
            }
        } else {
            throw new IllegalArgumentException("source is null");
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0) {
            throw new IllegalArgumentException("Bad offset: " + i);
        } else if (i2 >= 0) {
            int i3 = i + i2;
            if (i3 > bArr.length) {
                throw new IllegalArgumentException("Buffer overflow: " + i3 + " > " + bArr.length);
            } else if (i2 == 0) {
                return 0;
            } else {
                int max = Math.max(this.remainingBufferBytes - this.bufferOffset, 0);
                if (max != 0) {
                    max = Math.min(max, i2);
                    System.arraycopy(this.buffer, this.bufferOffset, bArr, i, max);
                    this.bufferOffset += max;
                    i += max;
                    i2 -= max;
                    if (i2 == 0) {
                        return max;
                    }
                }
                try {
                    this.state.output = bArr;
                    this.state.outputOffset = i;
                    this.state.outputLength = i2;
                    this.state.outputUsed = 0;
                    Decode.decompress(this.state);
                    if (this.state.outputUsed == 0) {
                        return -1;
                    }
                    return this.state.outputUsed + max;
                } catch (BrotliRuntimeException e) {
                    throw new IOException("Brotli stream decoding failed", e);
                }
            }
        } else {
            throw new IllegalArgumentException("Bad length: " + i2);
        }
    }
}
