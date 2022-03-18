package com.ttnet.org.chromium.base.library_loader;

import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.C1711a;
import com.ttnet.org.chromium.base.ContextUtils;
import com.ttnet.org.chromium.base.Log;
import com.ttnet.org.chromium.base.StreamUtil;
import com.ttnet.org.chromium.base.SysUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Linker {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Linker sSingleton = new Linker();
    private long mBaseLoadAddress = -1;
    private boolean mBrowserUsesSharedRelro;
    private long mCurrentLoadAddress = -1;
    private boolean mInBrowserProcess = true;
    private boolean mInitialized;
    private HashMap<String, LibInfo> mLoadedLibraries;
    protected final Object mLock = new Object();
    private int mMemoryDeviceConfig;
    private boolean mPrepareLibraryLoadCalled;
    private Bundle mSharedRelros;
    private String mTestRunnerClassName;
    private boolean mWaitForSharedRelros;

    public interface TestRunner {
        boolean runChecks(int i, boolean z);
    }

    private static void assertLinkerTestsAreEnabled() {
    }

    private void dumpBundle(Bundle bundle) {
    }

    private static native boolean nativeAddZipArchivePath(String str);

    private static native boolean nativeCreateSharedRelro(String str, long j, LibInfo libInfo);

    private static native long nativeGetRandomBaseLoadAddress();

    private static native boolean nativeLoadLibrary(String str, long j, LibInfo libInfo);

    private static native boolean nativeUseSharedRelro(String str, LibInfo libInfo);

    public static boolean areTestsEnabled() {
        return NativeLibraries.sEnableLinkerTests;
    }

    public static Linker getInstance() {
        return sSingleton;
    }

    /* access modifiers changed from: private */
    public static class LibInfo implements Parcelable {
        public static final Parcelable.Creator<LibInfo> CREATOR = new Parcelable.Creator<LibInfo>() {
            /* class com.ttnet.org.chromium.base.library_loader.Linker.LibInfo.C679951 */

            @Override // android.os.Parcelable.Creator
            public LibInfo[] newArray(int i) {
                return new LibInfo[i];
            }

            @Override // android.os.Parcelable.Creator
            public LibInfo createFromParcel(Parcel parcel) {
                return new LibInfo(parcel);
            }
        };
        public long mLoadAddress;
        public long mLoadSize;
        public int mRelroFd = -1;
        public long mRelroSize;
        public long mRelroStart;

        public int describeContents() {
            return 1;
        }

        LibInfo() {
        }

        public void close() {
            int i = this.mRelroFd;
            if (i >= 0) {
                StreamUtil.closeQuietly(ParcelFileDescriptor.adoptFd(i));
                this.mRelroFd = -1;
            }
        }

        LibInfo(Parcel parcel) {
            this.mLoadAddress = parcel.readLong();
            this.mLoadSize = parcel.readLong();
            this.mRelroStart = parcel.readLong();
            this.mRelroSize = parcel.readLong();
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
            if (parcelFileDescriptor != null) {
                this.mRelroFd = parcelFileDescriptor.detachFd();
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (this.mRelroFd >= 0) {
                parcel.writeLong(this.mLoadAddress);
                parcel.writeLong(this.mLoadSize);
                parcel.writeLong(this.mRelroStart);
                parcel.writeLong(this.mRelroSize);
                try {
                    ParcelFileDescriptor fromFd = ParcelFileDescriptor.fromFd(this.mRelroFd);
                    fromFd.writeToParcel(parcel, 0);
                    fromFd.close();
                } catch (IOException e) {
                    Log.m264556e("LibraryLoader", "Can't write LibInfo file descriptor to parcel", e);
                }
            }
        }
    }

    private long getRandomBaseLoadAddress() {
        return nativeGetRandomBaseLoadAddress();
    }

    public final String getTestRunnerClassNameForTesting() {
        String str;
        assertLinkerTestsAreEnabled();
        synchronized (this.mLock) {
            str = this.mTestRunnerClassName;
        }
        return str;
    }

    private Linker() {
    }

    public void disableSharedRelros() {
        synchronized (this.mLock) {
            ensureInitializedLocked();
            this.mInBrowserProcess = false;
            this.mWaitForSharedRelros = false;
            this.mBrowserUsesSharedRelro = false;
        }
    }

    public Bundle getSharedRelros() {
        synchronized (this.mLock) {
            if (!this.mInBrowserProcess) {
                return null;
            }
            return this.mSharedRelros;
        }
    }

    public boolean isUsingBrowserSharedRelros() {
        boolean z;
        synchronized (this.mLock) {
            ensureInitializedLocked();
            if (!this.mInBrowserProcess || !this.mBrowserUsesSharedRelro) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    private void ensureInitializedLocked() {
        if (!this.mInitialized) {
            loadLinkerJniLibrary();
            if (this.mMemoryDeviceConfig == 0) {
                if (SysUtils.isLowEndDevice()) {
                    this.mMemoryDeviceConfig = 1;
                } else {
                    this.mMemoryDeviceConfig = 2;
                }
            }
            if (this.mMemoryDeviceConfig == 1) {
                this.mBrowserUsesSharedRelro = true;
                Log.m264566w("LibraryLoader", "Low-memory device: shared RELROs used in all processes", new Object[0]);
            } else {
                this.mBrowserUsesSharedRelro = false;
            }
            this.mInitialized = true;
        }
    }

    private static void loadLinkerJniLibrary() {
        LibraryLoader.setEnvForNative();
        try {
            C1711a.m7628a("chromium_android_linker");
            LibraryLoader.incrementRelinkerCountNotHitHistogram();
        } catch (UnsatisfiedLinkError unused) {
            if (LibraryLoader.PLATFORM_REQUIRES_NATIVE_FALLBACK_EXTRACTION) {
                System.load(LibraryLoader.getExtractedLibraryPath(ContextUtils.getApplicationContext().getApplicationInfo(), "chromium_android_linker"));
                LibraryLoader.incrementRelinkerCountHitHistogram();
            }
        }
    }

    private void setupBaseLoadAddressLocked() {
        if (this.mBaseLoadAddress == -1) {
            long randomBaseLoadAddress = getRandomBaseLoadAddress();
            this.mBaseLoadAddress = randomBaseLoadAddress;
            this.mCurrentLoadAddress = randomBaseLoadAddress;
            if (randomBaseLoadAddress == 0) {
                Log.m264566w("LibraryLoader", "Disabling shared RELROs due address space pressure", new Object[0]);
                this.mBrowserUsesSharedRelro = false;
                this.mWaitForSharedRelros = false;
            }
        }
    }

    public long getBaseLoadAddress() {
        synchronized (this.mLock) {
            ensureInitializedLocked();
            if (!this.mInBrowserProcess) {
                Log.m264566w("LibraryLoader", "Shared RELRO sections are disabled in this process!", new Object[0]);
                return 0;
            }
            setupBaseLoadAddressLocked();
            return this.mBaseLoadAddress;
        }
    }

    /* access modifiers changed from: package-private */
    public void finishLibraryLoad() {
        Bundle bundle;
        synchronized (this.mLock) {
            ensureInitializedLocked();
            HashMap<String, LibInfo> hashMap = this.mLoadedLibraries;
            if (hashMap != null) {
                if (this.mInBrowserProcess) {
                    Bundle createBundleFromLibInfoMap = createBundleFromLibInfoMap(hashMap);
                    this.mSharedRelros = createBundleFromLibInfoMap;
                    if (this.mBrowserUsesSharedRelro) {
                        useSharedRelrosLocked(createBundleFromLibInfoMap);
                    }
                }
                if (this.mWaitForSharedRelros) {
                    while (true) {
                        bundle = this.mSharedRelros;
                        if (bundle != null) {
                            break;
                        }
                        try {
                            this.mLock.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    useSharedRelrosLocked(bundle);
                    this.mSharedRelros.clear();
                    this.mSharedRelros = null;
                }
            }
            if (NativeLibraries.sEnableLinkerTests) {
                runTestRunnerClassForTesting(this.mMemoryDeviceConfig, this.mInBrowserProcess);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isChromiumLinkerLibrary(String str) {
        return str.equals("chromium_android_linker");
    }

    /* access modifiers changed from: package-private */
    public void loadLibrary(String str) {
        loadLibraryImpl(str, true);
    }

    /* access modifiers changed from: package-private */
    public void loadLibraryNoFixedAddress(String str) {
        loadLibraryImpl(str, false);
    }

    public static final void setupForTesting(String str) {
        assertLinkerTestsAreEnabled();
        Linker linker = sSingleton;
        synchronized (linker) {
            linker.mTestRunnerClassName = str;
        }
    }

    public final void setMemoryDeviceConfigForTesting(int i) {
        assertLinkerTestsAreEnabled();
        synchronized (this.mLock) {
            this.mMemoryDeviceConfig = i;
        }
    }

    private void closeLibInfoMap(HashMap<String, LibInfo> hashMap) {
        for (Map.Entry<String, LibInfo> entry : hashMap.entrySet()) {
            entry.getValue().close();
        }
    }

    public void initServiceProcess(long j) {
        synchronized (this.mLock) {
            ensureInitializedLocked();
            this.mInBrowserProcess = false;
            this.mBrowserUsesSharedRelro = false;
            this.mWaitForSharedRelros = true;
            this.mBaseLoadAddress = j;
            this.mCurrentLoadAddress = j;
        }
    }

    public void prepareLibraryLoad(String str) {
        synchronized (this.mLock) {
            ensureInitializedLocked();
            if (str != null) {
                nativeAddZipArchivePath(str);
            }
            this.mPrepareLibraryLoadCalled = true;
            if (this.mInBrowserProcess) {
                setupBaseLoadAddressLocked();
            }
        }
    }

    private Bundle createBundleFromLibInfoMap(HashMap<String, LibInfo> hashMap) {
        Bundle bundle = new Bundle(hashMap.size());
        for (Map.Entry<String, LibInfo> entry : hashMap.entrySet()) {
            bundle.putParcelable(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    private HashMap<String, LibInfo> createLibInfoMapFromBundle(Bundle bundle) {
        HashMap<String, LibInfo> hashMap = new HashMap<>();
        for (String str : bundle.keySet()) {
            hashMap.put(str, (LibInfo) bundle.getParcelable(str));
        }
        return hashMap;
    }

    public void useSharedRelros(Bundle bundle) {
        Bundle bundle2;
        if (bundle != null) {
            bundle.setClassLoader(LibInfo.class.getClassLoader());
            bundle2 = new Bundle(LibInfo.class.getClassLoader());
            Parcel obtain = Parcel.obtain();
            bundle.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            bundle2.readFromParcel(obtain);
            obtain.recycle();
        } else {
            bundle2 = null;
        }
        synchronized (this.mLock) {
            this.mSharedRelros = bundle2;
            this.mLock.notifyAll();
        }
    }

    private void useSharedRelrosLocked(Bundle bundle) {
        if (!(bundle == null || this.mLoadedLibraries == null)) {
            HashMap<String, LibInfo> createLibInfoMapFromBundle = createLibInfoMapFromBundle(bundle);
            for (Map.Entry<String, LibInfo> entry : createLibInfoMapFromBundle.entrySet()) {
                String key = entry.getKey();
                if (!nativeUseSharedRelro(key, entry.getValue())) {
                    Log.m264566w("LibraryLoader", "Could not use shared RELRO section for " + key, new Object[0]);
                }
            }
            if (!this.mInBrowserProcess) {
                closeLibInfoMap(createLibInfoMapFromBundle);
            }
        }
    }

    private final void runTestRunnerClassForTesting(int i, boolean z) {
        assertLinkerTestsAreEnabled();
        synchronized (this.mLock) {
            if (this.mTestRunnerClassName == null) {
                Log.wtf("LibraryLoader", "Linker runtime tests not set up for this process", new Object[0]);
            }
            TestRunner testRunner = null;
            try {
                testRunner = (TestRunner) Class.forName(this.mTestRunnerClassName).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Exception e) {
                Log.wtf("LibraryLoader", "Could not instantiate test runner class by name", e);
            }
            if (!testRunner.runChecks(i, z)) {
                Log.wtf("LibraryLoader", "Linker runtime tests failed in this process", new Object[0]);
            }
            Log.m264557i("LibraryLoader", "All linker tests passed", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    public void loadLibraryImpl(String str, boolean z) {
        long j;
        String str2;
        synchronized (this.mLock) {
            ensureInitializedLocked();
            if (this.mLoadedLibraries == null) {
                this.mLoadedLibraries = new HashMap<>();
            }
            if (!this.mLoadedLibraries.containsKey(str)) {
                LibInfo libInfo = new LibInfo();
                if (!z || ((!this.mInBrowserProcess || !this.mBrowserUsesSharedRelro) && !this.mWaitForSharedRelros)) {
                    j = 0;
                } else {
                    j = this.mCurrentLoadAddress;
                    if (j > this.mBaseLoadAddress + 201326592) {
                        String str3 = "Load address outside reservation, for: " + str;
                        Log.m264556e("LibraryLoader", str3, new Object[0]);
                        throw new UnsatisfiedLinkError(str3);
                    }
                }
                if (nativeLoadLibrary(str, j, libInfo)) {
                    if (NativeLibraries.sEnableLinkerTests) {
                        if (this.mInBrowserProcess) {
                            str2 = "BROWSER_LIBRARY_ADDRESS";
                        } else {
                            str2 = "RENDERER_LIBRARY_ADDRESS";
                        }
                        Log.m264557i("LibraryLoader", String.format(Locale.US, "%s: %s %x", str2, str, Long.valueOf(libInfo.mLoadAddress)), new Object[0]);
                    }
                    if (this.mInBrowserProcess && !nativeCreateSharedRelro(str, this.mCurrentLoadAddress, libInfo)) {
                        Log.m264566w("LibraryLoader", String.format(Locale.US, "Could not create shared RELRO for %s at %x", str, Long.valueOf(this.mCurrentLoadAddress)), new Object[0]);
                    }
                    if (!(j == 0 || this.mCurrentLoadAddress == 0)) {
                        this.mCurrentLoadAddress = libInfo.mLoadAddress + libInfo.mLoadSize;
                    }
                    this.mLoadedLibraries.put(str, libInfo);
                    return;
                }
                String str4 = "Unable to load library: " + str;
                Log.m264556e("LibraryLoader", str4, new Object[0]);
                throw new UnsatisfiedLinkError(str4);
            }
        }
    }
}
