package com.ss.android.lark.security.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.suite.R;

public class CodeView extends RelativeLayout {

    /* renamed from: a */
    private TextView f133919a;

    /* renamed from: b */
    private View f133920b;

    /* renamed from: b */
    public void mo185151b() {
        this.f133919a.setVisibility(0);
        this.f133920b.setVisibility(8);
    }

    /* renamed from: c */
    public void mo185152c() {
        this.f133919a.setVisibility(8);
        this.f133920b.setVisibility(0);
    }

    /* renamed from: a */
    public void mo185150a() {
        this.f133919a.setText("");
        this.f133920b.setBackgroundResource(R.drawable.lark_security_verify_code_view_normal);
        mo185152c();
    }

    /* renamed from: d */
    private void m209913d() {
        LayoutInflater.from(getContext()).inflate(R.layout.lark_security_verify_code_view, this);
        this.f133919a = (TextView) findViewById(R.id.tv_plain_text_pwd);
        this.f133920b = findViewById(R.id.view_cipher_text_pwd);
    }

    public CodeView(Context context) {
        super(context);
        m209913d();
    }

    public void setText(int i) {
        setText(getResources().getString(i));
    }

    public void setText(CharSequence charSequence) {
        this.f133919a.setText(charSequence);
        this.f133920b.setBackgroundResource(R.drawable.lark_security_verify_code_view_checked);
    }

    public CodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m209913d();
    }

    public CodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m209913d();
    }
}
