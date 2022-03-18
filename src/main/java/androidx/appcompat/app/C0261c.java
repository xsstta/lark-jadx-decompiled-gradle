package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;

/* renamed from: androidx.appcompat.app.c */
public class C0261c extends DialogInterface$OnCancelListenerC1021b {
    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    /* renamed from: a */
    public Dialog mo946a(Bundle bundle) {
        return new DialogC0259b(getContext(), mo5515e());
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    /* renamed from: a */
    public void mo947a(Dialog dialog, int i) {
        if (dialog instanceof DialogC0259b) {
            DialogC0259b bVar = (DialogC0259b) dialog;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            bVar.supportRequestWindowFeature(1);
            return;
        }
        super.mo947a(dialog, i);
    }
}
