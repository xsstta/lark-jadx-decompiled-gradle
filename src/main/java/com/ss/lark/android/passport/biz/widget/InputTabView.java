package com.ss.lark.android.passport.biz.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.log.PassportLog;

public class InputTabView extends LinearLayout {

    /* renamed from: a */
    private boolean f164356a;

    /* renamed from: b */
    private TextView f164357b;

    /* renamed from: c */
    private View f164358c;

    /* renamed from: d */
    private String f164359d;

    public InputTabView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo224558a(Context context) {
        LayoutInflater.from(getContext()).inflate(R.layout.signin_sdk_input_tab, (ViewGroup) this, true);
        this.f164357b = (TextView) findViewById(R.id.tv_tab_title);
        this.f164358c = findViewById(R.id.view_tab);
        this.f164357b.setText(this.f164359d);
    }

    public void setChooseed(boolean z) {
        this.f164356a = z;
        if (z) {
            this.f164357b.setTextColor(getResources().getColor(R.color.primary_pri_500));
            this.f164358c.setBackgroundResource(R.drawable.signin_sdk_tab_indicator_selected);
            this.f164357b.setTypeface(Typeface.defaultFromStyle(1));
            this.f164358c.setVisibility(0);
            return;
        }
        this.f164357b.setTextColor(getResources().getColor(R.color.text_caption));
        this.f164357b.setTypeface(Typeface.defaultFromStyle(0));
        this.f164358c.setVisibility(8);
    }

    public InputTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public InputTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, i);
        this.f164359d = "";
        try {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.tab_txt});
            this.f164359d = obtainStyledAttributes.getString(0);
            obtainStyledAttributes.recycle();
        } catch (NullPointerException e) {
            PassportLog.f123351c.mo171474a().mo171462a("InputTabView", "iInputTabView_tab_txt npe", e);
        }
        mo224558a(context);
    }
}
