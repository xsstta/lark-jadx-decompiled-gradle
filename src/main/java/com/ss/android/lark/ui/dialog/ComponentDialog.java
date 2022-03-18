package com.ss.android.lark.ui.dialog;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.larksuite.framework.ui.BaseDialog;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ComponentDialog extends BaseDialog {

    /* renamed from: a */
    private FrameLayout f141958a = ((FrameLayout) findViewById(R.id.extra_region));

    /* renamed from: b */
    private FrameLayout f141959b = ((FrameLayout) findViewById(R.id.title_region));

    /* renamed from: c */
    private FrameLayout f141960c = ((FrameLayout) findViewById(R.id.content_region));

    /* renamed from: d */
    private FrameLayout f141961d = ((FrameLayout) findViewById(R.id.button_region));

    /* renamed from: e */
    private Context f141962e;

    @Retention(RetentionPolicy.SOURCE)
    public @interface GRAVITY {
    }

    /* renamed from: a */
    public FrameLayout mo195575a() {
        return this.f141960c;
    }

    /* renamed from: b */
    public FrameLayout mo195577b() {
        return this.f141961d;
    }

    @Override // com.larksuite.framework.ui.BaseDialog
    public void show() {
        setCanceledOnTouchOutside(true);
        super.show();
    }

    /* renamed from: c */
    private void m223638c() {
        m223639d();
        this.f141958a.setVisibility(8);
        this.f141959b.setVisibility(8);
        this.f141961d.setVisibility(8);
        this.f141960c.setVisibility(8);
    }

    /* renamed from: d */
    private void m223639d() {
        getWindow().getAttributes().width = C57582a.m223601a(this.f141962e, 300.0f);
    }

    /* renamed from: a */
    public void mo195576a(View view) {
        m223637a(view, this.f141960c);
    }

    /* renamed from: b */
    public void mo195578b(View view) {
        m223637a(view, this.f141961d);
    }

    public ComponentDialog(Context context) {
        super(context, R.style.CommonDialog);
        this.f141962e = context;
        setContentView(R.layout.common_dialog_layout_new);
        m223638c();
    }

    /* renamed from: a */
    private void m223637a(View view, FrameLayout frameLayout) {
        frameLayout.setVisibility(0);
        frameLayout.removeAllViews();
        frameLayout.addView(view);
    }
}
