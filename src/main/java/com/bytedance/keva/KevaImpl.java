package com.bytedance.keva;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import com.bytedance.keva.Keva;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public abstract class KevaImpl extends Keva {
    static final Executor sExecutor;
    static final KevaMonitor sMonitor;
    public static final String sPortedSpRepoName;
    private static final HashMap<String, Keva> sRepoMap = new HashMap<>();
    private static final File sSharedPrefsDir;
    private final List<Keva.OnChangeListener> mChangeListeners = new ArrayList();
    private List<KevaValueWrapper> mDuplicatedOldWrappers = new ArrayList();
    volatile long mHandle;
    private final boolean mIsMultiProcess;
    private final int mMode;
    public final String mName;
    final HashMap<String, KevaValueWrapper> mValueMap = new HashMap<>();

    protected interface PrivateConstants {
    }

    static native void checkReportException(long j);

    private static native void clear(long j);

    private static native boolean delete(String str);

    private native void dump(long j);

    private native void erase(long j, String str, long j2);

    private native void eraseUnusedChunk(long j, long j2);

    private static native void initialize(String str);

    private native long loadRepo(String str, int i, boolean z);

    private native int protectPortingInterProcess(String str, boolean z, int i);

    private native long storeBoolean(long j, String str, long j2, boolean z);

    private native long storeBytes(long j, String str, long j2, byte[] bArr, int i);

    private native long storeDouble(long j, String str, long j2, double d);

    private native long storeFloat(long j, String str, long j2, float f);

    private native long storeInt(long j, String str, long j2, int i);

    private native long storeLong(long j, String str, long j2, long j3);

    private native long storeString(long j, String str, long j2, String str2);

    private native long storeStringArray(long j, String str, long j2, String[] strArr, int i);

    /* access modifiers changed from: package-private */
    public native boolean contains(long j, String str, long j2);

    /* access modifiers changed from: package-private */
    public native boolean fetchBoolean(long j, String str, long j2, boolean z);

    /* access modifiers changed from: protected */
    public abstract boolean fetchBoolean(String str, boolean z);

    /* access modifiers changed from: package-private */
    public native byte[] fetchBytes(long j, String str, long j2, byte[] bArr, int i);

    /* access modifiers changed from: protected */
    public abstract byte[] fetchBytes(String str, byte[] bArr, int i, boolean z);

    /* access modifiers changed from: package-private */
    public native double fetchDouble(long j, String str, long j2, double d);

    /* access modifiers changed from: protected */
    public abstract double fetchDouble(String str, double d);

    /* access modifiers changed from: package-private */
    public native float fetchFloat(long j, String str, long j2, float f);

    /* access modifiers changed from: protected */
    public abstract float fetchFloat(String str, float f);

    /* access modifiers changed from: package-private */
    public native int fetchInt(long j, String str, long j2, int i);

    /* access modifiers changed from: protected */
    public abstract int fetchInt(String str, int i);

    /* access modifiers changed from: package-private */
    public native long fetchLong(long j, String str, long j2, long j3);

    /* access modifiers changed from: protected */
    public abstract long fetchLong(String str, long j);

    /* access modifiers changed from: package-private */
    public native String fetchString(long j, String str, long j2, String str2);

    /* access modifiers changed from: protected */
    public abstract String fetchString(String str, String str2, boolean z);

    /* access modifiers changed from: package-private */
    public native String[] fetchStringArray(long j, String str, long j2, String[] strArr, int i);

    /* access modifiers changed from: protected */
    public abstract String[] fetchStringArray(String str, String[] strArr, boolean z);

    /* access modifiers changed from: package-private */
    public native void rebuildValueMap(long j);

    /* access modifiers changed from: package-private */
    public static class KevaValueWrapper {
        volatile boolean loaded;
        volatile long offset;
        volatile int type;
        volatile Object value;

        KevaValueWrapper() {
        }
    }

    /* access modifiers changed from: private */
    public static class PortedSpRepoHolder {
        public static final KevaImpl sInstance;
        public static final Map<String, ?> sPortedSpMap;

        private PortedSpRepoHolder() {
        }

        static {
            KevaMultiProcessImpl kevaMultiProcessImpl = new KevaMultiProcessImpl(KevaImpl.sPortedSpRepoName, 1);
            sInstance = kevaMultiProcessImpl;
            kevaMultiProcessImpl.init(true);
            sPortedSpMap = kevaMultiProcessImpl.generateOutMap();
        }
    }

    private static Keva getPortedSpRepo() {
        return PortedSpRepoHolder.sInstance;
    }

    @Override // com.bytedance.keva.Keva
    public String name() {
        return this.mName;
    }

    static void forceInitImpl() {
        Log.println(4, "Keva", "force initializing Keva");
    }

    public void dumpNative() {
        synchronized (this) {
            dump(this.mHandle);
        }
    }

    @Override // com.bytedance.keva.Keva
    public void clear() {
        synchronized (this) {
            try {
                this.mValueMap.clear();
                clear(this.mHandle);
            } catch (Throwable th) {
                sMonitor.reportThrowable(4, this.mName, null, null, th);
            }
        }
    }

    private void cleanUpAfterLoadRepo() {
        if (this.mHandle == 0) {
            KevaMonitor kevaMonitor = sMonitor;
            String str = this.mName;
            kevaMonitor.reportWarning(1, str, null, null, "free space is " + Environment.getDataDirectory().getFreeSpace());
            return;
        }
        try {
            for (KevaValueWrapper kevaValueWrapper : this.mDuplicatedOldWrappers) {
                eraseUnusedChunk(this.mHandle, kevaValueWrapper.offset);
            }
            this.mDuplicatedOldWrappers = null;
            checkReportException(this.mHandle);
        } catch (Throwable th) {
            sMonitor.reportThrowable(1, this.mName, null, null, th);
        }
    }

    static {
        Log.i("Keva", "Keva version: 1.4.7");
        KevaBuilder instance = KevaBuilder.getInstance();
        KevaBuilder.clearInstance();
        Executor executor = instance.mExecutor;
        if (executor != null) {
            sExecutor = executor;
        } else {
            int max = Math.max(Runtime.getRuntime().availableProcessors() * 2, 6);
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(max, max, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            sExecutor = threadPoolExecutor;
        }
        String str = instance.mPortedRepoName;
        if (str == null) {
            str = "keva_porting_sp";
        }
        sPortedSpRepoName = str;
        Context context = instance.mContext;
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            filesDir = new File(context.getApplicationInfo().dataDir, "files");
        }
        if (!filesDir.exists()) {
            filesDir.mkdirs();
        }
        File file = instance.mWorkDir;
        if (file == null) {
            file = new File(filesDir, "keva");
        }
        sSharedPrefsDir = new File(filesDir.getParent(), "shared_prefs");
        KevaMonitor kevaMonitor = instance.mMonitor;
        if (kevaMonitor == null) {
            kevaMonitor = new KevaMonitor();
        }
        sMonitor = kevaMonitor;
        if (!file.exists() && !file.mkdirs()) {
            kevaMonitor.reportThrowable(1, null, null, null, new IllegalStateException("fail to create work dir " + file.getPath()));
        }
        try {
            kevaMonitor.loadLibrary("keva");
            initialize(file.getAbsolutePath());
        } catch (Throwable th) {
            th.printStackTrace();
            KevaMonitor kevaMonitor2 = sMonitor;
            kevaMonitor2.logDebug("fail to load so and init");
            kevaMonitor2.reportThrowable(1, null, null, null, th);
        }
    }

    @Override // com.bytedance.keva.Keva
    public void dump() {
        synchronized (this) {
            KevaMonitor kevaMonitor = sMonitor;
            kevaMonitor.logDebug("start dumping keva " + this.mName + ", size=" + this.mValueMap.size());
            for (Map.Entry<String, KevaValueWrapper> entry : this.mValueMap.entrySet()) {
                KevaValueWrapper value = entry.getValue();
                KevaMonitor kevaMonitor2 = sMonitor;
                kevaMonitor2.logDebug("key: " + entry.getKey() + ", value: " + value.value + ", offset: " + value.offset + ", loaded: " + value.loaded);
            }
            KevaMonitor kevaMonitor3 = sMonitor;
            kevaMonitor3.logDebug("finish dumping keva " + this.mName + ", size=" + this.mValueMap.size());
        }
    }

    /* access modifiers changed from: package-private */
    public Map<String, ?> generateOutMap() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, KevaValueWrapper> entry : this.mValueMap.entrySet()) {
            KevaValueWrapper value = entry.getValue();
            if (value.offset != 0) {
                String key = entry.getKey();
                try {
                    if (!value.loaded) {
                        int i = value.type;
                        if (i == 6) {
                            value.value = fetchString(this.mHandle, key, value.offset, null);
                        } else if (i == 7) {
                            value.value = fetchBytes(this.mHandle, key, value.offset, null, 0);
                        } else if (i == 23) {
                            throw new UnsupportedOperationException("keva has not implemented utf8");
                        } else if (i == 39) {
                            throw new UnsupportedOperationException("keva has not implemented utf16");
                        } else if (i == 55) {
                            value.value = fetchStringArray(this.mHandle, key, value.offset, null, 3);
                        } else if (!this.mIsMultiProcess || value.type > 5) {
                            throw new UnsupportedOperationException("keva has not implemented type " + value.type);
                        }
                        if (!this.mIsMultiProcess) {
                            value.loaded = true;
                        }
                    }
                    hashMap.put(key, value.value);
                } catch (Throwable th) {
                    sMonitor.reportThrowable(2, this.mName, key, Long.valueOf(value.offset), th);
                }
            }
        }
        return hashMap;
    }

    @Override // com.bytedance.keva.Keva
    public void unRegisterChangeListener(Keva.OnChangeListener onChangeListener) {
        synchronized (this) {
            this.mChangeListeners.remove(onChangeListener);
        }
    }

    private static boolean existSharedPrefs(String str) {
        File file = sSharedPrefsDir;
        return new File(file, str + ".xml").exists();
    }

    public static boolean isRepoPorted(String str) {
        if (PortedSpRepoHolder.sPortedSpMap.get(str) != null) {
            return true;
        }
        return getPortedSpRepo().getBoolean(str, false);
    }

    private KevaValueWrapper obtainWrapperLocked(String str) {
        KevaValueWrapper kevaValueWrapper = this.mValueMap.get(str);
        if (kevaValueWrapper != null) {
            return kevaValueWrapper;
        }
        KevaValueWrapper kevaValueWrapper2 = new KevaValueWrapper();
        this.mValueMap.put(str, kevaValueWrapper2);
        return kevaValueWrapper2;
    }

    /* access modifiers changed from: package-private */
    public void init(boolean z) {
        synchronized (this) {
            if (this.mHandle == 0) {
                doLoadRepo(z);
            }
        }
    }

    @Override // com.bytedance.keva.Keva
    public void registerChangeListener(Keva.OnChangeListener onChangeListener) {
        synchronized (this) {
            if (!this.mChangeListeners.contains(onChangeListener)) {
                this.mChangeListeners.add(onChangeListener);
            }
        }
    }

    private void doLoadRepo(boolean z) {
        try {
            this.mHandle = loadRepo(this.mName, this.mMode, z);
            cleanUpAfterLoadRepo();
            if (!z) {
                sMonitor.onLoadRepo(this.mName, this.mMode);
            }
        } catch (Throwable th) {
            sMonitor.reportThrowable(1, this.mName, null, null, th);
        }
    }

    /* access modifiers changed from: package-private */
    public void checkMode(int i) {
        if (this.mHandle != 0 && this.mMode != i) {
            KevaMonitor kevaMonitor = sMonitor;
            String str = this.mName;
            kevaMonitor.reportThrowable(1, str, null, null, new IllegalStateException("mode is different: " + this.mMode + " != " + i));
        }
    }

    @Override // com.bytedance.keva.Keva
    public void erase(String str) {
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            try {
                KevaValueWrapper obtainWrapperLocked = obtainWrapperLocked(str);
                erase(this.mHandle, str, obtainWrapperLocked.offset);
                obtainWrapperLocked.value = null;
                obtainWrapperLocked.offset = 0;
                if (!this.mIsMultiProcess) {
                    obtainWrapperLocked.loaded = true;
                }
            } catch (Throwable th) {
                sMonitor.reportThrowable(4, this.mName, str, null, th);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x01dc A[Catch:{ all -> 0x01df }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void doPortingFromSp(android.content.Context r20) {
        /*
        // Method dump skipped, instructions count: 545
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.keva.KevaImpl.doPortingFromSp(android.content.Context):void");
    }

    public static Keva getRepo(String str, int i) {
        return getRepoImpl(str, i, false);
    }

    public static Keva getRepoSync(String str, int i) {
        return getRepoImpl(str, i, true);
    }

    @Override // com.bytedance.keva.Keva
    public void storeBytes(String str, byte[] bArr) {
        storeBytes(str, bArr, 0, false);
    }

    @Override // com.bytedance.keva.Keva
    public void storeBytesJustDisk(String str, byte[] bArr) {
        storeBytes(str, bArr, 0, true);
    }

    @Override // com.bytedance.keva.Keva
    public void storeString(String str, String str2) {
        storeString(str, str2, false);
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringArray(String str, String[] strArr) {
        storeStringArray(str, strArr, false);
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringArrayJustDisk(String str, String[] strArr) {
        storeStringArray(str, strArr, true);
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringJustDisk(String str, String str2) {
        storeString(str, str2, true);
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringSet(String str, Set<String> set) {
        storeStringSet(str, set, false);
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringSetJustDisk(String str, Set<String> set) {
        storeStringSet(str, set, true);
    }

    private void notifyChangeListeners(Keva keva, String str) {
        if (this.mChangeListeners.size() != 0) {
            for (Keva.OnChangeListener onChangeListener : this.mChangeListeners) {
                onChangeListener.onChanged(keva, str);
            }
        }
    }

    KevaImpl(String str, int i) {
        this.mName = str;
        this.mMode = i;
        this.mIsMultiProcess = (i & 1) == 0 ? false : true;
    }

    static KevaImpl getEmptyRepoImpl(String str, int i) {
        if (i < 0 || i >= 2) {
            KevaMonitor kevaMonitor = sMonitor;
            kevaMonitor.reportThrowable(1, str, null, null, new IllegalArgumentException("mode is not valid! " + i));
        }
        if ((i & 1) == 0) {
            return new KevaPrivateImpl(str, i);
        }
        return new KevaMultiProcessImpl(str, i);
    }

    @Override // com.bytedance.keva.Keva
    public boolean getBoolean(String str, boolean z) {
        boolean fetchBoolean;
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            try {
                fetchBoolean = fetchBoolean(str, z);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fetchBoolean;
    }

    @Override // com.bytedance.keva.Keva
    public byte[] getBytes(String str, byte[] bArr) {
        byte[] fetchBytes;
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            try {
                fetchBytes = fetchBytes(str, bArr, 0, false);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fetchBytes;
    }

    @Override // com.bytedance.keva.Keva
    public byte[] getBytesJustDisk(String str, byte[] bArr) {
        byte[] fetchBytes;
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            try {
                fetchBytes = fetchBytes(str, bArr, 0, true);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fetchBytes;
    }

    @Override // com.bytedance.keva.Keva
    public double getDouble(String str, double d) {
        double fetchDouble;
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            try {
                fetchDouble = fetchDouble(str, d);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fetchDouble;
    }

    @Override // com.bytedance.keva.Keva
    public float getFloat(String str, float f) {
        float fetchFloat;
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            try {
                fetchFloat = fetchFloat(str, f);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fetchFloat;
    }

    @Override // com.bytedance.keva.Keva
    public int getInt(String str, int i) {
        int fetchInt;
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            try {
                fetchInt = fetchInt(str, i);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fetchInt;
    }

    @Override // com.bytedance.keva.Keva
    public long getLong(String str, long j) {
        long fetchLong;
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            try {
                fetchLong = fetchLong(str, j);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fetchLong;
    }

    @Override // com.bytedance.keva.Keva
    public String getString(String str, String str2) {
        String fetchString;
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            try {
                fetchString = fetchString(str, str2, false);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fetchString;
    }

    @Override // com.bytedance.keva.Keva
    public String[] getStringArray(String str, String[] strArr) {
        String[] fetchStringArray;
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            try {
                fetchStringArray = fetchStringArray(str, strArr, false);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fetchStringArray;
    }

    @Override // com.bytedance.keva.Keva
    public String[] getStringArrayJustDisk(String str, String[] strArr) {
        String[] fetchStringArray;
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            try {
                fetchStringArray = fetchStringArray(str, strArr, true);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fetchStringArray;
    }

    @Override // com.bytedance.keva.Keva
    public String getStringJustDisk(String str, String str2) {
        String fetchString;
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            try {
                fetchString = fetchString(str, str2, true);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fetchString;
    }

    @Override // com.bytedance.keva.Keva
    public Set<String> getStringSet(String str, Set<String> set) {
        Set<String> fetchStringSet;
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            try {
                fetchStringSet = fetchStringSet(str, set, false);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fetchStringSet;
    }

    @Override // com.bytedance.keva.Keva
    public Set<String> getStringSetJustDisk(String str, Set<String> set) {
        Set<String> fetchStringSet;
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            try {
                fetchStringSet = fetchStringSet(str, set, true);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fetchStringSet;
    }

    @Override // com.bytedance.keva.Keva
    public void storeBoolean(String str, boolean z) {
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            KevaValueWrapper obtainWrapperLocked = obtainWrapperLocked(str);
            if (this.mIsMultiProcess || !obtainWrapperLocked.loaded || obtainWrapperLocked.value == null || !obtainWrapperLocked.value.equals(Boolean.valueOf(z))) {
                try {
                    obtainWrapperLocked.offset = storeBoolean(this.mHandle, str, obtainWrapperLocked.offset, z);
                    obtainWrapperLocked.value = Boolean.valueOf(z);
                    if (!this.mIsMultiProcess) {
                        obtainWrapperLocked.loaded = true;
                    }
                    notifyChangeListeners(this, str);
                } catch (Throwable th) {
                    sMonitor.reportThrowable(3, this.mName, str, Boolean.valueOf(z), th);
                }
            }
        }
    }

    @Override // com.bytedance.keva.Keva
    public void storeDouble(String str, double d) {
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            KevaValueWrapper obtainWrapperLocked = obtainWrapperLocked(str);
            if (this.mIsMultiProcess || !obtainWrapperLocked.loaded || obtainWrapperLocked.value == null || !obtainWrapperLocked.value.equals(Double.valueOf(d))) {
                try {
                    obtainWrapperLocked.offset = storeDouble(this.mHandle, str, obtainWrapperLocked.offset, d);
                    obtainWrapperLocked.value = Double.valueOf(d);
                    if (!this.mIsMultiProcess) {
                        obtainWrapperLocked.loaded = true;
                    }
                    notifyChangeListeners(this, str);
                } catch (Throwable th) {
                    sMonitor.reportThrowable(3, this.mName, str, Double.valueOf(d), th);
                }
            }
        }
    }

    @Override // com.bytedance.keva.Keva
    public void storeFloat(String str, float f) {
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            KevaValueWrapper obtainWrapperLocked = obtainWrapperLocked(str);
            if (this.mIsMultiProcess || !obtainWrapperLocked.loaded || obtainWrapperLocked.value == null || !obtainWrapperLocked.value.equals(Float.valueOf(f))) {
                try {
                    obtainWrapperLocked.offset = storeFloat(this.mHandle, str, obtainWrapperLocked.offset, f);
                    obtainWrapperLocked.value = Float.valueOf(f);
                    if (!this.mIsMultiProcess) {
                        obtainWrapperLocked.loaded = true;
                    }
                    notifyChangeListeners(this, str);
                } catch (Throwable th) {
                    sMonitor.reportThrowable(3, this.mName, str, Float.valueOf(f), th);
                }
            }
        }
    }

    @Override // com.bytedance.keva.Keva
    public void storeInt(String str, int i) {
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            KevaValueWrapper obtainWrapperLocked = obtainWrapperLocked(str);
            if (this.mIsMultiProcess || !obtainWrapperLocked.loaded || obtainWrapperLocked.value == null || !obtainWrapperLocked.value.equals(Integer.valueOf(i))) {
                try {
                    obtainWrapperLocked.offset = storeInt(this.mHandle, str, obtainWrapperLocked.offset, i);
                    obtainWrapperLocked.value = Integer.valueOf(i);
                    if (!this.mIsMultiProcess) {
                        obtainWrapperLocked.loaded = true;
                    }
                    notifyChangeListeners(this, str);
                } catch (Throwable th) {
                    sMonitor.reportThrowable(3, this.mName, str, Integer.valueOf(i), th);
                }
            }
        }
    }

    @Override // com.bytedance.keva.Keva
    public void storeLong(String str, long j) {
        if ("".equals(str)) {
            str = null;
        }
        synchronized (this) {
            KevaValueWrapper obtainWrapperLocked = obtainWrapperLocked(str);
            if (this.mIsMultiProcess || !obtainWrapperLocked.loaded || obtainWrapperLocked.value == null || !obtainWrapperLocked.value.equals(Long.valueOf(j))) {
                try {
                    obtainWrapperLocked.offset = storeLong(this.mHandle, str, obtainWrapperLocked.offset, j);
                    obtainWrapperLocked.value = Long.valueOf(j);
                    if (!this.mIsMultiProcess) {
                        obtainWrapperLocked.loaded = true;
                    }
                    notifyChangeListeners(this, str);
                } catch (Throwable th) {
                    sMonitor.reportThrowable(3, this.mName, str, Long.valueOf(j), th);
                }
            }
        }
    }

    public static Keva getRepoFromSp(Context context, String str, int i) {
        return getRepoFromSpImpl(context, str, i, false);
    }

    public static Keva getRepoFromSpSync(Context context, String str, int i) {
        return getRepoFromSpImpl(context, str, i, true);
    }

    private void reportBigValue(final String str, final Object obj, final int i) {
        if (i > 10000) {
            sExecutor.execute(new Runnable() {
                /* class com.bytedance.keva.KevaImpl.RunnableC145583 */

                public void run() {
                    KevaMonitor kevaMonitor = KevaImpl.sMonitor;
                    String str = KevaImpl.this.mName;
                    String str2 = str;
                    Object obj = obj;
                    kevaMonitor.reportWarning(3, str, str2, obj, "value too big, size=" + i);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public void addMapBoolWhenLoading(String str, boolean z, long j) {
        addMapObjectWhenLoading(str, Boolean.valueOf(z), j, 2);
    }

    /* access modifiers changed from: package-private */
    public void addMapDoubleWhenLoading(String str, double d, long j) {
        addMapObjectWhenLoading(str, Double.valueOf(d), j, 5);
    }

    /* access modifiers changed from: package-private */
    public void addMapFloatWhenLoading(String str, float f, long j) {
        addMapObjectWhenLoading(str, Float.valueOf(f), j, 4);
    }

    /* access modifiers changed from: package-private */
    public void addMapIntWhenLoading(String str, int i, long j) {
        addMapObjectWhenLoading(str, Integer.valueOf(i), j, 1);
    }

    /* access modifiers changed from: package-private */
    public void addMapLongWhenLoading(String str, long j, long j2) {
        addMapObjectWhenLoading(str, Long.valueOf(j), j2, 3);
    }

    private Set<String> fetchStringSet(String str, Set<String> set, boolean z) {
        String[] strArr;
        if (set != null) {
            strArr = (String[]) set.toArray(new String[0]);
        } else {
            strArr = null;
        }
        String[] fetchStringArray = fetchStringArray(str, strArr, z);
        if (fetchStringArray != null) {
            return new HashSet(Arrays.asList(fetchStringArray));
        }
        return null;
    }

    private void storeStringSet(String str, Set<String> set, boolean z) {
        String[] strArr;
        if (set != null) {
            strArr = new String[set.size()];
            set.toArray(strArr);
        } else {
            strArr = null;
        }
        storeStringArray(str, strArr, z);
    }

    /* access modifiers changed from: package-private */
    public void addMapOffsetWhenLoading(String str, long j, int i) {
        List<KevaValueWrapper> list;
        if ("".equals(str)) {
            str = null;
        }
        KevaValueWrapper kevaValueWrapper = new KevaValueWrapper();
        kevaValueWrapper.offset = j;
        kevaValueWrapper.type = i;
        KevaValueWrapper put = this.mValueMap.put(str, kevaValueWrapper);
        if (put != null && (list = this.mDuplicatedOldWrappers) != null) {
            list.add(put);
        }
    }

    private static Keva getRepoImpl(final String str, final int i, boolean z) {
        Keva keva;
        boolean z2;
        Keva kevaFuture;
        HashMap<String, Keva> hashMap = sRepoMap;
        synchronized (hashMap) {
            keva = hashMap.get(str);
            if (keva == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (z) {
                    kevaFuture = getEmptyRepoImpl(str, i);
                } else {
                    kevaFuture = new KevaFuture(str, i, new Callable<KevaImpl>() {
                        /* class com.bytedance.keva.KevaImpl.CallableC145561 */

                        @Override // java.util.concurrent.Callable
                        public KevaImpl call() {
                            KevaImpl emptyRepoImpl = KevaImpl.getEmptyRepoImpl(str, i);
                            emptyRepoImpl.init(false);
                            return emptyRepoImpl;
                        }
                    });
                }
                keva = kevaFuture;
                hashMap.put(str, keva);
            }
        }
        if (z2) {
            if (!(keva instanceof KevaFuture)) {
                ((KevaImpl) keva).init(false);
            }
        } else if (!(keva instanceof KevaFuture)) {
            ((KevaImpl) keva).checkMode(i);
        } else {
            ((KevaFuture) keva).checkMode(i);
        }
        return keva;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0059, code lost:
        r12 = r11.length();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void storeString(final java.lang.String r10, final java.lang.String r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.keva.KevaImpl.storeString(java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        r12 = java.util.Arrays.toString(r12);
        r13 = r12.length();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void storeStringArray(final java.lang.String r11, java.lang.String[] r12, boolean r13) {
        /*
            r10 = this;
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r11)
            r1 = 0
            if (r0 == 0) goto L_0x000a
            r11 = r1
        L_0x000a:
            monitor-enter(r10)
            com.bytedance.keva.KevaImpl$KevaValueWrapper r0 = r10.obtainWrapperLocked(r11)     // Catch:{ all -> 0x005c }
            long r3 = r10.mHandle     // Catch:{ all -> 0x0036 }
            long r6 = r0.offset     // Catch:{ all -> 0x0036 }
            r9 = 3
            r2 = r10
            r5 = r11
            r8 = r12
            long r2 = r2.storeStringArray(r3, r5, r6, r8, r9)     // Catch:{ all -> 0x0036 }
            r0.offset = r2     // Catch:{ all -> 0x0036 }
            r2 = 55
            r0.type = r2     // Catch:{ all -> 0x0036 }
            if (r13 != 0) goto L_0x002d
            r0.value = r12     // Catch:{ all -> 0x0036 }
            boolean r13 = r10.mIsMultiProcess     // Catch:{ all -> 0x0036 }
            if (r13 != 0) goto L_0x0032
            r13 = 1
            r0.loaded = r13     // Catch:{ all -> 0x0036 }
            goto L_0x0032
        L_0x002d:
            r0.value = r1     // Catch:{ all -> 0x0036 }
            r13 = 0
            r0.loaded = r13     // Catch:{ all -> 0x0036 }
        L_0x0032:
            r10.notifyChangeListeners(r10, r11)     // Catch:{ all -> 0x0036 }
            goto L_0x0042
        L_0x0036:
            r13 = move-exception
            r7 = r13
            com.bytedance.keva.KevaMonitor r2 = com.bytedance.keva.KevaImpl.sMonitor
            r3 = 3
            java.lang.String r4 = r10.mName
            r6 = 0
            r5 = r11
            r2.reportThrowable(r3, r4, r5, r6, r7)
        L_0x0042:
            monitor-exit(r10)
            if (r12 == 0) goto L_0x005b
            java.lang.String r12 = java.util.Arrays.toString(r12)
            int r13 = r12.length()
            r0 = 10000(0x2710, float:1.4013E-41)
            if (r13 <= r0) goto L_0x005b
            java.util.concurrent.Executor r0 = com.bytedance.keva.KevaImpl.sExecutor
            com.bytedance.keva.KevaImpl$6 r1 = new com.bytedance.keva.KevaImpl$6
            r1.<init>(r11, r12, r13)
            r0.execute(r1)
        L_0x005b:
            return
        L_0x005c:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.keva.KevaImpl.storeStringArray(java.lang.String, java.lang.String[], boolean):void");
    }

    private void addMapObjectWhenLoading(String str, Object obj, long j, int i) {
        List<KevaValueWrapper> list;
        if ("".equals(str)) {
            str = null;
        }
        KevaValueWrapper kevaValueWrapper = new KevaValueWrapper();
        kevaValueWrapper.value = obj;
        kevaValueWrapper.offset = j;
        kevaValueWrapper.type = i;
        if (!this.mIsMultiProcess) {
            kevaValueWrapper.loaded = true;
        }
        KevaValueWrapper put = this.mValueMap.put(str, kevaValueWrapper);
        if (put != null && (list = this.mDuplicatedOldWrappers) != null) {
            list.add(put);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        r12 = r12.length;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void storeBytes(final java.lang.String r11, byte[] r12, int r13, boolean r14) {
        /*
            r10 = this;
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r11)
            r1 = 0
            if (r0 == 0) goto L_0x000a
            r11 = r1
        L_0x000a:
            monitor-enter(r10)
            com.bytedance.keva.KevaImpl$KevaValueWrapper r0 = r10.obtainWrapperLocked(r11)     // Catch:{ all -> 0x0057 }
            long r3 = r10.mHandle     // Catch:{ all -> 0x0038 }
            long r6 = r0.offset     // Catch:{ all -> 0x0038 }
            r2 = r10
            r5 = r11
            r8 = r12
            r9 = r13
            long r2 = r2.storeBytes(r3, r5, r6, r8, r9)     // Catch:{ all -> 0x0038 }
            r0.offset = r2     // Catch:{ all -> 0x0038 }
            int r13 = r13 << 4
            r13 = r13 | 7
            r0.type = r13     // Catch:{ all -> 0x0038 }
            if (r14 != 0) goto L_0x002f
            r0.value = r12     // Catch:{ all -> 0x0038 }
            boolean r13 = r10.mIsMultiProcess     // Catch:{ all -> 0x0038 }
            if (r13 != 0) goto L_0x0034
            r13 = 1
            r0.loaded = r13     // Catch:{ all -> 0x0038 }
            goto L_0x0034
        L_0x002f:
            r0.value = r1     // Catch:{ all -> 0x0038 }
            r13 = 0
            r0.loaded = r13     // Catch:{ all -> 0x0038 }
        L_0x0034:
            r10.notifyChangeListeners(r10, r11)     // Catch:{ all -> 0x0038 }
            goto L_0x0044
        L_0x0038:
            r13 = move-exception
            r7 = r13
            com.bytedance.keva.KevaMonitor r2 = com.bytedance.keva.KevaImpl.sMonitor
            r3 = 3
            java.lang.String r4 = r10.mName
            r5 = r11
            r6 = r12
            r2.reportThrowable(r3, r4, r5, r6, r7)
        L_0x0044:
            monitor-exit(r10)
            if (r12 == 0) goto L_0x0056
            int r12 = r12.length
            r13 = 10000(0x2710, float:1.4013E-41)
            if (r12 <= r13) goto L_0x0056
            java.util.concurrent.Executor r13 = com.bytedance.keva.KevaImpl.sExecutor
            com.bytedance.keva.KevaImpl$5 r14 = new com.bytedance.keva.KevaImpl$5
            r14.<init>(r11, r12)
            r13.execute(r14)
        L_0x0056:
            return
        L_0x0057:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.keva.KevaImpl.storeBytes(java.lang.String, byte[], int, boolean):void");
    }

    private static Keva getRepoFromSpImpl(final Context context, final String str, final int i, boolean z) {
        Keva keva;
        Keva kevaFuture;
        if (isRepoPorted(str)) {
            return getRepo(str, i);
        }
        boolean z2 = true;
        if (!existSharedPrefs(str)) {
            getPortedSpRepo().storeBoolean(str, true);
            return getRepo(str, i);
        }
        KevaMonitor kevaMonitor = sMonitor;
        kevaMonitor.logDebug("do poring from sp: " + str);
        HashMap<String, Keva> hashMap = sRepoMap;
        synchronized (hashMap) {
            keva = hashMap.get(str);
            if (keva != null) {
                z2 = false;
            }
            if (z2) {
                if (z) {
                    kevaFuture = getEmptyRepoImpl(str, i);
                } else {
                    kevaFuture = new KevaFuture(str, i, new Callable<KevaImpl>() {
                        /* class com.bytedance.keva.KevaImpl.CallableC145572 */

                        @Override // java.util.concurrent.Callable
                        public KevaImpl call() {
                            KevaImpl emptyRepoImpl = KevaImpl.getEmptyRepoImpl(str, i);
                            emptyRepoImpl.doPortingFromSp(context);
                            return emptyRepoImpl;
                        }
                    });
                }
                keva = kevaFuture;
                hashMap.put(str, keva);
            }
        }
        if (z2) {
            if (keva instanceof KevaImpl) {
                try {
                    ((KevaImpl) keva).doPortingFromSp(context);
                } catch (UnsatisfiedLinkError e) {
                    sMonitor.reportThrowable(1, str, null, null, e);
                }
            }
        } else if (keva instanceof KevaImpl) {
            ((KevaImpl) keva).checkMode(i);
        } else {
            ((KevaFuture) keva).checkMode(i);
        }
        return keva;
    }
}
