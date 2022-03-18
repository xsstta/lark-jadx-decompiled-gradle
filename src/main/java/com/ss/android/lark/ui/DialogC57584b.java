package com.ss.android.lark.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.ContextThemeWrapper;
import com.ss.android.lark.ui.p2892a.C57582a;

/* renamed from: com.ss.android.lark.ui.b */
public class DialogC57584b extends Dialog {

    /* renamed from: a */
    private final String f141928a = "BaseDialog";

    /* renamed from: c */
    AbstractC57585a f141929c;

    /* renamed from: com.ss.android.lark.ui.b$a */
    public interface AbstractC57585a {
        /* renamed from: a */
        void mo195557a();
    }

    public void show() {
        if (m223618a(getContext())) {
            super.show();
        }
    }

    public void dismiss() {
        if (m223618a(getContext())) {
            super.dismiss();
        }
        AbstractC57585a aVar = this.f141929c;
        if (aVar != null) {
            aVar.mo195557a();
        }
    }

    public DialogC57584b(Context context) {
        super(context);
    }

    /* renamed from: a */
    private boolean m223618a(Context context) {
        if (context == null) {
            return false;
        }
        if (context instanceof ContextThemeWrapper) {
            context = ((ContextThemeWrapper) context).getBaseContext();
        }
        if ((context instanceof Activity) && C57582a.m223607a((Activity) context)) {
            return true;
        }
        return false;
    }

    public DialogC57584b(Context context, int i) {
        super(context, i);
    }
}
