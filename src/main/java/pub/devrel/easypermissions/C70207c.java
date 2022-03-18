package pub.devrel.easypermissions;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.DialogInterfaceC0257a;

/* renamed from: pub.devrel.easypermissions.c */
class C70207c {

    /* renamed from: a */
    String f175349a;

    /* renamed from: b */
    String f175350b;

    /* renamed from: c */
    int f175351c;

    /* renamed from: d */
    int f175352d;

    /* renamed from: e */
    String f175353e;

    /* renamed from: f */
    String[] f175354f;

    C70207c(Bundle bundle) {
        this.f175349a = bundle.getString("positiveButton");
        this.f175350b = bundle.getString("negativeButton");
        this.f175353e = bundle.getString("rationaleMsg");
        this.f175351c = bundle.getInt("theme");
        this.f175352d = bundle.getInt("requestCode");
        this.f175354f = bundle.getStringArray("permissions");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public DialogInterfaceC0257a mo247383a(Context context, DialogInterface.OnClickListener onClickListener) {
        DialogInterfaceC0257a.C0258a aVar;
        int i = this.f175351c;
        if (i > 0) {
            aVar = new DialogInterfaceC0257a.C0258a(context, i);
        } else {
            aVar = new DialogInterfaceC0257a.C0258a(context);
        }
        return aVar.mo925a(false).mo924a(this.f175349a, onClickListener).mo928b(this.f175350b, onClickListener).mo927b(this.f175353e).mo929b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public AlertDialog mo247384b(Context context, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder;
        if (this.f175351c > 0) {
            builder = new AlertDialog.Builder(context, this.f175351c);
        } else {
            builder = new AlertDialog.Builder(context);
        }
        return builder.setCancelable(false).setPositiveButton(this.f175349a, onClickListener).setNegativeButton(this.f175350b, onClickListener).setMessage(this.f175353e).create();
    }
}
