package com.ss.android.bytedcert.p1305c;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.bytedcert.c.c */
public class DialogC28323c extends DialogC28327f {

    /* renamed from: b */
    private TextView f71167b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo100923a() {
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-2, -2);
            window.setGravity(17);
            window.setWindowAnimations(R.style.byted_btn_fade);
        }
    }

    /* renamed from: c */
    private void m103924c() {
        setContentView(R.layout.byted_jsb_img_dialog);
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        TextView textView = (TextView) findViewById(R.id.i_know);
        this.f71167b = textView;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.bytedcert.p1305c.DialogC28323c.View$OnClickListenerC283241 */

                public void onClick(View view) {
                    DialogC28323c.this.dismiss();
                }
            });
        }
    }

    public DialogC28323c(Activity activity) {
        super(activity, R.style.byted_common_dialog_style);
        m103924c();
        mo100923a();
    }
}
