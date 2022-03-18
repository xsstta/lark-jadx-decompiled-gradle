package pub.devrel.easypermissions;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import java.util.Arrays;
import pub.devrel.easypermissions.C70197a;
import pub.devrel.easypermissions.p3533a.AbstractC70204e;

/* renamed from: pub.devrel.easypermissions.b */
class DialogInterface$OnClickListenerC70206b implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private Object f175345a;

    /* renamed from: b */
    private C70207c f175346b;

    /* renamed from: c */
    private C70197a.AbstractC70198a f175347c;

    /* renamed from: d */
    private C70197a.AbstractC70199b f175348d;

    /* renamed from: a */
    private void m269038a() {
        C70197a.AbstractC70198a aVar = this.f175347c;
        if (aVar != null) {
            aVar.mo247377a(this.f175346b.f175352d, Arrays.asList(this.f175346b.f175354f));
        }
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f175346b.f175352d;
        if (i == -1) {
            String[] strArr = this.f175346b.f175354f;
            C70197a.AbstractC70199b bVar = this.f175348d;
            if (bVar != null) {
                bVar.mo247378a(i2);
            }
            Object obj = this.f175345a;
            if (obj instanceof Fragment) {
                AbstractC70204e.m269034a((Fragment) obj).mo247380a(i2, strArr);
            } else if (obj instanceof Activity) {
                AbstractC70204e.m269033a((Activity) obj).mo247380a(i2, strArr);
            } else {
                throw new RuntimeException("Host must be an Activity or Fragment!");
            }
        } else {
            C70197a.AbstractC70199b bVar2 = this.f175348d;
            if (bVar2 != null) {
                bVar2.mo247379b(i2);
            }
            m269038a();
        }
    }

    DialogInterface$OnClickListenerC70206b(RationaleDialogFragment rationaleDialogFragment, C70207c cVar, C70197a.AbstractC70198a aVar, C70197a.AbstractC70199b bVar) {
        this.f175345a = rationaleDialogFragment.getActivity();
        this.f175346b = cVar;
        this.f175347c = aVar;
        this.f175348d = bVar;
    }

    DialogInterface$OnClickListenerC70206b(C70208d dVar, C70207c cVar, C70197a.AbstractC70198a aVar, C70197a.AbstractC70199b bVar) {
        Object obj;
        if (dVar.getParentFragment() != null) {
            obj = dVar.getParentFragment();
        } else {
            obj = dVar.getActivity();
        }
        this.f175345a = obj;
        this.f175346b = cVar;
        this.f175347c = aVar;
        this.f175348d = bVar;
    }
}
