package com.he.loader;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public interface Resolver {
    void reject(IOException iOException);

    void resolve(File file);

    void resolve(ByteBuffer byteBuffer);

    void resolve(byte[] bArr, int i, int i2);
}
