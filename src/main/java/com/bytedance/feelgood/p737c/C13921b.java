package com.bytedance.feelgood.p737c;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;

/* renamed from: com.bytedance.feelgood.c.b */
public class C13921b {
    /* renamed from: a */
    public static Dialog m56358a(Dialog dialog) {
        if (dialog != null && !dialog.isShowing()) {
            Context baseContext = ((ContextWrapper) dialog.getContext()).getBaseContext();
            if (baseContext instanceof Activity) {
                Activity activity = (Activity) baseContext;
                if (!activity.isFinishing()) {
                    if (Build.VERSION.SDK_INT >= 17) {
                        if (!activity.isDestroyed()) {
                            dialog.show();
                        }
                        return dialog;
                    }
                    dialog.show();
                }
            }
        }
        return dialog;
    }

    /* renamed from: b */
    public static Dialog m56359b(Dialog dialog) {
        if (dialog != null && dialog.isShowing()) {
            Context baseContext = ((ContextWrapper) dialog.getContext()).getBaseContext();
            if (baseContext instanceof Activity) {
                Activity activity = (Activity) baseContext;
                if (!activity.isFinishing()) {
                    if (Build.VERSION.SDK_INT >= 17) {
                        if (!activity.isDestroyed()) {
                            dialog.dismiss();
                        }
                        return dialog;
                    }
                    dialog.dismiss();
                }
            } else {
                dialog.dismiss();
            }
        }
        return dialog;
    }
}
