package com.facebook.soloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import com.C1711a;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.annotation.Nullable;

public class SoLoader {
    static final boolean SYSTRACE_LIBRARY_LOADING;
    @Nullable
    private static ApplicationSoSource sApplicationSoSource;
    @Nullable
    private static UnpackingSoSource[] sBackupSoSources;
    private static int sFlags;
    private static final Set<String> sLoadedAndMergedLibraries = Collections.newSetFromMap(new ConcurrentHashMap());
    private static final HashSet<String> sLoadedLibraries = new HashSet<>();
    private static final Map<String, Object> sLoadingLibraries = new HashMap();
    @Nullable
    static SoFileLoader sSoFileLoader;
    @Nullable
    private static SoSource[] sSoSources = null;
    private static final ReentrantReadWriteLock sSoSourcesLock = new ReentrantReadWriteLock();
    private static int sSoSourcesVersion = 0;
    @Nullable
    private static SystemLoadLibraryWrapper sSystemLoadLibraryWrapper = null;

    /* access modifiers changed from: private */
    public static class Api14Utils {
        private Api14Utils() {
        }

        public static String getClassLoaderLdLoadLibrary() {
            ClassLoader classLoader = SoLoader.class.getClassLoader();
            if (classLoader instanceof BaseDexClassLoader) {
                try {
                    return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke((BaseDexClassLoader) classLoader, new Object[0]);
                } catch (Exception e) {
                    throw new RuntimeException("Cannot call getLdLibraryPath", e);
                }
            } else {
                throw new IllegalStateException("ClassLoader " + classLoader.getClass().getName() + " should be of type BaseDexClassLoader");
            }
        }
    }

    public static void deinitForTest() {
        setSoSources(null);
    }

    public static void setInTestMode() {
        setSoSources(new SoSource[]{new NoopSoSource()});
    }

    static void resetStatus() {
        synchronized (SoLoader.class) {
            sLoadedLibraries.clear();
            sLoadingLibraries.clear();
            sSoFileLoader = null;
        }
        setSoSources(null);
    }

    static {
        boolean z = false;
        try {
            if (Build.VERSION.SDK_INT >= 18) {
                z = true;
            }
        } catch (NoClassDefFoundError | UnsatisfiedLinkError unused) {
        }
        SYSTRACE_LIBRARY_LOADING = z;
    }

