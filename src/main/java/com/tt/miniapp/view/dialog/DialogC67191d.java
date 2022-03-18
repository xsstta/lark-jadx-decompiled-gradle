package com.tt.miniapp.view.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.larksuite.suite.R;

/* renamed from: com.tt.miniapp.view.dialog.d */
public class DialogC67191d extends Dialog {

    /* renamed from: a */
    private ImageView f169487a;

    /* renamed from: b */
    private ProgressBar f169488b;

    /* renamed from: c */
    private TextView f169489c;

    /* renamed from: d */
    private String f169490d;

    public void show() {
        super.show();
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 17;
            attributes.width = -2;
            attributes.height = -2;
            window.setAttributes(attributes);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().getDecorView().setPadding(0, 0, 0, 0);
        getWindow().getDecorView().setBackground(null);
        setContentView(R.layout.microapp_m_layout_loading);
        this.f169487a = (ImageView) findViewById(R.id.microapp_m_icon);
        this.f169488b = (ProgressBar) findViewById(R.id.microapp_m_loading_progress);
        this.f169489c = (TextView) findViewById(R.id.microapp_m_text);
        this.f169488b.setVisibility(0);
        this.f169489c.setText(this.f169490d);
    }

    public DialogC67191d(Context context, String str) {
        super(context);
        this.f169490d = str;
    }
}
