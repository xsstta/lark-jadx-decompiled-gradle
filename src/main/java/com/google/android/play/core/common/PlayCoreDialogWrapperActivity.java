package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.android.play.core.internal.bd;

public class PlayCoreDialogWrapperActivity extends Activity {

    /* renamed from: a */
    private ResultReceiver f55998a;

    /* renamed from: a */
    public static void m82220a(Context context) {
        bd.m82320a(context.getPackageManager(), new ComponentName(context.getPackageName(), "com.google.android.play.core.common.PlayCoreDialogWrapperActivity"));
    }

    /* renamed from: a */
    public void mo78848a() {
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        ResultReceiver resultReceiver;
        Bundle bundle;
        int i3;
        super.onActivityResult(i, i2, intent);
        if (i == 0 && (resultReceiver = this.f55998a) != null) {
            if (i2 == -1) {
                bundle = new Bundle();
                i3 = 1;
            } else if (i2 == 0) {
                bundle = new Bundle();
                i3 = 2;
            }
            resultReceiver.send(i3, bundle);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f55998a = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            try {
                startIntentSenderForResult(((PendingIntent) getIntent().getExtras().get("confirmation_intent")).getIntentSender(), 0, null, 0, 0, 0);
            } catch (IntentSender.SendIntentException unused) {
                ResultReceiver resultReceiver = this.f55998a;
                if (resultReceiver != null) {
                    resultReceiver.send(3, new Bundle());
                }
                finish();
            }
        } else {
            this.f55998a = (ResultReceiver) bundle.getParcelable("result_receiver");
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f55998a);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        m82221a(this);
    }

    /* renamed from: a */
    public static void m82221a(PlayCoreDialogWrapperActivity playCoreDialogWrapperActivity) {
        playCoreDialogWrapperActivity.mo78848a();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            PlayCoreDialogWrapperActivity playCoreDialogWrapperActivity2 = playCoreDialogWrapperActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    playCoreDialogWrapperActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }
}
