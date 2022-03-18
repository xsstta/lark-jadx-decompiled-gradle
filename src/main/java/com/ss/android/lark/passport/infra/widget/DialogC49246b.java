package com.ss.android.lark.passport.infra.widget;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.util.C49145aa;

/* renamed from: com.ss.android.lark.passport.infra.widget.b */
public class DialogC49246b extends Dialog {

    /* renamed from: a */
    private boolean f123616a;

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
        if ((activity == null || (!activity.isFinishing() && !activity.isDestroyed())) && this.f123616a) {
            C49145aa.m193799b(getContext(), getWindow(), R.color.transparent);
        }
    }

    public DialogC49246b(Context context, boolean z) {
        super(context, R.style.DialogStyle);
        this.f123616a = z;
        setContentView(R.layout.signin_sdk_dialog_loading);
        setCanceledOnTouchOutside(false);
        getWindow().setGravity(17);
    }
}
