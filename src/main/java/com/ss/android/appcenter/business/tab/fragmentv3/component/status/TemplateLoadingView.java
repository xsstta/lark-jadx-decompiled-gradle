package com.ss.android.appcenter.business.tab.fragmentv3.component.status;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import com.ss.android.appcenter.common.util.C28209p;

public class TemplateLoadingView extends FrameLayout {

    /* renamed from: a */
    private ImageView f70297a;

    /* renamed from: b */
    private View f70298b;

    /* renamed from: c */
    private boolean f70299c;

    /* renamed from: d */
    private CircularProgressDrawable f70300d;

    /* renamed from: b */
    public void mo99958b() {
        CircularProgressDrawable circularProgressDrawable = this.f70300d;
        if (circularProgressDrawable != null) {
            circularProgressDrawable.stop();
        }
    }

    /* renamed from: a */
    public void mo99957a() {
        m102648c();
        this.f70300d.start();
    }

    /* renamed from: c */
    private void m102648c() {
        if (!this.f70299c) {
            this.f70299c = true;
            CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(getContext());
            this.f70300d = circularProgressDrawable;
            circularProgressDrawable.mo7701a(UDColorUtils.getColor(getContext(), R.color.primary_pri_500));
            this.f70300d.mo7694a((float) C28209p.m103291a(4.0f));
            this.f70300d.mo7699a(Paint.Cap.ROUND);
            this.f70297a.setBackground(this.f70300d);
        }
    }

    public TemplateLoadingView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m102647a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.workplace_template_loading_view, (ViewGroup) this, true);
        this.f70297a = (ImageView) inflate.findViewById(R.id.image);
        this.f70298b = inflate.findViewById(R.id.loading_wrapper);
    }

    public TemplateLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TemplateLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m102647a(context);
    }
}
