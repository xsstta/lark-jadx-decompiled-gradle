package com.ss.android.lark.mail.impl.message.view;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* renamed from: com.ss.android.lark.mail.impl.message.view.a */
public class C43174a extends PopupWindow {

    /* renamed from: a */
    private Context f109907a;

    public void dismiss() {
        super.dismiss();
        WindowManager.LayoutParams attributes = ((Activity) this.f109907a).getWindow().getAttributes();
        attributes.alpha = 1.0f;
        ((Activity) this.f109907a).getWindow().setAttributes(attributes);
    }

    public void showAsDropDown(View view) {
        showAsDropDown(view, 0, 0);
    }

    public void showAsDropDown(View view, int i, int i2) {
        super.showAsDropDown(view, i, i2);
        WindowManager.LayoutParams attributes = ((Activity) this.f109907a).getWindow().getAttributes();
        attributes.alpha = 1.0f;
        ((Activity) this.f109907a).getWindow().setAttributes(attributes);
    }

    public C43174a(Context context, View view, int i, int i2, boolean z) {
        super(view, i, i2, z);
        this.f109907a = context;
    }
}
