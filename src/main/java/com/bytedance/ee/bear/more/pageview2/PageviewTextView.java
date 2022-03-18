package com.bytedance.ee.bear.more.pageview2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

public class PageviewTextView extends FrameLayout {

    /* renamed from: a */
    private final String f27634a = "PageviewItemView";

    /* renamed from: b */
    private View f27635b;

    /* renamed from: c */
    private TextView f27636c;

    /* renamed from: d */
    private ImageView f27637d;

    /* renamed from: e */
    private View f27638e;

    /* renamed from: a */
    public void mo39179a() {
        this.f27638e.setVisibility(4);
    }

    /* renamed from: b */
    private void m42725b() {
        C13479a.m54772d("PageviewItemView", "initViews: ");
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.more_item_text_v2, (ViewGroup) this, true);
        this.f27635b = inflate;
        this.f27636c = (TextView) inflate.findViewById(R.id.title);
        this.f27637d = (ImageView) this.f27635b.findViewById(R.id.icon);
        this.f27638e = this.f27635b.findViewById(R.id.divider);
    }

    public void setImageResource(int i) {
        this.f27637d.setImageResource(i);
    }

    public void setTitle(String str) {
        this.f27636c.setText(str);
    }

    public PageviewTextView(Context context) {
        super(context);
        m42725b();
    }

    public PageviewTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m42725b();
    }

    public PageviewTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m42725b();
    }
}
