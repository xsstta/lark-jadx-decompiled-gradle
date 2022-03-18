package com.bytedance.sysoptimizer;

import android.app.Activity;
import android.os.Build;
import me.ele.lancet.base.Origin;
import me.ele.lancet.base.This;

public class EnterTransitionLancet {
    public void onStop() {
        Origin.callVoid();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            Activity activity = (Activity) This.get();
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    activity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }
}
