package com.ss.android.lark.locationmessage.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.larksuite.suite.R;

public class LoadingView extends LinearLayout {

    /* renamed from: a */
    private ProgressBar f105863a;

    /* renamed from: b */
    private TextView f105864b;

    /* renamed from: a */
    private void m165370a() {
        LayoutInflater.from(getContext()).inflate(R.layout.location_loading_view, this);
        this.f105863a = (ProgressBar) findViewById(R.id.location_pb_loading);
        this.f105864b = (TextView) findViewById(R.id.location_tv_desc);
    }

    public LoadingView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo149869a(int i) {
        mo149870a(getResources().getString(i));
    }

    /* renamed from: b */
    public void mo149871b(int i) {
        mo149872b(getResources().getString(i));
    }

    /* renamed from: a */
    public void mo149870a(String str) {
        setVisibility(0);
        this.f105863a.setVisibility(0);
        this.f105864b.setText(str);
    }

    /* renamed from: b */
    public void mo149872b(String str) {
        this.f105863a.setVisibility(8);
        this.f105864b.setText(str);
    }

    public LoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoadingView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public LoadingView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m165370a();
    }
}
