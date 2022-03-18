package com.bytedance.common.jato.dex;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.bytedance.common.jato.Jato;
import com.bytedance.common.jato.JatoListener;
import com.bytedance.common.jato.util.DeviceInfoUtils;

public class VerifierModeSwitch {
    private static int sCurrentSdkVersion;
    private static volatile boolean sIsInit;
    private static int sTargetSdkVersion;

    public static void disableVerifier() {
        if (!sIsInit) {
            Jato.getListener().onErrorInfo("none_class_verify fail", new IllegalStateException("not init"));
        } else if (Build.VERSION.SDK_INT >= 21) {
            int verifyNone = DexTricksNativeHolder.verifyNone(sTargetSdkVersion, sCurrentSdkVersion);
            if (verifyNone != 0) {
                JatoListener listener = Jato.getListener();
                listener.onErrorInfo("none_class_verify disable fail", new IllegalStateException("result: " + verifyNone));
            }
        } else if (Build.VERSION.SDK_INT != 19 || DeviceInfoUtils.isART()) {
            Jato.getListener().onDebugInfo("none_class_verify fail because Android OS version not support");
        } else {
            int dvmVerifyNone = DexTricksNativeHolder.dvmVerifyNone();
            if (dvmVerifyNone != 0) {
                JatoListener listener2 = Jato.getListener();
                listener2.onErrorInfo("none_class_verify disable fail", new IllegalStateException("result: " + dvmVerifyNone));
            }
        }
    }

    public static void enableVerifier() {
        if (!sIsInit) {
            Jato.getListener().onErrorInfo("none_class_verify fail", new IllegalStateException("not init"));
        } else if (Build.VERSION.SDK_INT >= 21) {
            int verifyEnable = DexTricksNativeHolder.verifyEnable();
            if (verifyEnable != 0) {
                JatoListener listener = Jato.getListener();
                listener.onErrorInfo("none_class_verify enable fail", new IllegalStateException("result: " + verifyEnable));
            }
        } else if (Build.VERSION.SDK_INT != 19 || DeviceInfoUtils.isART()) {
            Jato.getListener().onDebugInfo("none_class_verify fail because Android OS version not support");
        } else {
            int dvmVerifyEnable = DexTricksNativeHolder.dvmVerifyEnable();
            if (dvmVerifyEnable != 0) {
                JatoListener listener2 = Jato.getListener();
                listener2.onErrorInfo("none_class_verify disable fail", new IllegalStateException("result: " + dvmVerifyEnable));
            }
        }
    }

    public static synchronized void init(Context context) {
        synchronized (VerifierModeSwitch.class) {
            if (!sIsInit) {
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                sCurrentSdkVersion = Build.VERSION.SDK_INT;
                sTargetSdkVersion = applicationInfo.targetSdkVersion;
                sIsInit = true;
            }
        }
    }
}
