package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.android.gms.common.C21608a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.C21661c;
import com.huawei.hms.adapter.internal.CommonCode;

public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    private int f52557a;

    /* renamed from: a */
    public void mo73193a() {
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        m78246a(this);
    }

    /* renamed from: a */
    public static PendingIntent m78244a(Context context, PendingIntent pendingIntent, int i) {
        return PendingIntent.getActivity(context, 0, m78245a(context, pendingIntent, i, true), 134217728);
    }

    /* renamed from: a */
    public static Intent m78245a(Context context, PendingIntent pendingIntent, int i, boolean z) {
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", z);
        return intent;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f52557a = bundle.getInt(CommonCode.MapKey.HAS_RESOLUTION);
        }
        if (this.f52557a != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
            } else if (pendingIntent != null) {
                try {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                    this.f52557a = 1;
                } catch (IntentSender.SendIntentException e) {
                    Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                    finish();
                }
            } else {
                C21608a.m78228a().mo73183b(this, num.intValue(), 2, this);
                this.f52557a = 1;
            }
        }
    }

    /* renamed from: a */
    public static void m78246a(GoogleApiActivity googleApiActivity) {
        googleApiActivity.mo73193a();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            GoogleApiActivity googleApiActivity2 = googleApiActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    googleApiActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f52557a = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                C21661c a = C21661c.m78523a(this);
                if (i2 == -1) {
                    a.mo73423d();
                } else if (i2 == 0) {
                    a.mo73420b(new ConnectionResult(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.f52557a = 0;
            setResult(i2, intent);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt(CommonCode.MapKey.HAS_RESOLUTION, this.f52557a);
        super.onSaveInstanceState(bundle);
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f52557a = 0;
        setResult(0);
        finish();
    }
}
