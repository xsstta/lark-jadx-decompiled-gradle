package com.ttnet.org.chromium.base;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Environment;
import android.system.Os;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ttnet.org.chromium.base.task.AsyncTask;
import java.io.File;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class PathUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static String sCacheSubDirectory;
    private static String sDataDirectorySuffix;
    private static FutureTask<String[]> sDirPathFetchTask;
    private static final AtomicBoolean sInitializationStarted = new AtomicBoolean();

    /* access modifiers changed from: private */
    public static class Holder {
        public static final String[] DIRECTORY_PATHS = PathUtils.getOrComputeDirectoryPaths();

        private Holder() {
        }
    }

    private PathUtils() {
    }

    public static String getCacheDirectory() {
        return getDirectoryPath(2);
    }

    public static String getDataDirectory() {
        return getDirectoryPath(0);
    }

    public static String getThumbnailCacheDirectory() {
        return getDirectoryPath(1);
    }

    public static String getExternalStorageDirectory() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    private static String getNativeLibraryDirectory() {
        ApplicationInfo applicationInfo = ContextUtils.getApplicationContext().getApplicationInfo();
        if ((applicationInfo.flags & SmActions.ACTION_ONTHECALL_EXIT) != 0 || (applicationInfo.flags & 1) == 0) {
            return applicationInfo.nativeLibraryDir;
        }
        return "/system/lib/";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        if (r0 != null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
        $closeResource(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getDownloadsDirectory() {
        /*
            com.ttnet.org.chromium.base.StrictModeContext r0 = com.ttnet.org.chromium.base.StrictModeContext.allowDiskReads()
            boolean r1 = com.ttnet.org.chromium.base.BuildInfo.isAtLeastQ()     // Catch:{ all -> 0x0028 }
            r2 = 0
            if (r1 == 0) goto L_0x0018
            java.lang.String[] r1 = getAllPrivateDownloadsDirectories()     // Catch:{ all -> 0x0028 }
            r3 = 0
            r1 = r1[r3]     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x0017
            $closeResource(r2, r0)
        L_0x0017:
            return r1
        L_0x0018:
            java.lang.String r1 = android.os.Environment.DIRECTORY_DOWNLOADS
            java.io.File r1 = android.os.Environment.getExternalStoragePublicDirectory(r1)
            java.lang.String r1 = r1.getPath()
            if (r0 == 0) goto L_0x0027
            $closeResource(r2, r0)
        L_0x0027:
            return r1
        L_0x0028:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002a }
        L_0x002a:
            r2 = move-exception
            if (r0 == 0) goto L_0x0030
            $closeResource(r1, r0)
        L_0x0030:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.PathUtils.getDownloadsDirectory():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        if (r1 != null) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001d, code lost:
        $closeResource(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0020, code lost:
        throw r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String[] getOrComputeDirectoryPaths() {
        /*
            r0 = 0
            java.util.concurrent.FutureTask<java.lang.String[]> r1 = com.ttnet.org.chromium.base.PathUtils.sDirPathFetchTask
            r2 = 0
            boolean r1 = r1.cancel(r2)
            if (r1 == 0) goto L_0x0021
            com.ttnet.org.chromium.base.StrictModeContext r1 = com.ttnet.org.chromium.base.StrictModeContext.allowDiskWrites()
            java.lang.String[] r2 = setPrivateDataDirectorySuffixInternal()     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x0017
            $closeResource(r0, r1)     // Catch:{ InterruptedException | ExecutionException -> 0x002a }
        L_0x0017:
            return r2
        L_0x0018:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x001a }
        L_0x001a:
            r3 = move-exception
            if (r1 == 0) goto L_0x0020
            $closeResource(r2, r1)
        L_0x0020:
            throw r3
        L_0x0021:
            java.util.concurrent.FutureTask<java.lang.String[]> r1 = com.ttnet.org.chromium.base.PathUtils.sDirPathFetchTask
            java.lang.Object r1 = r1.get()
            java.lang.String[] r1 = (java.lang.String[]) r1
            return r1
        L_0x002a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.PathUtils.getOrComputeDirectoryPaths():java.lang.String[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r0 != null) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        $closeResource(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String[] getAllPrivateDownloadsDirectories() {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 19
            if (r0 < r2) goto L_0x0025
            com.ttnet.org.chromium.base.StrictModeContext r0 = com.ttnet.org.chromium.base.StrictModeContext.allowDiskWrites()
            r2 = 0
            android.content.Context r3 = com.ttnet.org.chromium.base.ContextUtils.getApplicationContext()     // Catch:{ all -> 0x001c }
            java.lang.String r4 = android.os.Environment.DIRECTORY_DOWNLOADS     // Catch:{ all -> 0x001c }
            java.io.File[] r3 = r3.getExternalFilesDirs(r4)     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x002e
            $closeResource(r2, r0)
            goto L_0x002e
        L_0x001c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001e }
        L_0x001e:
            r2 = move-exception
            if (r0 == 0) goto L_0x0024
            $closeResource(r1, r0)
        L_0x0024:
            throw r2
        L_0x0025:
            r0 = 1
            java.io.File[] r3 = new java.io.File[r0]
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            r3[r1] = r0
        L_0x002e:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0033:
            int r2 = r3.length
            if (r1 >= r2) goto L_0x0053
            r2 = r3[r1]
            if (r2 == 0) goto L_0x0050
            r2 = r3[r1]
            java.lang.String r2 = r2.getAbsolutePath()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0047
            goto L_0x0050
        L_0x0047:
            r2 = r3[r1]
            java.lang.String r2 = r2.getAbsolutePath()
            r0.add(r2)
        L_0x0050:
            int r1 = r1 + 1
            goto L_0x0033
        L_0x0053:
            int r1 = r0.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.PathUtils.getAllPrivateDownloadsDirectories():java.lang.String[]");
    }

    /* access modifiers changed from: private */
    public static String[] setPrivateDataDirectorySuffixInternal() {
        String[] strArr = new String[3];
        Context applicationContext = ContextUtils.getApplicationContext();
        strArr[0] = applicationContext.getDir(sDataDirectorySuffix, 0).getPath();
        chmod(strArr[0], 448);
        strArr[1] = applicationContext.getDir("textures", 0).getPath();
        if (applicationContext.getCacheDir() != null) {
            if (sCacheSubDirectory == null) {
                strArr[2] = applicationContext.getCacheDir().getPath();
            } else {
                strArr[2] = new File(applicationContext.getCacheDir(), sCacheSubDirectory).getPath();
            }
        }
        return strArr;
    }

    private static String getDirectoryPath(int i) {
        return Holder.DIRECTORY_PATHS[i];
    }

    public static void setPrivateDataDirectorySuffix(String str) {
        setPrivateDataDirectorySuffix(str, null);
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

    public static void setPrivateDataDirectorySuffix(String str, String str2) {
        if (!sInitializationStarted.getAndSet(true)) {
            sDataDirectorySuffix = str;
            sCacheSubDirectory = str2;
            sDirPathFetchTask = new FutureTask<>($$Lambda$PathUtils$XRW9o94x1PPFTEKigy_G0WBug.INSTANCE);
            AsyncTask.THREAD_POOL_EXECUTOR.execute(sDirPathFetchTask);
        }
    }

    private static void chmod(String str, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                Os.chmod(str, i);
            } catch (Exception unused) {
                Log.m264556e("PathUtils", "Failed to set permissions for path \"" + str + "\"", new Object[0]);
            }
        }
    }
}
