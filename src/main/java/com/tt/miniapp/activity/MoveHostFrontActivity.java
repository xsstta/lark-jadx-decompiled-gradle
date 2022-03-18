package com.tt.miniapp.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.tt.miniapp.util.C67018a;

public class MoveHostFrontActivity extends Activity {
    /* renamed from: a */
    public void mo230343a() {
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        m257723a(this);
    }

    public void onResume() {
        super.onResume();
        if (!isFinishing()) {
            AppBrandLogger.m52830i("MoveHostFrontActivity", "finish onResume");
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (C67018a.m261209a(getIntent())) {
            C67018a.m261219d(this);
        }
    }

    /* renamed from: a */
    public static void m257723a(MoveHostFrontActivity moveHostFrontActivity) {
        moveHostFrontActivity.mo230343a();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MoveHostFrontActivity moveHostFrontActivity2 = moveHostFrontActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    moveHostFrontActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0 && !isFinishing()) {
            AppBrandLogger.m52830i("MoveHostFrontActivity", "finish onTouch");
            finish();
        }
        return super.onTouchEvent(motionEvent);
    }
}
