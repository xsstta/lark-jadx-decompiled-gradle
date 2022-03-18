package com.google.android.gms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

public class ErrorDialogFragment extends DialogFragment {

    /* renamed from: a */
    private Dialog f52538a;

    /* renamed from: b */
    private DialogInterface.OnCancelListener f52539b;

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f52538a == null) {
            setShowsDialog(false);
        }
        return this.f52538a;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f52539b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    /* renamed from: a */
    public static ErrorDialogFragment m78221a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        Dialog dialog2 = (Dialog) Preconditions.checkNotNull(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        errorDialogFragment.f52538a = dialog2;
        if (onCancelListener != null) {
            errorDialogFragment.f52539b = onCancelListener;
        }
        return errorDialogFragment;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
