package com.ss.android.lark.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.ybq.android.spinkit.SpinKitView;
import com.github.ybq.android.spinkit.p968b.AbstractC21312f;
import com.github.ybq.android.spinkit.p969c.C21325b;
import com.larksuite.suite.R;

public class CommonLoadingView extends LinearLayout {

    /* renamed from: a */
    private Context f141849a;

    /* renamed from: b */
    private TextView f141850b;

    /* renamed from: c */
    private C21325b f141851c;

    /* renamed from: d */
    private View f141852d;

    /* renamed from: e */
    private SpinKitView f141853e;

    /* renamed from: a */
    public void mo195419a() {
        if (getParent() == null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            ((FrameLayout) ((Activity) this.f141849a).getWindow().getDecorView()).addView(this, layoutParams);
            this.f141853e.setVisibility(0);
            this.f141851c.start();
        }
    }

    /* renamed from: b */
    public void mo195422b() {
        if (getParent() != null) {
            this.f141853e.setVisibility(8);
            this.f141851c.stop();
            ((FrameLayout) ((Activity) this.f141849a).getWindow().getDecorView()).removeView(this);
        }
    }

    public CommonLoadingView(Context context) {
        super(context);
        mo195420a(context);
    }

    public void setContainerBackGround(Drawable drawable) {
        this.f141852d.setBackground(drawable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo195420a(Context context) {
        this.f141849a = context;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.common_dialog_loading_layout, (ViewGroup) this, true);
        this.f141853e = (SpinKitView) linearLayout.findViewById(R.id.spin_kit);
        this.f141850b = (TextView) linearLayout.findViewById(R.id.content);
        this.f141852d = linearLayout.findViewById(R.id.container);
        this.f141853e.setVisibility(8);
        C21325b bVar = new C21325b();
        this.f141851c = bVar;
        this.f141853e.setIndeterminateDrawable((AbstractC21312f) bVar);
        this.f141851c.stop();
    }

    public CommonLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo195420a(context);
    }

    /* renamed from: a */
    public void mo195421a(boolean z, String str) {
        int i;
        this.f141850b.setText(str);
        SpinKitView spinKitView = this.f141853e;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        spinKitView.setVisibility(i);
        mo195419a();
    }

    public CommonLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo195420a(context);
    }
}
