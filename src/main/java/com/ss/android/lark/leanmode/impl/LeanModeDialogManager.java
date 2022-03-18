package com.ss.android.lark.leanmode.impl;

import android.app.Dialog;
import android.content.DialogInterface;
import com.ss.android.lark.log.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class LeanModeDialogManager {

    /* renamed from: a */
    private C41270a f105038a;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Priority {
    }

    /* renamed from: a */
    public void mo148679a(DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        this.f105038a = null;
    }

    /* renamed from: a */
    public void mo148678a(Dialog dialog, int i) {
        C41270a aVar = this.f105038a;
        if (aVar == null) {
            dialog.show();
            this.f105038a = new C41270a(dialog, i);
        } else if (i < aVar.f105040b) {
            Log.m165389i("LeanModeDialogManager", "dialog priority is lower not show");
        } else {
            Dialog dialog2 = this.f105038a.f105039a;
            if (dialog2 != null && dialog2.isShowing()) {
                dialog2.dismiss();
            }
            dialog.show();
            this.f105038a = new C41270a(dialog, i);
        }
    }

    /* renamed from: com.ss.android.lark.leanmode.impl.LeanModeDialogManager$a */
    public class C41270a {

        /* renamed from: a */
        Dialog f105039a;

        /* renamed from: b */
        int f105040b;

        public C41270a(Dialog dialog, int i) {
            this.f105039a = dialog;
            this.f105040b = i;
        }
    }
}
