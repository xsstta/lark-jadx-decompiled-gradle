package com.bytedance.common.jato.boost;

import android.content.Context;
import android.os.Build;
import java.util.concurrent.ExecutorService;

public class CpuBoostManager {
    private static ICpuBoost sCpuBoost;
    private static BoostListener sListener;
    private static ExecutorService sWorkExecutorService;

    static ExecutorService getWorkExecuteService() {
        return sWorkExecutorService;
    }

    public static synchronized void release() {
        synchronized (CpuBoostManager.class) {
            ICpuBoost iCpuBoost = sCpuBoost;
            if (iCpuBoost != null) {
                iCpuBoost.release();
            }
        }
    }

    static ICpuBoost createCpuBoost() {
        String str = Build.HARDWARE;
        onDebug("cpuboost hardware: " + Build.HARDWARE);
        if (str.startsWith("qcom") || str.startsWith("msm") || str.startsWith("qsc") || str.startsWith("sdm")) {
            onDebug("cpuboost qcm boost");
            return new QcmCpuBoost();
        } else if (str.startsWith("mt")) {
            onDebug("cpuboost mtk boost");
            return new MtkCpuBoost();
        } else if (str.startsWith("kirin") || str.startsWith("hi")) {
            onDebug("cpuboost hisilicon boost");
            return new HisiCpuBoost();
        } else {
            onError("cpuboost not found boost for: " + Build.HARDWARE, null);
            return null;
        }
    }

    static void onDebug(String str) {
        BoostListener boostListener = sListener;
        if (boostListener != null) {
            boostListener.onDebug(str);
        }
    }

    public static synchronized boolean tryCpuBoost(long j) {
        synchronized (CpuBoostManager.class) {
            ICpuBoost iCpuBoost = sCpuBoost;
            if (iCpuBoost == null) {
                return false;
            }
            return iCpuBoost.tryBoostCpu(j);
        }
    }

    public static synchronized boolean tryGpuBoost(long j) {
        synchronized (CpuBoostManager.class) {
            ICpuBoost iCpuBoost = sCpuBoost;
            if (iCpuBoost == null) {
                return false;
            }
            return iCpuBoost.tryBoostGpu(j);
        }
    }

    static void onError(String str, Throwable th) {
        BoostListener boostListener = sListener;
        if (boostListener != null) {
            boostListener.onError(str, th);
        }
    }

    public static void init(Context context, ExecutorService executorService, BoostListener boostListener) {
        sWorkExecutorService = executorService;
        sListener = boostListener;
        ICpuBoost createCpuBoost = createCpuBoost();
        sCpuBoost = createCpuBoost;
        if (createCpuBoost != null) {
            createCpuBoost.init(context);
        }
    }
}
