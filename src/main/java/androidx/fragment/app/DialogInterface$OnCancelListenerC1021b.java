package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

/* renamed from: androidx.fragment.app.b */
public class DialogInterface$OnCancelListenerC1021b extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: a */
    public DialogInterface.OnDismissListener f3907a = new DialogInterface.OnDismissListener() {
        /* class androidx.fragment.app.DialogInterface$OnCancelListenerC1021b.DialogInterface$OnDismissListenerC10243 */

        public void onDismiss(DialogInterface dialogInterface) {
            if (DialogInterface$OnCancelListenerC1021b.this.f3908b != null) {
                DialogInterface$OnCancelListenerC1021b bVar = DialogInterface$OnCancelListenerC1021b.this;
                bVar.onDismiss(bVar.f3908b);
            }
        }
    };

    /* renamed from: b */
    public Dialog f3908b;

    /* renamed from: c */
    private Handler f3909c;

    /* renamed from: d */
    private Runnable f3910d = new Runnable() {
        /* class androidx.fragment.app.DialogInterface$OnCancelListenerC1021b.RunnableC10221 */

        public void run() {
            DialogInterface$OnCancelListenerC1021b.this.f3907a.onDismiss(DialogInterface$OnCancelListenerC1021b.this.f3908b);
        }
    };

    /* renamed from: e */
    private DialogInterface.OnCancelListener f3911e = new DialogInterface.OnCancelListener() {
        /* class androidx.fragment.app.DialogInterface$OnCancelListenerC1021b.DialogInterface$OnCancelListenerC10232 */

        public void onCancel(DialogInterface dialogInterface) {
            if (DialogInterface$OnCancelListenerC1021b.this.f3908b != null) {
                DialogInterface$OnCancelListenerC1021b bVar = DialogInterface$OnCancelListenerC1021b.this;
                bVar.onCancel(bVar.f3908b);
            }
        }
    };

    /* renamed from: f */
    private int f3912f = 0;

    /* renamed from: g */
    private int f3913g = 0;

    /* renamed from: h */
    private boolean f3914h = true;

    /* renamed from: i */
    private boolean f3915i = true;

    /* renamed from: j */
    private int f3916j = -1;

    /* renamed from: k */
    private boolean f3917k;

    /* renamed from: l */
    private boolean f3918l;

    /* renamed from: m */
    private boolean f3919m;

    /* renamed from: n */
    private boolean f3920n;

    public void onCancel(DialogInterface dialogInterface) {
    }

    /* renamed from: e */
    public int mo5515e() {
        return this.f3913g;
    }

    public Dialog v_() {
        return this.f3908b;
    }

    /* renamed from: b */
    public void mo5513b() {
        m4973a(true, false);
    }

    public void u_() {
        m4973a(false, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        if (!this.f3920n && !this.f3919m) {
            this.f3919m = true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = this.f3908b;
        if (dialog != null) {
            this.f3918l = false;
            dialog.show();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.f3908b;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f3908b;
        if (dialog != null) {
            this.f3918l = true;
            dialog.setOnDismissListener(null);
            this.f3908b.dismiss();
            if (!this.f3919m) {
                onDismiss(this.f3908b);
            }
            this.f3908b = null;
        }
    }

    public final Dialog J_() {
        Dialog v_ = v_();
        if (v_ != null) {
            return v_;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    /* renamed from: b */
    public void mo5514b(boolean z) {
        this.f3915i = z;
    }

    /* renamed from: a */
    public Dialog mo946a(Bundle bundle) {
        return new Dialog(requireContext(), mo5515e());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (!this.f3920n) {
            this.f3919m = false;
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f3918l) {
            m4973a(true, true);
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (!this.f3915i || this.f3917k) {
            return onGetLayoutInflater;
        }
        try {
            this.f3917k = true;
            Dialog a = mo946a(bundle);
            this.f3908b = a;
            mo947a(a, this.f3912f);
            this.f3917k = false;
            return onGetLayoutInflater.cloneInContext(J_().getContext());
        } catch (Throwable th) {
            this.f3917k = false;
            throw th;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.f3908b;
        if (dialog != null) {
            bundle.putBundle("android:savedDialogState", dialog.onSaveInstanceState());
        }
        int i = this.f3912f;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f3913g;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f3914h;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f3915i;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f3916j;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        Bundle bundle2;
        super.onActivityCreated(bundle);
        if (this.f3915i) {
            View view = getView();
            if (this.f3908b != null) {
                if (view != null) {
                    if (view.getParent() == null) {
                        this.f3908b.setContentView(view);
                    } else {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                }
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    this.f3908b.setOwnerActivity(activity);
                }
                this.f3908b.setCancelable(this.f3914h);
                this.f3908b.setOnCancelListener(this.f3911e);
                this.f3908b.setOnDismissListener(this.f3907a);
                if (bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
                    this.f3908b.onRestoreInstanceState(bundle2);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        this.f3909c = new Handler();
        if (this.mContainerId == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f3915i = z;
        if (bundle != null) {
            this.f3912f = bundle.getInt("android:style", 0);
            this.f3913g = bundle.getInt("android:theme", 0);
            this.f3914h = bundle.getBoolean("android:cancelable", true);
            this.f3915i = bundle.getBoolean("android:showsDialog", this.f3915i);
            this.f3916j = bundle.getInt("android:backStackId", -1);
        }
    }

    /* renamed from: a */
    public void mo5512a(boolean z) {
        this.f3914h = z;
        Dialog dialog = this.f3908b;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    /* renamed from: a */
    public void mo5510a(int i, int i2) {
        this.f3912f = i;
        if (i == 2 || i == 3) {
            this.f3913g = 16973913;
        }
        if (i2 != 0) {
            this.f3913g = i2;
        }
    }

    /* renamed from: a */
    public void mo947a(Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    /* renamed from: a */
    private void m4973a(boolean z, boolean z2) {
        if (!this.f3919m) {
            this.f3919m = true;
            this.f3920n = false;
            Dialog dialog = this.f3908b;
            if (dialog != null) {
                dialog.setOnDismissListener(null);
                this.f3908b.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.f3909c.getLooper()) {
                        onDismiss(this.f3908b);
                    } else {
                        this.f3909c.post(this.f3910d);
                    }
                }
            }
            this.f3918l = true;
            if (this.f3916j >= 0) {
                getParentFragmentManager().popBackStack(this.f3916j, 1);
                this.f3916j = -1;
                return;
            }
            FragmentTransaction beginTransaction = getParentFragmentManager().beginTransaction();
            beginTransaction.remove(this);
            if (z) {
                beginTransaction.commitAllowingStateLoss();
            } else {
                beginTransaction.commit();
            }
        }
    }

    /* renamed from: a */
    public void mo5511a(FragmentManager fragmentManager, String str) {
        this.f3919m = false;
        this.f3920n = true;
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        beginTransaction.add(this, str);
        beginTransaction.commit();
    }
}
