package com.bytedance.ee.bear.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.larksuite.suite.R;

public class OpenLoadingView extends LinearLayout {

    /* renamed from: a */
    private Button f31782a;

    /* renamed from: b */
    private ProgressBar f31783b;

    /* renamed from: c */
    private TextView f31784c;

    /* renamed from: d */
    private int f31785d;

    /* renamed from: a */
    private void m48969a() {
        LayoutInflater.from(getContext()).inflate(R.layout.space_facade_external_loading_view, this);
        this.f31782a = (Button) findViewById(R.id.cancel);
        this.f31783b = (ProgressBar) findViewById(R.id.progress_bar);
        this.f31784c = (TextView) findViewById(R.id.tv_progress);
    }

    public OpenLoadingView(Context context) {
        super(context);
        m48969a();
    }

    public void setCancelClickListener(View.OnClickListener onClickListener) {
        this.f31782a.setOnClickListener(onClickListener);
    }

    public void setProgress(int i) {
        if (i < 0) {
            this.f31785d = 0;
        } else if (i > 100) {
            this.f31785d = 100;
        } else {
            this.f31785d = i;
        }
        this.f31783b.setProgress(this.f31785d);
        this.f31784c.setText(String.format("%d%%", Integer.valueOf(this.f31785d)));
    }

    public OpenLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m48969a();
    }

    public OpenLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m48969a();
    }
}
