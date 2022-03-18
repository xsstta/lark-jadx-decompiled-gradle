package com.ss.android.bytedcert.p1305c;

import android.app.Activity;
import androidx.appcompat.app.DialogC0259b;

/* renamed from: com.ss.android.bytedcert.c.f */
public class DialogC28327f extends DialogC0259b {

    /* renamed from: a */
    protected Activity f71175a;

    /* renamed from: b */
    public boolean mo100930b() {
        return !this.f71175a.isFinishing();
    }

    public void show() {
        if (mo100930b()) {
            super.show();
        }
    }

    public DialogC28327f(Activity activity, int i) {
        super(activity, i);
        this.f71175a = activity;
    }
}
