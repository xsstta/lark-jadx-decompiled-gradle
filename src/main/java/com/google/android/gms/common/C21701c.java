package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.common.c */
public class C21701c extends DialogInterface$OnCancelListenerC1021b {

    /* renamed from: c */
    private Dialog f52918c;

    /* renamed from: d */
    private DialogInterface.OnCancelListener f52919d;

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    /* renamed from: a */
    public Dialog mo946a(Bundle bundle) {
        if (this.f52918c == null) {
            mo5514b(false);
        }
        return this.f52918c;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f52919d;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    /* renamed from: a */
    public static C21701c m78853a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C21701c cVar = new C21701c();
        Dialog dialog2 = (Dialog) Preconditions.checkNotNull(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        cVar.f52918c = dialog2;
        if (onCancelListener != null) {
            cVar.f52919d = onCancelListener;
        }
        return cVar;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    /* renamed from: a */
    public void mo5511a(FragmentManager fragmentManager, String str) {
        super.mo5511a(fragmentManager, str);
    }
}
