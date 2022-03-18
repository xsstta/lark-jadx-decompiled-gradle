package com.larksuite.component.webview.container.impl;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.suite.R;

public class TitleBarTextRedDotView extends FrameLayout {

    /* renamed from: a */
    private ImageView f63922a;

    /* renamed from: b */
    private TextView f63923b;

    /* renamed from: a */
    private void m93488a() {
        if (this.f63922a == null) {
            this.f63922a = (ImageView) findViewById(R.id.iv_red_dot);
        }
        if (this.f63923b == null) {
            this.f63923b = (TextView) findViewById(R.id.iv_text);
        }
    }

    public TitleBarTextRedDotView(Context context) {
        super(context);
        m93488a();
    }

    /* renamed from: a */
    public void mo91930a(boolean z) {
        int i;
        m93488a();
        ImageView imageView = this.f63922a;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        imageView.setVisibility(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        m93488a();
        this.f63923b.setTextColor(colorStateList);
    }

    public TitleBarTextRedDotView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m93488a();
    }

    public TitleBarTextRedDotView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m93488a();
    }
}
