package com.huawei.hms.availableupdate;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import com.huawei.hms.support.log.HMSLog;

/* renamed from: com.huawei.hms.availableupdate.o */
public abstract class AbstractC23485o {

    /* renamed from: a */
    public AlertDialog f57929a;

    /* renamed from: b */
    public AbstractC23484n f57930b;

    /* renamed from: g */
    public abstract AlertDialog mo82107g();

    /* renamed from: a */
    public void mo82175a() {
        AlertDialog alertDialog = this.f57929a;
        if (alertDialog != null) {
            alertDialog.cancel();
        }
    }

    /* renamed from: b */
    public void mo82177b() {
        AlertDialog alertDialog = this.f57929a;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* renamed from: c */
    public void mo82178c() {
        AbstractC23484n nVar = this.f57930b;
        if (nVar != null) {
            nVar.mo82142a(this);
        }
    }

    /* renamed from: d */
    public void mo82179d() {
        AbstractC23484n nVar = this.f57930b;
        if (nVar != null) {
            nVar.mo82145b(this);
        }
    }

    /* renamed from: e */
    public Activity mo82180e() {
        AbstractC23484n nVar = this.f57930b;
        if (nVar != null) {
            return nVar.mo82172b();
        }
        return null;
    }

    /* renamed from: f */
    public int mo82181f() {
        if (m85192a(mo82180e()) == 0 || Build.VERSION.SDK_INT < 16) {
            return 3;
        }
        return 0;
    }

    /* renamed from: com.huawei.hms.availableupdate.o$a */
    public class DialogInterface$OnCancelListenerC23486a implements DialogInterface.OnCancelListener {
        public DialogInterface$OnCancelListenerC23486a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            AbstractC23485o.this.mo82178c();
        }
    }

    /* renamed from: a */
    public static int m85192a(Context context) {
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier("androidhwext:style/Theme.Emui", null, null);
    }

    /* renamed from: a */
    public void mo82176a(AbstractC23484n nVar) {
        this.f57930b = nVar;
        if (mo82180e() == null || mo82180e().isFinishing()) {
            HMSLog.m86964e("AbstractDialog", "In show, The activity is null or finishing.");
            return;
        }
        AlertDialog g = mo82107g();
        this.f57929a = g;
        g.setCanceledOnTouchOutside(false);
        this.f57929a.setOnCancelListener(new DialogInterface$OnCancelListenerC23486a());
        this.f57929a.show();
    }
}
