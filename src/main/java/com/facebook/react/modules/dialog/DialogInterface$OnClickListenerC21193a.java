package com.facebook.react.modules.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: com.facebook.react.modules.dialog.a */
public class DialogInterface$OnClickListenerC21193a extends DialogInterface$OnCancelListenerC1021b implements DialogInterface.OnClickListener {

    /* renamed from: c */
    private final DialogModule.DialogInterface$OnClickListenerC21191a f51668c;

    public DialogInterface$OnClickListenerC21193a() {
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    /* renamed from: a */
    public Dialog mo946a(Bundle bundle) {
        return m76926a(getActivity(), getArguments(), this);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogModule.DialogInterface$OnClickListenerC21191a aVar = this.f51668c;
        if (aVar != null) {
            aVar.onDismiss(dialogInterface);
        }
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        DialogModule.DialogInterface$OnClickListenerC21191a aVar = this.f51668c;
        if (aVar != null) {
            aVar.onClick(dialogInterface, i);
        }
    }

    public DialogInterface$OnClickListenerC21193a(DialogModule.DialogInterface$OnClickListenerC21191a aVar, Bundle bundle) {
        this.f51668c = aVar;
        setArguments(bundle);
    }

    /* renamed from: a */
    public static Dialog m76926a(Context context, Bundle bundle, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder title = new AlertDialog.Builder(context).setTitle(bundle.getString("title"));
        if (bundle.containsKey("button_positive")) {
            title.setPositiveButton(bundle.getString("button_positive"), onClickListener);
        }
        if (bundle.containsKey("button_negative")) {
            title.setNegativeButton(bundle.getString("button_negative"), onClickListener);
        }
        if (bundle.containsKey("button_neutral")) {
            title.setNeutralButton(bundle.getString("button_neutral"), onClickListener);
        }
        if (bundle.containsKey("message")) {
            title.setMessage(bundle.getString("message"));
        }
        if (bundle.containsKey("items")) {
            title.setItems(bundle.getCharSequenceArray("items"), onClickListener);
        }
        return title.create();
    }
}
