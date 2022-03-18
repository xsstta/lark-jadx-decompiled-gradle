package com.ss.android.lark.reaction.widget.detailwindow.userstatus;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;

public class ReactionUserStatusLinearLayout extends LinearLayout {

    /* renamed from: a */
    private ImageView f131067a;

    /* renamed from: b */
    private TextView f131068b;

    /* renamed from: c */
    private String f131069c;

    /* renamed from: d */
    private Context f131070d;

    public int getMaxLines() {
        return this.f131068b.getMaxLines();
    }

    /* renamed from: a */
    private void m205379a() {
        this.f131070d = getContext();
        inflate(getContext(), R.layout.reaction_view_user_status, this);
        this.f131067a = (ImageView) findViewById(R.id.iv_icon);
        this.f131068b = (TextView) findViewById(R.id.tv_desc);
        this.f131069c = "";
        setTextSize(12);
    }

    public ReactionUserStatusLinearLayout(Context context) {
        super(context);
        m205379a();
    }

    public void setIconVisibility(int i) {
        this.f131067a.setVisibility(i);
    }

    public void setMaxLines(int i) {
        this.f131068b.setMaxLines(i);
    }

    public void setTextColor(int i) {
        this.f131068b.setTextColor(i);
    }

    public void setTextMaxWidth(int i) {
        this.f131068b.setMaxWidth(i);
    }

    public void setWidth(int i) {
        this.f131068b.setWidth(i);
    }

    public void setTextSize(int i) {
        this.f131068b.setTextSize((float) i);
        this.f131068b.setMinHeight(C52990a.m205224a(getContext(), (float) (i + 2)));
    }

    public ReactionUserStatusLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m205379a();
    }

    /* renamed from: a */
    public void mo181157a(String str, Drawable drawable) {
        this.f131067a.setImageDrawable(drawable);
        this.f131068b.setText(str);
        this.f131069c = str;
    }

    public ReactionUserStatusLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m205379a();
    }
}
