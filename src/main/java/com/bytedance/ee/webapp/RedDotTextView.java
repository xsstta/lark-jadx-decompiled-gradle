package com.bytedance.ee.webapp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.suite.R;

public class RedDotTextView extends FrameLayout {

    /* renamed from: a */
    private ImageView f35951a;

    /* renamed from: b */
    private TextView f35952b;

    /* renamed from: a */
    private void m55768a() {
        LayoutInflater.from(getContext()).inflate(R.layout.lark_webapp_red_dot_textview_layout, (ViewGroup) this, true);
        if (this.f35951a == null) {
            this.f35951a = (ImageView) findViewById(R.id.iv_red_dot);
            this.f35952b = (TextView) findViewById(R.id.iv_text);
        }
    }

    public RedDotTextView(Context context) {
        super(context);
        m55768a();
    }

    public RedDotTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m55768a();
    }

    public RedDotTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m55768a();
    }
}
