package com.he.loader;

import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.he.Monitor;
import com.he.loader.LoadScriptSample;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;

public final class TTAppLoader {
    private long _ptr;
    public final Loader impl;
    private LoadScriptSample.Callback loadScriptSampleCallback = null;
    private final LinkedList<ResolverImpl> pending_files = new LinkedList<>();

    public static native void loadScript(String str);

    private static native void nativeCleanup();

    public static native void nativeReject(long j, String str);

    public static native void nativeResolve(long j, ByteBuffer byteBuffer);

    public static native void nativeResolveBytes(long j, byte[] bArr, int i, int i2);

    public static native void nativeResolveFile(long j, String str);

    private native void toggleLoadScriptSample(boolean z);

    public native void cleanup();

    public native void loadPackage(String str);

    public native void setup(String str, int i, boolean z);

    public enum Settings {
        CODECACHE_MINSIZE("codecache_minsize"),
        CODECACHE_DIR("codecache_path"),
        CODECACHE_BACKGROUND_CREATE("codecache_bg_create");
        
        private final String name;

        public String toString() {
            return this.name;
        }

        private Settings(String str) {
            this.name = str;
        }
    }

    public void cleanupV2() {
        this._ptr = 0;
        nativeCleanup();
    }

    private byte[] reflectedLoadSync(String str) {
        return this.impl.loadSync(str);
    }

    public TTAppLoader(Loader loader) {
        this.impl = loader;
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

        @Override // com.he.loader.Resolver
        public void reject(IOException iOException) {
            if (!this.resolved) {
                this.resolved = true;
                TTAppLoader.nativeReject(this.id, iOException.getMessage());
                return;
            }
            throw new RuntimeException("request has been resolved");
        }

        @Override // com.he.loader.Resolver
        public void resolve(File file) {
            if (!this.resolved) {
                this.resolved = true;
                TTAppLoader.nativeResolveFile(this.id, file.getPath());
                return;
            }
            throw new RuntimeException("request has been resolved");
        }

        @Override // com.he.loader.Resolver
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

        @Override // com.he.loader.Resolver
        public void resolve(byte[] bArr, int i, int i2) {
            if (!this.resolved) {
                this.resolved = true;
                TTAppLoader.nativeResolveBytes(this.id, bArr, i, i2);
                return;
            }
            throw new RuntimeException("request has been resolved");
        }
    }

    private void reflectedOnLoadScriptSample(ByteBuffer byteBuffer) {
        LoadScriptSample.Callback callback = this.loadScriptSampleCallback;
        if (callback != null) {
            int capacity = byteBuffer.capacity();
            for (int i = 0; i < capacity; i += 320) {
                callback.onSample(new LoadScriptSample(byteBuffer, i));
            }
        }
    }

    public void setLoadScriptSampleCallback(LoadScriptSample.Callback callback) {
        boolean z;
        boolean z2;
        LoadScriptSample.Callback callback2 = this.loadScriptSampleCallback;
        if (callback2 != callback) {
            boolean z3 = true;
            if (callback2 == null) {
                z = true;
            } else {
                z = false;
            }
            if (callback == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z != z2) {
                if (callback == null) {
                    z3 = false;
                }
                toggleLoadScriptSample(z3);
            }
            this.loadScriptSampleCallback = callback;
        }
    }

    private void reflectedLoadUrl(String str, long j) {
        this.impl.loadUrl(str, new ResolverImpl(str, j));
    }

    private void reflectedLoad(String str, long j) {
        synchronized (this.pending_files) {
            ResolverImpl resolverImpl = new ResolverImpl(str, j);
            this.impl.load(str, resolverImpl);
            if (!resolverImpl.resolved) {
                this.pending_files.push(resolverImpl);
            }
        }
    }

    public final void reject(String str, IOException iOException) {
        synchronized (this.pending_files) {
            Iterator<ResolverImpl> it = this.pending_files.iterator();
            while (it.hasNext()) {
                ResolverImpl next = it.next();
                if (next.path.equals(str)) {
                    next.reject(iOException);
                    it.remove();
                }
            }
        }
    }

    public final void resolve(String str, ByteBuffer byteBuffer) {
        synchronized (this.pending_files) {
            Iterator<ResolverImpl> it = this.pending_files.iterator();
            while (it.hasNext()) {
                ResolverImpl next = it.next();
                if (next.path.equals(str)) {
                    next.resolve(byteBuffer);
                    it.remove();
                }
            }
        }
    }

    public void setup(ContextWrapper contextWrapper, SettingsProvider settingsProvider) {
        boolean z;
        String str = "com.he.loader.js_cache";
        int i = 32768;
        if (settingsProvider != null) {
            str = settingsProvider.getSetting(contextWrapper, Settings.CODECACHE_DIR, str);
            i = settingsProvider.getSetting(contextWrapper, Settings.CODECACHE_MINSIZE, 32768);
            z = settingsProvider.getSetting((Context) contextWrapper, (Enum<?>) Settings.CODECACHE_BACKGROUND_CREATE, true);
        } else {
            z = true;
        }
        AppBrandLogger.m52830i("falcon ttAppLoader", "setup");
        setup(contextWrapper.getCacheDir() + "/" + str + "/", i, z);
    }

    private void reflectedOnAsyncCompile(int i, int i2, int i3) {
        Monitor.impl.onAsyncCompile(i, i2, i3);
    }

    private void reflectedPostUrl(String str, byte[] bArr, String str2, long j) {
        try {
            this.impl.getClass().getDeclaredMethod("post", String.class, byte[].class, String.class, Resolver.class).invoke(this.impl, str, bArr, str2, new ResolverImpl(str, j));
        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }
    }

    public final void resolve(String str, byte[] bArr, int i, int i2) {
        synchronized (this.pending_files) {
            Iterator<ResolverImpl> it = this.pending_files.iterator();
            while (it.hasNext()) {
                ResolverImpl next = it.next();
                if (next.path.equals(str)) {
                    next.resolve(bArr, i, i2);
                    it.remove();
                }
            }
        }
    }
}
