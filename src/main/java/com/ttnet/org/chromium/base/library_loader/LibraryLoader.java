package com.ttnet.org.chromium.base.library_loader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.system.Os;
import androidx.core.content.ContextCompat;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ttnet.org.chromium.base.BuildConfig;
import com.ttnet.org.chromium.base.BuildInfo;
import com.ttnet.org.chromium.base.CommandLine;
import com.ttnet.org.chromium.base.ContextUtils;
import com.ttnet.org.chromium.base.FileUtils;
import com.ttnet.org.chromium.base.Log;
import com.ttnet.org.chromium.base.StreamUtil;
import com.ttnet.org.chromium.base.TraceEvent;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import com.ttnet.org.chromium.base.metrics.CachedMetrics;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

@JNINamespace("base::android")
public class LibraryLoader {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final boolean PLATFORM_REQUIRES_NATIVE_FALLBACK_EXTRACTION;
    private static LibraryLoader sInstance = new LibraryLoader();
    private static final CachedMetrics.EnumeratedHistogramSample sRelinkerCountHistogram = new CachedMetrics.EnumeratedHistogramSample("ChromiumAndroidLinker.RelinkerFallbackCount", 2);
    private boolean mCommandLineSwitched;
    private volatile boolean mInitialized;
    private boolean mIsUsingBrowserSharedRelros;
    private long mLibraryLoadTimeMs;
    private NativeLibraryPreloader mLibraryPreloader;
    private boolean mLibraryPreloaderCalled;
    private int mLibraryPreloaderStatus = -1;
    private int mLibraryProcessType;
    private boolean mLibraryWasLoadedFromApk;
    private boolean mLoadAtFixedAddressFailed;
    private boolean mLoaded;
    private boolean mLoadedByZygote;
    private final Object mLock = new Object();

    private native String nativeGetVersionNumber();

    private native boolean nativeLibraryLoaded(int i);

    private native void nativeRecordChromiumAndroidLinkerBrowserHistogram(long j);

    private native void nativeRecordLibraryPreloaderBrowserHistogram(int i);

    private native void nativeRegisterChromiumAndroidLinkerRendererHistogram(long j);

    private native void nativeRegisterLibraryPreloaderRendererHistogram(int i);

