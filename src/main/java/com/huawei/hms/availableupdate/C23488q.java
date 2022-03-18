package com.huawei.hms.availableupdate;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import com.huawei.hms.utils.ResourceLoaderUtil;

/* renamed from: com.huawei.hms.availableupdate.q */
public class C23488q extends AbstractC23485o {
    @Override // com.huawei.hms.availableupdate.AbstractC23485o
    /* renamed from: g */
    public AlertDialog mo82107g() {
        ProgressDialog progressDialog = new ProgressDialog(mo82180e(), mo82181f());
        progressDialog.setMessage(ResourceLoaderUtil.getString("hms_checking"));
        progressDialog.setCanceledOnTouchOutside(false);
        return progressDialog;
    }
}
