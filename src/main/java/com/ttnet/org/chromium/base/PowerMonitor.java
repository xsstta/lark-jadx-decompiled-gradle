package com.ttnet.org.chromium.base;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ttnet.org.chromium.base.LifeCycleMonitor;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import me.ele.lancet.base.annotations.Skip;

@JNINamespace("base::android")
public class PowerMonitor implements LifeCycleMonitor.AppStateListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static String CRONET_ACTION_BACK = null;
    public static String CRONET_ACTION_FORE = null;
    private static final String TAG = "PowerMonitor";
    public static String WSCHANNEL_ACTION_BACK;
    public static String WSCHANNEL_ACTION_FORE;
    private static LifeCycleMonitor mLifeCycleMonitor = new LifeCycleMonitor();
    private static boolean mListenAppStateIndependently;
    public static long receive_back_action;
    public static long receive_fore_action;
    private static AppStateReceiver receiver;
    private static PowerMonitor sInstance;
    private static String sPackageName;
    private boolean mIsBatteryPower;

    private static native void nativeOnBatteryChargingChanged();

    private static native void nativeOnInstantResume();

    private static native void nativeOnInstantSuspend();

    public static native void nativeOnResume();

    public static native void nativeOnSuspend();

    private PowerMonitor() {
    }

    @Override // com.ttnet.org.chromium.base.LifeCycleMonitor.AppStateListener
    public void onInstantEnterToBackground() {
        nativeOnInstantSuspend();
    }

    @Override // com.ttnet.org.chromium.base.LifeCycleMonitor.AppStateListener
    public void onInstantEnterToForeground() {
        nativeOnInstantResume();
    }

    public static void createForTests() {
        sInstance = new PowerMonitor();
    }

    private static boolean isBatteryPower() {
        if (sInstance == null) {
            create();
        }
        return sInstance.mIsBatteryPower;
    }

    @Override // com.ttnet.org.chromium.base.LifeCycleMonitor.AppStateListener
    public void onEnterToBackground() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (ProcessUtils.isMainProcess(applicationContext)) {
            Intent intent = new Intent();
            intent.setAction(CRONET_ACTION_BACK);
            if (!TextUtils.isEmpty(sPackageName)) {
                intent.setPackage(sPackageName);
            }
            applicationContext.sendBroadcast(intent);
        }
        nativeOnSuspend();
    }

    @Override // com.ttnet.org.chromium.base.LifeCycleMonitor.AppStateListener
    public void onEnterToForeground() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (ProcessUtils.isMainProcess(applicationContext)) {
            Intent intent = new Intent();
            intent.setAction(CRONET_ACTION_FORE);
            if (!TextUtils.isEmpty(sPackageName)) {
                intent.setPackage(sPackageName);
            }
            applicationContext.sendBroadcast(intent);
        }
        nativeOnResume();
    }

    public static void create() {
        if (sInstance == null) {
            Context applicationContext = ContextUtils.getApplicationContext();
            sInstance = new PowerMonitor();
            Intent INVOKEVIRTUAL_com_ttnet_org_chromium_base_PowerMonitor_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver = INVOKEVIRTUAL_com_ttnet_org_chromium_base_PowerMonitor_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(applicationContext, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (INVOKEVIRTUAL_com_ttnet_org_chromium_base_PowerMonitor_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver != null) {
                onBatteryChargingChanged(INVOKEVIRTUAL_com_ttnet_org_chromium_base_PowerMonitor_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver);
            }
            sPackageName = applicationContext.getPackageName();
            CRONET_ACTION_BACK = sPackageName + ".cronet.APP_BACKGROUND";
            CRONET_ACTION_FORE = sPackageName + ".cronet.APP_FOREGROUND";
            WSCHANNEL_ACTION_BACK = sPackageName + ".wschannel.APP_BACKGROUND";
            WSCHANNEL_ACTION_FORE = sPackageName + ".wschannel.APP_FOREGROUND";
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            INVOKEVIRTUAL_com_ttnet_org_chromium_base_PowerMonitor_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(applicationContext, new BroadcastReceiver() {
                /* class com.ttnet.org.chromium.base.PowerMonitor.C679911 */

                public void onReceive(Context context, Intent intent) {
                    PowerMonitor.onBatteryChargingChanged(intent);
                }
            }, intentFilter);
            if (!ProcessUtils.isMainProcess(applicationContext) && !mListenAppStateIndependently) {
                receiver = new AppStateReceiver();
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction(CRONET_ACTION_BACK);
                intentFilter2.addAction(CRONET_ACTION_FORE);
                intentFilter2.addAction(WSCHANNEL_ACTION_BACK);
                intentFilter2.addAction(WSCHANNEL_ACTION_FORE);
                INVOKEVIRTUAL_com_ttnet_org_chromium_base_PowerMonitor_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(applicationContext, receiver, intentFilter2);
            } else if (applicationContext instanceof Application) {
                mLifeCycleMonitor.setAppStateChangedListener(sInstance);
                ((Application) applicationContext).registerActivityLifecycleCallbacks(mLifeCycleMonitor);
            }
        }
    }

    public static void setListenAppStateIndependently(boolean z) {
        mListenAppStateIndependently = z;
    }

    public static void onBatteryChargingChanged(Intent intent) {
        int intExtra = intent.getIntExtra("plugged", -1);
        PowerMonitor powerMonitor = sInstance;
        boolean z = true;
        if (intExtra == 2 || intExtra == 1) {
            z = false;
        }
        powerMonitor.mIsBatteryPower = z;
        nativeOnBatteryChargingChanged();
    }

    public static class AppStateReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            long currentTimeMillis = System.currentTimeMillis();
            String action = intent.getAction();
            if (action.equals(PowerMonitor.CRONET_ACTION_FORE) || action.equals(PowerMonitor.WSCHANNEL_ACTION_FORE)) {
                PowerMonitor.receive_fore_action = currentTimeMillis;
                if (currentTimeMillis - PowerMonitor.receive_fore_action > 10000) {
                    PowerMonitor.nativeOnResume();
                }
            } else if (action.equals(PowerMonitor.CRONET_ACTION_BACK) || action.equals(PowerMonitor.WSCHANNEL_ACTION_BACK)) {
                PowerMonitor.receive_back_action = currentTimeMillis;
                if (currentTimeMillis - PowerMonitor.receive_back_action > 10000) {
                    PowerMonitor.nativeOnSuspend();
                }
            }
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    public static Intent INVOKEVIRTUAL_com_ttnet_org_chromium_base_PowerMonitor_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }
}
