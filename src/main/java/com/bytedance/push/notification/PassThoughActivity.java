package com.bytedance.push.notification;

import android.os.Build;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;

public class PassThoughActivity extends PushActivity {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.push.notification.PushActivity
    /* renamed from: a */
    public boolean mo68957a() {
        return true;
    }

    /* renamed from: b */
    public void mo68958b() {
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        m74510a(this);
    }

    /* renamed from: a */
    public static void m74510a(PassThoughActivity passThoughActivity) {
        passThoughActivity.mo68958b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            PassThoughActivity passThoughActivity2 = passThoughActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    passThoughActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }
}
