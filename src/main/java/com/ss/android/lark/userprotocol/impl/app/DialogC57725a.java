package com.ss.android.lark.userprotocol.impl.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.view.ContextThemeWrapper;

/* renamed from: com.ss.android.lark.userprotocol.impl.app.a */
public class DialogC57725a extends Dialog {

    /* renamed from: a */
    AbstractC57726a f142220a;

    /* renamed from: com.ss.android.lark.userprotocol.impl.app.a$a */
    public interface AbstractC57726a {
        /* renamed from: a */
        void mo195898a();
    }

    public void show() {
        if (m224084a(getContext())) {
            super.show();
        }
    }

    public void dismiss() {
        if (m224084a(getContext())) {
            super.dismiss();
        }
        AbstractC57726a aVar = this.f142220a;
        if (aVar != null) {
            aVar.mo195898a();
        }
    }

    /* renamed from: a */
    public void mo195896a(AbstractC57726a aVar) {
        this.f142220a = aVar;
    }

    /* renamed from: a */
    public static boolean m224083a(Activity activity) {
        if (activity == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 17) {
            return !activity.isFinishing();
        }
        if (activity.isDestroyed() || activity.isFinishing()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m224084a(Context context) {
        if (context == null) {
            return false;
        }
        if (context instanceof ContextThemeWrapper) {
            context = ((ContextThemeWrapper) context).getBaseContext();
        }
        if ((context instanceof Activity) && m224083a((Activity) context)) {
            return true;
        }
        return false;
    }

    public DialogC57725a(Context context, int i) {
        super(context, i);
    }
}
