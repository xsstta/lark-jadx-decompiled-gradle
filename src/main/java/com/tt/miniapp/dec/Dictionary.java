package com.tt.miniapp.dec;

import java.nio.ByteBuffer;

public final class Dictionary {
    private static volatile ByteBuffer data;

    /* access modifiers changed from: private */
    public static class DataLoader {
        static final boolean OK;

        private DataLoader() {
        }

        static {
            boolean z;
            try {
                Class.forName(Dictionary.class.getPackage().getName() + ".DictionaryData");
                z = true;
            } catch (Throwable unused) {
                z = false;
            }
            OK = z;
        }
    }

    public static ByteBuffer getData() {
        if (data != null) {
            return data;
        }
        if (DataLoader.OK) {
            return data;
        }
        throw new BrotliRuntimeException("brotli dictionary is not set");
    }

    public static void setData(ByteBuffer byteBuffer) {
        if (!byteBuffer.isDirect() || !byteBuffer.isReadOnly()) {
            throw new BrotliRuntimeException("data must be a direct read-only byte buffer");
        }
        data = byteBuffer;
    }
}
