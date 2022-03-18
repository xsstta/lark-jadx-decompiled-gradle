package com.bytedance.ee.bear.debug;

import android.os.Build;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;

public class DebugMainProcActivity extends DebugActivity {
    /* renamed from: b */
    public void mo21154b() {
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        m21452a(this);
    }

    /* renamed from: a */
    public static void m21452a(DebugMainProcActivity debugMainProcActivity) {
        debugMainProcActivity.mo21154b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            DebugMainProcActivity debugMainProcActivity2 = debugMainProcActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    debugMainProcActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }
}