    public static Thread new_insert_after_java_lang_Thread_by_knot(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    public static LibraryLoader getInstance() {
        return sInstance;
    }

    private static boolean isInZipFile() {
        return NativeLibraries.sUseLibraryInZipFile;
    }

    public static boolean useCrazyLinker() {
        return NativeLibraries.sUseLinker;
    }

    public boolean isInitialized() {
        return this.mInitialized;
    }

    public boolean isLoadedByZygote() {
        return this.mLoadedByZygote;
    }

    static void incrementRelinkerCountHitHistogram() {
        sRelinkerCountHistogram.record(1);
    }

    static void incrementRelinkerCountNotHitHistogram() {
        sRelinkerCountHistogram.record(0);
    }

    public void loadNow() throws ProcessInitException {
        loadNowOverrideApplicationContext(ContextUtils.getApplicationContext());
    }

    public void preloadNow() {
        preloadNowOverrideApplicationContext(ContextUtils.getApplicationContext());
    }

    private LibraryLoader() {
    }

    private void ensureCommandLineSwitchedAlreadyLocked() {
        if (!this.mCommandLineSwitched) {
            CommandLine.enableNativeProxy();
            this.mCommandLineSwitched = true;
        }
    }

    private static File getLibraryDir() {
        return new File(ContextCompat.getCodeCacheDir(ContextUtils.getApplicationContext()), "native_libraries");
    }

    public void onNativeInitializationComplete() {
        synchronized (this.mLock) {
            recordBrowserProcessHistogramAlreadyLocked();
        }
    }

    public void switchCommandLineForWebView() {
        synchronized (this.mLock) {
            ensureCommandLineSwitchedAlreadyLocked();
        }
    }

    static {
        boolean z;
        if (Build.VERSION.SDK_INT <= 19) {
            z = true;
        } else {
            z = false;
        }
        PLATFORM_REQUIRES_NATIVE_FALLBACK_EXTRACTION = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r0 != null) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        $closeResource(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r2 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean isReachedCodeProfilerEnabled() {
        /*
            com.ttnet.org.chromium.base.StrictModeContext r0 = com.ttnet.org.chromium.base.StrictModeContext.allowDiskReads()
            android.content.SharedPreferences r1 = com.ttnet.org.chromium.base.ContextUtils.getAppSharedPreferences()     // Catch:{ all -> 0x0016 }
            java.lang.String r2 = "reached_code_profiler_enabled"
            r3 = 0
            boolean r1 = r1.getBoolean(r2, r3)     // Catch:{ all -> 0x0016 }
            if (r0 == 0) goto L_0x0015
            r2 = 0
            $closeResource(r2, r0)
        L_0x0015:
            return r1
        L_0x0016:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0018 }
        L_0x0018:
            r2 = move-exception
            if (r0 == 0) goto L_0x001e
            $closeResource(r1, r0)
        L_0x001e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.library_loader.LibraryLoader.isReachedCodeProfilerEnabled():boolean");
    }

    private void recordBrowserProcessHistogramAlreadyLocked() {
        if (useCrazyLinker()) {
            nativeRecordChromiumAndroidLinkerBrowserHistogram(this.mLibraryLoadTimeMs);
        }
        if (this.mLibraryPreloader != null) {
            nativeRecordLibraryPreloaderBrowserHistogram(this.mLibraryPreloaderStatus);
        }
    }

    public void registerRendererProcessHistogram() {
        synchronized (this.mLock) {
            if (useCrazyLinker()) {
                nativeRegisterChromiumAndroidLinkerRendererHistogram(this.mLibraryLoadTimeMs);
            }
            if (this.mLibraryPreloader != null) {
                nativeRegisterLibraryPreloaderRendererHistogram(this.mLibraryPreloaderStatus);
            }
        }
    }

    private static File makeLibraryDirAndSetPermission() {
        if (!ContextUtils.isIsolatedProcess()) {
            File codeCacheDir = ContextCompat.getCodeCacheDir(ContextUtils.getApplicationContext());
            File file = new File(codeCacheDir, "native_libraries");
            codeCacheDir.mkdir();
            codeCacheDir.setExecutable(true, false);
            file.mkdir();
            file.setExecutable(true, false);
        }
        return getLibraryDir();
    }

    public static void setEnvForNative() {
        if (BuildConfig.IS_UBSAN && Build.VERSION.SDK_INT >= 21) {
            try {
                Os.setenv("UBSAN_OPTIONS", "print_stacktrace=1 stack_trace_format='#%n pc %o %m' handle_segv=0 handle_sigbus=0 handle_sigfpe=0", true);
            } catch (Exception e) {
                Log.m264566w("LibraryLoader", "failed to set UBSAN_OPTIONS", e);
            }
        }
    }

    static /* synthetic */ void lambda$initializeAlreadyLocked$0() {
        String str = BuildInfo.getInstance().extractedFileSuffix;
        File[] listFiles = getLibraryDir().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!file.getName().contains(str)) {
                    String name = file.getName();
                    if (!file.delete()) {
                        Log.m264566w("LibraryLoader", "Unable to remove %s", name);
                    } else {
                        Log.m264557i("LibraryLoader", "Removed obsolete file %s", name);
                    }
                }
            }
        }
    }

    public static void setLibraryLoaderForTesting(LibraryLoader libraryLoader) {
        sInstance = libraryLoader;
    }

    public void initialize(int i) throws ProcessInitException {
        synchronized (this.mLock) {
            initializeAlreadyLocked(i);
        }
    }

    public void loadNowInZygote(ApplicationInfo applicationInfo) throws ProcessInitException {
        synchronized (this.mLock) {
            loadAlreadyLocked(applicationInfo, true);
            this.mLoadedByZygote = true;
        }
    }

