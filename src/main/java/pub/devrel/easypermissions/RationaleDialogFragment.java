package pub.devrel.easypermissions;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import pub.devrel.easypermissions.C70197a;

public class RationaleDialogFragment extends DialogFragment {

    /* renamed from: a */
    private C70197a.AbstractC70198a f175341a;

    /* renamed from: b */
    private C70197a.AbstractC70199b f175342b;

    /* renamed from: c */
    private boolean f175343c;

    public void onDetach() {
        super.onDetach();
        this.f175341a = null;
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.f175343c = true;
        super.onSaveInstanceState(bundle);
    }

    public Dialog onCreateDialog(Bundle bundle) {
        setCancelable(false);
        C70207c cVar = new C70207c(getArguments());
        return cVar.mo247384b(getActivity(), new DialogInterface$OnClickListenerC70206b(this, cVar, this.f175341a, this.f175342b));
    }

    @Override // android.app.Fragment, android.app.DialogFragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (Build.VERSION.SDK_INT >= 17 && getParentFragment() != null) {
            if (getParentFragment() instanceof C70197a.AbstractC70198a) {
                this.f175341a = (C70197a.AbstractC70198a) getParentFragment();
            }
            if (getParentFragment() instanceof C70197a.AbstractC70199b) {
                this.f175342b = (C70197a.AbstractC70199b) getParentFragment();
            }
        }
        if (context instanceof C70197a.AbstractC70198a) {
            this.f175341a = (C70197a.AbstractC70198a) context;
        }
        if (context instanceof C70197a.AbstractC70199b) {
            this.f175342b = (C70197a.AbstractC70199b) context;
        }
    }
}
