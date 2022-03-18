package com.huawei.hms.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.ui.SafeIntent;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.huawei.hms.utils.UIUtil;
import java.lang.reflect.InvocationTargetException;

public class BridgeActivity extends Activity {
    public static final String EXTRA_DELEGATE_CLASS_NAME = "intent.extra.DELEGATE_CLASS_OBJECT";
    public static final String EXTRA_DELEGATE_UPDATE_INFO = "intent.extra.update.info";
    public static final String EXTRA_INTENT = "intent.extra.intent";
    public static final String EXTRA_IS_FULLSCREEN = "intent.extra.isfullscreen";
    public static final String EXTRA_RESULT = "intent.extra.RESULT";

    /* renamed from: b */
    public static final int f57767b = m85011a("ro.build.hw_emui_api_level", 0);

    /* renamed from: a */
    public IBridgeActivityDelegate f57768a;

    public void BridgeActivity__onStop$___twin___() {
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        com_huawei_hms_activity_BridgeActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(this);
    }

    public void finish() {
        HMSLog.m86966i("BridgeActivity", "Enter finish.");
        super.finish();
    }

    public Intent getIntent() {
        Intent intent = super.getIntent();
        if (intent != null) {
            return new SafeIntent(intent);
        }
        return intent;
    }

    public void onDestroy() {
        super.onDestroy();
        IBridgeActivityDelegate iBridgeActivityDelegate = this.f57768a;
        if (iBridgeActivityDelegate != null) {
            iBridgeActivityDelegate.onBridgeActivityDestroy();
        }
    }

    /* renamed from: b */
    public final void mo81851b() {
        requestWindowFeature(1);
        Window window = getWindow();
        if (f57767b >= 9) {
            window.addFlags(67108864);
            m85012a(window, true);
        }
        window.getDecorView().setSystemUiVisibility(0);
    }

    /* renamed from: a */
    public final boolean mo81850a() {
        Intent intent = getIntent();
        if (intent == null) {
            HMSLog.m86964e("BridgeActivity", "In initialize, Must not pass in a null intent.");
            return false;
        }
        if (intent.getBooleanExtra(EXTRA_IS_FULLSCREEN, false)) {
            getWindow().setFlags(1024, 1024);
        }
        String stringExtra = intent.getStringExtra(EXTRA_DELEGATE_CLASS_NAME);
        if (stringExtra == null) {
            HMSLog.m86964e("BridgeActivity", "In initialize, Must not pass in a null or non class object.");
            return false;
        }
        try {
            IBridgeActivityDelegate iBridgeActivityDelegate = (IBridgeActivityDelegate) Class.forName(stringExtra).asSubclass(IBridgeActivityDelegate.class).newInstance();
            this.f57768a = iBridgeActivityDelegate;
            try {
                iBridgeActivityDelegate.onBridgeActivityCreate(this);
                return true;
            } catch (RuntimeException e) {
                HMSLog.m86964e("BridgeActivity", "Run time Exception." + e.getMessage());
                return false;
            }
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            HMSLog.m86964e("BridgeActivity", "In initialize, Failed to create 'IUpdateWizard' instance." + e2.getMessage());
            return false;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        IBridgeActivityDelegate iBridgeActivityDelegate = this.f57768a;
        if (iBridgeActivityDelegate != null) {
            iBridgeActivityDelegate.onBridgeConfigurationChanged();
        }
    }

    public static void com_huawei_hms_activity_BridgeActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(BridgeActivity bridgeActivity) {
        bridgeActivity.BridgeActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            BridgeActivity bridgeActivity2 = bridgeActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    bridgeActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() != null) {
            mo81851b();
            if (ResourceLoaderUtil.getmContext() == null) {
                ResourceLoaderUtil.setmContext(getApplicationContext());
            }
            if (!mo81850a()) {
                setResult(1, null);
                finish();
            }
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        IBridgeActivityDelegate iBridgeActivityDelegate = this.f57768a;
        if (iBridgeActivityDelegate != null) {
            iBridgeActivityDelegate.onKeyUp(i, keyEvent);
        }
        return super.onKeyUp(i, keyEvent);
    }

    public static Intent getIntentStartBridgeActivity(Activity activity, String str) {
        Intent intent = new Intent(activity, BridgeActivity.class);
        intent.putExtra(EXTRA_DELEGATE_CLASS_NAME, str);
        intent.putExtra(EXTRA_IS_FULLSCREEN, UIUtil.isActivityFullscreen(activity));
        return intent;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002e, code lost:
        com.huawei.hms.support.log.HMSLog.m86964e("BridgeActivity", "An exception occurred while reading: EMUI_SDK_INT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0035, code lost:
        return r8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:5:? A[ExcHandler: ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:1:0x0009] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m85011a(java.lang.String r7, int r8) {
        /*
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r0 = java.lang.Class.forName(r0)
            java.lang.String r1 = "getInt"
            r2 = 2
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e }
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 0
            r3[r5] = r4     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e }
            r6 = 1
            r3[r6] = r4     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e }
            java.lang.reflect.Method r1 = r0.getDeclaredMethod(r1, r3)     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e }
            r2[r5] = r7     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e }
            r2[r6] = r7     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e }
            java.lang.Object r7 = r1.invoke(r0, r2)     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e }
            int r7 = r7.intValue()     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e }
            return r7
        L_0x002e:
            java.lang.String r7 = "BridgeActivity"
            java.lang.String r0 = "An exception occurred while reading: EMUI_SDK_INT"
            com.huawei.hms.support.log.HMSLog.m86964e(r7, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.activity.BridgeActivity.m85011a(java.lang.String, int):int");
    }

    public static Intent getIntentStartBridgeActivity(Context context, String str) {
        Intent intent = new Intent(context, BridgeActivity.class);
        intent.putExtra(EXTRA_DELEGATE_CLASS_NAME, str);
        intent.putExtra(EXTRA_IS_FULLSCREEN, false);
        return intent;
    }

    /* renamed from: a */
    public static void m85012a(Window window, boolean z) {
        try {
            Class<?> cls = window.getClass();
            cls.getMethod("setHwFloating", Boolean.TYPE).invoke(window, Boolean.valueOf(z));
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
            HMSLog.m86964e("BridgeActivity", "In setHwFloating, Failed to call Window.setHwFloating()." + e.getMessage());
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        SafeIntent safeIntent = new SafeIntent(intent);
        super.onActivityResult(i, i2, safeIntent);
        IBridgeActivityDelegate iBridgeActivityDelegate = this.f57768a;
        if (iBridgeActivityDelegate != null && !iBridgeActivityDelegate.onBridgeActivityResult(i, i2, safeIntent) && !isFinishing()) {
            setResult(i2, safeIntent);
            finish();
        }
    }
}
