package com.ss.android.lark.voip.service.impl.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.suite.R;
import com.ss.android.lark.voip.service.impl.C58151d;

/* renamed from: com.ss.android.lark.voip.service.impl.app.l */
public class C58094l {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m225338a(DialogInterface.OnClickListener onClickListener, DialogInterface dialogInterface, int i) {
        C58151d.m225578a("ui", "ui", "dismiss invalid version dialog", "[VoIpCallDialogUtils] generateVoipInvalidVersionDialog: dismiss");
        dialogInterface.dismiss();
        onClickListener.onClick(dialogInterface, i);
    }

    /* renamed from: a */
    public static Dialog m225337a(Activity activity, boolean z, DialogInterface.OnClickListener onClickListener) {
        int i;
        C25639g j = new C25639g(activity).mo89248g(R.string.View_E_EncryptedCallUnavailable).mo89238b(true).mo89251j(2);
        if (z) {
            i = R.string.View_G_UpdateToUse;
        } else {
            i = R.string.View_G_RecipientNeedsUpdate;
        }
        return j.mo89254m(i).mo89224a(R.id.lkui_dialog_btn_right, R.string.View_G_ConfirmButton, new DialogInterface.OnClickListener(onClickListener) {
            /* class com.ss.android.lark.voip.service.impl.app.$$Lambda$l$6BXQC33DVFvktPN7nHPdad5Fi8 */
            public final /* synthetic */ DialogInterface.OnClickListener f$0;

            {
                this.f$0 = r1;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C58094l.m225338a(this.f$0, dialogInterface, i);
            }
        }).mo89239c();
    }
}
