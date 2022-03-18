package com.ss.android.lark.invitation.v2.feat.member.welcome;

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
    public TextView f102847a;

    /* renamed from: b */
    private View f102848b;

    /* renamed from: a */
    private void m160235a() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.inv_pick_tab, this);
        this.f102847a = (TextView) inflate.findViewById(R.id.tv_tab_title);
        this.f102848b = inflate.findViewById(R.id.view_tab);
    }

    public TabView(Context context) {
        super(context);
        m160235a();
    }

    public void setChosen(boolean z) {
        if (z) {
            this.f102847a.setTextColor(getResources().getColor(R.color.primary_pri_500));
            this.f102848b.setBackgroundColor(getResources().getColor(R.color.primary_pri_500));
            this.f102847a.setTypeface(Typeface.defaultFromStyle(1));
            this.f102848b.setVisibility(0);
            return;
        }
        this.f102847a.setTextColor(getResources().getColor(R.color.text_caption));
        this.f102847a.setTypeface(Typeface.defaultFromStyle(0));
        this.f102848b.setVisibility(8);
    }

    public TabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m160235a();
    }

    public TabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m160235a();
    }
}