    public void setNativeLibraryPreloader(NativeLibraryPreloader nativeLibraryPreloader) {
        synchronized (this.mLock) {
            this.mLibraryPreloader = nativeLibraryPreloader;
        }
    }

    public static void setReachedCodeProfilerEnabledOnNextRuns(boolean z) {
        ContextUtils.getAppSharedPreferences().edit().putBoolean("reached_code_profiler_enabled", z).apply();
    }

    public void ensureInitialized(int i) throws ProcessInitException {
        synchronized (this.mLock) {
            if (!this.mInitialized) {
                loadAlreadyLocked(ContextUtils.getApplicationContext().getApplicationInfo(), false);
                initializeAlreadyLocked(i);
            }
        }
    }

    public void preloadNowOverrideApplicationContext(Context context) {
        synchronized (this.mLock) {
            if (!useCrazyLinker()) {
                preloadAlreadyLocked(context.getApplicationInfo());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        if (r0 != null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        $closeResource(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void preloadAlreadyLocked(android.content.pm.ApplicationInfo r4) {
        /*
            r3 = this;
            java.lang.String r0 = "LibraryLoader.preloadAlreadyLocked"
            com.ttnet.org.chromium.base.TraceEvent r0 = com.ttnet.org.chromium.base.TraceEvent.scoped(r0)
            com.ttnet.org.chromium.base.library_loader.NativeLibraryPreloader r1 = r3.mLibraryPreloader     // Catch:{ all -> 0x001e }
            if (r1 == 0) goto L_0x0017
            boolean r2 = r3.mLibraryPreloaderCalled     // Catch:{ all -> 0x001e }
            if (r2 != 0) goto L_0x0017
            int r4 = r1.loadLibrary(r4)     // Catch:{ all -> 0x001e }
            r3.mLibraryPreloaderStatus = r4     // Catch:{ all -> 0x001e }
            r4 = 1
            r3.mLibraryPreloaderCalled = r4     // Catch:{ all -> 0x001e }
        L_0x0017:
            if (r0 == 0) goto L_0x001d
            r4 = 0
            $closeResource(r4, r0)
        L_0x001d:
            return
        L_0x001e:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0020 }
        L_0x0020:
            r1 = move-exception
            if (r0 == 0) goto L_0x0026
            $closeResource(r4, r0)
        L_0x0026:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.library_loader.LibraryLoader.preloadAlreadyLocked(android.content.pm.ApplicationInfo):void");
    }

    public void loadNowOverrideApplicationContext(Context context) throws ProcessInitException {
        synchronized (this.mLock) {
            if (this.mLoaded) {
                if (context != ContextUtils.getApplicationContext()) {
                    throw new IllegalStateException("Attempt to load again from alternate context.");
                }
            }
            loadAlreadyLocked(context.getApplicationInfo(), false);
        }
    }

    private void initializeAlreadyLocked(int i) throws ProcessInitException {
        if (!this.mInitialized) {
            this.mLibraryProcessType = i;
            if (i == 1 && isReachedCodeProfilerEnabled()) {
                CommandLine.getInstance().appendSwitch("enable-reached-code-profiler");
            }
            ensureCommandLineSwitchedAlreadyLocked();
            if (nativeLibraryLoaded(this.mLibraryProcessType)) {
                Log.m264557i("LibraryLoader", String.format("Expected native library version number \"%s\", actual native library version number \"%s\"", NativeLibraries.sVersionNumber, nativeGetVersionNumber()), new Object[0]);
                if (NativeLibraries.sVersionNumber.equals(nativeGetVersionNumber())) {
                    TraceEvent.registerNativeEnabledObserver();
                    if (i == 1 && PLATFORM_REQUIRES_NATIVE_FALLBACK_EXTRACTION) {
                        new_insert_after_java_lang_Thread_by_knot(new Thread($$Lambda$LibraryLoader$WIuzMqVOABqw5LMLjgrsyNpw69Q.INSTANCE)).start();
                    }
                    this.mInitialized = true;
                    return;
                }
                throw new ProcessInitException(3);
            }
            Log.m264556e("LibraryLoader", "error calling nativeLibraryLoaded", new Object[0]);
            throw new ProcessInitException(1);
        } else if (this.mLibraryProcessType != i) {
            throw new ProcessInitException(2);
        }
    }

    private static /* synthetic */ void $closeResource(Throwable th, AutoCloseable autoCloseable) {
        if (th != null) {
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            autoCloseable.close();
        }
    }

    static String getExtractedLibraryPath(ApplicationInfo applicationInfo, String str) {
        Log.m264566w("LibraryLoader", "Failed to load libName %s, attempting fallback extraction then trying again", str);
        return extractFileIfStale(applicationInfo, makeLibraryPathInZipFile(str, false, false), makeLibraryDirAndSetPermission());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0166, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0168, code lost:
        if (r4 != null) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x016a, code lost:
        $closeResource(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x016d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void loadAlreadyLocked(android.content.pm.ApplicationInfo r17, boolean r18) throws com.ttnet.org.chromium.base.library_loader.ProcessInitException {
        /*
        // Method dump skipped, instructions count: 374
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.library_loader.LibraryLoader.loadAlreadyLocked(android.content.pm.ApplicationInfo, boolean):void");
    }

    private void loadLibraryWithCustomLinkerAlreadyLocked(Linker linker, String str, String str2) {
        if (linker.isUsingBrowserSharedRelros()) {
            this.mIsUsingBrowserSharedRelros = true;
            try {
                linker.loadLibrary(str2);
            } catch (UnsatisfiedLinkError unused) {
                Log.m264566w("LibraryLoader", "Failed to load native library with shared RELRO, retrying without", new Object[0]);
                this.mLoadAtFixedAddressFailed = true;
                linker.loadLibraryNoFixedAddress(str2);
            }
        } else {
            linker.loadLibrary(str2);
        }
        if (str != null) {
            this.mLibraryWasLoadedFromApk = true;
        }
    }

    private static String extractFileIfStale(ApplicationInfo applicationInfo, String str, File file) {
        Throwable th;
        IOException e;
        String str2 = applicationInfo.sourceDir;
        File file2 = new File(file, new File(str).getName() + BuildInfo.getInstance().extractedFileSuffix);
        if (!file2.exists()) {
            ZipFile zipFile = null;
            try {
                ZipFile zipFile2 = new ZipFile(str2);
                try {
                    ZipEntry entry = zipFile2.getEntry(str);
                    if (entry != null) {
                        FileUtils.copyStreamToFile(zipFile2.getInputStream(entry), file2);
                        file2.setReadable(true, false);
                        file2.setExecutable(true, false);
                        StreamUtil.closeQuietly(zipFile2);
                    } else {
                        throw new RuntimeException("Cannot find ZipEntry" + str);
                    }
                } catch (IOException e2) {
                    e = e2;
                    zipFile = zipFile2;
                    try {
                        throw new RuntimeException(e);
                    } catch (Throwable th2) {
                        th = th2;
                        StreamUtil.closeQuietly(zipFile);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    zipFile = zipFile2;
                    StreamUtil.closeQuietly(zipFile);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                throw new RuntimeException(e);
            }
        }
        return file2.getAbsolutePath();
    }

    public static String makeLibraryPathInZipFile(String str, boolean z, boolean z2) {
        String str2;
        String str3;
        int i = NativeLibraries.sCpuFamily;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new RuntimeException("Unknown CPU ABI for native libraries");
                } else if (z2) {
                    str2 = "x86_64";
                } else {
                    str2 = "x86";
                }
            } else if (z2) {
                str2 = "mips64";
            } else {
                str2 = "mips";
            }
        } else if (z2) {
            str2 = "arm64-v8a";
        } else {
            str2 = "armeabi-v7a";
        }
        if (z) {
            str3 = "crazy.";
        } else {
            str3 = "";
        }
        return String.format("lib/%s/%s%s", str2, str3, System.mapLibraryName(str));
    }
}
