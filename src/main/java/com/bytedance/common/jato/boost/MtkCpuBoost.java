package com.bytedance.common.jato.boost;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Method;

public class MtkCpuBoost implements ICpuBoost {
    public static Method disableMethod;
    public static Method enableMethod;
    public static boolean isInit;
    public static Object perfObject;
    public static Method registerMethod;
    public static Method setConfigMethod;

    @Override // com.bytedance.common.jato.boost.ICpuBoost
    public void release() {
        try {
            disableMethod.invoke(perfObject, new Object[0]);
        } catch (Throwable th) {
            CpuBoostManager.onError("cpuboost release fail", th);
        }
    }

    @Override // com.bytedance.common.jato.boost.ICpuBoost
    public boolean tryBoostGpu(long j) {
        return invokeBoost(j, 8);
    }

    @Override // com.bytedance.common.jato.boost.ICpuBoost
    public void init(final Context context) {
        CpuBoostManager.getWorkExecuteService().execute(new Runnable() {
            /* class com.bytedance.common.jato.boost.MtkCpuBoost.RunnableC36041 */

            public void run() {
                try {
                    Class<?> cls = Class.forName("com.mediatek.perfservice.PerfServiceWrapper");
                    try {
                        MtkCpuBoost.perfObject = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
                    } catch (Throwable unused) {
                        MtkCpuBoost.perfObject = cls.getConstructor(Context.class).newInstance(context);
                    }
                    MtkCpuBoost.registerMethod = cls.getDeclaredMethod("userRegScn", new Class[0]);
                    MtkCpuBoost.setConfigMethod = cls.getDeclaredMethod("userRegScnConfig", Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
                    MtkCpuBoost.enableMethod = cls.getDeclaredMethod("userEnable", Integer.TYPE);
                    MtkCpuBoost.disableMethod = cls.getDeclaredMethod("userResetAll", new Class[0]);
                    MtkCpuBoost.isInit = true;
                } catch (Throwable th) {
                    CpuBoostManager.onError("cpuboost init fail", th);
                }
            }
        });
    }

    @Override // com.bytedance.common.jato.boost.ICpuBoost
    public boolean tryBoostCpu(long j) {
        if (invokeBoost(j, 23) || invokeBoost(j, 4)) {
            return true;
        }
        return false;
    }

    private boolean invokeBoost(long j, int i) {
        if (j <= 0 || !isInit) {
            return false;
        }
        try {
            int intValue = ((Integer) registerMethod.invoke(perfObject, new Object[0])).intValue();
            setConfigMethod.invoke(perfObject, Integer.valueOf(intValue), Integer.valueOf(i), 1000, 0, 0, 0);
            enableMethod.invoke(perfObject, Integer.valueOf(intValue));
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                /* class com.bytedance.common.jato.boost.MtkCpuBoost.RunnableC36052 */

                public void run() {
                    try {
                        MtkCpuBoost.disableMethod.invoke(MtkCpuBoost.perfObject, new Object[0]);
                    } catch (Throwable th) {
                        CpuBoostManager.onError("cpuboost boost fail", th);
                    }
                }
            }, j);
            return true;
        } catch (Throwable th) {
            CpuBoostManager.onError("cpuboost boost fail", th);
            return false;
        }
    }
}
