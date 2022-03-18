package com.huawei.hms.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;

public class EnableServiceActivity extends Activity {
    public void EnableServiceActivity__onStop$___twin___() {
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        com_huawei_hms_activity_EnableServiceActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_endisable_service);
    }

    public static void com_huawei_hms_activity_EnableServiceActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(EnableServiceActivity enableServiceActivity) {
        enableServiceActivity.EnableServiceActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            EnableServiceActivity enableServiceActivity2 = enableServiceActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    enableServiceActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }
}
