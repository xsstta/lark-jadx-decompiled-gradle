package com.lynx.tasm.behavior;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.lynx.tasm.base.LLog;

/* renamed from: com.lynx.tasm.behavior.k */
public class DialogC26683k extends Dialog {

    /* renamed from: a */
    private static final String f66012a = "k";

    /* renamed from: a */
    public View mo94646a() {
        return getWindow().getDecorView();
    }

    /* renamed from: b */
    public void mo94648b() {
        if (!isShowing()) {
            try {
                show();
            } catch (WindowManager.BadTokenException e) {
                LLog.m96427d(f66012a, e.toString());
            }
        }
    }

    /* renamed from: c */
    public void mo94650c() {
        if (isShowing()) {
            try {
                dismiss();
            } catch (WindowManager.BadTokenException e) {
                LLog.m96427d(f66012a, e.toString());
            }
        }
    }

    public DialogC26683k(Context context) {
        super(context);
    }

    /* renamed from: b */
    public void mo94649b(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    /* renamed from: a */
    public void mo94647a(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().setLayout(2, -1);
        getWindow().setSoftInputMode(16);
        getWindow().addFlags(32);
        getWindow().addFlags(8);
        getWindow().addFlags(131072);
        getWindow().clearFlags(2);
    }
}
