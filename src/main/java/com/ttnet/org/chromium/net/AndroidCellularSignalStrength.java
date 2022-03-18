package com.ttnet.org.chromium.net;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ttnet.org.chromium.base.ApplicationStatus;
import com.ttnet.org.chromium.base.ContextUtils;
import com.ttnet.org.chromium.base.ThreadUtils;
import com.ttnet.org.chromium.base.annotations.JNINamespace;

@JNINamespace("net::android")
public class AndroidCellularSignalStrength {
    private static final AndroidCellularSignalStrength sInstance = new AndroidCellularSignalStrength();
    public volatile int mSignalLevel = Integer.MIN_VALUE;

    public static HandlerThread new_android_os_HandlerThread_by_knot(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    private class CellStateListener extends PhoneStateListener implements ApplicationStatus.ApplicationStateListener {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final TelephonyManager mTelephonyManager;

        private void register() {
            this.mTelephonyManager.listen(this, DynamicModule.f58006b);
        }

        private void unregister() {
            AndroidCellularSignalStrength.this.mSignalLevel = Integer.MIN_VALUE;
            this.mTelephonyManager.listen(this, 0);
        }

        @Override // com.ttnet.org.chromium.base.ApplicationStatus.ApplicationStateListener
        public void onApplicationStateChange(int i) {
            if (i == 1) {
                register();
            } else if (i == 2) {
                unregister();
            }
        }

        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            if (ApplicationStatus.getStateForApplication() == 1) {
                try {
                    AndroidCellularSignalStrength.this.mSignalLevel = signalStrength.getLevel();
                } catch (SecurityException unused) {
                    AndroidCellularSignalStrength.this.mSignalLevel = Integer.MIN_VALUE;
                }
            }
        }

        CellStateListener() {
            ThreadUtils.assertOnBackgroundThread();
            TelephonyManager telephonyManager = (TelephonyManager) ContextUtils.getApplicationContext().getSystemService("phone");
            this.mTelephonyManager = telephonyManager;
            if (telephonyManager.getSimState() == 5) {
                ApplicationStatus.registerApplicationStateListener(this);
                onApplicationStateChange(ApplicationStatus.getStateForApplication());
            }
        }
    }

    private static int getSignalStrengthLevel() {
        return sInstance.mSignalLevel;
    }

    private AndroidCellularSignalStrength() {
        if (Build.VERSION.SDK_INT >= 23) {
            HandlerThread new_android_os_HandlerThread_by_knot = new_android_os_HandlerThread_by_knot("AndroidCellularSignalStrength");
            new_android_os_HandlerThread_by_knot.start();
            new Handler(new_android_os_HandlerThread_by_knot.getLooper()).post(new Runnable() {
                /* class com.ttnet.org.chromium.net.AndroidCellularSignalStrength.RunnableC680021 */

                public void run() {
                    new CellStateListener();
                }
            });
        }
    }
}
