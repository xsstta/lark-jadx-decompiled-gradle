package com.bytedance.common.jato.boost;

import android.content.Context;
import com.bytedance.common.jato.utils.DoubleReflector;
import java.lang.reflect.Method;
import java.util.concurrent.CopyOnWriteArrayList;

public class QcmCpuBoost implements ICpuBoost {
    private static int[] QCOM_CONFIGS_HIGH = {1082146816, 4095, 1082147072, 4095, 1082130432, 4095, 1082130688, 4095, 1077936128, 1};
    private static int[] QCOM_DISABLE_LPM = {1077936128, 1};
    private static int[] QCOM_GPU_BOOST = {1115701248, 1, 1115734016, 2000};
    private static int[] QCOM_STORAGE_BOOST = {1119944704, 1};
    public static volatile boolean isInit;
    private static CopyOnWriteArrayList<Integer> sBoostHandles = new CopyOnWriteArrayList<>();
    public static Method sQcomBoostMethod;
    public static Object sQcomBoostObj;
    public static Method sQcomReleaseMethod;

    @Override // com.bytedance.common.jato.boost.ICpuBoost
    public void release() {
        if (!(sQcomReleaseMethod == null || !isInit || sQcomBoostObj == null)) {
            for (int i = 0; i < sBoostHandles.size(); i++) {
                try {
                    sQcomReleaseMethod.invoke(sQcomBoostObj, sBoostHandles.get(i));
                } catch (Throwable th) {
                    CpuBoostManager.onError("cpuboost release fail", th);
                    return;
                }
            }
        }
    }

    @Override // com.bytedance.common.jato.boost.ICpuBoost
    public boolean tryBoostGpu(long j) {
        return invokeBoost(j, QCOM_GPU_BOOST);
    }

    @Override // com.bytedance.common.jato.boost.ICpuBoost
    public void init(final Context context) {
        CpuBoostManager.getWorkExecuteService().execute(new Runnable() {
            /* class com.bytedance.common.jato.boost.QcmCpuBoost.RunnableC36091 */

            public void run() {
                synchronized (CpuBoostManager.class) {
                    if (!QcmCpuBoost.isInit) {
                        if (QcmCpuBoost.sQcomBoostObj == null || QcmCpuBoost.sQcomBoostMethod == null) {
                            try {
                                Class<?> cls = DoubleReflector.getClass("android.util.BoostFramework");
                                try {
                                    QcmCpuBoost.sQcomBoostObj = DoubleReflector.getConstructor(cls, Context.class).newInstance(context);
                                } catch (Throwable unused) {
                                    QcmCpuBoost.sQcomBoostObj = DoubleReflector.getConstructor(cls, new Class[0]).newInstance(new Object[0]);
                                }
                                QcmCpuBoost.sQcomBoostMethod = DoubleReflector.getMethod(cls, "perfLockAcquire", Integer.TYPE, int[].class);
                                QcmCpuBoost.isInit = true;
                                QcmCpuBoost.sQcomReleaseMethod = DoubleReflector.getMethod(cls, "perfLockReleaseHandler", Integer.TYPE);
                            } catch (Throwable th) {
                                CpuBoostManager.onError("cpuboost init fail", th);
                            }
                        }
                    }
                }
            }
        });
    }

    @Override // com.bytedance.common.jato.boost.ICpuBoost
    public boolean tryBoostCpu(long j) {
        invokeBoost(j, QCOM_DISABLE_LPM);
        return invokeBoost(j, QCOM_CONFIGS_HIGH);
    }

    private boolean invokeBoost(long j, int[] iArr) {
        if (j <= 0 || !isInit) {
            return false;
        }
        try {
            if (!(sQcomBoostObj == null || sQcomBoostMethod == null)) {
                int intValue = ((Integer) sQcomBoostMethod.invoke(sQcomBoostObj, Integer.valueOf((int) j), iArr)).intValue();
                if (intValue != 0) {
                    sBoostHandles.add(Integer.valueOf(intValue));
                }
            }
            return true;
        } catch (Throwable th) {
            CpuBoostManager.onError("cpuboost boost fail", th);
            return false;
        }
    }
}
