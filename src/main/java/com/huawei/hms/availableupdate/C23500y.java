package com.huawei.hms.availableupdate;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.huawei.hms.utils.ResourceLoaderUtil;

/* renamed from: com.huawei.hms.availableupdate.y */
public class C23500y extends AbstractC23485o {

    /* renamed from: c */
    public String f57938c = ResourceLoaderUtil.getString("hms_update_title");

    @Override // com.huawei.hms.availableupdate.AbstractC23485o
    /* renamed from: g */
    public AlertDialog mo82107g() {
        int stringId = ResourceLoaderUtil.getStringId("hms_update_message_new");
        int stringId2 = ResourceLoaderUtil.getStringId("hms_install");
        AlertDialog.Builder builder = new AlertDialog.Builder(mo82180e(), mo82181f());
        builder.setMessage(mo82180e().getString(stringId, new Object[]{this.f57938c}));
        builder.setPositiveButton(stringId2, new DialogInterface$OnClickListenerC23501a());
        builder.setNegativeButton(ResourceLoaderUtil.getStringId("hms_cancel"), new DialogInterface$OnClickListenerC23502b());
        return builder.create();
    }

    /* renamed from: a */
    public void mo82197a(String str) {
        this.f57938c = str;
    }

    /* renamed from: com.huawei.hms.availableupdate.y$a */
    public class DialogInterface$OnClickListenerC23501a implements DialogInterface.OnClickListener {
        public DialogInterface$OnClickListenerC23501a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C23500y.this.mo82179d();
        }
    }

    /* renamed from: com.huawei.hms.availableupdate.y$b */
    public class DialogInterface$OnClickListenerC23502b implements DialogInterface.OnClickListener {
        public DialogInterface$OnClickListenerC23502b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C23500y.this.mo82175a();
        }
    }
}
