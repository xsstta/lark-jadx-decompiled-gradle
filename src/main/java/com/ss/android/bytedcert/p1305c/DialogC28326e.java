package com.ss.android.bytedcert.p1305c;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.bytedcert.c.e */
public class DialogC28326e extends DialogC28327f {

    /* renamed from: b */
    private TextView f71172b;

    /* renamed from: c */
    private TextView f71173c;

    /* renamed from: d */
    private TextView f71174d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo100926a() {
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
            window.setGravity(80);
            window.setWindowAnimations(R.style.byted_btn_fade);
        }
    }

    /* renamed from: c */
    private void m103930c() {
        setContentView(R.layout.byted_button_dialog);
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        this.f71172b = (TextView) findViewById(R.id.btn_take_photo);
        this.f71173c = (TextView) findViewById(R.id.btn_pick_picture);
        this.f71174d = (TextView) findViewById(R.id.btn_cancel);
    }

    /* renamed from: a */
    public void mo100927a(View.OnClickListener onClickListener) {
        this.f71172b.setOnClickListener(onClickListener);
    }

    /* renamed from: b */
    public void mo100928b(View.OnClickListener onClickListener) {
        this.f71173c.setOnClickListener(onClickListener);
    }

    /* renamed from: c */
    public void mo100929c(View.OnClickListener onClickListener) {
        this.f71174d.setOnClickListener(onClickListener);
    }

    public DialogC28326e(Activity activity) {
        super(activity, R.style.byted_common_dialog_style);
        m103930c();
        mo100926a();
    }
}
