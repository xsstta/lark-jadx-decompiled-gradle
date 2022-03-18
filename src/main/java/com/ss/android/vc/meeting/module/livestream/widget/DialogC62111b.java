package com.ss.android.vc.meeting.module.livestream.widget;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.vc.meeting.module.livestream.widget.b */
public class DialogC62111b extends Dialog {

    /* renamed from: a */
    private boolean f156031a;

    public void show() {
        Activity activity;
        super.show();
        Context context = getContext();
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            if (context instanceof ContextWrapper) {
                Context baseContext = ((ContextWrapper) context).getBaseContext();
                if (baseContext instanceof Activity) {
                    activity = (Activity) baseContext;
                }
            }
            activity = null;
        }
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
        }
    }

    public DialogC62111b(Context context, boolean z) {
        super(context, R.style.LiveAuthDialogStyle);
        this.f156031a = z;
        setContentView(R.layout.live_auth_dialog_loading);
        setCanceledOnTouchOutside(false);
        getWindow().setGravity(17);
    }
}
