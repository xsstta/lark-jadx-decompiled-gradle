package com.ss.android.appcenter.business.tab.fragmentv3.component.status;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.appcenter.common.util.C28209p;

public class TemplateErrorView extends FrameLayout {

    /* renamed from: a */
    public static final int f70294a = C28209p.m103291a(100.0f);

    /* renamed from: b */
    private View f70295b;

    /* renamed from: c */
    private TextView f70296c;

    public TemplateErrorView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m102644a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.workplace_template_error_view, (ViewGroup) this, true);
        this.f70295b = findViewById(R.id.error_image);
        this.f70296c = (TextView) findViewById(R.id.error_text);
    }

    /* renamed from: a */
    public void mo99955a(int i) {
        if (i < f70294a) {
            this.f70295b.setVisibility(8);
        } else {
            this.f70295b.setVisibility(0);
        }
    }

    /* renamed from: a */
    public void mo99956a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = getContext().getString(R.string.OpenPlatform_AppCenter_FailRefreshMsg);
        } else {
            str2 = C28209p.m103298a(getContext(), (int) R.string.OpenPlatform_AppCenter_BlockFailRefreshMsg, "name", str);
        }
        this.f70296c.setText(str2);
    }

    public TemplateErrorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TemplateErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m102644a(context);
    }
}
