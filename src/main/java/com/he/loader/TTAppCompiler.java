package com.he.loader;

import android.content.ContextWrapper;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.he.loader.TTAppLoader;

public class TTAppCompiler implements Runnable {
    private static volatile boolean libs_loaded;
    private long _ptr;
    private int cacheMinSize = 32768;
    private Callback callback;

    public interface Callback {
        void onCompiled(int i, int i2, int i3);
    }

    private static native void cleanupCompiler(long j);

    private static native void clearTasks(long j);

    private static native void pauseCompiler(long j);

    private static native int queueTask(long j, byte[] bArr, String str, boolean z, int i);

    private static native boolean removeTask(long j, int i);

    private static native void resumeCompiler(long j);

    private native long setupCompiler(String str);

    private static native void startCompiler(long j);

    private static native void stopCompiler(long j);

    public TTAppCompiler() {
        if (!libs_loaded) {
            loadLibs();
        }
    }

    public void cleanup() {
        cleanupCompiler(this._ptr);
        this._ptr = 0;
    }

    public void clearTasks() {
        long j = this._ptr;
        if (j != 0) {
            clearTasks(j);
            return;
        }
        throw new RuntimeException("TTAppCompilerPtr is null");
    }

    public void pause() {
        long j = this._ptr;
        if (j != 0) {
            pauseCompiler(j);
            return;
        }
        throw new RuntimeException("TTAppCompilerPtr is null");
    }

    public void resume() {
        long j = this._ptr;
        if (j != 0) {
            resumeCompiler(j);
            return;
        }
        throw new RuntimeException("TTAppCompilerPtr is null");
    }

    public void run() {
        long j = this._ptr;
        if (j != 0) {
            startCompiler(j);
            return;
        }
        throw new RuntimeException("TTAppCompilerPtr is null");
    }

    public void stop() {
        long j = this._ptr;
        if (j != 0) {
            stopCompiler(j);
            return;
        }
        throw new RuntimeException("TTAppCompilerPtr is null");
    }

    private static synchronized void loadLibs() {
        synchronized (TTAppCompiler.class) {
            if (!libs_loaded) {
                try {
                    Library.load("c++_shared");
                } catch (Throwable th) {
                    AppBrandLogger.eWithThrowable("TTAppCompiler", "library for c++_shared not loaded", th);
                }
                try {
                    Library.load("v8_libbase.cr");
                    Library.load("v8_libplatform.cr");
                    Library.load("v8.cr");
                    Library.load("helium");
                } catch (Throwable th2) {
                    AppBrandLogger.eWithThrowable("TTAppCompiler", "library for v8xxx not loaded", th2);
                }
                libs_loaded = true;
            }
        }
    }

    public boolean shouldCache(int i) {
        if (i >= this.cacheMinSize) {
            return true;
        }
        return false;
    }

    public TTAppCompiler(Callback callback2) {
        if (!libs_loaded) {
            loadLibs();
        }
        this.callback = callback2;
    }

    public boolean removeTask(int i) {
        long j = this._ptr;
        if (j != 0) {
            return removeTask(j, i);
        }
        throw new RuntimeException("TTAppCompilerPtr is null");
    }

    public void setup(ContextWrapper contextWrapper, SettingsProvider settingsProvider) {
        String str = "com.he.loader.js_cache";
        if (settingsProvider != null) {
            str = settingsProvider.getSetting(contextWrapper, TTAppLoader.Settings.CODECACHE_DIR, str);
            this.cacheMinSize = settingsProvider.getSetting(contextWrapper, TTAppLoader.Settings.CODECACHE_MINSIZE, this.cacheMinSize);
        }
        this._ptr = setupCompiler(contextWrapper.getCacheDir() + "/" + str + "/");
    }

    private void reflectedOnAsyncCompile(int i, int i2, int i3) {
        AppBrandLogger.m52830i("TTAppCompiler", "compiled, id:  " + i + ", duration: " + i2 + ", cache_size: " + i3);
        Callback callback2 = this.callback;
        if (callback2 != null) {
            callback2.onCompiled(i, i2, i3);
        }
    }

    public int queueTask(byte[] bArr, String str, boolean z, int i) {
        long j = this._ptr;
        if (j != 0) {
            return queueTask(j, bArr, str, z, i);
        }
        throw new RuntimeException("TTAppCompilerPtr is null");
    }
}
