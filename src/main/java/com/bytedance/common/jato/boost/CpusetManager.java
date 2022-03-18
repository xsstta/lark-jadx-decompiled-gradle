package com.bytedance.common.jato.boost;

import com.bytedance.common.jato.Jato;
import com.bytedance.common.jato.JatoNativeLoader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

public class CpusetManager {
    private static volatile int[] bigCoreNum;
    private static boolean isAlreadyPreload;
    private static AtomicBoolean isCpuSetWork = new AtomicBoolean(false);
    private static volatile int[] smallCoreNum;

    private static native void resetCpuSet();

    private static native void resetCpuSetTid(int i);

    private static native void setCpuSet(int[] iArr);

    private static native void setCpuSetTid(int i, int[] iArr);

    private static boolean loadLibrary() {
        return JatoNativeLoader.loadLibrary();
    }

    public static void bindLittleCore() {
        if (!isCpuSetWork.get()) {
            Jato.getListener().onDebugInfo("cpuset before core fetch or can't work");
        } else if (loadLibrary()) {
            setCpuSet(smallCoreNum);
        }
    }

    public static void resetCoreBind() {
        if (!isCpuSetWork.get()) {
            Jato.getListener().onDebugInfo("cpuset before core fetch or can't work");
        } else if (loadLibrary()) {
            resetCpuSet();
        }
    }

    public static void bindBigCore() {
        if (!isCpuSetWork.get() || bigCoreNum == null) {
            Jato.getListener().onDebugInfo("cpuset before core fetch or can't work");
        } else if (loadLibrary()) {
            setCpuSet(bigCoreNum);
        }
    }

    public static synchronized void preload() {
        synchronized (CpusetManager.class) {
            if (!isAlreadyPreload) {
                if (CpuFreqFetcher.fetch()) {
                    smallCoreNum = CpuFreqFetcher.getSmallCoreNum();
                    bigCoreNum = CpuFreqFetcher.getBigCoreNum();
                    isCpuSetWork.set(true);
                }
                isAlreadyPreload = true;
            }
        }
    }

    public static void init(ExecutorService executorService) {
        executorService.execute(new Runnable() {
            /* class com.bytedance.common.jato.boost.CpusetManager.RunnableC36021 */

            public void run() {
                CpusetManager.preload();
            }
        });
    }

    private static void debug(String str) {
        if (Jato.isDebug() && Jato.getListener() != null) {
            Jato.getListener().onDebugInfo(str);
        }
    }

    public static void bindLittleCore(int i) {
        if (!isCpuSetWork.get() || smallCoreNum == null) {
            Jato.getListener().onDebugInfo("cpuset before core fetch or can't work");
        } else if (loadLibrary()) {
            setCpuSetTid(i, smallCoreNum);
        }
    }

    public static void resetCoreBind(int i) {
        if (!isCpuSetWork.get()) {
            Jato.getListener().onDebugInfo("cpuset before core fetch or can't work");
        } else if (loadLibrary()) {
            resetCpuSetTid(i);
        }
    }

    public static void bindBigCore(int i) {
        if (!isCpuSetWork.get() || bigCoreNum == null) {
            Jato.getListener().onDebugInfo("cpuset before core fetch or can't work");
        } else if (loadLibrary()) {
            setCpuSetTid(i, bigCoreNum);
        }
    }
}
