package com.huawei.updatesdk.p1046b.p1056g;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.huawei.updatesdk.p1029a.p1030a.p1032b.p1033a.p1034a.C23834a;
import com.huawei.updatesdk.p1029a.p1030a.p1035c.p1036h.C23845b;
import com.huawei.updatesdk.p1046b.p1055f.C23890a;
import com.huawei.updatesdk.service.otaupdate.C23935g;

/* renamed from: com.huawei.updatesdk.b.g.a */
public class C23895a {

    /* renamed from: a */
    private AbstractC23902b f59144a;

    /* renamed from: b */
    private Context f59145b;

    /* renamed from: c */
    private String f59146c;

    /* renamed from: d */
    private CharSequence f59147d;

    /* renamed from: e */
    private AlertDialog f59148e;

    /* renamed from: f */
    private AlertDialog.Builder f59149f;

    /* renamed from: g */
    private DialogInterface.OnShowListener f59150g;

    /* renamed from: h */
    private DialogInterface.OnDismissListener f59151h;

    /* access modifiers changed from: package-private */
    /* renamed from: com.huawei.updatesdk.b.g.a$a */
    public class DialogInterface$OnShowListenerC23896a implements DialogInterface.OnShowListener {

        /* renamed from: com.huawei.updatesdk.b.g.a$a$a */
        class View$OnClickListenerC23897a implements View.OnClickListener {
            View$OnClickListenerC23897a() {
            }

            public void onClick(View view) {
                if (C23895a.this.f59144a != null) {
                    C23895a.this.f59144a.mo85705a();
                }
            }
        }

        /* renamed from: com.huawei.updatesdk.b.g.a$a$b */
        class View$OnClickListenerC23898b implements View.OnClickListener {
            View$OnClickListenerC23898b() {
            }

            public void onClick(View view) {
                if (C23895a.this.f59144a != null) {
                    C23895a.this.f59144a.mo85706b();
                }
            }
        }

        DialogInterface$OnShowListenerC23896a() {
        }

