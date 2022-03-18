package com.google.android.play.core.missingsplits;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.android.play.core.internal.C22630b;
import com.google.android.play.core.internal.bf;

public class PlayCoreMissingSplitsActivity extends Activity implements DialogInterface.OnClickListener {
    /* renamed from: a */
    private final void m82475a(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 66);
        sb.append("market://details?id=");
        sb.append(str);
        sb.append("&referrer=utm_source%3Dplay.core.missingsplits");
        try {
            startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(sb.toString())).setPackage("com.android.vending"));
        } catch (ActivityNotFoundException e) {
            new C22630b(getClass().getName()).mo78872a(e, "Couldn't start missing splits activity for %s", str);
        }
    }

    /* renamed from: b */
    private final String m82476b() {
        return getApplicationInfo().loadLabel(getPackageManager()).toString();
    }

    /* renamed from: a */
    public void mo78965a() {
        super.onStop();
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            m82475a(getPackageName());
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AlertDialog.Builder neutralButton = new AlertDialog.Builder(this).setTitle("Installation failed").setCancelable(false).setNeutralButton("Close", this);
        if (bf.m82327a(this)) {
            String b = m82476b();
            StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 91);
            sb.append("The app ");
            sb.append(b);
            sb.append(" is missing required components and must be reinstalled from the Google Play Store.");
            neutralButton.setMessage(sb.toString()).setPositiveButton("Reinstall", this);
        } else {
            String b2 = m82476b();
            StringBuilder sb2 = new StringBuilder(String.valueOf(b2).length() + 87);
            sb2.append("The app ");
            sb2.append(b2);
            sb2.append(" is missing required components and must be reinstalled from an official store.");
            neutralButton.setMessage(sb2.toString());
        }
        neutralButton.create().show();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        m82474a(this);
    }

    /* renamed from: a */
    public static void m82474a(PlayCoreMissingSplitsActivity playCoreMissingSplitsActivity) {
        playCoreMissingSplitsActivity.mo78965a();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            PlayCoreMissingSplitsActivity playCoreMissingSplitsActivity2 = playCoreMissingSplitsActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    playCoreMissingSplitsActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }
}
