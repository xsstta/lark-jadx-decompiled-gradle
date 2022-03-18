package com.he.lynx.loader;

import android.content.ContextWrapper;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class TTAppLoader {
    private long _ptr;
    public final Loader impl;

    private static native void nativeCleanup();

    public static native void nativeReject(long j, String str);

    public static native void nativeResolve(long j, ByteBuffer byteBuffer);

    public static native void nativeResolveBytes(long j, byte[] bArr, int i, int i2);

    public static native void nativeResolveFile(long j, String str);

    public native void setup(String str, int i);

    public void cleanup() {
        this._ptr = 0;
        nativeCleanup();
    }

    public TTAppLoader(Loader loader) {
        this.impl = loader;
    }

    private byte[] reflectedLoadSync(String str) {
        return this.impl.loadSync(str);
    }

    public Uri loadMedia(String str) {
        return this.impl.loadMedia(str);
    }

    public void setup(ContextWrapper contextWrapper) {
        setup(null, 0);
    }

    private String reflectedLoadMedia(String str) {
        Uri loadMedia = this.impl.loadMedia(str);
        if (loadMedia == null) {
            return null;
        }
        return loadMedia.toString();
    }

    private static final class ResolverImpl implements Resolver {
        final long id;
        final String path;
        boolean resolved;

        @Override // com.he.lynx.loader.Resolver
        public void reject(IOException iOException) {
            if (!this.resolved) {
                this.resolved = true;
                TTAppLoader.nativeReject(this.id, iOException.getMessage());
                return;
            }
            throw new RuntimeException("request has been resolved");
        }

        @Override // com.he.lynx.loader.Resolver
        public void resolve(File file) {
            if (!this.resolved) {
                this.resolved = true;
                TTAppLoader.nativeResolveFile(this.id, file.getPath());
                return;
            }
            throw new RuntimeException("request has been resolved");
        }

        @Override // com.he.lynx.loader.Resolver
        public void resolve(ByteBuffer byteBuffer) {
            if (!this.resolved) {
                this.resolved = true;
                if (byteBuffer.isDirect()) {
                    TTAppLoader.nativeResolve(this.id, byteBuffer);
                    return;
                }
                byte[] array = byteBuffer.array();
                TTAppLoader.nativeResolveBytes(this.id, array, 0, array.length);
                return;
            }
            throw new RuntimeException("request has been resolved");
        }

        ResolverImpl(String str, long j) {
            this.path = str;
            this.id = j;
        }

        @Override // com.he.lynx.loader.Resolver
        public void resolve(byte[] bArr, int i, int i2) {
            if (!this.resolved) {
                this.resolved = true;
                TTAppLoader.nativeResolveBytes(this.id, bArr, i, i2);
                return;
            }
            throw new RuntimeException("request has been resolved");
        }
    }

    private void reflectedLoad(String str, long j) {
        this.impl.load(str, new ResolverImpl(str, j));
    }

    private void reflectedLoadUrl(String str, long j) {
        this.impl.loadUrl(str, new ResolverImpl(str, j));
    }

    private void reflectedPostUrl(String str, byte[] bArr, String str2, long j) {
        try {
            this.impl.getClass().getDeclaredMethod("post", String.class, byte[].class, String.class, Resolver.class).invoke(this.impl, str, bArr, str2, new ResolverImpl(str, j));
        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }
    }
}
