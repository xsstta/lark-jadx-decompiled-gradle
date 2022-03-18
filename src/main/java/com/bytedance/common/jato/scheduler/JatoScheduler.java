package com.bytedance.common.jato.scheduler;

import android.content.Context;
import android.os.Build;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.common.jato.util.DeviceInfoUtils;
import java.util.concurrent.atomic.AtomicBoolean;

public class JatoScheduler {
    private static JatoScheduler sInstance;
    private AtomicBoolean mIsInit = new AtomicBoolean(false);

    public static synchronized JatoScheduler getInstance() {
        JatoScheduler jatoScheduler;
        synchronized (JatoScheduler.class) {
            if (sInstance == null) {
                sInstance = new JatoScheduler();
            }
            jatoScheduler = sInstance;
        }
        return jatoScheduler;
    }

    public void init(Context context, int i) {
        if (this.mIsInit.compareAndSet(false, true) && Build.VERSION.SDK_INT > 22 && SchedulerNativeHolder.ensureInited()) {
            int i2 = context.getApplicationInfo().targetSdkVersion;
            ByteHook.init();
            if (DeviceInfoUtils.isEmulatorTrans2Arm()) {
                i |= 1024;
            }
            SchedulerNativeHolder.nativeInit(i2, i, context);
        }
    }
}
