package com.bytedance.common.jato.boost;

import android.content.Context;
import android.os.Build;
import com.bytedance.common.jato.utils.DoubleReflector;
import java.lang.reflect.Method;

public class HisiCpuBoost implements ICpuBoost {
    public static volatile boolean isInit;
    public static Class perfClass;
    public static Method perfEventMethod;
    public static Object perfObject;

    @Override // com.bytedance.common.jato.boost.ICpuBoost
    public void release() {
    }

    @Override // com.bytedance.common.jato.boost.ICpuBoost
    public boolean tryBoostGpu(long j) {
        return false;
    }

    @Override // com.bytedance.common.jato.boost.ICpuBoost
    public void init(Context context) {
        CpuBoostManager.getWorkExecuteService().execute(new Runnable() {
            /* class com.bytedance.common.jato.boost.HisiCpuBoost.RunnableC36031 */

            public void run() {
                boolean z;
                boolean z2;
                boolean z3;
                synchronized (CpuBoostManager.class) {
                    if (!HisiCpuBoost.isInit) {
                        try {
                            if (Build.VERSION.SDK_INT == 29) {
                                Class<?> cls = DoubleReflector.getClass("android.scrollerboostmanager.ScrollerBoostManager");
                                HisiCpuBoost.perfObject = DoubleReflector.getMethod(cls, "getInstance", null).invoke(cls, null);
                                HisiCpuBoost.perfEventMethod = DoubleReflector.getMethod(cls, "listFling", Integer.TYPE);
                                cls.getDeclaredMethod("init", null).invoke(HisiCpuBoost.perfObject, null);
                                HisiCpuBoost.isInit = true;
                            } else {
                                if (Build.VERSION.SDK_INT == 28) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (Build.VERSION.SDK_INT == 27) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                boolean z4 = z | z2;
                                if (Build.VERSION.SDK_INT == 26) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z4 || z3) {
                                    HisiCpuBoost.perfClass = DoubleReflector.getClass("android.iawareperf.UniPerf");
                                    HisiCpuBoost.perfEventMethod = DoubleReflector.getMethod(HisiCpuBoost.perfClass, "uniPerfEvent", Integer.TYPE, String.class, int[].class);
                                    HisiCpuBoost.perfObject = DoubleReflector.getMethod(HisiCpuBoost.perfClass, "getInstance", new Class[0]).invoke(null, new Object[0]);
                                    HisiCpuBoost.isInit = true;
                                }
                            }
                        } catch (Throwable th) {
                            CpuBoostManager.onError("cpuboost init fail", th);
                        }
                    }
                }
            }
        });
    }

    @Override // com.bytedance.common.jato.boost.ICpuBoost
    public boolean tryBoostCpu(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        if (j <= 0 || !isInit) {
            return false;
        }
        try {
            if (Build.VERSION.SDK_INT == 29) {
                perfEventMethod.invoke(perfObject, Integer.valueOf((int) j));
            } else {
                if (Build.VERSION.SDK_INT == 28) {
                    z = true;
                } else {
                    z = false;
                }
                if (Build.VERSION.SDK_INT == 27) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z4 = z | z2;
                if (Build.VERSION.SDK_INT == 26) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z4 || z3) {
                    ((Integer) perfEventMethod.invoke(perfObject, 4099, "canBoost=true|screenOn=1", new int[0])).intValue();
                }
            }
            return true;
        } catch (Throwable th) {
            CpuBoostManager.onError("cpuboost boost fail", th);
            return false;
        }
    }
}
