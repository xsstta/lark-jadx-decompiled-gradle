package com.ttnet.org.chromium.net.impl;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.C1711a;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ttnet.org.chromium.base.ContextUtils;
import com.ttnet.org.chromium.base.Log;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import com.ttnet.org.chromium.net.NetworkChangeNotifier;
import java.io.File;

@JNINamespace("cronet")
public class CronetLibraryLoader {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "CronetLibraryLoader";
    private static final HandlerThread sInitThread = new_android_os_HandlerThread_by_knot("CronetInit");
    public static long sInitThreadEndTime;
    private static volatile boolean sInitThreadInitDone;
    public static long sInitThreadStartTime;
    private static volatile boolean sLibraryLoaded = false;
    public static long sLoadCronetSoDuration;
    private static final Object sLoadLock = new Object();
    private static final ConditionVariable sWaitForLibLoad = new ConditionVariable();

    private static native void nativeCronetInitOnInitThread();

    private static native String nativeGetCronetVersion();

    public static HandlerThread new_android_os_HandlerThread_by_knot(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    private static String getDefaultUserAgent() {
        return UserAgent.from(ContextUtils.getApplicationContext());
    }

    private static boolean onInitThread() {
        if (sInitThread.getLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    private static void ensureInitializedFromNative() {
        synchronized (sLoadLock) {
            sLibraryLoaded = true;
            sWaitForLibLoad.open();
        }
        ensureInitialized(ContextUtils.getApplicationContext(), null);
    }

    static void ensureInitializedOnInitThread() {
        if (!sInitThreadInitDone) {
            sInitThreadStartTime = System.currentTimeMillis();
            NetworkChangeNotifier.init();
            NetworkChangeNotifier.registerToReceiveNotificationsAlways();
            sWaitForLibLoad.block();
            nativeCronetInitOnInitThread();
            sInitThreadInitDone = true;
            sInitThreadEndTime = System.currentTimeMillis();
        }
    }

    private static void setNetworkThreadPriorityOnNetworkThread(int i) {
        Process.setThreadPriority(i);
    }

    public static void postToInitThread(Runnable runnable) {
        if (onInitThread()) {
            runnable.run();
        } else {
            new Handler(sInitThread.getLooper()).post(runnable);
        }
    }

    private static void loadCronetLibrary(CronetEngineBuilderImpl cronetEngineBuilderImpl) {
        String cronetSoPath = cronetEngineBuilderImpl.getCronetSoPath();
        if (!TextUtils.isEmpty(cronetSoPath)) {
            File file = new File(cronetSoPath);
            if (file.exists() && !file.isDirectory()) {
                Log.m264557i(TAG, "cronet so load: %s", cronetSoPath);
                System.load(cronetSoPath);
                return;
            }
        }
        if (cronetEngineBuilderImpl.libraryLoader() != null) {
            cronetEngineBuilderImpl.libraryLoader().loadLibrary("sscronet");
        } else {
            C1711a.m7628a("sscronet");
        }
    }

    public static void ensureInitialized(Context context, CronetEngineBuilderImpl cronetEngineBuilderImpl) {
        synchronized (sLoadLock) {
            if (!sInitThreadInitDone) {
                ContextUtils.initApplicationContext(context);
                HandlerThread handlerThread = sInitThread;
                if (!handlerThread.isAlive()) {
                    handlerThread.start();
                }
                postToInitThread(new Runnable() {
                    /* class com.ttnet.org.chromium.net.impl.CronetLibraryLoader.RunnableC680221 */

                    public void run() {
                        CronetLibraryLoader.ensureInitializedOnInitThread();
                    }
                });
            }
            if (!sLibraryLoaded) {
                long uptimeMillis = SystemClock.uptimeMillis();
                loadCronetLibrary(cronetEngineBuilderImpl);
                sLoadCronetSoDuration = SystemClock.uptimeMillis() - uptimeMillis;
                String cronetVersion = ImplVersion.getCronetVersion();
                if (cronetVersion.equals(nativeGetCronetVersion())) {
                    Log.m264557i(TAG, "Cronet version: %s, arch: %s", cronetVersion, System.getProperty("os.arch"));
                    sLibraryLoaded = true;
                    sWaitForLibLoad.open();
                } else {
                    throw new RuntimeException(String.format("Expected Cronet version number %s, actual version number %s.", cronetVersion, nativeGetCronetVersion()));
                }
            }
        }
    }
}
