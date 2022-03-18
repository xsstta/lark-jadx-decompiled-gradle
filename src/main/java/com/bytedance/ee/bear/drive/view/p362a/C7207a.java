package com.bytedance.ee.bear.drive.view.p362a;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.ee.bear.drive.view.p362a.C7207a;
import com.bytedance.ee.bear.widgets.dialog.BearUDDialogBuilder;
import com.bytedance.ee.bear.widgets.dialog.progressdialog.BearUDProgressDialogBuilder;
import com.bytedance.ee.bear.widgets.dialog.progressdialog.BearUDProgressDialogController;
import com.bytedance.ee.log.C13479a;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.suite.R;
import java.util.WeakHashMap;

/* renamed from: com.bytedance.ee.bear.drive.view.a.a */
public class C7207a {

    /* renamed from: a */
    private WeakHashMap<Integer, Dialog> f19331a = new WeakHashMap<>();

    /* renamed from: com.bytedance.ee.bear.drive.view.a.a$a */
    public interface AbstractC7208a {
        /* renamed from: a */
        void mo25758a();

        /* renamed from: b */
        void mo25759b();
    }

    /* renamed from: a */
    public void mo28223a() {
        for (Dialog dialog : this.f19331a.values()) {
            if (dialog != null && dialog.isShowing()) {
                dialog.dismiss();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m28862b(Dialog dialog, DialogInterface dialogInterface) {
        this.f19331a.remove(Integer.valueOf(dialog.hashCode()));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m28864c(Dialog dialog, DialogInterface dialogInterface) {
        this.f19331a.remove(Integer.valueOf(dialog.hashCode()));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m28866d(Dialog dialog, DialogInterface dialogInterface) {
        this.f19331a.remove(Integer.valueOf(dialog.hashCode()));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m28868e(Dialog dialog, DialogInterface dialogInterface) {
        this.f19331a.put(Integer.valueOf(dialog.hashCode()), dialog);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m28870f(Dialog dialog, DialogInterface dialogInterface) {
        this.f19331a.remove(Integer.valueOf(dialog.hashCode()));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m28872g(Dialog dialog, DialogInterface dialogInterface) {
        this.f19331a.put(Integer.valueOf(dialog.hashCode()), dialog);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m28860a(Dialog dialog, DialogInterface dialogInterface) {
        this.f19331a.put(Integer.valueOf(dialog.hashCode()), dialog);
    }

    /* renamed from: a */
    public Dialog mo28219a(Context context, AbstractC7208a aVar) {
        UDDialog b = new BearUDDialogBuilder(context).mo45344a(R.string.Drive_Drive_VersionUpdateTitle).mo45362d(R.string.Drive_Drive_VersionUpdateMessage).mo45364e(16).mo45346a(R.id.ud_dialog_btn_primary, R.string.Drive_Drive_VersionUpdateRefresh, new DialogInterface.OnClickListener() {
            /* class com.bytedance.ee.bear.drive.view.p362a.$$Lambda$a$UwOgjT3xbnOUQmyvxLAnhyEog */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C7207a.AbstractC7208a.this.mo25759b();
            }
        }).mo45346a(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, new DialogInterface.OnClickListener() {
            /* class com.bytedance.ee.bear.drive.view.p362a.$$Lambda$a$YFckLKQq8XB_nzJaaemOxe3owFc */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C7207a.AbstractC7208a.this.mo25758a();
            }
        }).mo45361c(false).mo45343a(303.0f).mo45366g(0).mo45359b();
        this.f19331a.put(Integer.valueOf(b.hashCode()), b);
        b.setOnDismissListener(new DialogInterface.OnDismissListener(b) {
            /* class com.bytedance.ee.bear.drive.view.p362a.$$Lambda$a$jNfXSOoErE9dPYQl0xTDRAVNzpc */
            public final /* synthetic */ Dialog f$1;

            {
                this.f$1 = r2;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                C7207a.this.m28864c(this.f$1, dialogInterface);
            }
        });
        return b;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m28869e(AbstractC7208a aVar, DialogInterface dialogInterface, int i) {
        if (aVar != null) {
            aVar.mo25759b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m28871f(AbstractC7208a aVar, DialogInterface dialogInterface, int i) {
        if (aVar != null) {
            aVar.mo25758a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m28873g(AbstractC7208a aVar, DialogInterface dialogInterface, int i) {
        if (aVar != null) {
            aVar.mo25759b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m28859a(Dialog dialog, DialogInterface.OnDismissListener onDismissListener, DialogInterface dialogInterface) {
        this.f19331a.remove(Integer.valueOf(dialog.hashCode()));
        onDismissListener.onDismiss(dialogInterface);
    }

    /* renamed from: b */
    public Dialog mo28224b(Context context, String str, String str2, AbstractC7208a aVar) {
        return mo28222a(context, str, str2, context.getString(R.string.Drive_Drive_Confirm), aVar);
    }

    /* renamed from: c */
    public Dialog mo28225c(Context context, String str, String str2, AbstractC7208a aVar) {
        UDDialog b = new BearUDDialogBuilder(context).mo45344a(R.string.Drive_Drive_ChangeFileType).mo45362d(R.string.Drive_Drive_FileOperationMayHaveImpact).mo45364e(16).mo45348a(R.id.ud_dialog_btn_primary, str, R.color.primary_pri_500, new DialogInterface.OnClickListener() {
            /* class com.bytedance.ee.bear.drive.view.p362a.$$Lambda$a$nFtNlo3O555Vho8lWkUOCm2kmI */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C7207a.AbstractC7208a.this.mo25759b();
            }
        }).mo45348a(R.id.ud_dialog_btn_secondary, str2, R.color.primary_pri_500, new DialogInterface.OnClickListener() {
            /* class com.bytedance.ee.bear.drive.view.p362a.$$Lambda$a$_sU2xZcXbpn4n0YBwmj8zLeJo30 */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C7207a.AbstractC7208a.this.mo25758a();
            }
        }).mo45351a(BearUDDialogBuilder.ActionBottomOrientation.VERTICAL).mo45361c(false).mo45343a(303.0f).mo45366g(0).mo45359b();
        this.f19331a.put(Integer.valueOf(b.hashCode()), b);
        b.setOnDismissListener(new DialogInterface.OnDismissListener(b) {
            /* class com.bytedance.ee.bear.drive.view.p362a.$$Lambda$a$JwdYYKuQ7uXijosGGQbi9SKQ9dA */
            public final /* synthetic */ Dialog f$1;

            {
                this.f$1 = r2;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                C7207a.this.m28862b(this.f$1, dialogInterface);
            }
        });
        return b;
    }

    /* renamed from: a */
    public Dialog mo28220a(Context context, BearUDProgressDialogController bVar, DialogInterface.OnClickListener onClickListener, DialogInterface.OnDismissListener onDismissListener) {
        UDDialog build = ((BearUDProgressDialogBuilder) ((BearUDProgressDialogBuilder) ((BearUDProgressDialogBuilder) ((BearUDProgressDialogBuilder) ((BearUDProgressDialogBuilder) ((BearUDProgressDialogBuilder) new BearUDProgressDialogBuilder(context).title(R.string.CreationMobile_ECM_SaveToLocal_downloading)).mo45427a(0).controller(bVar)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Doc_Facade_Cancel, onClickListener)).width(303.0f)).marginInDp(0)).cancelOnTouchOutside(false)).build();
        build.setOnShowListener(new DialogInterface.OnShowListener(build) {
            /* class com.bytedance.ee.bear.drive.view.p362a.$$Lambda$a$hO_qXODCtT2jDGUbJR8d02lg05U */
            public final /* synthetic */ Dialog f$1;

            {
                this.f$1 = r2;
            }

            public final void onShow(DialogInterface dialogInterface) {
                C7207a.this.m28860a((C7207a) this.f$1, (Dialog) dialogInterface);
            }
        });
        build.setOnDismissListener(new DialogInterface.OnDismissListener(build, onDismissListener) {
            /* class com.bytedance.ee.bear.drive.view.p362a.$$Lambda$a$f6wJQyMg0K8OJvWGT6ZhMI65Yg */
            public final /* synthetic */ Dialog f$1;
            public final /* synthetic */ DialogInterface.OnDismissListener f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                C7207a.this.m28859a((C7207a) this.f$1, (Dialog) this.f$2, (DialogInterface.OnDismissListener) dialogInterface);
            }
        });
        return build;
    }

    /* renamed from: a */
    public Dialog mo28221a(Context context, String str, String str2, AbstractC7208a aVar) {
        C13479a.m54764b("DriveDialogManager", "getSimpleMessageConfirmCancelDialog" + str + str2);
        UDDialog a = new BearUDDialogBuilder(context).mo45353a(str).mo45357b(str2).mo45360c(8388611).mo45346a(R.id.ud_dialog_btn_primary, R.string.Drive_Drive_Continue, new DialogInterface.OnClickListener() {
            /* class com.bytedance.ee.bear.drive.view.p362a.$$Lambda$a$lSt49IB7f155b3img1JJPXOjDks */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C7207a.m28873g(C7207a.AbstractC7208a.this, dialogInterface, i);
            }
        }).mo45346a(R.id.ud_dialog_btn_secondary, R.string.Drive_Drive_Cancel, new DialogInterface.OnClickListener() {
            /* class com.bytedance.ee.bear.drive.view.p362a.$$Lambda$a$HZsFDn1iHHMzI72N0LD9MvGt_v0 */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C7207a.m28871f(C7207a.AbstractC7208a.this, dialogInterface, i);
            }
        }).mo45361c(false).mo45343a(303.0f).mo45366g(0).mo45355a();
        a.setOnShowListener(new DialogInterface.OnShowListener(a) {
            /* class com.bytedance.ee.bear.drive.view.p362a.$$Lambda$a$wGoj_K5dpybX3W1HD7y1lyHOArk */
            public final /* synthetic */ Dialog f$1;

            {
                this.f$1 = r2;
            }

            public final void onShow(DialogInterface dialogInterface) {
                C7207a.this.m28872g(this.f$1, dialogInterface);
            }
        });
        a.setOnDismissListener(new DialogInterface.OnDismissListener(a) {
            /* class com.bytedance.ee.bear.drive.view.p362a.$$Lambda$a$eZc4xjVxvAawPkcyhrXRYQylTIk */
            public final /* synthetic */ Dialog f$1;

            {
                this.f$1 = r2;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                C7207a.this.m28870f(this.f$1, dialogInterface);
            }
        });
        return a;
    }

    /* renamed from: a */
    public Dialog mo28222a(Context context, String str, String str2, String str3, AbstractC7208a aVar) {
        C13479a.m54764b("DriveDialogManager", "getSimpleMessageConfirmDialog" + str + str2);
        if (str == null) {
            str = "";
        }
        UDDialog a = new BearUDDialogBuilder(context).mo45353a(str).mo45357b(str2).mo45364e(16).mo45347a(R.id.ud_dialog_btn_primary, str3, new DialogInterface.OnClickListener() {
            /* class com.bytedance.ee.bear.drive.view.p362a.$$Lambda$a$D6FkqLWnGp6gwLFQJbEs3eJ02g */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C7207a.m28869e(C7207a.AbstractC7208a.this, dialogInterface, i);
            }
        }).mo45361c(false).mo45343a(303.0f).mo45366g(0).mo45355a();
        a.setOnShowListener(new DialogInterface.OnShowListener(a) {
            /* class com.bytedance.ee.bear.drive.view.p362a.$$Lambda$a$zHV6mfawyrRymaCpCAdMOEuP8I */
            public final /* synthetic */ Dialog f$1;

            {
                this.f$1 = r2;
            }

            public final void onShow(DialogInterface dialogInterface) {
                C7207a.this.m28868e(this.f$1, dialogInterface);
            }
        });
        a.setOnDismissListener(new DialogInterface.OnDismissListener(a) {
            /* class com.bytedance.ee.bear.drive.view.p362a.$$Lambda$a$7J0VP_3eMw4UkYhOtGKYvkrB9w */
            public final /* synthetic */ Dialog f$1;

            {
                this.f$1 = r2;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                C7207a.this.m28866d(this.f$1, dialogInterface);
            }
        });
        return a;
    }
}
