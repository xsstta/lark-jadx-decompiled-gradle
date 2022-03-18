package pub.devrel.easypermissions;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.C0261c;
import pub.devrel.easypermissions.C70197a;

/* renamed from: pub.devrel.easypermissions.d */
public class C70208d extends C0261c {

    /* renamed from: c */
    private C70197a.AbstractC70198a f175355c;

    /* renamed from: d */
    private C70197a.AbstractC70199b f175356d;

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f175355c = null;
        this.f175356d = null;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.appcompat.app.C0261c
    /* renamed from: a */
    public Dialog mo946a(Bundle bundle) {
        mo5512a(false);
        C70207c cVar = new C70207c(getArguments());
        return cVar.mo247383a(getContext(), new DialogInterface$OnClickListenerC70206b(this, cVar, this.f175355c, this.f175356d));
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (getParentFragment() != null) {
            if (getParentFragment() instanceof C70197a.AbstractC70198a) {
                this.f175355c = (C70197a.AbstractC70198a) getParentFragment();
            }
            if (getParentFragment() instanceof C70197a.AbstractC70199b) {
                this.f175356d = (C70197a.AbstractC70199b) getParentFragment();
            }
        }
        if (context instanceof C70197a.AbstractC70198a) {
            this.f175355c = (C70197a.AbstractC70198a) context;
        }
        if (context instanceof C70197a.AbstractC70199b) {
            this.f175356d = (C70197a.AbstractC70199b) context;
        }
    }
}
