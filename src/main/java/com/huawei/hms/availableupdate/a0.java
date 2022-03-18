package com.huawei.hms.availableupdate;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.huawei.hms.utils.ResourceLoaderUtil;

public abstract class a0 extends AbstractC23485o {
    /* renamed from: h */
    public abstract int mo82108h();

    public a0() {
    }

    /* renamed from: i */
    public int mo82109i() {
        return ResourceLoaderUtil.getStringId("hms_confirm");
    }

    @Override // com.huawei.hms.availableupdate.AbstractC23485o
    /* renamed from: g */
    public AlertDialog mo82107g() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo82180e(), mo82181f());
        builder.setMessage(mo82108h());
        builder.setPositiveButton(mo82109i(), new DialogInterface$OnClickListenerC23462a());
        return builder.create();
    }

    /* renamed from: com.huawei.hms.availableupdate.a0$a */
    public class DialogInterface$OnClickListenerC23462a implements DialogInterface.OnClickListener {
        public DialogInterface$OnClickListenerC23462a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            a0.this.mo82179d();
        }
    }
}