    private static void assertInitialized() {
        ReentrantReadWriteLock reentrantReadWriteLock = sSoSourcesLock;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (sSoSources != null) {
                reentrantReadWriteLock.readLock().unlock();
                return;
            }
            throw new RuntimeException("SoLoader.init() not yet called");
        } catch (Throwable th) {
            sSoSourcesLock.readLock().unlock();
            throw th;
        }
    }

    @Nullable
    private static Method getNativeLoadRuntimeMethod() {
        if (Build.VERSION.SDK_INT >= 23 && Build.VERSION.SDK_INT <= 27) {
            try {
                Method declaredMethod = Runtime.class.getDeclaredMethod("nativeLoad", String.class, ClassLoader.class, String.class);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (NoSuchMethodException | SecurityException e) {
                Log.w("SoLoader", "Cannot get nativeLoad method", e);
            }
        }
        return null;
    }

    private static int makePrepareFlags() {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = sSoSourcesLock;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if ((sFlags & 2) != 0) {
                i = 1;
            } else {
                i = 0;
            }
            reentrantReadWriteLock.writeLock().unlock();
            return i;
        } catch (Throwable th) {
            sSoSourcesLock.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public static boolean areSoSourcesAbisSupported() {
        ReentrantReadWriteLock reentrantReadWriteLock = sSoSourcesLock;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (sSoSources != null) {
                String[] supportedAbis = SysUtil.getSupportedAbis();
                int i = 0;
                loop0:
                while (true) {
                    SoSource[] soSourceArr = sSoSources;
                    if (i < soSourceArr.length) {
                        String[] soSourceAbis = soSourceArr[i].getSoSourceAbis();
                        for (int i2 = 0; i2 < soSourceAbis.length; i2++) {
                            boolean z = false;
                            for (int i3 = 0; i3 < supportedAbis.length && !z; i3++) {
                                z = soSourceAbis[i2].equals(supportedAbis[i3]);
                            }
                            if (!z) {
                                Log.e("SoLoader", "abi not supported: " + soSourceAbis[i2]);
                                reentrantReadWriteLock = sSoSourcesLock;
                                break loop0;
                            }
                        }
                        i++;
                    } else {
                        sSoSourcesLock.readLock().unlock();
                        return true;
                    }
                }
            }
            reentrantReadWriteLock.readLock().unlock();
            return false;
        } catch (Throwable th) {
            sSoSourcesLock.readLock().unlock();
            throw th;
        }
    }

    public static String makeLdLibraryPath() {
        SoSource[] soSourceArr;
        sSoSourcesLock.readLock().lock();
        try {
            assertInitialized();
            Log.d("SoLoader", "makeLdLibraryPath");
            ArrayList arrayList = new ArrayList();
            for (SoSource soSource : sSoSources) {
                soSource.addToLdLibraryPath(arrayList);
            }
            String join = TextUtils.join(":", arrayList);
            Log.d("SoLoader", "makeLdLibraryPath final path: " + join);
            return join;
        } finally {
            sSoSourcesLock.readLock().unlock();
        }
    }

    static void setSoFileLoader(SoFileLoader soFileLoader) {
        sSoFileLoader = soFileLoader;
    }

    public static void setSystemLoadLibraryWrapper(SystemLoadLibraryWrapper systemLoadLibraryWrapper) {
        sSystemLoadLibraryWrapper = systemLoadLibraryWrapper;
    }

    public static boolean loadLibrary(String str) {
        return loadLibrary(str, 0);
    }

    public static final class WrongAbiError extends UnsatisfiedLinkError {
        WrongAbiError(Throwable th) {
            super("APK was built for a different platform");
            initCause(th);
        }
    }

    public static File unpackLibraryAndDependencies(String str) throws UnsatisfiedLinkError {
        assertInitialized();
        try {
            return unpackLibraryBySoName(System.mapLibraryName(str));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static synchronized void initSoLoader(@Nullable SoFileLoader soFileLoader) {
        final boolean z;
        final String str;
        synchronized (SoLoader.class) {
            if (soFileLoader != null) {
                sSoFileLoader = soFileLoader;
                return;
            }
            final Runtime runtime = Runtime.getRuntime();
            final Method nativeLoadRuntimeMethod = getNativeLoadRuntimeMethod();
            if (nativeLoadRuntimeMethod != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = Api14Utils.getClassLoaderLdLoadLibrary();
            } else {
                str = null;
            }
            final String makeNonZipPath = makeNonZipPath(str);
            sSoFileLoader = new SoFileLoader() {
                /* class com.facebook.soloader.SoLoader.C212711 */

                /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
                    r0 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
                    r1.close();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
                    r1 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
                    r7.addSuppressed(r1);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
                    throw r0;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                private java.lang.String getLibHash(java.lang.String r7) {
                    /*
                        r6 = this;
                        java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                        r0.<init>(r7)     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                        java.lang.String r7 = "MD5"
                        java.security.MessageDigest r7 = java.security.MessageDigest.getInstance(r7)     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                        java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                        r1.<init>(r0)     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                        r0 = 4096(0x1000, float:5.74E-42)
                        byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0037 }
                    L_0x0014:
                        int r2 = r1.read(r0)     // Catch:{ all -> 0x0037 }
                        r3 = 0
                        if (r2 <= 0) goto L_0x001f
                        r7.update(r0, r3, r2)     // Catch:{ all -> 0x0037 }
                        goto L_0x0014
                    L_0x001f:
                        java.lang.String r0 = "%32x"
                        r2 = 1
                        java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x0037 }
                        java.math.BigInteger r5 = new java.math.BigInteger     // Catch:{ all -> 0x0037 }
                        byte[] r7 = r7.digest()     // Catch:{ all -> 0x0037 }
                        r5.<init>(r2, r7)     // Catch:{ all -> 0x0037 }
                        r4[r3] = r5     // Catch:{ all -> 0x0037 }
                        java.lang.String r7 = java.lang.String.format(r0, r4)     // Catch:{ all -> 0x0037 }
                        r1.close()
                        goto L_0x0054
                    L_0x0037:
                        r7 = move-exception
                        throw r7     // Catch:{ all -> 0x0039 }
                    L_0x0039:
                        r0 = move-exception
                        r1.close()     // Catch:{ all -> 0x003e }
                        goto L_0x0042
                    L_0x003e:
                        r1 = move-exception
                        r7.addSuppressed(r1)
                    L_0x0042:
                        throw r0
                    L_0x0043:
                        r7 = move-exception
                        java.lang.String r7 = r7.toString()
                        goto L_0x0054
                    L_0x0049:
                        r7 = move-exception
                        java.lang.String r7 = r7.toString()
                        goto L_0x0054
                    L_0x004f:
                        r7 = move-exception
                        java.lang.String r7 = r7.toString()
                    L_0x0054:
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.C212711.getLibHash(java.lang.String):java.lang.String");
                }

                /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
                    if (r1 == null) goto L_?;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
                    android.util.Log.e("SoLoader", "Error when loading lib: " + r1 + " lib hash: " + getLibHash(r9) + " search path is " + r10);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
                    return;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
                    return;
                 */
                /* JADX WARNING: Removed duplicated region for block: B:38:0x009e  */
                @Override // com.facebook.soloader.SoFileLoader
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void load(java.lang.String r9, int r10) {
                    /*
                    // Method dump skipped, instructions count: 205
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.C212711.load(java.lang.String, int):void");
                }
            };
        }
    }

    @Nullable
    public static String makeNonZipPath(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(":");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            if (!str2.contains("!")) {
                arrayList.add(str2);
            }
        }
        return TextUtils.join(":", arrayList);
    }

    static void setSoSources(SoSource[] soSourceArr) {
        ReentrantReadWriteLock reentrantReadWriteLock = sSoSourcesLock;
        reentrantReadWriteLock.writeLock().lock();
        try {
            sSoSources = soSourceArr;
            sSoSourcesVersion++;
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            sSoSourcesLock.writeLock().unlock();
            throw th;
        }
    }

    static File unpackLibraryBySoName(String str) throws IOException {
        sSoSourcesLock.readLock().lock();
        int i = 0;
        while (true) {
            try {
                SoSource[] soSourceArr = sSoSources;
                if (i < soSourceArr.length) {
                    File unpackLibrary = soSourceArr[i].unpackLibrary(str);
                    if (unpackLibrary != null) {
                        return unpackLibrary;
                    }
                    i++;
                } else {
                    sSoSourcesLock.readLock().unlock();
                    throw new FileNotFoundException(str);
                }
            } finally {
                sSoSourcesLock.readLock().unlock();
            }
        }
    }

    public static void prependSoSource(SoSource soSource) throws IOException {
        ReentrantReadWriteLock reentrantReadWriteLock = sSoSourcesLock;
        reentrantReadWriteLock.writeLock().lock();
        try {
            Log.d("SoLoader", "Prepending to SO sources: " + soSource);
            assertInitialized();
            soSource.prepare(makePrepareFlags());
            SoSource[] soSourceArr = sSoSources;
            SoSource[] soSourceArr2 = new SoSource[(soSourceArr.length + 1)];
            soSourceArr2[0] = soSource;
            System.arraycopy(soSourceArr, 0, soSourceArr2, 1, soSourceArr.length);
            sSoSources = soSourceArr2;
            sSoSourcesVersion++;
            Log.d("SoLoader", "Prepended to SO sources: " + soSource);
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            sSoSourcesLock.writeLock().unlock();
            throw th;
        }
    }

    public static void init(Context context, int i) throws IOException {
        init(context, i, null);
    }

    public static void init(Context context, boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        try {
            init(context, i);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean loadLibrary(String str, int i) throws UnsatisfiedLinkError {
        String str2;
        boolean z;
        ReentrantReadWriteLock reentrantReadWriteLock = sSoSourcesLock;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (sSoSources == null) {
                if ("http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                    assertInitialized();
                } else {
                    synchronized (SoLoader.class) {
                        z = !sLoadedLibraries.contains(str);
                        if (z) {
                            SystemLoadLibraryWrapper systemLoadLibraryWrapper = sSystemLoadLibraryWrapper;
                            if (systemLoadLibraryWrapper != null) {
                                systemLoadLibraryWrapper.loadLibrary(str);
                            } else {
                                C1711a.m7628a(str);
                            }
                        }
                    }
                    reentrantReadWriteLock.readLock().unlock();
                    return z;
                }
            }
            reentrantReadWriteLock.readLock().unlock();
            String mapLibName = MergedSoMapping.mapLibName(str);
            if (mapLibName != null) {
                str2 = mapLibName;
            } else {
                str2 = str;
            }
            return loadLibraryBySoName(System.mapLibraryName(str2), str, mapLibName, i | 2, null);
        } catch (Throwable th) {
            sSoSourcesLock.readLock().unlock();
            throw th;
        }
    }

    static void loadLibraryBySoName(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        loadLibraryBySoName(str, null, null, i, threadPolicy);
    }

    private static void init(Context context, int i, @Nullable SoFileLoader soFileLoader) throws IOException {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            initSoLoader(soFileLoader);
            initSoSources(context, i, soFileLoader);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        }
    }

    /* JADX INFO: finally extract failed */
    private static void doLoadLibraryBySoName(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        boolean z;
        boolean z2;
        ReentrantReadWriteLock reentrantReadWriteLock = sSoSourcesLock;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (sSoSources != null) {
                reentrantReadWriteLock.readLock().unlock();
                if (threadPolicy == null) {
                    threadPolicy = StrictMode.allowThreadDiskReads();
                    z = true;
                } else {
                    z = false;
                }
                if (SYSTRACE_LIBRARY_LOADING) {
                    Api18TraceUtils.beginTraceSection("SoLoader.loadLibrary[" + str + "]");
                }
                int i2 = 0;
                do {
                    try {
                        sSoSourcesLock.readLock().lock();
                        int i3 = sSoSourcesVersion;
                        int i4 = 0;
                        while (true) {
                            if (i2 != 0) {
                                break;
                            }
                            try {
                                SoSource[] soSourceArr = sSoSources;
                                if (i4 < soSourceArr.length) {
                                    i2 = soSourceArr[i4].loadLibrary(str, i, threadPolicy);
                                    if (i2 == 3 && sBackupSoSources != null) {
                                        Log.d("SoLoader", "Trying backup SoSource for " + str);
                                        UnpackingSoSource[] unpackingSoSourceArr = sBackupSoSources;
                                        int length = unpackingSoSourceArr.length;
                                        int i5 = 0;
                                        while (true) {
                                            if (i5 >= length) {
                                                break;
                                            }
                                            UnpackingSoSource unpackingSoSource = unpackingSoSourceArr[i5];
                                            unpackingSoSource.prepare(str);
                                            int loadLibrary = unpackingSoSource.loadLibrary(str, i, threadPolicy);
                                            if (loadLibrary == 1) {
                                                i2 = loadLibrary;
                                                break;
                                            }
                                            i5++;
                                        }
                                    } else {
                                        i4++;
                                    }
                                } else {
                                    break;
                                }
                            } catch (Throwable th) {
                                sSoSourcesLock.readLock().unlock();
                                throw th;
                            }
                        }
                        ReentrantReadWriteLock reentrantReadWriteLock2 = sSoSourcesLock;
                        reentrantReadWriteLock2.readLock().unlock();
                        if ((i & 2) == 2 && i2 == 0) {
                            reentrantReadWriteLock2.writeLock().lock();
                            try {
                                ApplicationSoSource applicationSoSource = sApplicationSoSource;
                                if (applicationSoSource != null && applicationSoSource.checkAndMaybeUpdate()) {
                                    sSoSourcesVersion++;
                                }
                                if (sSoSourcesVersion != i3) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                reentrantReadWriteLock2.writeLock().unlock();
                                continue;
                            } catch (Throwable th2) {
                                sSoSourcesLock.writeLock().unlock();
                                throw th2;
                            }
                        } else {
                            z2 = false;
                            continue;
                        }
                    } catch (Throwable th3) {
                        if (SYSTRACE_LIBRARY_LOADING) {
                            Api18TraceUtils.endSection();
                        }
                        if (z) {
                            StrictMode.setThreadPolicy(threadPolicy);
                        }
                        if (i2 == 0 || i2 == 3) {
                            String str2 = "couldn't find DSO to load: " + str;
                            String message = th3.getMessage();
                            if (message == null) {
                                message = th3.toString();
                            }
                            String str3 = str2 + " caused by: " + message;
                            Log.e("SoLoader", str3);
                            throw new UnsatisfiedLinkError(str3);
                        }
                        return;
                    }
                } while (z2);
                if (SYSTRACE_LIBRARY_LOADING) {
                    Api18TraceUtils.endSection();
                }
                if (z) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                if (i2 == 0 || i2 == 3) {
                    String str4 = "couldn't find DSO to load: " + str;
                    Log.e("SoLoader", str4);
                    throw new UnsatisfiedLinkError(str4);
                }
                return;
            }
            Log.e("SoLoader", "Could not load: " + str + " because no SO source exists");
            throw new UnsatisfiedLinkError("couldn't find DSO to load: " + str);
        } catch (Throwable th4) {
            sSoSourcesLock.readLock().unlock();
            throw th4;
        }
    }

    private static void initSoSources(Context context, int i, @Nullable SoFileLoader soFileLoader) throws IOException {
        boolean z;
        int i2;
        int i3;
        sSoSourcesLock.writeLock().lock();
        try {
            if (sSoSources == null) {
                Log.d("SoLoader", "init start");
                sFlags = i;
                ArrayList arrayList = new ArrayList();
                String str = System.getenv("LD_LIBRARY_PATH");
                if (str == null) {
                    str = "/vendor/lib:/system/lib";
                }
                String[] split = str.split(":");
                for (int i4 = 0; i4 < split.length; i4++) {
                    Log.d("SoLoader", "adding system library source: " + split[i4]);
                    arrayList.add(new DirectorySoSource(new File(split[i4]), 2));
                }
                if (context != null) {
                    if ((i & 1) != 0) {
                        sBackupSoSources = null;
                        Log.d("SoLoader", "adding exo package source: lib-main");
                        arrayList.add(0, new ExoSoSource(context, "lib-main"));
                    } else {
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if ((applicationInfo.flags & 1) == 0 || (applicationInfo.flags & SmActions.ACTION_ONTHECALL_EXIT) != 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            i2 = 0;
                        } else {
                            if (Build.VERSION.SDK_INT <= 17) {
                                i3 = 1;
                            } else {
                                i3 = 0;
                            }
                            sApplicationSoSource = new ApplicationSoSource(context, i3);
                            Log.d("SoLoader", "adding application source: " + sApplicationSoSource.toString());
                            arrayList.add(0, sApplicationSoSource);
                            i2 = 1;
                        }
                        if ((sFlags & 8) != 0) {
                            sBackupSoSources = null;
                        } else {
                            File file = new File(context.getApplicationInfo().sourceDir);
                            ArrayList arrayList2 = new ArrayList();
                            ApkSoSource apkSoSource = new ApkSoSource(context, file, "lib-main", i2);
                            arrayList2.add(apkSoSource);
                            Log.d("SoLoader", "adding backup source from : " + apkSoSource.toString());
                            if (Build.VERSION.SDK_INT >= 21 && context.getApplicationInfo().splitSourceDirs != null) {
                                Log.d("SoLoader", "adding backup sources from split apks");
                                String[] strArr = context.getApplicationInfo().splitSourceDirs;
                                int length = strArr.length;
                                int i5 = 0;
                                int i6 = 0;
                                while (i5 < length) {
                                    File file2 = new File(strArr[i5]);
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("lib-");
                                    sb.append(i6);
                                    ApkSoSource apkSoSource2 = new ApkSoSource(context, file2, sb.toString(), i2);
                                    Log.d("SoLoader", "adding backup source: " + apkSoSource2.toString());
                                    arrayList2.add(apkSoSource2);
                                    i5++;
                                    i6++;
                                }
                            }
                            sBackupSoSources = (UnpackingSoSource[]) arrayList2.toArray(new UnpackingSoSource[arrayList2.size()]);
                            arrayList.addAll(0, arrayList2);
                        }
                    }
                }
                SoSource[] soSourceArr = (SoSource[]) arrayList.toArray(new SoSource[arrayList.size()]);
                int makePrepareFlags = makePrepareFlags();
                int length2 = soSourceArr.length;
                while (true) {
                    int i7 = length2 - 1;
                    if (length2 <= 0) {
                        break;
                    }
                    Log.d("SoLoader", "Preparing SO source: " + soSourceArr[i7]);
                    soSourceArr[i7].prepare(makePrepareFlags);
                    length2 = i7;
                }
                sSoSources = soSourceArr;
                sSoSourcesVersion++;
                Log.d("SoLoader", "init finish: " + sSoSources.length + " SO sources prepared");
            }
        } finally {
            Log.d("SoLoader", "init exiting");
            sSoSourcesLock.writeLock().unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        if (r3 != false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        monitor-enter(com.facebook.soloader.SoLoader.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0042, code lost:
        if (r1.contains(r9) == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0044, code lost:
        if (r11 != null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0046, code lost:
        monitor-exit(com.facebook.soloader.SoLoader.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0047, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0048, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0049, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004a, code lost:
        monitor-exit(com.facebook.soloader.SoLoader.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004b, code lost:
        if (r3 != false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        android.util.Log.d("SoLoader", "About to load: " + r9);
        doLoadLibraryBySoName(r9, r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0066, code lost:
        monitor-enter(com.facebook.soloader.SoLoader.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        android.util.Log.d("SoLoader", "Loaded: " + r9);
        r1.add(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0080, code lost:
        monitor-exit(com.facebook.soloader.SoLoader.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0085, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0086, code lost:
        r10 = r9.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x008a, code lost:
        if (r10 == null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0099, code lost:
        throw new com.facebook.soloader.SoLoader.WrongAbiError(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x009a, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x009b, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00a1, code lost:
        throw new java.lang.RuntimeException(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00a9, code lost:
        if (android.text.TextUtils.isEmpty(r10) != false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00b1, code lost:
        if (com.facebook.soloader.SoLoader.sLoadedAndMergedLibraries.contains(r10) == false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00b3, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00b4, code lost:
        if (r11 == null) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00b6, code lost:
        if (r2 != false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00b8, code lost:
        r11 = com.facebook.soloader.SoLoader.SYSTRACE_LIBRARY_LOADING;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00ba, code lost:
        if (r11 == false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00bc, code lost:
        com.facebook.soloader.Api18TraceUtils.beginTraceSection("MergedSoMapping.invokeJniOnload[" + r10 + "]");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        android.util.Log.d("SoLoader", "About to merge: " + r10 + " / " + r9);
        com.facebook.soloader.MergedSoMapping.invokeJniOnload(r10);
        com.facebook.soloader.SoLoader.sLoadedAndMergedLibraries.add(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00fb, code lost:
        if (r11 == false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00fd, code lost:
        com.facebook.soloader.Api18TraceUtils.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0101, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0104, code lost:
        if (com.facebook.soloader.SoLoader.SYSTRACE_LIBRARY_LOADING != false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0106, code lost:
        com.facebook.soloader.Api18TraceUtils.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0109, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x010a, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x010d, code lost:
        return !r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean loadLibraryBySoName(java.lang.String r9, @javax.annotation.Nullable java.lang.String r10, @javax.annotation.Nullable java.lang.String r11, int r12, @javax.annotation.Nullable android.os.StrictMode.ThreadPolicy r13) {
        /*
        // Method dump skipped, instructions count: 276
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.loadLibraryBySoName(java.lang.String, java.lang.String, java.lang.String, int, android.os.StrictMode$ThreadPolicy):boolean");
    }
}
