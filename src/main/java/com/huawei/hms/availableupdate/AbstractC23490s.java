package com.huawei.hms.availableupdate;

import android.app.AlertDialog;
import android.content.DialogInterface;

/* renamed from: com.huawei.hms.availableupdate.s */
public abstract class AbstractC23490s extends AbstractC23485o {
    /* renamed from: h */
    public abstract int mo82186h();

    /* renamed from: i */
    public abstract int mo82187i();

    /* renamed from: j */
    public abstract int mo82188j();

    public AbstractC23490s() {
    }

    @Override // com.huawei.hms.availableupdate.AbstractC23485o
    /* renamed from: g */
    public AlertDialog mo82107g() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo82180e(), mo82181f());
        builder.setMessage(mo82186h());
        builder.setPositiveButton(mo82188j(), new DialogInterface$OnClickListenerC23491a());
        builder.setNegativeButton(mo82187i(), new DialogInterface$OnClickListenerC23492b());
        return builder.create();
    }

    /* renamed from: com.huawei.hms.availableupdate.s$a */
    public class DialogInterface$OnClickListenerC23491a implements DialogInterface.OnClickListener {
        public DialogInterface$OnClickListenerC23491a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AbstractC23490s.this.mo82179d();
        }
    }

    /* renamed from: com.huawei.hms.availableupdate.s$b */
    public class DialogInterface$OnClickListenerC23492b implements DialogInterface.OnClickListener {
        public DialogInterface$OnClickListenerC23492b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AbstractC23490s.this.mo82175a();
        }
    }
}
