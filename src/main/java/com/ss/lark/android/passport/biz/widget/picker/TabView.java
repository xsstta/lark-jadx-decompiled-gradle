package com.ss.lark.android.passport.biz.widget.picker;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.suite.R;

public class TabView extends LinearLayout {

    /* renamed from: a */
    public TextView f164484a;

    /* renamed from: b */
    private boolean f164485b;

    /* renamed from: c */
    private View f164486c;

    /* renamed from: a */
    private void m256277a() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.sign_sdk_pick_tab, this);
        this.f164484a = (TextView) inflate.findViewById(R.id.tv_tab_title);
        this.f164486c = inflate.findViewById(R.id.view_tab);
    }

    public TabView(Context context) {
        super(context);
        m256277a();
    }

    public void setChooseed(boolean z) {
        this.f164485b = z;
        if (z) {
            this.f164484a.setTextColor(getResources().getColor(R.color.primary_pri_500));
            this.f164486c.setBackgroundColor(getResources().getColor(R.color.primary_pri_500));
            this.f164484a.setTypeface(Typeface.defaultFromStyle(1));
            this.f164486c.setVisibility(0);
            return;
        }
        this.f164484a.setTextColor(getResources().getColor(R.color.text_caption));
        this.f164484a.setTypeface(Typeface.defaultFromStyle(0));
        this.f164486c.setVisibility(8);
    }

    public TabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m256277a();
    }

    public TabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m256277a();
    }
}