        public void onShow(DialogInterface dialogInterface) {
            AlertDialog alertDialog = (AlertDialog) dialogInterface;
            alertDialog.getButton(-1).setOnClickListener(new View$OnClickListenerC23897a());
            Button button = alertDialog.getButton(-2);
            if (button != null) {
                button.setOnClickListener(new View$OnClickListenerC23898b());
            }
            if (C23895a.this.f59150g != null) {
                C23895a.this.f59150g.onShow(dialogInterface);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.huawei.updatesdk.b.g.a$b */
    public class DialogInterface$OnDismissListenerC23899b implements DialogInterface.OnDismissListener {
        DialogInterface$OnDismissListenerC23899b() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (C23895a.this.f59151h != null) {
                C23895a.this.f59151h.onDismiss(dialogInterface);
            }
        }
    }

    /* renamed from: com.huawei.updatesdk.b.g.a$c */
    public enum EnumC23900c {
        CONFIRM,
        CANCEL
    }

    /* renamed from: com.huawei.updatesdk.b.g.a$d */
    public interface AbstractC23901d {
        /* renamed from: a */
        void mo85704a();
    }

    protected C23895a(Context context, String str, CharSequence charSequence) {
        this.f59145b = context;
        this.f59146c = str;
        this.f59147d = charSequence;
        this.f59149f = C23845b.m87170g() ? new AlertDialog.Builder(context) : ((context.getResources().getConfiguration().uiMode & 48) != 32 || Build.VERSION.SDK_INT < 29) ? new AlertDialog.Builder(context, 16974546) : new AlertDialog.Builder(context, 16974545);
        this.f59149f.setTitle(this.f59146c);
        this.f59149f.setPositiveButton(C23935g.m87507e(context, "upsdk_third_app_dl_sure_cancel_download"), (DialogInterface.OnClickListener) null);
        this.f59149f.setNegativeButton(C23935g.m87507e(context, "upsdk_cancel"), (DialogInterface.OnClickListener) null);
        this.f59149f.setMessage(this.f59147d);
    }

    /* renamed from: a */
    public static C23895a m87367a(Context context, String str, CharSequence charSequence) {
        return (!(context instanceof Activity) || !((Activity) context).isFinishing()) ? new C23895a(context, str, charSequence) : new C23903c(context, str, charSequence);
    }

    /* renamed from: a */
    public void mo85688a() {
        try {
            AlertDialog alertDialog = this.f59148e;
            if (alertDialog != null) {
                alertDialog.dismiss();
                this.f59148e = null;
            }
        } catch (IllegalArgumentException unused) {
            C23834a.m87116a("BaseAlertDialog", "dialog dismiss IllegalArgumentException");
        }
    }

    /* renamed from: a */
    public void mo85689a(int i, int i2) {
        if (C23890a.m87353d().mo85685a() >= 11) {
            Button button = null;
            AlertDialog alertDialog = this.f59148e;
            if (alertDialog != null) {
                button = alertDialog.getButton(-1);
            }
            if (button != null) {
                button.setBackgroundResource(i);
                button.setTextColor(this.f59145b.getResources().getColor(i2));
            }
        }
    }

    /* renamed from: a */
    public void mo85690a(DialogInterface.OnDismissListener onDismissListener) {
        this.f59151h = onDismissListener;
    }

    /* renamed from: a */
    public void mo85691a(DialogInterface.OnKeyListener onKeyListener) {
        AlertDialog alertDialog = this.f59148e;
        if (alertDialog != null) {
            alertDialog.setOnKeyListener(onKeyListener);
        }
    }

    /* renamed from: a */
    public void mo85692a(DialogInterface.OnShowListener onShowListener) {
        this.f59150g = onShowListener;
    }

    /* renamed from: a */
    public void mo85693a(View view) {
        ImageView imageView;
        if (this.f59149f != null) {
            if (C23890a.m87353d().mo85685a() >= 17 && (imageView = (ImageView) view.findViewById(C23935g.m87505c(view.getContext(), "divider"))) != null) {
                imageView.setVisibility(8);
            }
            this.f59149f.setMessage((CharSequence) null);
            this.f59149f.setView(view);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0018 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0019  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo85694a(com.huawei.updatesdk.p1046b.p1056g.C23895a.EnumC23900c r3, java.lang.String r4) {
        /*
            r2 = this;
            android.app.AlertDialog r0 = r2.f59148e
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            com.huawei.updatesdk.b.g.a$c r1 = com.huawei.updatesdk.p1046b.p1056g.C23895a.EnumC23900c.CONFIRM
            if (r3 != r1) goto L_0x000f
            r3 = -1
        L_0x000a:
            android.widget.Button r3 = r0.getButton(r3)
            goto L_0x0016
        L_0x000f:
            com.huawei.updatesdk.b.g.a$c r1 = com.huawei.updatesdk.p1046b.p1056g.C23895a.EnumC23900c.CANCEL
            if (r3 != r1) goto L_0x0015
            r3 = -2
            goto L_0x000a
        L_0x0015:
            r3 = 0
        L_0x0016:
            if (r3 != 0) goto L_0x0019
            return
        L_0x0019:
            r3.setText(r4)
            r4 = 1
            r3.setAllCaps(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.p1046b.p1056g.C23895a.mo85694a(com.huawei.updatesdk.b.g.a$c, java.lang.String):void");
    }

    /* renamed from: a */
    public void mo85695a(AbstractC23901d dVar) {
        Context context = this.f59145b;
        if (context == null || ((Activity) context).isFinishing()) {
            if (dVar != null) {
                dVar.mo85704a();
            }
        } else if (!mo85698b()) {
            try {
                AlertDialog create = this.f59149f.create();
                this.f59148e = create;
                create.setCanceledOnTouchOutside(false);
                this.f59148e.setOnShowListener(new DialogInterface$OnShowListenerC23896a());
                this.f59148e.setOnDismissListener(new DialogInterface$OnDismissListenerC23899b());
                this.f59148e.show();
                this.f59148e.getButton(-1).requestFocus();
            } catch (Exception e) {
                if (dVar != null) {
                    dVar.mo85704a();
                }
                C23834a.m87117a("BaseAlertDialog", "show dlg error, e: ", e);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("show dlg error, mContext = ");
            sb.append(this.f59145b);
            sb.append(", mContext.isFinishing is ");
            Context context2 = this.f59145b;
            sb.append(context2 == null ? "mContext == null" : Boolean.valueOf(((Activity) context2).isFinishing()));
            C23834a.m87118b("BaseAlertDialog", sb.toString());
        }
    }

    /* renamed from: a */
    public void mo85696a(AbstractC23902b bVar) {
        this.f59144a = bVar;
    }

    /* renamed from: a */
    public void mo85697a(boolean z) {
        AlertDialog alertDialog = this.f59148e;
        if (alertDialog != null) {
            alertDialog.setCancelable(z);
        }
    }

    /* renamed from: b */
    public boolean mo85698b() {
        AlertDialog alertDialog = this.f59148e;
        return alertDialog != null && alertDialog.isShowing();
    }

    /* renamed from: c */
    public void mo85699c() {
        AlertDialog.Builder builder = this.f59149f;
        if (builder != null) {
            builder.setNegativeButton((CharSequence) null, (DialogInterface.OnClickListener) null);
        }
    }
}
