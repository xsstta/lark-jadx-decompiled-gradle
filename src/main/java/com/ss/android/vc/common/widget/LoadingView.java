package com.ss.android.vc.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.suite.R;

public class LoadingView extends LinearLayout {

    /* renamed from: a */
    private ImageView f152069a;

    /* renamed from: b */
    private TextView f152070b;

    /* renamed from: a */
    private void m236342a() {
        setOrientation(1);
        setGravity(1);
        LayoutInflater.from(getContext()).inflate(R.layout.loading_view, (ViewGroup) this, true);
        this.f152069a = (ImageView) findViewById(R.id.loading_image);
        this.f152070b = (TextView) findViewById(R.id.loading_text);
    }

    public LoadingView(Context context) {
        this(context, null);
    }

    public void setLoadingText(String str) {
        this.f152070b.setText(str);
    }

    public LoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m236342a();
    }
}
