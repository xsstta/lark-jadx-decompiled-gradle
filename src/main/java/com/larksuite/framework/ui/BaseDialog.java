package com.larksuite.framework.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;

public class BaseDialog extends Dialog {
    private final String TAG = "BaseDialog";
    AbstractC26172a mDismissListenner;

    /* renamed from: com.larksuite.framework.ui.BaseDialog$a */
    public interface AbstractC26172a {
        /* renamed from: a */
        void mo93123a();
    }

    public void show() {
        if (checkContext(getContext())) {
            super.show();
        }
    }

    public void dismiss() {
        if (checkContext(getContext())) {
            super.dismiss();
        }
        AbstractC26172a aVar = this.mDismissListenner;
        if (aVar != null) {
            aVar.mo93123a();
        }
    }

    public void setDismissListenner(AbstractC26172a aVar) {
        this.mDismissListenner = aVar;
    }

    public BaseDialog(Context context) {
        super(context);
    }

    private boolean checkContext(Context context) {
        if (context == null) {
            return false;
        }
        if (context instanceof ContextThemeWrapper) {
            context = ((ContextThemeWrapper) context).getBaseContext();
        }
        if ((context instanceof Activity) && C26182b.m94713a((Activity) context)) {
            return true;
        }
        return false;
    }

    public BaseDialog(Context context, int i) {
        super(context, i);
    }

    public BaseDialog(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
    }
}
