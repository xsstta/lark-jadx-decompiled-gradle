package com.ss.android.ad.splash.core.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.ad.splash.utils.C27484l;

public class BDASplashInteractButton extends LinearLayout {

    /* renamed from: a */
    private TextView f68348a;

    /* renamed from: b */
    private ImageView f68349b;

    public BDASplashInteractButton(Context context) {
        super(context);
        m99809a(context);
    }

    public void setText(String str) {
        this.f68348a.setText(str);
    }

    /* renamed from: a */
    private void m99809a(Context context) {
        TextView textView = new TextView(context);
        this.f68348a = textView;
        textView.setTextSize(1, 15.0f);
        this.f68348a.setTextColor(-1);
        ImageView imageView = new ImageView(context);
        this.f68349b = imageView;
        imageView.setImageResource(R.drawable.splash_ad_interact_arrow);
        this.f68349b.setPadding((int) C27484l.m100391a(context, 8.0f), 0, 0, 0);
        addView(this.f68348a);
        addView(this.f68349b);
        setBackgroundResource(R.drawable.splash_ad_interact_text_bg);
        setGravity(17);
    }

    public BDASplashInteractButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m99809a(context);
    }

    public BDASplashInteractButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m99809a(context);
    }
}
