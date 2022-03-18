package com.facebook.react.devsupport;

import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;

public class DevSettingsActivity extends PreferenceActivity {
    /* renamed from: a */
    public void mo71773a() {
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        m76747a(this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(getApplication().getResources().getString(R.string.catalyst_settings_title));
        addPreferencesFromResource(R.xml.rn_dev_preferences);
    }

    /* renamed from: a */
    public static void m76747a(DevSettingsActivity devSettingsActivity) {
        devSettingsActivity.mo71773a();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            DevSettingsActivity devSettingsActivity2 = devSettingsActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    devSettingsActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }
}
