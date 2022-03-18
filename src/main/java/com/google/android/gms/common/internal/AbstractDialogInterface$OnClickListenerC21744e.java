package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.internal.AbstractC21667e;

/* renamed from: com.google.android.gms.common.internal.e */
public abstract class AbstractDialogInterface$OnClickListenerC21744e implements DialogInterface.OnClickListener {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo73703a();

    /* renamed from: a */
    public static AbstractDialogInterface$OnClickListenerC21744e m78974a(Activity activity, Intent intent, int i) {
        return new C21759p(intent, activity, i);
    }

    /* renamed from: a */
    public static AbstractDialogInterface$OnClickListenerC21744e m78975a(AbstractC21667e eVar, Intent intent, int i) {
        return new C21760q(intent, eVar, i);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo73703a();
        } catch (ActivityNotFoundException e) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
